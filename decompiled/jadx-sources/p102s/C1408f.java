package p102s;

/* renamed from: s.f */
/* loaded from: classes.dex */
public final class C1408f {

    /* renamed from: a */
    public int f6718a;

    /* renamed from: d */
    public C1405c f6721d;

    /* renamed from: e */
    public C1405c f6722e;

    /* renamed from: f */
    public C1405c f6723f;

    /* renamed from: g */
    public C1405c f6724g;

    /* renamed from: h */
    public int f6725h;

    /* renamed from: i */
    public int f6726i;

    /* renamed from: j */
    public int f6727j;

    /* renamed from: k */
    public int f6728k;

    /* renamed from: q */
    public int f6734q;

    /* renamed from: r */
    public final /* synthetic */ C1409g f6735r;

    /* renamed from: b */
    public C1406d f6719b = null;

    /* renamed from: c */
    public int f6720c = 0;

    /* renamed from: l */
    public int f6729l = 0;

    /* renamed from: m */
    public int f6730m = 0;

    /* renamed from: n */
    public int f6731n = 0;

    /* renamed from: o */
    public int f6732o = 0;

    /* renamed from: p */
    public int f6733p = 0;

    public C1408f(C1409g c1409g, int i, C1405c c1405c, C1405c c1405c2, C1405c c1405c3, C1405c c1405c4, int i2) {
        this.f6735r = c1409g;
        this.f6725h = 0;
        this.f6726i = 0;
        this.f6727j = 0;
        this.f6728k = 0;
        this.f6734q = 0;
        this.f6718a = i;
        this.f6721d = c1405c;
        this.f6722e = c1405c2;
        this.f6723f = c1405c3;
        this.f6724g = c1405c4;
        this.f6725h = c1409g.f6768w0;
        this.f6726i = c1409g.f6764s0;
        this.f6727j = c1409g.f6769x0;
        this.f6728k = c1409g.f6765t0;
        this.f6734q = i2;
    }

    /* renamed from: a */
    public final void m3410a(C1406d c1406d) {
        int i = this.f6718a;
        C1409g c1409g = this.f6735r;
        if (i == 0) {
            int m3418U = c1409g.m3418U(c1406d, this.f6734q);
            if (c1406d.f6685p0[0] == 3) {
                this.f6733p++;
                m3418U = 0;
            }
            this.f6729l = m3418U + (c1406d.f6667g0 != 8 ? c1409g.f6751P0 : 0) + this.f6729l;
            int m3417T = c1409g.m3417T(c1406d, this.f6734q);
            if (this.f6719b == null || this.f6720c < m3417T) {
                this.f6719b = c1406d;
                this.f6720c = m3417T;
                this.f6730m = m3417T;
            }
        } else {
            int m3418U2 = c1409g.m3418U(c1406d, this.f6734q);
            int m3417T2 = c1409g.m3417T(c1406d, this.f6734q);
            if (c1406d.f6685p0[1] == 3) {
                this.f6733p++;
                m3417T2 = 0;
            }
            this.f6730m = m3417T2 + (c1406d.f6667g0 != 8 ? c1409g.f6752Q0 : 0) + this.f6730m;
            if (this.f6719b == null || this.f6720c < m3418U2) {
                this.f6719b = c1406d;
                this.f6720c = m3418U2;
                this.f6729l = m3418U2;
            }
        }
        this.f6732o++;
    }

    /* renamed from: b */
    public final void m3411b(int i, boolean z2, boolean z3) {
        C1409g c1409g;
        int i2;
        int i3;
        int i4;
        C1406d c1406d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f6732o;
        int i10 = 0;
        while (true) {
            c1409g = this.f6735r;
            if (i10 >= i9 || (i8 = this.f6731n + i10) >= c1409g.f6763b1) {
                break;
            }
            C1406d c1406d2 = c1409g.f6762a1[i8];
            if (c1406d2 != null) {
                c1406d2.m3370D();
            }
            i10++;
        }
        if (i9 == 0 || this.f6719b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f6731n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= c1409g.f6763b1) {
                break;
            }
            C1406d c1406d3 = c1409g.f6762a1[i14];
            if (c1406d3 != null && c1406d3.f6667g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f6718a != 0) {
            C1406d c1406d4 = this.f6719b;
            c1406d4.f6671i0 = c1409g.f6739D0;
            int i15 = this.f6725h;
            if (i > 0) {
                i15 += c1409g.f6751P0;
            }
            C1405c c1405c = c1406d4.f6636I;
            C1405c c1405c2 = c1406d4.f6638K;
            if (z2) {
                c1405c2.m3353a(this.f6723f, i15);
                if (z3) {
                    c1405c.m3353a(this.f6721d, this.f6727j);
                }
                if (i > 0) {
                    this.f6723f.f6622d.f6636I.m3353a(c1405c2, 0);
                }
            } else {
                c1405c.m3353a(this.f6721d, i15);
                if (z3) {
                    c1405c2.m3353a(this.f6723f, this.f6727j);
                }
                if (i > 0) {
                    this.f6721d.f6622d.f6638K.m3353a(c1405c, 0);
                }
            }
            C1406d c1406d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f6731n + i16;
                if (i17 >= c1409g.f6763b1) {
                    return;
                }
                C1406d c1406d6 = c1409g.f6762a1[i17];
                if (c1406d6 != null) {
                    C1405c c1405c3 = c1406d6.f6637J;
                    if (i16 == 0) {
                        c1406d6.m3385f(c1405c3, this.f6722e, this.f6726i);
                        int i18 = c1409g.f6740E0;
                        float f5 = c1409g.f6746K0;
                        if (this.f6731n == 0) {
                            i4 = c1409g.f6742G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = c1409g.f6748M0;
                                c1406d6.f6673j0 = i4;
                                c1406d6.f6663e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = c1409g.f6744I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = c1409g.f6750O0;
                        }
                        c1406d6.f6673j0 = i4;
                        c1406d6.f6663e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c1406d6.m3385f(c1406d6.f6639L, this.f6724g, this.f6728k);
                    }
                    if (c1406d5 != null) {
                        int i19 = c1409g.f6752Q0;
                        C1405c c1405c4 = c1406d5.f6639L;
                        c1405c3.m3353a(c1405c4, i19);
                        if (i16 == i11) {
                            int i20 = this.f6726i;
                            if (c1405c3.m3360h()) {
                                c1405c3.f6626h = i20;
                            }
                        }
                        c1405c4.m3353a(c1405c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f6728k;
                            if (c1405c4.m3360h()) {
                                c1405c4.f6626h = i21;
                            }
                        }
                    }
                    if (c1406d6 != c1406d4) {
                        C1405c c1405c5 = c1406d6.f6638K;
                        C1405c c1405c6 = c1406d6.f6636I;
                        if (z2) {
                            int i22 = c1409g.f6753R0;
                            if (i22 == 0) {
                                c1405c5.m3353a(c1405c2, 0);
                            } else if (i22 == 1) {
                                c1405c6.m3353a(c1405c, 0);
                            } else if (i22 == 2) {
                                c1405c6.m3353a(c1405c, 0);
                                c1405c5.m3353a(c1405c2, 0);
                            }
                        } else {
                            int i23 = c1409g.f6753R0;
                            if (i23 == 0) {
                                c1405c6.m3353a(c1405c, 0);
                            } else if (i23 == 1) {
                                c1405c5.m3353a(c1405c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c1405c6.m3353a(this.f6721d, this.f6725h);
                                    c1405c5.m3353a(this.f6723f, this.f6727j);
                                } else {
                                    c1405c6.m3353a(c1405c, 0);
                                    c1405c5.m3353a(c1405c2, 0);
                                }
                            }
                            c1406d5 = c1406d6;
                        }
                    }
                    c1406d5 = c1406d6;
                }
            }
            return;
        }
        C1406d c1406d7 = this.f6719b;
        c1406d7.f6673j0 = c1409g.f6740E0;
        int i24 = this.f6726i;
        if (i > 0) {
            i24 += c1409g.f6752Q0;
        }
        C1405c c1405c7 = this.f6722e;
        C1405c c1405c8 = c1406d7.f6637J;
        c1405c8.m3353a(c1405c7, i24);
        C1405c c1405c9 = c1406d7.f6639L;
        if (z3) {
            c1405c9.m3353a(this.f6724g, this.f6728k);
        }
        if (i > 0) {
            this.f6722e.f6622d.f6639L.m3353a(c1405c8, 0);
        }
        if (c1409g.f6754S0 == 3 && !c1406d7.f6632E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f6731n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= c1409g.f6763b1) {
                    break;
                }
                c1406d = c1409g.f6762a1[i26];
                if (c1406d.f6632E) {
                    break;
                }
            }
        }
        c1406d = c1406d7;
        int i27 = 0;
        C1406d c1406d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f6731n + i28;
            if (i29 >= c1409g.f6763b1) {
                return;
            }
            C1406d c1406d9 = c1409g.f6762a1[i29];
            if (c1406d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C1405c c1405c10 = c1406d9.f6636I;
                if (i27 == 0) {
                    c1406d9.m3385f(c1405c10, this.f6721d, this.f6725h);
                }
                if (i28 == 0) {
                    int i30 = c1409g.f6739D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - c1409g.f6745J0;
                    } else {
                        i6 = i30;
                        f2 = c1409g.f6745J0;
                    }
                    if (this.f6731n == 0) {
                        int i31 = c1409g.f6741F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - c1409g.f6747L0 : c1409g.f6747L0;
                            i7 = i31;
                            c1406d9.f6671i0 = i7;
                            c1406d9.f6661d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = c1409g.f6743H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - c1409g.f6749N0 : c1409g.f6749N0;
                    }
                    c1406d9.f6671i0 = i7;
                    c1406d9.f6661d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c1406d9.m3385f(c1406d9.f6638K, this.f6723f, this.f6727j);
                } else {
                    i5 = i9;
                }
                if (c1406d8 != null) {
                    int i32 = c1409g.f6751P0;
                    C1405c c1405c11 = c1406d8.f6638K;
                    c1405c10.m3353a(c1405c11, i32);
                    if (i27 == i11) {
                        int i33 = this.f6725h;
                        if (c1405c10.m3360h()) {
                            c1405c10.f6626h = i33;
                        }
                    }
                    c1405c11.m3353a(c1405c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f6727j;
                        if (c1405c11.m3360h()) {
                            c1405c11.f6626h = i34;
                        }
                    }
                }
                if (c1406d9 != c1406d7) {
                    int i35 = c1409g.f6754S0;
                    c2 = 3;
                    if (i35 == 3 && c1406d.f6632E && c1406d9 != c1406d && c1406d9.f6632E) {
                        c1406d9.f6640M.m3353a(c1406d.f6640M, 0);
                    } else {
                        C1405c c1405c12 = c1406d9.f6637J;
                        if (i35 != 0) {
                            C1405c c1405c13 = c1406d9.f6639L;
                            if (i35 == 1) {
                                c1405c13.m3353a(c1405c9, 0);
                            } else if (z4) {
                                c1405c12.m3353a(this.f6722e, this.f6726i);
                                c1405c13.m3353a(this.f6724g, this.f6728k);
                            } else {
                                c1405c12.m3353a(c1405c8, 0);
                                c1405c13.m3353a(c1405c9, 0);
                            }
                        } else {
                            c1405c12.m3353a(c1405c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c1406d8 = c1406d9;
            }
            i27++;
            i9 = i5;
        }
    }

    /* renamed from: c */
    public final int m3412c() {
        return this.f6718a == 1 ? this.f6730m - this.f6735r.f6752Q0 : this.f6730m;
    }

    /* renamed from: d */
    public final int m3413d() {
        return this.f6718a == 0 ? this.f6729l - this.f6735r.f6751P0 : this.f6729l;
    }

    /* renamed from: e */
    public final void m3414e(int i) {
        C1409g c1409g;
        int i2;
        int i3 = this.f6733p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f6732o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c1409g = this.f6735r;
            if (i6 >= i4 || (i2 = this.f6731n + i6) >= c1409g.f6763b1) {
                break;
            }
            C1406d c1406d = c1409g.f6762a1[i2];
            if (this.f6718a == 0) {
                if (c1406d != null) {
                    int[] iArr = c1406d.f6685p0;
                    if (iArr[0] == 3 && c1406d.f6687r == 0) {
                        c1409g.m3419V(1, i5, iArr[1], c1406d.m3390k(), c1406d);
                    }
                }
            } else if (c1406d != null) {
                int[] iArr2 = c1406d.f6685p0;
                if (iArr2[1] == 3 && c1406d.f6688s == 0) {
                    c1409g.m3419V(iArr2[0], c1406d.m3394q(), 1, i5, c1406d);
                }
            }
            i6++;
        }
        this.f6729l = 0;
        this.f6730m = 0;
        this.f6719b = null;
        this.f6720c = 0;
        int i7 = this.f6732o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f6731n + i8;
            if (i9 >= c1409g.f6763b1) {
                return;
            }
            C1406d c1406d2 = c1409g.f6762a1[i9];
            if (this.f6718a == 0) {
                int m3394q = c1406d2.m3394q();
                int i10 = c1409g.f6751P0;
                if (c1406d2.f6667g0 == 8) {
                    i10 = 0;
                }
                this.f6729l = m3394q + i10 + this.f6729l;
                int m3417T = c1409g.m3417T(c1406d2, this.f6734q);
                if (this.f6719b == null || this.f6720c < m3417T) {
                    this.f6719b = c1406d2;
                    this.f6720c = m3417T;
                    this.f6730m = m3417T;
                }
            } else {
                int m3418U = c1409g.m3418U(c1406d2, this.f6734q);
                int m3417T2 = c1409g.m3417T(c1406d2, this.f6734q);
                int i11 = c1409g.f6752Q0;
                if (c1406d2.f6667g0 == 8) {
                    i11 = 0;
                }
                this.f6730m = m3417T2 + i11 + this.f6730m;
                if (this.f6719b == null || this.f6720c < m3418U) {
                    this.f6719b = c1406d2;
                    this.f6720c = m3418U;
                    this.f6729l = m3418U;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m3415f(int i, C1405c c1405c, C1405c c1405c2, C1405c c1405c3, C1405c c1405c4, int i2, int i3, int i4, int i5, int i6) {
        this.f6718a = i;
        this.f6721d = c1405c;
        this.f6722e = c1405c2;
        this.f6723f = c1405c3;
        this.f6724g = c1405c4;
        this.f6725h = i2;
        this.f6726i = i3;
        this.f6727j = i4;
        this.f6728k = i5;
        this.f6734q = i6;
    }
}
