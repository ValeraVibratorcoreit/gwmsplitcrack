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
import java.util.List;
import p006C.AbstractC0062j;
import p038T.AbstractC0312f;
import p068f0.AbstractC0778H;
import p068f0.AbstractC0792W;
import p068f0.C0777G;
import p068f0.C0779I;
import p068f0.C0784N;
import p068f0.C0789T;
import p068f0.C0815m;
import p068f0.C0820r;
import p068f0.C0821s;
import p068f0.C0822t;
import p068f0.C0823u;
import p068f0.C0824v;
import p068f0.InterfaceC0788S;
import p121y0.AbstractC1687o;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0778H implements InterfaceC0788S {

    /* renamed from: A */
    public final C0820r f2035A;

    /* renamed from: B */
    public final C0821s f2036B;

    /* renamed from: C */
    public final int f2037C;

    /* renamed from: D */
    public final int[] f2038D;

    /* renamed from: p */
    public int f2039p;

    /* renamed from: q */
    public C0822t f2040q;

    /* renamed from: r */
    public AbstractC0312f f2041r;

    /* renamed from: s */
    public boolean f2042s;

    /* renamed from: t */
    public final boolean f2043t;

    /* renamed from: u */
    public boolean f2044u;

    /* renamed from: v */
    public boolean f2045v;

    /* renamed from: w */
    public final boolean f2046w;

    /* renamed from: x */
    public int f2047x;

    /* renamed from: y */
    public int f2048y;

    /* renamed from: z */
    public C0823u f2049z;

    public LinearLayoutManager(int i) {
        this.f2039p = 1;
        this.f2043t = false;
        this.f2044u = false;
        this.f2045v = false;
        this.f2046w = true;
        this.f2047x = -1;
        this.f2048y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f2049z = null;
        this.f2035A = new C0820r();
        this.f2036B = new C0821s();
        this.f2037C = 2;
        this.f2038D = new int[2];
        m1466c1(i);
        mo1465c(null);
        if (this.f2043t) {
            this.f2043t = false;
            m2241n0();
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: B0 */
    public boolean mo1402B0() {
        return this.f2049z == null && this.f2042s == this.f2045v;
    }

    /* renamed from: C0 */
    public void mo1439C0(C0789T c0789t, int[] iArr) {
        int i;
        int mo888l = c0789t.f3973a != -1 ? this.f2041r.mo888l() : 0;
        if (this.f2040q.f4177f == -1) {
            i = 0;
        } else {
            i = mo888l;
            mo888l = 0;
        }
        iArr[0] = mo888l;
        iArr[1] = i;
    }

    /* renamed from: D0 */
    public void mo1403D0(C0789T c0789t, C0822t c0822t, C0815m c0815m) {
        int i = c0822t.f4175d;
        if (i < 0 || i >= c0789t.m2265b()) {
            return;
        }
        c0815m.m2315a(i, Math.max(0, c0822t.f4178g));
    }

    /* renamed from: E0 */
    public final int m1440E0(C0789T c0789t) {
        if (m2247v() == 0) {
            return 0;
        }
        m1444I0();
        AbstractC0312f abstractC0312f = this.f2041r;
        boolean z2 = !this.f2046w;
        return AbstractC1687o.m4940i(c0789t, abstractC0312f, m1448L0(z2), m1446K0(z2), this, this.f2046w);
    }

    /* renamed from: F0 */
    public final int m1441F0(C0789T c0789t) {
        if (m2247v() == 0) {
            return 0;
        }
        m1444I0();
        AbstractC0312f abstractC0312f = this.f2041r;
        boolean z2 = !this.f2046w;
        return AbstractC1687o.m4941j(c0789t, abstractC0312f, m1448L0(z2), m1446K0(z2), this, this.f2046w, this.f2044u);
    }

    /* renamed from: G0 */
    public final int m1442G0(C0789T c0789t) {
        if (m2247v() == 0) {
            return 0;
        }
        m1444I0();
        AbstractC0312f abstractC0312f = this.f2041r;
        boolean z2 = !this.f2046w;
        return AbstractC1687o.m4942k(c0789t, abstractC0312f, m1448L0(z2), m1446K0(z2), this, this.f2046w);
    }

    /* renamed from: H0 */
    public final int m1443H0(int i) {
        if (i == 1) {
            return (this.f2039p != 1 && m1459V0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2039p != 1 && m1459V0()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f2039p == 0) {
                return -1;
            }
            return SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i == 33) {
            if (this.f2039p == 1) {
                return -1;
            }
            return SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i == 66) {
            if (this.f2039p == 0) {
                return 1;
            }
            return SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i == 130 && this.f2039p == 1) {
            return 1;
        }
        return SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    }

    /* renamed from: I0 */
    public final void m1444I0() {
        if (this.f2040q == null) {
            C0822t c0822t = new C0822t();
            c0822t.f4172a = true;
            c0822t.f4179h = 0;
            c0822t.f4180i = 0;
            c0822t.f4182k = null;
            this.f2040q = c0822t;
        }
    }

    /* renamed from: J0 */
    public final int m1445J0(C0784N c0784n, C0822t c0822t, C0789T c0789t, boolean z2) {
        int i;
        int i2 = c0822t.f4174c;
        int i3 = c0822t.f4178g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0822t.f4178g = i3 + i2;
            }
            m1460Y0(c0784n, c0822t);
        }
        int i4 = c0822t.f4174c + c0822t.f4179h;
        while (true) {
            if ((!c0822t.f4183l && i4 <= 0) || (i = c0822t.f4175d) < 0 || i >= c0789t.m2265b()) {
                break;
            }
            C0821s c0821s = this.f2036B;
            c0821s.f4168a = 0;
            c0821s.f4169b = false;
            c0821s.f4170c = false;
            c0821s.f4171d = false;
            mo1408W0(c0784n, c0789t, c0822t, c0821s);
            if (!c0821s.f4169b) {
                int i5 = c0822t.f4173b;
                int i6 = c0821s.f4168a;
                c0822t.f4173b = (c0822t.f4177f * i6) + i5;
                if (!c0821s.f4170c || c0822t.f4182k != null || !c0789t.f3979g) {
                    c0822t.f4174c -= i6;
                    i4 -= i6;
                }
                int i7 = c0822t.f4178g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0822t.f4178g = i8;
                    int i9 = c0822t.f4174c;
                    if (i9 < 0) {
                        c0822t.f4178g = i8 + i9;
                    }
                    m1460Y0(c0784n, c0822t);
                }
                if (z2 && c0821s.f4171d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0822t.f4174c;
    }

    /* renamed from: K0 */
    public final View m1446K0(boolean z2) {
        return this.f2044u ? m1452P0(0, z2, m2247v()) : m1452P0(m2247v() - 1, z2, -1);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: L */
    public final boolean mo1447L() {
        return true;
    }

    /* renamed from: L0 */
    public final View m1448L0(boolean z2) {
        return this.f2044u ? m1452P0(m2247v() - 1, z2, -1) : m1452P0(0, z2, m2247v());
    }

    /* renamed from: M0 */
    public final int m1449M0() {
        View m1452P0 = m1452P0(0, false, m2247v());
        if (m1452P0 == null) {
            return -1;
        }
        return AbstractC0778H.m2218H(m1452P0);
    }

    /* renamed from: N0 */
    public final int m1450N0() {
        View m1452P0 = m1452P0(m2247v() - 1, false, -1);
        if (m1452P0 == null) {
            return -1;
        }
        return AbstractC0778H.m2218H(m1452P0);
    }

    /* renamed from: O0 */
    public final View m1451O0(int i, int i2) {
        int i3;
        int i4;
        m1444I0();
        if (i2 <= i && i2 >= i) {
            return m2245u(i);
        }
        if (this.f2041r.mo881e(m2245u(i)) < this.f2041r.mo887k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f2039p == 0 ? this.f3934c.m94y(i, i2, i3, i4) : this.f3935d.m94y(i, i2, i3, i4);
    }

    /* renamed from: P0 */
    public final View m1452P0(int i, boolean z2, int i2) {
        m1444I0();
        int i3 = z2 ? 24579 : 320;
        return this.f2039p == 0 ? this.f3934c.m94y(i, i2, i3, 320) : this.f3935d.m94y(i, i2, i3, 320);
    }

    /* renamed from: Q0 */
    public View mo1405Q0(C0784N c0784n, C0789T c0789t, int i, int i2, int i3) {
        m1444I0();
        int mo887k = this.f2041r.mo887k();
        int mo883g = this.f2041r.mo883g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m2245u = m2245u(i);
            int m2218H = AbstractC0778H.m2218H(m2245u);
            if (m2218H >= 0 && m2218H < i3) {
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

    @Override // p068f0.AbstractC0778H
    /* renamed from: R */
    public final void mo1453R(RecyclerView recyclerView) {
    }

    /* renamed from: R0 */
    public final int m1454R0(int i, C0784N c0784n, C0789T c0789t, boolean z2) {
        int mo883g;
        int mo883g2 = this.f2041r.mo883g() - i;
        if (mo883g2 <= 0) {
            return 0;
        }
        int i2 = -m1464b1(-mo883g2, c0784n, c0789t);
        int i3 = i + i2;
        if (!z2 || (mo883g = this.f2041r.mo883g() - i3) <= 0) {
            return i2;
        }
        this.f2041r.mo892p(mo883g);
        return mo883g + i2;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: S */
    public View mo1406S(View view, int i, C0784N c0784n, C0789T c0789t) {
        int m1443H0;
        m1463a1();
        if (m2247v() == 0 || (m1443H0 = m1443H0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m1444I0();
        m1470e1(m1443H0, (int) (this.f2041r.mo888l() * 0.33333334f), false, c0789t);
        C0822t c0822t = this.f2040q;
        c0822t.f4178g = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0822t.f4172a = false;
        m1445J0(c0784n, c0822t, c0789t, true);
        View m1451O0 = m1443H0 == -1 ? this.f2044u ? m1451O0(m2247v() - 1, -1) : m1451O0(0, m2247v()) : this.f2044u ? m1451O0(0, m2247v()) : m1451O0(m2247v() - 1, -1);
        View m1458U0 = m1443H0 == -1 ? m1458U0() : m1457T0();
        if (!m1458U0.hasFocusable()) {
            return m1451O0;
        }
        if (m1451O0 == null) {
            return null;
        }
        return m1458U0;
    }

    /* renamed from: S0 */
    public final int m1455S0(int i, C0784N c0784n, C0789T c0789t, boolean z2) {
        int mo887k;
        int mo887k2 = i - this.f2041r.mo887k();
        if (mo887k2 <= 0) {
            return 0;
        }
        int i2 = -m1464b1(mo887k2, c0784n, c0789t);
        int i3 = i + i2;
        if (!z2 || (mo887k = i3 - this.f2041r.mo887k()) <= 0) {
            return i2;
        }
        this.f2041r.mo892p(-mo887k);
        return i2 - mo887k;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: T */
    public final void mo1456T(AccessibilityEvent accessibilityEvent) {
        super.mo1456T(accessibilityEvent);
        if (m2247v() > 0) {
            accessibilityEvent.setFromIndex(m1449M0());
            accessibilityEvent.setToIndex(m1450N0());
        }
    }

    /* renamed from: T0 */
    public final View m1457T0() {
        return m2245u(this.f2044u ? 0 : m2247v() - 1);
    }

    /* renamed from: U0 */
    public final View m1458U0() {
        return m2245u(this.f2044u ? m2247v() - 1 : 0);
    }

    /* renamed from: V0 */
    public final boolean m1459V0() {
        return m2227C() == 1;
    }

    /* renamed from: W0 */
    public void mo1408W0(C0784N c0784n, C0789T c0789t, C0822t c0822t, C0821s c0821s) {
        int i;
        int i2;
        int i3;
        int i4;
        View m2325b = c0822t.m2325b(c0784n);
        if (m2325b == null) {
            c0821s.f4169b = true;
            return;
        }
        C0779I c0779i = (C0779I) m2325b.getLayoutParams();
        if (c0822t.f4182k == null) {
            if (this.f2044u == (c0822t.f4177f == -1)) {
                m2235b(-1, m2325b, false);
            } else {
                m2235b(0, m2325b, false);
            }
        } else {
            if (this.f2044u == (c0822t.f4177f == -1)) {
                m2235b(-1, m2325b, true);
            } else {
                m2235b(0, m2325b, true);
            }
        }
        C0779I c0779i2 = (C0779I) m2325b.getLayoutParams();
        Rect m1497K = this.f3933b.m1497K(m2325b);
        int i5 = m1497K.left + m1497K.right;
        int i6 = m1497K.top + m1497K.bottom;
        int m2223w = AbstractC0778H.m2223w(mo1467d(), this.f3945n, this.f3943l, m2230F() + m2229E() + ((ViewGroup.MarginLayoutParams) c0779i2).leftMargin + ((ViewGroup.MarginLayoutParams) c0779i2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) c0779i2).width);
        int m2223w2 = AbstractC0778H.m2223w(mo1468e(), this.f3946o, this.f3944m, m2228D() + m2231G() + ((ViewGroup.MarginLayoutParams) c0779i2).topMargin + ((ViewGroup.MarginLayoutParams) c0779i2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) c0779i2).height);
        if (m2249w0(m2325b, m2223w, m2223w2, c0779i2)) {
            m2325b.measure(m2223w, m2223w2);
        }
        c0821s.f4168a = this.f2041r.mo879c(m2325b);
        if (this.f2039p == 1) {
            if (m1459V0()) {
                i4 = this.f3945n - m2230F();
                i = i4 - this.f2041r.mo880d(m2325b);
            } else {
                i = m2229E();
                i4 = this.f2041r.mo880d(m2325b) + i;
            }
            if (c0822t.f4177f == -1) {
                i2 = c0822t.f4173b;
                i3 = i2 - c0821s.f4168a;
            } else {
                i3 = c0822t.f4173b;
                i2 = c0821s.f4168a + i3;
            }
        } else {
            int m2231G = m2231G();
            int mo880d = this.f2041r.mo880d(m2325b) + m2231G;
            if (c0822t.f4177f == -1) {
                int i7 = c0822t.f4173b;
                int i8 = i7 - c0821s.f4168a;
                i4 = i7;
                i2 = mo880d;
                i = i8;
                i3 = m2231G;
            } else {
                int i9 = c0822t.f4173b;
                int i10 = c0821s.f4168a + i9;
                i = i9;
                i2 = mo880d;
                i3 = m2231G;
                i4 = i10;
            }
        }
        AbstractC0778H.m2221N(m2325b, i, i3, i4, i2);
        if (c0779i.f3947a.m2276i() || c0779i.f3947a.m2279l()) {
            c0821s.f4170c = true;
        }
        c0821s.f4171d = m2325b.hasFocusable();
    }

    /* renamed from: X0 */
    public void mo1410X0(C0784N c0784n, C0789T c0789t, C0820r c0820r, int i) {
    }

    /* renamed from: Y0 */
    public final void m1460Y0(C0784N c0784n, C0822t c0822t) {
        if (!c0822t.f4172a || c0822t.f4183l) {
            return;
        }
        int i = c0822t.f4178g;
        int i2 = c0822t.f4180i;
        if (c0822t.f4177f == -1) {
            int m2247v = m2247v();
            if (i < 0) {
                return;
            }
            int mo882f = (this.f2041r.mo882f() - i) + i2;
            if (this.f2044u) {
                for (int i3 = 0; i3 < m2247v; i3++) {
                    View m2245u = m2245u(i3);
                    if (this.f2041r.mo881e(m2245u) < mo882f || this.f2041r.mo891o(m2245u) < mo882f) {
                        m1461Z0(c0784n, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = m2247v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View m2245u2 = m2245u(i5);
                if (this.f2041r.mo881e(m2245u2) < mo882f || this.f2041r.mo891o(m2245u2) < mo882f) {
                    m1461Z0(c0784n, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int m2247v2 = m2247v();
        if (!this.f2044u) {
            for (int i7 = 0; i7 < m2247v2; i7++) {
                View m2245u3 = m2245u(i7);
                if (this.f2041r.mo878b(m2245u3) > i6 || this.f2041r.mo890n(m2245u3) > i6) {
                    m1461Z0(c0784n, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = m2247v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View m2245u4 = m2245u(i9);
            if (this.f2041r.mo878b(m2245u4) > i6 || this.f2041r.mo890n(m2245u4) > i6) {
                m1461Z0(c0784n, i8, i9);
                return;
            }
        }
    }

    /* renamed from: Z0 */
    public final void m1461Z0(C0784N c0784n, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View m2245u = m2245u(i);
                m2240l0(i);
                c0784n.m2257f(m2245u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View m2245u2 = m2245u(i3);
            m2240l0(i3);
            c0784n.m2257f(m2245u2);
        }
    }

    @Override // p068f0.InterfaceC0788S
    /* renamed from: a */
    public final PointF mo1462a(int i) {
        if (m2247v() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0778H.m2218H(m2245u(0))) != this.f2044u ? -1 : 1;
        return this.f2039p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* renamed from: a1 */
    public final void m1463a1() {
        if (this.f2039p == 1 || !m1459V0()) {
            this.f2044u = this.f2043t;
        } else {
            this.f2044u = !this.f2043t;
        }
    }

    /* renamed from: b1 */
    public final int m1464b1(int i, C0784N c0784n, C0789T c0789t) {
        if (m2247v() == 0 || i == 0) {
            return 0;
        }
        m1444I0();
        this.f2040q.f4172a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m1470e1(i2, abs, true, c0789t);
        C0822t c0822t = this.f2040q;
        int m1445J0 = m1445J0(c0784n, c0822t, c0789t, false) + c0822t.f4178g;
        if (m1445J0 < 0) {
            return 0;
        }
        if (abs > m1445J0) {
            i = i2 * m1445J0;
        }
        this.f2041r.mo892p(-i);
        this.f2040q.f4181j = i;
        return i;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: c */
    public final void mo1465c(String str) {
        if (this.f2049z == null) {
            super.mo1465c(str);
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: c0 */
    public void mo1415c0(C0784N c0784n, C0789T c0789t) {
        View focusedChild;
        View focusedChild2;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int m1454R0;
        int i6;
        View mo1479q;
        int mo881e;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f2049z == null && this.f2047x == -1) && c0789t.m2265b() == 0) {
            m2237i0(c0784n);
            return;
        }
        C0823u c0823u = this.f2049z;
        if (c0823u != null && (i8 = c0823u.f4184a) >= 0) {
            this.f2047x = i8;
        }
        m1444I0();
        this.f2040q.f4172a = false;
        m1463a1();
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f3932a.f535d).contains(focusedChild)) {
            focusedChild = null;
        }
        C0820r c0820r = this.f2035A;
        if (!c0820r.f4167e || this.f2047x != -1 || this.f2049z != null) {
            c0820r.m2323d();
            c0820r.f4166d = this.f2044u ^ this.f2045v;
            if (!c0789t.f3979g && (i = this.f2047x) != -1) {
                if (i < 0 || i >= c0789t.m2265b()) {
                    this.f2047x = -1;
                    this.f2048y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                } else {
                    int i10 = this.f2047x;
                    c0820r.f4164b = i10;
                    C0823u c0823u2 = this.f2049z;
                    if (c0823u2 != null && c0823u2.f4184a >= 0) {
                        boolean z2 = c0823u2.f4186c;
                        c0820r.f4166d = z2;
                        if (z2) {
                            c0820r.f4165c = this.f2041r.mo883g() - this.f2049z.f4185b;
                        } else {
                            c0820r.f4165c = this.f2041r.mo887k() + this.f2049z.f4185b;
                        }
                    } else if (this.f2048y == Integer.MIN_VALUE) {
                        View mo1479q2 = mo1479q(i10);
                        if (mo1479q2 == null) {
                            if (m2247v() > 0) {
                                c0820r.f4166d = (this.f2047x < AbstractC0778H.m2218H(m2245u(0))) == this.f2044u;
                            }
                            c0820r.m2320a();
                        } else if (this.f2041r.mo879c(mo1479q2) > this.f2041r.mo888l()) {
                            c0820r.m2320a();
                        } else if (this.f2041r.mo881e(mo1479q2) - this.f2041r.mo887k() < 0) {
                            c0820r.f4165c = this.f2041r.mo887k();
                            c0820r.f4166d = false;
                        } else if (this.f2041r.mo883g() - this.f2041r.mo878b(mo1479q2) < 0) {
                            c0820r.f4165c = this.f2041r.mo883g();
                            c0820r.f4166d = true;
                        } else {
                            c0820r.f4165c = c0820r.f4166d ? this.f2041r.m889m() + this.f2041r.mo878b(mo1479q2) : this.f2041r.mo881e(mo1479q2);
                        }
                    } else {
                        boolean z3 = this.f2044u;
                        c0820r.f4166d = z3;
                        if (z3) {
                            c0820r.f4165c = this.f2041r.mo883g() - this.f2048y;
                        } else {
                            c0820r.f4165c = this.f2041r.mo887k() + this.f2048y;
                        }
                    }
                    c0820r.f4167e = true;
                }
            }
            if (m2247v() != 0) {
                RecyclerView recyclerView2 = this.f3933b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f3932a.f535d).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    C0779I c0779i = (C0779I) focusedChild2.getLayoutParams();
                    if (!c0779i.f3947a.m2276i() && c0779i.f3947a.m2269b() >= 0 && c0779i.f3947a.m2269b() < c0789t.m2265b()) {
                        c0820r.m2322c(focusedChild2, AbstractC0778H.m2218H(focusedChild2));
                        c0820r.f4167e = true;
                    }
                }
                if (this.f2042s == this.f2045v) {
                    View mo1405Q0 = c0820r.f4166d ? this.f2044u ? mo1405Q0(c0784n, c0789t, 0, m2247v(), c0789t.m2265b()) : mo1405Q0(c0784n, c0789t, m2247v() - 1, -1, c0789t.m2265b()) : this.f2044u ? mo1405Q0(c0784n, c0789t, m2247v() - 1, -1, c0789t.m2265b()) : mo1405Q0(c0784n, c0789t, 0, m2247v(), c0789t.m2265b());
                    if (mo1405Q0 != null) {
                        c0820r.m2321b(mo1405Q0, AbstractC0778H.m2218H(mo1405Q0));
                        if (!c0789t.f3979g && mo1402B0() && (this.f2041r.mo881e(mo1405Q0) >= this.f2041r.mo883g() || this.f2041r.mo878b(mo1405Q0) < this.f2041r.mo887k())) {
                            c0820r.f4165c = c0820r.f4166d ? this.f2041r.mo883g() : this.f2041r.mo887k();
                        }
                        c0820r.f4167e = true;
                    }
                }
            }
            c0820r.m2320a();
            c0820r.f4164b = this.f2045v ? c0789t.m2265b() - 1 : 0;
            c0820r.f4167e = true;
        } else if (focusedChild != null && (this.f2041r.mo881e(focusedChild) >= this.f2041r.mo883g() || this.f2041r.mo878b(focusedChild) <= this.f2041r.mo887k())) {
            c0820r.m2322c(focusedChild, AbstractC0778H.m2218H(focusedChild));
        }
        C0822t c0822t = this.f2040q;
        c0822t.f4177f = c0822t.f4181j >= 0 ? 1 : -1;
        int[] iArr = this.f2038D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1439C0(c0789t, iArr);
        int mo887k = this.f2041r.mo887k() + Math.max(0, iArr[0]);
        int mo884h = this.f2041r.mo884h() + Math.max(0, iArr[1]);
        if (c0789t.f3979g && (i6 = this.f2047x) != -1 && this.f2048y != Integer.MIN_VALUE && (mo1479q = mo1479q(i6)) != null) {
            if (this.f2044u) {
                i7 = this.f2041r.mo883g() - this.f2041r.mo878b(mo1479q);
                mo881e = this.f2048y;
            } else {
                mo881e = this.f2041r.mo881e(mo1479q) - this.f2041r.mo887k();
                i7 = this.f2048y;
            }
            int i11 = i7 - mo881e;
            if (i11 > 0) {
                mo887k += i11;
            } else {
                mo884h -= i11;
            }
        }
        if (!c0820r.f4166d ? !this.f2044u : this.f2044u) {
            i9 = 1;
        }
        mo1410X0(c0784n, c0789t, c0820r, i9);
        m2242p(c0784n);
        this.f2040q.f4183l = this.f2041r.mo885i() == 0 && this.f2041r.mo882f() == 0;
        this.f2040q.getClass();
        this.f2040q.f4180i = 0;
        if (c0820r.f4166d) {
            m1473g1(c0820r.f4164b, c0820r.f4165c);
            C0822t c0822t2 = this.f2040q;
            c0822t2.f4179h = mo887k;
            m1445J0(c0784n, c0822t2, c0789t, false);
            C0822t c0822t3 = this.f2040q;
            i3 = c0822t3.f4173b;
            int i12 = c0822t3.f4175d;
            int i13 = c0822t3.f4174c;
            if (i13 > 0) {
                mo884h += i13;
            }
            m1472f1(c0820r.f4164b, c0820r.f4165c);
            C0822t c0822t4 = this.f2040q;
            c0822t4.f4179h = mo884h;
            c0822t4.f4175d += c0822t4.f4176e;
            m1445J0(c0784n, c0822t4, c0789t, false);
            C0822t c0822t5 = this.f2040q;
            i2 = c0822t5.f4173b;
            int i14 = c0822t5.f4174c;
            if (i14 > 0) {
                m1473g1(i12, i3);
                C0822t c0822t6 = this.f2040q;
                c0822t6.f4179h = i14;
                m1445J0(c0784n, c0822t6, c0789t, false);
                i3 = this.f2040q.f4173b;
            }
        } else {
            m1472f1(c0820r.f4164b, c0820r.f4165c);
            C0822t c0822t7 = this.f2040q;
            c0822t7.f4179h = mo884h;
            m1445J0(c0784n, c0822t7, c0789t, false);
            C0822t c0822t8 = this.f2040q;
            i2 = c0822t8.f4173b;
            int i15 = c0822t8.f4175d;
            int i16 = c0822t8.f4174c;
            if (i16 > 0) {
                mo887k += i16;
            }
            m1473g1(c0820r.f4164b, c0820r.f4165c);
            C0822t c0822t9 = this.f2040q;
            c0822t9.f4179h = mo887k;
            c0822t9.f4175d += c0822t9.f4176e;
            m1445J0(c0784n, c0822t9, c0789t, false);
            C0822t c0822t10 = this.f2040q;
            i3 = c0822t10.f4173b;
            int i17 = c0822t10.f4174c;
            if (i17 > 0) {
                m1472f1(i15, i2);
                C0822t c0822t11 = this.f2040q;
                c0822t11.f4179h = i17;
                m1445J0(c0784n, c0822t11, c0789t, false);
                i2 = this.f2040q.f4173b;
            }
        }
        if (m2247v() > 0) {
            if (this.f2044u ^ this.f2045v) {
                int m1454R02 = m1454R0(i2, c0784n, c0789t, true);
                i4 = i3 + m1454R02;
                i5 = i2 + m1454R02;
                m1454R0 = m1455S0(i4, c0784n, c0789t, false);
            } else {
                int m1455S0 = m1455S0(i3, c0784n, c0789t, true);
                i4 = i3 + m1455S0;
                i5 = i2 + m1455S0;
                m1454R0 = m1454R0(i5, c0784n, c0789t, false);
            }
            i3 = i4 + m1454R0;
            i2 = i5 + m1454R0;
        }
        if (c0789t.f3983k && m2247v() != 0 && !c0789t.f3979g && mo1402B0()) {
            List list2 = c0784n.f3960d;
            int size = list2.size();
            int m2218H = AbstractC0778H.m2218H(m2245u(0));
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < size; i20++) {
                AbstractC0792W abstractC0792W = (AbstractC0792W) list2.get(i20);
                if (!abstractC0792W.m2276i()) {
                    boolean z4 = abstractC0792W.m2269b() < m2218H;
                    boolean z5 = this.f2044u;
                    View view = abstractC0792W.f3995a;
                    if (z4 != z5) {
                        i18 += this.f2041r.mo879c(view);
                    } else {
                        i19 += this.f2041r.mo879c(view);
                    }
                }
            }
            this.f2040q.f4182k = list2;
            if (i18 > 0) {
                m1473g1(AbstractC0778H.m2218H(m1458U0()), i3);
                C0822t c0822t12 = this.f2040q;
                c0822t12.f4179h = i18;
                c0822t12.f4174c = 0;
                c0822t12.m2324a(null);
                m1445J0(c0784n, this.f2040q, c0789t, false);
            }
            if (i19 > 0) {
                m1472f1(AbstractC0778H.m2218H(m1457T0()), i2);
                C0822t c0822t13 = this.f2040q;
                c0822t13.f4179h = i19;
                c0822t13.f4174c = 0;
                list = null;
                c0822t13.m2324a(null);
                m1445J0(c0784n, this.f2040q, c0789t, false);
            } else {
                list = null;
            }
            this.f2040q.f4182k = list;
        }
        if (c0789t.f3979g) {
            c0820r.m2323d();
        } else {
            AbstractC0312f abstractC0312f = this.f2041r;
            abstractC0312f.f885a = abstractC0312f.mo888l();
        }
        this.f2042s = this.f2045v;
    }

    /* renamed from: c1 */
    public final void m1466c1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0062j.m156j(i, "invalid orientation:"));
        }
        mo1465c(null);
        if (i != this.f2039p || this.f2041r == null) {
            AbstractC0312f m877a = AbstractC0312f.m877a(this, i);
            this.f2041r = m877a;
            this.f2035A.f4163a = m877a;
            this.f2039p = i;
            m2241n0();
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: d */
    public final boolean mo1467d() {
        return this.f2039p == 0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: d0 */
    public void mo1416d0(C0789T c0789t) {
        this.f2049z = null;
        this.f2047x = -1;
        this.f2048y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f2035A.m2323d();
    }

    /* renamed from: d1 */
    public void mo1417d1(boolean z2) {
        mo1465c(null);
        if (this.f2045v == z2) {
            return;
        }
        this.f2045v = z2;
        m2241n0();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: e */
    public final boolean mo1468e() {
        return this.f2039p == 1;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: e0 */
    public final void mo1469e0(Parcelable parcelable) {
        if (parcelable instanceof C0823u) {
            this.f2049z = (C0823u) parcelable;
            m2241n0();
        }
    }

    /* renamed from: e1 */
    public final void m1470e1(int i, int i2, boolean z2, C0789T c0789t) {
        int mo887k;
        this.f2040q.f4183l = this.f2041r.mo885i() == 0 && this.f2041r.mo882f() == 0;
        this.f2040q.f4177f = i;
        int[] iArr = this.f2038D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1439C0(c0789t, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0822t c0822t = this.f2040q;
        int i3 = z3 ? max2 : max;
        c0822t.f4179h = i3;
        if (!z3) {
            max = max2;
        }
        c0822t.f4180i = max;
        if (z3) {
            c0822t.f4179h = this.f2041r.mo884h() + i3;
            View m1457T0 = m1457T0();
            C0822t c0822t2 = this.f2040q;
            c0822t2.f4176e = this.f2044u ? -1 : 1;
            int m2218H = AbstractC0778H.m2218H(m1457T0);
            C0822t c0822t3 = this.f2040q;
            c0822t2.f4175d = m2218H + c0822t3.f4176e;
            c0822t3.f4173b = this.f2041r.mo878b(m1457T0);
            mo887k = this.f2041r.mo878b(m1457T0) - this.f2041r.mo883g();
        } else {
            View m1458U0 = m1458U0();
            C0822t c0822t4 = this.f2040q;
            c0822t4.f4179h = this.f2041r.mo887k() + c0822t4.f4179h;
            C0822t c0822t5 = this.f2040q;
            c0822t5.f4176e = this.f2044u ? 1 : -1;
            int m2218H2 = AbstractC0778H.m2218H(m1458U0);
            C0822t c0822t6 = this.f2040q;
            c0822t5.f4175d = m2218H2 + c0822t6.f4176e;
            c0822t6.f4173b = this.f2041r.mo881e(m1458U0);
            mo887k = (-this.f2041r.mo881e(m1458U0)) + this.f2041r.mo887k();
        }
        C0822t c0822t7 = this.f2040q;
        c0822t7.f4174c = i2;
        if (z2) {
            c0822t7.f4174c = i2 - mo887k;
        }
        c0822t7.f4178g = mo887k;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: f0 */
    public final Parcelable mo1471f0() {
        C0823u c0823u = this.f2049z;
        if (c0823u != null) {
            C0823u c0823u2 = new C0823u();
            c0823u2.f4184a = c0823u.f4184a;
            c0823u2.f4185b = c0823u.f4185b;
            c0823u2.f4186c = c0823u.f4186c;
            return c0823u2;
        }
        C0823u c0823u3 = new C0823u();
        if (m2247v() > 0) {
            m1444I0();
            boolean z2 = this.f2042s ^ this.f2044u;
            c0823u3.f4186c = z2;
            if (z2) {
                View m1457T0 = m1457T0();
                c0823u3.f4185b = this.f2041r.mo883g() - this.f2041r.mo878b(m1457T0);
                c0823u3.f4184a = AbstractC0778H.m2218H(m1457T0);
            } else {
                View m1458U0 = m1458U0();
                c0823u3.f4184a = AbstractC0778H.m2218H(m1458U0);
                c0823u3.f4185b = this.f2041r.mo881e(m1458U0) - this.f2041r.mo887k();
            }
        } else {
            c0823u3.f4184a = -1;
        }
        return c0823u3;
    }

    /* renamed from: f1 */
    public final void m1472f1(int i, int i2) {
        this.f2040q.f4174c = this.f2041r.mo883g() - i2;
        C0822t c0822t = this.f2040q;
        c0822t.f4176e = this.f2044u ? -1 : 1;
        c0822t.f4175d = i;
        c0822t.f4177f = 1;
        c0822t.f4173b = i2;
        c0822t.f4178g = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    }

    /* renamed from: g1 */
    public final void m1473g1(int i, int i2) {
        this.f2040q.f4174c = i2 - this.f2041r.mo887k();
        C0822t c0822t = this.f2040q;
        c0822t.f4175d = i;
        c0822t.f4176e = this.f2044u ? 1 : -1;
        c0822t.f4177f = -1;
        c0822t.f4173b = i2;
        c0822t.f4178g = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: h */
    public final void mo1474h(int i, int i2, C0789T c0789t, C0815m c0815m) {
        if (this.f2039p != 0) {
            i = i2;
        }
        if (m2247v() == 0 || i == 0) {
            return;
        }
        m1444I0();
        m1470e1(i > 0 ? 1 : -1, Math.abs(i), true, c0789t);
        mo1403D0(c0789t, this.f2040q, c0815m);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: i */
    public final void mo1475i(int i, C0815m c0815m) {
        boolean z2;
        int i2;
        C0823u c0823u = this.f2049z;
        if (c0823u == null || (i2 = c0823u.f4184a) < 0) {
            m1463a1();
            z2 = this.f2044u;
            i2 = this.f2047x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0823u.f4186c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f2037C && i2 >= 0 && i2 < i; i4++) {
            c0815m.m2315a(i2, 0);
            i2 += i3;
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: j */
    public final int mo1476j(C0789T c0789t) {
        return m1440E0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: k */
    public int mo1422k(C0789T c0789t) {
        return m1441F0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: l */
    public int mo1424l(C0789T c0789t) {
        return m1442G0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: m */
    public final int mo1477m(C0789T c0789t) {
        return m1440E0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: n */
    public int mo1427n(C0789T c0789t) {
        return m1441F0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: o */
    public int mo1429o(C0789T c0789t) {
        return m1442G0(c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: o0 */
    public int mo1430o0(int i, C0784N c0784n, C0789T c0789t) {
        if (this.f2039p == 1) {
            return 0;
        }
        return m1464b1(i, c0784n, c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: p0 */
    public final void mo1478p0(int i) {
        this.f2047x = i;
        this.f2048y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        C0823u c0823u = this.f2049z;
        if (c0823u != null) {
            c0823u.f4184a = -1;
        }
        m2241n0();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: q */
    public final View mo1479q(int i) {
        int m2247v = m2247v();
        if (m2247v == 0) {
            return null;
        }
        int m2218H = i - AbstractC0778H.m2218H(m2245u(0));
        if (m2218H >= 0 && m2218H < m2247v) {
            View m2245u = m2245u(m2218H);
            if (AbstractC0778H.m2218H(m2245u) == i) {
                return m2245u;
            }
        }
        return super.mo1479q(i);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: q0 */
    public int mo1433q0(int i, C0784N c0784n, C0789T c0789t) {
        if (this.f2039p == 0) {
            return 0;
        }
        return m1464b1(i, c0784n, c0789t);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: r */
    public C0779I mo1434r() {
        return new C0779I(-2, -2);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: x0 */
    public final boolean mo1480x0() {
        if (this.f3944m == 1073741824 || this.f3943l == 1073741824) {
            return false;
        }
        int m2247v = m2247v();
        for (int i = 0; i < m2247v; i++) {
            ViewGroup.LayoutParams layoutParams = m2245u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: z0 */
    public void mo1481z0(RecyclerView recyclerView, int i) {
        C0824v c0824v = new C0824v(recyclerView.getContext());
        c0824v.f4187a = i;
        m2225A0(c0824v);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2039p = 1;
        this.f2043t = false;
        this.f2044u = false;
        this.f2045v = false;
        this.f2046w = true;
        this.f2047x = -1;
        this.f2048y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f2049z = null;
        this.f2035A = new C0820r();
        this.f2036B = new C0821s();
        this.f2037C = 2;
        this.f2038D = new int[2];
        C0777G m2219I = AbstractC0778H.m2219I(context, attributeSet, i, i2);
        m1466c1(m2219I.f3928a);
        boolean z2 = m2219I.f3930c;
        mo1465c(null);
        if (z2 != this.f2043t) {
            this.f2043t = z2;
            m2241n0();
        }
        mo1417d1(m2219I.f3931d);
    }
}
