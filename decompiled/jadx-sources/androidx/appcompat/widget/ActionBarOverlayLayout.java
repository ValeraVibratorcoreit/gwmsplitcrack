package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.altaysoft.t500_split.R;
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Function;
import java.util.WeakHashMap;
import p006C.C0058f;
import p010D1.AbstractC0088l;
import p013F0.C0097a;
import p022K.AbstractC0156D;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.AbstractC0205n0;
import p022K.C0199k0;
import p022K.C0201l0;
import p022K.C0203m0;
import p022K.C0208p;
import p022K.C0217t0;
import p022K.C0221v0;
import p022K.InterfaceC0204n;
import p022K.InterfaceC0206o;
import p070g.C0861J;
import p076j.C0961j;
import p079k.InterfaceC1029x;
import p079k.MenuC1018m;
import p082l.C1087T0;
import p082l.C1097Y0;
import p082l.C1111e;
import p082l.C1113f;
import p082l.C1123k;
import p082l.InterfaceC1109d;
import p082l.InterfaceC1114f0;
import p082l.InterfaceC1116g0;
import p082l.RunnableC1106c;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1114f0, InterfaceC0204n, InterfaceC0206o {

    /* renamed from: H */
    public static final int[] f1742H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: I */
    public static final C0221v0 f1743I;

    /* renamed from: J */
    public static final Rect f1744J;

    /* renamed from: A */
    public OverScroller f1745A;

    /* renamed from: B */
    public ViewPropertyAnimator f1746B;

    /* renamed from: C */
    public final C0097a f1747C;

    /* renamed from: D */
    public final RunnableC1106c f1748D;

    /* renamed from: E */
    public final RunnableC1106c f1749E;

    /* renamed from: F */
    public final C0208p f1750F;

    /* renamed from: G */
    public final C1113f f1751G;

    /* renamed from: f */
    public int f1752f;

    /* renamed from: g */
    public int f1753g;

    /* renamed from: h */
    public ContentFrameLayout f1754h;

    /* renamed from: i */
    public ActionBarContainer f1755i;

    /* renamed from: j */
    public InterfaceC1116g0 f1756j;

    /* renamed from: k */
    public Drawable f1757k;

    /* renamed from: l */
    public boolean f1758l;

    /* renamed from: m */
    public boolean f1759m;

    /* renamed from: n */
    public boolean f1760n;

    /* renamed from: o */
    public boolean f1761o;

    /* renamed from: p */
    public int f1762p;

    /* renamed from: q */
    public int f1763q;

    /* renamed from: r */
    public final Rect f1764r;

    /* renamed from: s */
    public final Rect f1765s;

    /* renamed from: t */
    public final Rect f1766t;

    /* renamed from: u */
    public final Rect f1767u;

    /* renamed from: v */
    public C0221v0 f1768v;

    /* renamed from: w */
    public C0221v0 f1769w;

    /* renamed from: x */
    public C0221v0 f1770x;

    /* renamed from: y */
    public C0221v0 f1771y;

    /* renamed from: z */
    public InterfaceC1109d f1772z;

    static {
        int i = Build.VERSION.SDK_INT;
        AbstractC0205n0 c0203m0 = i >= 30 ? new C0203m0() : i >= 29 ? new C0201l0() : new C0199k0();
        c0203m0.mo616g(C0058f.m140b(0, 1, 0, 1));
        f1743I = c0203m0.mo614b();
        f1744J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1753g = 0;
        this.f1764r = new Rect();
        this.f1765s = new Rect();
        this.f1766t = new Rect();
        this.f1767u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0221v0 c0221v0 = C0221v0.f572b;
        this.f1768v = c0221v0;
        this.f1769w = c0221v0;
        this.f1770x = c0221v0;
        this.f1771y = c0221v0;
        this.f1747C = new C0097a(5, this);
        this.f1748D = new RunnableC1106c(this, 0);
        this.f1749E = new RunnableC1106c(this, 1);
        m1275i(context);
        this.f1750F = new C0208p();
        C1113f c1113f = new C1113f(context);
        c1113f.setWillNotDraw(true);
        this.f1751G = c1113f;
        addView(c1113f);
    }

    /* renamed from: g */
    public static boolean m1273g(View view, Rect rect, boolean z2) {
        boolean z3;
        C1111e c1111e = (C1111e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1111e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c1111e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c1111e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1111e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1111e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1111e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c1111e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c1111e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: a */
    public final void mo642a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: b */
    public final void mo643b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: c */
    public final void mo644c(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1111e;
    }

    @Override // p022K.InterfaceC0206o
    /* renamed from: d */
    public final void mo648d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo645e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1757k != null) {
            if (this.f1755i.getVisibility() == 0) {
                i = (int) (this.f1755i.getTranslationY() + this.f1755i.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1757k.setBounds(0, i, getWidth(), this.f1757k.getIntrinsicHeight() + i);
            this.f1757k.draw(canvas);
        }
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: e */
    public final void mo645e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: f */
    public final boolean mo646f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1111e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1111e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1755i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0208p c0208p = this.f1750F;
        return c0208p.f561b | c0208p.f560a;
    }

    public CharSequence getTitle() {
        m1277k();
        return ((C1097Y0) this.f1756j).f5132a.getTitle();
    }

    /* renamed from: h */
    public final void m1274h() {
        removeCallbacks(this.f1748D);
        removeCallbacks(this.f1749E);
        ViewPropertyAnimator viewPropertyAnimator = this.f1746B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public final void m1275i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1742H);
        this.f1752f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1757k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1745A = new OverScroller(context);
    }

    /* renamed from: j */
    public final void m1276j(int i) {
        m1277k();
        if (i == 2) {
            ((C1097Y0) this.f1756j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C1097Y0) this.f1756j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: k */
    public final void m1277k() {
        InterfaceC1116g0 wrapper;
        if (this.f1754h == null) {
            this.f1754h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1755i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1116g0) {
                wrapper = (InterfaceC1116g0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1756j = wrapper;
        }
    }

    /* renamed from: l */
    public final void m1278l(MenuC1018m menuC1018m, InterfaceC1029x interfaceC1029x) {
        m1277k();
        C1097Y0 c1097y0 = (C1097Y0) this.f1756j;
        C1123k c1123k = c1097y0.f5144m;
        Toolbar toolbar = c1097y0.f5132a;
        if (c1123k == null) {
            c1097y0.f5144m = new C1123k(toolbar.getContext());
        }
        C1123k c1123k2 = c1097y0.f5144m;
        c1123k2.f5183j = interfaceC1029x;
        if (menuC1018m == null && toolbar.f1827f == null) {
            return;
        }
        toolbar.m1295f();
        MenuC1018m menuC1018m2 = toolbar.f1827f.f1778u;
        if (menuC1018m2 == menuC1018m) {
            return;
        }
        if (menuC1018m2 != null) {
            menuC1018m2.m2622r(toolbar.f1820P);
            menuC1018m2.m2622r(toolbar.f1821Q);
        }
        if (toolbar.f1821Q == null) {
            toolbar.f1821Q = new C1087T0(toolbar);
        }
        c1123k2.f5195v = true;
        if (menuC1018m != null) {
            menuC1018m.m2614b(c1123k2, toolbar.f1836o);
            menuC1018m.m2614b(toolbar.f1821Q, toolbar.f1836o);
        } else {
            c1123k2.mo2610g(toolbar.f1836o, null);
            toolbar.f1821Q.mo2610g(toolbar.f1836o, null);
            c1123k2.mo2583i();
            toolbar.f1821Q.mo2583i();
        }
        toolbar.f1827f.setPopupTheme(toolbar.f1837p);
        toolbar.f1827f.setPresenter(c1123k2);
        toolbar.f1820P = c1123k2;
        toolbar.m1306u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1277k();
        C0221v0 m680g = C0221v0.m680g(this, windowInsets);
        boolean m1273g = m1273g(this.f1755i, new Rect(m680g.m682b(), m680g.m684d(), m680g.m683c(), m680g.m681a()), false);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        Rect rect = this.f1764r;
        AbstractC0158F.m421b(this, m680g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C0217t0 c0217t0 = m680g.f573a;
        C0221v0 mo656l = c0217t0.mo656l(i, i2, i3, i4);
        this.f1768v = mo656l;
        boolean z2 = true;
        if (!this.f1769w.equals(mo656l)) {
            this.f1769w = this.f1768v;
            m1273g = true;
        }
        Rect rect2 = this.f1765s;
        if (rect2.equals(rect)) {
            z2 = m1273g;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c0217t0.mo668a().f573a.mo664c().f573a.mo663b().m685f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1275i(getContext());
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0156D.m419c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1274h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1111e c1111e = (C1111e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1111e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1111e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m1277k();
        measureChildWithMargins(this.f1755i, i, 0, i2, 0);
        C1111e c1111e = (C1111e) this.f1755i.getLayoutParams();
        int max = Math.max(0, this.f1755i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1111e).leftMargin + ((ViewGroup.MarginLayoutParams) c1111e).rightMargin);
        int max2 = Math.max(0, this.f1755i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1111e).topMargin + ((ViewGroup.MarginLayoutParams) c1111e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1755i.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        boolean z2 = (getWindowSystemUiVisibility() & Function.MAX_NARGS) != 0;
        if (z2) {
            measuredHeight = this.f1752f;
            if (this.f1759m && this.f1755i.getTabContainer() != null) {
                measuredHeight += this.f1752f;
            }
        } else {
            measuredHeight = this.f1755i.getVisibility() != 8 ? this.f1755i.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1764r;
        Rect rect2 = this.f1766t;
        rect2.set(rect);
        this.f1770x = this.f1768v;
        if (!this.f1758l && !z2) {
            C1113f c1113f = this.f1751G;
            C0221v0 c0221v0 = f1743I;
            Rect rect3 = this.f1767u;
            AbstractC0158F.m421b(c1113f, c0221v0, rect3);
            if (!rect3.equals(f1744J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1770x = this.f1770x.f573a.mo656l(0, measuredHeight, 0, 0);
                m1273g(this.f1754h, rect2, true);
                if (!this.f1771y.equals(this.f1770x)) {
                    C0221v0 c0221v02 = this.f1770x;
                    this.f1771y = c0221v02;
                    ContentFrameLayout contentFrameLayout = this.f1754h;
                    WindowInsets m685f = c0221v02.m685f();
                    if (m685f != null) {
                        WindowInsets m417a = AbstractC0156D.m417a(contentFrameLayout, m685f);
                        if (!m417a.equals(m685f)) {
                            C0221v0.m680g(contentFrameLayout, m417a);
                        }
                    }
                }
                measureChildWithMargins(this.f1754h, i, 0, i2, 0);
                C1111e c1111e2 = (C1111e) this.f1754h.getLayoutParams();
                int max3 = Math.max(max, this.f1754h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1111e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1111e2).rightMargin);
                int max4 = Math.max(max2, this.f1754h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1111e2).topMargin + ((ViewGroup.MarginLayoutParams) c1111e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1754h.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        C0058f m140b = C0058f.m140b(this.f1770x.m682b(), this.f1770x.m684d() + measuredHeight, this.f1770x.m683c(), this.f1770x.m681a());
        C0221v0 c0221v03 = this.f1770x;
        int i3 = Build.VERSION.SDK_INT;
        AbstractC0205n0 c0203m0 = i3 >= 30 ? new C0203m0(c0221v03) : i3 >= 29 ? new C0201l0(c0221v03) : new C0199k0(c0221v03);
        c0203m0.mo616g(m140b);
        this.f1770x = c0203m0.mo614b();
        m1273g(this.f1754h, rect2, true);
        if (!this.f1771y.equals(this.f1770x)) {
        }
        measureChildWithMargins(this.f1754h, i, 0, i2, 0);
        C1111e c1111e22 = (C1111e) this.f1754h.getLayoutParams();
        int max32 = Math.max(max, this.f1754h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1111e22).leftMargin + ((ViewGroup.MarginLayoutParams) c1111e22).rightMargin);
        int max42 = Math.max(max2, this.f1754h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1111e22).topMargin + ((ViewGroup.MarginLayoutParams) c1111e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1754h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1760n || !z2) {
            return false;
        }
        this.f1745A.fling(0, 0, 0, (int) f3, 0, 0, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE);
        if (this.f1745A.getFinalY() > this.f1755i.getHeight()) {
            m1274h();
            this.f1749E.run();
        } else {
            m1274h();
            this.f1748D.run();
        }
        this.f1761o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1762p + i2;
        this.f1762p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0861J c0861j;
        C0961j c0961j;
        this.f1750F.f560a = i;
        this.f1762p = getActionBarHideOffset();
        m1274h();
        InterfaceC1109d interfaceC1109d = this.f1772z;
        if (interfaceC1109d == null || (c0961j = (c0861j = (C0861J) interfaceC1109d).f4312u) == null) {
            return;
        }
        c0961j.m2502a();
        c0861j.f4312u = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1755i.getVisibility() != 0) {
            return false;
        }
        return this.f1760n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1760n || this.f1761o) {
            return;
        }
        if (this.f1762p <= this.f1755i.getHeight()) {
            m1274h();
            postDelayed(this.f1748D, 600L);
        } else {
            m1274h();
            postDelayed(this.f1749E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m1277k();
        int i2 = this.f1763q ^ i;
        this.f1763q = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & Function.MAX_NARGS) != 0;
        InterfaceC1109d interfaceC1109d = this.f1772z;
        if (interfaceC1109d != null) {
            C0861J c0861j = (C0861J) interfaceC1109d;
            c0861j.f4308q = !z3;
            if (z2 || !z3) {
                if (c0861j.f4309r) {
                    c0861j.f4309r = false;
                    c0861j.m2390A0(true);
                }
            } else if (!c0861j.f4309r) {
                c0861j.f4309r = true;
                c0861j.m2390A0(true);
            }
        }
        if ((i2 & Function.MAX_NARGS) == 0 || this.f1772z == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0156D.m419c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1753g = i;
        InterfaceC1109d interfaceC1109d = this.f1772z;
        if (interfaceC1109d != null) {
            ((C0861J) interfaceC1109d).f4307p = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m1274h();
        this.f1755i.setTranslationY(-Math.max(0, Math.min(i, this.f1755i.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1109d interfaceC1109d) {
        this.f1772z = interfaceC1109d;
        if (getWindowToken() != null) {
            ((C0861J) this.f1772z).f4307p = this.f1753g;
            int i = this.f1763q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                AbstractC0156D.m419c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1759m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1760n) {
            this.f1760n = z2;
            if (z2) {
                return;
            }
            m1274h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m1277k();
        C1097Y0 c1097y0 = (C1097Y0) this.f1756j;
        c1097y0.f5135d = i != 0 ? AbstractC0088l.m257D(c1097y0.f5132a.getContext(), i) : null;
        c1097y0.m2724c();
    }

    public void setLogo(int i) {
        m1277k();
        C1097Y0 c1097y0 = (C1097Y0) this.f1756j;
        c1097y0.f5136e = i != 0 ? AbstractC0088l.m257D(c1097y0.f5132a.getContext(), i) : null;
        c1097y0.m2724c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1758l = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p082l.InterfaceC1114f0
    public void setWindowCallback(Window.Callback callback) {
        m1277k();
        ((C1097Y0) this.f1756j).f5142k = callback;
    }

    @Override // p082l.InterfaceC1114f0
    public void setWindowTitle(CharSequence charSequence) {
        m1277k();
        C1097Y0 c1097y0 = (C1097Y0) this.f1756j;
        if (c1097y0.f5138g) {
            return;
        }
        c1097y0.f5139h = charSequence;
        if ((c1097y0.f5133b & 8) != 0) {
            Toolbar toolbar = c1097y0.f5132a;
            toolbar.setTitle(charSequence);
            if (c1097y0.f5138g) {
                AbstractC0169Q.m506k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1111e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1277k();
        C1097Y0 c1097y0 = (C1097Y0) this.f1756j;
        c1097y0.f5135d = drawable;
        c1097y0.m2724c();
    }
}
