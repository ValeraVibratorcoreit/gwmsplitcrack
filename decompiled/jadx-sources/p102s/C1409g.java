package p102s;

import java.util.ArrayList;
import p097q.C1239c;
import p105t.C1441b;
import p111v.C1593e;

/* renamed from: s.g */
/* loaded from: classes.dex */
public final class C1409g extends AbstractC1411i {

    /* renamed from: A0 */
    public int f6736A0;

    /* renamed from: B0 */
    public C1441b f6737B0;

    /* renamed from: C0 */
    public C1593e f6738C0;

    /* renamed from: D0 */
    public int f6739D0;

    /* renamed from: E0 */
    public int f6740E0;

    /* renamed from: F0 */
    public int f6741F0;

    /* renamed from: G0 */
    public int f6742G0;

    /* renamed from: H0 */
    public int f6743H0;

    /* renamed from: I0 */
    public int f6744I0;

    /* renamed from: J0 */
    public float f6745J0;

    /* renamed from: K0 */
    public float f6746K0;

    /* renamed from: L0 */
    public float f6747L0;

    /* renamed from: M0 */
    public float f6748M0;

    /* renamed from: N0 */
    public float f6749N0;

    /* renamed from: O0 */
    public float f6750O0;

    /* renamed from: P0 */
    public int f6751P0;

    /* renamed from: Q0 */
    public int f6752Q0;

    /* renamed from: R0 */
    public int f6753R0;

    /* renamed from: S0 */
    public int f6754S0;

    /* renamed from: T0 */
    public int f6755T0;

    /* renamed from: U0 */
    public int f6756U0;

    /* renamed from: V0 */
    public int f6757V0;

    /* renamed from: W0 */
    public ArrayList f6758W0;

    /* renamed from: X0 */
    public C1406d[] f6759X0;

    /* renamed from: Y0 */
    public C1406d[] f6760Y0;

    /* renamed from: Z0 */
    public int[] f6761Z0;

    /* renamed from: a1 */
    public C1406d[] f6762a1;

    /* renamed from: b1 */
    public int f6763b1;

    /* renamed from: s0 */
    public int f6764s0;

    /* renamed from: t0 */
    public int f6765t0;

    /* renamed from: u0 */
    public int f6766u0;

    /* renamed from: v0 */
    public int f6767v0;

    /* renamed from: w0 */
    public int f6768w0;

    /* renamed from: x0 */
    public int f6769x0;

    /* renamed from: y0 */
    public boolean f6770y0;

    /* renamed from: z0 */
    public int f6771z0;

    @Override // p102s.AbstractC1411i
    /* renamed from: S */
    public final void mo3416S() {
        for (int i = 0; i < this.f6779r0; i++) {
            C1406d c1406d = this.f6778q0[i];
            if (c1406d != null) {
                c1406d.f6633F = true;
            }
        }
    }

    /* renamed from: T */
    public final int m3417T(C1406d c1406d, int i) {
        if (c1406d == null) {
            return 0;
        }
        int[] iArr = c1406d.f6685p0;
        if (iArr[1] == 3) {
            int i2 = c1406d.f6688s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c1406d.f6695z * i);
                if (i3 != c1406d.m3390k()) {
                    c1406d.f6666g = true;
                    m3419V(iArr[0], c1406d.m3394q(), 1, i3, c1406d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c1406d.m3390k();
            }
            if (i2 == 3) {
                return (int) ((c1406d.m3394q() * c1406d.f6650W) + 0.5f);
            }
        }
        return c1406d.m3390k();
    }

    /* renamed from: U */
    public final int m3418U(C1406d c1406d, int i) {
        if (c1406d == null) {
            return 0;
        }
        int[] iArr = c1406d.f6685p0;
        if (iArr[0] == 3) {
            int i2 = c1406d.f6687r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c1406d.f6692w * i);
                if (i3 != c1406d.m3394q()) {
                    c1406d.f6666g = true;
                    m3419V(1, i3, iArr[1], c1406d.m3390k(), c1406d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c1406d.m3394q();
            }
            if (i2 == 3) {
                return (int) ((c1406d.m3390k() * c1406d.f6650W) + 0.5f);
            }
        }
        return c1406d.m3394q();
    }

    /* renamed from: V */
    public final void m3419V(int i, int i2, int i3, int i4, C1406d c1406d) {
        C1593e c1593e;
        C1406d c1406d2;
        while (true) {
            c1593e = this.f6738C0;
            if (c1593e != null || (c1406d2 = this.f6647T) == null) {
                break;
            } else {
                this.f6738C0 = ((C1407e) c1406d2).f6712u0;
            }
        }
        C1441b c1441b = this.f6737B0;
        c1441b.f6796a = i;
        c1441b.f6797b = i3;
        c1441b.f6798c = i2;
        c1441b.f6799d = i4;
        c1593e.m4750b(c1406d, c1441b);
        c1406d.m3379O(c1441b.f6800e);
        c1406d.m3376L(c1441b.f6801f);
        c1406d.f6632E = c1441b.f6803h;
        c1406d.m3373I(c1441b.f6802g);
    }

    @Override // p102s.C1406d
    /* renamed from: b */
    public final void mo3351b(C1239c c1239c, boolean z2) {
        C1406d c1406d;
        float f2;
        int i;
        super.mo3351b(c1239c, z2);
        C1406d c1406d2 = this.f6647T;
        boolean z3 = c1406d2 != null && ((C1407e) c1406d2).f6713v0;
        int i2 = this.f6755T0;
        ArrayList arrayList = this.f6758W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((C1408f) arrayList.get(i3)).m3411b(i3, z3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((C1408f) arrayList.get(i4)).m3411b(i4, z3, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f6761Z0 != null && this.f6760Y0 != null && this.f6759X0 != null) {
                for (int i5 = 0; i5 < this.f6763b1; i5++) {
                    this.f6762a1[i5].m3370D();
                }
                int[] iArr = this.f6761Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f6745J0;
                C1406d c1406d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f6745J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C1406d c1406d4 = this.f6760Y0[i];
                    if (c1406d4 != null && c1406d4.f6667g0 != 8) {
                        C1405c c1405c = c1406d4.f6636I;
                        if (i8 == 0) {
                            c1406d4.m3385f(c1405c, this.f6636I, this.f6768w0);
                            c1406d4.f6671i0 = this.f6739D0;
                            c1406d4.f6661d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c1406d4.m3385f(c1406d4.f6638K, this.f6638K, this.f6769x0);
                        }
                        if (i8 > 0 && c1406d3 != null) {
                            int i9 = this.f6751P0;
                            C1405c c1405c2 = c1406d3.f6638K;
                            c1406d4.m3385f(c1405c, c1405c2, i9);
                            c1406d3.m3385f(c1405c2, c1405c, 0);
                        }
                        c1406d3 = c1406d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C1406d c1406d5 = this.f6759X0[i10];
                    if (c1406d5 != null && c1406d5.f6667g0 != 8) {
                        C1405c c1405c3 = c1406d5.f6637J;
                        if (i10 == 0) {
                            c1406d5.m3385f(c1405c3, this.f6637J, this.f6764s0);
                            c1406d5.f6673j0 = this.f6740E0;
                            c1406d5.f6663e0 = this.f6746K0;
                        }
                        if (i10 == i7 - 1) {
                            c1406d5.m3385f(c1406d5.f6639L, this.f6639L, this.f6765t0);
                        }
                        if (i10 > 0 && c1406d3 != null) {
                            int i11 = this.f6752Q0;
                            C1405c c1405c4 = c1406d3.f6639L;
                            c1406d5.m3385f(c1405c3, c1405c4, i11);
                            c1406d3.m3385f(c1405c4, c1405c3, 0);
                        }
                        c1406d3 = c1406d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f6757V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C1406d[] c1406dArr = this.f6762a1;
                        if (i14 < c1406dArr.length && (c1406d = c1406dArr[i14]) != null && c1406d.f6667g0 != 8) {
                            C1406d c1406d6 = this.f6760Y0[i12];
                            C1406d c1406d7 = this.f6759X0[i13];
                            if (c1406d != c1406d6) {
                                c1406d.m3385f(c1406d.f6636I, c1406d6.f6636I, 0);
                                c1406d.m3385f(c1406d.f6638K, c1406d6.f6638K, 0);
                            }
                            if (c1406d != c1406d7) {
                                c1406d.m3385f(c1406d.f6637J, c1406d7.f6637J, 0);
                                c1406d.m3385f(c1406d.f6639L, c1406d7.f6639L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1408f) arrayList.get(0)).m3411b(0, z3, true);
        }
        this.f6770y0 = false;
    }
}
