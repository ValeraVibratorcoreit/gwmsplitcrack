package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.altaysoft.t500_split.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p006C.AbstractC0062j;
import p010D1.AbstractC0088l;
import p017H0.C0126e;
import p017H0.C0129h;
import p022K.AbstractC0158F;
import p022K.AbstractC0163K;
import p022K.AbstractC0169Q;
import p024L.C0235e;
import p026M.AbstractC0256a;
import p036S.C0305e;
import p045W0.C0351a;
import p045W0.C0357g;
import p045W0.C0360j;
import p045W0.C0361k;
import p047X0.C0428a;
import p047X0.C0429b;
import p047X0.C0430c;
import p117x.AbstractC1636a;
import p117x.C1639d;
import p121y0.AbstractC1680h;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC1636a {

    /* renamed from: a */
    public AbstractC0088l f3576a;

    /* renamed from: b */
    public final C0357g f3577b;

    /* renamed from: c */
    public final ColorStateList f3578c;

    /* renamed from: d */
    public final C0361k f3579d;

    /* renamed from: e */
    public final C0129h f3580e;

    /* renamed from: f */
    public final float f3581f;

    /* renamed from: g */
    public final boolean f3582g;

    /* renamed from: h */
    public int f3583h;

    /* renamed from: i */
    public C0305e f3584i;

    /* renamed from: j */
    public boolean f3585j;

    /* renamed from: k */
    public final float f3586k;

    /* renamed from: l */
    public int f3587l;

    /* renamed from: m */
    public int f3588m;

    /* renamed from: n */
    public int f3589n;

    /* renamed from: o */
    public int f3590o;

    /* renamed from: p */
    public WeakReference f3591p;

    /* renamed from: q */
    public WeakReference f3592q;

    /* renamed from: r */
    public final int f3593r;

    /* renamed from: s */
    public VelocityTracker f3594s;

    /* renamed from: t */
    public int f3595t;

    /* renamed from: u */
    public final LinkedHashSet f3596u;

    /* renamed from: v */
    public final C0126e f3597v;

    public SideSheetBehavior() {
        this.f3580e = new C0129h(this);
        this.f3582g = true;
        this.f3583h = 5;
        this.f3586k = 0.1f;
        this.f3593r = -1;
        this.f3596u = new LinkedHashSet();
        this.f3597v = new C0126e(this, 1);
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: c */
    public final void mo2039c(C1639d c1639d) {
        this.f3591p = null;
        this.f3584i = null;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: e */
    public final void mo2040e() {
        this.f3591p = null;
        this.f3584i = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (p022K.AbstractC0163K.m473b(r4) != null) goto L6;
     */
    @Override // p117x.AbstractC1636a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2013f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0305e c0305e;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        }
        if (this.f3582g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f3594s) != null) {
                velocityTracker.recycle();
                this.f3594s = null;
            }
            if (this.f3594s == null) {
                this.f3594s = VelocityTracker.obtain();
            }
            this.f3594s.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.f3595t = (int) motionEvent.getX();
            } else if ((actionMasked == 1 || actionMasked == 3) && this.f3585j) {
                this.f3585j = false;
                return false;
            }
            return (this.f3585j || (c0305e = this.f3584i) == null || !c0305e.m872p(motionEvent)) ? false : true;
        }
        this.f3585j = true;
        return false;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: g */
    public final boolean mo215g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        C0357g c0357g = this.f3577b;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f3591p == null) {
            this.f3591p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC1680h.m4852N(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0256a.m775b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC1680h.m4851M(context, R.attr.motionDurationMedium2, 300);
            AbstractC1680h.m4851M(context, R.attr.motionDurationShort3, 150);
            AbstractC1680h.m4851M(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c0357g != null) {
                view.setBackground(c0357g);
                float f2 = this.f3581f;
                if (f2 == -1.0f) {
                    f2 = AbstractC0158F.m428i(view);
                }
                c0357g.m957j(f2);
            } else {
                ColorStateList colorStateList = this.f3578c;
                if (colorStateList != null) {
                    AbstractC0158F.m436q(view, colorStateList);
                }
            }
            int i5 = this.f3583h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            m2100u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0163K.m473b(view) == null) {
                AbstractC0169Q.m506k(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C1639d) view.getLayoutParams()).f9308c, i) == 3 ? 1 : 0;
        AbstractC0088l abstractC0088l = this.f3576a;
        if (abstractC0088l == null || abstractC0088l.mo291N() != i6) {
            C0361k c0361k = this.f3579d;
            C1639d c1639d = null;
            if (i6 == 0) {
                this.f3576a = new C0428a(this, i4);
                if (c0361k != null) {
                    WeakReference weakReference = this.f3591p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C1639d)) {
                        c1639d = (C1639d) view3.getLayoutParams();
                    }
                    if (c1639d == null || ((ViewGroup.MarginLayoutParams) c1639d).rightMargin <= 0) {
                        C0360j m968e = c0361k.m968e();
                        m968e.f1053f = new C0351a(0.0f);
                        m968e.f1054g = new C0351a(0.0f);
                        C0361k m963a = m968e.m963a();
                        if (c0357g != null) {
                            c0357g.setShapeAppearanceModel(m963a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f3576a = new C0428a(this, i3);
                if (c0361k != null) {
                    WeakReference weakReference2 = this.f3591p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C1639d)) {
                        c1639d = (C1639d) view2.getLayoutParams();
                    }
                    if (c1639d == null || ((ViewGroup.MarginLayoutParams) c1639d).leftMargin <= 0) {
                        C0360j m968e2 = c0361k.m968e();
                        m968e2.f1052e = new C0351a(0.0f);
                        m968e2.f1055h = new C0351a(0.0f);
                        C0361k m963a2 = m968e2.m963a();
                        if (c0357g != null) {
                            c0357g.setShapeAppearanceModel(m963a2);
                        }
                    }
                }
            }
        }
        if (this.f3584i == null) {
            this.f3584i = new C0305e(coordinatorLayout.getContext(), coordinatorLayout, this.f3597v);
        }
        int mo289L = this.f3576a.mo289L(view);
        coordinatorLayout.m1328q(view, i);
        this.f3588m = coordinatorLayout.getWidth();
        this.f3589n = this.f3576a.mo290M(coordinatorLayout);
        this.f3587l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f3590o = marginLayoutParams != null ? this.f3576a.mo307j(marginLayoutParams) : 0;
        int i7 = this.f3583h;
        if (i7 == 1 || i7 == 2) {
            i3 = mo289L - this.f3576a.mo289L(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f3583h);
            }
            i3 = this.f3576a.mo286I();
        }
        view.offsetLeftAndRight(i3);
        if (this.f3592q == null && (i2 = this.f3593r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f3592q = new WeakReference(findViewById);
        }
        Iterator it = this.f3596u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: h */
    public final boolean mo2014h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: m */
    public final void mo2017m(View view, Parcelable parcelable) {
        int i = ((C0430c) parcelable).f1393c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f3583h = i;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: n */
    public final Parcelable mo2018n(View view) {
        return new C0430c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: q */
    public final boolean mo2021q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3583h == 1 && actionMasked == 0) {
            return true;
        }
        if (m2098s()) {
            this.f3584i.m866j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3594s) != null) {
            velocityTracker.recycle();
            this.f3594s = null;
        }
        if (this.f3594s == null) {
            this.f3594s = VelocityTracker.obtain();
        }
        this.f3594s.addMovement(motionEvent);
        if (m2098s() && actionMasked == 2 && !this.f3585j && m2098s()) {
            float abs = Math.abs(this.f3595t - motionEvent.getX());
            C0305e c0305e = this.f3584i;
            if (abs > c0305e.f855b) {
                c0305e.m858b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3585j;
    }

    /* renamed from: r */
    public final void m2097r(int i) {
        View view;
        if (this.f3583h == i) {
            return;
        }
        this.f3583h = i;
        WeakReference weakReference = this.f3591p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f3583h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f3596u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m2100u();
    }

    /* renamed from: s */
    public final boolean m2098s() {
        return this.f3584i != null && (this.f3582g || this.f3583h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.m871o(r0, r4.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        m2097r(2);
        r2.f3580e.m385a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r4 != false) goto L24;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2099t(int i, View view, boolean z2) {
        int mo284G;
        if (i == 3) {
            mo284G = this.f3576a.mo284G();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC0062j.m156j(i, "Invalid state to get outer edge offset: "));
            }
            mo284G = this.f3576a.mo286I();
        }
        C0305e c0305e = this.f3584i;
        if (c0305e != null) {
            if (!z2) {
                int top = view.getTop();
                c0305e.f871r = view;
                c0305e.f856c = -1;
                boolean m864h = c0305e.m864h(mo284G, top, 0, 0);
                if (!m864h && c0305e.f854a == 0 && c0305e.f871r != null) {
                    c0305e.f871r = null;
                }
            }
        }
        m2097r(i);
    }

    /* renamed from: u */
    public final void m2100u() {
        View view;
        WeakReference weakReference = this.f3591p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0169Q.m502g(view, 262144);
        AbstractC0169Q.m500e(view, 0);
        AbstractC0169Q.m502g(view, 1048576);
        AbstractC0169Q.m500e(view, 0);
        int i = 5;
        if (this.f3583h != 5) {
            AbstractC0169Q.m503h(view, C0235e.f619j, new C0429b(this, i));
        }
        int i2 = 3;
        if (this.f3583h != 3) {
            AbstractC0169Q.m503h(view, C0235e.f617h, new C0429b(this, i2));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f3580e = new C0129h(this);
        this.f3582g = true;
        this.f3583h = 5;
        this.f3586k = 0.1f;
        this.f3593r = -1;
        this.f3596u = new LinkedHashSet();
        this.f3597v = new C0126e(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f189x);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3578c = AbstractC0088l.m255B(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f3579d = C0361k.m965b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m963a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f3593r = resourceId;
            WeakReference weakReference = this.f3592q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3592q = null;
            WeakReference weakReference2 = this.f3591p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C0361k c0361k = this.f3579d;
        if (c0361k != null) {
            C0357g c0357g = new C0357g(c0361k);
            this.f3577b = c0357g;
            c0357g.m956i(context);
            ColorStateList colorStateList = this.f3578c;
            if (colorStateList != null) {
                this.f3577b.m958k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3577b.setTint(typedValue.data);
            }
        }
        this.f3581f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f3582g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
