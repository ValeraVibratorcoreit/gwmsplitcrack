package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.altaysoft.t500_split.media.C0639g;
import com.jcraft.jsch.SftpATTRS;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p001A0.RunnableC0020n;
import p003B.C0043j;
import p014G.AbstractC0107h;
import p016H.C0112d;
import p020J.C0145c;
import p021J0.C0148b;
import p022K.AbstractC0158F;
import p022K.AbstractC0161I;
import p022K.AbstractC0169Q;
import p022K.AbstractC0170S;
import p022K.C0198k;
import p022K.C0202m;
import p022K.C0208p;
import p033Q.AbstractC0270d;
import p036S.InterpolatorC0304d;
import p038T.AbstractC0312f;
import p051Z0.C0451i;
import p065e0.AbstractC0767a;
import p068f0.AbstractC0774D;
import p068f0.AbstractC0775E;
import p068f0.AbstractC0778H;
import p068f0.AbstractC0780J;
import p068f0.AbstractC0781K;
import p068f0.AbstractC0790U;
import p068f0.AbstractC0792W;
import p068f0.AbstractC0828z;
import p068f0.C0773C;
import p068f0.C0779I;
import p068f0.C0782L;
import p068f0.C0783M;
import p068f0.C0784N;
import p068f0.C0786P;
import p068f0.C0789T;
import p068f0.C0794Y;
import p068f0.C0796a;
import p068f0.C0798b;
import p068f0.C0809g0;
import p068f0.C0811i;
import p068f0.C0814l;
import p068f0.C0815m;
import p068f0.C0824v;
import p068f0.C0826x;
import p068f0.C0827y;
import p068f0.InterfaceC0772B;
import p068f0.InterfaceC0785O;
import p068f0.InterfaceC0788S;
import p068f0.RunnableC0791V;
import p068f0.RunnableC0817o;
import p091o.C1195e;
import p091o.C1201k;
import p095p0.C1228g;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: A0 */
    public static final InterpolatorC0304d f2050A0;

    /* renamed from: y0 */
    public static final int[] f2051y0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: z0 */
    public static final Class[] f2052z0;

    /* renamed from: A */
    public boolean f2053A;

    /* renamed from: B */
    public int f2054B;

    /* renamed from: C */
    public final AccessibilityManager f2055C;

    /* renamed from: D */
    public ArrayList f2056D;

    /* renamed from: E */
    public boolean f2057E;

    /* renamed from: F */
    public boolean f2058F;

    /* renamed from: G */
    public int f2059G;

    /* renamed from: H */
    public int f2060H;

    /* renamed from: I */
    public C0773C f2061I;

    /* renamed from: J */
    public EdgeEffect f2062J;

    /* renamed from: K */
    public EdgeEffect f2063K;

    /* renamed from: L */
    public EdgeEffect f2064L;

    /* renamed from: M */
    public EdgeEffect f2065M;

    /* renamed from: N */
    public AbstractC0774D f2066N;

    /* renamed from: O */
    public int f2067O;

    /* renamed from: P */
    public int f2068P;

    /* renamed from: Q */
    public VelocityTracker f2069Q;

    /* renamed from: R */
    public int f2070R;

    /* renamed from: S */
    public int f2071S;

    /* renamed from: T */
    public int f2072T;

    /* renamed from: U */
    public int f2073U;

    /* renamed from: V */
    public int f2074V;

    /* renamed from: W */
    public AbstractC0780J f2075W;

    /* renamed from: a0 */
    public final int f2076a0;

    /* renamed from: b0 */
    public final int f2077b0;

    /* renamed from: c0 */
    public final float f2078c0;

    /* renamed from: d0 */
    public final float f2079d0;

    /* renamed from: e0 */
    public boolean f2080e0;

    /* renamed from: f */
    public final C0451i f2081f;

    /* renamed from: f0 */
    public final RunnableC0791V f2082f0;

    /* renamed from: g */
    public final C0784N f2083g;

    /* renamed from: g0 */
    public RunnableC0817o f2084g0;

    /* renamed from: h */
    public C0786P f2085h;

    /* renamed from: h0 */
    public final C0815m f2086h0;

    /* renamed from: i */
    public final C0112d f2087i;

    /* renamed from: i0 */
    public final C0789T f2088i0;

    /* renamed from: j */
    public final C0198k f2089j;

    /* renamed from: j0 */
    public AbstractC0781K f2090j0;

    /* renamed from: k */
    public final C0043j f2091k;

    /* renamed from: k0 */
    public ArrayList f2092k0;

    /* renamed from: l */
    public boolean f2093l;

    /* renamed from: l0 */
    public boolean f2094l0;

    /* renamed from: m */
    public final Rect f2095m;

    /* renamed from: m0 */
    public boolean f2096m0;

    /* renamed from: n */
    public final Rect f2097n;

    /* renamed from: n0 */
    public final C0827y f2098n0;

    /* renamed from: o */
    public final RectF f2099o;

    /* renamed from: o0 */
    public boolean f2100o0;

    /* renamed from: p */
    public AbstractC0828z f2101p;

    /* renamed from: p0 */
    public C0794Y f2102p0;

    /* renamed from: q */
    public AbstractC0778H f2103q;

    /* renamed from: q0 */
    public final int[] f2104q0;

    /* renamed from: r */
    public final ArrayList f2105r;

    /* renamed from: r0 */
    public C0202m f2106r0;

    /* renamed from: s */
    public final ArrayList f2107s;

    /* renamed from: s0 */
    public final int[] f2108s0;

    /* renamed from: t */
    public C0814l f2109t;

    /* renamed from: t0 */
    public final int[] f2110t0;

    /* renamed from: u */
    public boolean f2111u;

    /* renamed from: u0 */
    public final int[] f2112u0;

    /* renamed from: v */
    public boolean f2113v;

    /* renamed from: v0 */
    public final ArrayList f2114v0;

    /* renamed from: w */
    public boolean f2115w;

    /* renamed from: w0 */
    public final RunnableC0020n f2116w0;

    /* renamed from: x */
    public int f2117x;

    /* renamed from: x0 */
    public final C0827y f2118x0;

    /* renamed from: y */
    public boolean f2119y;

    /* renamed from: z */
    public boolean f2120z;

    static {
        Class cls = Integer.TYPE;
        f2052z0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2050A0 = new InterpolatorC0304d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.altaysoft.t500_split.R.attr.recyclerViewStyle);
    }

    /* renamed from: E */
    public static RecyclerView m1482E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView m1482E = m1482E(viewGroup.getChildAt(i));
            if (m1482E != null) {
                return m1482E;
            }
        }
        return null;
    }

    /* renamed from: J */
    public static AbstractC0792W m1483J(View view) {
        if (view == null) {
            return null;
        }
        return ((C0779I) view.getLayoutParams()).f3947a;
    }

    private C0202m getScrollingChildHelper() {
        if (this.f2106r0 == null) {
            this.f2106r0 = new C0202m(this);
        }
        return this.f2106r0;
    }

    /* renamed from: j */
    public static void m1488j(AbstractC0792W abstractC0792W) {
        WeakReference weakReference = abstractC0792W.f3996b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0792W.f3995a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0792W.f3996b = null;
        }
    }

    /* renamed from: A */
    public final void m1489A(C0789T c0789t) {
        if (getScrollState() != 2) {
            c0789t.getClass();
            return;
        }
        OverScroller overScroller = this.f2082f0.f3989c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0789t.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m1490B(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1491C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2107s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0814l c0814l = (C0814l) arrayList.get(i);
            int i2 = c0814l.f4132v;
            if (i2 == 1) {
                boolean m2312d = c0814l.m2312d(motionEvent.getX(), motionEvent.getY());
                boolean m2311c = c0814l.m2311c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (m2312d || m2311c)) {
                    if (m2311c) {
                        c0814l.f4133w = 1;
                        c0814l.f4126p = (int) motionEvent.getX();
                    } else if (m2312d) {
                        c0814l.f4133w = 2;
                        c0814l.f4123m = (int) motionEvent.getY();
                    }
                    c0814l.m2313f(2);
                    if (action == 3) {
                        this.f2109t = c0814l;
                        return true;
                    }
                }
            } else {
                if (i2 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public final void m1492D(int[] iArr) {
        int m596f = this.f2089j.m596f();
        if (m596f == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        for (int i3 = 0; i3 < m596f; i3++) {
            AbstractC0792W m1483J = m1483J(this.f2089j.m595e(i3));
            if (!m1483J.m2283p()) {
                int m2269b = m1483J.m2269b();
                if (m2269b < i) {
                    i = m2269b;
                }
                if (m2269b > i2) {
                    i2 = m2269b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: F */
    public final AbstractC0792W m1493F(int i) {
        AbstractC0792W abstractC0792W = null;
        if (this.f2057E) {
            return null;
        }
        int m603m = this.f2089j.m603m();
        for (int i2 = 0; i2 < m603m; i2++) {
            AbstractC0792W m1483J = m1483J(this.f2089j.m602l(i2));
            if (m1483J != null && !m1483J.m2276i() && m1494G(m1483J) == i) {
                if (!((ArrayList) this.f2089j.f535d).contains(m1483J.f3995a)) {
                    return m1483J;
                }
                abstractC0792W = m1483J;
            }
        }
        return abstractC0792W;
    }

    /* renamed from: G */
    public final int m1494G(AbstractC0792W abstractC0792W) {
        if (abstractC0792W.m2271d(524) || !abstractC0792W.m2273f()) {
            return -1;
        }
        C0112d c0112d = this.f2087i;
        int i = abstractC0792W.f3997c;
        ArrayList arrayList = (ArrayList) c0112d.f351c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0796a c0796a = (C0796a) arrayList.get(i2);
            int i3 = c0796a.f4019a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0796a.f4020b;
                    if (i4 <= i) {
                        int i5 = c0796a.f4021c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0796a.f4020b;
                    if (i6 == i) {
                        i = c0796a.f4021c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0796a.f4021c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0796a.f4020b <= i) {
                i += c0796a.f4021c;
            }
        }
        return i;
    }

    /* renamed from: H */
    public final long m1495H(AbstractC0792W abstractC0792W) {
        return this.f2101p.f4210b ? abstractC0792W.f3999e : abstractC0792W.f3997c;
    }

    /* renamed from: I */
    public final AbstractC0792W m1496I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1483J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: K */
    public final Rect m1497K(View view) {
        C0779I c0779i = (C0779I) view.getLayoutParams();
        boolean z2 = c0779i.f3949c;
        Rect rect = c0779i.f3948b;
        if (!z2) {
            return rect;
        }
        if (this.f2088i0.f3979g && (c0779i.f3947a.m2279l() || c0779i.f3947a.m2274g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2105r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f2095m;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0775E) arrayList.get(i)).getClass();
            ((C0779I) view.getLayoutParams()).f3947a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0779i.f3949c = false;
        return rect;
    }

    /* renamed from: L */
    public final boolean m1498L() {
        return !this.f2115w || this.f2057E || this.f2087i.m356g();
    }

    /* renamed from: M */
    public final boolean m1499M() {
        return this.f2059G > 0;
    }

    /* renamed from: N */
    public final void m1500N(int i) {
        if (this.f2103q == null) {
            return;
        }
        setScrollState(2);
        this.f2103q.mo1478p0(i);
        awakenScrollBars();
    }

    /* renamed from: O */
    public final void m1501O() {
        int m603m = this.f2089j.m603m();
        for (int i = 0; i < m603m; i++) {
            ((C0779I) this.f2089j.m602l(i).getLayoutParams()).f3949c = true;
        }
        ArrayList arrayList = this.f2083g.f3959c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0779I c0779i = (C0779I) ((AbstractC0792W) arrayList.get(i2)).f3995a.getLayoutParams();
            if (c0779i != null) {
                c0779i.f3949c = true;
            }
        }
    }

    /* renamed from: P */
    public final void m1502P(int i, boolean z2, int i2) {
        int i3 = i + i2;
        int m603m = this.f2089j.m603m();
        for (int i4 = 0; i4 < m603m; i4++) {
            AbstractC0792W m1483J = m1483J(this.f2089j.m602l(i4));
            if (m1483J != null && !m1483J.m2283p()) {
                int i5 = m1483J.f3997c;
                C0789T c0789t = this.f2088i0;
                if (i5 >= i3) {
                    m1483J.m2280m(-i2, z2);
                    c0789t.f3978f = true;
                } else if (i5 >= i) {
                    m1483J.m2268a(8);
                    m1483J.m2280m(-i2, z2);
                    m1483J.f3997c = i - 1;
                    c0789t.f3978f = true;
                }
            }
        }
        C0784N c0784n = this.f2083g;
        ArrayList arrayList = c0784n.f3959c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0792W abstractC0792W = (AbstractC0792W) arrayList.get(size);
            if (abstractC0792W != null) {
                int i6 = abstractC0792W.f3997c;
                if (i6 >= i3) {
                    abstractC0792W.m2280m(-i2, z2);
                } else if (i6 >= i) {
                    abstractC0792W.m2268a(8);
                    c0784n.m2256e(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: Q */
    public final void m1503Q() {
        this.f2059G++;
    }

    /* renamed from: R */
    public final void m1504R(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f2059G - 1;
        this.f2059G = i2;
        if (i2 < 1) {
            this.f2059G = 0;
            if (z2) {
                int i3 = this.f2054B;
                this.f2054B = 0;
                if (i3 != 0 && (accessibilityManager = this.f2055C) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f2114v0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0792W abstractC0792W = (AbstractC0792W) arrayList.get(size);
                    if (abstractC0792W.f3995a.getParent() == this && !abstractC0792W.m2283p() && (i = abstractC0792W.f4011q) != -1) {
                        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                        abstractC0792W.f3995a.setImportantForAccessibility(i);
                        abstractC0792W.f4011q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: S */
    public final void m1505S(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2068P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2068P = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f2072T = x2;
            this.f2070R = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f2073U = y2;
            this.f2071S = y2;
        }
    }

    /* renamed from: T */
    public final void m1506T() {
        if (this.f2100o0 || !this.f2111u) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        postOnAnimation(this.f2116w0);
        this.f2100o0 = true;
    }

    /* renamed from: U */
    public final void m1507U(AbstractC0792W abstractC0792W, C0208p c0208p) {
        abstractC0792W.f4004j &= -8193;
        boolean z2 = this.f2088i0.f3980h;
        C0043j c0043j = this.f2091k;
        if (z2 && abstractC0792W.m2279l() && !abstractC0792W.m2276i() && !abstractC0792W.m2283p()) {
            ((C1195e) c0043j.f142h).m2857e(m1495H(abstractC0792W), abstractC0792W);
        }
        C1201k c1201k = (C1201k) c0043j.f141g;
        C0809g0 c0809g0 = (C0809g0) c1201k.getOrDefault(abstractC0792W, null);
        if (c0809g0 == null) {
            c0809g0 = C0809g0.m2303a();
            c1201k.put(abstractC0792W, c0809g0);
        }
        c0809g0.f4084b = c0208p;
        c0809g0.f4083a |= 4;
    }

    /* renamed from: V */
    public final void m1508V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2095m;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0779I) {
            C0779I c0779i = (C0779I) layoutParams;
            if (!c0779i.f3949c) {
                int i = rect.left;
                Rect rect2 = c0779i.f3948b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2103q.mo2063m0(this, view, this.f2095m, !this.f2115w, view2 == null);
    }

    /* renamed from: W */
    public final void m1509W() {
        VelocityTracker velocityTracker = this.f2069Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        m1517e0(0);
        EdgeEffect edgeEffect = this.f2062J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f2062J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2063K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f2063K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2064L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f2064L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2065M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f2065M.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1510X(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        m1524m();
        AbstractC0828z abstractC0828z = this.f2101p;
        int[] iArr = this.f2112u0;
        if (abstractC0828z != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m1511Y(i, i2, iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            i3 = i7;
            i4 = i8;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.f2105r.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m1531t(i3, i4, i5, i6, this.f2108s0, 0, iArr);
        int i9 = iArr[0];
        int i10 = i5 - i9;
        int i11 = iArr[1];
        int i12 = i6 - i11;
        boolean z3 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f2072T;
        int[] iArr2 = this.f2108s0;
        int i14 = iArr2[0];
        this.f2072T = i13 - i14;
        int i15 = this.f2073U;
        int i16 = iArr2[1];
        this.f2073U = i15 - i16;
        int[] iArr3 = this.f2110t0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i10;
                float y2 = motionEvent.getY();
                float f3 = i12;
                if (f2 < 0.0f) {
                    m1534w();
                    AbstractC0270d.m791a(this.f2062J, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > 0.0f) {
                    m1535x();
                    AbstractC0270d.m791a(this.f2064L, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= 0.0f) {
                        m1536y();
                        AbstractC0270d.m791a(this.f2063K, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > 0.0f) {
                            m1533v();
                            AbstractC0270d.m791a(this.f2065M, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != 0.0f || f3 != 0.0f) {
                            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = AbstractC0169Q.f475a;
                postInvalidateOnAnimation();
            }
            m1523l(i, i2);
        }
        if (i3 != 0 || i4 != 0) {
            m1532u(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i3 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: Y */
    public final void m1511Y(int i, int i2, int[] iArr) {
        AbstractC0792W abstractC0792W;
        C0198k c0198k = this.f2089j;
        m1515c0();
        m1503Q();
        int i3 = AbstractC0107h.f342a;
        Trace.beginSection("RV Scroll");
        C0789T c0789t = this.f2088i0;
        m1489A(c0789t);
        C0784N c0784n = this.f2083g;
        int mo1430o0 = i != 0 ? this.f2103q.mo1430o0(i, c0784n, c0789t) : 0;
        int mo1433q0 = i2 != 0 ? this.f2103q.mo1433q0(i2, c0784n, c0789t) : 0;
        Trace.endSection();
        int m596f = c0198k.m596f();
        for (int i4 = 0; i4 < m596f; i4++) {
            View m595e = c0198k.m595e(i4);
            AbstractC0792W m1496I = m1496I(m595e);
            if (m1496I != null && (abstractC0792W = m1496I.f4003i) != null) {
                int left = m595e.getLeft();
                int top = m595e.getTop();
                View view = abstractC0792W.f3995a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1504R(true);
        m1516d0(false);
        if (iArr != null) {
            iArr[0] = mo1430o0;
            iArr[1] = mo1433q0;
        }
    }

    /* renamed from: Z */
    public final void m1512Z(int i) {
        C0824v c0824v;
        if (this.f2120z) {
            return;
        }
        setScrollState(0);
        RunnableC0791V runnableC0791V = this.f2082f0;
        runnableC0791V.f3993g.removeCallbacks(runnableC0791V);
        runnableC0791V.f3989c.abortAnimation();
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null && (c0824v = abstractC0778H.f3936e) != null) {
            c0824v.m2328i();
        }
        AbstractC0778H abstractC0778H2 = this.f2103q;
        if (abstractC0778H2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0778H2.mo1478p0(i);
            awakenScrollBars();
        }
    }

    /* renamed from: a0 */
    public final void m1513a0(int i, boolean z2, int i2) {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2120z) {
            return;
        }
        if (!abstractC0778H.mo1467d()) {
            i = 0;
        }
        if (!this.f2103q.mo1468e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z2) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m639g(i3, 1);
        }
        this.f2082f0.m2267b(i, i2, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null) {
            abstractC0778H.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: b0 */
    public final void m1514b0(int i) {
        if (this.f2120z) {
            return;
        }
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0778H.mo1481z0(this, i);
        }
    }

    /* renamed from: c0 */
    public final void m1515c0() {
        int i = this.f2117x + 1;
        this.f2117x = i;
        if (i != 1 || this.f2120z) {
            return;
        }
        this.f2119y = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0779I) && this.f2103q.mo1418f((C0779I) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null && abstractC0778H.mo1467d()) {
            return this.f2103q.mo1476j(this.f2088i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null && abstractC0778H.mo1467d()) {
            return this.f2103q.mo1422k(this.f2088i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null && abstractC0778H.mo1467d()) {
            return this.f2103q.mo1424l(this.f2088i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null && abstractC0778H.mo1468e()) {
            return this.f2103q.mo1477m(this.f2088i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null && abstractC0778H.mo1468e()) {
            return this.f2103q.mo1427n(this.f2088i0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null && abstractC0778H.mo1468e()) {
            return this.f2103q.mo1429o(this.f2088i0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void m1516d0(boolean z2) {
        if (this.f2117x < 1) {
            this.f2117x = 1;
        }
        if (!z2 && !this.f2120z) {
            this.f2119y = false;
        }
        if (this.f2117x == 1) {
            if (z2 && this.f2119y && !this.f2120z && this.f2103q != null && this.f2101p != null) {
                m1527p();
            }
            if (!this.f2120z) {
                this.f2119y = false;
            }
        }
        this.f2117x--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().m633a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().m634b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m635c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m636d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f2105r;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0775E) arrayList.get(i)).mo410b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2062J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2093l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2062J;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2063K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2093l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2063K;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2064L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2093l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2064L;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2065M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2093l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2065M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f2066N == null || arrayList.size() <= 0 || !this.f2066N.mo2212f()) ? z2 : true) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* renamed from: e0 */
    public final void m1517e0(int i) {
        getScrollingChildHelper().m640h(i);
    }

    /* renamed from: f */
    public final void m1518f(AbstractC0792W abstractC0792W) {
        View view = abstractC0792W.f3995a;
        boolean z2 = view.getParent() == this;
        this.f2083g.m2261j(m1496I(view));
        if (abstractC0792W.m2278k()) {
            this.f2089j.m593b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f2089j.m592a(-1, view, true);
            return;
        }
        C0198k c0198k = this.f2089j;
        int indexOfChild = ((C0827y) c0198k.f533b).f4208a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0798b) c0198k.f534c).m2293h(indexOfChild);
            c0198k.m606p(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018a, code lost:
    
        if ((r5 * r6) < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if ((r5 * r6) > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017c, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017f, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0182, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c2;
        boolean z2;
        this.f2103q.getClass();
        boolean z3 = true;
        boolean z4 = (this.f2101p == null || this.f2103q == null || m1499M() || this.f2120z) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C0789T c0789t = this.f2088i0;
        C0784N c0784n = this.f2083g;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f2103q.mo1468e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f2103q.mo1467d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f2103q.m2227C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        m1524m();
                        if (m1490B(view) == null) {
                            return null;
                        }
                        m1515c0();
                        this.f2103q.mo1406S(view, i, c0784n, c0789t);
                        m1516d0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f2103q.m2227C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z2) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z4) {
                m1524m();
                if (m1490B(view) == null) {
                    return null;
                }
                m1515c0();
                view2 = this.f2103q.mo1406S(view, i, c0784n, c0789t);
                m1516d0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m1508V(view2, null);
            return view;
        }
        if (view2 != null && view2 != this) {
            if (m1490B(view2) == null) {
                z3 = false;
            } else if (view != null && m1490B(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f2095m;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.f2097n;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f2103q.m2227C() == 1 ? -1 : 1;
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    i2 = 1;
                } else {
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                    c2 = 1;
                } else {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    c2 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + m1537z());
                                    }
                                }
                            }
                        }
                    } else if (c2 <= 0) {
                        if (c2 == 0) {
                        }
                    }
                } else if (c2 >= 0) {
                    if (c2 == 0) {
                    }
                }
            }
            return !z3 ? view2 : super.focusSearch(view, i);
        }
        z3 = false;
        if (!z3) {
        }
    }

    /* renamed from: g */
    public final void m1519g(AbstractC0775E abstractC0775E) {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null) {
            abstractC0778H.mo1465c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2105r;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0775E);
        m1501O();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null) {
            return abstractC0778H.mo1434r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1537z());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null) {
            return abstractC0778H.mo1435s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1537z());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0828z getAdapter() {
        return this.f2101p;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H == null) {
            return super.getBaseline();
        }
        abstractC0778H.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2093l;
    }

    public C0794Y getCompatAccessibilityDelegate() {
        return this.f2102p0;
    }

    public C0773C getEdgeEffectFactory() {
        return this.f2061I;
    }

    public AbstractC0774D getItemAnimator() {
        return this.f2066N;
    }

    public int getItemDecorationCount() {
        return this.f2105r.size();
    }

    public AbstractC0778H getLayoutManager() {
        return this.f2103q;
    }

    public int getMaxFlingVelocity() {
        return this.f2077b0;
    }

    public int getMinFlingVelocity() {
        return this.f2076a0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0780J getOnFlingListener() {
        return this.f2075W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2080e0;
    }

    public C0783M getRecycledViewPool() {
        return this.f2083g.m2254c();
    }

    public int getScrollState() {
        return this.f2067O;
    }

    /* renamed from: h */
    public final void m1520h(AbstractC0781K abstractC0781K) {
        if (this.f2092k0 == null) {
            this.f2092k0 = new ArrayList();
        }
        this.f2092k0.add(abstractC0781K);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m638f(0);
    }

    /* renamed from: i */
    public final void m1521i(String str) {
        if (m1499M()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1537z());
        }
        if (this.f2060H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m1537z()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2111u;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2120z;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f546d;
    }

    /* renamed from: k */
    public final void m1522k() {
        int m603m = this.f2089j.m603m();
        for (int i = 0; i < m603m; i++) {
            AbstractC0792W m1483J = m1483J(this.f2089j.m602l(i));
            if (!m1483J.m2283p()) {
                m1483J.f3998d = -1;
                m1483J.f4001g = -1;
            }
        }
        C0784N c0784n = this.f2083g;
        ArrayList arrayList = c0784n.f3959c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0792W abstractC0792W = (AbstractC0792W) arrayList.get(i2);
            abstractC0792W.f3998d = -1;
            abstractC0792W.f4001g = -1;
        }
        ArrayList arrayList2 = c0784n.f3957a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0792W abstractC0792W2 = (AbstractC0792W) arrayList2.get(i3);
            abstractC0792W2.f3998d = -1;
            abstractC0792W2.f4001g = -1;
        }
        ArrayList arrayList3 = c0784n.f3958b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC0792W abstractC0792W3 = (AbstractC0792W) c0784n.f3958b.get(i4);
                abstractC0792W3.f3998d = -1;
                abstractC0792W3.f4001g = -1;
            }
        }
    }

    /* renamed from: l */
    public final void m1523l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f2062J;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f2062J.onRelease();
            z2 = this.f2062J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2064L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f2064L.onRelease();
            z2 |= this.f2064L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2063K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f2063K.onRelease();
            z2 |= this.f2063K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2065M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f2065M.onRelease();
            z2 |= this.f2065M.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: m */
    public final void m1524m() {
        C0112d c0112d = this.f2087i;
        if (!this.f2115w || this.f2057E) {
            int i = AbstractC0107h.f342a;
            Trace.beginSection("RV FullInvalidate");
            m1527p();
            Trace.endSection();
            return;
        }
        if (c0112d.m356g()) {
            c0112d.getClass();
            if (c0112d.m356g()) {
                int i2 = AbstractC0107h.f342a;
                Trace.beginSection("RV FullInvalidate");
                m1527p();
                Trace.endSection();
            }
        }
    }

    /* renamed from: n */
    public final void m1525n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        setMeasuredDimension(AbstractC0778H.m2222g(i, paddingRight, getMinimumWidth()), AbstractC0778H.m2222g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* renamed from: o */
    public final void m1526o(View view) {
        m1483J(view);
        ArrayList arrayList = this.f2056D;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1228g) this.f2056D.get(size)).getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.f2059G = 0;
        this.f2111u = true;
        this.f2115w = this.f2115w && !isLayoutRequested();
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null) {
            abstractC0778H.f3938g = true;
            abstractC0778H.mo2062Q(this);
        }
        this.f2100o0 = false;
        ThreadLocal threadLocal = RunnableC0817o.f4146e;
        RunnableC0817o runnableC0817o = (RunnableC0817o) threadLocal.get();
        this.f2084g0 = runnableC0817o;
        if (runnableC0817o == null) {
            RunnableC0817o runnableC0817o2 = new RunnableC0817o();
            runnableC0817o2.f4148a = new ArrayList();
            runnableC0817o2.f4151d = new ArrayList();
            this.f2084g0 = runnableC0817o2;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0817o runnableC0817o3 = this.f2084g0;
            runnableC0817o3.f4150c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0817o3);
        }
        this.f2084g0.f4148a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0824v c0824v;
        super.onDetachedFromWindow();
        AbstractC0774D abstractC0774D = this.f2066N;
        if (abstractC0774D != null) {
            abstractC0774D.mo2211e();
        }
        setScrollState(0);
        RunnableC0791V runnableC0791V = this.f2082f0;
        runnableC0791V.f3993g.removeCallbacks(runnableC0791V);
        runnableC0791V.f3989c.abortAnimation();
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null && (c0824v = abstractC0778H.f3936e) != null) {
            c0824v.m2328i();
        }
        this.f2111u = false;
        AbstractC0778H abstractC0778H2 = this.f2103q;
        if (abstractC0778H2 != null) {
            abstractC0778H2.f3938g = false;
            abstractC0778H2.mo1453R(this);
        }
        this.f2114v0.clear();
        removeCallbacks(this.f2116w0);
        this.f2091k.getClass();
        while (C0809g0.f4082d.mo401a() != null) {
        }
        RunnableC0817o runnableC0817o = this.f2084g0;
        if (runnableC0817o != null) {
            runnableC0817o.f4148a.remove(this);
            this.f2084g0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2105r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0775E) arrayList.get(i)).mo2074a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f2103q != null && !this.f2120z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2103q.mo1468e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2103q.mo1467d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        m1510X((int) (f3 * this.f2078c0), (int) (f2 * this.f2079d0), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                m1510X((int) (f3 * this.f2078c0), (int) (f2 * this.f2079d0), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2103q.mo1468e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        m1510X((int) (f3 * this.f2078c0), (int) (f2 * this.f2079d0), motionEvent);
                    } else if (this.f2103q.mo1467d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        m1510X((int) (f3 * this.f2078c0), (int) (f2 * this.f2079d0), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                m1510X((int) (f3 * this.f2078c0), (int) (f2 * this.f2079d0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f2120z) {
            return false;
        }
        this.f2109t = null;
        if (m1491C(motionEvent)) {
            m1509W();
            setScrollState(0);
            return true;
        }
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H == null) {
            return false;
        }
        boolean mo1467d = abstractC0778H.mo1467d();
        boolean mo1468e = this.f2103q.mo1468e();
        if (this.f2069Q == null) {
            this.f2069Q = VelocityTracker.obtain();
        }
        this.f2069Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2053A) {
                this.f2053A = false;
            }
            this.f2068P = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2072T = x2;
            this.f2070R = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2073U = y2;
            this.f2071S = y2;
            if (this.f2067O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m1517e0(1);
            }
            int[] iArr = this.f2110t0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = mo1467d;
            if (mo1468e) {
                i = (mo1467d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m639g(i, 0);
        } else if (actionMasked == 1) {
            this.f2069Q.clear();
            m1517e0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2068P);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2068P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2067O != 1) {
                int i2 = x3 - this.f2070R;
                int i3 = y3 - this.f2071S;
                if (mo1467d == 0 || Math.abs(i2) <= this.f2074V) {
                    z2 = false;
                } else {
                    this.f2072T = x3;
                    z2 = true;
                }
                if (mo1468e && Math.abs(i3) > this.f2074V) {
                    this.f2073U = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m1509W();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2068P = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2072T = x4;
            this.f2070R = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2073U = y4;
            this.f2071S = y4;
        } else if (actionMasked == 6) {
            m1505S(motionEvent);
        }
        return this.f2067O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = AbstractC0107h.f342a;
        Trace.beginSection("RV OnLayout");
        m1527p();
        Trace.endSection();
        this.f2115w = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H == null) {
            m1525n(i, i2);
            return;
        }
        boolean mo1447L = abstractC0778H.mo1447L();
        C0789T c0789t = this.f2088i0;
        if (!mo1447L) {
            if (this.f2113v) {
                this.f2103q.f3933b.m1525n(i, i2);
                return;
            }
            if (c0789t.f3983k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0828z abstractC0828z = this.f2101p;
            if (abstractC0828z != null) {
                c0789t.f3977e = abstractC0828z.mo2089a();
            } else {
                c0789t.f3977e = 0;
            }
            m1515c0();
            this.f2103q.f3933b.m1525n(i, i2);
            m1516d0(false);
            c0789t.f3979g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2103q.f3933b.m1525n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f2101p == null) {
            return;
        }
        if (c0789t.f3976d == 1) {
            m1528q();
        }
        this.f2103q.m2244s0(i, i2);
        c0789t.f3981i = true;
        m1529r();
        this.f2103q.m2246u0(i, i2);
        if (this.f2103q.mo1480x0()) {
            this.f2103q.m2244s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c0789t.f3981i = true;
            m1529r();
            this.f2103q.m2246u0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m1499M()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0786P)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0786P c0786p = (C0786P) parcelable;
        this.f2085h = c0786p;
        super.onRestoreInstanceState(c0786p.f833a);
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H == null || (parcelable2 = this.f2085h.f3965c) == null) {
            return;
        }
        abstractC0778H.mo1469e0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0786P c0786p = new C0786P(super.onSaveInstanceState());
        C0786P c0786p2 = this.f2085h;
        if (c0786p2 != null) {
            c0786p.f3965c = c0786p2.f3965c;
        } else {
            AbstractC0778H abstractC0778H = this.f2103q;
            if (abstractC0778H != null) {
                c0786p.f3965c = abstractC0778H.mo1471f0();
            } else {
                c0786p.f3965c = null;
            }
        }
        return c0786p;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f2065M = null;
        this.f2063K = null;
        this.f2064L = null;
        this.f2062J = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        RecyclerView recyclerView2;
        int minFlingVelocity;
        boolean z3;
        int i;
        PointF mo1462a;
        int i2;
        boolean z4;
        if (this.f2120z || this.f2053A) {
            return false;
        }
        C0814l c0814l = this.f2109t;
        if (c0814l == null) {
            z2 = motionEvent.getAction() == 0 ? false : m1491C(motionEvent);
        } else {
            if (c0814l.f4132v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean m2312d = c0814l.m2312d(motionEvent.getX(), motionEvent.getY());
                    boolean m2311c = c0814l.m2311c(motionEvent.getX(), motionEvent.getY());
                    if (m2312d || m2311c) {
                        if (m2311c) {
                            c0814l.f4133w = 1;
                            c0814l.f4126p = (int) motionEvent.getX();
                        } else if (m2312d) {
                            c0814l.f4133w = 2;
                            c0814l.f4123m = (int) motionEvent.getY();
                        }
                        c0814l.m2313f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0814l.f4132v == 2) {
                    c0814l.f4123m = 0.0f;
                    c0814l.f4126p = 0.0f;
                    c0814l.m2313f(1);
                    c0814l.f4133w = 0;
                } else if (motionEvent.getAction() == 2 && c0814l.f4132v == 2) {
                    c0814l.m2314g();
                    int i3 = c0814l.f4133w;
                    int i4 = c0814l.f4112b;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0814l.f4135y;
                        iArr[0] = i4;
                        int i5 = c0814l.f4127q - i4;
                        iArr[1] = i5;
                        float max = Math.max(i4, Math.min(i5, x2));
                        if (Math.abs(c0814l.f4125o - max) >= 2.0f) {
                            int m2310e = C0814l.m2310e(c0814l.f4126p, max, iArr, c0814l.f4129s.computeHorizontalScrollRange(), c0814l.f4129s.computeHorizontalScrollOffset(), c0814l.f4127q);
                            if (m2310e != 0) {
                                c0814l.f4129s.scrollBy(m2310e, 0);
                            }
                            c0814l.f4126p = max;
                        }
                    }
                    if (c0814l.f4133w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0814l.f4134x;
                        iArr2[0] = i4;
                        int i6 = c0814l.f4128r - i4;
                        iArr2[1] = i6;
                        float max2 = Math.max(i4, Math.min(i6, y2));
                        if (Math.abs(c0814l.f4122l - max2) >= 2.0f) {
                            int m2310e2 = C0814l.m2310e(c0814l.f4123m, max2, iArr2, c0814l.f4129s.computeVerticalScrollRange(), c0814l.f4129s.computeVerticalScrollOffset(), c0814l.f4128r);
                            if (m2310e2 != 0) {
                                c0814l.f4129s.scrollBy(0, m2310e2);
                            }
                            c0814l.f4123m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f2109t = null;
            }
            z2 = true;
        }
        if (z2) {
            m1509W();
            setScrollState(0);
            return true;
        }
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H == null) {
            return false;
        }
        boolean mo1467d = abstractC0778H.mo1467d();
        boolean mo1468e = this.f2103q.mo1468e();
        if (this.f2069Q == null) {
            this.f2069Q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f2110t0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f2068P = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f2072T = x3;
            recyclerView.f2070R = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f2073U = y3;
            recyclerView.f2071S = y3;
            int i7 = mo1467d;
            if (mo1468e) {
                i7 = (mo1467d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m639g(i7, 0);
        } else {
            if (actionMasked == 1) {
                this.f2069Q.addMovement(obtain);
                VelocityTracker velocityTracker = this.f2069Q;
                int i8 = this.f2077b0;
                velocityTracker.computeCurrentVelocity(1000, i8);
                float f2 = mo1467d != 0 ? -this.f2069Q.getXVelocity(this.f2068P) : 0.0f;
                float f3 = mo1468e ? -this.f2069Q.getYVelocity(this.f2068P) : 0.0f;
                if (f2 == 0.0f && f3 == 0.0f) {
                    recyclerView2 = this;
                    i2 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i9 = (int) f2;
                    int i10 = (int) f3;
                    AbstractC0778H abstractC0778H2 = this.f2103q;
                    if (abstractC0778H2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f2120z) {
                        int mo1467d2 = abstractC0778H2.mo1467d();
                        boolean mo1468e2 = this.f2103q.mo1468e();
                        int i11 = this.f2076a0;
                        if (mo1467d2 == 0 || Math.abs(i9) < i11) {
                            i9 = 0;
                        }
                        if (!mo1468e2 || Math.abs(i10) < i11) {
                            i10 = 0;
                        }
                        if (i9 != 0 || i10 != 0) {
                            float f4 = i9;
                            float f5 = i10;
                            if (!dispatchNestedPreFling(f4, f5)) {
                                boolean z5 = mo1467d2 != 0 || mo1468e2;
                                dispatchNestedFling(f4, f5, z5);
                                AbstractC0780J abstractC0780J = this.f2075W;
                                if (abstractC0780J != null) {
                                    C0826x c0826x = (C0826x) abstractC0780J;
                                    AbstractC0778H layoutManager = c0826x.f4204a.getLayoutManager();
                                    if (layoutManager != 0 && c0826x.f4204a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = c0826x.f4204a.getMinFlingVelocity()) || Math.abs(i9) > minFlingVelocity) && ((z3 = layoutManager instanceof InterfaceC0788S)))) {
                                        C0148b c0148b = !z3 ? null : new C0148b(c0826x, c0826x.f4204a.getContext(), 1);
                                        if (c0148b != null) {
                                            int m2226B = layoutManager.m2226B();
                                            if (m2226B != 0) {
                                                AbstractC0312f m2335g = layoutManager.mo1468e() ? c0826x.m2335g(layoutManager) : layoutManager.mo1467d() ? c0826x.m2334f(layoutManager) : null;
                                                if (m2335g != null) {
                                                    int m2247v = layoutManager.m2247v();
                                                    motionEvent4 = obtain;
                                                    int i12 = Integer.MIN_VALUE;
                                                    int i13 = Integer.MAX_VALUE;
                                                    int i14 = 0;
                                                    View view = null;
                                                    View view2 = null;
                                                    while (i14 < m2247v) {
                                                        int i15 = m2247v;
                                                        View m2245u = layoutManager.m2245u(i14);
                                                        if (m2245u != null) {
                                                            int m2329c = C0826x.m2329c(m2245u, m2335g);
                                                            if (m2329c <= 0 && m2329c > i12) {
                                                                i12 = m2329c;
                                                                view2 = m2245u;
                                                            }
                                                            if (m2329c >= 0 && m2329c < i13) {
                                                                i13 = m2329c;
                                                                view = m2245u;
                                                            }
                                                        }
                                                        i14++;
                                                        m2247v = i15;
                                                    }
                                                    boolean z6 = !layoutManager.mo1467d() ? i10 <= 0 : i9 <= 0;
                                                    if (z6 && view != null) {
                                                        i = AbstractC0778H.m2218H(view);
                                                    } else if (z6 || view2 == null) {
                                                        if (z6) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int m2218H = ((z3 && (mo1462a = ((InterfaceC0788S) layoutManager).mo1462a(layoutManager.m2226B() - 1)) != null && ((mo1462a.x > 0.0f ? 1 : (mo1462a.x == 0.0f ? 0 : -1)) < 0 || (mo1462a.y > 0.0f ? 1 : (mo1462a.y == 0.0f ? 0 : -1)) < 0)) == z6 ? -1 : 1) + AbstractC0778H.m2218H(view);
                                                            if (m2218H >= 0 && m2218H < m2226B) {
                                                                i = m2218H;
                                                            }
                                                        }
                                                        i = -1;
                                                    } else {
                                                        i = AbstractC0778H.m2218H(view2);
                                                    }
                                                    if (i != -1) {
                                                        c0148b.f4187a = i;
                                                        layoutManager.m2225A0(c0148b);
                                                        m1509W();
                                                        motionEvent3 = motionEvent4;
                                                        motionEvent3.recycle();
                                                        return true;
                                                    }
                                                    if (z5) {
                                                        if (mo1468e2) {
                                                            mo1467d2 = (mo1467d2 == true ? 1 : 0) | 2;
                                                        }
                                                        getScrollingChildHelper().m639g(mo1467d2, 1);
                                                        int i16 = -i8;
                                                        int max3 = Math.max(i16, Math.min(i9, i8));
                                                        int max4 = Math.max(i16, Math.min(i10, i8));
                                                        RunnableC0791V runnableC0791V = this.f2082f0;
                                                        RecyclerView recyclerView3 = runnableC0791V.f3993g;
                                                        recyclerView3.setScrollState(2);
                                                        runnableC0791V.f3988b = 0;
                                                        runnableC0791V.f3987a = 0;
                                                        Interpolator interpolator = runnableC0791V.f3990d;
                                                        InterpolatorC0304d interpolatorC0304d = f2050A0;
                                                        if (interpolator != interpolatorC0304d) {
                                                            runnableC0791V.f3990d = interpolatorC0304d;
                                                            runnableC0791V.f3989c = new OverScroller(recyclerView3.getContext(), interpolatorC0304d);
                                                        }
                                                        runnableC0791V.f3989c.fling(0, 0, max3, max4, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE);
                                                        runnableC0791V.m2266a();
                                                        m1509W();
                                                        motionEvent3 = motionEvent4;
                                                        motionEvent3.recycle();
                                                        return true;
                                                    }
                                                    recyclerView2 = this;
                                                    i2 = 0;
                                                }
                                            }
                                            motionEvent4 = obtain;
                                            i = -1;
                                            if (i != -1) {
                                            }
                                            if (z5) {
                                            }
                                        }
                                    }
                                }
                                motionEvent4 = obtain;
                                if (z5) {
                                }
                            }
                        }
                    }
                    recyclerView2 = this;
                    motionEvent4 = obtain;
                    i2 = 0;
                }
                recyclerView2.setScrollState(i2);
                m1509W();
                motionEvent3 = motionEvent4;
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2068P);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2068P + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i17 = this.f2072T - x4;
                int i18 = this.f2073U - y4;
                if (this.f2067O != 1) {
                    if (mo1467d != 0) {
                        i17 = i17 > 0 ? Math.max(0, i17 - this.f2074V) : Math.min(0, i17 + this.f2074V);
                        if (i17 != 0) {
                            z4 = true;
                            if (mo1468e) {
                                i18 = i18 > 0 ? Math.max(0, i18 - this.f2074V) : Math.min(0, i18 + this.f2074V);
                                if (i18 != 0) {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                setScrollState(1);
                            }
                        }
                    }
                    z4 = false;
                    if (mo1468e) {
                    }
                    if (z4) {
                    }
                }
                int i19 = i17;
                int i20 = i18;
                if (this.f2067O == 1) {
                    int[] iArr4 = this.f2112u0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean m1530s = m1530s(mo1467d != 0 ? i19 : 0, mo1468e ? i20 : 0, iArr4, this.f2108s0, 0);
                    int[] iArr5 = this.f2108s0;
                    if (m1530s) {
                        i19 -= iArr4[0];
                        i20 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i21 = i19;
                    int i22 = i20;
                    this.f2072T = x4 - iArr5[0];
                    this.f2073U = y4 - iArr5[1];
                    if (m1510X(mo1467d != 0 ? i21 : 0, mo1468e ? i22 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0817o runnableC0817o = this.f2084g0;
                    if (runnableC0817o != null && (i21 != 0 || i22 != 0)) {
                        runnableC0817o.m2318a(this, i21, i22);
                    }
                }
            } else if (actionMasked == 3) {
                m1509W();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f2068P = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f2072T = x5;
                this.f2070R = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f2073U = y5;
                this.f2071S = y5;
            } else if (actionMasked == 6) {
                m1505S(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f2069Q.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0323, code lost:
    
        if (((java.util.ArrayList) r19.f2089j.f535d).contains(getFocusedChild()) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0382, code lost:
    
        if (r6.hasFocusable() != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [f0.W] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1527p() {
        ?? r10;
        View view;
        View findViewById;
        boolean z2;
        C0208p c0208p;
        int i;
        RecyclerView recyclerView;
        boolean m2305g;
        if (this.f2101p == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2103q == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C0789T c0789t = this.f2088i0;
        c0789t.f3981i = false;
        if (c0789t.f3976d == 1) {
            m1528q();
            this.f2103q.m2243r0(this);
            m1529r();
        } else {
            C0112d c0112d = this.f2087i;
            if ((((ArrayList) c0112d.f352d).isEmpty() || ((ArrayList) c0112d.f351c).isEmpty()) && this.f2103q.f3945n == getWidth() && this.f2103q.f3946o == getHeight()) {
                this.f2103q.m2243r0(this);
            } else {
                this.f2103q.m2243r0(this);
                m1529r();
            }
        }
        c0789t.m2264a(4);
        m1515c0();
        m1503Q();
        c0789t.f3976d = 1;
        boolean z3 = c0789t.f3982j;
        View view2 = null;
        Long l2 = null;
        C0784N c0784n = this.f2083g;
        C0043j c0043j = this.f2091k;
        if (z3) {
            int m596f = this.f2089j.m596f() - 1;
            while (m596f >= 0) {
                AbstractC0792W m1483J = m1483J(this.f2089j.m595e(m596f));
                if (!m1483J.m2283p()) {
                    long m1495H = m1495H(m1483J);
                    this.f2066N.getClass();
                    C0208p c0208p2 = new C0208p();
                    c0208p2.m662a(m1483J);
                    AbstractC0792W abstractC0792W = (AbstractC0792W) ((C1195e) c0043j.f142h).m2855c(m1495H, l2);
                    if (abstractC0792W == null || abstractC0792W.m2283p()) {
                        c0043j.m77e(m1483J, c0208p2);
                    } else {
                        C1201k c1201k = (C1201k) c0043j.f141g;
                        C0809g0 c0809g0 = (C0809g0) c1201k.getOrDefault(abstractC0792W, l2);
                        boolean z4 = (c0809g0 == null || (c0809g0.f4083a & 1) == 0) ? false : true;
                        C0809g0 c0809g02 = (C0809g0) c1201k.getOrDefault(m1483J, l2);
                        boolean z5 = (c0809g02 == null || (c0809g02.f4083a & 1) == 0) ? false : true;
                        if (z4 && abstractC0792W == m1483J) {
                            c0043j.m77e(m1483J, c0208p2);
                        } else {
                            C0208p m72J = c0043j.m72J(abstractC0792W, 4);
                            c0043j.m77e(m1483J, c0208p2);
                            C0208p m72J2 = c0043j.m72J(m1483J, 8);
                            if (m72J == null) {
                                int m596f2 = this.f2089j.m596f();
                                for (int i2 = 0; i2 < m596f2; i2++) {
                                    AbstractC0792W m1483J2 = m1483J(this.f2089j.m595e(i2));
                                    if (m1483J2 != m1483J && m1495H(m1483J2) == m1495H) {
                                        AbstractC0828z abstractC0828z = this.f2101p;
                                        if (abstractC0828z == null || !abstractC0828z.f4210b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m1483J2 + " \n View Holder 2:" + m1483J + m1537z());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m1483J2 + " \n View Holder 2:" + m1483J + m1537z());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0792W + " cannot be found but it is necessary for " + m1483J + m1537z());
                            } else {
                                abstractC0792W.m2282o(false);
                                if (z4) {
                                    m1518f(abstractC0792W);
                                }
                                if (abstractC0792W != m1483J) {
                                    if (z5) {
                                        m1518f(m1483J);
                                    }
                                    abstractC0792W.f4002h = m1483J;
                                    m1518f(abstractC0792W);
                                    c0784n.m2261j(abstractC0792W);
                                    m1483J.m2282o(false);
                                    m1483J.f4003i = abstractC0792W;
                                }
                                if (this.f2066N.mo2208a(abstractC0792W, m1483J, m72J, m72J2)) {
                                    m1506T();
                                }
                            }
                        }
                    }
                }
                m596f--;
                l2 = null;
            }
            C1201k c1201k2 = (C1201k) c0043j.f141g;
            for (int i3 = c1201k2.f5418c - 1; i3 >= 0; i3--) {
                AbstractC0792W abstractC0792W2 = (AbstractC0792W) c1201k2.m2871h(i3);
                C0809g0 c0809g03 = (C0809g0) c1201k2.m2872i(i3);
                int i4 = c0809g03.f4083a;
                int i5 = i4 & 3;
                C0827y c0827y = this.f2118x0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0827y.f4208a;
                    recyclerView2.f2103q.m2239k0(abstractC0792W2.f3995a, recyclerView2.f2083g);
                } else if ((i4 & 1) != 0) {
                    C0208p c0208p3 = c0809g03.f4084b;
                    if (c0208p3 == null) {
                        RecyclerView recyclerView3 = c0827y.f4208a;
                        recyclerView3.f2103q.m2239k0(abstractC0792W2.f3995a, recyclerView3.f2083g);
                    } else {
                        c0827y.m2343g(abstractC0792W2, c0208p3, c0809g03.f4085c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0827y.m2342f(abstractC0792W2, c0809g03.f4084b, c0809g03.f4085c);
                } else if ((i4 & 12) == 12) {
                    C0208p c0208p4 = c0809g03.f4084b;
                    C0208p c0208p5 = c0809g03.f4085c;
                    c0827y.getClass();
                    abstractC0792W2.m2282o(false);
                    RecyclerView recyclerView4 = c0827y.f4208a;
                    if (!recyclerView4.f2057E) {
                        C0811i c0811i = (C0811i) recyclerView4.f2066N;
                        c0811i.getClass();
                        int i6 = c0208p4.f560a;
                        int i7 = c0208p5.f560a;
                        if (i6 == i7 && c0208p4.f561b == c0208p5.f561b) {
                            c0811i.m2209c(abstractC0792W2);
                            recyclerView = recyclerView4;
                            m2305g = false;
                        } else {
                            recyclerView = recyclerView4;
                            m2305g = c0811i.m2305g(abstractC0792W2, i6, c0208p4.f561b, i7, c0208p5.f561b);
                        }
                        if (m2305g) {
                            recyclerView.m1506T();
                        }
                    } else if (recyclerView4.f2066N.mo2208a(abstractC0792W2, abstractC0792W2, c0208p4, c0208p5)) {
                        recyclerView4.m1506T();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0208p = null;
                        c0827y.m2343g(abstractC0792W2, c0809g03.f4084b, null);
                    } else {
                        c0208p = null;
                        if ((i4 & 8) != 0) {
                            c0827y.m2342f(abstractC0792W2, c0809g03.f4084b, c0809g03.f4085c);
                        }
                    }
                    i = 0;
                    c0809g03.f4083a = i;
                    c0809g03.f4084b = c0208p;
                    c0809g03.f4085c = c0208p;
                    C0809g0.f4082d.mo403c(c0809g03);
                }
                i = 0;
                c0208p = null;
                c0809g03.f4083a = i;
                c0809g03.f4084b = c0208p;
                c0809g03.f4085c = c0208p;
                C0809g0.f4082d.mo403c(c0809g03);
            }
            view2 = null;
        }
        this.f2103q.m2238j0(c0784n);
        c0789t.f3974b = c0789t.f3977e;
        this.f2057E = false;
        this.f2058F = false;
        c0789t.f3982j = false;
        c0789t.f3983k = false;
        this.f2103q.f3937f = false;
        ArrayList arrayList = c0784n.f3958b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H.f3942k) {
            abstractC0778H.f3941j = 0;
            abstractC0778H.f3942k = false;
            c0784n.m2262k();
        }
        this.f2103q.mo1416d0(c0789t);
        m1504R(true);
        m1516d0(false);
        ((C1201k) c0043j.f141g).clear();
        ((C1195e) c0043j.f142h).m2853a();
        int[] iArr = this.f2104q0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        m1492D(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            m1532u(0, 0);
        }
        if (this.f2080e0 && this.f2101p != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = c0789t.f3985m;
            if (j2 != -1 && (z2 = this.f2101p.f4210b) && z2) {
                int m603m = this.f2089j.m603m();
                r10 = view2;
                int i10 = 0;
                while (true) {
                    if (i10 >= m603m) {
                        break;
                    }
                    AbstractC0792W m1483J3 = m1483J(this.f2089j.m602l(i10));
                    if (m1483J3 != null && !m1483J3.m2276i() && m1483J3.f3999e == j2) {
                        if (!((ArrayList) this.f2089j.f535d).contains(m1483J3.f3995a)) {
                            r10 = m1483J3;
                            break;
                        }
                        r10 = m1483J3;
                    }
                    i10++;
                    r10 = r10;
                }
            } else {
                r10 = view2;
            }
            if (r10 != null) {
                ArrayList arrayList2 = (ArrayList) this.f2089j.f535d;
                view = r10.f3995a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f2089j.m596f() > 0) {
                int i11 = c0789t.f3984l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int m2265b = c0789t.m2265b();
                for (int i12 = i11; i12 < m2265b; i12++) {
                    AbstractC0792W m1493F = m1493F(i12);
                    if (m1493F == null) {
                        break;
                    }
                    View view3 = m1493F.f3995a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(m2265b, i11) - 1; min >= 0; min--) {
                    AbstractC0792W m1493F2 = m1493F(min);
                    if (m1493F2 == null) {
                        break;
                    }
                    view = m1493F2.f3995a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i13 = c0789t.f3986n;
                if (i13 != -1 && (findViewById = view2.findViewById(i13)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        c0789t.f3985m = -1L;
        c0789t.f3984l = -1;
        c0789t.f3986n = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1528q() {
        View m1490B;
        int m1494G;
        View view;
        C0809g0 c0809g0;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        char c2;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        C0796a m358i;
        int i5;
        int i6;
        C0796a c0796a;
        C0789T c0789t = this.f2088i0;
        c0789t.m2264a(1);
        m1489A(c0789t);
        c0789t.f3981i = false;
        m1515c0();
        C0043j c0043j = this.f2091k;
        ((C1201k) c0043j.f141g).clear();
        C1195e c1195e = (C1195e) c0043j.f142h;
        c1195e.m2853a();
        m1503Q();
        if (this.f2057E) {
            C0112d c0112d = this.f2087i;
            c0112d.m361l((ArrayList) c0112d.f351c);
            c0112d.m361l((ArrayList) c0112d.f352d);
            if (this.f2058F) {
                this.f2103q.mo1411Y();
            }
        }
        if (this.f2066N == null || !this.f2103q.mo1402B0()) {
            this.f2087i.m352c();
        } else {
            C0112d c0112d2 = this.f2087i;
            ArrayList arrayList = (ArrayList) c0112d2.f351c;
            C0639g c0639g = (C0639g) c0112d2.f354f;
            c0639g.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0796a) arrayList.get(size)).f4019a == 8) {
                        if (z7) {
                            break;
                        }
                    } else {
                        z7 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i7 = size + 1;
                C0796a c0796a2 = (C0796a) arrayList.get(size);
                C0796a c0796a3 = (C0796a) arrayList.get(i7);
                int i8 = c0796a3.f4019a;
                if (i8 != 1) {
                    C0796a c0796a4 = null;
                    C0112d c0112d3 = (C0112d) c0639g.f3011g;
                    if (i8 == 2) {
                        int i9 = c0796a2.f4020b;
                        int i10 = c0796a2.f4021c;
                        if (i9 < i10) {
                            if (c0796a3.f4020b == i9 && c0796a3.f4021c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0796a3.f4020b == i10 + 1 && c0796a3.f4021c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0796a3.f4020b;
                        if (i10 < i11) {
                            c0796a3.f4020b = i11 - 1;
                        } else {
                            int i12 = c0796a3.f4021c;
                            if (i10 < i11 + i12) {
                                c0796a3.f4021c = i12 - 1;
                                c0796a2.f4019a = 2;
                                c0796a2.f4021c = 1;
                                if (c0796a3.f4021c == 0) {
                                    arrayList.remove(i7);
                                    c0112d3.getClass();
                                    ((C0145c) c0112d3.f350b).mo403c(c0796a3);
                                }
                            }
                        }
                        int i13 = c0796a2.f4020b;
                        int i14 = c0796a3.f4020b;
                        if (i13 <= i14) {
                            c0796a3.f4020b = i14 + 1;
                        } else {
                            int i15 = i14 + c0796a3.f4021c;
                            if (i13 < i15) {
                                c0796a4 = c0112d3.m358i(2, i13 + 1, i15 - i13);
                                c0796a3.f4021c = c0796a2.f4020b - c0796a3.f4020b;
                            }
                        }
                        C0796a c0796a5 = c0796a4;
                        if (z6) {
                            arrayList.set(size, c0796a3);
                            arrayList.remove(i7);
                            c0112d3.getClass();
                            ((C0145c) c0112d3.f350b).mo403c(c0796a2);
                        } else {
                            if (z5) {
                                if (c0796a5 != null) {
                                    int i16 = c0796a2.f4020b;
                                    if (i16 > c0796a5.f4020b) {
                                        c0796a2.f4020b = i16 - c0796a5.f4021c;
                                    }
                                    int i17 = c0796a2.f4021c;
                                    if (i17 > c0796a5.f4020b) {
                                        c0796a2.f4021c = i17 - c0796a5.f4021c;
                                    }
                                }
                                int i18 = c0796a2.f4020b;
                                if (i18 > c0796a3.f4020b) {
                                    c0796a2.f4020b = i18 - c0796a3.f4021c;
                                }
                                int i19 = c0796a2.f4021c;
                                if (i19 > c0796a3.f4020b) {
                                    c0796a2.f4021c = i19 - c0796a3.f4021c;
                                }
                            } else {
                                if (c0796a5 != null) {
                                    int i20 = c0796a2.f4020b;
                                    if (i20 >= c0796a5.f4020b) {
                                        c0796a2.f4020b = i20 - c0796a5.f4021c;
                                    }
                                    int i21 = c0796a2.f4021c;
                                    if (i21 >= c0796a5.f4020b) {
                                        c0796a2.f4021c = i21 - c0796a5.f4021c;
                                    }
                                }
                                int i22 = c0796a2.f4020b;
                                if (i22 >= c0796a3.f4020b) {
                                    c0796a2.f4020b = i22 - c0796a3.f4021c;
                                }
                                int i23 = c0796a2.f4021c;
                                if (i23 >= c0796a3.f4020b) {
                                    c0796a2.f4021c = i23 - c0796a3.f4021c;
                                }
                            }
                            arrayList.set(size, c0796a3);
                            if (c0796a2.f4020b != c0796a2.f4021c) {
                                arrayList.set(i7, c0796a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0796a5 != null) {
                                arrayList.add(size, c0796a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0796a2.f4021c;
                        int i25 = c0796a3.f4020b;
                        if (i24 < i25) {
                            c0796a3.f4020b = i25 - 1;
                        } else {
                            int i26 = c0796a3.f4021c;
                            if (i24 < i25 + i26) {
                                c0796a3.f4021c = i26 - 1;
                                m358i = c0112d3.m358i(4, c0796a2.f4020b, 1);
                                i5 = c0796a2.f4020b;
                                i6 = c0796a3.f4020b;
                                if (i5 > i6) {
                                    c0796a3.f4020b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0796a3.f4021c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0796a4 = c0112d3.m358i(4, i5 + 1, i28);
                                        c0796a3.f4021c -= i28;
                                    }
                                }
                                c0796a = c0796a4;
                                arrayList.set(i7, c0796a2);
                                if (c0796a3.f4021c <= 0) {
                                    arrayList.set(size, c0796a3);
                                } else {
                                    arrayList.remove(size);
                                    c0112d3.getClass();
                                    ((C0145c) c0112d3.f350b).mo403c(c0796a3);
                                }
                                if (m358i != null) {
                                    arrayList.add(size, m358i);
                                }
                                if (c0796a == null) {
                                    arrayList.add(size, c0796a);
                                }
                            }
                        }
                        m358i = null;
                        i5 = c0796a2.f4020b;
                        i6 = c0796a3.f4020b;
                        if (i5 > i6) {
                        }
                        c0796a = c0796a4;
                        arrayList.set(i7, c0796a2);
                        if (c0796a3.f4021c <= 0) {
                        }
                        if (m358i != null) {
                        }
                        if (c0796a == null) {
                        }
                    }
                } else {
                    int i29 = c0796a2.f4021c;
                    int i30 = c0796a3.f4020b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0796a2.f4020b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0796a2.f4020b = i32 + c0796a3.f4021c;
                    }
                    int i33 = c0796a3.f4020b;
                    if (i33 <= i29) {
                        c0796a2.f4021c = i29 + c0796a3.f4021c;
                    }
                    c0796a3.f4020b = i33 + i31;
                    arrayList.set(size, c0796a3);
                    arrayList.set(i7, c0796a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0796a c0796a6 = (C0796a) arrayList.get(i34);
                int i35 = c0796a6.f4019a;
                if (i35 != 1) {
                    C0145c c0145c = (C0145c) c0112d2.f350b;
                    C0827y c0827y = (C0827y) c0112d2.f353e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0796a6.f4020b;
                        int i37 = c0796a6.f4021c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0827y.m2338b(i38) != null || c0112d2.m350a(i38)) {
                                if (c3 == 0) {
                                    c0112d2.m353d(c0112d2.m358i(2, i36, i39));
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                                c2 = 1;
                            } else {
                                if (c3 == 1) {
                                    c0112d2.m360k(c0112d2.m358i(2, i36, i39));
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c2 = 0;
                            }
                            if (z4) {
                                i38 -= i39;
                                i37 -= i39;
                                i39 = 1;
                            } else {
                                i39++;
                            }
                            i38++;
                            c3 = c2;
                        }
                        if (i39 != c0796a6.f4021c) {
                            c0145c.mo403c(c0796a6);
                            c0796a6 = c0112d2.m358i(2, i36, i39);
                        }
                        if (c3 == 0) {
                            c0112d2.m353d(c0796a6);
                        } else {
                            c0112d2.m360k(c0796a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            c0112d2.m360k(c0796a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0796a6.f4020b;
                        int i41 = c0796a6.f4021c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0827y.m2338b(i40) != null || c0112d2.m350a(i40)) {
                                i3 = size2;
                                if (c4 == 0) {
                                    c0112d2.m353d(c0112d2.m358i(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 1;
                            } else {
                                i3 = size2;
                                if (c4 == 1) {
                                    c0112d2.m360k(c0112d2.m358i(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 0;
                            }
                            i43 += i4;
                            i40++;
                            size2 = i3;
                        }
                        i2 = size2;
                        if (i43 != c0796a6.f4021c) {
                            c0145c.mo403c(c0796a6);
                            c0796a6 = c0112d2.m358i(4, i42, i43);
                        }
                        if (c4 == 0) {
                            c0112d2.m353d(c0796a6);
                        } else {
                            c0112d2.m360k(c0796a6);
                        }
                    }
                } else {
                    i2 = size2;
                    c0112d2.m360k(c0796a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f2094l0 || this.f2096m0;
        boolean z9 = this.f2115w && this.f2066N != null && ((z2 = this.f2057E) || z8 || this.f2103q.f3937f) && (!z2 || this.f2101p.f4210b);
        C0789T c0789t2 = this.f2088i0;
        c0789t2.f3982j = z9;
        c0789t2.f3983k = z9 && z8 && !this.f2057E && this.f2066N != null && this.f2103q.mo1402B0();
        View focusedChild = (this.f2080e0 && hasFocus() && this.f2101p != null) ? getFocusedChild() : null;
        AbstractC0792W m1496I = (focusedChild == null || (m1490B = m1490B(focusedChild)) == null) ? null : m1496I(m1490B);
        if (m1496I == null) {
            c0789t.f3985m = -1L;
            c0789t.f3984l = -1;
            c0789t.f3986n = -1;
        } else {
            c0789t.f3985m = this.f2101p.f4210b ? m1496I.f3999e : -1L;
            if (!this.f2057E) {
                if (m1496I.m2276i()) {
                    m1494G = m1496I.f3998d;
                } else {
                    RecyclerView recyclerView = m1496I.f4012r;
                    if (recyclerView != null) {
                        m1494G = recyclerView.m1494G(m1496I);
                    }
                }
                c0789t.f3984l = m1494G;
                view = m1496I.f3995a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                c0789t.f3986n = id;
            }
            m1494G = -1;
            c0789t.f3984l = m1494G;
            view = m1496I.f3995a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            c0789t.f3986n = id2;
        }
        c0789t.f3980h = c0789t.f3982j && this.f2096m0;
        this.f2096m0 = false;
        this.f2094l0 = false;
        c0789t.f3979g = c0789t.f3983k;
        c0789t.f3977e = this.f2101p.mo2089a();
        m1492D(this.f2104q0);
        boolean z10 = c0789t.f3982j;
        C1201k c1201k = (C1201k) c0043j.f141g;
        if (z10) {
            int m596f = this.f2089j.m596f();
            for (int i44 = 0; i44 < m596f; i44++) {
                AbstractC0792W m1483J = m1483J(this.f2089j.m595e(i44));
                if (!m1483J.m2283p() && (!m1483J.m2274g() || this.f2101p.f4210b)) {
                    AbstractC0774D abstractC0774D = this.f2066N;
                    AbstractC0774D.m2207b(m1483J);
                    m1483J.m2270c();
                    abstractC0774D.getClass();
                    C0208p c0208p = new C0208p();
                    c0208p.m662a(m1483J);
                    C0809g0 c0809g02 = (C0809g0) c1201k.getOrDefault(m1483J, null);
                    if (c0809g02 == null) {
                        c0809g02 = C0809g0.m2303a();
                        c1201k.put(m1483J, c0809g02);
                    }
                    c0809g02.f4084b = c0208p;
                    c0809g02.f4083a |= 4;
                    if (c0789t.f3980h && m1483J.m2279l() && !m1483J.m2276i() && !m1483J.m2283p() && !m1483J.m2274g()) {
                        c1195e.m2857e(m1495H(m1483J), m1483J);
                    }
                }
            }
        }
        if (c0789t.f3983k) {
            int m603m = this.f2089j.m603m();
            for (int i45 = 0; i45 < m603m; i45++) {
                AbstractC0792W m1483J2 = m1483J(this.f2089j.m602l(i45));
                if (!m1483J2.m2283p() && m1483J2.f3998d == -1) {
                    m1483J2.f3998d = m1483J2.f3997c;
                }
            }
            boolean z11 = c0789t.f3978f;
            c0789t.f3978f = false;
            this.f2103q.mo1415c0(this.f2083g, c0789t);
            c0789t.f3978f = z11;
            for (int i46 = 0; i46 < this.f2089j.m596f(); i46++) {
                AbstractC0792W m1483J3 = m1483J(this.f2089j.m595e(i46));
                if (!m1483J3.m2283p() && ((c0809g0 = (C0809g0) c1201k.getOrDefault(m1483J3, null)) == null || (c0809g0.f4083a & 4) == 0)) {
                    AbstractC0774D.m2207b(m1483J3);
                    boolean m2271d = m1483J3.m2271d(8192);
                    AbstractC0774D abstractC0774D2 = this.f2066N;
                    m1483J3.m2270c();
                    abstractC0774D2.getClass();
                    C0208p c0208p2 = new C0208p();
                    c0208p2.m662a(m1483J3);
                    if (m2271d) {
                        m1507U(m1483J3, c0208p2);
                    } else {
                        C0809g0 c0809g03 = (C0809g0) c1201k.getOrDefault(m1483J3, null);
                        if (c0809g03 == null) {
                            c0809g03 = C0809g0.m2303a();
                            c1201k.put(m1483J3, c0809g03);
                        }
                        c0809g03.f4083a |= 2;
                        c0809g03.f4084b = c0208p2;
                    }
                }
            }
            m1522k();
        } else {
            m1522k();
        }
        m1504R(true);
        m1516d0(false);
        c0789t.f3976d = 2;
    }

    /* renamed from: r */
    public final void m1529r() {
        m1515c0();
        m1503Q();
        C0789T c0789t = this.f2088i0;
        c0789t.m2264a(6);
        this.f2087i.m352c();
        c0789t.f3977e = this.f2101p.mo2089a();
        c0789t.f3975c = 0;
        c0789t.f3979g = false;
        this.f2103q.mo1415c0(this.f2083g, c0789t);
        c0789t.f3978f = false;
        this.f2085h = null;
        c0789t.f3982j = c0789t.f3982j && this.f2066N != null;
        c0789t.f3976d = 4;
        m1504R(true);
        m1516d0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        AbstractC0792W m1483J = m1483J(view);
        if (m1483J != null) {
            if (m1483J.m2278k()) {
                m1483J.f4004j &= -257;
            } else if (!m1483J.m2283p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m1483J + m1537z());
            }
        }
        view.clearAnimation();
        m1526o(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0824v c0824v = this.f2103q.f3936e;
        if ((c0824v == null || !c0824v.f4191e) && !m1499M() && view2 != null) {
            m1508V(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2103q.mo2063m0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2107s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0814l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2117x != 0 || this.f2120z) {
            this.f2119y = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final boolean m1530s(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m635c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2120z) {
            return;
        }
        boolean mo1467d = abstractC0778H.mo1467d();
        boolean mo1468e = this.f2103q.mo1468e();
        if (mo1467d || mo1468e) {
            if (!mo1467d) {
                i = 0;
            }
            if (!mo1468e) {
                i2 = 0;
            }
            m1510X(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1499M()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2054B |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0794Y c0794y) {
        this.f2102p0 = c0794y;
        AbstractC0169Q.m505j(this, c0794y);
    }

    public void setAdapter(AbstractC0828z abstractC0828z) {
        setLayoutFrozen(false);
        AbstractC0828z abstractC0828z2 = this.f2101p;
        C0451i c0451i = this.f2081f;
        if (abstractC0828z2 != null) {
            abstractC0828z2.f4209a.unregisterObserver(c0451i);
            this.f2101p.mo2346f(this);
        }
        AbstractC0774D abstractC0774D = this.f2066N;
        if (abstractC0774D != null) {
            abstractC0774D.mo2211e();
        }
        AbstractC0778H abstractC0778H = this.f2103q;
        C0784N c0784n = this.f2083g;
        if (abstractC0778H != null) {
            abstractC0778H.m2237i0(c0784n);
            this.f2103q.m2238j0(c0784n);
        }
        c0784n.f3957a.clear();
        c0784n.m2255d();
        C0112d c0112d = this.f2087i;
        c0112d.m361l((ArrayList) c0112d.f351c);
        c0112d.m361l((ArrayList) c0112d.f352d);
        AbstractC0828z abstractC0828z3 = this.f2101p;
        this.f2101p = abstractC0828z;
        if (abstractC0828z != null) {
            abstractC0828z.f4209a.registerObserver(c0451i);
            abstractC0828z.mo2345c(this);
        }
        AbstractC0828z abstractC0828z4 = this.f2101p;
        c0784n.f3957a.clear();
        c0784n.m2255d();
        C0783M m2254c = c0784n.m2254c();
        if (abstractC0828z3 != null) {
            m2254c.f3956b--;
        }
        if (m2254c.f3956b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = m2254c.f3955a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C0782L) sparseArray.valueAt(i)).f3951a.clear();
                i++;
            }
        }
        if (abstractC0828z4 != null) {
            m2254c.f3956b++;
        }
        this.f2088i0.f3978f = true;
        this.f2058F |= false;
        this.f2057E = true;
        int m603m = this.f2089j.m603m();
        for (int i2 = 0; i2 < m603m; i2++) {
            AbstractC0792W m1483J = m1483J(this.f2089j.m602l(i2));
            if (m1483J != null && !m1483J.m2283p()) {
                m1483J.m2268a(6);
            }
        }
        m1501O();
        C0784N c0784n2 = this.f2083g;
        ArrayList arrayList = c0784n2.f3959c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0792W abstractC0792W = (AbstractC0792W) arrayList.get(i3);
            if (abstractC0792W != null) {
                abstractC0792W.m2268a(6);
                abstractC0792W.m2268a(1024);
            }
        }
        AbstractC0828z abstractC0828z5 = c0784n2.f3964h.f2101p;
        if (abstractC0828z5 == null || !abstractC0828z5.f4210b) {
            c0784n2.m2255d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0772B interfaceC0772B) {
        if (interfaceC0772B == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2093l) {
            this.f2065M = null;
            this.f2063K = null;
            this.f2064L = null;
            this.f2062J = null;
        }
        this.f2093l = z2;
        super.setClipToPadding(z2);
        if (this.f2115w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0773C c0773c) {
        c0773c.getClass();
        this.f2061I = c0773c;
        this.f2065M = null;
        this.f2063K = null;
        this.f2064L = null;
        this.f2062J = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2113v = z2;
    }

    public void setItemAnimator(AbstractC0774D abstractC0774D) {
        AbstractC0774D abstractC0774D2 = this.f2066N;
        if (abstractC0774D2 != null) {
            abstractC0774D2.mo2211e();
            this.f2066N.f3920a = null;
        }
        this.f2066N = abstractC0774D;
        if (abstractC0774D != null) {
            abstractC0774D.f3920a = this.f2098n0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0784N c0784n = this.f2083g;
        c0784n.f3961e = i;
        c0784n.m2262k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0778H abstractC0778H) {
        RecyclerView recyclerView;
        C0824v c0824v;
        if (abstractC0778H == this.f2103q) {
            return;
        }
        setScrollState(0);
        RunnableC0791V runnableC0791V = this.f2082f0;
        runnableC0791V.f3993g.removeCallbacks(runnableC0791V);
        runnableC0791V.f3989c.abortAnimation();
        AbstractC0778H abstractC0778H2 = this.f2103q;
        if (abstractC0778H2 != null && (c0824v = abstractC0778H2.f3936e) != null) {
            c0824v.m2328i();
        }
        AbstractC0778H abstractC0778H3 = this.f2103q;
        C0784N c0784n = this.f2083g;
        if (abstractC0778H3 != null) {
            AbstractC0774D abstractC0774D = this.f2066N;
            if (abstractC0774D != null) {
                abstractC0774D.mo2211e();
            }
            this.f2103q.m2237i0(c0784n);
            this.f2103q.m2238j0(c0784n);
            c0784n.f3957a.clear();
            c0784n.m2255d();
            if (this.f2111u) {
                AbstractC0778H abstractC0778H4 = this.f2103q;
                abstractC0778H4.f3938g = false;
                abstractC0778H4.mo1453R(this);
            }
            this.f2103q.m2248v0(null);
            this.f2103q = null;
        } else {
            c0784n.f3957a.clear();
            c0784n.m2255d();
        }
        C0198k c0198k = this.f2089j;
        ((C0798b) c0198k.f534c).m2292g();
        ArrayList arrayList = (ArrayList) c0198k.f535d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0827y) c0198k.f533b).f4208a;
            if (size < 0) {
                break;
            }
            AbstractC0792W m1483J = m1483J((View) arrayList.get(size));
            if (m1483J != null) {
                int i = m1483J.f4010p;
                if (recyclerView.m1499M()) {
                    m1483J.f4011q = i;
                    recyclerView.f2114v0.add(m1483J);
                } else {
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    m1483J.f3995a.setImportantForAccessibility(i);
                }
                m1483J.f4010p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.m1526o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2103q = abstractC0778H;
        if (abstractC0778H != null) {
            if (abstractC0778H.f3933b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0778H + " is already attached to a RecyclerView:" + abstractC0778H.f3933b.m1537z());
            }
            abstractC0778H.m2248v0(this);
            if (this.f2111u) {
                AbstractC0778H abstractC0778H5 = this.f2103q;
                abstractC0778H5.f3938g = true;
                abstractC0778H5.mo2062Q(this);
            }
        }
        c0784n.m2262k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0202m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f546d) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            AbstractC0158F.m445z(scrollingChildHelper.f545c);
        }
        scrollingChildHelper.f546d = z2;
    }

    public void setOnFlingListener(AbstractC0780J abstractC0780J) {
        this.f2075W = abstractC0780J;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0781K abstractC0781K) {
        this.f2090j0 = abstractC0781K;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2080e0 = z2;
    }

    public void setRecycledViewPool(C0783M c0783m) {
        C0784N c0784n = this.f2083g;
        if (c0784n.f3963g != null) {
            r1.f3956b--;
        }
        c0784n.f3963g = c0783m;
        if (c0783m == null || c0784n.f3964h.getAdapter() == null) {
            return;
        }
        c0784n.f3963g.f3956b++;
    }

    public void setRecyclerListener(InterfaceC0785O interfaceC0785O) {
    }

    public void setScrollState(int i) {
        C0824v c0824v;
        if (i == this.f2067O) {
            return;
        }
        this.f2067O = i;
        if (i != 2) {
            RunnableC0791V runnableC0791V = this.f2082f0;
            runnableC0791V.f3993g.removeCallbacks(runnableC0791V);
            runnableC0791V.f3989c.abortAnimation();
            AbstractC0778H abstractC0778H = this.f2103q;
            if (abstractC0778H != null && (c0824v = abstractC0778H.f3936e) != null) {
                c0824v.m2328i();
            }
        }
        AbstractC0778H abstractC0778H2 = this.f2103q;
        if (abstractC0778H2 != null) {
            abstractC0778H2.mo1570g0(i);
        }
        AbstractC0781K abstractC0781K = this.f2090j0;
        if (abstractC0781K != null) {
            abstractC0781K.mo2075a(this, i);
        }
        ArrayList arrayList = this.f2092k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0781K) this.f2092k0.get(size)).mo2075a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f2074V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f2074V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0790U abstractC0790U) {
        this.f2083g.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m639g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m640h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0824v c0824v;
        if (z2 != this.f2120z) {
            m1521i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2120z = false;
                if (this.f2119y && this.f2103q != null && this.f2101p != null) {
                    requestLayout();
                }
                this.f2119y = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2120z = true;
            this.f2053A = true;
            setScrollState(0);
            RunnableC0791V runnableC0791V = this.f2082f0;
            runnableC0791V.f3993g.removeCallbacks(runnableC0791V);
            runnableC0791V.f3989c.abortAnimation();
            AbstractC0778H abstractC0778H = this.f2103q;
            if (abstractC0778H == null || (c0824v = abstractC0778H.f3936e) == null) {
                return;
            }
            c0824v.m2328i();
        }
    }

    /* renamed from: t */
    public final void m1531t(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m636d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: u */
    public final void m1532u(int i, int i2) {
        this.f2060H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC0781K abstractC0781K = this.f2090j0;
        if (abstractC0781K != null) {
            abstractC0781K.mo2076b(this, i, i2);
        }
        ArrayList arrayList = this.f2092k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0781K) this.f2092k0.get(size)).mo2076b(this, i, i2);
            }
        }
        this.f2060H--;
    }

    /* renamed from: v */
    public final void m1533v() {
        if (this.f2065M != null) {
            return;
        }
        this.f2061I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2065M = edgeEffect;
        if (this.f2093l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: w */
    public final void m1534w() {
        if (this.f2062J != null) {
            return;
        }
        this.f2061I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2062J = edgeEffect;
        if (this.f2093l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: x */
    public final void m1535x() {
        if (this.f2064L != null) {
            return;
        }
        this.f2061I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2064L = edgeEffect;
        if (this.f2093l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: y */
    public final void m1536y() {
        if (this.f2063K != null) {
            return;
        }
        this.f2061I.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2063K = edgeEffect;
        if (this.f2093l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: z */
    public final String m1537z() {
        return " " + super.toString() + ", adapter:" + this.f2101p + ", layout:" + this.f2103q + ", context:" + getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        int i2;
        char c2;
        boolean z2;
        int i3;
        Object[] objArr;
        Constructor constructor;
        this.f2081f = new C0451i(this);
        this.f2083g = new C0784N(this);
        this.f2091k = new C0043j(12);
        this.f2095m = new Rect();
        this.f2097n = new Rect();
        this.f2099o = new RectF();
        this.f2105r = new ArrayList();
        this.f2107s = new ArrayList();
        this.f2117x = 0;
        this.f2057E = false;
        this.f2058F = false;
        this.f2059G = 0;
        this.f2060H = 0;
        this.f2061I = new C0773C();
        C0811i c0811i = new C0811i();
        c0811i.f3920a = null;
        c0811i.f3921b = new ArrayList();
        c0811i.f3922c = 120L;
        c0811i.f3923d = 120L;
        c0811i.f3924e = 250L;
        c0811i.f3925f = 250L;
        c0811i.f4092g = true;
        c0811i.f4093h = new ArrayList();
        c0811i.f4094i = new ArrayList();
        c0811i.f4095j = new ArrayList();
        c0811i.f4096k = new ArrayList();
        c0811i.f4097l = new ArrayList();
        c0811i.f4098m = new ArrayList();
        c0811i.f4099n = new ArrayList();
        c0811i.f4100o = new ArrayList();
        c0811i.f4101p = new ArrayList();
        c0811i.f4102q = new ArrayList();
        c0811i.f4103r = new ArrayList();
        this.f2066N = c0811i;
        this.f2067O = 0;
        this.f2068P = -1;
        this.f2078c0 = Float.MIN_VALUE;
        this.f2079d0 = Float.MIN_VALUE;
        this.f2080e0 = true;
        this.f2082f0 = new RunnableC0791V(this);
        this.f2086h0 = new C0815m();
        C0789T c0789t = new C0789T();
        c0789t.f3973a = -1;
        c0789t.f3974b = 0;
        c0789t.f3975c = 0;
        c0789t.f3976d = 1;
        c0789t.f3977e = 0;
        c0789t.f3978f = false;
        c0789t.f3979g = false;
        c0789t.f3980h = false;
        c0789t.f3981i = false;
        c0789t.f3982j = false;
        c0789t.f3983k = false;
        this.f2088i0 = c0789t;
        this.f2094l0 = false;
        this.f2096m0 = false;
        C0827y c0827y = new C0827y(this);
        this.f2098n0 = c0827y;
        this.f2100o0 = false;
        this.f2104q0 = new int[2];
        this.f2108s0 = new int[2];
        this.f2110t0 = new int[2];
        this.f2112u0 = new int[2];
        this.f2114v0 = new ArrayList();
        this.f2116w0 = new RunnableC0020n(11, this);
        this.f2118x0 = new C0827y(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2074V = viewConfiguration.getScaledTouchSlop();
        this.f2078c0 = AbstractC0170S.m507a(viewConfiguration);
        this.f2079d0 = AbstractC0170S.m508b(viewConfiguration);
        this.f2076a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2077b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2066N.f3920a = c0827y;
        this.f2087i = new C0112d(new C0827y(this));
        this.f2089j = new C0198k(new C0827y(this));
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (AbstractC0161I.m458c(this) == 0) {
            AbstractC0161I.m468m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2055C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0794Y(this));
        int[] iArr = AbstractC0767a.f3893a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            typedArray = obtainStyledAttributes;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        } else {
            typedArray = obtainStyledAttributes;
        }
        String string = typedArray.getString(8);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2093l = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m1537z());
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c2 = 2;
            new C0814l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            c2 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0778H.class);
                    try {
                        constructor = asSubclass.getConstructor(f2052z0);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        z2 = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[c2] = Integer.valueOf(i);
                            objArr2[3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                objArr = null;
                                constructor = asSubclass.getConstructor(null);
                                constructor.setAccessible(z2);
                                setLayoutManager((AbstractC0778H) constructor.newInstance(objArr));
                                i3 = Build.VERSION.SDK_INT;
                                int[] iArr2 = f2051y0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                                if (i3 >= 29) {
                                }
                                boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z3);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                            }
                        }
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        z2 = true;
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((AbstractC0778H) constructor.newInstance(objArr));
                    i3 = Build.VERSION.SDK_INT;
                    int[] iArr22 = f2051y0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    if (i3 >= 29) {
                        saveAttributeDataForStyleable(context, iArr22, attributeSet, obtainStyledAttributes22, i, 0);
                    }
                    boolean z32 = obtainStyledAttributes22.getBoolean(0, z2);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z32);
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                }
            }
        }
        z2 = true;
        i3 = Build.VERSION.SDK_INT;
        int[] iArr222 = f2051y0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        if (i3 >= 29) {
        }
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0778H abstractC0778H = this.f2103q;
        if (abstractC0778H != null) {
            return abstractC0778H.mo1436t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1537z());
    }
}
