package p105t;

import java.util.ArrayList;
import p097q.AbstractC1241e;
import p102s.AbstractC1411i;
import p102s.C1405c;
import p102s.C1406d;

/* renamed from: t.k */
/* loaded from: classes.dex */
public final class C1450k extends AbstractC1454o {

    /* renamed from: k */
    public static final int[] f6830k = new int[2];

    /* renamed from: m */
    public static void m3456m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // p105t.InterfaceC1443d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3427a(InterfaceC1443d interfaceC1443d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC1241e.m2943b(this.f6850j) == 3) {
            C1406d c1406d = this.f6842b;
            m3469l(c1406d.f6636I, c1406d.f6638K, 0);
            return;
        }
        C1446g c1446g = this.f6845e;
        boolean z2 = c1446g.f6825j;
        C1445f c1445f = this.f6848h;
        C1445f c1445f2 = this.f6849i;
        if (!z2 && this.f6844d == 3) {
            C1406d c1406d2 = this.f6842b;
            int i2 = c1406d2.f6687r;
            if (i2 == 2) {
                C1406d c1406d3 = c1406d2.f6647T;
                if (c1406d3 != null) {
                    if (c1406d3.f6660d.f6845e.f6825j) {
                        c1446g.mo3444d((int) ((r3.f6822g * c1406d2.f6692w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c1406d2.f6688s;
                if (i3 == 0 || i3 == 3) {
                    C1452m c1452m = c1406d2.f6662e;
                    C1445f c1445f3 = c1452m.f6848h;
                    C1445f c1445f4 = c1452m.f6849i;
                    boolean z3 = c1406d2.f6636I.f6624f != null;
                    boolean z4 = c1406d2.f6637J.f6624f != null;
                    boolean z5 = c1406d2.f6638K.f6624f != null;
                    boolean z6 = c1406d2.f6639L.f6624f != null;
                    int i4 = c1406d2.f6651X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c1406d2.f6650W;
                        boolean z7 = c1445f3.f6825j;
                        int[] iArr = f6830k;
                        if (z7 && c1445f4.f6825j) {
                            if (c1445f.f6818c && c1445f2.f6818c) {
                                m3456m(iArr, ((C1445f) c1445f.f6827l.get(0)).f6822g + c1445f.f6821f, ((C1445f) c1445f2.f6827l.get(0)).f6822g - c1445f2.f6821f, c1445f3.f6822g + c1445f3.f6821f, c1445f4.f6822g - c1445f4.f6821f, f5, i4);
                                c1446g.mo3444d(iArr[0]);
                                this.f6842b.f6662e.f6845e.mo3444d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c1445f.f6825j;
                        ArrayList arrayList = c1445f3.f6827l;
                        if (z8 && c1445f2.f6825j) {
                            if (!c1445f3.f6818c || !c1445f4.f6818c) {
                                return;
                            }
                            m3456m(iArr, c1445f.f6822g + c1445f.f6821f, c1445f2.f6822g - c1445f2.f6821f, ((C1445f) arrayList.get(0)).f6822g + c1445f3.f6821f, ((C1445f) c1445f4.f6827l.get(0)).f6822g - c1445f4.f6821f, f5, i4);
                            c1446g.mo3444d(iArr[0]);
                            this.f6842b.f6662e.f6845e.mo3444d(iArr[1]);
                        }
                        if (!c1445f.f6818c || !c1445f2.f6818c || !c1445f3.f6818c || !c1445f4.f6818c) {
                            return;
                        }
                        m3456m(iArr, ((C1445f) c1445f.f6827l.get(0)).f6822g + c1445f.f6821f, ((C1445f) c1445f2.f6827l.get(0)).f6822g - c1445f2.f6821f, ((C1445f) arrayList.get(0)).f6822g + c1445f3.f6821f, ((C1445f) c1445f4.f6827l.get(0)).f6822g - c1445f4.f6821f, f5, i4);
                        c1446g.mo3444d(iArr[0]);
                        this.f6842b.f6662e.f6845e.mo3444d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c1445f.f6818c || !c1445f2.f6818c) {
                            return;
                        }
                        float f6 = c1406d2.f6650W;
                        int i5 = ((C1445f) c1445f.f6827l.get(0)).f6822g + c1445f.f6821f;
                        int i6 = ((C1445f) c1445f2.f6827l.get(0)).f6822g - c1445f2.f6821f;
                        if (i4 == -1 || i4 == 0) {
                            int m3468g = m3468g(i6 - i5, 0);
                            int i7 = (int) ((m3468g * f6) + 0.5f);
                            int m3468g2 = m3468g(i7, 1);
                            if (i7 != m3468g2) {
                                m3468g = (int) ((m3468g2 / f6) + 0.5f);
                            }
                            c1446g.mo3444d(m3468g);
                            this.f6842b.f6662e.f6845e.mo3444d(m3468g2);
                        } else if (i4 == 1) {
                            int m3468g3 = m3468g(i6 - i5, 0);
                            int i8 = (int) ((m3468g3 / f6) + 0.5f);
                            int m3468g4 = m3468g(i8, 1);
                            if (i8 != m3468g4) {
                                m3468g3 = (int) ((m3468g4 * f6) + 0.5f);
                            }
                            c1446g.mo3444d(m3468g3);
                            this.f6842b.f6662e.f6845e.mo3444d(m3468g4);
                        }
                    } else if (z4 && z6) {
                        if (!c1445f3.f6818c || !c1445f4.f6818c) {
                            return;
                        }
                        float f7 = c1406d2.f6650W;
                        int i9 = ((C1445f) c1445f3.f6827l.get(0)).f6822g + c1445f3.f6821f;
                        int i10 = ((C1445f) c1445f4.f6827l.get(0)).f6822g - c1445f4.f6821f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int m3468g5 = m3468g(i10 - i9, 1);
                                int i11 = (int) ((m3468g5 * f7) + 0.5f);
                                int m3468g6 = m3468g(i11, 0);
                                if (i11 != m3468g6) {
                                    m3468g5 = (int) ((m3468g6 / f7) + 0.5f);
                                }
                                c1446g.mo3444d(m3468g6);
                                this.f6842b.f6662e.f6845e.mo3444d(m3468g5);
                            }
                        }
                        int m3468g7 = m3468g(i10 - i9, 1);
                        int i12 = (int) ((m3468g7 / f7) + 0.5f);
                        int m3468g8 = m3468g(i12, 0);
                        if (i12 != m3468g8) {
                            m3468g7 = (int) ((m3468g8 * f7) + 0.5f);
                        }
                        c1446g.mo3444d(m3468g8);
                        this.f6842b.f6662e.f6845e.mo3444d(m3468g7);
                    }
                } else {
                    int i13 = c1406d2.f6651X;
                    if (i13 == -1) {
                        f2 = c1406d2.f6662e.f6845e.f6822g;
                        f3 = c1406d2.f6650W;
                    } else if (i13 == 0) {
                        f4 = c1406d2.f6662e.f6845e.f6822g / c1406d2.f6650W;
                        i = (int) (f4 + 0.5f);
                        c1446g.mo3444d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c1446g.mo3444d(i);
                    } else {
                        f2 = c1406d2.f6662e.f6845e.f6822g;
                        f3 = c1406d2.f6650W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c1446g.mo3444d(i);
                }
            }
        }
        if (c1445f.f6818c && c1445f2.f6818c) {
            if (c1445f.f6825j && c1445f2.f6825j && c1446g.f6825j) {
                return;
            }
            if (!c1446g.f6825j && this.f6844d == 3) {
                C1406d c1406d4 = this.f6842b;
                if (c1406d4.f6687r == 0 && !c1406d4.m3401x()) {
                    C1445f c1445f5 = (C1445f) c1445f.f6827l.get(0);
                    C1445f c1445f6 = (C1445f) c1445f2.f6827l.get(0);
                    int i14 = c1445f5.f6822g + c1445f.f6821f;
                    int i15 = c1445f6.f6822g + c1445f2.f6821f;
                    c1445f.mo3444d(i14);
                    c1445f2.mo3444d(i15);
                    c1446g.mo3444d(i15 - i14);
                    return;
                }
            }
            if (!c1446g.f6825j && this.f6844d == 3 && this.f6841a == 1 && c1445f.f6827l.size() > 0 && c1445f2.f6827l.size() > 0) {
                int min = Math.min((((C1445f) c1445f2.f6827l.get(0)).f6822g + c1445f2.f6821f) - (((C1445f) c1445f.f6827l.get(0)).f6822g + c1445f.f6821f), c1446g.f6828m);
                C1406d c1406d5 = this.f6842b;
                int i16 = c1406d5.f6691v;
                int max = Math.max(c1406d5.f6690u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c1446g.mo3444d(max);
            }
            if (c1446g.f6825j) {
                C1445f c1445f7 = (C1445f) c1445f.f6827l.get(0);
                C1445f c1445f8 = (C1445f) c1445f2.f6827l.get(0);
                int i17 = c1445f7.f6822g;
                int i18 = c1445f.f6821f + i17;
                int i19 = c1445f8.f6822g;
                int i20 = c1445f2.f6821f + i19;
                float f8 = this.f6842b.f6661d0;
                if (c1445f7 == c1445f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c1445f.mo3444d((int) ((((i19 - i17) - c1446g.f6822g) * f8) + i17 + 0.5f));
                c1445f2.mo3444d(c1445f.f6822g + c1446g.f6822g);
            }
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: d */
    public final void mo3428d() {
        C1406d c1406d;
        C1406d c1406d2;
        int i;
        C1406d c1406d3;
        C1406d c1406d4;
        int i2;
        C1406d c1406d5 = this.f6842b;
        boolean z2 = c1406d5.f6654a;
        C1446g c1446g = this.f6845e;
        if (z2) {
            c1446g.mo3444d(c1406d5.m3394q());
        }
        boolean z3 = c1446g.f6825j;
        C1445f c1445f = this.f6849i;
        C1445f c1445f2 = this.f6848h;
        if (!z3) {
            C1406d c1406d6 = this.f6842b;
            int i3 = c1406d6.f6685p0[0];
            this.f6844d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c1406d4 = c1406d6.f6647T) != null && ((i2 = c1406d4.f6685p0[0]) == 1 || i2 == 4)) {
                    int m3394q = (c1406d4.m3394q() - this.f6842b.f6636I.m3357e()) - this.f6842b.f6638K.m3357e();
                    AbstractC1454o.m3464b(c1445f2, c1406d4.f6660d.f6848h, this.f6842b.f6636I.m3357e());
                    AbstractC1454o.m3464b(c1445f, c1406d4.f6660d.f6849i, -this.f6842b.f6638K.m3357e());
                    c1446g.mo3444d(m3394q);
                    return;
                }
                if (i3 == 1) {
                    c1446g.mo3444d(c1406d6.m3394q());
                }
            }
        } else if (this.f6844d == 4 && (c1406d2 = (c1406d = this.f6842b).f6647T) != null && ((i = c1406d2.f6685p0[0]) == 1 || i == 4)) {
            AbstractC1454o.m3464b(c1445f2, c1406d2.f6660d.f6848h, c1406d.f6636I.m3357e());
            AbstractC1454o.m3464b(c1445f, c1406d2.f6660d.f6849i, -this.f6842b.f6638K.m3357e());
            return;
        }
        if (c1446g.f6825j) {
            C1406d c1406d7 = this.f6842b;
            if (c1406d7.f6654a) {
                C1405c[] c1405cArr = c1406d7.f6644Q;
                C1405c c1405c = c1405cArr[0];
                C1405c c1405c2 = c1405c.f6624f;
                if (c1405c2 != null && c1405cArr[1].f6624f != null) {
                    if (c1406d7.m3401x()) {
                        c1445f2.f6821f = this.f6842b.f6644Q[0].m3357e();
                        c1445f.f6821f = -this.f6842b.f6644Q[1].m3357e();
                        return;
                    }
                    C1445f m3465h = AbstractC1454o.m3465h(this.f6842b.f6644Q[0]);
                    if (m3465h != null) {
                        AbstractC1454o.m3464b(c1445f2, m3465h, this.f6842b.f6644Q[0].m3357e());
                    }
                    C1445f m3465h2 = AbstractC1454o.m3465h(this.f6842b.f6644Q[1]);
                    if (m3465h2 != null) {
                        AbstractC1454o.m3464b(c1445f, m3465h2, -this.f6842b.f6644Q[1].m3357e());
                    }
                    c1445f2.f6817b = true;
                    c1445f.f6817b = true;
                    return;
                }
                if (c1405c2 != null) {
                    C1445f m3465h3 = AbstractC1454o.m3465h(c1405c);
                    if (m3465h3 != null) {
                        AbstractC1454o.m3464b(c1445f2, m3465h3, this.f6842b.f6644Q[0].m3357e());
                        AbstractC1454o.m3464b(c1445f, c1445f2, c1446g.f6822g);
                        return;
                    }
                    return;
                }
                C1405c c1405c3 = c1405cArr[1];
                if (c1405c3.f6624f != null) {
                    C1445f m3465h4 = AbstractC1454o.m3465h(c1405c3);
                    if (m3465h4 != null) {
                        AbstractC1454o.m3464b(c1445f, m3465h4, -this.f6842b.f6644Q[1].m3357e());
                        AbstractC1454o.m3464b(c1445f2, c1445f, -c1446g.f6822g);
                        return;
                    }
                    return;
                }
                if ((c1406d7 instanceof AbstractC1411i) || c1406d7.f6647T == null || c1406d7.mo3388i(7).f6624f != null) {
                    return;
                }
                C1406d c1406d8 = this.f6842b;
                AbstractC1454o.m3464b(c1445f2, c1406d8.f6647T.f6660d.f6848h, c1406d8.m3395r());
                AbstractC1454o.m3464b(c1445f, c1445f2, c1446g.f6822g);
                return;
            }
        }
        if (this.f6844d == 3) {
            C1406d c1406d9 = this.f6842b;
            int i4 = c1406d9.f6687r;
            if (i4 == 2) {
                C1406d c1406d10 = c1406d9.f6647T;
                if (c1406d10 != null) {
                    C1446g c1446g2 = c1406d10.f6662e.f6845e;
                    c1446g.f6827l.add(c1446g2);
                    c1446g2.f6826k.add(c1446g);
                    c1446g.f6817b = true;
                    c1446g.f6826k.add(c1445f2);
                    c1446g.f6826k.add(c1445f);
                }
            } else if (i4 == 3) {
                if (c1406d9.f6688s == 3) {
                    c1445f2.f6816a = this;
                    c1445f.f6816a = this;
                    C1452m c1452m = c1406d9.f6662e;
                    c1452m.f6848h.f6816a = this;
                    c1452m.f6849i.f6816a = this;
                    c1446g.f6816a = this;
                    if (c1406d9.m3402y()) {
                        c1446g.f6827l.add(this.f6842b.f6662e.f6845e);
                        this.f6842b.f6662e.f6845e.f6826k.add(c1446g);
                        C1452m c1452m2 = this.f6842b.f6662e;
                        c1452m2.f6845e.f6816a = this;
                        c1446g.f6827l.add(c1452m2.f6848h);
                        c1446g.f6827l.add(this.f6842b.f6662e.f6849i);
                        this.f6842b.f6662e.f6848h.f6826k.add(c1446g);
                        this.f6842b.f6662e.f6849i.f6826k.add(c1446g);
                    } else if (this.f6842b.m3401x()) {
                        this.f6842b.f6662e.f6845e.f6827l.add(c1446g);
                        c1446g.f6826k.add(this.f6842b.f6662e.f6845e);
                    } else {
                        this.f6842b.f6662e.f6845e.f6827l.add(c1446g);
                    }
                } else {
                    C1446g c1446g3 = c1406d9.f6662e.f6845e;
                    c1446g.f6827l.add(c1446g3);
                    c1446g3.f6826k.add(c1446g);
                    this.f6842b.f6662e.f6848h.f6826k.add(c1446g);
                    this.f6842b.f6662e.f6849i.f6826k.add(c1446g);
                    c1446g.f6817b = true;
                    c1446g.f6826k.add(c1445f2);
                    c1446g.f6826k.add(c1445f);
                    c1445f2.f6827l.add(c1446g);
                    c1445f.f6827l.add(c1446g);
                }
            }
        }
        C1406d c1406d11 = this.f6842b;
        C1405c[] c1405cArr2 = c1406d11.f6644Q;
        C1405c c1405c4 = c1405cArr2[0];
        C1405c c1405c5 = c1405c4.f6624f;
        if (c1405c5 != null && c1405cArr2[1].f6624f != null) {
            if (c1406d11.m3401x()) {
                c1445f2.f6821f = this.f6842b.f6644Q[0].m3357e();
                c1445f.f6821f = -this.f6842b.f6644Q[1].m3357e();
                return;
            }
            C1445f m3465h5 = AbstractC1454o.m3465h(this.f6842b.f6644Q[0]);
            C1445f m3465h6 = AbstractC1454o.m3465h(this.f6842b.f6644Q[1]);
            if (m3465h5 != null) {
                m3465h5.m3442b(this);
            }
            if (m3465h6 != null) {
                m3465h6.m3442b(this);
            }
            this.f6850j = 4;
            return;
        }
        if (c1405c5 != null) {
            C1445f m3465h7 = AbstractC1454o.m3465h(c1405c4);
            if (m3465h7 != null) {
                AbstractC1454o.m3464b(c1445f2, m3465h7, this.f6842b.f6644Q[0].m3357e());
                m3467c(c1445f, c1445f2, 1, c1446g);
                return;
            }
            return;
        }
        C1405c c1405c6 = c1405cArr2[1];
        if (c1405c6.f6624f != null) {
            C1445f m3465h8 = AbstractC1454o.m3465h(c1405c6);
            if (m3465h8 != null) {
                AbstractC1454o.m3464b(c1445f, m3465h8, -this.f6842b.f6644Q[1].m3357e());
                m3467c(c1445f2, c1445f, -1, c1446g);
                return;
            }
            return;
        }
        if ((c1406d11 instanceof AbstractC1411i) || (c1406d3 = c1406d11.f6647T) == null) {
            return;
        }
        AbstractC1454o.m3464b(c1445f2, c1406d3.f6660d.f6848h, c1406d11.m3395r());
        m3467c(c1445f, c1445f2, 1, c1446g);
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: e */
    public final void mo3429e() {
        C1445f c1445f = this.f6848h;
        if (c1445f.f6825j) {
            this.f6842b.f6652Y = c1445f.f6822g;
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: f */
    public final void mo3430f() {
        this.f6843c = null;
        this.f6848h.m3443c();
        this.f6849i.m3443c();
        this.f6845e.m3443c();
        this.f6847g = false;
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: k */
    public final boolean mo3432k() {
        return this.f6844d != 3 || this.f6842b.f6687r == 0;
    }

    /* renamed from: n */
    public final void m3457n() {
        this.f6847g = false;
        C1445f c1445f = this.f6848h;
        c1445f.m3443c();
        c1445f.f6825j = false;
        C1445f c1445f2 = this.f6849i;
        c1445f2.m3443c();
        c1445f2.f6825j = false;
        this.f6845e.f6825j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f6842b.f6669h0;
    }
}
