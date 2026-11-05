package p102s;

import java.util.ArrayList;
import p097q.AbstractC1241e;
import p097q.C1238b;
import p097q.C1239c;
import p097q.C1242f;

/* renamed from: s.h */
/* loaded from: classes.dex */
public final class C1410h extends C1406d {

    /* renamed from: q0 */
    public float f6772q0 = -1.0f;

    /* renamed from: r0 */
    public int f6773r0 = -1;

    /* renamed from: s0 */
    public int f6774s0 = -1;

    /* renamed from: t0 */
    public C1405c f6775t0 = this.f6637J;

    /* renamed from: u0 */
    public int f6776u0 = 0;

    /* renamed from: v0 */
    public boolean f6777v0;

    public C1410h() {
        this.f6645R.clear();
        this.f6645R.add(this.f6775t0);
        int length = this.f6644Q.length;
        for (int i = 0; i < length; i++) {
            this.f6644Q[i] = this.f6775t0;
        }
    }

    @Override // p102s.C1406d
    /* renamed from: A */
    public final boolean mo3347A() {
        return this.f6777v0;
    }

    @Override // p102s.C1406d
    /* renamed from: B */
    public final boolean mo3348B() {
        return this.f6777v0;
    }

    @Override // p102s.C1406d
    /* renamed from: Q */
    public final void mo3381Q(C1239c c1239c, boolean z2) {
        if (this.f6647T == null) {
            return;
        }
        C1405c c1405c = this.f6775t0;
        c1239c.getClass();
        int m2920n = C1239c.m2920n(c1405c);
        if (this.f6776u0 == 1) {
            this.f6652Y = m2920n;
            this.f6653Z = 0;
            m3376L(this.f6647T.m3390k());
            m3379O(0);
            return;
        }
        this.f6652Y = 0;
        this.f6653Z = m2920n;
        m3379O(this.f6647T.m3394q());
        m3376L(0);
    }

    /* renamed from: R */
    public final void m3420R(int i) {
        this.f6775t0.m3364l(i);
        this.f6777v0 = true;
    }

    /* renamed from: S */
    public final void m3421S(int i) {
        if (this.f6776u0 == i) {
            return;
        }
        this.f6776u0 = i;
        ArrayList arrayList = this.f6645R;
        arrayList.clear();
        if (this.f6776u0 == 1) {
            this.f6775t0 = this.f6636I;
        } else {
            this.f6775t0 = this.f6637J;
        }
        arrayList.add(this.f6775t0);
        C1405c[] c1405cArr = this.f6644Q;
        int length = c1405cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c1405cArr[i2] = this.f6775t0;
        }
    }

    @Override // p102s.C1406d
    /* renamed from: b */
    public final void mo3351b(C1239c c1239c, boolean z2) {
        C1407e c1407e = (C1407e) this.f6647T;
        if (c1407e == null) {
            return;
        }
        Object mo3388i = c1407e.mo3388i(2);
        Object mo3388i2 = c1407e.mo3388i(4);
        C1406d c1406d = this.f6647T;
        boolean z3 = c1406d != null && c1406d.f6685p0[0] == 2;
        if (this.f6776u0 == 0) {
            mo3388i = c1407e.mo3388i(3);
            mo3388i2 = c1407e.mo3388i(5);
            C1406d c1406d2 = this.f6647T;
            z3 = c1406d2 != null && c1406d2.f6685p0[1] == 2;
        }
        if (this.f6777v0) {
            C1405c c1405c = this.f6775t0;
            if (c1405c.f6621c) {
                C1242f m2931k = c1239c.m2931k(c1405c);
                c1239c.m2924d(m2931k, this.f6775t0.m3356d());
                if (this.f6773r0 != -1) {
                    if (z3) {
                        c1239c.m2926f(c1239c.m2931k(mo3388i2), m2931k, 0, 5);
                    }
                } else if (this.f6774s0 != -1 && z3) {
                    C1242f m2931k2 = c1239c.m2931k(mo3388i2);
                    c1239c.m2926f(m2931k, c1239c.m2931k(mo3388i), 0, 5);
                    c1239c.m2926f(m2931k2, m2931k, 0, 5);
                }
                this.f6777v0 = false;
                return;
            }
        }
        if (this.f6773r0 != -1) {
            C1242f m2931k3 = c1239c.m2931k(this.f6775t0);
            c1239c.m2925e(m2931k3, c1239c.m2931k(mo3388i), this.f6773r0, 8);
            if (z3) {
                c1239c.m2926f(c1239c.m2931k(mo3388i2), m2931k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f6774s0 != -1) {
            C1242f m2931k4 = c1239c.m2931k(this.f6775t0);
            C1242f m2931k5 = c1239c.m2931k(mo3388i2);
            c1239c.m2925e(m2931k4, m2931k5, -this.f6774s0, 8);
            if (z3) {
                c1239c.m2926f(m2931k4, c1239c.m2931k(mo3388i), 0, 5);
                c1239c.m2926f(m2931k5, m2931k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f6772q0 != -1.0f) {
            C1242f m2931k6 = c1239c.m2931k(this.f6775t0);
            C1242f m2931k7 = c1239c.m2931k(mo3388i2);
            float f2 = this.f6772q0;
            C1238b m2932l = c1239c.m2932l();
            m2932l.f5506d.m2909g(m2931k6, -1.0f);
            m2932l.f5506d.m2909g(m2931k7, f2);
            c1239c.m2923c(m2932l);
        }
    }

    @Override // p102s.C1406d
    /* renamed from: c */
    public final boolean mo3352c() {
        return true;
    }

    @Override // p102s.C1406d
    /* renamed from: i */
    public final C1405c mo3388i(int i) {
        int m2943b = AbstractC1241e.m2943b(i);
        if (m2943b != 1) {
            if (m2943b != 2) {
                if (m2943b != 3) {
                    if (m2943b != 4) {
                        return null;
                    }
                }
            }
            if (this.f6776u0 == 0) {
                return this.f6775t0;
            }
            return null;
        }
        if (this.f6776u0 == 1) {
            return this.f6775t0;
        }
        return null;
    }
}
