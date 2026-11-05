package p105t;

import p097q.AbstractC1241e;
import p102s.C1405c;
import p102s.C1406d;

/* renamed from: t.o */
/* loaded from: classes.dex */
public abstract class AbstractC1454o implements InterfaceC1443d {

    /* renamed from: a */
    public int f6841a;

    /* renamed from: b */
    public C1406d f6842b;

    /* renamed from: c */
    public C1451l f6843c;

    /* renamed from: d */
    public int f6844d;

    /* renamed from: e */
    public final C1446g f6845e = new C1446g(this);

    /* renamed from: f */
    public int f6846f = 0;

    /* renamed from: g */
    public boolean f6847g = false;

    /* renamed from: h */
    public final C1445f f6848h = new C1445f(this);

    /* renamed from: i */
    public final C1445f f6849i = new C1445f(this);

    /* renamed from: j */
    public int f6850j = 1;

    public AbstractC1454o(C1406d c1406d) {
        this.f6842b = c1406d;
    }

    /* renamed from: b */
    public static void m3464b(C1445f c1445f, C1445f c1445f2, int i) {
        c1445f.f6827l.add(c1445f2);
        c1445f.f6821f = i;
        c1445f2.f6826k.add(c1445f);
    }

    /* renamed from: h */
    public static C1445f m3465h(C1405c c1405c) {
        C1405c c1405c2 = c1405c.f6624f;
        if (c1405c2 == null) {
            return null;
        }
        int m2943b = AbstractC1241e.m2943b(c1405c2.f6623e);
        C1406d c1406d = c1405c2.f6622d;
        if (m2943b == 1) {
            return c1406d.f6660d.f6848h;
        }
        if (m2943b == 2) {
            return c1406d.f6662e.f6848h;
        }
        if (m2943b == 3) {
            return c1406d.f6660d.f6849i;
        }
        if (m2943b == 4) {
            return c1406d.f6662e.f6849i;
        }
        if (m2943b != 5) {
            return null;
        }
        return c1406d.f6662e.f6833k;
    }

    /* renamed from: i */
    public static C1445f m3466i(C1405c c1405c, int i) {
        C1405c c1405c2 = c1405c.f6624f;
        if (c1405c2 == null) {
            return null;
        }
        C1406d c1406d = c1405c2.f6622d;
        AbstractC1454o abstractC1454o = i == 0 ? c1406d.f6660d : c1406d.f6662e;
        int m2943b = AbstractC1241e.m2943b(c1405c2.f6623e);
        if (m2943b == 1 || m2943b == 2) {
            return abstractC1454o.f6848h;
        }
        if (m2943b == 3 || m2943b == 4) {
            return abstractC1454o.f6849i;
        }
        return null;
    }

    /* renamed from: c */
    public final void m3467c(C1445f c1445f, C1445f c1445f2, int i, C1446g c1446g) {
        c1445f.f6827l.add(c1445f2);
        c1445f.f6827l.add(this.f6845e);
        c1445f.f6823h = i;
        c1445f.f6824i = c1446g;
        c1445f2.f6826k.add(c1445f);
        c1446g.f6826k.add(c1445f);
    }

    /* renamed from: d */
    public abstract void mo3428d();

    /* renamed from: e */
    public abstract void mo3429e();

    /* renamed from: f */
    public abstract void mo3430f();

    /* renamed from: g */
    public final int m3468g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C1406d c1406d = this.f6842b;
            int i3 = c1406d.f6691v;
            max = Math.max(c1406d.f6690u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C1406d c1406d2 = this.f6842b;
            int i4 = c1406d2.f6694y;
            max = Math.max(c1406d2.f6693x, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* renamed from: j */
    public long mo3431j() {
        if (this.f6845e.f6825j) {
            return r0.f6822g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo3432k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f6841a == 3) goto L50;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3469l(C1405c c1405c, C1405c c1405c2, int i) {
        C1445f m3465h = m3465h(c1405c);
        C1445f m3465h2 = m3465h(c1405c2);
        if (m3465h.f6825j && m3465h2.f6825j) {
            int m3357e = c1405c.m3357e() + m3465h.f6822g;
            int m3357e2 = m3465h2.f6822g - c1405c2.m3357e();
            int i2 = m3357e2 - m3357e;
            C1446g c1446g = this.f6845e;
            if (!c1446g.f6825j && this.f6844d == 3) {
                int i3 = this.f6841a;
                if (i3 == 0) {
                    c1446g.mo3444d(m3468g(i2, i));
                } else if (i3 == 1) {
                    c1446g.mo3444d(Math.min(m3468g(c1446g.f6828m, i), i2));
                } else if (i3 == 2) {
                    C1406d c1406d = this.f6842b;
                    C1406d c1406d2 = c1406d.f6647T;
                    if (c1406d2 != null) {
                        if ((i == 0 ? c1406d2.f6660d : c1406d2.f6662e).f6845e.f6825j) {
                            c1446g.mo3444d(m3468g((int) ((r6.f6822g * (i == 0 ? c1406d.f6692w : c1406d.f6695z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C1406d c1406d3 = this.f6842b;
                    AbstractC1454o abstractC1454o = c1406d3.f6660d;
                    if (abstractC1454o.f6844d == 3 && abstractC1454o.f6841a == 3) {
                        C1452m c1452m = c1406d3.f6662e;
                        if (c1452m.f6844d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC1454o = c1406d3.f6662e;
                    }
                    if (abstractC1454o.f6845e.f6825j) {
                        float f2 = c1406d3.f6650W;
                        c1446g.mo3444d(i == 1 ? (int) ((r6.f6822g / f2) + 0.5f) : (int) ((f2 * r6.f6822g) + 0.5f));
                    }
                }
            }
            if (c1446g.f6825j) {
                int i4 = c1446g.f6822g;
                C1445f c1445f = this.f6849i;
                C1445f c1445f2 = this.f6848h;
                if (i4 == i2) {
                    c1445f2.mo3444d(m3357e);
                    c1445f.mo3444d(m3357e2);
                    return;
                }
                C1406d c1406d4 = this.f6842b;
                float f3 = i == 0 ? c1406d4.f6661d0 : c1406d4.f6663e0;
                if (m3465h == m3465h2) {
                    m3357e = m3465h.f6822g;
                    m3357e2 = m3465h2.f6822g;
                    f3 = 0.5f;
                }
                c1445f2.mo3444d((int) ((((m3357e2 - m3357e) - i4) * f3) + m3357e + 0.5f));
                c1445f.mo3444d(c1445f2.f6822g + c1446g.f6822g);
            }
        }
    }
}
