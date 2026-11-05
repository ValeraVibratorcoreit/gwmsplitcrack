package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p001A0.RunnableC0020n;
import p003B.C0043j;
import p022K.AbstractC0169Q;
import p024L.C0239i;
import p024L.C0240j;
import p038T.AbstractC0312f;
import p068f0.AbstractC0778H;
import p068f0.C0777G;
import p068f0.C0779I;
import p068f0.C0784N;
import p068f0.C0789T;
import p068f0.C0797a0;
import p068f0.C0799b0;
import p068f0.C0801c0;
import p068f0.C0803d0;
import p068f0.C0805e0;
import p068f0.C0815m;
import p068f0.C0819q;
import p068f0.C0824v;
import p068f0.InterfaceC0788S;
import p121y0.AbstractC1687o;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0778H implements InterfaceC0788S {

    /* renamed from: B */
    public final C0043j f2122B;

    /* renamed from: C */
    public final int f2123C;

    /* renamed from: D */
    public boolean f2124D;

    /* renamed from: E */
    public boolean f2125E;

    /* renamed from: F */
    public C0803d0 f2126F;

    /* renamed from: G */
    public final Rect f2127G;

    /* renamed from: H */
    public final C0797a0 f2128H;

    /* renamed from: I */
    public final boolean f2129I;

    /* renamed from: J */
    public int[] f2130J;

    /* renamed from: K */
    public final RunnableC0020n f2131K;

    /* renamed from: p */
    public final int f2132p;

    /* renamed from: q */
    public final C0805e0[] f2133q;

    /* renamed from: r */
    public final AbstractC0312f f2134r;

    /* renamed from: s */
    public final AbstractC0312f f2135s;

    /* renamed from: t */
    public final int f2136t;

    /* renamed from: u */
    public int f2137u;

    /* renamed from: v */
    public final C0819q f2138v;

    /* renamed from: w */
    public boolean f2139w;

    /* renamed from: y */
    public final BitSet f2141y;

    /* renamed from: x */
    public boolean f2140x = false;

    /* renamed from: z */
    public int f2142z = -1;

    /* renamed from: A */
    public int f2121A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2132p = -1;
        this.f2139w = false;
        C0043j c0043j = new C0043j(10, false);
        this.f2122B = c0043j;
        this.f2123C = 2;
        this.f2127G = new Rect();
        this.f2128H = new C0797a0(this);
        this.f2129I = true;
        this.f2131K = new RunnableC0020n(12, this);
        C0777G m2219I = AbstractC0778H.m2219I(context, attributeSet, i, i2);
        int i3 = m2219I.f3928a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1465c(null);
        if (i3 != this.f2136t) {
            this.f2136t = i3;
            AbstractC0312f abstractC0312f = this.f2134r;
            this.f2134r = this.f2135s;
            this.f2135s = abstractC0312f;
            m2241n0();
        }
        int i4 = m2219I.f3929b;
        mo1465c(null);
        if (i4 != this.f2132p) {
            int[] iArr = (int[]) c0043j.f141g;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0043j.f142h = null;
            m2241n0();
            this.f2132p = i4;
            this.f2141y = new BitSet(this.f2132p);
            this.f2133q = new C0805e0[this.f2132p];
            for (int i5 = 0; i5 < this.f2132p; i5++) {
                this.f2133q[i5] = new C0805e0(this, i5);
            }
            m2241n0();
        }
        boolean z2 = m2219I.f3930c;
        mo1465c(null);
        C0803d0 c0803d0 = this.f2126F;
        if (c0803d0 != null && c0803d0.f4051h != z2) {
            c0803d0.f4051h = z2;
        }
        this.f2139w = z2;
        m2241n0();
        C0819q c0819q = new C0819q();
        c0819q.f4154a = true;
        c0819q.f4159f = 0;
        c0819q.f4160g = 0;
        this.f2138v = c0819q;
        this.f2134r = AbstractC0312f.m877a(this, this.f2136t);
        this.f2135s = AbstractC0312f.m877a(this, 1 - this.f2136t);
    }

    /* renamed from: f1 */
    public static int m1538f1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: B0 */
    public final boolean mo1402B0() {
        return this.f2126F == null;
    }

    /* renamed from: C0 */
    public final int m1539C0(int i) {
        if (m2247v() == 0) {
            return this.f2140x ? 1 : -1;
        }
        return (i < m1549M0()) != this.f2140x ? -1 : 1;
    }

    /* renamed from: D0 */
    public final boolean m1540D0() {
        int m1549M0;
        if (m2247v() != 0 && this.f2123C != 0 && this.f3938g) {
            if (this.f2140x) {
                m1549M0 = m1550N0();
                m1549M0();
            } else {
                m1549M0 = m1549M0();
                m1550N0();
            }
            C0043j c0043j = this.f2122B;
            if (m1549M0 == 0 && m1556R0() != null) {
                int[] iArr = (int[]) c0043j.f141g;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0043j.f142h = null;
                this.f3937f = true;
                m2241n0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: E0 */
    public final int m1541E0(C0789T c0789t) {
        if (m2247v() == 0) {
            return 0;
        }
        AbstractC0312f abstractC0312f = this.f2134r;
        boolean z2 = !this.f2129I;
        return AbstractC1687o.m4940i(c0789t, abstractC0312f, m1546J0(z2), m1545I0(z2), this, this.f2129I);
    }

    /* renamed from: F0 */
    public final int m1542F0(C0789T c0789t) {
        if (m2247v() == 0) {
            return 0;
        }
        AbstractC0312f abstractC0312f = this.f2134r;
        boolean z2 = !this.f2129I;
        return AbstractC1687o.m4941j(c0789t, abstractC0312f, m1546J0(z2), m1545I0(z2), this, this.f2129I, this.f2140x);
    }

    /* renamed from: G0 */
    public final int m1543G0(C0789T c0789t) {
        if (m2247v() == 0) {
            return 0;
        }
        AbstractC0312f abstractC0312f = this.f2134r;
        boolean z2 = !this.f2129I;
        return AbstractC1687o.m4942k(c0789t, abstractC0312f, m1546J0(z2), m1545I0(z2), this, this.f2129I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* renamed from: H0 */
    public final int m1544H0(C0784N c0784n, C0819q c0819q, C0789T c0789t) {
        C0805e0 c0805e0;
        ?? r6;
        int i;
        int m2301h;
        int mo879c;
        int mo887k;
        int mo879c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.f2141y.set(0, this.f2132p, true);
        C0819q c0819q2 = this.f2138v;
        int i8 = c0819q2.f4162i ? c0819q.f4158e == 1 ? Integer.MAX_VALUE : SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED : c0819q.f4158e == 1 ? c0819q.f4160g + c0819q.f4155b : c0819q.f4159f - c0819q.f4155b;
        int i9 = c0819q.f4158e;
        for (int i10 = 0; i10 < this.f2132p; i10++) {
            if (!this.f2133q[i10].f4060a.isEmpty()) {
                m1569e1(this.f2133q[i10], i9, i8);
            }
        }
        int mo883g = this.f2140x ? this.f2134r.mo883g() : this.f2134r.mo887k();
        boolean z2 = false;
        while (true) {
            int i11 = c0819q.f4156c;
            if (((i11 < 0 || i11 >= c0789t.m2265b()) ? i6 : i7) == 0 || (!c0819q2.f4162i && this.f2141y.isEmpty())) {
                break;
            }
            View view = c0784n.m2260i(c0819q.f4156c, Long.MAX_VALUE).f3995a;
            c0819q.f4156c += c0819q.f4157d;
            C0799b0 c0799b0 = (C0799b0) view.getLayoutParams();
            int m2269b = c0799b0.f3947a.m2269b();
            C0043j c0043j = this.f2122B;
            int[] iArr = (int[]) c0043j.f141g;
            int i12 = (iArr == null || m2269b >= iArr.length) ? -1 : iArr[m2269b];
            if (i12 == -1) {
                if (m1560V0(c0819q.f4158e)) {
                    i5 = this.f2132p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f2132p;
                    i5 = i6;
                }
                C0805e0 c0805e02 = null;
                if (c0819q.f4158e == i7) {
                    int mo887k2 = this.f2134r.mo887k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        C0805e0 c0805e03 = this.f2133q[i5];
                        int m2299f = c0805e03.m2299f(mo887k2);
                        if (m2299f < i13) {
                            i13 = m2299f;
                            c0805e02 = c0805e03;
                        }
                        i5 += i3;
                    }
                } else {
                    int mo883g2 = this.f2134r.mo883g();
                    int i14 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                    while (i5 != i4) {
                        C0805e0 c0805e04 = this.f2133q[i5];
                        int m2301h2 = c0805e04.m2301h(mo883g2);
                        if (m2301h2 > i14) {
                            c0805e02 = c0805e04;
                            i14 = m2301h2;
                        }
                        i5 += i3;
                    }
                }
                c0805e0 = c0805e02;
                c0043j.m93w(m2269b);
                ((int[]) c0043j.f141g)[m2269b] = c0805e0.f4064e;
            } else {
                c0805e0 = this.f2133q[i12];
            }
            c0799b0.f4031e = c0805e0;
            if (c0819q.f4158e == 1) {
                r6 = 0;
                m2235b(-1, view, false);
            } else {
                r6 = 0;
                m2235b(0, view, false);
            }
            if (this.f2136t == 1) {
                i = 1;
                m1558T0(view, AbstractC0778H.m2223w(r6, this.f2137u, this.f3943l, r6, ((ViewGroup.MarginLayoutParams) c0799b0).width), AbstractC0778H.m2223w(true, this.f3946o, this.f3944m, m2228D() + m2231G(), ((ViewGroup.MarginLayoutParams) c0799b0).height));
            } else {
                i = 1;
                m1558T0(view, AbstractC0778H.m2223w(true, this.f3945n, this.f3943l, m2230F() + m2229E(), ((ViewGroup.MarginLayoutParams) c0799b0).width), AbstractC0778H.m2223w(false, this.f2137u, this.f3944m, 0, ((ViewGroup.MarginLayoutParams) c0799b0).height));
            }
            if (c0819q.f4158e == i) {
                mo879c = c0805e0.m2299f(mo883g);
                m2301h = this.f2134r.mo879c(view) + mo879c;
            } else {
                m2301h = c0805e0.m2301h(mo883g);
                mo879c = m2301h - this.f2134r.mo879c(view);
            }
            if (c0819q.f4158e == 1) {
                C0805e0 c0805e05 = c0799b0.f4031e;
                c0805e05.getClass();
                C0799b0 c0799b02 = (C0799b0) view.getLayoutParams();
                c0799b02.f4031e = c0805e05;
                ArrayList arrayList = c0805e05.f4060a;
                arrayList.add(view);
                c0805e05.f4062c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                if (arrayList.size() == 1) {
                    c0805e05.f4061b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                }
                if (c0799b02.f3947a.m2276i() || c0799b02.f3947a.m2279l()) {
                    c0805e05.f4063d = c0805e05.f4065f.f2134r.mo879c(view) + c0805e05.f4063d;
                }
            } else {
                C0805e0 c0805e06 = c0799b0.f4031e;
                c0805e06.getClass();
                C0799b0 c0799b03 = (C0799b0) view.getLayoutParams();
                c0799b03.f4031e = c0805e06;
                ArrayList arrayList2 = c0805e06.f4060a;
                arrayList2.add(0, view);
                c0805e06.f4061b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                if (arrayList2.size() == 1) {
                    c0805e06.f4062c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                }
                if (c0799b03.f3947a.m2276i() || c0799b03.f3947a.m2279l()) {
                    c0805e06.f4063d = c0805e06.f4065f.f2134r.mo879c(view) + c0805e06.f4063d;
                }
            }
            if (m1557S0() && this.f2136t == 1) {
                mo879c2 = this.f2135s.mo883g() - (((this.f2132p - 1) - c0805e0.f4064e) * this.f2137u);
                mo887k = mo879c2 - this.f2135s.mo879c(view);
            } else {
                mo887k = this.f2135s.mo887k() + (c0805e0.f4064e * this.f2137u);
                mo879c2 = this.f2135s.mo879c(view) + mo887k;
            }
            if (this.f2136t == 1) {
                AbstractC0778H.m2221N(view, mo887k, mo879c, mo879c2, m2301h);
            } else {
                AbstractC0778H.m2221N(view, mo879c, mo887k, m2301h, mo879c2);
            }
            m1569e1(c0805e0, c0819q2.f4158e, i8);
            m1562X0(c0784n, c0819q2);
            if (c0819q2.f4161h && view.hasFocusable()) {
                i2 = 0;
                this.f2141y.set(c0805e0.f4064e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            m1562X0(c0784n, c0819q2);
        }
        int mo887k3 = c0819q2.f4158e == -1 ? this.f2134r.mo887k() - m1554P0(this.f2134r.mo887k()) : m1552O0(this.f2134r.mo883g()) - this.f2134r.mo883g();
        return mo887k3 > 0 ? Math.min(c0819q.f4155b, mo887k3) : i15;
    }

    /* renamed from: I0 */
    public final View m1545I0(boolean z2) {
        int mo887k = this.f2134r.mo887k();
        int mo883g = this.f2134r.mo883g();
        View view = null;
        for (int m2247v = m2247v() - 1; m2247v >= 0; m2247v--) {
            View m2245u = m2245u(m2247v);
            int mo881e = this.f2134r.mo881e(m2245u);
            int mo878b = this.f2134r.mo878b(m2245u);
            if (mo878b > mo887k && mo881e < mo883g) {
                if (mo878b <= mo883g || !z2) {
                    return m2245u;
                }
                if (view == null) {
                    view = m2245u;
                }
            }
        }
        return view;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: J */
    public final int mo1404J(C0784N c0784n, C0789T c0789t) {
        return this.f2136t == 0 ? this.f2132p : super.mo1404J(c0784n, c0789t);
    }

    /* renamed from: J0 */
    public final View m1546J0(boolean z2) {
        int mo887k = this.f2134r.mo887k();
        int mo883g = this.f2134r.mo883g();
        int m2247v = m2247v();
        View view = null;
        for (int i = 0; i < m2247v; i++) {
            View m2245u = m2245u(i);
            int mo881e = this.f2134r.mo881e(m2245u);
            if (this.f2134r.mo878b(m2245u) > mo887k && mo881e < mo883g) {
                if (mo881e >= mo887k || !z2) {
                    return m2245u;
                }
                if (view == null) {
                    view = m2245u;
                }
            }
        }
        return view;
    }

    /* renamed from: K0 */
    public final void m1547K0(C0784N c0784n, C0789T c0789t, boolean z2) {
        int mo883g;
        int m1552O0 = m1552O0(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        if (m1552O0 != Integer.MIN_VALUE && (mo883g = this.f2134r.mo883g() - m1552O0) > 0) {
            int i = mo883g - (-m1566b1(-mo883g, c0784n, c0789t));
            if (!z2 || i <= 0) {
                return;
            }
            this.f2134r.mo892p(i);
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: L */
    public final boolean mo1447L() {
        return this.f2123C != 0;
    }

    /* renamed from: L0 */
    public final void m1548L0(C0784N c0784n, C0789T c0789t, boolean z2) {
        int mo887k;
        int m1554P0 = m1554P0(Integer.MAX_VALUE);
        if (m1554P0 != Integer.MAX_VALUE && (mo887k = m1554P0 - this.f2134r.mo887k()) > 0) {
            int m1566b1 = mo887k - m1566b1(mo887k, c0784n, c0789t);
            if (!z2 || m1566b1 <= 0) {
                return;
            }
            this.f2134r.mo892p(-m1566b1);
        }
    }

    /* renamed from: M0 */
    public final int m1549M0() {
        if (m2247v() == 0) {
            return 0;
        }
        return AbstractC0778H.m2218H(m2245u(0));
    }

    /* renamed from: N0 */
    public final int m1550N0() {
        int m2247v = m2247v();
        if (m2247v == 0) {
            return 0;
        }
        return AbstractC0778H.m2218H(m2245u(m2247v - 1));
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: O */
    public final void mo1551O(int i) {
        super.mo1551O(i);
        for (int i2 = 0; i2 < this.f2132p; i2++) {
            C0805e0 c0805e0 = this.f2133q[i2];
            int i3 = c0805e0.f4061b;
            if (i3 != Integer.MIN_VALUE) {
                c0805e0.f4061b = i3 + i;
            }
            int i4 = c0805e0.f4062c;
            if (i4 != Integer.MIN_VALUE) {
                c0805e0.f4062c = i4 + i;
            }
        }
    }

    /* renamed from: O0 */
    public final int m1552O0(int i) {
        int m2299f = this.f2133q[0].m2299f(i);
        for (int i2 = 1; i2 < this.f2132p; i2++) {
            int m2299f2 = this.f2133q[i2].m2299f(i);
            if (m2299f2 > m2299f) {
                m2299f = m2299f2;
            }
        }
        return m2299f;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: P */
    public final void mo1553P(int i) {
        super.mo1553P(i);
        for (int i2 = 0; i2 < this.f2132p; i2++) {
            C0805e0 c0805e0 = this.f2133q[i2];
            int i3 = c0805e0.f4061b;
            if (i3 != Integer.MIN_VALUE) {
                c0805e0.f4061b = i3 + i;
            }
            int i4 = c0805e0.f4062c;
            if (i4 != Integer.MIN_VALUE) {
                c0805e0.f4062c = i4 + i;
            }
        }
    }

    /* renamed from: P0 */
    public final int m1554P0(int i) {
        int m2301h = this.f2133q[0].m2301h(i);
        for (int i2 = 1; i2 < this.f2132p; i2++) {
            int m2301h2 = this.f2133q[i2].m2301h(i);
            if (m2301h2 < m2301h) {
                m2301h = m2301h2;
            }
        }
        return m2301h;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1555Q0(int i, int i2, int i3) {
        int i4;
        int i5;
        C0043j c0043j;
        int[] iArr;
        ArrayList arrayList;
        int i6;
        int m1550N0 = this.f2140x ? m1550N0() : m1549M0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                c0043j = this.f2122B;
                iArr = (int[]) c0043j.f141g;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) c0043j.f142h;
                    if (arrayList != null) {
                        C0801c0 c0801c0 = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                C0801c0 c0801c02 = (C0801c0) ((ArrayList) c0043j.f142h).get(size);
                                if (c0801c02.f4035a == i5) {
                                    c0801c0 = c0801c02;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (c0801c0 != null) {
                            ((ArrayList) c0043j.f142h).remove(c0801c0);
                        }
                        int size2 = ((ArrayList) c0043j.f142h).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((C0801c0) ((ArrayList) c0043j.f142h).get(i7)).f4035a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            C0801c0 c0801c03 = (C0801c0) ((ArrayList) c0043j.f142h).get(i7);
                            ((ArrayList) c0043j.f142h).remove(i7);
                            i6 = c0801c03.f4035a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) c0043j.f141g;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) c0043j.f141g).length;
                            } else {
                                Arrays.fill((int[]) c0043j.f141g, i5, i6 + 1, -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    c0043j.m66D(i, i2);
                } else if (i3 == 2) {
                    c0043j.m67E(i, i2);
                } else if (i3 == 8) {
                    c0043j.m67E(i, 1);
                    c0043j.m66D(i2, 1);
                }
                if (i4 > m1550N0) {
                    return;
                }
                if (i5 <= (this.f2140x ? m1549M0() : m1550N0())) {
                    m2241n0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        c0043j = this.f2122B;
        iArr = (int[]) c0043j.f141g;
        if (iArr != null) {
            arrayList = (ArrayList) c0043j.f142h;
            if (arrayList != null) {
            }
            i6 = -1;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > m1550N0) {
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: R */
    public final void mo1453R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3933b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2131K);
        }
        for (int i = 0; i < this.f2132p; i++) {
            this.f2133q[i].m2295b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m1556R0() {
        int m2247v = m2247v();
        int i = m2247v - 1;
        BitSet bitSet = new BitSet(this.f2132p);
        bitSet.set(0, this.f2132p, true);
        char c2 = (this.f2136t == 1 && m1557S0()) ? (char) 1 : (char) 65535;
        if (this.f2140x) {
            m2247v = -1;
        } else {
            i = 0;
        }
        int i2 = i < m2247v ? 1 : -1;
        while (i != m2247v) {
            View m2245u = m2245u(i);
            C0799b0 c0799b0 = (C0799b0) m2245u.getLayoutParams();
            if (bitSet.get(c0799b0.f4031e.f4064e)) {
                C0805e0 c0805e0 = c0799b0.f4031e;
                if (this.f2140x) {
                    int i3 = c0805e0.f4062c;
                    if (i3 == Integer.MIN_VALUE) {
                        c0805e0.m2294a();
                        i3 = c0805e0.f4062c;
                    }
                    if (i3 < this.f2134r.mo883g()) {
                        ArrayList arrayList = c0805e0.f4060a;
                        ((C0799b0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return m2245u;
                    }
                    bitSet.clear(c0799b0.f4031e.f4064e);
                } else {
                    int i4 = c0805e0.f4061b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) c0805e0.f4060a.get(0);
                        C0799b0 c0799b02 = (C0799b0) view.getLayoutParams();
                        c0805e0.f4061b = c0805e0.f4065f.f2134r.mo881e(view);
                        c0799b02.getClass();
                        i4 = c0805e0.f4061b;
                    }
                    if (i4 > this.f2134r.mo887k()) {
                        ((C0799b0) ((View) c0805e0.f4060a.get(0)).getLayoutParams()).getClass();
                        return m2245u;
                    }
                    bitSet.clear(c0799b0.f4031e.f4064e);
                }
            }
            i += i2;
            if (i != m2247v) {
                View m2245u2 = m2245u(i);
                if (this.f2140x) {
                    int mo878b = this.f2134r.mo878b(m2245u);
                    int mo878b2 = this.f2134r.mo878b(m2245u2);
                    if (mo878b < mo878b2) {
                        return m2245u;
                    }
                    if (mo878b == mo878b2) {
                        if ((c0799b0.f4031e.f4064e - ((C0799b0) m2245u2.getLayoutParams()).f4031e.f4064e >= 0) == (c2 >= 0)) {
                            return m2245u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int mo881e = this.f2134r.mo881e(m2245u);
                    int mo881e2 = this.f2134r.mo881e(m2245u2);
                    if (mo881e > mo881e2) {
                        return m2245u;
                    }
                    if (mo881e == mo881e2) {
                        if ((c0799b0.f4031e.f4064e - ((C0799b0) m2245u2.getLayoutParams()).f4031e.f4064e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004f, code lost:
    
        if (r8.f2136t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0054, code lost:
    
        if (r8.f2136t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0061, code lost:
    
        if (m1557S0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006e, code lost:
    
        if (m1557S0() == false) goto L46;
     */
    @Override // p068f0.AbstractC0778H
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1406S(View view, int i, C0784N c0784n, C0789T c0789t) {
        View m1490B;
        int i2;
        if (m2247v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView == null || (m1490B = recyclerView.m1490B(view)) == null || ((ArrayList) this.f3932a.f535d).contains(m1490B)) {
            m1490B = null;
        }
        if (m1490B == null) {
            return null;
        }
        m1565a1();
        if (i == 1) {
            if (this.f2136t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f2136t != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C0799b0 c0799b0 = (C0799b0) m1490B.getLayoutParams();
        c0799b0.getClass();
        C0805e0 c0805e0 = c0799b0.f4031e;
        int m1550N0 = i2 == 1 ? m1550N0() : m1549M0();
        m1568d1(m1550N0, c0789t);
        m1567c1(i2);
        C0819q c0819q = this.f2138v;
        c0819q.f4156c = c0819q.f4157d + m1550N0;
        c0819q.f4155b = (int) (this.f2134r.mo888l() * 0.33333334f);
        c0819q.f4161h = true;
        c0819q.f4154a = false;
        m1544H0(c0784n, c0819q, c0789t);
        this.f2124D = this.f2140x;
        View m2300g = c0805e0.m2300g(m1550N0, i2);
        if (m2300g != null && m2300g != m1490B) {
            return m2300g;
        }
        if (m1560V0(i2)) {
            for (int i3 = this.f2132p - 1; i3 >= 0; i3--) {
                View m2300g2 = this.f2133q[i3].m2300g(m1550N0, i2);
                if (m2300g2 != null && m2300g2 != m1490B) {
                    return m2300g2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f2132p; i4++) {
                View m2300g3 = this.f2133q[i4].m2300g(m1550N0, i2);
                if (m2300g3 != null && m2300g3 != m1490B) {
                    return m2300g3;
                }
            }
        }
        boolean z2 = (this.f2139w ^ true) == (i2 == -1);
        View mo1479q = mo1479q(z2 ? c0805e0.m2296c() : c0805e0.m2297d());
        if (mo1479q != null && mo1479q != m1490B) {
            return mo1479q;
        }
        if (m1560V0(i2)) {
            for (int i5 = this.f2132p - 1; i5 >= 0; i5--) {
                if (i5 != c0805e0.f4064e) {
                    View mo1479q2 = mo1479q(z2 ? this.f2133q[i5].m2296c() : this.f2133q[i5].m2297d());
                    if (mo1479q2 != null && mo1479q2 != m1490B) {
                        return mo1479q2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f2132p; i6++) {
                View mo1479q3 = mo1479q(z2 ? this.f2133q[i6].m2296c() : this.f2133q[i6].m2297d());
                if (mo1479q3 != null && mo1479q3 != m1490B) {
                    return mo1479q3;
                }
            }
        }
        return null;
    }

    /* renamed from: S0 */
    public final boolean m1557S0() {
        return m2227C() == 1;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: T */
    public final void mo1456T(AccessibilityEvent accessibilityEvent) {
        super.mo1456T(accessibilityEvent);
        if (m2247v() > 0) {
            View m1546J0 = m1546J0(false);
            View m1545I0 = m1545I0(false);
            if (m1546J0 == null || m1545I0 == null) {
                return;
            }
            int m2218H = AbstractC0778H.m2218H(m1546J0);
            int m2218H2 = AbstractC0778H.m2218H(m1545I0);
            if (m2218H < m2218H2) {
                accessibilityEvent.setFromIndex(m2218H);
                accessibilityEvent.setToIndex(m2218H2);
            } else {
                accessibilityEvent.setFromIndex(m2218H2);
                accessibilityEvent.setToIndex(m2218H);
            }
        }
    }

    /* renamed from: T0 */
    public final void m1558T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f3933b;
        Rect rect = this.f2127G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1497K(view));
        }
        C0799b0 c0799b0 = (C0799b0) view.getLayoutParams();
        int m1538f1 = m1538f1(i, ((ViewGroup.MarginLayoutParams) c0799b0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0799b0).rightMargin + rect.right);
        int m1538f12 = m1538f1(i2, ((ViewGroup.MarginLayoutParams) c0799b0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0799b0).bottomMargin + rect.bottom);
        if (m2249w0(view, m1538f1, m1538f12, c0799b0)) {
            view.measure(m1538f1, m1538f12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x040a, code lost:
    
        if (m1540D0() != false) goto L250;
     */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1559U0(C0784N c0784n, C0789T c0789t, boolean z2) {
        C0803d0 c0803d0;
        int i;
        int i2;
        C0803d0 c0803d02 = this.f2126F;
        C0797a0 c0797a0 = this.f2128H;
        if (!(c0803d02 == null && this.f2142z == -1) && c0789t.m2265b() == 0) {
            m2237i0(c0784n);
            c0797a0.m2285a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (c0797a0.f4026e && this.f2142z == -1 && this.f2126F == null) ? false : true;
        C0043j c0043j = this.f2122B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c0797a0.f4028g;
        if (z4) {
            c0797a0.m2285a();
            C0803d0 c0803d03 = this.f2126F;
            if (c0803d03 != null) {
                int i3 = c0803d03.f4046c;
                if (i3 > 0) {
                    if (i3 == this.f2132p) {
                        for (int i4 = 0; i4 < this.f2132p; i4++) {
                            this.f2133q[i4].m2295b();
                            C0803d0 c0803d04 = this.f2126F;
                            int i5 = c0803d04.f4047d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += c0803d04.f4052i ? this.f2134r.mo883g() : this.f2134r.mo887k();
                            }
                            C0805e0 c0805e0 = this.f2133q[i4];
                            c0805e0.f4061b = i5;
                            c0805e0.f4062c = i5;
                        }
                    } else {
                        c0803d03.f4047d = null;
                        c0803d03.f4046c = 0;
                        c0803d03.f4048e = 0;
                        c0803d03.f4049f = null;
                        c0803d03.f4050g = null;
                        c0803d03.f4044a = c0803d03.f4045b;
                    }
                }
                C0803d0 c0803d05 = this.f2126F;
                this.f2125E = c0803d05.f4053j;
                boolean z5 = c0803d05.f4051h;
                mo1465c(null);
                C0803d0 c0803d06 = this.f2126F;
                if (c0803d06 != null && c0803d06.f4051h != z5) {
                    c0803d06.f4051h = z5;
                }
                this.f2139w = z5;
                m2241n0();
                m1565a1();
                C0803d0 c0803d07 = this.f2126F;
                int i6 = c0803d07.f4044a;
                if (i6 != -1) {
                    this.f2142z = i6;
                    c0797a0.f4024c = c0803d07.f4052i;
                } else {
                    c0797a0.f4024c = this.f2140x;
                }
                if (c0803d07.f4048e > 1) {
                    c0043j.f141g = c0803d07.f4049f;
                    c0043j.f142h = c0803d07.f4050g;
                }
            } else {
                m1565a1();
                c0797a0.f4024c = this.f2140x;
            }
            if (!c0789t.f3979g && (i2 = this.f2142z) != -1) {
                if (i2 < 0 || i2 >= c0789t.m2265b()) {
                    this.f2142z = -1;
                    this.f2121A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                } else {
                    C0803d0 c0803d08 = this.f2126F;
                    if (c0803d08 == null || c0803d08.f4044a == -1 || c0803d08.f4046c < 1) {
                        View mo1479q = mo1479q(this.f2142z);
                        if (mo1479q != null) {
                            c0797a0.f4022a = this.f2140x ? m1550N0() : m1549M0();
                            if (this.f2121A != Integer.MIN_VALUE) {
                                if (c0797a0.f4024c) {
                                    c0797a0.f4023b = (this.f2134r.mo883g() - this.f2121A) - this.f2134r.mo878b(mo1479q);
                                } else {
                                    c0797a0.f4023b = (this.f2134r.mo887k() + this.f2121A) - this.f2134r.mo881e(mo1479q);
                                }
                            } else if (this.f2134r.mo879c(mo1479q) > this.f2134r.mo888l()) {
                                c0797a0.f4023b = c0797a0.f4024c ? this.f2134r.mo883g() : this.f2134r.mo887k();
                            } else {
                                int mo881e = this.f2134r.mo881e(mo1479q) - this.f2134r.mo887k();
                                if (mo881e < 0) {
                                    c0797a0.f4023b = -mo881e;
                                } else {
                                    int mo883g = this.f2134r.mo883g() - this.f2134r.mo878b(mo1479q);
                                    if (mo883g < 0) {
                                        c0797a0.f4023b = mo883g;
                                    } else {
                                        c0797a0.f4023b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f2142z;
                            c0797a0.f4022a = i7;
                            int i8 = this.f2121A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = m1539C0(i7) == 1;
                                c0797a0.f4024c = z6;
                                c0797a0.f4023b = z6 ? staggeredGridLayoutManager.f2134r.mo883g() : staggeredGridLayoutManager.f2134r.mo887k();
                            } else if (c0797a0.f4024c) {
                                c0797a0.f4023b = staggeredGridLayoutManager.f2134r.mo883g() - i8;
                            } else {
                                c0797a0.f4023b = staggeredGridLayoutManager.f2134r.mo887k() + i8;
                            }
                            c0797a0.f4025d = true;
                        }
                    } else {
                        c0797a0.f4023b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                        c0797a0.f4022a = this.f2142z;
                    }
                    c0797a0.f4026e = true;
                }
            }
            if (this.f2124D) {
                int m2265b = c0789t.m2265b();
                for (int m2247v = m2247v() - 1; m2247v >= 0; m2247v--) {
                    i = AbstractC0778H.m2218H(m2245u(m2247v));
                    if (i >= 0 && i < m2265b) {
                        break;
                    }
                }
                i = 0;
                c0797a0.f4022a = i;
                c0797a0.f4023b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                c0797a0.f4026e = true;
            } else {
                int m2265b2 = c0789t.m2265b();
                int m2247v2 = m2247v();
                for (int i9 = 0; i9 < m2247v2; i9++) {
                    int m2218H = AbstractC0778H.m2218H(m2245u(i9));
                    if (m2218H >= 0 && m2218H < m2265b2) {
                        i = m2218H;
                        break;
                    }
                }
                i = 0;
                c0797a0.f4022a = i;
                c0797a0.f4023b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                c0797a0.f4026e = true;
            }
        }
        if (this.f2126F == null && this.f2142z == -1 && (c0797a0.f4024c != this.f2124D || m1557S0() != this.f2125E)) {
            int[] iArr = (int[]) c0043j.f141g;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0043j.f142h = null;
            c0797a0.f4025d = true;
        }
        if (m2247v() > 0 && ((c0803d0 = this.f2126F) == null || c0803d0.f4046c < 1)) {
            if (c0797a0.f4025d) {
                for (int i10 = 0; i10 < this.f2132p; i10++) {
                    this.f2133q[i10].m2295b();
                    int i11 = c0797a0.f4023b;
                    if (i11 != Integer.MIN_VALUE) {
                        C0805e0 c0805e02 = this.f2133q[i10];
                        c0805e02.f4061b = i11;
                        c0805e02.f4062c = i11;
                    }
                }
            } else if (z4 || c0797a0.f4027f == null) {
                for (int i12 = 0; i12 < this.f2132p; i12++) {
                    C0805e0 c0805e03 = this.f2133q[i12];
                    boolean z7 = this.f2140x;
                    int i13 = c0797a0.f4023b;
                    int m2299f = z7 ? c0805e03.m2299f(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED) : c0805e03.m2301h(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
                    c0805e03.m2295b();
                    if (m2299f != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = c0805e03.f4065f;
                        if ((!z7 || m2299f >= staggeredGridLayoutManager2.f2134r.mo883g()) && (z7 || m2299f <= staggeredGridLayoutManager2.f2134r.mo887k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                m2299f += i13;
                            }
                            c0805e03.f4062c = m2299f;
                            c0805e03.f4061b = m2299f;
                        }
                    }
                }
                C0805e0[] c0805e0Arr = this.f2133q;
                int length = c0805e0Arr.length;
                int[] iArr2 = c0797a0.f4027f;
                if (iArr2 == null || iArr2.length < length) {
                    c0797a0.f4027f = new int[staggeredGridLayoutManager.f2133q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    c0797a0.f4027f[i14] = c0805e0Arr[i14].m2301h(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
                }
            } else {
                for (int i15 = 0; i15 < this.f2132p; i15++) {
                    C0805e0 c0805e04 = this.f2133q[i15];
                    c0805e04.m2295b();
                    int i16 = c0797a0.f4027f[i15];
                    c0805e04.f4061b = i16;
                    c0805e04.f4062c = i16;
                }
            }
        }
        m2242p(c0784n);
        C0819q c0819q = this.f2138v;
        c0819q.f4154a = false;
        int mo888l = this.f2135s.mo888l();
        this.f2137u = mo888l / this.f2132p;
        View.MeasureSpec.makeMeasureSpec(mo888l, this.f2135s.mo885i());
        m1568d1(c0797a0.f4022a, c0789t);
        if (c0797a0.f4024c) {
            m1567c1(-1);
            m1544H0(c0784n, c0819q, c0789t);
            m1567c1(1);
            c0819q.f4156c = c0797a0.f4022a + c0819q.f4157d;
            m1544H0(c0784n, c0819q, c0789t);
        } else {
            m1567c1(1);
            m1544H0(c0784n, c0819q, c0789t);
            m1567c1(-1);
            c0819q.f4156c = c0797a0.f4022a + c0819q.f4157d;
            m1544H0(c0784n, c0819q, c0789t);
        }
        if (this.f2135s.mo885i() != 1073741824) {
            int m2247v3 = m2247v();
            float f2 = 0.0f;
            for (int i17 = 0; i17 < m2247v3; i17++) {
                View m2245u = m2245u(i17);
                float mo879c = this.f2135s.mo879c(m2245u);
                if (mo879c >= f2) {
                    ((C0799b0) m2245u.getLayoutParams()).getClass();
                    f2 = Math.max(f2, mo879c);
                }
            }
            int i18 = this.f2137u;
            int round = Math.round(f2 * this.f2132p);
            if (this.f2135s.mo885i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2135s.mo888l());
            }
            this.f2137u = round / this.f2132p;
            View.MeasureSpec.makeMeasureSpec(round, this.f2135s.mo885i());
            if (this.f2137u != i18) {
                for (int i19 = 0; i19 < m2247v3; i19++) {
                    View m2245u2 = m2245u(i19);
                    C0799b0 c0799b0 = (C0799b0) m2245u2.getLayoutParams();
                    c0799b0.getClass();
                    if (m1557S0() && this.f2136t == 1) {
                        int i20 = -((this.f2132p - 1) - c0799b0.f4031e.f4064e);
                        m2245u2.offsetLeftAndRight((this.f2137u * i20) - (i20 * i18));
                    } else {
                        int i21 = c0799b0.f4031e.f4064e;
                        int i22 = this.f2137u * i21;
                        int i23 = i21 * i18;
                        if (this.f2136t == 1) {
                            m2245u2.offsetLeftAndRight(i22 - i23);
                        } else {
                            m2245u2.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (m2247v() > 0) {
            if (this.f2140x) {
                m1547K0(c0784n, c0789t, true);
                m1548L0(c0784n, c0789t, false);
            } else {
                m1548L0(c0784n, c0789t, true);
                m1547K0(c0784n, c0789t, false);
            }
        }
        if (z2 && !c0789t.f3979g && this.f2123C != 0 && m2247v() > 0 && m1556R0() != null) {
            RecyclerView recyclerView = this.f3933b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f2131K);
            }
        }
        z3 = false;
        if (c0789t.f3979g) {
            c0797a0.m2285a();
        }
        this.f2124D = c0797a0.f4024c;
        this.f2125E = m1557S0();
        if (z3) {
            c0797a0.m2285a();
            m1559U0(c0784n, c0789t, false);
        }
    }

    /* renamed from: V0 */
    public final boolean m1560V0(int i) {
        if (this.f2136t == 0) {
            return (i == -1) != this.f2140x;
        }
        return ((i == -1) == this.f2140x) == m1557S0();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: W */
    public final void mo1407W(C0784N c0784n, C0789T c0789t, View view, C0240j c0240j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0799b0)) {
            m2234V(view, c0240j);
            return;
        }
        C0799b0 c0799b0 = (C0799b0) layoutParams;
        if (this.f2136t == 0) {
            C0805e0 c0805e0 = c0799b0.f4031e;
            c0240j.m735h(C0239i.m727a(false, c0805e0 == null ? -1 : c0805e0.f4064e, 1, -1, -1));
        } else {
            C0805e0 c0805e02 = c0799b0.f4031e;
            c0240j.m735h(C0239i.m727a(false, -1, -1, c0805e02 == null ? -1 : c0805e02.f4064e, 1));
        }
    }

    /* renamed from: W0 */
    public final void m1561W0(int i, C0789T c0789t) {
        int m1549M0;
        int i2;
        if (i > 0) {
            m1549M0 = m1550N0();
            i2 = 1;
        } else {
            m1549M0 = m1549M0();
            i2 = -1;
        }
        C0819q c0819q = this.f2138v;
        c0819q.f4154a = true;
        m1568d1(m1549M0, c0789t);
        m1567c1(i2);
        c0819q.f4156c = m1549M0 + c0819q.f4157d;
        c0819q.f4155b = Math.abs(i);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: X */
    public final void mo1409X(int i, int i2) {
        m1555Q0(i, i2, 1);
    }

    /* renamed from: X0 */
    public final void m1562X0(C0784N c0784n, C0819q c0819q) {
        if (!c0819q.f4154a || c0819q.f4162i) {
            return;
        }
        if (c0819q.f4155b == 0) {
            if (c0819q.f4158e == -1) {
                m1563Y0(c0784n, c0819q.f4160g);
                return;
            } else {
                m1564Z0(c0784n, c0819q.f4159f);
                return;
            }
        }
        int i = 1;
        if (c0819q.f4158e == -1) {
            int i2 = c0819q.f4159f;
            int m2301h = this.f2133q[0].m2301h(i2);
            while (i < this.f2132p) {
                int m2301h2 = this.f2133q[i].m2301h(i2);
                if (m2301h2 > m2301h) {
                    m2301h = m2301h2;
                }
                i++;
            }
            int i3 = i2 - m2301h;
            m1563Y0(c0784n, i3 < 0 ? c0819q.f4160g : c0819q.f4160g - Math.min(i3, c0819q.f4155b));
            return;
        }
        int i4 = c0819q.f4160g;
        int m2299f = this.f2133q[0].m2299f(i4);
        while (i < this.f2132p) {
            int m2299f2 = this.f2133q[i].m2299f(i4);
            if (m2299f2 < m2299f) {
                m2299f = m2299f2;
            }
            i++;
        }
        int i5 = m2299f - c0819q.f4160g;
        m1564Z0(c0784n, i5 < 0 ? c0819q.f4159f : Math.min(i5, c0819q.f4155b) + c0819q.f4159f);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: Y */
    public final void mo1411Y() {
        C0043j c0043j = this.f2122B;
        int[] iArr = (int[]) c0043j.f141g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0043j.f142h = null;
        m2241n0();
    }

    /* renamed from: Y0 */
    public final void m1563Y0(C0784N c0784n, int i) {
        for (int m2247v = m2247v() - 1; m2247v >= 0; m2247v--) {
            View m2245u = m2245u(m2247v);
            if (this.f2134r.mo881e(m2245u) < i || this.f2134r.mo891o(m2245u) < i) {
                return;
            }
            C0799b0 c0799b0 = (C0799b0) m2245u.getLayoutParams();
            c0799b0.getClass();
            if (c0799b0.f4031e.f4060a.size() == 1) {
                return;
            }
            C0805e0 c0805e0 = c0799b0.f4031e;
            ArrayList arrayList = c0805e0.f4060a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C0799b0 c0799b02 = (C0799b0) view.getLayoutParams();
            c0799b02.f4031e = null;
            if (c0799b02.f3947a.m2276i() || c0799b02.f3947a.m2279l()) {
                c0805e0.f4063d -= c0805e0.f4065f.f2134r.mo879c(view);
            }
            if (size == 1) {
                c0805e0.f4061b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            }
            c0805e0.f4062c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            m2239k0(m2245u, c0784n);
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: Z */
    public final void mo1412Z(int i, int i2) {
        m1555Q0(i, i2, 8);
    }

    /* renamed from: Z0 */
    public final void m1564Z0(C0784N c0784n, int i) {
        while (m2247v() > 0) {
            View m2245u = m2245u(0);
            if (this.f2134r.mo878b(m2245u) > i || this.f2134r.mo890n(m2245u) > i) {
                return;
            }
            C0799b0 c0799b0 = (C0799b0) m2245u.getLayoutParams();
            c0799b0.getClass();
            if (c0799b0.f4031e.f4060a.size() == 1) {
                return;
            }
            C0805e0 c0805e0 = c0799b0.f4031e;
            ArrayList arrayList = c0805e0.f4060a;
            View view = (View) arrayList.remove(0);
            C0799b0 c0799b02 = (C0799b0) view.getLayoutParams();
            c0799b02.f4031e = null;
            if (arrayList.size() == 0) {
                c0805e0.f4062c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            }
            if (c0799b02.f3947a.m2276i() || c0799b02.f3947a.m2279l()) {
                c0805e0.f4063d -= c0805e0.f4065f.f2134r.mo879c(view);
            }
            c0805e0.f4061b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            m2239k0(m2245u, c0784n);
        }
    }

    @Override // p068f0.InterfaceC0788S
    /* renamed from: a */
    public final PointF mo1462a(int i) {
        int m1539C0 = m1539C0(i);
        PointF pointF = new PointF();
        if (m1539C0 == 0) {
            return null;
        }
        if (this.f2136t == 0) {
            pointF.x = m1539C0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m1539C0;
        }
        return pointF;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: a0 */
    public final void mo1413a0(int i, int i2) {
        m1555Q0(i, i2, 2);
    }

    /* renamed from: a1 */
    public final void m1565a1() {
        if (this.f2136t == 1 || !m1557S0()) {
            this.f2140x = this.f2139w;
        } else {
            this.f2140x = !this.f2139w;
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: b0 */
    public final void mo1414b0(int i, int i2) {
        m1555Q0(i, i2, 4);
    }

    /* renamed from: b1 */
    public final int m1566b1(int i, C0784N c0784n, C0789T c0789t) {
        if (m2247v() == 0 || i == 0) {
            return 0;
        }
        m1561W0(i, c0789t);
        C0819q c0819q = this.f2138v;
        int m1544H0 = m1544H0(c0784n, c0819q, c0789t);
        if (c0819q.f4155b >= m1544H0) {
            i = i < 0 ? -m1544H0 : m1544H0;
        }
        this.f2134r.mo892p(-i);
        this.f2124D = this.f2140x;
        c0819q.f4155b = 0;
        m1562X0(c0784n, c0819q);
        return i;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: c */
    public final void mo1465c(String str) {
        if (this.f2126F == null) {
            super.mo1465c(str);
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: c0 */
    public final void mo1415c0(C0784N c0784n, C0789T c0789t) {
        m1559U0(c0784n, c0789t, true);
    }

    /* renamed from: c1 */
    public final void m1567c1(int i) {
        C0819q c0819q = this.f2138v;
        c0819q.f4158e = i;
        c0819q.f4157d = this.f2140x != (i == -1) ? -1 : 1;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: d */
    public final boolean mo1467d() {
        return this.f2136t == 0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: d0 */
    public final void mo1416d0(C0789T c0789t) {
        this.f2142z = -1;
        this.f2121A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f2126F = null;
        this.f2128H.m2285a();
    }

    /* renamed from: d1 */
    public final void m1568d1(int i, C0789T c0789t) {
        int i2;
        int i3;
        int i4;
        C0819q c0819q = this.f2138v;
        boolean z2 = false;
        c0819q.f4155b = 0;
        c0819q.f4156c = i;
        C0824v c0824v = this.f3936e;
        if (!(c0824v != null && c0824v.f4191e) || (i4 = c0789t.f3973a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f2140x == (i4 < i)) {
                i2 = this.f2134r.mo888l();
                i3 = 0;
            } else {
                i3 = this.f2134r.mo888l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView == null || !recyclerView.f2093l) {
            c0819q.f4160g = this.f2134r.mo882f() + i2;
            c0819q.f4159f = -i3;
        } else {
            c0819q.f4159f = this.f2134r.mo887k() - i3;
            c0819q.f4160g = this.f2134r.mo883g() + i2;
        }
        c0819q.f4161h = false;
        c0819q.f4154a = true;
        if (this.f2134r.mo885i() == 0 && this.f2134r.mo882f() == 0) {
            z2 = true;
        }
        c0819q.f4162i = z2;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: e */
    public final boolean mo1468e() {
        return this.f2136t == 1;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: e0 */
    public final void mo1469e0(Parcelable parcelable) {
        if (parcelable instanceof C0803d0) {
            this.f2126F = (C0803d0) parcelable;
            m2241n0();
        }
    }

    /* renamed from: e1 */
    public final void m1569e1(C0805e0 c0805e0, int i, int i2) {
        int i3 = c0805e0.f4063d;
        int i4 = c0805e0.f4064e;
        if (i != -1) {
            int i5 = c0805e0.f4062c;
            if (i5 == Integer.MIN_VALUE) {
                c0805e0.m2294a();
                i5 = c0805e0.f4062c;
            }
            if (i5 - i3 >= i2) {
                this.f2141y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c0805e0.f4061b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) c0805e0.f4060a.get(0);
            C0799b0 c0799b0 = (C0799b0) view.getLayoutParams();
            c0805e0.f4061b = c0805e0.f4065f.f2134r.mo881e(view);
            c0799b0.getClass();
            i6 = c0805e0.f4061b;
        }
        if (i6 + i3 <= i2) {
            this.f2141y.set(i4, false);
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: f */
    public final boolean mo1418f(C0779I c0779i) {
        return c0779i instanceof C0799b0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: f0 */
    public final Parcelable mo1471f0() {
        int m2301h;
        int mo887k;
        int[] iArr;
        C0803d0 c0803d0 = this.f2126F;
        if (c0803d0 != null) {
            C0803d0 c0803d02 = new C0803d0();
            c0803d02.f4046c = c0803d0.f4046c;
            c0803d02.f4044a = c0803d0.f4044a;
            c0803d02.f4045b = c0803d0.f4045b;
            c0803d02.f4047d = c0803d0.f4047d;
            c0803d02.f4048e = c0803d0.f4048e;
            c0803d02.f4049f = c0803d0.f4049f;
            c0803d02.f4051h = c0803d0.f4051h;
            c0803d02.f4052i = c0803d0.f4052i;
            c0803d02.f4053j = c0803d0.f4053j;
            c0803d02.f4050g = c0803d0.f4050g;
            return c0803d02;
        }
        C0803d0 c0803d03 = new C0803d0();
        c0803d03.f4051h = this.f2139w;
        c0803d03.f4052i = this.f2124D;
        c0803d03.f4053j = this.f2125E;
        C0043j c0043j = this.f2122B;
        if (c0043j == null || (iArr = (int[]) c0043j.f141g) == null) {
            c0803d03.f4048e = 0;
        } else {
            c0803d03.f4049f = iArr;
            c0803d03.f4048e = iArr.length;
            c0803d03.f4050g = (ArrayList) c0043j.f142h;
        }
        if (m2247v() > 0) {
            c0803d03.f4044a = this.f2124D ? m1550N0() : m1549M0();
            View m1545I0 = this.f2140x ? m1545I0(true) : m1546J0(true);
            c0803d03.f4045b = m1545I0 != null ? AbstractC0778H.m2218H(m1545I0) : -1;
            int i = this.f2132p;
            c0803d03.f4046c = i;
            c0803d03.f4047d = new int[i];
            for (int i2 = 0; i2 < this.f2132p; i2++) {
                if (this.f2124D) {
                    m2301h = this.f2133q[i2].m2299f(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
                    if (m2301h != Integer.MIN_VALUE) {
                        mo887k = this.f2134r.mo883g();
                        m2301h -= mo887k;
                        c0803d03.f4047d[i2] = m2301h;
                    } else {
                        c0803d03.f4047d[i2] = m2301h;
                    }
                } else {
                    m2301h = this.f2133q[i2].m2301h(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
                    if (m2301h != Integer.MIN_VALUE) {
                        mo887k = this.f2134r.mo887k();
                        m2301h -= mo887k;
                        c0803d03.f4047d[i2] = m2301h;
                    } else {
                        c0803d03.f4047d[i2] = m2301h;
                    }
                }
            }
        } else {
            c0803d03.f4044a = -1;
            c0803d03.f4045b = -1;
            c0803d03.f4046c = 0;
        }
        return c0803d03;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: g0 */
    public final void mo1570g0(int i) {
        if (i == 0) {
            m1540D0();
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: h */
    public final void mo1474h(int i, int i2, C0789T c0789t, C0815m c0815m) {
        C0819q c0819q;
        int m2299f;
        int i3;
        if (this.f2136t != 0) {
            i = i2;
        }
        if (m2247v() == 0 || i == 0) {
            return;
        }
        m1561W0(i, c0789t);
        int[] iArr = this.f2130J;
        if (iArr == null || iArr.length < this.f2132p) {
            this.f2130J = new int[this.f2132p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f2132p;
            c0819q = this.f2138v;
            if (i4 >= i6) {
                break;
            }
            if (c0819q.f4157d == -1) {
                m2299f = c0819q.f4159f;
                i3 = this.f2133q[i4].m2301h(m2299f);
            } else {
                m2299f = this.f2133q[i4].m2299f(c0819q.f4160g);
                i3 = c0819q.f4160g;
            }
            int i7 = m2299f - i3;
            if (i7 >= 0) {
                this.f2130J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f2130J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0819q.f4156c;
            if (i9 < 0 || i9 >= c0789t.m2265b()) {
                return;
            }
            c0815m.m2315a(c0819q.f4156c, this.f2130J[i8]);
            c0819q.f4156c += c0819q.f4157d;
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: j */
    public final int mo1476j(C0789T c0789t) {
        return m1541E0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: k */
    public final int mo1422k(C0789T c0789t) {
        return m1542F0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: l */
    public final int mo1424l(C0789T c0789t) {
        return m1543G0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: m */
    public final int mo1477m(C0789T c0789t) {
        return m1541E0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: n */
    public final int mo1427n(C0789T c0789t) {
        return m1542F0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: o */
    public final int mo1429o(C0789T c0789t) {
        return m1543G0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: o0 */
    public final int mo1430o0(int i, C0784N c0784n, C0789T c0789t) {
        return m1566b1(i, c0784n, c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: p0 */
    public final void mo1478p0(int i) {
        C0803d0 c0803d0 = this.f2126F;
        if (c0803d0 != null && c0803d0.f4044a != i) {
            c0803d0.f4047d = null;
            c0803d0.f4046c = 0;
            c0803d0.f4044a = -1;
            c0803d0.f4045b = -1;
        }
        this.f2142z = i;
        this.f2121A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        m2241n0();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: q0 */
    public final int mo1433q0(int i, C0784N c0784n, C0789T c0789t) {
        return m1566b1(i, c0784n, c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: r */
    public final C0779I mo1434r() {
        return this.f2136t == 0 ? new C0799b0(-2, -1) : new C0799b0(-1, -2);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: s */
    public final C0779I mo1435s(Context context, AttributeSet attributeSet) {
        return new C0799b0(context, attributeSet);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: t */
    public final C0779I mo1436t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0799b0((ViewGroup.MarginLayoutParams) layoutParams) : new C0799b0(layoutParams);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: t0 */
    public final void mo1437t0(Rect rect, int i, int i2) {
        int m2222g;
        int m2222g2;
        int i3 = this.f2132p;
        int m2230F = m2230F() + m2229E();
        int m2228D = m2228D() + m2231G();
        if (this.f2136t == 1) {
            int height = rect.height() + m2228D;
            RecyclerView recyclerView = this.f3933b;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            m2222g2 = AbstractC0778H.m2222g(i2, height, recyclerView.getMinimumHeight());
            m2222g = AbstractC0778H.m2222g(i, (this.f2137u * i3) + m2230F, this.f3933b.getMinimumWidth());
        } else {
            int width = rect.width() + m2230F;
            RecyclerView recyclerView2 = this.f3933b;
            WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
            m2222g = AbstractC0778H.m2222g(i, width, recyclerView2.getMinimumWidth());
            m2222g2 = AbstractC0778H.m2222g(i2, (this.f2137u * i3) + m2228D, this.f3933b.getMinimumHeight());
        }
        this.f3933b.setMeasuredDimension(m2222g, m2222g2);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: x */
    public final int mo1438x(C0784N c0784n, C0789T c0789t) {
        return this.f2136t == 1 ? this.f2132p : super.mo1438x(c0784n, c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: z0 */
    public final void mo1481z0(RecyclerView recyclerView, int i) {
        C0824v c0824v = new C0824v(recyclerView.getContext());
        c0824v.f4187a = i;
        m2225A0(c0824v);
    }
}
