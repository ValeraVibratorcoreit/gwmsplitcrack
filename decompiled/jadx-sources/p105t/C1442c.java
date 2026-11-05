package p105t;

import java.util.ArrayList;
import java.util.Iterator;
import p102s.C1405c;
import p102s.C1406d;
import p102s.C1407e;

/* renamed from: t.c */
/* loaded from: classes.dex */
public final class C1442c extends AbstractC1454o {

    /* renamed from: k */
    public final ArrayList f6806k;

    /* renamed from: l */
    public int f6807l;

    public C1442c(C1406d c1406d, int i) {
        super(c1406d);
        C1406d c1406d2;
        this.f6806k = new ArrayList();
        this.f6846f = i;
        C1406d c1406d3 = this.f6842b;
        C1406d m3392m = c1406d3.m3392m(i);
        while (true) {
            C1406d c1406d4 = m3392m;
            c1406d2 = c1406d3;
            c1406d3 = c1406d4;
            if (c1406d3 == null) {
                break;
            } else {
                m3392m = c1406d3.m3392m(this.f6846f);
            }
        }
        this.f6842b = c1406d2;
        int i2 = this.f6846f;
        AbstractC1454o abstractC1454o = i2 == 0 ? c1406d2.f6660d : i2 == 1 ? c1406d2.f6662e : null;
        ArrayList arrayList = this.f6806k;
        arrayList.add(abstractC1454o);
        C1406d m3391l = c1406d2.m3391l(this.f6846f);
        while (m3391l != null) {
            int i3 = this.f6846f;
            arrayList.add(i3 == 0 ? m3391l.f6660d : i3 == 1 ? m3391l.f6662e : null);
            m3391l = m3391l.m3391l(this.f6846f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1454o abstractC1454o2 = (AbstractC1454o) it.next();
            int i4 = this.f6846f;
            if (i4 == 0) {
                abstractC1454o2.f6842b.f6656b = this;
            } else if (i4 == 1) {
                abstractC1454o2.f6842b.f6658c = this;
            }
        }
        if (this.f6846f == 0 && ((C1407e) this.f6842b.f6647T).f6713v0 && arrayList.size() > 1) {
            this.f6842b = ((AbstractC1454o) arrayList.get(arrayList.size() - 1)).f6842b;
        }
        this.f6807l = this.f6846f == 0 ? this.f6842b.f6671i0 : this.f6842b.f6673j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // p105t.InterfaceC1443d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3427a(InterfaceC1443d interfaceC1443d) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        boolean z2;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        float f3;
        int i15;
        boolean z4;
        int i16;
        C1445f c1445f = this.f6848h;
        if (c1445f.f6825j) {
            C1445f c1445f2 = this.f6849i;
            if (c1445f2.f6825j) {
                C1406d c1406d = this.f6842b.f6647T;
                boolean z5 = c1406d instanceof C1407e ? ((C1407e) c1406d).f6713v0 : false;
                int i17 = c1445f2.f6822g - c1445f.f6822g;
                ArrayList arrayList3 = this.f6806k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC1454o) arrayList3.get(i18)).f6842b.f6667g0 != 8) {
                        break;
                    } else {
                        i18++;
                    }
                }
                int i19 = size - 1;
                int i20 = i19;
                while (true) {
                    if (i20 < 0) {
                        break;
                    }
                    if (((AbstractC1454o) arrayList3.get(i20)).f6842b.f6667g0 != 8) {
                        i = i20;
                        break;
                    }
                    i20--;
                }
                int i21 = 0;
                while (i21 < 2) {
                    int i22 = 0;
                    i6 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    f2 = 0.0f;
                    while (i22 < size) {
                        AbstractC1454o abstractC1454o = (AbstractC1454o) arrayList3.get(i22);
                        C1406d c1406d2 = abstractC1454o.f6842b;
                        ArrayList arrayList4 = arrayList3;
                        if (c1406d2.f6667g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC1454o.f6848h.f6821f;
                            }
                            C1446g c1446g = abstractC1454o.f6845e;
                            int i25 = c1446g.f6822g;
                            i15 = i18;
                            boolean z6 = abstractC1454o.f6844d != 3;
                            if (z6) {
                                int i26 = this.f6846f;
                                if (i26 == 0 && !c1406d2.f6660d.f6845e.f6825j) {
                                    return;
                                }
                                if (i26 == 1 && !c1406d2.f6662e.f6845e.f6825j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC1454o.f6841a == 1 && i21 == 0) {
                                    i16 = c1446g.f6828m;
                                    i23++;
                                } else if (c1446g.f6825j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c1406d2.f6675k0[this.f6846f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC1454o.f6849i.f6821f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC1454o.f6849i.f6821f;
                            }
                        }
                        i22++;
                        arrayList3 = arrayList4;
                        i18 = i15;
                        i2 = 8;
                    }
                    arrayList = arrayList3;
                    i3 = i18;
                    if (i6 < i17 || i23 == 0) {
                        i4 = i23;
                        i5 = i24;
                        break;
                    } else {
                        i21++;
                        arrayList3 = arrayList;
                        i18 = i3;
                        i2 = 8;
                    }
                }
                arrayList = arrayList3;
                i3 = i18;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                f2 = 0.0f;
                int i27 = c1445f.f6822g;
                if (z5) {
                    i27 = c1445f2.f6822g;
                }
                if (i6 > i17) {
                    i27 = z5 ? i27 + ((int) (((i6 - i17) / 2.0f) + 0.5f)) : i27 - ((int) (((i6 - i17) / 2.0f) + 0.5f));
                }
                if (i4 > 0) {
                    float f5 = i17 - i6;
                    int i28 = (int) ((f5 / i4) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        ArrayList arrayList5 = arrayList;
                        AbstractC1454o abstractC1454o2 = (AbstractC1454o) arrayList5.get(i29);
                        int i31 = i28;
                        C1406d c1406d3 = abstractC1454o2.f6842b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c1406d3.f6667g0 != 8 && abstractC1454o2.f6844d == 3) {
                            C1446g c1446g2 = abstractC1454o2.f6845e;
                            if (!c1446g2.f6825j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c1406d3.f6675k0[this.f6846f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f6846f == 0) {
                                    i13 = c1406d3.f6691v;
                                    i14 = c1406d3.f6690u;
                                } else {
                                    i13 = c1406d3.f6694y;
                                    i14 = c1406d3.f6693x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC1454o2.f6841a == 1 ? Math.min(i12, c1446g2.f6828m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c1446g2.mo3444d(i12);
                                i29++;
                                i28 = i31;
                                i6 = i32;
                                i27 = i33;
                                z5 = z3;
                                f5 = f3;
                                arrayList = arrayList5;
                            }
                        }
                        z3 = z5;
                        f3 = f5;
                        i29++;
                        i28 = i31;
                        i6 = i32;
                        i27 = i33;
                        z5 = z3;
                        f5 = f3;
                        arrayList = arrayList5;
                    }
                    i7 = i27;
                    z2 = z5;
                    arrayList2 = arrayList;
                    int i34 = i6;
                    if (i30 > 0) {
                        i4 -= i30;
                        int i35 = 0;
                        i6 = 0;
                        while (i35 < size) {
                            AbstractC1454o abstractC1454o3 = (AbstractC1454o) arrayList2.get(i35);
                            if (abstractC1454o3.f6842b.f6667g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC1454o3.f6848h.f6821f;
                                }
                                i6 += abstractC1454o3.f6845e.f6822g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC1454o3.f6849i.f6821f;
                                }
                            }
                            i35++;
                            i3 = i11;
                        }
                        i8 = i3;
                    } else {
                        i8 = i3;
                        i6 = i34;
                    }
                    i10 = 2;
                    if (this.f6807l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f6807l = 0;
                    } else {
                        i9 = 0;
                    }
                } else {
                    i7 = i27;
                    z2 = z5;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 0;
                    i10 = 2;
                }
                if (i6 > i17) {
                    this.f6807l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f6807l = i10;
                }
                int i36 = this.f6807l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC1454o abstractC1454o4 = (AbstractC1454o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC1454o4.f6842b.f6667g0;
                        C1445f c1445f3 = abstractC1454o4.f6849i;
                        C1445f c1445f4 = abstractC1454o4.f6848h;
                        if (i40 == 8) {
                            c1445f4.mo3444d(i38);
                            c1445f3.mo3444d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c1445f4.f6821f : i38 + c1445f4.f6821f;
                            }
                            if (z2) {
                                c1445f3.mo3444d(i38);
                            } else {
                                c1445f4.mo3444d(i38);
                            }
                            C1446g c1446g3 = abstractC1454o4.f6845e;
                            int i41 = c1446g3.f6822g;
                            if (abstractC1454o4.f6844d == 3 && abstractC1454o4.f6841a == 1) {
                                i41 = c1446g3.f6828m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c1445f4.mo3444d(i38);
                            } else {
                                c1445f3.mo3444d(i38);
                            }
                            abstractC1454o4.f6847g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c1445f3.f6821f) : i38 + (-c1445f3.f6821f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 0) {
                    int i42 = (i17 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i42 = i9;
                    }
                    int i43 = i7;
                    for (int i44 = i9; i44 < size; i44++) {
                        AbstractC1454o abstractC1454o5 = (AbstractC1454o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC1454o5.f6842b.f6667g0;
                        C1445f c1445f5 = abstractC1454o5.f6849i;
                        C1445f c1445f6 = abstractC1454o5.f6848h;
                        if (i45 == 8) {
                            c1445f6.mo3444d(i43);
                            c1445f5.mo3444d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c1445f6.f6821f : i46 + c1445f6.f6821f;
                            }
                            if (z2) {
                                c1445f5.mo3444d(i46);
                            } else {
                                c1445f6.mo3444d(i46);
                            }
                            C1446g c1446g4 = abstractC1454o5.f6845e;
                            int i47 = c1446g4.f6822g;
                            if (abstractC1454o5.f6844d == 3 && abstractC1454o5.f6841a == 1) {
                                i47 = Math.min(i47, c1446g4.f6828m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c1445f6.mo3444d(i43);
                            } else {
                                c1445f5.mo3444d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c1445f5.f6821f) : i43 + (-c1445f5.f6821f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f6846f == 0 ? this.f6842b.f6661d0 : this.f6842b.f6663e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC1454o abstractC1454o6 = (AbstractC1454o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC1454o6.f6842b.f6667g0;
                        C1445f c1445f7 = abstractC1454o6.f6849i;
                        C1445f c1445f8 = abstractC1454o6.f6848h;
                        if (i51 == 8) {
                            c1445f8.mo3444d(i49);
                            c1445f7.mo3444d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c1445f8.f6821f : i49 + c1445f8.f6821f;
                            }
                            if (z2) {
                                c1445f7.mo3444d(i49);
                            } else {
                                c1445f8.mo3444d(i49);
                            }
                            C1446g c1446g5 = abstractC1454o6.f6845e;
                            int i52 = c1446g5.f6822g;
                            if (abstractC1454o6.f6844d == 3 && abstractC1454o6.f6841a == 1) {
                                i52 = c1446g5.f6828m;
                            }
                            i49 += i52;
                            if (z2) {
                                c1445f8.mo3444d(i49);
                            } else {
                                c1445f7.mo3444d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c1445f7.f6821f) : i49 + (-c1445f7.f6821f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: d */
    public final void mo3428d() {
        ArrayList arrayList = this.f6806k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1454o) it.next()).mo3428d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C1406d c1406d = ((AbstractC1454o) arrayList.get(0)).f6842b;
        C1406d c1406d2 = ((AbstractC1454o) arrayList.get(size - 1)).f6842b;
        int i = this.f6846f;
        C1445f c1445f = this.f6849i;
        C1445f c1445f2 = this.f6848h;
        if (i == 0) {
            C1405c c1405c = c1406d.f6636I;
            C1405c c1405c2 = c1406d2.f6638K;
            C1445f m3466i = AbstractC1454o.m3466i(c1405c, 0);
            int m3357e = c1405c.m3357e();
            C1406d m3433m = m3433m();
            if (m3433m != null) {
                m3357e = m3433m.f6636I.m3357e();
            }
            if (m3466i != null) {
                AbstractC1454o.m3464b(c1445f2, m3466i, m3357e);
            }
            C1445f m3466i2 = AbstractC1454o.m3466i(c1405c2, 0);
            int m3357e2 = c1405c2.m3357e();
            C1406d m3434n = m3434n();
            if (m3434n != null) {
                m3357e2 = m3434n.f6638K.m3357e();
            }
            if (m3466i2 != null) {
                AbstractC1454o.m3464b(c1445f, m3466i2, -m3357e2);
            }
        } else {
            C1405c c1405c3 = c1406d.f6637J;
            C1405c c1405c4 = c1406d2.f6639L;
            C1445f m3466i3 = AbstractC1454o.m3466i(c1405c3, 1);
            int m3357e3 = c1405c3.m3357e();
            C1406d m3433m2 = m3433m();
            if (m3433m2 != null) {
                m3357e3 = m3433m2.f6637J.m3357e();
            }
            if (m3466i3 != null) {
                AbstractC1454o.m3464b(c1445f2, m3466i3, m3357e3);
            }
            C1445f m3466i4 = AbstractC1454o.m3466i(c1405c4, 1);
            int m3357e4 = c1405c4.m3357e();
            C1406d m3434n2 = m3434n();
            if (m3434n2 != null) {
                m3357e4 = m3434n2.f6639L.m3357e();
            }
            if (m3466i4 != null) {
                AbstractC1454o.m3464b(c1445f, m3466i4, -m3357e4);
            }
        }
        c1445f2.f6816a = this;
        c1445f.f6816a = this;
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: e */
    public final void mo3429e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6806k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1454o) arrayList.get(i)).mo3429e();
            i++;
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: f */
    public final void mo3430f() {
        this.f6843c = null;
        Iterator it = this.f6806k.iterator();
        while (it.hasNext()) {
            ((AbstractC1454o) it.next()).mo3430f();
        }
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: j */
    public final long mo3431j() {
        ArrayList arrayList = this.f6806k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.f6849i.f6821f + ((AbstractC1454o) arrayList.get(i)).mo3431j() + j2 + r5.f6848h.f6821f;
        }
        return j2;
    }

    @Override // p105t.AbstractC1454o
    /* renamed from: k */
    public final boolean mo3432k() {
        ArrayList arrayList = this.f6806k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1454o) arrayList.get(i)).mo3432k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C1406d m3433m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6806k;
            if (i >= arrayList.size()) {
                return null;
            }
            C1406d c1406d = ((AbstractC1454o) arrayList.get(i)).f6842b;
            if (c1406d.f6667g0 != 8) {
                return c1406d;
            }
            i++;
        }
    }

    /* renamed from: n */
    public final C1406d m3434n() {
        ArrayList arrayList = this.f6806k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1406d c1406d = ((AbstractC1454o) arrayList.get(size)).f6842b;
            if (c1406d.f6667g0 != 8) {
                return c1406d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f6846f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f6806k.iterator();
        while (it.hasNext()) {
            AbstractC1454o abstractC1454o = (AbstractC1454o) it.next();
            sb.append("<");
            sb.append(abstractC1454o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
