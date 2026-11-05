package p105t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p102s.AbstractC1411i;
import p102s.C1405c;
import p102s.C1406d;
import p102s.C1407e;
import p102s.C1410h;
import p111v.C1593e;

/* renamed from: t.h */
/* loaded from: classes.dex */
public abstract class AbstractC1447h {

    /* renamed from: a */
    public static final C1441b f6829a = new C1441b();

    /* renamed from: a */
    public static boolean m3445a(C1406d c1406d) {
        int[] iArr = c1406d.f6685p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C1406d c1406d2 = c1406d.f6647T;
        C1407e c1407e = c1406d2 != null ? (C1407e) c1406d2 : null;
        if (c1407e != null) {
            int i3 = c1407e.f6685p0[0];
        }
        if (c1407e != null) {
            int i4 = c1407e.f6685p0[1];
        }
        boolean z2 = i == 1 || c1406d.mo3347A() || i == 2 || (i == 3 && c1406d.f6687r == 0 && c1406d.f6650W == 0.0f && c1406d.m3397t(0)) || (i == 3 && c1406d.f6687r == 1 && c1406d.m3398u(0, c1406d.m3394q()));
        boolean z3 = i2 == 1 || c1406d.mo3348B() || i2 == 2 || (i2 == 3 && c1406d.f6688s == 0 && c1406d.f6650W == 0.0f && c1406d.m3397t(1)) || (i2 == 3 && c1406d.f6688s == 1 && c1406d.m3398u(1, c1406d.m3390k()));
        if (c1406d.f6650W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    /* renamed from: b */
    public static C1453n m3446b(C1406d c1406d, int i, ArrayList arrayList, C1453n c1453n) {
        int i2;
        int i3 = i == 0 ? c1406d.f6681n0 : c1406d.f6683o0;
        if (i3 != -1 && (c1453n == null || i3 != c1453n.f6837b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C1453n c1453n2 = (C1453n) arrayList.get(i4);
                if (c1453n2.f6837b == i3) {
                    if (c1453n != null) {
                        c1453n.m3463c(i, c1453n2);
                        arrayList.remove(c1453n);
                    }
                    c1453n = c1453n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c1453n;
        }
        if (c1453n == null) {
            if (c1406d instanceof AbstractC1411i) {
                AbstractC1411i abstractC1411i = (AbstractC1411i) c1406d;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC1411i.f6779r0) {
                        i2 = -1;
                        break;
                    }
                    C1406d c1406d2 = abstractC1411i.f6778q0[i5];
                    if ((i == 0 && (i2 = c1406d2.f6681n0) != -1) || (i == 1 && (i2 = c1406d2.f6683o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C1453n c1453n3 = (C1453n) arrayList.get(i6);
                        if (c1453n3.f6837b == i2) {
                            c1453n = c1453n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c1453n == null) {
                c1453n = new C1453n();
                c1453n.f6836a = new ArrayList();
                c1453n.f6839d = null;
                c1453n.f6840e = -1;
                int i7 = C1453n.f6835f;
                C1453n.f6835f = i7 + 1;
                c1453n.f6837b = i7;
                c1453n.f6838c = i;
            }
            arrayList.add(c1453n);
        }
        ArrayList arrayList2 = c1453n.f6836a;
        if (!arrayList2.contains(c1406d)) {
            arrayList2.add(c1406d);
            if (c1406d instanceof C1410h) {
                C1410h c1410h = (C1410h) c1406d;
                c1410h.f6775t0.m3355c(c1410h.f6776u0 == 0 ? 1 : 0, arrayList, c1453n);
            }
            int i8 = c1453n.f6837b;
            if (i == 0) {
                c1406d.f6681n0 = i8;
                c1406d.f6636I.m3355c(i, arrayList, c1453n);
                c1406d.f6638K.m3355c(i, arrayList, c1453n);
            } else {
                c1406d.f6683o0 = i8;
                c1406d.f6637J.m3355c(i, arrayList, c1453n);
                c1406d.f6640M.m3355c(i, arrayList, c1453n);
                c1406d.f6639L.m3355c(i, arrayList, c1453n);
            }
            c1406d.f6643P.m3355c(i, arrayList, c1453n);
        }
        return c1453n;
    }

    /* renamed from: c */
    public static void m3447c(int i, C1406d c1406d, C1593e c1593e, boolean z2) {
        C1405c c1405c;
        C1405c c1405c2;
        C1405c c1405c3;
        C1405c c1405c4;
        if (c1406d.f6678m) {
            return;
        }
        if (!(c1406d instanceof C1407e) && c1406d.m3403z() && m3445a(c1406d)) {
            C1407e.m3404V(c1406d, c1593e, new C1441b());
        }
        C1405c mo3388i = c1406d.mo3388i(2);
        C1405c mo3388i2 = c1406d.mo3388i(4);
        int m3356d = mo3388i.m3356d();
        int m3356d2 = mo3388i2.m3356d();
        HashSet hashSet = mo3388i.f6619a;
        char c2 = 0;
        if (hashSet != null && mo3388i.f6621c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1405c c1405c5 = (C1405c) it.next();
                C1406d c1406d2 = c1405c5.f6622d;
                int i2 = i + 1;
                boolean m3445a = m3445a(c1406d2);
                if (c1406d2.m3403z() && m3445a) {
                    C1407e.m3404V(c1406d2, c1593e, new C1441b());
                }
                C1405c c1405c6 = c1406d2.f6636I;
                C1405c c1405c7 = c1406d2.f6638K;
                char c3 = ((c1405c5 == c1405c6 && (c1405c4 = c1405c7.f6624f) != null && c1405c4.f6621c) || (c1405c5 == c1405c7 && (c1405c3 = c1405c6.f6624f) != null && c1405c3.f6621c)) ? (char) 1 : c2;
                int i3 = c1406d2.f6685p0[c2];
                if (i3 != 3 || m3445a) {
                    if (!c1406d2.m3403z()) {
                        if (c1405c5 == c1405c6 && c1405c7.f6624f == null) {
                            int m3357e = c1405c6.m3357e() + m3356d;
                            c1406d2.m3374J(m3357e, c1406d2.m3394q() + m3357e);
                            m3447c(i2, c1406d2, c1593e, z2);
                        } else if (c1405c5 == c1405c7 && c1405c6.f6624f == null) {
                            int m3357e2 = m3356d - c1405c7.m3357e();
                            c1406d2.m3374J(m3357e2 - c1406d2.m3394q(), m3357e2);
                            m3447c(i2, c1406d2, c1593e, z2);
                        } else if (c3 != 0 && !c1406d2.m3401x()) {
                            m3448d(i2, c1406d2, c1593e, z2);
                        }
                    }
                } else if (i3 == 3 && c1406d2.f6691v >= 0 && c1406d2.f6690u >= 0 && ((c1406d2.f6667g0 == 8 || (c1406d2.f6687r == 0 && c1406d2.f6650W == 0.0f)) && !c1406d2.m3401x() && !c1406d2.f6633F && c3 != 0 && !c1406d2.m3401x())) {
                    m3449e(i2, c1406d, c1593e, c1406d2, z2);
                }
                c2 = 0;
            }
        }
        if (c1406d instanceof C1410h) {
            return;
        }
        HashSet hashSet2 = mo3388i2.f6619a;
        if (hashSet2 != null && mo3388i2.f6621c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1405c c1405c8 = (C1405c) it2.next();
                C1406d c1406d3 = c1405c8.f6622d;
                int i4 = i + 1;
                boolean m3445a2 = m3445a(c1406d3);
                if (c1406d3.m3403z() && m3445a2) {
                    C1407e.m3404V(c1406d3, c1593e, new C1441b());
                }
                C1405c c1405c9 = c1406d3.f6636I;
                C1405c c1405c10 = c1406d3.f6638K;
                boolean z3 = (c1405c8 == c1405c9 && (c1405c2 = c1405c10.f6624f) != null && c1405c2.f6621c) || (c1405c8 == c1405c10 && (c1405c = c1405c9.f6624f) != null && c1405c.f6621c);
                int i5 = c1406d3.f6685p0[0];
                if (i5 != 3 || m3445a2) {
                    if (!c1406d3.m3403z()) {
                        if (c1405c8 == c1405c9 && c1405c10.f6624f == null) {
                            int m3357e3 = c1405c9.m3357e() + m3356d2;
                            c1406d3.m3374J(m3357e3, c1406d3.m3394q() + m3357e3);
                            m3447c(i4, c1406d3, c1593e, z2);
                        } else if (c1405c8 == c1405c10 && c1405c9.f6624f == null) {
                            int m3357e4 = m3356d2 - c1405c10.m3357e();
                            c1406d3.m3374J(m3357e4 - c1406d3.m3394q(), m3357e4);
                            m3447c(i4, c1406d3, c1593e, z2);
                        } else if (z3 && !c1406d3.m3401x()) {
                            m3448d(i4, c1406d3, c1593e, z2);
                        }
                    }
                } else if (i5 == 3 && c1406d3.f6691v >= 0 && c1406d3.f6690u >= 0) {
                    if (c1406d3.f6667g0 != 8) {
                        if (c1406d3.f6687r == 0) {
                            if (c1406d3.f6650W == 0.0f) {
                            }
                        }
                    }
                    if (!c1406d3.m3401x() && !c1406d3.f6633F && z3 && !c1406d3.m3401x()) {
                        m3449e(i4, c1406d, c1593e, c1406d3, z2);
                    }
                }
            }
        }
        c1406d.f6678m = true;
    }

    /* renamed from: d */
    public static void m3448d(int i, C1406d c1406d, C1593e c1593e, boolean z2) {
        float f2 = c1406d.f6661d0;
        C1405c c1405c = c1406d.f6636I;
        int m3356d = c1405c.f6624f.m3356d();
        C1405c c1405c2 = c1406d.f6638K;
        int m3356d2 = c1405c2.f6624f.m3356d();
        int m3357e = c1405c.m3357e() + m3356d;
        int m3357e2 = m3356d2 - c1405c2.m3357e();
        if (m3356d == m3356d2) {
            f2 = 0.5f;
        } else {
            m3356d = m3357e;
            m3356d2 = m3357e2;
        }
        int m3394q = c1406d.m3394q();
        int i2 = (m3356d2 - m3356d) - m3394q;
        if (m3356d > m3356d2) {
            i2 = (m3356d - m3356d2) - m3394q;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + m3356d;
        int i4 = i3 + m3394q;
        if (m3356d > m3356d2) {
            i4 = i3 - m3394q;
        }
        c1406d.m3374J(i3, i4);
        m3447c(i + 1, c1406d, c1593e, z2);
    }

    /* renamed from: e */
    public static void m3449e(int i, C1406d c1406d, C1593e c1593e, C1406d c1406d2, boolean z2) {
        float f2 = c1406d2.f6661d0;
        C1405c c1405c = c1406d2.f6636I;
        int m3357e = c1405c.m3357e() + c1405c.f6624f.m3356d();
        C1405c c1405c2 = c1406d2.f6638K;
        int m3356d = c1405c2.f6624f.m3356d() - c1405c2.m3357e();
        if (m3356d >= m3357e) {
            int m3394q = c1406d2.m3394q();
            if (c1406d2.f6667g0 != 8) {
                int i2 = c1406d2.f6687r;
                if (i2 == 2) {
                    m3394q = (int) (c1406d2.f6661d0 * 0.5f * (c1406d instanceof C1407e ? c1406d.m3394q() : c1406d.f6647T.m3394q()));
                } else if (i2 == 0) {
                    m3394q = m3356d - m3357e;
                }
                m3394q = Math.max(c1406d2.f6690u, m3394q);
                int i3 = c1406d2.f6691v;
                if (i3 > 0) {
                    m3394q = Math.min(i3, m3394q);
                }
            }
            int i4 = m3357e + ((int) ((f2 * ((m3356d - m3357e) - m3394q)) + 0.5f));
            c1406d2.m3374J(i4, m3394q + i4);
            m3447c(i + 1, c1406d2, c1593e, z2);
        }
    }

    /* renamed from: f */
    public static void m3450f(int i, C1406d c1406d, C1593e c1593e) {
        float f2 = c1406d.f6663e0;
        C1405c c1405c = c1406d.f6637J;
        int m3356d = c1405c.f6624f.m3356d();
        C1405c c1405c2 = c1406d.f6639L;
        int m3356d2 = c1405c2.f6624f.m3356d();
        int m3357e = c1405c.m3357e() + m3356d;
        int m3357e2 = m3356d2 - c1405c2.m3357e();
        if (m3356d == m3356d2) {
            f2 = 0.5f;
        } else {
            m3356d = m3357e;
            m3356d2 = m3357e2;
        }
        int m3390k = c1406d.m3390k();
        int i2 = (m3356d2 - m3356d) - m3390k;
        if (m3356d > m3356d2) {
            i2 = (m3356d - m3356d2) - m3390k;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = m3356d + i3;
        int i5 = i4 + m3390k;
        if (m3356d > m3356d2) {
            i4 = m3356d - i3;
            i5 = i4 - m3390k;
        }
        c1406d.m3375K(i4, i5);
        m3453i(i + 1, c1406d, c1593e);
    }

    /* renamed from: g */
    public static void m3451g(int i, C1406d c1406d, C1593e c1593e, C1406d c1406d2) {
        float f2 = c1406d2.f6663e0;
        C1405c c1405c = c1406d2.f6637J;
        int m3357e = c1405c.m3357e() + c1405c.f6624f.m3356d();
        C1405c c1405c2 = c1406d2.f6639L;
        int m3356d = c1405c2.f6624f.m3356d() - c1405c2.m3357e();
        if (m3356d >= m3357e) {
            int m3390k = c1406d2.m3390k();
            if (c1406d2.f6667g0 != 8) {
                int i2 = c1406d2.f6688s;
                if (i2 == 2) {
                    m3390k = (int) (f2 * 0.5f * (c1406d instanceof C1407e ? c1406d.m3390k() : c1406d.f6647T.m3390k()));
                } else if (i2 == 0) {
                    m3390k = m3356d - m3357e;
                }
                m3390k = Math.max(c1406d2.f6693x, m3390k);
                int i3 = c1406d2.f6694y;
                if (i3 > 0) {
                    m3390k = Math.min(i3, m3390k);
                }
            }
            int i4 = m3357e + ((int) ((f2 * ((m3356d - m3357e) - m3390k)) + 0.5f));
            c1406d2.m3375K(i4, m3390k + i4);
            m3453i(i + 1, c1406d2, c1593e);
        }
    }

    /* renamed from: h */
    public static boolean m3452h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* renamed from: i */
    public static void m3453i(int i, C1406d c1406d, C1593e c1593e) {
        C1405c c1405c;
        C1405c c1405c2;
        C1405c c1405c3;
        C1405c c1405c4;
        C1405c c1405c5;
        if (c1406d.f6680n) {
            return;
        }
        if (!(c1406d instanceof C1407e) && c1406d.m3403z() && m3445a(c1406d)) {
            C1407e.m3404V(c1406d, c1593e, new C1441b());
        }
        C1405c mo3388i = c1406d.mo3388i(3);
        C1405c mo3388i2 = c1406d.mo3388i(5);
        int m3356d = mo3388i.m3356d();
        int m3356d2 = mo3388i2.m3356d();
        HashSet hashSet = mo3388i.f6619a;
        if (hashSet != null && mo3388i.f6621c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1405c c1405c6 = (C1405c) it.next();
                C1406d c1406d2 = c1405c6.f6622d;
                int i2 = i + 1;
                boolean m3445a = m3445a(c1406d2);
                if (c1406d2.m3403z() && m3445a) {
                    C1407e.m3404V(c1406d2, c1593e, new C1441b());
                }
                C1405c c1405c7 = c1406d2.f6637J;
                C1405c c1405c8 = c1406d2.f6639L;
                boolean z2 = (c1405c6 == c1405c7 && (c1405c5 = c1405c8.f6624f) != null && c1405c5.f6621c) || (c1405c6 == c1405c8 && (c1405c4 = c1405c7.f6624f) != null && c1405c4.f6621c);
                int i3 = c1406d2.f6685p0[1];
                if (i3 != 3 || m3445a) {
                    if (!c1406d2.m3403z()) {
                        if (c1405c6 == c1405c7 && c1405c8.f6624f == null) {
                            int m3357e = c1405c7.m3357e() + m3356d;
                            c1406d2.m3375K(m3357e, c1406d2.m3390k() + m3357e);
                            m3453i(i2, c1406d2, c1593e);
                        } else if (c1405c6 == c1405c8 && c1405c7.f6624f == null) {
                            int m3357e2 = m3356d - c1405c8.m3357e();
                            c1406d2.m3375K(m3357e2 - c1406d2.m3390k(), m3357e2);
                            m3453i(i2, c1406d2, c1593e);
                        } else if (z2 && !c1406d2.m3402y()) {
                            m3450f(i2, c1406d2, c1593e);
                        }
                    }
                } else if (i3 == 3 && c1406d2.f6694y >= 0 && c1406d2.f6693x >= 0 && (c1406d2.f6667g0 == 8 || (c1406d2.f6688s == 0 && c1406d2.f6650W == 0.0f))) {
                    if (!c1406d2.m3402y() && !c1406d2.f6633F && z2 && !c1406d2.m3402y()) {
                        m3451g(i2, c1406d, c1593e, c1406d2);
                    }
                }
            }
        }
        if (c1406d instanceof C1410h) {
            return;
        }
        HashSet hashSet2 = mo3388i2.f6619a;
        if (hashSet2 != null && mo3388i2.f6621c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1405c c1405c9 = (C1405c) it2.next();
                C1406d c1406d3 = c1405c9.f6622d;
                int i4 = i + 1;
                boolean m3445a2 = m3445a(c1406d3);
                if (c1406d3.m3403z() && m3445a2) {
                    C1407e.m3404V(c1406d3, c1593e, new C1441b());
                }
                C1405c c1405c10 = c1406d3.f6637J;
                C1405c c1405c11 = c1406d3.f6639L;
                boolean z3 = (c1405c9 == c1405c10 && (c1405c3 = c1405c11.f6624f) != null && c1405c3.f6621c) || (c1405c9 == c1405c11 && (c1405c2 = c1405c10.f6624f) != null && c1405c2.f6621c);
                int i5 = c1406d3.f6685p0[1];
                if (i5 != 3 || m3445a2) {
                    if (!c1406d3.m3403z()) {
                        if (c1405c9 == c1405c10 && c1405c11.f6624f == null) {
                            int m3357e3 = c1405c10.m3357e() + m3356d2;
                            c1406d3.m3375K(m3357e3, c1406d3.m3390k() + m3357e3);
                            m3453i(i4, c1406d3, c1593e);
                        } else if (c1405c9 == c1405c11 && c1405c10.f6624f == null) {
                            int m3357e4 = m3356d2 - c1405c11.m3357e();
                            c1406d3.m3375K(m3357e4 - c1406d3.m3390k(), m3357e4);
                            m3453i(i4, c1406d3, c1593e);
                        } else if (z3 && !c1406d3.m3402y()) {
                            m3450f(i4, c1406d3, c1593e);
                        }
                    }
                } else if (i5 == 3 && c1406d3.f6694y >= 0 && c1406d3.f6693x >= 0) {
                    if (c1406d3.f6667g0 != 8) {
                        if (c1406d3.f6688s == 0) {
                            if (c1406d3.f6650W == 0.0f) {
                            }
                        }
                    }
                    if (!c1406d3.m3402y() && !c1406d3.f6633F && z3 && !c1406d3.m3402y()) {
                        m3451g(i4, c1406d, c1593e, c1406d3);
                    }
                }
            }
        }
        C1405c mo3388i3 = c1406d.mo3388i(6);
        if (mo3388i3.f6619a != null && mo3388i3.f6621c) {
            int m3356d3 = mo3388i3.m3356d();
            Iterator it3 = mo3388i3.f6619a.iterator();
            while (it3.hasNext()) {
                C1405c c1405c12 = (C1405c) it3.next();
                C1406d c1406d4 = c1405c12.f6622d;
                int i6 = i + 1;
                boolean m3445a3 = m3445a(c1406d4);
                if (c1406d4.m3403z() && m3445a3) {
                    C1407e.m3404V(c1406d4, c1593e, new C1441b());
                }
                if (c1406d4.f6685p0[1] != 3 || m3445a3) {
                    if (!c1406d4.m3403z() && c1405c12 == (c1405c = c1406d4.f6640M)) {
                        int m3357e5 = c1405c12.m3357e() + m3356d3;
                        if (c1406d4.f6632E) {
                            int i7 = m3357e5 - c1406d4.f6655a0;
                            int i8 = c1406d4.f6649V + i7;
                            c1406d4.f6653Z = i7;
                            c1406d4.f6637J.m3364l(i7);
                            c1406d4.f6639L.m3364l(i8);
                            c1405c.m3364l(m3357e5);
                            c1406d4.f6676l = true;
                        }
                        m3453i(i6, c1406d4, c1593e);
                    }
                }
            }
        }
        c1406d.f6680n = true;
    }
}
