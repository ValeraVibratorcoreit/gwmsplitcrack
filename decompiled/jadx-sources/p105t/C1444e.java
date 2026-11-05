package p105t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p006C.AbstractC0062j;
import p102s.AbstractC1411i;
import p102s.C1405c;
import p102s.C1406d;
import p102s.C1407e;
import p102s.C1410h;
import p111v.C1593e;

/* renamed from: t.e */
/* loaded from: classes.dex */
public final class C1444e {

    /* renamed from: a */
    public C1407e f6808a;

    /* renamed from: b */
    public boolean f6809b;

    /* renamed from: c */
    public boolean f6810c;

    /* renamed from: d */
    public C1407e f6811d;

    /* renamed from: e */
    public ArrayList f6812e;

    /* renamed from: f */
    public C1593e f6813f;

    /* renamed from: g */
    public C1441b f6814g;

    /* renamed from: h */
    public ArrayList f6815h;

    /* renamed from: a */
    public final void m3435a(C1445f c1445f, int i, ArrayList arrayList, C1451l c1451l) {
        AbstractC1454o abstractC1454o = c1445f.f6819d;
        if (abstractC1454o.f6843c == null) {
            C1407e c1407e = this.f6808a;
            if (abstractC1454o == c1407e.f6660d || abstractC1454o == c1407e.f6662e) {
                return;
            }
            if (c1451l == null) {
                c1451l = new C1451l();
                c1451l.f6831a = null;
                c1451l.f6832b = new ArrayList();
                c1451l.f6831a = abstractC1454o;
                arrayList.add(c1451l);
            }
            abstractC1454o.f6843c = c1451l;
            c1451l.f6832b.add(abstractC1454o);
            C1445f c1445f2 = abstractC1454o.f6848h;
            Iterator it = c1445f2.f6826k.iterator();
            while (it.hasNext()) {
                InterfaceC1443d interfaceC1443d = (InterfaceC1443d) it.next();
                if (interfaceC1443d instanceof C1445f) {
                    m3435a((C1445f) interfaceC1443d, i, arrayList, c1451l);
                }
            }
            C1445f c1445f3 = abstractC1454o.f6849i;
            Iterator it2 = c1445f3.f6826k.iterator();
            while (it2.hasNext()) {
                InterfaceC1443d interfaceC1443d2 = (InterfaceC1443d) it2.next();
                if (interfaceC1443d2 instanceof C1445f) {
                    m3435a((C1445f) interfaceC1443d2, i, arrayList, c1451l);
                }
            }
            if (i == 1 && (abstractC1454o instanceof C1452m)) {
                Iterator it3 = ((C1452m) abstractC1454o).f6833k.f6826k.iterator();
                while (it3.hasNext()) {
                    InterfaceC1443d interfaceC1443d3 = (InterfaceC1443d) it3.next();
                    if (interfaceC1443d3 instanceof C1445f) {
                        m3435a((C1445f) interfaceC1443d3, i, arrayList, c1451l);
                    }
                }
            }
            Iterator it4 = c1445f2.f6827l.iterator();
            while (it4.hasNext()) {
                m3435a((C1445f) it4.next(), i, arrayList, c1451l);
            }
            Iterator it5 = c1445f3.f6827l.iterator();
            while (it5.hasNext()) {
                m3435a((C1445f) it5.next(), i, arrayList, c1451l);
            }
            if (i == 1 && (abstractC1454o instanceof C1452m)) {
                Iterator it6 = ((C1452m) abstractC1454o).f6833k.f6827l.iterator();
                while (it6.hasNext()) {
                    m3435a((C1445f) it6.next(), i, arrayList, c1451l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3436b(C1407e c1407e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c1407e.f6708q0.iterator();
        while (it.hasNext()) {
            C1406d c1406d = (C1406d) it.next();
            int[] iArr = c1406d.f6685p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c1406d.f6667g0 == 8) {
                c1406d.f6654a = true;
            } else {
                float f2 = c1406d.f6692w;
                if (f2 < 1.0f && i7 == 3) {
                    c1406d.f6687r = 2;
                }
                float f3 = c1406d.f6695z;
                if (f3 < 1.0f && i8 == 3) {
                    c1406d.f6688s = 2;
                }
                if (c1406d.f6650W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c1406d.f6687r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c1406d.f6688s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c1406d.f6687r == 0) {
                            c1406d.f6687r = 3;
                        }
                        if (c1406d.f6688s == 0) {
                            c1406d.f6688s = 3;
                        }
                    }
                }
                C1405c c1405c = c1406d.f6638K;
                C1405c c1405c2 = c1406d.f6636I;
                if (i7 == 3 && c1406d.f6687r == 1 && (c1405c2.f6624f == null || c1405c.f6624f == null)) {
                    i7 = 2;
                }
                C1405c c1405c3 = c1406d.f6639L;
                C1405c c1405c4 = c1406d.f6637J;
                int i9 = (i8 == 3 && c1406d.f6688s == 1 && (c1405c4.f6624f == null || c1405c3.f6624f == null)) ? 2 : i8;
                C1450k c1450k = c1406d.f6660d;
                c1450k.f6844d = i7;
                int i10 = c1406d.f6687r;
                c1450k.f6841a = i10;
                C1452m c1452m = c1406d.f6662e;
                c1452m.f6844d = i9;
                int i11 = c1406d.f6688s;
                c1452m.f6841a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int m3394q = c1406d.m3394q();
                    if (i7 == 4) {
                        i = (c1407e.m3394q() - c1405c2.f6625g) - c1405c.f6625g;
                        i7 = 1;
                    } else {
                        i = m3394q;
                    }
                    int m3390k = c1406d.m3390k();
                    if (i9 == 4) {
                        i2 = (c1407e.m3390k() - c1405c4.f6625g) - c1405c3.f6625g;
                        i3 = 1;
                    } else {
                        i2 = m3390k;
                        i3 = i9;
                    }
                    m3440f(i7, i, i3, i2, c1406d);
                    c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                    c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                    c1406d.f6654a = true;
                } else {
                    int[] iArr2 = c1407e.f6685p0;
                    C1405c[] c1405cArr = c1406d.f6644Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            m3440f(2, 0, 2, 0, c1406d);
                        }
                        int m3390k2 = c1406d.m3390k();
                        m3440f(1, (int) ((m3390k2 * c1406d.f6650W) + 0.5f), 1, m3390k2, c1406d);
                        c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                        c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                        c1406d.f6654a = true;
                    } else if (i10 == 1) {
                        m3440f(2, 0, i9, 0, c1406d);
                        c1406d.f6660d.f6845e.f6828m = c1406d.m3394q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            m3440f(1, (int) ((f2 * c1407e.m3394q()) + 0.5f), i9, c1406d.m3390k(), c1406d);
                            c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                            c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                            c1406d.f6654a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c1405cArr[0].f6624f == null || c1405cArr[1].f6624f == null) {
                        m3440f(2, 0, i9, 0, c1406d);
                        c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                        c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                        c1406d.f6654a = true;
                    } else {
                        i4 = 3;
                    }
                    if (i9 == i4) {
                        if (i7 != 2 && i7 != 1) {
                            i6 = i4;
                            i5 = 1;
                            if (i7 != i6) {
                                if (i10 != i5) {
                                }
                                m3440f(2, 0, 2, 0, c1406d);
                                c1406d.f6660d.f6845e.f6828m = c1406d.m3394q();
                                c1406d.f6662e.f6845e.f6828m = c1406d.m3390k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                m3440f(2, 0, 2, 0, c1406d);
                            }
                            int m3394q2 = c1406d.m3394q();
                            float f4 = c1406d.f6650W;
                            if (c1406d.f6651X == -1) {
                                f4 = 1.0f / f4;
                            }
                            m3440f(1, m3394q2, 1, (int) ((m3394q2 * f4) + 0.5f), c1406d);
                            c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                            c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                            c1406d.f6654a = true;
                        } else if (i11 == 1) {
                            m3440f(i7, 0, 2, 0, c1406d);
                            c1406d.f6662e.f6845e.f6828m = c1406d.m3390k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    m3440f(i7, c1406d.m3394q(), 1, (int) ((f3 * c1407e.m3390k()) + 0.5f), c1406d);
                                    c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                                    c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                                    c1406d.f6654a = true;
                                }
                            } else if (c1405cArr[2].f6624f == null || c1405cArr[3].f6624f == null) {
                                m3440f(2, 0, i9, 0, c1406d);
                                c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                                c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                                c1406d.f6654a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    m3440f(2, 0, 2, 0, c1406d);
                                    c1406d.f6660d.f6845e.f6828m = c1406d.m3394q();
                                    c1406d.f6662e.f6845e.f6828m = c1406d.m3390k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    m3440f(1, (int) ((f2 * c1407e.m3394q()) + 0.5f), 1, (int) ((f3 * c1407e.m3390k()) + 0.5f), c1406d);
                                    c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                                    c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                                    c1406d.f6654a = true;
                                }
                            }
                        }
                    }
                    i5 = 1;
                    i6 = 3;
                    if (i7 != i6) {
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m3437c() {
        ArrayList arrayList = this.f6812e;
        arrayList.clear();
        C1407e c1407e = this.f6811d;
        c1407e.f6660d.mo3430f();
        c1407e.f6662e.mo3430f();
        arrayList.add(c1407e.f6660d);
        arrayList.add(c1407e.f6662e);
        Iterator it = c1407e.f6708q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C1406d c1406d = (C1406d) it.next();
            if (c1406d instanceof C1410h) {
                C1448i c1448i = new C1448i(c1406d);
                c1406d.f6660d.mo3430f();
                c1406d.f6662e.mo3430f();
                c1448i.f6846f = ((C1410h) c1406d).f6776u0;
                arrayList.add(c1448i);
            } else {
                if (c1406d.m3401x()) {
                    if (c1406d.f6656b == null) {
                        c1406d.f6656b = new C1442c(c1406d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1406d.f6656b);
                } else {
                    arrayList.add(c1406d.f6660d);
                }
                if (c1406d.m3402y()) {
                    if (c1406d.f6658c == null) {
                        c1406d.f6658c = new C1442c(c1406d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1406d.f6658c);
                } else {
                    arrayList.add(c1406d.f6662e);
                }
                if (c1406d instanceof AbstractC1411i) {
                    arrayList.add(new C1449j(c1406d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC1454o) it2.next()).mo3430f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1454o abstractC1454o = (AbstractC1454o) it3.next();
            if (abstractC1454o.f6842b != c1407e) {
                abstractC1454o.mo3428d();
            }
        }
        ArrayList arrayList2 = this.f6815h;
        arrayList2.clear();
        C1407e c1407e2 = this.f6808a;
        m3439e(c1407e2.f6660d, 0, arrayList2);
        m3439e(c1407e2.f6662e, 1, arrayList2);
        this.f6809b = false;
    }

    /* renamed from: d */
    public final int m3438d(C1407e c1407e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C1407e c1407e2 = c1407e;
        ArrayList arrayList2 = this.f6815h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC1454o abstractC1454o = ((C1451l) arrayList2.get(i4)).f6831a;
            if (!(abstractC1454o instanceof C1442c) ? !(i != 0 ? (abstractC1454o instanceof C1452m) : (abstractC1454o instanceof C1450k)) : ((C1442c) abstractC1454o).f6846f != i) {
                C1445f c1445f = (i == 0 ? c1407e2.f6660d : c1407e2.f6662e).f6848h;
                C1445f c1445f2 = (i == 0 ? c1407e2.f6660d : c1407e2.f6662e).f6849i;
                boolean contains = abstractC1454o.f6848h.f6827l.contains(c1445f);
                C1445f c1445f3 = abstractC1454o.f6849i;
                boolean contains2 = c1445f3.f6827l.contains(c1445f2);
                long mo3431j = abstractC1454o.mo3431j();
                C1445f c1445f4 = abstractC1454o.f6848h;
                if (contains && contains2) {
                    long m3459b = C1451l.m3459b(c1445f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long m3458a = C1451l.m3458a(c1445f3, 0L);
                    long j3 = m3459b - mo3431j;
                    int i5 = c1445f3.f6821f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j3 >= (-i5)) {
                        j3 += i5;
                    }
                    long j4 = (-m3458a) - mo3431j;
                    long j5 = c1445f4.f6821f;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    C1406d c1406d = abstractC1454o.f6842b;
                    if (i == 0) {
                        f2 = c1406d.f6661d0;
                    } else if (i == 1) {
                        f2 = c1406d.f6663e0;
                    } else {
                        c1406d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j3 / (1.0f - f2)) + (j6 / f2)) : 0L;
                    max = (c1445f4.f6821f + ((((long) ((f3 * f2) + 0.5f)) + mo3431j) + ((long) AbstractC0062j.m149c(1.0f, f2, f3, 0.5f)))) - c1445f3.f6821f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C1451l.m3459b(c1445f4, c1445f4.f6821f), c1445f4.f6821f + mo3431j) : contains2 ? Math.max(-C1451l.m3458a(c1445f3, c1445f3.f6821f), (-c1445f3.f6821f) + mo3431j) : (abstractC1454o.mo3431j() + c1445f4.f6821f) - c1445f3.f6821f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c1407e2 = c1407e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    /* renamed from: e */
    public final void m3439e(AbstractC1454o abstractC1454o, int i, ArrayList arrayList) {
        C1445f c1445f;
        Iterator it = abstractC1454o.f6848h.f6826k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c1445f = abstractC1454o.f6849i;
            if (!hasNext) {
                break;
            }
            InterfaceC1443d interfaceC1443d = (InterfaceC1443d) it.next();
            if (interfaceC1443d instanceof C1445f) {
                m3435a((C1445f) interfaceC1443d, i, arrayList, null);
            } else if (interfaceC1443d instanceof AbstractC1454o) {
                m3435a(((AbstractC1454o) interfaceC1443d).f6848h, i, arrayList, null);
            }
        }
        Iterator it2 = c1445f.f6826k.iterator();
        while (it2.hasNext()) {
            InterfaceC1443d interfaceC1443d2 = (InterfaceC1443d) it2.next();
            if (interfaceC1443d2 instanceof C1445f) {
                m3435a((C1445f) interfaceC1443d2, i, arrayList, null);
            } else if (interfaceC1443d2 instanceof AbstractC1454o) {
                m3435a(((AbstractC1454o) interfaceC1443d2).f6849i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C1452m) abstractC1454o).f6833k.f6826k.iterator();
            while (it3.hasNext()) {
                InterfaceC1443d interfaceC1443d3 = (InterfaceC1443d) it3.next();
                if (interfaceC1443d3 instanceof C1445f) {
                    m3435a((C1445f) interfaceC1443d3, i, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m3440f(int i, int i2, int i3, int i4, C1406d c1406d) {
        C1441b c1441b = this.f6814g;
        c1441b.f6796a = i;
        c1441b.f6797b = i3;
        c1441b.f6798c = i2;
        c1441b.f6799d = i4;
        this.f6813f.m4750b(c1406d, c1441b);
        c1406d.m3379O(c1441b.f6800e);
        c1406d.m3376L(c1441b.f6801f);
        c1406d.f6632E = c1441b.f6803h;
        c1406d.m3373I(c1441b.f6802g);
    }

    /* renamed from: g */
    public final void m3441g() {
        C1440a c1440a;
        Iterator it = this.f6808a.f6708q0.iterator();
        while (it.hasNext()) {
            C1406d c1406d = (C1406d) it.next();
            if (!c1406d.f6654a) {
                int[] iArr = c1406d.f6685p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c1406d.f6687r;
                int i4 = c1406d.f6688s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C1446g c1446g = c1406d.f6660d.f6845e;
                boolean z4 = c1446g.f6825j;
                C1446g c1446g2 = c1406d.f6662e.f6845e;
                boolean z5 = c1446g2.f6825j;
                if (z4 && z5) {
                    m3440f(1, c1446g.f6822g, 1, c1446g2.f6822g, c1406d);
                    c1406d.f6654a = true;
                } else if (z4 && z2) {
                    m3440f(1, c1446g.f6822g, 2, c1446g2.f6822g, c1406d);
                    if (i2 == 3) {
                        c1406d.f6662e.f6845e.f6828m = c1406d.m3390k();
                    } else {
                        c1406d.f6662e.f6845e.mo3444d(c1406d.m3390k());
                        c1406d.f6654a = true;
                    }
                } else if (z5 && z3) {
                    m3440f(2, c1446g.f6822g, 1, c1446g2.f6822g, c1406d);
                    if (i == 3) {
                        c1406d.f6660d.f6845e.f6828m = c1406d.m3394q();
                    } else {
                        c1406d.f6660d.f6845e.mo3444d(c1406d.m3394q());
                        c1406d.f6654a = true;
                    }
                }
                if (c1406d.f6654a && (c1440a = c1406d.f6662e.f6834l) != null) {
                    c1440a.mo3444d(c1406d.f6655a0);
                }
            }
        }
    }
}
