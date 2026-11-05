package p102s;

import p006C.AbstractC0062j;
import p097q.AbstractC1241e;
import p097q.C1238b;
import p097q.C1239c;
import p097q.C1242f;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C1403a extends AbstractC1411i {

    /* renamed from: s0 */
    public int f6598s0;

    /* renamed from: t0 */
    public boolean f6599t0;

    /* renamed from: u0 */
    public int f6600u0;

    /* renamed from: v0 */
    public boolean f6601v0;

    @Override // p102s.C1406d
    /* renamed from: A */
    public final boolean mo3347A() {
        return this.f6601v0;
    }

    @Override // p102s.C1406d
    /* renamed from: B */
    public final boolean mo3348B() {
        return this.f6601v0;
    }

    /* renamed from: T */
    public final boolean m3349T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f6779r0;
            if (i4 >= i) {
                break;
            }
            C1406d c1406d = this.f6778q0[i4];
            if ((this.f6599t0 || c1406d.mo3352c()) && ((((i2 = this.f6598s0) == 0 || i2 == 1) && !c1406d.mo3347A()) || (((i3 = this.f6598s0) == 2 || i3 == 3) && !c1406d.mo3348B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f6779r0; i6++) {
            C1406d c1406d2 = this.f6778q0[i6];
            if (this.f6599t0 || c1406d2.mo3352c()) {
                if (!z3) {
                    int i7 = this.f6598s0;
                    if (i7 == 0) {
                        i5 = c1406d2.mo3388i(2).m3356d();
                    } else if (i7 == 1) {
                        i5 = c1406d2.mo3388i(4).m3356d();
                    } else if (i7 == 2) {
                        i5 = c1406d2.mo3388i(3).m3356d();
                    } else if (i7 == 3) {
                        i5 = c1406d2.mo3388i(5).m3356d();
                    }
                    z3 = true;
                }
                int i8 = this.f6598s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c1406d2.mo3388i(2).m3356d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c1406d2.mo3388i(4).m3356d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c1406d2.mo3388i(3).m3356d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c1406d2.mo3388i(5).m3356d());
                }
            }
        }
        int i9 = i5 + this.f6600u0;
        int i10 = this.f6598s0;
        if (i10 == 0 || i10 == 1) {
            m3374J(i9, i9);
        } else {
            m3375K(i9, i9);
        }
        this.f6601v0 = true;
        return true;
    }

    /* renamed from: U */
    public final int m3350U() {
        int i = this.f6598s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p102s.C1406d
    /* renamed from: b */
    public final void mo3351b(C1239c c1239c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C1405c[] c1405cArr = this.f6644Q;
        C1405c c1405c = this.f6636I;
        c1405cArr[0] = c1405c;
        C1405c c1405c2 = this.f6637J;
        int i3 = 2;
        c1405cArr[2] = c1405c2;
        C1405c c1405c3 = this.f6638K;
        c1405cArr[1] = c1405c3;
        C1405c c1405c4 = this.f6639L;
        c1405cArr[3] = c1405c4;
        for (C1405c c1405c5 : c1405cArr) {
            c1405c5.f6627i = c1239c.m2931k(c1405c5);
        }
        int i4 = this.f6598s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C1405c c1405c6 = c1405cArr[i4];
        if (!this.f6601v0) {
            m3349T();
        }
        if (this.f6601v0) {
            this.f6601v0 = false;
            int i5 = this.f6598s0;
            if (i5 == 0 || i5 == 1) {
                c1239c.m2924d(c1405c.f6627i, this.f6652Y);
                c1239c.m2924d(c1405c3.f6627i, this.f6652Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c1239c.m2924d(c1405c2.f6627i, this.f6653Z);
                    c1239c.m2924d(c1405c4.f6627i, this.f6653Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f6779r0; i6++) {
            C1406d c1406d = this.f6778q0[i6];
            if ((this.f6599t0 || c1406d.mo3352c()) && ((((i2 = this.f6598s0) == 0 || i2 == 1) && c1406d.f6685p0[0] == 3 && c1406d.f6636I.f6624f != null && c1406d.f6638K.f6624f != null) || ((i2 == 2 || i2 == 3) && c1406d.f6685p0[1] == 3 && c1406d.f6637J.f6624f != null && c1406d.f6639L.f6624f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c1405c.m3359g() || c1405c3.m3359g();
        boolean z5 = c1405c2.m3359g() || c1405c4.m3359g();
        int i7 = (z3 || !(((i = this.f6598s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f6779r0) {
            C1406d c1406d2 = this.f6778q0[i8];
            if (this.f6599t0 || c1406d2.mo3352c()) {
                C1242f m2931k = c1239c.m2931k(c1406d2.f6644Q[this.f6598s0]);
                int i9 = this.f6598s0;
                C1405c c1405c7 = c1406d2.f6644Q[i9];
                c1405c7.f6627i = m2931k;
                C1405c c1405c8 = c1405c7.f6624f;
                int i10 = (c1405c8 == null || c1405c8.f6622d != this) ? 0 : c1405c7.f6625g;
                if (i9 == 0 || i9 == i3) {
                    C1242f c1242f = c1405c6.f6627i;
                    int i11 = this.f6600u0 - i10;
                    C1238b m2932l = c1239c.m2932l();
                    C1242f m2933m = c1239c.m2933m();
                    m2933m.f5533d = 0;
                    m2932l.m2913c(c1242f, m2931k, m2933m, i11);
                    c1239c.m2923c(m2932l);
                } else {
                    C1242f c1242f2 = c1405c6.f6627i;
                    int i12 = this.f6600u0 + i10;
                    C1238b m2932l2 = c1239c.m2932l();
                    C1242f m2933m2 = c1239c.m2933m();
                    m2933m2.f5533d = 0;
                    m2932l2.m2912b(c1242f2, m2931k, m2933m2, i12);
                    c1239c.m2923c(m2932l2);
                }
                c1239c.m2925e(c1405c6.f6627i, m2931k, this.f6600u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f6598s0;
        if (i13 == 0) {
            c1239c.m2925e(c1405c3.f6627i, c1405c.f6627i, 0, 8);
            c1239c.m2925e(c1405c.f6627i, this.f6647T.f6638K.f6627i, 0, 4);
            c1239c.m2925e(c1405c.f6627i, this.f6647T.f6636I.f6627i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c1239c.m2925e(c1405c.f6627i, c1405c3.f6627i, 0, 8);
            c1239c.m2925e(c1405c.f6627i, this.f6647T.f6636I.f6627i, 0, 4);
            c1239c.m2925e(c1405c.f6627i, this.f6647T.f6638K.f6627i, 0, 0);
        } else if (i13 == 2) {
            c1239c.m2925e(c1405c4.f6627i, c1405c2.f6627i, 0, 8);
            c1239c.m2925e(c1405c2.f6627i, this.f6647T.f6639L.f6627i, 0, 4);
            c1239c.m2925e(c1405c2.f6627i, this.f6647T.f6637J.f6627i, 0, 0);
        } else if (i13 == 3) {
            c1239c.m2925e(c1405c2.f6627i, c1405c4.f6627i, 0, 8);
            c1239c.m2925e(c1405c2.f6627i, this.f6647T.f6637J.f6627i, 0, 4);
            c1239c.m2925e(c1405c2.f6627i, this.f6647T.f6639L.f6627i, 0, 0);
        }
    }

    @Override // p102s.C1406d
    /* renamed from: c */
    public final boolean mo3352c() {
        return true;
    }

    @Override // p102s.C1406d
    public final String toString() {
        String m162p = AbstractC0062j.m162p(new StringBuilder("[Barrier] "), this.f6669h0, " {");
        for (int i = 0; i < this.f6779r0; i++) {
            C1406d c1406d = this.f6778q0[i];
            if (i > 0) {
                m162p = AbstractC0062j.m160n(m162p, ", ");
            }
            StringBuilder m2942a = AbstractC1241e.m2942a(m162p);
            m2942a.append(c1406d.f6669h0);
            m162p = m2942a.toString();
        }
        return AbstractC0062j.m160n(m162p, "}");
    }
}
