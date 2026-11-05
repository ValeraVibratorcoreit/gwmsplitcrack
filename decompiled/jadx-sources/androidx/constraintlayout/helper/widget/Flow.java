package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import p102s.C1405c;
import p102s.C1406d;
import p102s.C1407e;
import p102s.C1408f;
import p102s.C1409g;
import p102s.C1410h;
import p105t.C1441b;
import p111v.AbstractC1605q;
import p111v.AbstractC1607s;
import p111v.C1593e;

/* loaded from: classes.dex */
public class Flow extends AbstractC1607s {

    /* renamed from: o */
    public C1409g f1852o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p111v.AbstractC1607s, p111v.AbstractC1590b
    /* renamed from: g */
    public final void mo1308g(AttributeSet attributeSet) {
        super.mo1308g(attributeSet);
        C1409g c1409g = new C1409g();
        c1409g.f6764s0 = 0;
        c1409g.f6765t0 = 0;
        c1409g.f6766u0 = 0;
        c1409g.f6767v0 = 0;
        c1409g.f6768w0 = 0;
        c1409g.f6769x0 = 0;
        c1409g.f6770y0 = false;
        c1409g.f6771z0 = 0;
        c1409g.f6736A0 = 0;
        c1409g.f6737B0 = new C1441b();
        c1409g.f6738C0 = null;
        c1409g.f6739D0 = -1;
        c1409g.f6740E0 = -1;
        c1409g.f6741F0 = -1;
        c1409g.f6742G0 = -1;
        c1409g.f6743H0 = -1;
        c1409g.f6744I0 = -1;
        c1409g.f6745J0 = 0.5f;
        c1409g.f6746K0 = 0.5f;
        c1409g.f6747L0 = 0.5f;
        c1409g.f6748M0 = 0.5f;
        c1409g.f6749N0 = 0.5f;
        c1409g.f6750O0 = 0.5f;
        c1409g.f6751P0 = 0;
        c1409g.f6752Q0 = 0;
        c1409g.f6753R0 = 2;
        c1409g.f6754S0 = 2;
        c1409g.f6755T0 = 0;
        c1409g.f6756U0 = -1;
        c1409g.f6757V0 = 0;
        c1409g.f6758W0 = new ArrayList();
        c1409g.f6759X0 = null;
        c1409g.f6760Y0 = null;
        c1409g.f6761Z0 = null;
        c1409g.f6763b1 = 0;
        this.f1852o = c1409g;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1605q.f9209b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1852o.f6757V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1409g c1409g2 = this.f1852o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1409g2.f6764s0 = dimensionPixelSize;
                    c1409g2.f6765t0 = dimensionPixelSize;
                    c1409g2.f6766u0 = dimensionPixelSize;
                    c1409g2.f6767v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C1409g c1409g3 = this.f1852o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1409g3.f6766u0 = dimensionPixelSize2;
                    c1409g3.f6768w0 = dimensionPixelSize2;
                    c1409g3.f6769x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1852o.f6767v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1852o.f6768w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1852o.f6764s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1852o.f6769x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1852o.f6765t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1852o.f6755T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1852o.f6739D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1852o.f6740E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1852o.f6741F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1852o.f6743H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1852o.f6742G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1852o.f6744I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1852o.f6745J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1852o.f6747L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1852o.f6749N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1852o.f6748M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1852o.f6750O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1852o.f6746K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1852o.f6753R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1852o.f6754S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1852o.f6751P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1852o.f6752Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1852o.f6756U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8999i = this.f1852o;
        m4747i();
    }

    @Override // p111v.AbstractC1590b
    /* renamed from: h */
    public final void mo1309h(C1406d c1406d, boolean z2) {
        C1409g c1409g = this.f1852o;
        int i = c1409g.f6766u0;
        if (i > 0 || c1409g.f6767v0 > 0) {
            if (z2) {
                c1409g.f6768w0 = c1409g.f6767v0;
                c1409g.f6769x0 = i;
            } else {
                c1409g.f6768w0 = i;
                c1409g.f6769x0 = c1409g.f6767v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x07b2  */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p111v.AbstractC1607s
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1310j(C1409g c1409g, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        C1408f c1408f;
        char c2;
        ?? r2;
        int i12;
        int i13;
        int i14;
        int[] iArr2;
        int i15;
        int i16;
        C1406d[] c1406dArr;
        int i17;
        int i18;
        ArrayList arrayList;
        int[] iArr3;
        C1406d c1406d;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj;
        C1406d c1406d2;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList2;
        int i26;
        int i27;
        int i28;
        C1406d c1406d3;
        int i29;
        int i30;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c1409g == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (c1409g.f6779r0 > 0) {
            C1406d c1406d4 = c1409g.f6647T;
            C1593e c1593e = c1406d4 != null ? ((C1407e) c1406d4).f6712u0 : null;
            if (c1593e == null) {
                c1409g.f6771z0 = 0;
                c1409g.f6736A0 = 0;
                c1409g.f6770y0 = false;
                setMeasuredDimension(c1409g.f6771z0, c1409g.f6736A0);
            }
            for (int i31 = 0; i31 < c1409g.f6779r0; i31++) {
                C1406d c1406d5 = c1409g.f6778q0[i31];
                if (c1406d5 != null && !(c1406d5 instanceof C1410h)) {
                    int m3389j = c1406d5.m3389j(0);
                    int m3389j2 = c1406d5.m3389j(1);
                    if (m3389j != 3 || c1406d5.f6687r == 1 || m3389j2 != 3 || c1406d5.f6688s == 1) {
                        if (m3389j == 3) {
                            m3389j = 2;
                        }
                        if (m3389j2 == 3) {
                            m3389j2 = 2;
                        }
                        C1441b c1441b = c1409g.f6737B0;
                        c1441b.f6796a = m3389j;
                        c1441b.f6797b = m3389j2;
                        c1441b.f6798c = c1406d5.m3394q();
                        c1441b.f6799d = c1406d5.m3390k();
                        c1593e.m4750b(c1406d5, c1441b);
                        c1406d5.m3379O(c1441b.f6800e);
                        c1406d5.m3376L(c1441b.f6801f);
                        c1406d5.m3373I(c1441b.f6802g);
                    }
                }
            }
        }
        int i32 = c1409g.f6768w0;
        int i33 = c1409g.f6769x0;
        int i34 = c1409g.f6764s0;
        int i35 = c1409g.f6765t0;
        int[] iArr4 = new int[2];
        int i36 = (size - i32) - i33;
        int i37 = c1409g.f6757V0;
        if (i37 == 1) {
            i36 = (size2 - i34) - i35;
        }
        if (i37 == 0) {
            if (c1409g.f6739D0 == -1) {
                c1409g.f6739D0 = 0;
            }
            if (c1409g.f6740E0 == -1) {
                c1409g.f6740E0 = 0;
            }
        } else {
            if (c1409g.f6739D0 == -1) {
                c1409g.f6739D0 = 0;
            }
            if (c1409g.f6740E0 == -1) {
                c1409g.f6740E0 = 0;
            }
        }
        C1406d[] c1406dArr2 = c1409g.f6778q0;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            i3 = c1409g.f6779r0;
            if (i38 >= i3) {
                break;
            }
            if (c1409g.f6778q0[i38].f6667g0 == 8) {
                i39++;
            }
            i38++;
        }
        if (i39 > 0) {
            c1406dArr2 = new C1406d[i3 - i39];
            int i40 = 0;
            i3 = 0;
            while (i40 < c1409g.f6779r0) {
                C1406d c1406d6 = c1409g.f6778q0[i40];
                int i41 = i36;
                int[] iArr5 = iArr4;
                if (c1406d6.f6667g0 != 8) {
                    c1406dArr2[i3] = c1406d6;
                    i3++;
                }
                i40++;
                i36 = i41;
                iArr4 = iArr5;
            }
        }
        int i42 = i36;
        int[] iArr6 = iArr4;
        int i43 = i3;
        C1406d[] c1406dArr3 = c1406dArr2;
        c1409g.f6762a1 = c1406dArr3;
        c1409g.f6763b1 = i43;
        int i44 = c1409g.f6755T0;
        ArrayList arrayList3 = c1409g.f6758W0;
        if (i44 != 0) {
            C1405c c1405c = c1409g.f6637J;
            C1405c c1405c2 = c1409g.f6636I;
            C1405c c1405c3 = c1409g.f6638K;
            C1405c c1405c4 = c1409g.f6639L;
            int[] iArr7 = c1409g.f6685p0;
            if (i44 == 1) {
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
                ArrayList arrayList4 = arrayList3;
                int i45 = c1409g.f6757V0;
                if (i43 != 0) {
                    arrayList4.clear();
                    C1408f c1408f2 = new C1408f(c1409g, i45, c1409g.f6636I, c1409g.f6637J, c1409g.f6638K, c1409g.f6639L, i42);
                    arrayList4.add(c1408f2);
                    if (i45 == 0) {
                        C1408f c1408f3 = c1408f2;
                        i16 = 0;
                        int i46 = 0;
                        int i47 = 0;
                        while (i47 < i43) {
                            C1406d c1406d7 = c1406dArr3[i47];
                            int m3418U = c1409g.m3418U(c1406d7, i42);
                            if (c1406d7.f6685p0[0] == 3) {
                                i16++;
                            }
                            int i48 = i16;
                            boolean z2 = (i46 == i42 || (c1409g.f6751P0 + i46) + m3418U > i42) && c1408f3.f6719b != null;
                            if (!z2 && i47 > 0 && (i20 = c1409g.f6756U0) > 0 && i47 % i20 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                iArr3 = iArr7;
                                c1406d = c1406d7;
                                i19 = i45;
                                C1408f c1408f4 = new C1408f(c1409g, i45, c1409g.f6636I, c1409g.f6637J, c1409g.f6638K, c1409g.f6639L, i42);
                                c1408f4.f6731n = i47;
                                arrayList4.add(c1408f4);
                                c1408f3 = c1408f4;
                            } else {
                                iArr3 = iArr7;
                                c1406d = c1406d7;
                                i19 = i45;
                                if (i47 > 0) {
                                    i46 = c1409g.f6751P0 + m3418U + i46;
                                    c1408f3.m3410a(c1406d);
                                    i47++;
                                    i16 = i48;
                                    iArr7 = iArr3;
                                    i45 = i19;
                                }
                            }
                            i46 = m3418U;
                            c1408f3.m3410a(c1406d);
                            i47++;
                            i16 = i48;
                            iArr7 = iArr3;
                            i45 = i19;
                        }
                        iArr2 = iArr7;
                        i15 = i45;
                    } else {
                        iArr2 = iArr7;
                        i15 = i45;
                        C1408f c1408f5 = c1408f2;
                        int i49 = 0;
                        i16 = 0;
                        int i50 = 0;
                        while (i49 < i43) {
                            C1406d c1406d8 = c1406dArr3[i49];
                            int m3417T = c1409g.m3417T(c1406d8, i42);
                            if (c1406d8.f6685p0[1] == 3) {
                                i16++;
                            }
                            int i51 = i16;
                            boolean z3 = (i50 == i42 || (c1409g.f6752Q0 + i50) + m3417T > i42) && c1408f5.f6719b != null;
                            if (!z3 && i49 > 0 && (i17 = c1409g.f6756U0) > 0 && i49 % i17 == 0) {
                                z3 = true;
                            }
                            if (z3) {
                                c1406dArr = c1406dArr3;
                                C1408f c1408f6 = new C1408f(c1409g, i15, c1409g.f6636I, c1409g.f6637J, c1409g.f6638K, c1409g.f6639L, i42);
                                c1408f6.f6731n = i49;
                                arrayList4.add(c1408f6);
                                i50 = m3417T;
                                c1408f5 = c1408f6;
                            } else {
                                c1406dArr = c1406dArr3;
                                i50 = i49 > 0 ? c1409g.f6752Q0 + m3417T + i50 : m3417T;
                            }
                            c1408f5.m3410a(c1406d8);
                            i49++;
                            i16 = i51;
                            c1406dArr3 = c1406dArr;
                        }
                    }
                    int size3 = arrayList4.size();
                    int i52 = c1409g.f6768w0;
                    int i53 = c1409g.f6764s0;
                    int i54 = c1409g.f6769x0;
                    int i55 = c1409g.f6765t0;
                    boolean z4 = iArr2[0] == 2 || iArr2[1] == 2;
                    if (i16 > 0 && z4) {
                        for (int i56 = 0; i56 < size3; i56++) {
                            C1408f c1408f7 = (C1408f) arrayList4.get(i56);
                            if (i15 == 0) {
                                c1408f7.m3414e(i42 - c1408f7.m3413d());
                            } else {
                                c1408f7.m3414e(i42 - c1408f7.m3412c());
                            }
                        }
                    }
                    int i57 = i53;
                    C1405c c1405c5 = c1405c2;
                    C1405c c1405c6 = c1405c3;
                    C1405c c1405c7 = c1405c4;
                    int i58 = 0;
                    int i59 = 0;
                    int i60 = 0;
                    int i61 = i52;
                    C1405c c1405c8 = c1405c;
                    while (i58 < size3) {
                        C1408f c1408f8 = (C1408f) arrayList4.get(i58);
                        if (i15 == 0) {
                            if (i58 < size3 - 1) {
                                c1405c7 = ((C1408f) arrayList4.get(i58 + 1)).f6719b.f6637J;
                                arrayList = arrayList4;
                                i55 = 0;
                            } else {
                                i55 = c1409g.f6765t0;
                                arrayList = arrayList4;
                                c1405c7 = c1405c4;
                            }
                            C1405c c1405c9 = c1408f8.f6719b.f6639L;
                            c1408f8.m3415f(i15, c1405c5, c1405c8, c1405c6, c1405c7, i61, i57, i54, i55, i42);
                            int max = Math.max(i59, c1408f8.m3413d());
                            int m3412c = c1408f8.m3412c() + i60;
                            if (i58 > 0) {
                                m3412c += c1409g.f6752Q0;
                            }
                            i18 = size3;
                            i59 = max;
                            i60 = m3412c;
                            c1405c8 = c1405c9;
                            arrayList4 = arrayList;
                            i57 = 0;
                        } else {
                            ArrayList arrayList5 = arrayList4;
                            if (i58 < size3 - 1) {
                                arrayList4 = arrayList5;
                                i18 = size3;
                                c1405c6 = ((C1408f) arrayList4.get(i58 + 1)).f6719b.f6636I;
                                i54 = 0;
                            } else {
                                arrayList4 = arrayList5;
                                i54 = c1409g.f6769x0;
                                i18 = size3;
                                c1405c6 = c1405c3;
                            }
                            C1405c c1405c10 = c1408f8.f6719b.f6638K;
                            c1408f8.m3415f(i15, c1405c5, c1405c8, c1405c6, c1405c7, i61, i57, i54, i55, i42);
                            int m3413d = c1408f8.m3413d() + i59;
                            int max2 = Math.max(i60, c1408f8.m3412c());
                            if (i58 > 0) {
                                m3413d += c1409g.f6751P0;
                            }
                            i59 = m3413d;
                            i60 = max2;
                            i61 = 0;
                            c1405c5 = c1405c10;
                        }
                        i58++;
                        size3 = i18;
                    }
                    iArr[0] = i59;
                    iArr[1] = i60;
                }
            } else if (i44 != 2) {
                if (i44 == 3) {
                    int i62 = c1409g.f6757V0;
                    if (i43 != 0) {
                        arrayList3.clear();
                        i11 = size2;
                        int i63 = i42;
                        iArr = iArr6;
                        i4 = i35;
                        i5 = i34;
                        i6 = i33;
                        i7 = i32;
                        i10 = mode2;
                        ArrayList arrayList6 = arrayList3;
                        C1408f c1408f9 = new C1408f(c1409g, i62, c1409g.f6636I, c1409g.f6637J, c1409g.f6638K, c1409g.f6639L, i63);
                        arrayList6.add(c1408f9);
                        if (i62 == 0) {
                            int i64 = 0;
                            i23 = 0;
                            int i65 = 0;
                            int i66 = 0;
                            while (i66 < i43) {
                                int i67 = i64 + 1;
                                C1406d c1406d9 = c1406dArr3[i66];
                                int i68 = i63;
                                int m3418U2 = c1409g.m3418U(c1406d9, i68);
                                if (c1406d9.f6685p0[0] == 3) {
                                    i23++;
                                }
                                int i69 = i23;
                                boolean z5 = (i65 == i68 || (c1409g.f6751P0 + i65) + m3418U2 > i68) && c1408f9.f6719b != null;
                                if (!z5 && i66 > 0 && (i30 = c1409g.f6756U0) > 0 && i67 > i30) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i63 = i68;
                                    i28 = size;
                                    c1406d3 = c1406d9;
                                    i27 = mode;
                                    i29 = i66;
                                    c1408f9 = new C1408f(c1409g, i62, c1409g.f6636I, c1409g.f6637J, c1409g.f6638K, c1409g.f6639L, i63);
                                    c1408f9.f6731n = i29;
                                    arrayList6.add(c1408f9);
                                    i65 = m3418U2;
                                    i64 = i67;
                                } else {
                                    i63 = i68;
                                    i27 = mode;
                                    i28 = size;
                                    c1406d3 = c1406d9;
                                    i29 = i66;
                                    i65 = i29 > 0 ? c1409g.f6751P0 + m3418U2 + i65 : m3418U2;
                                    i64 = 0;
                                }
                                c1408f9.m3410a(c1406d3);
                                i66 = i29 + 1;
                                i23 = i69;
                                size = i28;
                                mode = i27;
                            }
                            i8 = mode;
                            i9 = size;
                        } else {
                            i8 = mode;
                            i9 = size;
                            int i70 = 0;
                            int i71 = 0;
                            int i72 = 0;
                            while (i72 < i43) {
                                C1406d c1406d10 = c1406dArr3[i72];
                                int i73 = i63;
                                int m3417T2 = c1409g.m3417T(c1406d10, i73);
                                if (c1406d10.f6685p0[1] == 3) {
                                    i70++;
                                }
                                int i74 = i70;
                                boolean z6 = (i71 == i73 || (c1409g.f6752Q0 + i71) + m3417T2 > i73) && c1408f9.f6719b != null;
                                if (!z6 && i72 > 0 && (i24 = c1409g.f6756U0) > 0 && i24 < 0) {
                                    z6 = true;
                                }
                                if (z6) {
                                    i63 = i73;
                                    c1408f9 = new C1408f(c1409g, i62, c1409g.f6636I, c1409g.f6637J, c1409g.f6638K, c1409g.f6639L, i73);
                                    c1408f9.f6731n = i72;
                                    arrayList6.add(c1408f9);
                                } else {
                                    i63 = i73;
                                    if (i72 > 0) {
                                        i71 = c1409g.f6752Q0 + m3417T2 + i71;
                                        c1408f9.m3410a(c1406d10);
                                        i72++;
                                        i70 = i74;
                                    }
                                }
                                i71 = m3417T2;
                                c1408f9.m3410a(c1406d10);
                                i72++;
                                i70 = i74;
                            }
                            i23 = i70;
                        }
                        int size4 = arrayList6.size();
                        int i75 = c1409g.f6768w0;
                        int i76 = c1409g.f6764s0;
                        int i77 = c1409g.f6769x0;
                        int i78 = c1409g.f6765t0;
                        boolean z7 = iArr7[0] == 2 || iArr7[1] == 2;
                        if (i23 > 0 && z7) {
                            int i79 = 0;
                            while (i79 < size4) {
                                C1408f c1408f10 = (C1408f) arrayList6.get(i79);
                                if (i62 == 0) {
                                    i26 = i63;
                                    c1408f10.m3414e(i26 - c1408f10.m3413d());
                                } else {
                                    i26 = i63;
                                    c1408f10.m3414e(i26 - c1408f10.m3412c());
                                }
                                i79++;
                                i63 = i26;
                            }
                        }
                        int i80 = i63;
                        C1405c c1405c11 = c1405c;
                        C1405c c1405c12 = c1405c2;
                        C1405c c1405c13 = c1405c3;
                        C1405c c1405c14 = c1405c4;
                        int i81 = 0;
                        int i82 = 0;
                        int i83 = 0;
                        while (i81 < size4) {
                            C1408f c1408f11 = (C1408f) arrayList6.get(i81);
                            if (i62 == 0) {
                                if (i81 < size4 - 1) {
                                    c1405c14 = ((C1408f) arrayList6.get(i81 + 1)).f6719b.f6637J;
                                    arrayList2 = arrayList6;
                                    i78 = 0;
                                } else {
                                    i78 = c1409g.f6765t0;
                                    arrayList2 = arrayList6;
                                    c1405c14 = c1405c4;
                                }
                                C1405c c1405c15 = c1408f11.f6719b.f6639L;
                                c1408f11.m3415f(i62, c1405c12, c1405c11, c1405c13, c1405c14, i75, i76, i77, i78, i80);
                                int max3 = Math.max(i82, c1408f11.m3413d());
                                int m3412c2 = c1408f11.m3412c() + i83;
                                if (i81 > 0) {
                                    m3412c2 += c1409g.f6752Q0;
                                }
                                i25 = size4;
                                i82 = max3;
                                i83 = m3412c2;
                                c1405c11 = c1405c15;
                                arrayList6 = arrayList2;
                                i76 = 0;
                            } else {
                                ArrayList arrayList7 = arrayList6;
                                if (i81 < size4 - 1) {
                                    arrayList6 = arrayList7;
                                    i25 = size4;
                                    c1405c13 = ((C1408f) arrayList6.get(i81 + 1)).f6719b.f6636I;
                                    i77 = 0;
                                } else {
                                    arrayList6 = arrayList7;
                                    i77 = c1409g.f6769x0;
                                    i25 = size4;
                                    c1405c13 = c1405c3;
                                }
                                C1405c c1405c16 = c1408f11.f6719b.f6638K;
                                c1408f11.m3415f(i62, c1405c12, c1405c11, c1405c13, c1405c14, i75, i76, i77, i78, i80);
                                int m3413d2 = c1408f11.m3413d() + i82;
                                int max4 = Math.max(i83, c1408f11.m3412c());
                                if (i81 > 0) {
                                    m3413d2 += c1409g.f6751P0;
                                }
                                i82 = m3413d2;
                                c1405c12 = c1405c16;
                                i83 = max4;
                                i75 = 0;
                            }
                            i81++;
                            size4 = i25;
                        }
                        iArr[0] = i82;
                        iArr[1] = i83;
                    }
                }
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
            } else {
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
                int i84 = c1409g.f6757V0;
                if (i84 == 0) {
                    int i85 = c1409g.f6756U0;
                    if (i85 <= 0) {
                        int i86 = 0;
                        i22 = 0;
                        for (int i87 = 0; i87 < i43; i87++) {
                            if (i87 > 0) {
                                i86 += c1409g.f6751P0;
                            }
                            C1406d c1406d11 = c1406dArr3[i87];
                            if (c1406d11 != null) {
                                int m3418U3 = c1409g.m3418U(c1406d11, i42) + i86;
                                if (m3418U3 > i42) {
                                    break;
                                }
                                i22++;
                                i86 = m3418U3;
                            }
                        }
                    } else {
                        i22 = i85;
                    }
                    i21 = 0;
                } else {
                    i21 = c1409g.f6756U0;
                    if (i21 <= 0) {
                        int i88 = 0;
                        int i89 = 0;
                        for (int i90 = 0; i90 < i43; i90++) {
                            if (i90 > 0) {
                                i88 += c1409g.f6752Q0;
                            }
                            C1406d c1406d12 = c1406dArr3[i90];
                            if (c1406d12 != null) {
                                int m3417T3 = c1409g.m3417T(c1406d12, i42) + i88;
                                if (m3417T3 > i42) {
                                    break;
                                }
                                i89++;
                                i88 = m3417T3;
                            }
                        }
                        i21 = i89;
                    }
                    i22 = 0;
                }
                if (c1409g.f6761Z0 == null) {
                    c1409g.f6761Z0 = new int[2];
                }
                boolean z8 = (i21 == 0 && i84 == 1) || (i22 == 0 && i84 == 0);
                while (!z8) {
                    if (i84 == 0) {
                        i21 = (int) Math.ceil(i43 / i22);
                    } else {
                        i22 = (int) Math.ceil(i43 / i21);
                    }
                    C1406d[] c1406dArr4 = c1409g.f6760Y0;
                    if (c1406dArr4 == null || c1406dArr4.length < i22) {
                        obj = null;
                        c1409g.f6760Y0 = new C1406d[i22];
                    } else {
                        obj = null;
                        Arrays.fill(c1406dArr4, (Object) null);
                    }
                    C1406d[] c1406dArr5 = c1409g.f6759X0;
                    if (c1406dArr5 == null || c1406dArr5.length < i21) {
                        c1409g.f6759X0 = new C1406d[i21];
                    } else {
                        Arrays.fill(c1406dArr5, obj);
                    }
                    for (int i91 = 0; i91 < i22; i91++) {
                        for (int i92 = 0; i92 < i21; i92++) {
                            int i93 = (i92 * i22) + i91;
                            if (i84 == 1) {
                                i93 = (i91 * i21) + i92;
                            }
                            if (i93 < c1406dArr3.length && (c1406d2 = c1406dArr3[i93]) != null) {
                                int m3418U4 = c1409g.m3418U(c1406d2, i42);
                                C1406d c1406d13 = c1409g.f6760Y0[i91];
                                if (c1406d13 == null || c1406d13.m3394q() < m3418U4) {
                                    c1409g.f6760Y0[i91] = c1406d2;
                                }
                                int m3417T4 = c1409g.m3417T(c1406d2, i42);
                                C1406d c1406d14 = c1409g.f6759X0[i92];
                                if (c1406d14 == null || c1406d14.m3390k() < m3417T4) {
                                    c1409g.f6759X0[i92] = c1406d2;
                                }
                            }
                        }
                    }
                    int i94 = 0;
                    for (int i95 = 0; i95 < i22; i95++) {
                        C1406d c1406d15 = c1409g.f6760Y0[i95];
                        if (c1406d15 != null) {
                            if (i95 > 0) {
                                i94 += c1409g.f6751P0;
                            }
                            i94 = c1409g.m3418U(c1406d15, i42) + i94;
                        }
                    }
                    int i96 = 0;
                    for (int i97 = 0; i97 < i21; i97++) {
                        C1406d c1406d16 = c1409g.f6759X0[i97];
                        if (c1406d16 != null) {
                            if (i97 > 0) {
                                i96 += c1409g.f6752Q0;
                            }
                            i96 = c1409g.m3417T(c1406d16, i42) + i96;
                        }
                    }
                    iArr[0] = i94;
                    iArr[1] = i96;
                    if (i84 == 0) {
                        if (i94 > i42 && i22 > 1) {
                            i22--;
                        }
                        z8 = true;
                    } else {
                        if (i96 > i42 && i21 > 1) {
                            i21--;
                        }
                        z8 = true;
                    }
                }
                int[] iArr8 = c1409g.f6761Z0;
                iArr8[0] = i22;
                iArr8[1] = i21;
            }
        } else {
            i4 = i35;
            i5 = i34;
            i6 = i33;
            i7 = i32;
            i8 = mode;
            i9 = size;
            i10 = mode2;
            i11 = size2;
            iArr = iArr6;
            int i98 = c1409g.f6757V0;
            if (i43 != 0) {
                if (arrayList3.size() == 0) {
                    c1408f = new C1408f(c1409g, i98, c1409g.f6636I, c1409g.f6637J, c1409g.f6638K, c1409g.f6639L, i42);
                    arrayList3.add(c1408f);
                } else {
                    c1408f = (C1408f) arrayList3.get(0);
                    c1408f.f6720c = 0;
                    c1408f.f6719b = null;
                    c1408f.f6729l = 0;
                    c1408f.f6730m = 0;
                    c1408f.f6731n = 0;
                    c1408f.f6732o = 0;
                    c1408f.f6733p = 0;
                    c1408f.m3415f(i98, c1409g.f6636I, c1409g.f6637J, c1409g.f6638K, c1409g.f6639L, c1409g.f6768w0, c1409g.f6764s0, c1409g.f6769x0, c1409g.f6765t0, i42);
                }
                for (int i99 = 0; i99 < i43; i99++) {
                    c1408f.m3410a(c1406dArr3[i99]);
                }
                c2 = 0;
                iArr[0] = c1408f.m3413d();
                r2 = 1;
                iArr[1] = c1408f.m3412c();
                int i100 = iArr[c2] + i7 + i6;
                int i101 = iArr[r2] + i5 + i4;
                i12 = i8;
                if (i12 != 1073741824) {
                    i13 = i10;
                    i14 = i9;
                } else {
                    if (i12 == Integer.MIN_VALUE) {
                        i14 = Math.min(i100, i9);
                    } else if (i12 == 0) {
                        i14 = i100;
                    } else {
                        i13 = i10;
                        i14 = 0;
                    }
                    i13 = i10;
                }
                int min = i13 != 1073741824 ? i11 : i13 == Integer.MIN_VALUE ? Math.min(i101, i11) : i13 == 0 ? i101 : 0;
                c1409g.f6771z0 = i14;
                c1409g.f6736A0 = min;
                c1409g.m3379O(i14);
                c1409g.m3376L(min);
                c1409g.f6770y0 = c1409g.f6779r0 <= 0 ? r2 : false;
                setMeasuredDimension(c1409g.f6771z0, c1409g.f6736A0);
            }
        }
        c2 = 0;
        r2 = 1;
        int i1002 = iArr[c2] + i7 + i6;
        int i1012 = iArr[r2] + i5 + i4;
        i12 = i8;
        if (i12 != 1073741824) {
        }
        if (i13 != 1073741824) {
        }
        c1409g.f6771z0 = i14;
        c1409g.f6736A0 = min;
        c1409g.m3379O(i14);
        c1409g.m3376L(min);
        c1409g.f6770y0 = c1409g.f6779r0 <= 0 ? r2 : false;
        setMeasuredDimension(c1409g.f6771z0, c1409g.f6736A0);
    }

    @Override // p111v.AbstractC1590b, android.view.View
    public final void onMeasure(int i, int i2) {
        mo1310j(this.f1852o, i, i2);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f1852o.f6747L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1852o.f6741F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f1852o.f6748M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1852o.f6742G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1852o.f6753R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f1852o.f6745J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1852o.f6751P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1852o.f6739D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f1852o.f6749N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1852o.f6743H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f1852o.f6750O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1852o.f6744I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1852o.f6756U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1852o.f6757V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C1409g c1409g = this.f1852o;
        c1409g.f6764s0 = i;
        c1409g.f6765t0 = i;
        c1409g.f6766u0 = i;
        c1409g.f6767v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1852o.f6765t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1852o.f6768w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1852o.f6769x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1852o.f6764s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1852o.f6754S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f1852o.f6746K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1852o.f6752Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1852o.f6740E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1852o.f6755T0 = i;
        requestLayout();
    }
}
