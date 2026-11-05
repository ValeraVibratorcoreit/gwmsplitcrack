package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p007C0.AbstractC0067a;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p017H0.C0124c;
import p020J.C0145c;
import p020J.C0146d;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0294k;
import p045W0.C0355e;
import p045W0.C0357g;
import p051Z0.C0443a;
import p051Z0.C0447e;
import p051Z0.C0448f;
import p051Z0.C0450h;
import p051Z0.InterfaceC0444b;
import p051Z0.InterfaceC0445c;
import p060c1.AbstractC0577a;
import p067f.AbstractC0770a;
import p086m0.AbstractC1164a;
import p086m0.AbstractC1165b;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p123z.AbstractC1695c;

/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: T */
    public static final C0146d f3602T = new C0146d(16);

    /* renamed from: A */
    public final int f3603A;

    /* renamed from: B */
    public final int f3604B;

    /* renamed from: C */
    public final int f3605C;

    /* renamed from: D */
    public int f3606D;

    /* renamed from: E */
    public final int f3607E;

    /* renamed from: F */
    public int f3608F;

    /* renamed from: G */
    public int f3609G;

    /* renamed from: H */
    public boolean f3610H;

    /* renamed from: I */
    public boolean f3611I;

    /* renamed from: J */
    public int f3612J;

    /* renamed from: K */
    public int f3613K;

    /* renamed from: L */
    public boolean f3614L;

    /* renamed from: M */
    public C0355e f3615M;

    /* renamed from: N */
    public final TimeInterpolator f3616N;

    /* renamed from: O */
    public InterfaceC0444b f3617O;

    /* renamed from: P */
    public final ArrayList f3618P;

    /* renamed from: Q */
    public ValueAnimator f3619Q;

    /* renamed from: R */
    public int f3620R;

    /* renamed from: S */
    public final C0145c f3621S;

    /* renamed from: f */
    public int f3622f;

    /* renamed from: g */
    public final ArrayList f3623g;

    /* renamed from: h */
    public C0448f f3624h;

    /* renamed from: i */
    public final C0447e f3625i;

    /* renamed from: j */
    public final int f3626j;

    /* renamed from: k */
    public final int f3627k;

    /* renamed from: l */
    public final int f3628l;

    /* renamed from: m */
    public final int f3629m;

    /* renamed from: n */
    public final int f3630n;

    /* renamed from: o */
    public final int f3631o;

    /* renamed from: p */
    public final int f3632p;

    /* renamed from: q */
    public ColorStateList f3633q;

    /* renamed from: r */
    public ColorStateList f3634r;

    /* renamed from: s */
    public ColorStateList f3635s;

    /* renamed from: t */
    public Drawable f3636t;

    /* renamed from: u */
    public int f3637u;

    /* renamed from: v */
    public final float f3638v;

    /* renamed from: w */
    public final float f3639w;

    /* renamed from: x */
    public final int f3640x;

    /* renamed from: y */
    public int f3641y;

    /* renamed from: z */
    public final int f3642z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f3622f = -1;
        this.f3623g = new ArrayList();
        this.f3632p = -1;
        this.f3637u = 0;
        this.f3641y = Integer.MAX_VALUE;
        this.f3612J = -1;
        this.f3618P = new ArrayList();
        this.f3621S = new C0145c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C0447e c0447e = new C0447e(this, context2);
        this.f3625i = c0447e;
        super.addView(c0447e, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray m846g = AbstractC0294k.m846g(context2, attributeSet, AbstractC0051a.f191z, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList m256C = AbstractC0088l.m256C(getBackground());
        if (m256C != null) {
            C0357g c0357g = new C0357g();
            c0357g.m958k(m256C);
            c0357g.m956i(context2);
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            c0357g.m957j(AbstractC0158F.m428i(this));
            setBackground(c0357g);
        }
        setSelectedTabIndicator(AbstractC0088l.m258E(context2, m846g, 5));
        setSelectedTabIndicatorColor(m846g.getColor(8, 0));
        c0447e.m1148b(m846g.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(m846g.getInt(10, 0));
        setTabIndicatorAnimationMode(m846g.getInt(7, 0));
        setTabIndicatorFullWidth(m846g.getBoolean(9, true));
        int dimensionPixelSize = m846g.getDimensionPixelSize(16, 0);
        this.f3629m = dimensionPixelSize;
        this.f3628l = dimensionPixelSize;
        this.f3627k = dimensionPixelSize;
        this.f3626j = dimensionPixelSize;
        this.f3626j = m846g.getDimensionPixelSize(19, dimensionPixelSize);
        this.f3627k = m846g.getDimensionPixelSize(20, dimensionPixelSize);
        this.f3628l = m846g.getDimensionPixelSize(18, dimensionPixelSize);
        this.f3629m = m846g.getDimensionPixelSize(17, dimensionPixelSize);
        if (AbstractC1687o.m4923R(context2, R.attr.isMaterial3Theme, false)) {
            this.f3630n = R.attr.textAppearanceTitleSmall;
        } else {
            this.f3630n = R.attr.textAppearanceButton;
        }
        int resourceId = m846g.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f3631o = resourceId;
        int[] iArr = AbstractC0770a.f3915v;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f3638v = dimensionPixelSize2;
            this.f3633q = AbstractC0088l.m255B(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (m846g.hasValue(22)) {
                this.f3632p = m846g.getResourceId(22, resourceId);
            }
            int i = this.f3632p;
            if (i != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList m255B = AbstractC0088l.m255B(context2, obtainStyledAttributes, 3);
                    if (m255B != null) {
                        this.f3633q = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{m255B.getColorForState(new int[]{android.R.attr.state_selected}, m255B.getDefaultColor()), this.f3633q.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (m846g.hasValue(25)) {
                this.f3633q = AbstractC0088l.m255B(context2, m846g, 25);
            }
            if (m846g.hasValue(23)) {
                this.f3633q = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{m846g.getColor(23, 0), this.f3633q.getDefaultColor()});
            }
            this.f3634r = AbstractC0088l.m255B(context2, m846g, 3);
            AbstractC0294k.m847h(m846g.getInt(4, -1), null);
            this.f3635s = AbstractC0088l.m255B(context2, m846g, 21);
            this.f3607E = m846g.getInt(6, 300);
            this.f3616N = AbstractC1680h.m4852N(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC0067a.f225b);
            this.f3642z = m846g.getDimensionPixelSize(14, -1);
            this.f3603A = m846g.getDimensionPixelSize(13, -1);
            this.f3640x = m846g.getResourceId(0, 0);
            this.f3605C = m846g.getDimensionPixelSize(1, 0);
            this.f3609G = m846g.getInt(15, 1);
            this.f3606D = m846g.getInt(2, 0);
            this.f3610H = m846g.getBoolean(12, false);
            this.f3614L = m846g.getBoolean(26, false);
            m846g.recycle();
            Resources resources = getResources();
            this.f3639w = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f3604B = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            m2103b();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f3623g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f3642z;
        if (i != -1) {
            return i;
        }
        int i2 = this.f3609G;
        if (i2 == 0 || i2 == 2) {
            return this.f3604B;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f3625i.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C0447e c0447e = this.f3625i;
        int childCount = c0447e.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c0447e.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof C0450h) {
                        ((C0450h) childAt).m1157f();
                    }
                }
                i2++;
            }
        }
    }

    /* renamed from: a */
    public final void m2102a(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            if (isLaidOut()) {
                C0447e c0447e = this.f3625i;
                int childCount = c0447e.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c0447e.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int m2104c = m2104c(i, 0.0f);
                if (scrollX != m2104c) {
                    m2105d();
                    this.f3619Q.setIntValues(scrollX, m2104c);
                    this.f3619Q.start();
                }
                ValueAnimator valueAnimator = c0447e.f1425f;
                if (valueAnimator != null && valueAnimator.isRunning() && c0447e.f1426g.f3622f != i) {
                    c0447e.f1425f.cancel();
                }
                c0447e.m1150d(i, true, this.f3607E);
                return;
            }
        }
        m2110i(i, 0.0f, true, true, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2103b() {
        int i = this.f3609G;
        int max = (i == 0 || i == 2) ? Math.max(0, this.f3605C - this.f3626j) : 0;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        C0447e c0447e = this.f3625i;
        c0447e.setPaddingRelative(max, 0, 0, 0);
        int i2 = this.f3609G;
        if (i2 == 0) {
            int i3 = this.f3606D;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                c0447e.setGravity(1);
            }
            c0447e.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f3606D == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            c0447e.setGravity(1);
        }
        m2111j(true);
    }

    /* renamed from: c */
    public final int m2104c(int i, float f2) {
        C0447e c0447e;
        View childAt;
        int i2 = this.f3609G;
        if ((i2 != 0 && i2 != 2) || (childAt = (c0447e = this.f3625i).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < c0447e.getChildCount() ? c0447e.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f2);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    /* renamed from: d */
    public final void m2105d() {
        if (this.f3619Q == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3619Q = valueAnimator;
            valueAnimator.setInterpolator(this.f3616N);
            this.f3619Q.setDuration(this.f3607E);
            this.f3619Q.addUpdateListener(new C0124c(1, this));
        }
    }

    /* renamed from: e */
    public final C0448f m2106e(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C0448f) this.f3623g.get(i);
    }

    /* renamed from: f */
    public final C0448f m2107f() {
        C0448f c0448f = (C0448f) f3602T.mo401a();
        if (c0448f == null) {
            c0448f = new C0448f();
            c0448f.f1428b = -1;
        }
        c0448f.f1430d = this;
        C0145c c0145c = this.f3621S;
        C0450h c0450h = c0145c != null ? (C0450h) c0145c.mo401a() : null;
        if (c0450h == null) {
            c0450h = new C0450h(this, getContext());
        }
        c0450h.setTab(c0448f);
        c0450h.setFocusable(true);
        c0450h.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            c0450h.setContentDescription(c0448f.f1427a);
        } else {
            c0450h.setContentDescription(null);
        }
        c0448f.f1431e = c0450h;
        return c0448f;
    }

    /* renamed from: g */
    public final void m2108g() {
        C0447e c0447e = this.f3625i;
        int childCount = c0447e.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C0450h c0450h = (C0450h) c0447e.getChildAt(childCount);
            c0447e.removeViewAt(childCount);
            if (c0450h != null) {
                c0450h.setTab(null);
                c0450h.setSelected(false);
                this.f3621S.mo403c(c0450h);
            }
            requestLayout();
        }
        Iterator it = this.f3623g.iterator();
        while (it.hasNext()) {
            C0448f c0448f = (C0448f) it.next();
            it.remove();
            c0448f.f1430d = null;
            c0448f.f1431e = null;
            c0448f.f1427a = null;
            c0448f.f1428b = -1;
            c0448f.f1429c = null;
            f3602T.mo403c(c0448f);
        }
        this.f3624h = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C0448f c0448f = this.f3624h;
        if (c0448f != null) {
            return c0448f.f1428b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f3623g.size();
    }

    public int getTabGravity() {
        return this.f3606D;
    }

    public ColorStateList getTabIconTint() {
        return this.f3634r;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f3613K;
    }

    public int getTabIndicatorGravity() {
        return this.f3608F;
    }

    public int getTabMaxWidth() {
        return this.f3641y;
    }

    public int getTabMode() {
        return this.f3609G;
    }

    public ColorStateList getTabRippleColor() {
        return this.f3635s;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f3636t;
    }

    public ColorStateList getTabTextColors() {
        return this.f3633q;
    }

    /* renamed from: h */
    public final void m2109h(C0448f c0448f, boolean z2) {
        C0448f c0448f2 = this.f3624h;
        ArrayList arrayList = this.f3618P;
        if (c0448f2 == c0448f) {
            if (c0448f2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC0444b) arrayList.get(size)).getClass();
                }
                m2102a(c0448f.f1428b);
                return;
            }
            return;
        }
        int i = c0448f != null ? c0448f.f1428b : -1;
        if (z2) {
            if ((c0448f2 == null || c0448f2.f1428b == -1) && i != -1) {
                m2110i(i, 0.0f, true, true, true);
            } else {
                m2102a(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f3624h = c0448f;
        if (c0448f2 != null && c0448f2.f1430d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC0444b) arrayList.get(size2)).mo1145a(c0448f2);
            }
        }
        if (c0448f != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC0444b) arrayList.get(size3)).mo1146b(c0448f);
            }
        }
    }

    /* renamed from: i */
    public final void m2110i(int i, float f2, boolean z2, boolean z3, boolean z4) {
        float f3 = i + f2;
        int round = Math.round(f3);
        if (round >= 0) {
            C0447e c0447e = this.f3625i;
            if (round >= c0447e.getChildCount()) {
                return;
            }
            if (z3) {
                c0447e.f1426g.f3622f = Math.round(f3);
                ValueAnimator valueAnimator = c0447e.f1425f;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c0447e.f1425f.cancel();
                }
                c0447e.m1149c(c0447e.getChildAt(i), c0447e.getChildAt(i + 1), f2);
            }
            ValueAnimator valueAnimator2 = this.f3619Q;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3619Q.cancel();
            }
            int m2104c = m2104c(i, f2);
            int scrollX = getScrollX();
            boolean z5 = (i < getSelectedTabPosition() && m2104c >= scrollX) || (i > getSelectedTabPosition() && m2104c <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            if (getLayoutDirection() == 1) {
                z5 = (i < getSelectedTabPosition() && m2104c <= scrollX) || (i > getSelectedTabPosition() && m2104c >= scrollX) || i == getSelectedTabPosition();
            }
            if (z5 || this.f3620R == 1 || z4) {
                if (i < 0) {
                    m2104c = 0;
                }
                scrollTo(m2104c, 0);
            }
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: j */
    public final void m2111j(boolean z2) {
        int i = 0;
        while (true) {
            C0447e c0447e = this.f3625i;
            if (i >= c0447e.getChildCount()) {
                return;
            }
            View childAt = c0447e.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f3609G == 1 && this.f3606D == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z2) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0357g) {
            AbstractC1687o.m4929X(this, (C0357g) background);
        }
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0450h c0450h;
        Drawable drawable;
        int i = 0;
        while (true) {
            C0447e c0447e = this.f3625i;
            if (i >= c0447e.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c0447e.getChildAt(i);
            if ((childAt instanceof C0450h) && (drawable = (c0450h = (C0450h) childAt).f1443n) != null) {
                drawable.setBounds(c0450h.getLeft(), c0450h.getTop(), c0450h.getRight(), c0450h.getBottom());
                c0450h.f1443n.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int round = Math.round(AbstractC0294k.m843d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.f3603A;
            if (i3 <= 0) {
                i3 = (int) (size - AbstractC0294k.m843d(getContext(), 56));
            }
            this.f3641y = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.f3609G;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof C0357g) {
            ((C0357g) background).m957j(f2);
        }
    }

    public void setInlineLabel(boolean z2) {
        if (this.f3610H == z2) {
            return;
        }
        this.f3610H = z2;
        int i = 0;
        while (true) {
            C0447e c0447e = this.f3625i;
            if (i >= c0447e.getChildCount()) {
                m2103b();
                return;
            }
            View childAt = c0447e.getChildAt(i);
            if (childAt instanceof C0450h) {
                C0450h c0450h = (C0450h) childAt;
                c0450h.setOrientation(!c0450h.f1445p.f3610H ? 1 : 0);
                TextView textView = c0450h.f1441l;
                if (textView == null && c0450h.f1442m == null) {
                    c0450h.m1158g(c0450h.f1436g, c0450h.f1437h, true);
                } else {
                    c0450h.m1158g(textView, c0450h.f1442m, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC0445c interfaceC0445c) {
        setOnTabSelectedListener((InterfaceC0444b) interfaceC0445c);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m2105d();
        this.f3619Q.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f3636t = mutate;
        int i = this.f3637u;
        if (i != 0) {
            AbstractC0070a.m205g(mutate, i);
        } else {
            AbstractC0070a.m206h(mutate, null);
        }
        int i2 = this.f3612J;
        if (i2 == -1) {
            i2 = this.f3636t.getIntrinsicHeight();
        }
        this.f3625i.m1148b(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f3637u = i;
        Drawable drawable = this.f3636t;
        if (i != 0) {
            AbstractC0070a.m205g(drawable, i);
        } else {
            AbstractC0070a.m206h(drawable, null);
        }
        m2111j(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f3608F != i) {
            this.f3608F = i;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            this.f3625i.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f3612J = i;
        this.f3625i.m1148b(i);
    }

    public void setTabGravity(int i) {
        if (this.f3606D != i) {
            this.f3606D = i;
            m2103b();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f3634r != colorStateList) {
            this.f3634r = colorStateList;
            ArrayList arrayList = this.f3623g;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0450h c0450h = ((C0448f) arrayList.get(i)).f1431e;
                if (c0450h != null) {
                    c0450h.m1155d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AbstractC1695c.m4959b(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f3613K = i;
        if (i == 0) {
            this.f3615M = new C0355e(15);
            return;
        }
        if (i == 1) {
            this.f3615M = new C0443a(0);
        } else {
            if (i == 2) {
                this.f3615M = new C0443a(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.f3611I = z2;
        int i = C0447e.f1424h;
        C0447e c0447e = this.f3625i;
        c0447e.m1147a(c0447e.f1426g.getSelectedTabPosition());
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        c0447e.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f3609G) {
            this.f3609G = i;
            m2103b();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f3635s == colorStateList) {
            return;
        }
        this.f3635s = colorStateList;
        int i = 0;
        while (true) {
            C0447e c0447e = this.f3625i;
            if (i >= c0447e.getChildCount()) {
                return;
            }
            View childAt = c0447e.getChildAt(i);
            if (childAt instanceof C0450h) {
                Context context = getContext();
                int i2 = C0450h.f1434q;
                ((C0450h) childAt).m1156e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AbstractC1695c.m4959b(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f3633q != colorStateList) {
            this.f3633q = colorStateList;
            ArrayList arrayList = this.f3623g;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0450h c0450h = ((C0448f) arrayList.get(i)).f1431e;
                if (c0450h != null) {
                    c0450h.m1155d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1164a abstractC1164a) {
        m2108g();
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.f3614L == z2) {
            return;
        }
        this.f3614L = z2;
        int i = 0;
        while (true) {
            C0447e c0447e = this.f3625i;
            if (i >= c0447e.getChildCount()) {
                return;
            }
            View childAt = c0447e.getChildAt(i);
            if (childAt instanceof C0450h) {
                Context context = getContext();
                int i2 = C0450h.f1434q;
                ((C0450h) childAt).m1156e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(AbstractC1165b abstractC1165b) {
        m2108g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC0444b interfaceC0444b) {
        InterfaceC0444b interfaceC0444b2 = this.f3617O;
        ArrayList arrayList = this.f3618P;
        if (interfaceC0444b2 != null) {
            arrayList.remove(interfaceC0444b2);
        }
        this.f3617O = interfaceC0444b;
        if (interfaceC0444b == null || arrayList.contains(interfaceC0444b)) {
            return;
        }
        arrayList.add(interfaceC0444b);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AbstractC0088l.m257D(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
