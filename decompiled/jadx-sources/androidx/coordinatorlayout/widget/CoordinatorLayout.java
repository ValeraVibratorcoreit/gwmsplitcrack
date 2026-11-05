package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p008D.AbstractC0071b;
import p020J.C0145c;
import p020J.C0146d;
import p022K.AbstractC0156D;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.C0208p;
import p022K.C0221v0;
import p022K.InterfaceC0204n;
import p022K.InterfaceC0206o;
import p034Q0.C0295l;
import p038T.C0326t;
import p091o.C1201k;
import p098q0.C1315f1;
import p109u0.AbstractC1561o;
import p114w.AbstractC1618a;
import p117x.AbstractC1636a;
import p117x.AbstractC1642g;
import p117x.C1639d;
import p117x.C1641f;
import p117x.InterfaceC1637b;
import p117x.ViewGroupOnHierarchyChangeListenerC1638c;
import p117x.ViewTreeObserverOnPreDrawListenerC1640e;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0204n, InterfaceC0206o {

    /* renamed from: A */
    public static final ThreadLocal f1875A;

    /* renamed from: B */
    public static final C0295l f1876B;

    /* renamed from: C */
    public static final C0146d f1877C;

    /* renamed from: y */
    public static final String f1878y;

    /* renamed from: z */
    public static final Class[] f1879z;

    /* renamed from: f */
    public final ArrayList f1880f;

    /* renamed from: g */
    public final C0326t f1881g;

    /* renamed from: h */
    public final ArrayList f1882h;

    /* renamed from: i */
    public final ArrayList f1883i;

    /* renamed from: j */
    public final int[] f1884j;

    /* renamed from: k */
    public final int[] f1885k;

    /* renamed from: l */
    public boolean f1886l;

    /* renamed from: m */
    public boolean f1887m;

    /* renamed from: n */
    public final int[] f1888n;

    /* renamed from: o */
    public View f1889o;

    /* renamed from: p */
    public View f1890p;

    /* renamed from: q */
    public ViewTreeObserverOnPreDrawListenerC1640e f1891q;

    /* renamed from: r */
    public boolean f1892r;

    /* renamed from: s */
    public C0221v0 f1893s;

    /* renamed from: t */
    public boolean f1894t;

    /* renamed from: u */
    public Drawable f1895u;

    /* renamed from: v */
    public ViewGroup.OnHierarchyChangeListener f1896v;

    /* renamed from: w */
    public C1315f1 f1897w;

    /* renamed from: x */
    public final C0208p f1898x;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1878y = r02 != null ? r02.getName() : null;
        f1876B = new C0295l(6);
        f1879z = new Class[]{Context.class, AttributeSet.class};
        f1875A = new ThreadLocal();
        f1877C = new C0146d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1880f = new ArrayList();
        this.f1881g = new C0326t(5);
        this.f1882h = new ArrayList();
        this.f1883i = new ArrayList();
        this.f1884j = new int[2];
        this.f1885k = new int[2];
        this.f1898x = new C0208p();
        int[] iArr = AbstractC1618a.f9249a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1888n = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f1888n[i] = (int) (r2[i] * f2);
            }
        }
        this.f1895u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        m1332w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1638c(this));
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: g */
    public static Rect m1316g() {
        Rect rect = (Rect) f1877C.mo401a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: l */
    public static void m1317l(int i, Rect rect, Rect rect2, C1639d c1639d, int i2, int i3) {
        int i4 = c1639d.f9308c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c1639d.f9309d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: n */
    public static C1639d m1318n(View view) {
        C1639d c1639d = (C1639d) view.getLayoutParams();
        if (!c1639d.f9307b) {
            InterfaceC1637b interfaceC1637b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC1637b = (InterfaceC1637b) cls.getAnnotation(InterfaceC1637b.class);
                if (interfaceC1637b != null) {
                    break;
                }
            }
            if (interfaceC1637b != null) {
                try {
                    AbstractC1636a abstractC1636a = (AbstractC1636a) interfaceC1637b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC1636a abstractC1636a2 = c1639d.f9306a;
                    if (abstractC1636a2 != abstractC1636a) {
                        if (abstractC1636a2 != null) {
                            abstractC1636a2.mo2040e();
                        }
                        c1639d.f9306a = abstractC1636a;
                        c1639d.f9307b = true;
                        if (abstractC1636a != null) {
                            abstractC1636a.mo2039c(c1639d);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC1637b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            c1639d.f9307b = true;
        }
        return c1639d;
    }

    /* renamed from: u */
    public static void m1319u(View view, int i) {
        C1639d c1639d = (C1639d) view.getLayoutParams();
        int i2 = c1639d.f9314i;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            view.offsetLeftAndRight(i - i2);
            c1639d.f9314i = i;
        }
    }

    /* renamed from: v */
    public static void m1320v(View view, int i) {
        C1639d c1639d = (C1639d) view.getLayoutParams();
        int i2 = c1639d.f9315j;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            view.offsetTopAndBottom(i - i2);
            c1639d.f9315j = i;
        }
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: a */
    public final void mo642a(View view, View view2, int i, int i2) {
        C0208p c0208p = this.f1898x;
        if (i2 == 1) {
            c0208p.f561b = i;
        } else {
            c0208p.f560a = i;
        }
        this.f1890p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C1639d) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: b */
    public final void mo643b(View view, int i) {
        C0208p c0208p = this.f1898x;
        if (i == 1) {
            c0208p.f561b = 0;
        } else {
            c0208p.f560a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1639d c1639d = (C1639d) childAt.getLayoutParams();
            if (c1639d.m4776a(i)) {
                AbstractC1636a abstractC1636a = c1639d.f9306a;
                if (abstractC1636a != null) {
                    abstractC1636a.mo2020p(childAt, view, i);
                }
                if (i == 0) {
                    c1639d.f9318m = false;
                } else if (i == 1) {
                    c1639d.f9319n = false;
                }
            }
        }
        this.f1890p = null;
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: c */
    public final void mo644c(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC1636a abstractC1636a;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1639d c1639d = (C1639d) childAt.getLayoutParams();
                if (c1639d.m4776a(i3) && (abstractC1636a = c1639d.f9306a) != null) {
                    int[] iArr2 = this.f1884j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1636a.mo2015j(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            m1327p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1639d) && super.checkLayoutParams(layoutParams);
    }

    @Override // p022K.InterfaceC0206o
    /* renamed from: d */
    public final void mo648d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC1636a abstractC1636a;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C1639d c1639d = (C1639d) childAt.getLayoutParams();
                if (c1639d.m4776a(i5) && (abstractC1636a = c1639d.f9306a) != null) {
                    int[] iArr2 = this.f1884j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1636a.mo2016k(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            m1327p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC1636a abstractC1636a = ((C1639d) view.getLayoutParams()).f9306a;
        if (abstractC1636a != null) {
            abstractC1636a.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1895u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: e */
    public final void mo645e(View view, int i, int i2, int i3, int i4, int i5) {
        mo648d(view, i, i2, i3, i4, 0, this.f1885k);
    }

    @Override // p022K.InterfaceC0204n
    /* renamed from: f */
    public final boolean mo646f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1639d c1639d = (C1639d) childAt.getLayoutParams();
                AbstractC1636a abstractC1636a = c1639d.f9306a;
                if (abstractC1636a != null) {
                    boolean mo2019o = abstractC1636a.mo2019o(childAt, i, i2);
                    z2 |= mo2019o;
                    if (i2 == 0) {
                        c1639d.f9318m = mo2019o;
                    } else if (i2 == 1) {
                        c1639d.f9319n = mo2019o;
                    }
                } else if (i2 == 0) {
                    c1639d.f9318m = false;
                } else if (i2 == 1) {
                    c1639d.f9319n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1639d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1639d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m1330s();
        return Collections.unmodifiableList(this.f1880f);
    }

    public final C0221v0 getLastWindowInsets() {
        return this.f1893s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0208p c0208p = this.f1898x;
        return c0208p.f561b | c0208p.f560a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1895u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void m1321h(C1639d c1639d, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1639d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c1639d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1639d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c1639d).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: i */
    public final void m1322i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            m1324k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j */
    public final ArrayList m1323j(View view) {
        C1201k c1201k = (C1201k) this.f1881g.f924b;
        int i = c1201k.f5418c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c1201k.m2873j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1201k.m2871h(i2));
            }
        }
        ArrayList arrayList3 = this.f1883i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* renamed from: k */
    public final void m1324k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC1642g.f9323a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC1642g.f9323a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC1642g.m4777a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC1642g.f9324b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: m */
    public final int m1325m(int i) {
        int[] iArr = this.f1888n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* renamed from: o */
    public final boolean m1326o(View view, int i, int i2) {
        C0146d c0146d = f1877C;
        Rect m1316g = m1316g();
        m1324k(view, m1316g);
        try {
            return m1316g.contains(i, i2);
        } finally {
            m1316g.setEmpty();
            c0146d.mo403c(m1316g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1331t(false);
        if (this.f1892r) {
            if (this.f1891q == null) {
                this.f1891q = new ViewTreeObserverOnPreDrawListenerC1640e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1891q);
        }
        if (this.f1893s == null) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            if (getFitsSystemWindows()) {
                AbstractC0156D.m419c(this);
            }
        }
        this.f1887m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1331t(false);
        if (this.f1892r && this.f1891q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1891q);
        }
        View view = this.f1890p;
        if (view != null) {
            mo643b(view, 0);
        }
        this.f1887m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1894t || this.f1895u == null) {
            return;
        }
        C0221v0 c0221v0 = this.f1893s;
        int m684d = c0221v0 != null ? c0221v0.m684d() : 0;
        if (m684d > 0) {
            this.f1895u.setBounds(0, 0, getWidth(), m684d);
            this.f1895u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1331t(true);
        }
        boolean m1329r = m1329r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1331t(true);
        }
        return m1329r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        AbstractC1636a abstractC1636a;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1880f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC1636a = ((C1639d) view.getLayoutParams()).f9306a) == null || !abstractC1636a.mo215g(this, view, layoutDirection))) {
                m1328q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        if (r0.mo2014h(r32, r20, r25, r8, r26) == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        AbstractC1636a abstractC1636a;
        int i9;
        ArrayList arrayList;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        m1330s();
        int childCount = getChildCount();
        int i17 = 0;
        loop0: while (true) {
            if (i17 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = getChildAt(i17);
            C1201k c1201k = (C1201k) this.f1881g.f924b;
            int i18 = c1201k.f5418c;
            for (int i19 = 0; i19 < i18; i19++) {
                ArrayList arrayList2 = (ArrayList) c1201k.m2873j(i19);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i17++;
        }
        if (z2 != this.f1892r) {
            if (z2) {
                if (this.f1887m) {
                    if (this.f1891q == null) {
                        this.f1891q = new ViewTreeObserverOnPreDrawListenerC1640e(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f1891q);
                }
                this.f1892r = true;
            } else {
                if (this.f1887m && this.f1891q != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f1891q);
                }
                this.f1892r = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        int layoutDirection = getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z6 = this.f1893s != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f1880f;
        int size3 = arrayList3.size();
        int i22 = suggestedMinimumWidth;
        int i23 = suggestedMinimumHeight;
        int i24 = 0;
        int i25 = 0;
        while (i25 < size3) {
            View view = (View) arrayList3.get(i25);
            if (view.getVisibility() == 8) {
                i14 = i25;
                i9 = size3;
                arrayList = arrayList3;
                i12 = paddingLeft;
                i15 = paddingRight;
                i10 = layoutDirection;
                z4 = true;
                z3 = false;
            } else {
                C1639d c1639d = (C1639d) view.getLayoutParams();
                int i26 = c1639d.f9310e;
                if (i26 < 0 || mode == 0) {
                    i3 = i24;
                    i4 = i25;
                } else {
                    int m1325m = m1325m(i26);
                    i3 = i24;
                    int i27 = c1639d.f9308c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i4 = i25;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        i5 = AbstractC1561o.m4298b(size, paddingRight, m1325m, 0);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        i5 = Math.max(0, m1325m - paddingLeft);
                    }
                    if (z6 || view.getFitsSystemWindows()) {
                        i6 = i23;
                        i7 = i;
                        i8 = i2;
                    } else {
                        int m683c = this.f1893s.m683c() + this.f1893s.m682b();
                        i6 = i23;
                        int m681a = this.f1893s.m681a() + this.f1893s.m684d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - m683c, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - m681a, mode2);
                    }
                    abstractC1636a = c1639d.f9306a;
                    if (abstractC1636a == null) {
                        int i28 = i3;
                        i14 = i4;
                        z3 = false;
                        i12 = paddingLeft;
                        i13 = i28;
                        int i29 = i6;
                        i15 = paddingRight;
                        i16 = i29;
                        i10 = layoutDirection;
                        i11 = i22;
                        i9 = size3;
                        arrayList = arrayList3;
                    } else {
                        i9 = size3;
                        arrayList = arrayList3;
                        i10 = layoutDirection;
                        z3 = false;
                        i11 = i22;
                        int i30 = i4;
                        i12 = paddingLeft;
                        i13 = i3;
                        i14 = i30;
                        int i31 = i6;
                        i15 = paddingRight;
                        i16 = i31;
                    }
                    measureChildWithMargins(view, i7, i5, i8, 0);
                    int max = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c1639d).leftMargin + ((ViewGroup.MarginLayoutParams) c1639d).rightMargin);
                    int max2 = Math.max(i16, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c1639d).topMargin + ((ViewGroup.MarginLayoutParams) c1639d).bottomMargin);
                    i22 = max;
                    i24 = View.combineMeasuredStates(i13, view.getMeasuredState());
                    i23 = max2;
                    z4 = true;
                }
                i5 = 0;
                if (z6) {
                }
                i6 = i23;
                i7 = i;
                i8 = i2;
                abstractC1636a = c1639d.f9306a;
                if (abstractC1636a == null) {
                }
                measureChildWithMargins(view, i7, i5, i8, 0);
                int max3 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) c1639d).leftMargin + ((ViewGroup.MarginLayoutParams) c1639d).rightMargin);
                int max22 = Math.max(i16, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) c1639d).topMargin + ((ViewGroup.MarginLayoutParams) c1639d).bottomMargin);
                i22 = max3;
                i24 = View.combineMeasuredStates(i13, view.getMeasuredState());
                i23 = max22;
                z4 = true;
            }
            i25 = i14 + 1;
            paddingLeft = i12;
            paddingRight = i15;
            layoutDirection = i10;
            size3 = i9;
            arrayList3 = arrayList;
        }
        int i32 = i24;
        setMeasuredDimension(View.resolveSizeAndState(i22, i, (-16777216) & i32), View.resolveSizeAndState(i23, i2, i32 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1639d c1639d = (C1639d) childAt.getLayoutParams();
                if (c1639d.m4776a(0)) {
                    AbstractC1636a abstractC1636a = c1639d.f9306a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC1636a abstractC1636a;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1639d c1639d = (C1639d) childAt.getLayoutParams();
                if (c1639d.m4776a(0) && (abstractC1636a = c1639d.f9306a) != null) {
                    z2 |= abstractC1636a.mo2041i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo644c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo645e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo642a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1641f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1641f c1641f = (C1641f) parcelable;
        super.onRestoreInstanceState(c1641f.f833a);
        SparseArray sparseArray = c1641f.f9322c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1636a abstractC1636a = m1318n(childAt).f9306a;
            if (id != -1 && abstractC1636a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC1636a.mo2017m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable mo2018n;
        C1641f c1641f = new C1641f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1636a abstractC1636a = ((C1639d) childAt.getLayoutParams()).f9306a;
            if (id != -1 && abstractC1636a != null && (mo2018n = abstractC1636a.mo2018n(childAt)) != null) {
                sparseArray.append(id, mo2018n);
            }
        }
        c1641f.f9322c = sparseArray;
        return c1641f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo646f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo643b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean mo2021q;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1889o == null) {
            z2 = m1329r(motionEvent, 1);
        } else {
            z2 = false;
        }
        AbstractC1636a abstractC1636a = ((C1639d) this.f1889o.getLayoutParams()).f9306a;
        if (abstractC1636a != null) {
            mo2021q = abstractC1636a.mo2021q(this.f1889o, motionEvent);
            motionEvent2 = null;
            if (this.f1889o != null) {
                mo2021q |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m1331t(false);
            }
            return mo2021q;
        }
        mo2021q = false;
        motionEvent2 = null;
        if (this.f1889o != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        m1331t(false);
        return mo2021q;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004b A[EDGE_INSN: B:114:0x004b->B:9:0x004b BREAK  A[LOOP:2: B:106:0x02db->B:112:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1327p(int i) {
        int i2;
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        Rect rect3;
        int i5;
        int i6;
        ArrayList arrayList;
        boolean z2;
        int i7;
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        int i14;
        C1639d c1639d;
        int i15;
        C0146d c0146d;
        int i16;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        ArrayList arrayList2;
        int i17;
        AbstractC1636a abstractC1636a;
        int i18 = i;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f1880f;
        int size = arrayList3.size();
        Rect m1316g = m1316g();
        Rect m1316g2 = m1316g();
        Rect m1316g3 = m1316g();
        int i19 = 0;
        while (true) {
            C0146d c0146d2 = f1877C;
            if (i19 >= size) {
                Rect rect7 = m1316g3;
                Rect rect8 = m1316g2;
                Rect rect9 = m1316g;
                rect9.setEmpty();
                c0146d2.mo403c(rect9);
                rect8.setEmpty();
                c0146d2.mo403c(rect8);
                rect7.setEmpty();
                c0146d2.mo403c(rect7);
                return;
            }
            View view = (View) arrayList3.get(i19);
            C1639d c1639d2 = (C1639d) view.getLayoutParams();
            if (i18 == 0 && view.getVisibility() == 8) {
                i4 = i18;
                i3 = layoutDirection;
                i2 = i19;
                rect3 = m1316g3;
                rect = m1316g2;
                rect2 = m1316g;
                arrayList = arrayList3;
                i6 = size;
            } else {
                int i20 = 0;
                while (i20 < i19) {
                    if (c1639d2.f9317l == ((View) arrayList3.get(i20))) {
                        C1639d c1639d3 = (C1639d) view.getLayoutParams();
                        if (c1639d3.f9316k != null) {
                            Rect m1316g4 = m1316g();
                            Rect m1316g5 = m1316g();
                            arrayList2 = arrayList3;
                            Rect m1316g6 = m1316g();
                            m1324k(c1639d3.f9316k, m1316g4);
                            m1322i(view, m1316g5, false);
                            i17 = size;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            c1639d = c1639d2;
                            c0146d = c0146d2;
                            i16 = i19;
                            i15 = layoutDirection;
                            rect4 = m1316g3;
                            rect5 = m1316g2;
                            rect6 = m1316g;
                            m1317l(layoutDirection, m1316g4, m1316g6, c1639d3, measuredWidth, measuredHeight);
                            boolean z3 = (m1316g6.left == m1316g5.left && m1316g6.top == m1316g5.top) ? false : true;
                            m1321h(c1639d3, m1316g6, measuredWidth, measuredHeight);
                            int i21 = m1316g6.left - m1316g5.left;
                            int i22 = m1316g6.top - m1316g5.top;
                            if (i21 != 0) {
                                WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                                view.offsetLeftAndRight(i21);
                            }
                            if (i22 != 0) {
                                WeakHashMap weakHashMap3 = AbstractC0169Q.f475a;
                                view.offsetTopAndBottom(i22);
                            }
                            if (z3 && (abstractC1636a = c1639d3.f9306a) != null) {
                                abstractC1636a.mo2024d(this, view, c1639d3.f9316k);
                            }
                            m1316g4.setEmpty();
                            c0146d.mo403c(m1316g4);
                            m1316g5.setEmpty();
                            c0146d.mo403c(m1316g5);
                            m1316g6.setEmpty();
                            c0146d.mo403c(m1316g6);
                            i20++;
                            c0146d2 = c0146d;
                            size = i17;
                            arrayList3 = arrayList2;
                            layoutDirection = i15;
                            c1639d2 = c1639d;
                            i19 = i16;
                            m1316g3 = rect4;
                            m1316g2 = rect5;
                            m1316g = rect6;
                        }
                    }
                    c1639d = c1639d2;
                    i15 = layoutDirection;
                    c0146d = c0146d2;
                    i16 = i19;
                    rect4 = m1316g3;
                    rect5 = m1316g2;
                    rect6 = m1316g;
                    arrayList2 = arrayList3;
                    i17 = size;
                    i20++;
                    c0146d2 = c0146d;
                    size = i17;
                    arrayList3 = arrayList2;
                    layoutDirection = i15;
                    c1639d2 = c1639d;
                    i19 = i16;
                    m1316g3 = rect4;
                    m1316g2 = rect5;
                    m1316g = rect6;
                }
                C1639d c1639d4 = c1639d2;
                int i23 = layoutDirection;
                C0145c c0145c = c0146d2;
                i2 = i19;
                Rect rect10 = m1316g3;
                rect = m1316g2;
                Rect rect11 = m1316g;
                ArrayList arrayList4 = arrayList3;
                int i24 = size;
                m1322i(view, rect, true);
                if (c1639d4.f9312g == 0 || rect.isEmpty()) {
                    i3 = i23;
                    rect2 = rect11;
                } else {
                    i3 = i23;
                    int absoluteGravity = Gravity.getAbsoluteGravity(c1639d4.f9312g, i3);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        rect2 = rect11;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i25 != 80) {
                        rect2 = rect11;
                    } else {
                        rect2 = rect11;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i26 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (c1639d4.f9313h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = AbstractC0169Q.f475a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C1639d c1639d5 = (C1639d) view.getLayoutParams();
                        AbstractC1636a abstractC1636a2 = c1639d5.f9306a;
                        Rect m1316g7 = m1316g();
                        Rect m1316g8 = m1316g();
                        m1316g8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC1636a2 == null || !abstractC1636a2.mo2096a(view)) {
                            m1316g7.set(m1316g8);
                        } else if (!m1316g8.contains(m1316g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m1316g7.toShortString() + " | Bounds:" + m1316g8.toShortString());
                        }
                        m1316g8.setEmpty();
                        c0145c.mo403c(m1316g8);
                        if (!m1316g7.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c1639d5.f9313h, i3);
                            if ((absoluteGravity2 & 48) != 48 || (i13 = (m1316g7.top - ((ViewGroup.MarginLayoutParams) c1639d5).topMargin) - c1639d5.f9315j) >= (i14 = rect2.top)) {
                                z2 = false;
                            } else {
                                m1320v(view, i14 - i13);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - m1316g7.bottom) - ((ViewGroup.MarginLayoutParams) c1639d5).bottomMargin) + c1639d5.f9315j) < (i12 = rect2.bottom)) {
                                m1320v(view, height - i12);
                                z2 = true;
                            }
                            if (z2) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                                m1320v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i10 = (m1316g7.left - ((ViewGroup.MarginLayoutParams) c1639d5).leftMargin) - c1639d5.f9314i) >= (i11 = rect2.left)) {
                                i8 = i7;
                            } else {
                                m1319u(view, i11 - i10);
                                i8 = 1;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - m1316g7.right) - ((ViewGroup.MarginLayoutParams) c1639d5).rightMargin) + c1639d5.f9314i) < (i9 = rect2.right)) {
                                m1319u(view, width - i9);
                                i8 = 1;
                            }
                            if (i8 == 0) {
                                m1319u(view, i7);
                            }
                            m1316g7.setEmpty();
                            c0145c.mo403c(m1316g7);
                            i4 = i;
                            if (i4 == 2) {
                                rect3 = rect10;
                                rect3.set(((C1639d) view.getLayoutParams()).f9320o);
                                if (rect3.equals(rect)) {
                                    i6 = i24;
                                    arrayList = arrayList4;
                                } else {
                                    ((C1639d) view.getLayoutParams()).f9320o.set(rect);
                                }
                            } else {
                                rect3 = rect10;
                            }
                            i5 = i2 + 1;
                            i6 = i24;
                            while (true) {
                                arrayList = arrayList4;
                                if (i5 < i6) {
                                    break;
                                }
                                View view2 = (View) arrayList.get(i5);
                                AbstractC1636a abstractC1636a3 = ((C1639d) view2.getLayoutParams()).f9306a;
                                if (abstractC1636a3 != null) {
                                    abstractC1636a3.mo2023b(view2);
                                }
                                i5++;
                                arrayList4 = arrayList;
                            }
                        } else {
                            m1316g7.setEmpty();
                            c0145c.mo403c(m1316g7);
                        }
                    }
                }
                i4 = i;
                if (i4 == 2) {
                }
                i5 = i2 + 1;
                i6 = i24;
                while (true) {
                    arrayList = arrayList4;
                    if (i5 < i6) {
                    }
                    i5++;
                    arrayList4 = arrayList;
                }
            }
            size = i6;
            i19 = i2 + 1;
            m1316g2 = rect;
            i18 = i4;
            m1316g3 = rect3;
            arrayList3 = arrayList;
            m1316g = rect2;
            layoutDirection = i3;
        }
    }

    /* renamed from: q */
    public final void m1328q(View view, int i) {
        Rect m1316g;
        Rect m1316g2;
        C1639d c1639d = (C1639d) view.getLayoutParams();
        View view2 = c1639d.f9316k;
        if (view2 == null && c1639d.f9311f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0146d c0146d = f1877C;
        if (view2 != null) {
            m1316g = m1316g();
            m1316g2 = m1316g();
            try {
                m1324k(view2, m1316g);
                C1639d c1639d2 = (C1639d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1317l(i, m1316g, m1316g2, c1639d2, measuredWidth, measuredHeight);
                m1321h(c1639d2, m1316g2, measuredWidth, measuredHeight);
                view.layout(m1316g2.left, m1316g2.top, m1316g2.right, m1316g2.bottom);
                return;
            } finally {
                m1316g.setEmpty();
                c0146d.mo403c(m1316g);
                m1316g2.setEmpty();
                c0146d.mo403c(m1316g2);
            }
        }
        int i2 = c1639d.f9310e;
        if (i2 < 0) {
            C1639d c1639d3 = (C1639d) view.getLayoutParams();
            m1316g = m1316g();
            m1316g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1639d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1639d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1639d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1639d3).bottomMargin);
            if (this.f1893s != null) {
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    m1316g.left = this.f1893s.m682b() + m1316g.left;
                    m1316g.top = this.f1893s.m684d() + m1316g.top;
                    m1316g.right -= this.f1893s.m683c();
                    m1316g.bottom -= this.f1893s.m681a();
                }
            }
            m1316g2 = m1316g();
            int i3 = c1639d3.f9308c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), m1316g, m1316g2, i);
            view.layout(m1316g2.left, m1316g2.top, m1316g2.right, m1316g2.bottom);
            return;
        }
        C1639d c1639d4 = (C1639d) view.getLayoutParams();
        int i4 = c1639d4.f9308c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int m1325m = m1325m(i2) - measuredWidth2;
        if (i5 == 1) {
            m1325m += measuredWidth2 / 2;
        } else if (i5 == 5) {
            m1325m += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1639d4).leftMargin, Math.min(m1325m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1639d4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1639d4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1639d4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    /* renamed from: r */
    public final boolean m1329r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1882h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C0295l c0295l = f1876B;
        if (c0295l != null) {
            Collections.sort(arrayList, c0295l);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC1636a abstractC1636a = ((C1639d) view.getLayoutParams()).f9306a;
            if (z2 && actionMasked != 0) {
                if (abstractC1636a != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC1636a.mo2013f(this, view, motionEvent2);
                    } else if (i == 1) {
                        abstractC1636a.mo2021q(view, motionEvent2);
                    }
                }
            } else if (!z2 && abstractC1636a != null) {
                if (i == 0) {
                    z2 = abstractC1636a.mo2013f(this, view, motionEvent);
                } else if (i == 1) {
                    z2 = abstractC1636a.mo2021q(view, motionEvent);
                }
                if (z2) {
                    this.f1889o = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC1636a abstractC1636a = ((C1639d) view.getLayoutParams()).f9306a;
        if (abstractC1636a != null) {
            abstractC1636a.mo2025l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1886l) {
            return;
        }
        m1331t(false);
        this.f1886l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1330s() {
        C0145c c0145c;
        ArrayList arrayList = this.f1880f;
        arrayList.clear();
        C0326t c0326t = this.f1881g;
        C1201k c1201k = (C1201k) c0326t.f924b;
        int i = c1201k.f5418c;
        int i2 = 0;
        while (true) {
            c0145c = (C0145c) c0326t.f923a;
            if (i2 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) c1201k.m2873j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                c0145c.mo403c(arrayList2);
            }
            i2++;
        }
        c1201k.clear();
        int childCount = getChildCount();
        int i3 = 0;
        loop1: while (true) {
            C1201k c1201k2 = (C1201k) c0326t.f924b;
            if (i3 >= childCount) {
                ArrayList arrayList3 = (ArrayList) c0326t.f925c;
                arrayList3.clear();
                HashSet hashSet = (HashSet) c0326t.f926d;
                hashSet.clear();
                int i4 = c1201k2.f5418c;
                for (int i5 = 0; i5 < i4; i5++) {
                    c0326t.m909b(c1201k2.m2871h(i5), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i3);
            C1639d m1318n = m1318n(childAt);
            int i6 = m1318n.f9311f;
            if (i6 == -1) {
                m1318n.f9317l = null;
                m1318n.f9316k = null;
            } else {
                View view = m1318n.f9316k;
                if (view != null && view.getId() == i6) {
                    View view2 = m1318n.f9316k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            m1318n.f9317l = null;
                            m1318n.f9316k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    m1318n.f9317l = view2;
                }
                View findViewById = findViewById(i6);
                m1318n.f9316k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i6) + " to anchor view " + childAt);
                    }
                    m1318n.f9317l = null;
                    m1318n.f9316k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            m1318n.f9317l = null;
                            m1318n.f9316k = null;
                        }
                    }
                    m1318n.f9317l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    m1318n.f9317l = null;
                    m1318n.f9316k = null;
                }
            }
            if (!c1201k2.containsKey(childAt)) {
                c1201k2.put(childAt, null);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i3) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != m1318n.f9317l) {
                        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C1639d) childAt2.getLayoutParams()).f9312g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(m1318n.f9313h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC1636a abstractC1636a = m1318n.f9306a;
                            if (abstractC1636a != null) {
                                abstractC1636a.mo2023b(childAt);
                            }
                        }
                    }
                    if (!c1201k2.containsKey(childAt2) && !c1201k2.containsKey(childAt2)) {
                        c1201k2.put(childAt2, null);
                    }
                    if (!c1201k2.containsKey(childAt2) || !c1201k2.containsKey(childAt)) {
                        break loop1;
                    }
                    ArrayList arrayList4 = (ArrayList) c1201k2.getOrDefault(childAt2, null);
                    if (arrayList4 == null) {
                        arrayList4 = (ArrayList) c0145c.mo401a();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        c1201k2.put(childAt2, arrayList4);
                    }
                    arrayList4.add(childAt);
                }
            }
            i3++;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m1332w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1896v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1895u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1895u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1895u.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1895u;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                AbstractC0071b.m209b(drawable3, getLayoutDirection());
                this.f1895u.setVisible(getVisibility() == 0, false);
                this.f1895u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? AbstractC0000a.m1b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f1895u;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1895u.setVisible(z2, false);
    }

    /* renamed from: t */
    public final void m1331t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC1636a abstractC1636a = ((C1639d) childAt.getLayoutParams()).f9306a;
            if (abstractC1636a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC1636a.mo2013f(this, childAt, obtain);
                } else {
                    abstractC1636a.mo2021q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C1639d) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f1889o = null;
        this.f1886l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1895u;
    }

    /* renamed from: w */
    public final void m1332w() {
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (!getFitsSystemWindows()) {
            AbstractC0158F.m440u(this, null);
            return;
        }
        if (this.f1897w == null) {
            this.f1897w = new C1315f1(this);
        }
        AbstractC0158F.m440u(this, this.f1897w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1639d ? new C1639d((C1639d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1639d((ViewGroup.MarginLayoutParams) layoutParams) : new C1639d(layoutParams);
    }
}
