package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C0540e;
import com.altaysoft.t500_split.media.C0639g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p001A0.RunnableC0020n;
import p006C.AbstractC0062j;
import p016H.RunnableC0109a;
import p022K.AbstractC0169Q;
import p038T.C0326t;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0387O;
import p046X.C0422u;
import p068f0.AbstractC0774D;
import p068f0.AbstractC0778H;
import p068f0.AbstractC0828z;
import p089n0.AbstractC1176a;
import p091o.C1195e;
import p092o0.C1204b;
import p095p0.C1223b;
import p095p0.C1224c;
import p095p0.C1225d;
import p095p0.C1226e;
import p095p0.C1227f;
import p095p0.C1228g;
import p095p0.C1229h;
import p095p0.C1233l;
import p095p0.C1234m;
import p095p0.C1235n;
import p095p0.InterfaceC1232k;
import p098q0.C1375z1;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: f */
    public final Rect f2144f;

    /* renamed from: g */
    public final Rect f2145g;

    /* renamed from: h */
    public final C1204b f2146h;

    /* renamed from: i */
    public int f2147i;

    /* renamed from: j */
    public boolean f2148j;

    /* renamed from: k */
    public final C1226e f2149k;

    /* renamed from: l */
    public final C1229h f2150l;

    /* renamed from: m */
    public int f2151m;

    /* renamed from: n */
    public Parcelable f2152n;

    /* renamed from: o */
    public final C1234m f2153o;

    /* renamed from: p */
    public final C1233l f2154p;

    /* renamed from: q */
    public final C1225d f2155q;

    /* renamed from: r */
    public final C1204b f2156r;

    /* renamed from: s */
    public final C0639g f2157s;

    /* renamed from: t */
    public final C1223b f2158t;

    /* renamed from: u */
    public AbstractC0774D f2159u;

    /* renamed from: v */
    public boolean f2160v;

    /* renamed from: w */
    public boolean f2161w;

    /* renamed from: x */
    public int f2162x;

    /* renamed from: y */
    public final C0326t f2163y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 29;
        this.f2144f = new Rect();
        this.f2145g = new Rect();
        C1204b c1204b = new C1204b();
        this.f2146h = c1204b;
        int i2 = 0;
        this.f2148j = false;
        this.f2149k = new C1226e(this);
        this.f2151m = -1;
        this.f2159u = null;
        this.f2160v = false;
        int i3 = 1;
        this.f2161w = true;
        this.f2162x = -1;
        this.f2163y = new C0326t(this);
        C1234m c1234m = new C1234m(this, context);
        this.f2153o = c1234m;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        c1234m.setId(View.generateViewId());
        this.f2153o.setDescendantFocusability(131072);
        C1229h c1229h = new C1229h(this);
        this.f2150l = c1229h;
        this.f2153o.setLayoutManager(c1229h);
        this.f2153o.setScrollingTouchSlop(1);
        int[] iArr = AbstractC1176a.f5362a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f2153o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C1234m c1234m2 = this.f2153o;
            C1228g c1228g = new C1228g();
            if (c1234m2.f2056D == null) {
                c1234m2.f2056D = new ArrayList();
            }
            c1234m2.f2056D.add(c1228g);
            C1225d c1225d = new C1225d(this);
            this.f2155q = c1225d;
            this.f2157s = new C0639g(i, c1225d);
            C1233l c1233l = new C1233l(this);
            this.f2154p = c1233l;
            c1233l.m2331a(this.f2153o);
            this.f2153o.m1520h(this.f2155q);
            C1204b c1204b2 = new C1204b();
            this.f2156r = c1204b2;
            this.f2155q.f5471a = c1204b2;
            C1227f c1227f = new C1227f(this, i2);
            C1227f c1227f2 = new C1227f(this, i3);
            ((ArrayList) c1204b2.f5427b).add(c1227f);
            ((ArrayList) this.f2156r.f5427b).add(c1227f2);
            C0326t c0326t = this.f2163y;
            C1234m c1234m3 = this.f2153o;
            c0326t.getClass();
            c1234m3.setImportantForAccessibility(2);
            c0326t.f925c = new C1226e(c0326t);
            ViewPager2 viewPager2 = (ViewPager2) c0326t.f926d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f2156r.f5427b).add(c1204b);
            C1223b c1223b = new C1223b();
            this.f2158t = c1223b;
            ((ArrayList) this.f2156r.f5427b).add(c1223b);
            C1234m c1234m4 = this.f2153o;
            attachViewToParent(c1234m4, 0, c1234m4.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public final void m1571a() {
        AbstractC0828z adapter;
        AbstractComponentCallbacksC0423v m910c;
        if (this.f2151m == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f2152n;
        if (parcelable != null) {
            if (adapter instanceof C1375z1) {
                C1375z1 c1375z1 = (C1375z1) adapter;
                C1195e c1195e = c1375z1.f6457f;
                if (c1195e.m2859g() == 0) {
                    C1195e c1195e2 = c1375z1.f6456e;
                    if (c1195e2.m2859g() == 0) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(C1375z1.class.getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (str.startsWith("f#") && str.length() > 2) {
                                long parseLong = Long.parseLong(str.substring(2));
                                C0387O c0387o = c1375z1.f6455d;
                                c0387o.getClass();
                                String string = bundle.getString(str);
                                if (string == null) {
                                    m910c = null;
                                } else {
                                    m910c = c0387o.f1151c.m910c(string);
                                    if (m910c == null) {
                                        c0387o.m1014c0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                        throw null;
                                    }
                                }
                                c1195e2.m2857e(parseLong, m910c);
                            } else {
                                if (!str.startsWith("s#") || str.length() <= 2) {
                                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                                }
                                long parseLong2 = Long.parseLong(str.substring(2));
                                C0422u c0422u = (C0422u) bundle.getParcelable(str);
                                if (C1375z1.m3322k(parseLong2)) {
                                    c1195e.m2857e(parseLong2, c0422u);
                                }
                            }
                        }
                        if (c1195e2.m2859g() != 0) {
                            c1375z1.f6461j = true;
                            c1375z1.f6460i = true;
                            c1375z1.m3323l();
                            Handler handler = new Handler(Looper.getMainLooper());
                            RunnableC0020n runnableC0020n = new RunnableC0020n(16, c1375z1);
                            c1375z1.f6454c.m1377a(new C0540e(handler, 4, runnableC0020n));
                            handler.postDelayed(runnableC0020n, 10000L);
                        }
                    }
                }
                throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
            }
            this.f2152n = null;
        }
        int max = Math.max(0, Math.min(this.f2151m, adapter.mo2089a() - 1));
        this.f2147i = max;
        this.f2151m = -1;
        this.f2153o.m1512Z(max);
        this.f2163y.m920m();
    }

    /* renamed from: b */
    public final void m1572b(int i) {
        AbstractC0828z adapter = getAdapter();
        if (adapter == null) {
            if (this.f2151m != -1) {
                this.f2151m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo2089a() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), adapter.mo2089a() - 1);
        int i2 = this.f2147i;
        if ((min == i2 && this.f2155q.f5476f == 0) || min == i2) {
            return;
        }
        double d = i2;
        this.f2147i = min;
        this.f2163y.m920m();
        C1225d c1225d = this.f2155q;
        if (c1225d.f5476f != 0) {
            c1225d.m2902f();
            C1224c c1224c = c1225d.f5477g;
            d = c1224c.f5468a + c1224c.f5469b;
        }
        C1225d c1225d2 = this.f2155q;
        c1225d2.getClass();
        c1225d2.f5475e = 2;
        boolean z2 = c1225d2.f5479i != min;
        c1225d2.f5479i = min;
        c1225d2.m2900d(2);
        if (z2) {
            c1225d2.m2899c(min);
        }
        double d2 = min;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.f2153o.m1514b0(min);
            return;
        }
        this.f2153o.m1512Z(d2 > d ? min - 3 : min + 3);
        C1234m c1234m = this.f2153o;
        c1234m.post(new RunnableC0109a(min, c1234m));
    }

    /* renamed from: c */
    public final void m1573c() {
        C1233l c1233l = this.f2154p;
        if (c1233l == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View mo2333e = c1233l.mo2333e(this.f2150l);
        if (mo2333e == null) {
            return;
        }
        this.f2150l.getClass();
        int m2218H = AbstractC0778H.m2218H(mo2333e);
        if (m2218H != this.f2147i && getScrollState() == 0) {
            this.f2156r.mo1161c(m2218H);
        }
        this.f2148j = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f2153o.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f2153o.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C1235n) {
            int i = ((C1235n) parcelable).f5490a;
            sparseArray.put(this.f2153o.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m1571a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f2163y.getClass();
        this.f2163y.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC0828z getAdapter() {
        return this.f2153o.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2147i;
    }

    public int getItemDecorationCount() {
        return this.f2153o.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f2162x;
    }

    public int getOrientation() {
        return this.f2150l.f2039p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        C1234m c1234m = this.f2153o;
        if (getOrientation() == 0) {
            height = c1234m.getWidth() - c1234m.getPaddingLeft();
            paddingBottom = c1234m.getPaddingRight();
        } else {
            height = c1234m.getHeight() - c1234m.getPaddingTop();
            paddingBottom = c1234m.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f2155q.f5476f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int mo2089a;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f2163y.f926d;
        if (viewPager2.getAdapter() == null) {
            i = 0;
            i2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i = viewPager2.getAdapter().mo2089a();
            i2 = 0;
        } else {
            i2 = viewPager2.getAdapter().mo2089a();
            i = 0;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0));
        AbstractC0828z adapter = viewPager2.getAdapter();
        if (adapter == null || (mo2089a = adapter.mo2089a()) == 0 || !viewPager2.f2161w) {
            return;
        }
        if (viewPager2.f2147i > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f2147i < mo2089a - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f2153o.getMeasuredWidth();
        int measuredHeight = this.f2153o.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f2144f;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f2145g;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f2153o.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f2148j) {
            m1573c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f2153o, i, i2);
        int measuredWidth = this.f2153o.getMeasuredWidth();
        int measuredHeight = this.f2153o.getMeasuredHeight();
        int measuredState = this.f2153o.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1235n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1235n c1235n = (C1235n) parcelable;
        super.onRestoreInstanceState(c1235n.getSuperState());
        this.f2151m = c1235n.f5491b;
        this.f2152n = c1235n.f5492c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1235n c1235n = new C1235n(super.onSaveInstanceState());
        c1235n.f5490a = this.f2153o.getId();
        int i = this.f2151m;
        if (i == -1) {
            i = this.f2147i;
        }
        c1235n.f5491b = i;
        Parcelable parcelable = this.f2152n;
        if (parcelable != null) {
            c1235n.f5492c = parcelable;
        } else {
            AbstractC0828z adapter = this.f2153o.getAdapter();
            if (adapter instanceof C1375z1) {
                C1375z1 c1375z1 = (C1375z1) adapter;
                c1375z1.getClass();
                C1195e c1195e = c1375z1.f6456e;
                int m2859g = c1195e.m2859g();
                C1195e c1195e2 = c1375z1.f6457f;
                Bundle bundle = new Bundle(c1195e2.m2859g() + m2859g);
                for (int i2 = 0; i2 < c1195e.m2859g(); i2++) {
                    long m2856d = c1195e.m2856d(i2);
                    AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) c1195e.m2855c(m2856d, null);
                    if (abstractComponentCallbacksC0423v != null && abstractComponentCallbacksC0423v.m1134q()) {
                        String str = "f#" + m2856d;
                        C0387O c0387o = c1375z1.f6455d;
                        c0387o.getClass();
                        if (abstractComponentCallbacksC0423v.f1374w != c0387o) {
                            c0387o.m1014c0(new IllegalStateException(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " is not currently in the FragmentManager")));
                            throw null;
                        }
                        bundle.putString(str, abstractComponentCallbacksC0423v.f1361j);
                    }
                }
                for (int i3 = 0; i3 < c1195e2.m2859g(); i3++) {
                    long m2856d2 = c1195e2.m2856d(i3);
                    if (C1375z1.m3322k(m2856d2)) {
                        bundle.putParcelable("s#" + m2856d2, (Parcelable) c1195e2.m2855c(m2856d2, null));
                    }
                }
                c1235n.f5492c = bundle;
            }
        }
        return c1235n;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.f2163y.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C0326t c0326t = this.f2163y;
        c0326t.getClass();
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = (ViewPager2) c0326t.f926d;
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f2161w) {
            viewPager2.m1572b(currentItem);
        }
        return true;
    }

    public void setAdapter(AbstractC0828z abstractC0828z) {
        AbstractC0828z adapter = this.f2153o.getAdapter();
        C0326t c0326t = this.f2163y;
        if (adapter != null) {
            adapter.f4209a.unregisterObserver((C1226e) c0326t.f925c);
        } else {
            c0326t.getClass();
        }
        C1226e c1226e = this.f2149k;
        if (adapter != null) {
            adapter.f4209a.unregisterObserver(c1226e);
        }
        this.f2153o.setAdapter(abstractC0828z);
        this.f2147i = 0;
        m1571a();
        C0326t c0326t2 = this.f2163y;
        c0326t2.m920m();
        if (abstractC0828z != null) {
            abstractC0828z.f4209a.registerObserver((C1226e) c0326t2.f925c);
        }
        if (abstractC0828z != null) {
            abstractC0828z.f4209a.registerObserver(c1226e);
        }
    }

    public void setCurrentItem(int i) {
        Object obj = this.f2157s.f3011g;
        m1572b(i);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f2163y.m920m();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f2162x = i;
        this.f2153o.requestLayout();
    }

    public void setOrientation(int i) {
        this.f2150l.m1466c1(i);
        this.f2163y.m920m();
    }

    public void setPageTransformer(InterfaceC1232k interfaceC1232k) {
        if (interfaceC1232k != null) {
            if (!this.f2160v) {
                this.f2159u = this.f2153o.getItemAnimator();
                this.f2160v = true;
            }
            this.f2153o.setItemAnimator(null);
        } else if (this.f2160v) {
            this.f2153o.setItemAnimator(this.f2159u);
            this.f2159u = null;
            this.f2160v = false;
        }
        this.f2158t.getClass();
        if (interfaceC1232k == null) {
            return;
        }
        this.f2158t.getClass();
        this.f2158t.getClass();
    }

    public void setUserInputEnabled(boolean z2) {
        this.f2161w = z2;
        this.f2163y.m920m();
    }
}
