package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.WeakHashMap;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p022K.AbstractC0169Q;
import p024L.C0239i;
import p024L.C0240j;
import p068f0.AbstractC0778H;
import p068f0.C0779I;
import p068f0.C0784N;
import p068f0.C0789T;
import p068f0.C0815m;
import p068f0.C0818p;
import p068f0.C0820r;
import p068f0.C0821s;
import p068f0.C0822t;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f2027E;

    /* renamed from: F */
    public int f2028F;

    /* renamed from: G */
    public int[] f2029G;

    /* renamed from: H */
    public View[] f2030H;

    /* renamed from: I */
    public final SparseIntArray f2031I;

    /* renamed from: J */
    public final SparseIntArray f2032J;

    /* renamed from: K */
    public final C0043j f2033K;

    /* renamed from: L */
    public final Rect f2034L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2027E = false;
        this.f2028F = -1;
        this.f2031I = new SparseIntArray();
        this.f2032J = new SparseIntArray();
        this.f2033K = new C0043j(9);
        this.f2034L = new Rect();
        m1431o1(AbstractC0778H.m2219I(context, attributeSet, i, i2).f3929b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: B0 */
    public final boolean mo1402B0() {
        return this.f2049z == null && !this.f2027E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: D0 */
    public final void mo1403D0(C0789T c0789t, C0822t c0822t, C0815m c0815m) {
        int i;
        int i2 = this.f2028F;
        for (int i3 = 0; i3 < this.f2028F && (i = c0822t.f4175d) >= 0 && i < c0789t.m2265b() && i2 > 0; i3++) {
            c0815m.m2315a(c0822t.f4175d, Math.max(0, c0822t.f4178g));
            this.f2033K.getClass();
            i2--;
            c0822t.f4175d += c0822t.f4176e;
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: J */
    public final int mo1404J(C0784N c0784n, C0789T c0789t) {
        if (this.f2039p == 0) {
            return this.f2028F;
        }
        if (c0789t.m2265b() < 1) {
            return 0;
        }
        return m1423k1(c0789t.m2265b() - 1, c0784n, c0789t) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Q0 */
    public final View mo1405Q0(C0784N c0784n, C0789T c0789t, int i, int i2, int i3) {
        m1444I0();
        int mo887k = this.f2041r.mo887k();
        int mo883g = this.f2041r.mo883g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m2245u = m2245u(i);
            int m2218H = AbstractC0778H.m2218H(m2245u);
            if (m2218H >= 0 && m2218H < i3 && m1425l1(m2218H, c0784n, c0789t) == 0) {
                if (((C0779I) m2245u.getLayoutParams()).f3947a.m2276i()) {
                    if (view2 == null) {
                        view2 = m2245u;
                    }
                } else {
                    if (this.f2041r.mo881e(m2245u) < mo883g && this.f2041r.mo878b(m2245u) >= mo887k) {
                        return m2245u;
                    }
                    if (view == null) {
                        view = m2245u;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0103, code lost:
    
        if (r13 == (r2 > r8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0022, code lost:
    
        if (((java.util.ArrayList) r22.f3932a.f535d).contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1406S(View view, int i, C0784N c0784n, C0789T c0789t) {
        View m1490B;
        int m2247v;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        C0784N c0784n2 = c0784n;
        C0789T c0789t2 = c0789t;
        RecyclerView recyclerView = this.f3933b;
        View view4 = null;
        if (recyclerView != null) {
            m1490B = recyclerView.m1490B(view);
            if (m1490B != null) {
            }
        }
        m1490B = null;
        if (m1490B == null) {
            return null;
        }
        C0818p c0818p = (C0818p) m1490B.getLayoutParams();
        int i5 = c0818p.f4152e;
        int i6 = c0818p.f4153f + i5;
        if (super.mo1406S(view, i, c0784n, c0789t) == null) {
            return null;
        }
        if ((m1443H0(i) == 1) != this.f2044u) {
            i3 = m2247v() - 1;
            m2247v = -1;
            i2 = -1;
        } else {
            m2247v = m2247v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f2039p == 1 && m1459V0();
        int m1423k1 = m1423k1(i3, c0784n2, c0789t2);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != m2247v) {
            int i13 = m2247v;
            int m1423k12 = m1423k1(i12, c0784n2, c0789t2);
            View m2245u = m2245u(i12);
            if (m2245u == m1490B) {
                break;
            }
            if (!m2245u.hasFocusable() || m1423k12 == m1423k1) {
                C0818p c0818p2 = (C0818p) m2245u.getLayoutParams();
                int i14 = c0818p2.f4152e;
                view2 = m1490B;
                int i15 = c0818p2.f4153f + i14;
                if (m2245u.hasFocusable() && i14 == i5 && i15 == i6) {
                    return m2245u;
                }
                if (!(m2245u.hasFocusable() && view4 == null) && (m2245u.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i6) - Math.max(i14, i5);
                    if (m2245u.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i10;
                        if (!this.f3934c.m65C(m2245u) || !this.f3935d.m65C(m2245u)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (m2245u.hasFocusable()) {
                                int i16 = c0818p2.f4152e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = m2245u;
                            } else {
                                int i17 = c0818p2.f4152e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = m2245u;
                            }
                            i12 += i9;
                            c0784n2 = c0784n;
                            c0789t2 = c0789t;
                            m2247v = i13;
                            m1490B = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        c0784n2 = c0784n;
                        c0789t2 = c0789t;
                        m2247v = i13;
                        m1490B = view2;
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                if (m2245u.hasFocusable()) {
                }
                i12 += i9;
                c0784n2 = c0784n;
                c0789t2 = c0789t;
                m2247v = i13;
                m1490B = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = m1490B;
                view3 = view5;
            }
            i4 = i10;
            i10 = i4;
            view5 = view3;
            i12 += i9;
            c0784n2 = c0784n;
            c0789t2 = c0789t;
            m2247v = i13;
            m1490B = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: W */
    public final void mo1407W(C0784N c0784n, C0789T c0789t, View view, C0240j c0240j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0818p)) {
            m2234V(view, c0240j);
            return;
        }
        C0818p c0818p = (C0818p) layoutParams;
        int m1423k1 = m1423k1(c0818p.f3947a.m2269b(), c0784n, c0789t);
        if (this.f2039p == 0) {
            c0240j.m735h(C0239i.m727a(false, c0818p.f4152e, c0818p.f4153f, m1423k1, 1));
        } else {
            c0240j.m735h(C0239i.m727a(false, m1423k1, 1, c0818p.f4152e, c0818p.f4153f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f4169b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1408W0(C0784N c0784n, C0789T c0789t, C0822t c0822t, C0821s c0821s) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int m2223w;
        int i8;
        ?? r8;
        int i9;
        View m2325b;
        int mo886j = this.f2041r.mo886j();
        boolean z2 = mo886j != 1073741824;
        int i10 = m2247v() > 0 ? this.f2029G[this.f2028F] : 0;
        if (z2) {
            m1432p1();
        }
        boolean z3 = c0822t.f4176e == 1;
        int i11 = this.f2028F;
        if (!z3) {
            i11 = m1425l1(c0822t.f4175d, c0784n, c0789t) + m1426m1(c0822t.f4175d, c0784n, c0789t);
        }
        int i12 = 0;
        while (i12 < this.f2028F && (i9 = c0822t.f4175d) >= 0 && i9 < c0789t.m2265b() && i11 > 0) {
            int i13 = c0822t.f4175d;
            int m1426m1 = m1426m1(i13, c0784n, c0789t);
            if (m1426m1 > this.f2028F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + m1426m1 + " spans but GridLayoutManager has only " + this.f2028F + " spans.");
            }
            i11 -= m1426m1;
            if (i11 < 0 || (m2325b = c0822t.m2325b(c0784n)) == null) {
                break;
            }
            this.f2030H[i12] = m2325b;
            i12++;
        }
        if (z3) {
            i3 = 1;
            i2 = i12;
            i = 0;
        } else {
            i = i12 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i14 = 0;
        while (i != i2) {
            View view = this.f2030H[i];
            C0818p c0818p = (C0818p) view.getLayoutParams();
            int m1426m12 = m1426m1(AbstractC0778H.m2218H(view), c0784n, c0789t);
            c0818p.f4153f = m1426m12;
            c0818p.f4152e = i14;
            i14 += m1426m12;
            i += i3;
        }
        float f2 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f2030H[i16];
            if (c0822t.f4182k != null) {
                r8 = 0;
                r8 = 0;
                if (z3) {
                    m2235b(-1, view2, true);
                } else {
                    m2235b(0, view2, true);
                }
            } else if (z3) {
                r8 = 0;
                m2235b(-1, view2, false);
            } else {
                r8 = 0;
                m2235b(0, view2, false);
            }
            RecyclerView recyclerView = this.f3933b;
            Rect rect = this.f2034L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.m1497K(view2));
            }
            m1428n1(mo886j, view2, r8);
            int mo879c = this.f2041r.mo879c(view2);
            if (mo879c > i15) {
                i15 = mo879c;
            }
            float mo880d = (this.f2041r.mo880d(view2) * 1.0f) / ((C0818p) view2.getLayoutParams()).f4153f;
            if (mo880d > f2) {
                f2 = mo880d;
            }
        }
        if (z2) {
            m1419h1(Math.max(Math.round(f2 * this.f2028F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f2030H[i17];
                m1428n1(1073741824, view3, true);
                int mo879c2 = this.f2041r.mo879c(view3);
                if (mo879c2 > i15) {
                    i15 = mo879c2;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f2030H[i18];
            if (this.f2041r.mo879c(view4) != i15) {
                C0818p c0818p2 = (C0818p) view4.getLayoutParams();
                Rect rect2 = c0818p2.f3948b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0818p2).topMargin + ((ViewGroup.MarginLayoutParams) c0818p2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0818p2).leftMargin + ((ViewGroup.MarginLayoutParams) c0818p2).rightMargin;
                int m1421j1 = m1421j1(c0818p2.f4152e, c0818p2.f4153f);
                if (this.f2039p == 1) {
                    i8 = AbstractC0778H.m2223w(false, m1421j1, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c0818p2).width);
                    m2223w = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    m2223w = AbstractC0778H.m2223w(false, m1421j1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c0818p2).height);
                    i8 = makeMeasureSpec;
                }
                if (m2250y0(view4, i8, m2223w, (C0779I) view4.getLayoutParams())) {
                    view4.measure(i8, m2223w);
                }
            }
        }
        c0821s.f4168a = i15;
        if (this.f2039p != 1) {
            if (c0822t.f4177f == -1) {
                int i21 = c0822t.f4173b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0822t.f4173b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0822t.f4177f == -1) {
            int i23 = c0822t.f4173b;
            i5 = 0;
            i4 = 0;
            i7 = i23 - i15;
            i6 = i23;
        } else {
            i7 = c0822t.f4173b;
            i6 = i7 + i15;
            i5 = 0;
            i4 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f2030H[i24];
            C0818p c0818p3 = (C0818p) view5.getLayoutParams();
            if (this.f2039p != 1) {
                int m2231G = m2231G() + this.f2029G[c0818p3.f4152e];
                i7 = m2231G;
                i6 = this.f2041r.mo880d(view5) + m2231G;
            } else if (m1459V0()) {
                int m2229E = m2229E() + this.f2029G[this.f2028F - c0818p3.f4152e];
                i4 = m2229E;
                i5 = m2229E - this.f2041r.mo880d(view5);
            } else {
                i5 = m2229E() + this.f2029G[c0818p3.f4152e];
                i4 = this.f2041r.mo880d(view5) + i5;
            }
            AbstractC0778H.m2221N(view5, i5, i7, i4, i6);
            if (c0818p3.f3947a.m2276i() || c0818p3.f3947a.m2279l()) {
                c0821s.f4170c = true;
            }
            c0821s.f4171d = view5.hasFocusable() | c0821s.f4171d;
        }
        Arrays.fill(this.f2030H, (Object) null);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: X */
    public final void mo1409X(int i, int i2) {
        C0043j c0043j = this.f2033K;
        c0043j.m64B();
        ((SparseIntArray) c0043j.f142h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: X0 */
    public final void mo1410X0(C0784N c0784n, C0789T c0789t, C0820r c0820r, int i) {
        m1432p1();
        if (c0789t.m2265b() > 0 && !c0789t.f3979g) {
            boolean z2 = i == 1;
            int m1425l1 = m1425l1(c0820r.f4164b, c0784n, c0789t);
            if (z2) {
                while (m1425l1 > 0) {
                    int i2 = c0820r.f4164b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0820r.f4164b = i3;
                    m1425l1 = m1425l1(i3, c0784n, c0789t);
                }
            } else {
                int m2265b = c0789t.m2265b() - 1;
                int i4 = c0820r.f4164b;
                while (i4 < m2265b) {
                    int i5 = i4 + 1;
                    int m1425l12 = m1425l1(i5, c0784n, c0789t);
                    if (m1425l12 <= m1425l1) {
                        break;
                    }
                    i4 = i5;
                    m1425l1 = m1425l12;
                }
                c0820r.f4164b = i4;
            }
        }
        m1420i1();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: Y */
    public final void mo1411Y() {
        C0043j c0043j = this.f2033K;
        c0043j.m64B();
        ((SparseIntArray) c0043j.f142h).clear();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: Z */
    public final void mo1412Z(int i, int i2) {
        C0043j c0043j = this.f2033K;
        c0043j.m64B();
        ((SparseIntArray) c0043j.f142h).clear();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: a0 */
    public final void mo1413a0(int i, int i2) {
        C0043j c0043j = this.f2033K;
        c0043j.m64B();
        ((SparseIntArray) c0043j.f142h).clear();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: b0 */
    public final void mo1414b0(int i, int i2) {
        C0043j c0043j = this.f2033K;
        c0043j.m64B();
        ((SparseIntArray) c0043j.f142h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: c0 */
    public final void mo1415c0(C0784N c0784n, C0789T c0789t) {
        boolean z2 = c0789t.f3979g;
        SparseIntArray sparseIntArray = this.f2032J;
        SparseIntArray sparseIntArray2 = this.f2031I;
        if (z2) {
            int m2247v = m2247v();
            for (int i = 0; i < m2247v; i++) {
                C0818p c0818p = (C0818p) m2245u(i).getLayoutParams();
                int m2269b = c0818p.f3947a.m2269b();
                sparseIntArray2.put(m2269b, c0818p.f4153f);
                sparseIntArray.put(m2269b, c0818p.f4152e);
            }
        }
        super.mo1415c0(c0784n, c0789t);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: d0 */
    public final void mo1416d0(C0789T c0789t) {
        super.mo1416d0(c0789t);
        this.f2027E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: d1 */
    public final void mo1417d1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1417d1(false);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: f */
    public final boolean mo1418f(C0779I c0779i) {
        return c0779i instanceof C0818p;
    }

    /* renamed from: h1 */
    public final void m1419h1(int i) {
        int i2;
        int[] iArr = this.f2029G;
        int i3 = this.f2028F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f2029G = iArr;
    }

    /* renamed from: i1 */
    public final void m1420i1() {
        View[] viewArr = this.f2030H;
        if (viewArr == null || viewArr.length != this.f2028F) {
            this.f2030H = new View[this.f2028F];
        }
    }

    /* renamed from: j1 */
    public final int m1421j1(int i, int i2) {
        if (this.f2039p != 1 || !m1459V0()) {
            int[] iArr = this.f2029G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2029G;
        int i3 = this.f2028F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: k */
    public final int mo1422k(C0789T c0789t) {
        return m1441F0(c0789t);
    }

    /* renamed from: k1 */
    public final int m1423k1(int i, C0784N c0784n, C0789T c0789t) {
        boolean z2 = c0789t.f3979g;
        C0043j c0043j = this.f2033K;
        if (!z2) {
            int i2 = this.f2028F;
            c0043j.getClass();
            return C0043j.m60A(i, i2);
        }
        int m2253b = c0784n.m2253b(i);
        if (m2253b != -1) {
            int i3 = this.f2028F;
            c0043j.getClass();
            return C0043j.m60A(m2253b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: l */
    public final int mo1424l(C0789T c0789t) {
        return m1442G0(c0789t);
    }

    /* renamed from: l1 */
    public final int m1425l1(int i, C0784N c0784n, C0789T c0789t) {
        boolean z2 = c0789t.f3979g;
        C0043j c0043j = this.f2033K;
        if (!z2) {
            int i2 = this.f2028F;
            c0043j.getClass();
            return i % i2;
        }
        int i3 = this.f2032J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int m2253b = c0784n.m2253b(i);
        if (m2253b != -1) {
            int i4 = this.f2028F;
            c0043j.getClass();
            return m2253b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: m1 */
    public final int m1426m1(int i, C0784N c0784n, C0789T c0789t) {
        boolean z2 = c0789t.f3979g;
        C0043j c0043j = this.f2033K;
        if (!z2) {
            c0043j.getClass();
            return 1;
        }
        int i2 = this.f2031I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0784n.m2253b(i) != -1) {
            c0043j.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: n */
    public final int mo1427n(C0789T c0789t) {
        return m1441F0(c0789t);
    }

    /* renamed from: n1 */
    public final void m1428n1(int i, View view, boolean z2) {
        int i2;
        int i3;
        C0818p c0818p = (C0818p) view.getLayoutParams();
        Rect rect = c0818p.f3948b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0818p).topMargin + ((ViewGroup.MarginLayoutParams) c0818p).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0818p).leftMargin + ((ViewGroup.MarginLayoutParams) c0818p).rightMargin;
        int m1421j1 = m1421j1(c0818p.f4152e, c0818p.f4153f);
        if (this.f2039p == 1) {
            i3 = AbstractC0778H.m2223w(false, m1421j1, i, i5, ((ViewGroup.MarginLayoutParams) c0818p).width);
            i2 = AbstractC0778H.m2223w(true, this.f2041r.mo888l(), this.f3944m, i4, ((ViewGroup.MarginLayoutParams) c0818p).height);
        } else {
            int m2223w = AbstractC0778H.m2223w(false, m1421j1, i, i4, ((ViewGroup.MarginLayoutParams) c0818p).height);
            int m2223w2 = AbstractC0778H.m2223w(true, this.f2041r.mo888l(), this.f3943l, i5, ((ViewGroup.MarginLayoutParams) c0818p).width);
            i2 = m2223w;
            i3 = m2223w2;
        }
        C0779I c0779i = (C0779I) view.getLayoutParams();
        if (z2 ? m2250y0(view, i3, i2, c0779i) : m2249w0(view, i3, i2, c0779i)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: o */
    public final int mo1429o(C0789T c0789t) {
        return m1442G0(c0789t);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: o0 */
    public final int mo1430o0(int i, C0784N c0784n, C0789T c0789t) {
        m1432p1();
        m1420i1();
        return super.mo1430o0(i, c0784n, c0789t);
    }

    /* renamed from: o1 */
    public final void m1431o1(int i) {
        if (i == this.f2028F) {
            return;
        }
        this.f2027E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0062j.m156j(i, "Span count should be at least 1. Provided "));
        }
        this.f2028F = i;
        this.f2033K.m64B();
        m2241n0();
    }

    /* renamed from: p1 */
    public final void m1432p1() {
        int m2228D;
        int m2231G;
        if (this.f2039p == 1) {
            m2228D = this.f3945n - m2230F();
            m2231G = m2229E();
        } else {
            m2228D = this.f3946o - m2228D();
            m2231G = m2231G();
        }
        m1419h1(m2228D - m2231G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: q0 */
    public final int mo1433q0(int i, C0784N c0784n, C0789T c0789t) {
        m1432p1();
        m1420i1();
        return super.mo1433q0(i, c0784n, c0789t);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: r */
    public final C0779I mo1434r() {
        return this.f2039p == 0 ? new C0818p(-2, -1) : new C0818p(-1, -2);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: s */
    public final C0779I mo1435s(Context context, AttributeSet attributeSet) {
        C0818p c0818p = new C0818p(context, attributeSet);
        c0818p.f4152e = -1;
        c0818p.f4153f = 0;
        return c0818p;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: t */
    public final C0779I mo1436t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0818p c0818p = new C0818p((ViewGroup.MarginLayoutParams) layoutParams);
            c0818p.f4152e = -1;
            c0818p.f4153f = 0;
            return c0818p;
        }
        C0818p c0818p2 = new C0818p(layoutParams);
        c0818p2.f4152e = -1;
        c0818p2.f4153f = 0;
        return c0818p2;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: t0 */
    public final void mo1437t0(Rect rect, int i, int i2) {
        int m2222g;
        int m2222g2;
        if (this.f2029G == null) {
            super.mo1437t0(rect, i, i2);
        }
        int m2230F = m2230F() + m2229E();
        int m2228D = m2228D() + m2231G();
        if (this.f2039p == 1) {
            int height = rect.height() + m2228D;
            RecyclerView recyclerView = this.f3933b;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            m2222g2 = AbstractC0778H.m2222g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f2029G;
            m2222g = AbstractC0778H.m2222g(i, iArr[iArr.length - 1] + m2230F, this.f3933b.getMinimumWidth());
        } else {
            int width = rect.width() + m2230F;
            RecyclerView recyclerView2 = this.f3933b;
            WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
            m2222g = AbstractC0778H.m2222g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f2029G;
            m2222g2 = AbstractC0778H.m2222g(i2, iArr2[iArr2.length - 1] + m2228D, this.f3933b.getMinimumHeight());
        }
        this.f3933b.setMeasuredDimension(m2222g, m2222g2);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: x */
    public final int mo1438x(C0784N c0784n, C0789T c0789t) {
        if (this.f2039p == 1) {
            return this.f2028F;
        }
        if (c0789t.m2265b() < 1) {
            return 0;
        }
        return m1423k1(c0789t.m2265b() - 1, c0784n, c0789t) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f2027E = false;
        this.f2028F = -1;
        this.f2031I = new SparseIntArray();
        this.f2032J = new SparseIntArray();
        this.f2033K = new C0043j(9);
        this.f2034L = new Rect();
        m1431o1(i);
    }
}
