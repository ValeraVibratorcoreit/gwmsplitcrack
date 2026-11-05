package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.altaysoft.t500_split.R;
import p004B0.AbstractC0051a;
import p006C.AbstractC0062j;
import p021J0.C0148b;
import p021J0.C0149c;
import p021J0.C0150d;
import p021J0.C0152f;
import p021J0.ViewOnLayoutChangeListenerC0147a;
import p068f0.AbstractC0778H;
import p068f0.C0779I;
import p068f0.C0784N;
import p068f0.C0789T;
import p068f0.InterfaceC0788S;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0778H implements InterfaceC0788S {

    /* renamed from: p */
    public final C0152f f3447p;

    /* renamed from: q */
    public C0150d f3448q;

    /* renamed from: r */
    public final View.OnLayoutChangeListener f3449r;

    public CarouselLayoutManager() {
        C0152f c0152f = new C0152f();
        new C0149c();
        this.f3449r = new ViewOnLayoutChangeListenerC0147a(0, this);
        this.f3447p = c0152f;
        m2241n0();
        m2061E0(0);
    }

    /* renamed from: C0 */
    public final boolean m2059C0() {
        return this.f3448q.f460a == 0;
    }

    /* renamed from: D0 */
    public final boolean m2060D0() {
        return m2059C0() && m2227C() == 1;
    }

    /* renamed from: E0 */
    public final void m2061E0(int i) {
        C0150d c0150d;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0062j.m156j(i, "invalid orientation:"));
        }
        mo1465c(null);
        C0150d c0150d2 = this.f3448q;
        if (c0150d2 == null || i != c0150d2.f460a) {
            if (i == 0) {
                c0150d = new C0150d(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0150d = new C0150d(this, 0);
            }
            this.f3448q = c0150d;
            m2241n0();
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: L */
    public final boolean mo1447L() {
        return true;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: Q */
    public final void mo2062Q(RecyclerView recyclerView) {
        C0152f c0152f = this.f3447p;
        Context context = recyclerView.getContext();
        float f2 = c0152f.f463a;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0152f.f463a = f2;
        float f3 = c0152f.f464b;
        if (f3 <= 0.0f) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0152f.f464b = f3;
        m2241n0();
        recyclerView.addOnLayoutChangeListener(this.f3449r);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: R */
    public final void mo1453R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f3449r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r7 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        if (m2060D0() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        if (r7 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
    
        if (m2060D0() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // p068f0.AbstractC0778H
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1406S(View view, int i, C0784N c0784n, C0789T c0789t) {
        char c2;
        if (m2247v() == 0) {
            return null;
        }
        int i2 = this.f3448q.f460a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c2 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        }
                        c2 = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c2 = 0;
                    }
                }
                if (c2 == 0) {
                    return null;
                }
                if (c2 == 65535) {
                    if (AbstractC0778H.m2218H(view) == 0) {
                        return null;
                    }
                    int m2218H = AbstractC0778H.m2218H(m2245u(0)) - 1;
                    if (m2218H < 0 || m2218H >= m2226B()) {
                        return m2245u(m2060D0() ? m2247v() - 1 : 0);
                    }
                    this.f3448q.m411a();
                    throw null;
                }
                if (AbstractC0778H.m2218H(view) == m2226B() - 1) {
                    return null;
                }
                int m2218H2 = AbstractC0778H.m2218H(m2245u(m2247v() - 1)) + 1;
                if (m2218H2 < 0 || m2218H2 >= m2226B()) {
                    return m2245u(m2060D0() ? 0 : m2247v() - 1);
                }
                this.f3448q.m411a();
                throw null;
            }
            c2 = 1;
            if (c2 == 0) {
            }
        }
        c2 = 65535;
        if (c2 == 0) {
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: T */
    public final void mo1456T(AccessibilityEvent accessibilityEvent) {
        super.mo1456T(accessibilityEvent);
        if (m2247v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0778H.m2218H(m2245u(0)));
            accessibilityEvent.setToIndex(AbstractC0778H.m2218H(m2245u(m2247v() - 1)));
        }
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: X */
    public final void mo1409X(int i, int i2) {
        m2226B();
    }

    @Override // p068f0.InterfaceC0788S
    /* renamed from: a */
    public final PointF mo1462a(int i) {
        return null;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: a0 */
    public final void mo1413a0(int i, int i2) {
        m2226B();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: c0 */
    public final void mo1415c0(C0784N c0784n, C0789T c0789t) {
        if (c0789t.m2265b() > 0) {
            if ((m2059C0() ? this.f3945n : this.f3946o) > 0.0f) {
                m2060D0();
                View view = c0784n.m2260i(0, Long.MAX_VALUE).f3995a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m2237i0(c0784n);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: d */
    public final boolean mo1467d() {
        return m2059C0();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: d0 */
    public final void mo1416d0(C0789T c0789t) {
        if (m2247v() == 0) {
            return;
        }
        AbstractC0778H.m2218H(m2245u(0));
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: e */
    public final boolean mo1468e() {
        return !m2059C0();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: j */
    public final int mo1476j(C0789T c0789t) {
        m2247v();
        return 0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: k */
    public final int mo1422k(C0789T c0789t) {
        return 0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: l */
    public final int mo1424l(C0789T c0789t) {
        return 0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: m */
    public final int mo1477m(C0789T c0789t) {
        m2247v();
        return 0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: m0 */
    public final boolean mo2063m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: n */
    public final int mo1427n(C0789T c0789t) {
        return 0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: o */
    public final int mo1429o(C0789T c0789t) {
        return 0;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: o0 */
    public final int mo1430o0(int i, C0784N c0784n, C0789T c0789t) {
        if (!m2059C0() || m2247v() == 0 || i == 0) {
            return 0;
        }
        View view = c0784n.m2260i(0, Long.MAX_VALUE).f3995a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: p0 */
    public final void mo1478p0(int i) {
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: q0 */
    public final int mo1433q0(int i, C0784N c0784n, C0789T c0789t) {
        if (!mo1468e() || m2247v() == 0 || i == 0) {
            return 0;
        }
        View view = c0784n.m2260i(0, Long.MAX_VALUE).f3995a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: r */
    public final C0779I mo1434r() {
        return new C0779I(-2, -2);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: y */
    public final void mo2064y(View view, Rect rect) {
        super.mo2064y(view, rect);
        rect.centerY();
        if (m2059C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: z0 */
    public final void mo1481z0(RecyclerView recyclerView, int i) {
        C0148b c0148b = new C0148b(this, recyclerView.getContext(), 0);
        c0148b.f4187a = i;
        m2225A0(c0148b);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0149c();
        this.f3449r = new ViewOnLayoutChangeListenerC0147a(0, this);
        this.f3447p = new C0152f();
        m2241n0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f168c);
            obtainStyledAttributes.getInt(0, 0);
            m2241n0();
            m2061E0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
