package p068f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p003B.C0043j;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p024L.C0239i;
import p024L.C0240j;
import p065e0.AbstractC0767a;
import p091o.C1201k;

/* renamed from: f0.H */
/* loaded from: classes.dex */
public abstract class AbstractC0778H {

    /* renamed from: a */
    public C0198k f3932a;

    /* renamed from: b */
    public RecyclerView f3933b;

    /* renamed from: c */
    public final C0043j f3934c;

    /* renamed from: d */
    public final C0043j f3935d;

    /* renamed from: e */
    public C0824v f3936e;

    /* renamed from: f */
    public boolean f3937f;

    /* renamed from: g */
    public boolean f3938g;

    /* renamed from: h */
    public final boolean f3939h;

    /* renamed from: i */
    public final boolean f3940i;

    /* renamed from: j */
    public int f3941j;

    /* renamed from: k */
    public boolean f3942k;

    /* renamed from: l */
    public int f3943l;

    /* renamed from: m */
    public int f3944m;

    /* renamed from: n */
    public int f3945n;

    /* renamed from: o */
    public int f3946o;

    public AbstractC0778H() {
        C0776F c0776f = new C0776F(this, 0);
        C0776F c0776f2 = new C0776F(this, 1);
        this.f3934c = new C0043j(c0776f);
        this.f3935d = new C0043j(c0776f2);
        this.f3937f = false;
        this.f3938g = false;
        this.f3939h = true;
        this.f3940i = true;
    }

    /* renamed from: A */
    public static int m2217A(View view) {
        Rect rect = ((C0779I) view.getLayoutParams()).f3948b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* renamed from: H */
    public static int m2218H(View view) {
        return ((C0779I) view.getLayoutParams()).f3947a.m2269b();
    }

    /* renamed from: I */
    public static C0777G m2219I(Context context, AttributeSet attributeSet, int i, int i2) {
        C0777G c0777g = new C0777G();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0767a.f3893a, i, i2);
        c0777g.f3928a = obtainStyledAttributes.getInt(0, 1);
        c0777g.f3929b = obtainStyledAttributes.getInt(10, 1);
        c0777g.f3930c = obtainStyledAttributes.getBoolean(9, false);
        c0777g.f3931d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c0777g;
    }

    /* renamed from: M */
    public static boolean m2220M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* renamed from: N */
    public static void m2221N(View view, int i, int i2, int i3, int i4) {
        C0779I c0779i = (C0779I) view.getLayoutParams();
        Rect rect = c0779i.f3948b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0779i).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0779i).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0779i).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0779i).bottomMargin);
    }

    /* renamed from: g */
    public static int m2222g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2223w(boolean z2, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z2) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i4 = max;
                            i2 = Integer.MIN_VALUE;
                        } else {
                            i4 = max;
                            i2 = 0;
                        }
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* renamed from: z */
    public static int m2224z(View view) {
        Rect rect = ((C0779I) view.getLayoutParams()).f3948b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* renamed from: A0 */
    public final void m2225A0(C0824v c0824v) {
        C0824v c0824v2 = this.f3936e;
        if (c0824v2 != null && c0824v != c0824v2 && c0824v2.f4191e) {
            c0824v2.m2328i();
        }
        this.f3936e = c0824v;
        RecyclerView recyclerView = this.f3933b;
        RunnableC0791V runnableC0791V = recyclerView.f2082f0;
        runnableC0791V.f3993g.removeCallbacks(runnableC0791V);
        runnableC0791V.f3989c.abortAnimation();
        if (c0824v.f4194h) {
            Log.w("RecyclerView", "An instance of " + c0824v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0824v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0824v.f4188b = recyclerView;
        c0824v.f4189c = this;
        int i = c0824v.f4187a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2088i0.f3973a = i;
        c0824v.f4191e = true;
        c0824v.f4190d = true;
        c0824v.f4192f = recyclerView.f2103q.mo1479q(i);
        c0824v.f4188b.f2082f0.m2266a();
        c0824v.f4194h = true;
    }

    /* renamed from: B */
    public final int m2226B() {
        RecyclerView recyclerView = this.f3933b;
        AbstractC0828z adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.mo2089a();
        }
        return 0;
    }

    /* renamed from: B0 */
    public boolean mo1402B0() {
        return false;
    }

    /* renamed from: C */
    public final int m2227C() {
        RecyclerView recyclerView = this.f3933b;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        return recyclerView.getLayoutDirection();
    }

    /* renamed from: D */
    public final int m2228D() {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: E */
    public final int m2229E() {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: F */
    public final int m2230F() {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: G */
    public final int m2231G() {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: J */
    public int mo1404J(C0784N c0784n, C0789T c0789t) {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView == null || recyclerView.f2101p == null || !mo1468e()) {
            return 1;
        }
        return this.f3933b.f2101p.mo2089a();
    }

    /* renamed from: K */
    public final void m2232K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0779I) view.getLayoutParams()).f3948b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3933b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3933b.f2099o;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: L */
    public abstract boolean mo1447L();

    /* renamed from: O */
    public void mo1551O(int i) {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView != null) {
            int m596f = recyclerView.f2089j.m596f();
            for (int i2 = 0; i2 < m596f; i2++) {
                recyclerView.f2089j.m595e(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* renamed from: P */
    public void mo1553P(int i) {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView != null) {
            int m596f = recyclerView.f2089j.m596f();
            for (int i2 = 0; i2 < m596f; i2++) {
                recyclerView.f2089j.m595e(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* renamed from: Q */
    public void mo2062Q(RecyclerView recyclerView) {
    }

    /* renamed from: R */
    public abstract void mo1453R(RecyclerView recyclerView);

    /* renamed from: S */
    public abstract View mo1406S(View view, int i, C0784N c0784n, C0789T c0789t);

    /* renamed from: T */
    public void mo1456T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3933b;
        C0784N c0784n = recyclerView.f2083g;
        C0789T c0789t = recyclerView.f2088i0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3933b.canScrollVertically(-1) && !this.f3933b.canScrollHorizontally(-1) && !this.f3933b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0828z abstractC0828z = this.f3933b.f2101p;
        if (abstractC0828z != null) {
            accessibilityEvent.setItemCount(abstractC0828z.mo2089a());
        }
    }

    /* renamed from: U */
    public void mo2233U(C0784N c0784n, C0789T c0789t, C0240j c0240j) {
        boolean canScrollVertically = this.f3933b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
        if (canScrollVertically || this.f3933b.canScrollHorizontally(-1)) {
            c0240j.m729a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f3933b.canScrollVertically(1) || this.f3933b.canScrollHorizontally(1)) {
            c0240j.m729a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo1404J(c0784n, c0789t), mo1438x(c0784n, c0789t), false, 0));
    }

    /* renamed from: V */
    public final void m2234V(View view, C0240j c0240j) {
        AbstractC0792W m1483J = RecyclerView.m1483J(view);
        if (m1483J == null || m1483J.m2276i() || ((ArrayList) this.f3932a.f535d).contains(m1483J.f3995a)) {
            return;
        }
        RecyclerView recyclerView = this.f3933b;
        mo1407W(recyclerView.f2083g, recyclerView.f2088i0, view, c0240j);
    }

    /* renamed from: W */
    public void mo1407W(C0784N c0784n, C0789T c0789t, View view, C0240j c0240j) {
        c0240j.m735h(C0239i.m727a(false, mo1468e() ? m2218H(view) : 0, 1, mo1467d() ? m2218H(view) : 0, 1));
    }

    /* renamed from: X */
    public void mo1409X(int i, int i2) {
    }

    /* renamed from: Y */
    public void mo1411Y() {
    }

    /* renamed from: Z */
    public void mo1412Z(int i, int i2) {
    }

    /* renamed from: a0 */
    public void mo1413a0(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2235b(int i, View view, boolean z2) {
        int m2287b;
        AbstractC0792W m1483J = RecyclerView.m1483J(view);
        if (z2 || m1483J.m2276i()) {
            C1201k c1201k = (C1201k) this.f3933b.f2091k.f141g;
            C0809g0 c0809g0 = (C0809g0) c1201k.getOrDefault(m1483J, null);
            if (c0809g0 == null) {
                c0809g0 = C0809g0.m2303a();
                c1201k.put(m1483J, c0809g0);
            }
            c0809g0.f4083a |= 1;
        } else {
            this.f3933b.f2091k.m73K(m1483J);
        }
        C0779I c0779i = (C0779I) view.getLayoutParams();
        if (m1483J.m2284q() || m1483J.m2277j()) {
            if (m1483J.m2277j()) {
                m1483J.f4008n.m2261j(m1483J);
            } else {
                m1483J.f4004j &= -33;
            }
            this.f3932a.m593b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f3933b) {
                C0198k c0198k = this.f3932a;
                int indexOfChild = ((C0827y) c0198k.f533b).f4208a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0798b c0798b = (C0798b) c0198k.f534c;
                    if (!c0798b.m2289d(indexOfChild)) {
                        m2287b = indexOfChild - c0798b.m2287b(indexOfChild);
                        if (i == -1) {
                            i = this.f3932a.m596f();
                        }
                        if (m2287b != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3933b.indexOfChild(view) + this.f3933b.m1537z());
                        }
                        if (m2287b != i) {
                            AbstractC0778H abstractC0778H = this.f3933b.f2103q;
                            View m2245u = abstractC0778H.m2245u(m2287b);
                            if (m2245u == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + m2287b + abstractC0778H.f3933b.toString());
                            }
                            abstractC0778H.m2245u(m2287b);
                            abstractC0778H.f3932a.m594d(m2287b);
                            C0779I c0779i2 = (C0779I) m2245u.getLayoutParams();
                            AbstractC0792W m1483J2 = RecyclerView.m1483J(m2245u);
                            if (m1483J2.m2276i()) {
                                C1201k c1201k2 = (C1201k) abstractC0778H.f3933b.f2091k.f141g;
                                C0809g0 c0809g02 = (C0809g0) c1201k2.getOrDefault(m1483J2, null);
                                if (c0809g02 == null) {
                                    c0809g02 = C0809g0.m2303a();
                                    c1201k2.put(m1483J2, c0809g02);
                                }
                                c0809g02.f4083a = 1 | c0809g02.f4083a;
                            } else {
                                abstractC0778H.f3933b.f2091k.m73K(m1483J2);
                            }
                            abstractC0778H.f3932a.m593b(m2245u, i, c0779i2, m1483J2.m2276i());
                        }
                    }
                }
                m2287b = -1;
                if (i == -1) {
                }
                if (m2287b != -1) {
                }
            } else {
                this.f3932a.m592a(i, view, false);
                c0779i.f3949c = true;
                C0824v c0824v = this.f3936e;
                if (c0824v != null && c0824v.f4191e) {
                    c0824v.f4188b.getClass();
                    AbstractC0792W m1483J3 = RecyclerView.m1483J(view);
                    if ((m1483J3 != null ? m1483J3.m2269b() : -1) == c0824v.f4187a) {
                        c0824v.f4192f = view;
                    }
                }
            }
        }
        if (c0779i.f3950d) {
            m1483J.f3995a.invalidate();
            c0779i.f3950d = false;
        }
    }

    /* renamed from: b0 */
    public void mo1414b0(int i, int i2) {
    }

    /* renamed from: c */
    public void mo1465c(String str) {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView != null) {
            recyclerView.m1521i(str);
        }
    }

    /* renamed from: c0 */
    public abstract void mo1415c0(C0784N c0784n, C0789T c0789t);

    /* renamed from: d */
    public abstract boolean mo1467d();

    /* renamed from: d0 */
    public abstract void mo1416d0(C0789T c0789t);

    /* renamed from: e */
    public abstract boolean mo1468e();

    /* renamed from: e0 */
    public void mo1469e0(Parcelable parcelable) {
    }

    /* renamed from: f */
    public boolean mo1418f(C0779I c0779i) {
        return c0779i != null;
    }

    /* renamed from: f0 */
    public Parcelable mo1471f0() {
        return null;
    }

    /* renamed from: g0 */
    public void mo1570g0(int i) {
    }

    /* renamed from: h */
    public void mo1474h(int i, int i2, C0789T c0789t, C0815m c0815m) {
    }

    /* renamed from: h0 */
    public boolean mo2236h0(C0784N c0784n, C0789T c0789t, int i, Bundle bundle) {
        int m2231G;
        int m2229E;
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView == null) {
            return false;
        }
        if (i == 4096) {
            m2231G = recyclerView.canScrollVertically(1) ? (this.f3946o - m2231G()) - m2228D() : 0;
            if (this.f3933b.canScrollHorizontally(1)) {
                m2229E = (this.f3945n - m2229E()) - m2230F();
            }
            m2229E = 0;
        } else if (i != 8192) {
            m2231G = 0;
            m2229E = 0;
        } else {
            m2231G = recyclerView.canScrollVertically(-1) ? -((this.f3946o - m2231G()) - m2228D()) : 0;
            if (this.f3933b.canScrollHorizontally(-1)) {
                m2229E = -((this.f3945n - m2229E()) - m2230F());
            }
            m2229E = 0;
        }
        if (m2231G == 0 && m2229E == 0) {
            return false;
        }
        this.f3933b.m1513a0(m2229E, true, m2231G);
        return true;
    }

    /* renamed from: i */
    public void mo1475i(int i, C0815m c0815m) {
    }

    /* renamed from: i0 */
    public final void m2237i0(C0784N c0784n) {
        for (int m2247v = m2247v() - 1; m2247v >= 0; m2247v--) {
            if (!RecyclerView.m1483J(m2245u(m2247v)).m2283p()) {
                View m2245u = m2245u(m2247v);
                m2240l0(m2247v);
                c0784n.m2257f(m2245u);
            }
        }
    }

    /* renamed from: j */
    public abstract int mo1476j(C0789T c0789t);

    /* renamed from: j0 */
    public final void m2238j0(C0784N c0784n) {
        ArrayList arrayList;
        int size = c0784n.f3957a.size();
        int i = size - 1;
        while (true) {
            arrayList = c0784n.f3957a;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC0792W) arrayList.get(i)).f3995a;
            AbstractC0792W m1483J = RecyclerView.m1483J(view);
            if (!m1483J.m2283p()) {
                m1483J.m2282o(false);
                if (m1483J.m2278k()) {
                    this.f3933b.removeDetachedView(view, false);
                }
                AbstractC0774D abstractC0774D = this.f3933b.f2066N;
                if (abstractC0774D != null) {
                    abstractC0774D.mo2210d(m1483J);
                }
                m1483J.m2282o(true);
                AbstractC0792W m1483J2 = RecyclerView.m1483J(view);
                m1483J2.f4008n = null;
                m1483J2.f4009o = false;
                m1483J2.f4004j &= -33;
                c0784n.m2258g(m1483J2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0784n.f3958b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3933b.invalidate();
        }
    }

    /* renamed from: k */
    public abstract int mo1422k(C0789T c0789t);

    /* renamed from: k0 */
    public final void m2239k0(View view, C0784N c0784n) {
        C0198k c0198k = this.f3932a;
        C0827y c0827y = (C0827y) c0198k.f533b;
        int indexOfChild = c0827y.f4208a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0798b) c0198k.f534c).m2291f(indexOfChild)) {
                c0198k.m611v(view);
            }
            c0827y.m2344h(indexOfChild);
        }
        c0784n.m2257f(view);
    }

    /* renamed from: l */
    public abstract int mo1424l(C0789T c0789t);

    /* renamed from: l0 */
    public final void m2240l0(int i) {
        if (m2245u(i) != null) {
            C0198k c0198k = this.f3932a;
            int m601k = c0198k.m601k(i);
            C0827y c0827y = (C0827y) c0198k.f533b;
            View childAt = c0827y.f4208a.getChildAt(m601k);
            if (childAt == null) {
                return;
            }
            if (((C0798b) c0198k.f534c).m2291f(m601k)) {
                c0198k.m611v(childAt);
            }
            c0827y.m2344h(m601k);
        }
    }

    /* renamed from: m */
    public abstract int mo1477m(C0789T c0789t);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo2063m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int m2229E = m2229E();
        int m2231G = m2231G();
        int m2230F = this.f3945n - m2230F();
        int m2228D = this.f3946o - m2228D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - m2229E;
        int min = Math.min(0, i);
        int i2 = top - m2231G;
        int min2 = Math.min(0, i2);
        int i3 = width - m2230F;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - m2228D);
        if (m2227C() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i3);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        int[] iArr = {max, min2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int m2229E2 = m2229E();
                int m2231G2 = m2231G();
                int m2230F2 = this.f3945n - m2230F();
                int m2228D2 = this.f3946o - m2228D();
                Rect rect2 = this.f3933b.f2095m;
                mo2064y(focusedChild, rect2);
                if (rect2.left - i4 < m2230F2) {
                    if (rect2.right - i4 > m2229E2) {
                        if (rect2.top - i5 < m2228D2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z2) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.m1513a0(i4, false, i5);
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public abstract int mo1427n(C0789T c0789t);

    /* renamed from: n0 */
    public final void m2241n0() {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: o */
    public abstract int mo1429o(C0789T c0789t);

    /* renamed from: o0 */
    public abstract int mo1430o0(int i, C0784N c0784n, C0789T c0789t);

    /* renamed from: p */
    public final void m2242p(C0784N c0784n) {
        for (int m2247v = m2247v() - 1; m2247v >= 0; m2247v--) {
            View m2245u = m2245u(m2247v);
            AbstractC0792W m1483J = RecyclerView.m1483J(m2245u);
            if (!m1483J.m2283p()) {
                if (!m1483J.m2274g() || m1483J.m2276i() || this.f3933b.f2101p.f4210b) {
                    m2245u(m2247v);
                    this.f3932a.m594d(m2247v);
                    c0784n.m2259h(m2245u);
                    this.f3933b.f2091k.m73K(m1483J);
                } else {
                    m2240l0(m2247v);
                    c0784n.m2258g(m1483J);
                }
            }
        }
    }

    /* renamed from: p0 */
    public abstract void mo1478p0(int i);

    /* renamed from: q */
    public View mo1479q(int i) {
        int m2247v = m2247v();
        for (int i2 = 0; i2 < m2247v; i2++) {
            View m2245u = m2245u(i2);
            AbstractC0792W m1483J = RecyclerView.m1483J(m2245u);
            if (m1483J != null && m1483J.m2269b() == i && !m1483J.m2283p() && (this.f3933b.f2088i0.f3979g || !m1483J.m2276i())) {
                return m2245u;
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public abstract int mo1433q0(int i, C0784N c0784n, C0789T c0789t);

    /* renamed from: r */
    public abstract C0779I mo1434r();

    /* renamed from: r0 */
    public final void m2243r0(RecyclerView recyclerView) {
        m2244s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: s */
    public C0779I mo1435s(Context context, AttributeSet attributeSet) {
        return new C0779I(context, attributeSet);
    }

    /* renamed from: s0 */
    public final void m2244s0(int i, int i2) {
        this.f3945n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f3943l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f2051y0;
        }
        this.f3946o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f3944m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f2051y0;
        }
    }

    /* renamed from: t */
    public C0779I mo1436t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0779I ? new C0779I((C0779I) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0779I((ViewGroup.MarginLayoutParams) layoutParams) : new C0779I(layoutParams);
    }

    /* renamed from: t0 */
    public void mo1437t0(Rect rect, int i, int i2) {
        int m2230F = m2230F() + m2229E() + rect.width();
        int m2228D = m2228D() + m2231G() + rect.height();
        RecyclerView recyclerView = this.f3933b;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        this.f3933b.setMeasuredDimension(m2222g(i, m2230F, recyclerView.getMinimumWidth()), m2222g(i2, m2228D, this.f3933b.getMinimumHeight()));
    }

    /* renamed from: u */
    public final View m2245u(int i) {
        C0198k c0198k = this.f3932a;
        if (c0198k != null) {
            return c0198k.m595e(i);
        }
        return null;
    }

    /* renamed from: u0 */
    public final void m2246u0(int i, int i2) {
        int m2247v = m2247v();
        if (m2247v == 0) {
            this.f3933b.m1525n(i, i2);
            return;
        }
        int i3 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < m2247v; i7++) {
            View m2245u = m2245u(i7);
            Rect rect = this.f3933b.f2095m;
            mo2064y(m2245u, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f3933b.f2095m.set(i6, i4, i3, i5);
        mo1437t0(this.f3933b.f2095m, i, i2);
    }

    /* renamed from: v */
    public final int m2247v() {
        C0198k c0198k = this.f3932a;
        if (c0198k != null) {
            return c0198k.m596f();
        }
        return 0;
    }

    /* renamed from: v0 */
    public final void m2248v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3933b = null;
            this.f3932a = null;
            this.f3945n = 0;
            this.f3946o = 0;
        } else {
            this.f3933b = recyclerView;
            this.f3932a = recyclerView.f2089j;
            this.f3945n = recyclerView.getWidth();
            this.f3946o = recyclerView.getHeight();
        }
        this.f3943l = 1073741824;
        this.f3944m = 1073741824;
    }

    /* renamed from: w0 */
    public final boolean m2249w0(View view, int i, int i2, C0779I c0779i) {
        return (!view.isLayoutRequested() && this.f3939h && m2220M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0779i).width) && m2220M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0779i).height)) ? false : true;
    }

    /* renamed from: x */
    public int mo1438x(C0784N c0784n, C0789T c0789t) {
        RecyclerView recyclerView = this.f3933b;
        if (recyclerView == null || recyclerView.f2101p == null || !mo1467d()) {
            return 1;
        }
        return this.f3933b.f2101p.mo2089a();
    }

    /* renamed from: x0 */
    public boolean mo1480x0() {
        return false;
    }

    /* renamed from: y */
    public void mo2064y(View view, Rect rect) {
        int[] iArr = RecyclerView.f2051y0;
        C0779I c0779i = (C0779I) view.getLayoutParams();
        Rect rect2 = c0779i.f3948b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0779i).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0779i).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0779i).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0779i).bottomMargin);
    }

    /* renamed from: y0 */
    public final boolean m2250y0(View view, int i, int i2, C0779I c0779i) {
        return (this.f3939h && m2220M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0779i).width) && m2220M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0779i).height)) ? false : true;
    }

    /* renamed from: z0 */
    public abstract void mo1481z0(RecyclerView recyclerView, int i);
}
