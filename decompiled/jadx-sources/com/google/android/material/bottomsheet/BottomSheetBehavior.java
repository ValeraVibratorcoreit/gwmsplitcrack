package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.altaysoft.t500_split.R;
import com.jcraft.jsch.SftpATTRS;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p003B.C0043j;
import p004B0.AbstractC0051a;
import p006C.AbstractC0062j;
import p010D1.AbstractC0088l;
import p016H.C0117i;
import p017H0.C0124c;
import p017H0.C0125d;
import p017H0.C0126e;
import p017H0.C0128g;
import p017H0.C0129h;
import p017H0.RunnableC0123b;
import p022K.AbstractC0156D;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.C0178a;
import p022K.C0180b;
import p022K.C0184d;
import p022K.C0185d0;
import p022K.C0189f0;
import p022K.ViewOnApplyWindowInsetsListenerC0183c0;
import p024L.C0235e;
import p026M.AbstractC0256a;
import p034Q0.C0298o;
import p034Q0.ViewOnAttachStateChangeListenerC0297n;
import p036S.C0305e;
import p045W0.C0356f;
import p045W0.C0357g;
import p045W0.C0361k;
import p117x.AbstractC1636a;
import p117x.C1639d;
import p121y0.AbstractC1680h;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC1636a {

    /* renamed from: A */
    public final C0129h f3364A;

    /* renamed from: B */
    public final ValueAnimator f3365B;

    /* renamed from: C */
    public final int f3366C;

    /* renamed from: D */
    public int f3367D;

    /* renamed from: E */
    public int f3368E;

    /* renamed from: F */
    public final float f3369F;

    /* renamed from: G */
    public int f3370G;

    /* renamed from: H */
    public final float f3371H;

    /* renamed from: I */
    public boolean f3372I;

    /* renamed from: J */
    public boolean f3373J;

    /* renamed from: K */
    public final boolean f3374K;

    /* renamed from: L */
    public int f3375L;

    /* renamed from: M */
    public C0305e f3376M;

    /* renamed from: N */
    public boolean f3377N;

    /* renamed from: O */
    public int f3378O;

    /* renamed from: P */
    public boolean f3379P;

    /* renamed from: Q */
    public final float f3380Q;

    /* renamed from: R */
    public int f3381R;

    /* renamed from: S */
    public int f3382S;

    /* renamed from: T */
    public int f3383T;

    /* renamed from: U */
    public WeakReference f3384U;

    /* renamed from: V */
    public WeakReference f3385V;

    /* renamed from: W */
    public final ArrayList f3386W;

    /* renamed from: X */
    public VelocityTracker f3387X;

    /* renamed from: Y */
    public int f3388Y;

    /* renamed from: Z */
    public int f3389Z;

    /* renamed from: a */
    public final int f3390a;

    /* renamed from: a0 */
    public boolean f3391a0;

    /* renamed from: b */
    public boolean f3392b;

    /* renamed from: b0 */
    public HashMap f3393b0;

    /* renamed from: c */
    public final float f3394c;

    /* renamed from: c0 */
    public final SparseIntArray f3395c0;

    /* renamed from: d */
    public final int f3396d;

    /* renamed from: d0 */
    public final C0126e f3397d0;

    /* renamed from: e */
    public int f3398e;

    /* renamed from: f */
    public boolean f3399f;

    /* renamed from: g */
    public int f3400g;

    /* renamed from: h */
    public final int f3401h;

    /* renamed from: i */
    public final C0357g f3402i;

    /* renamed from: j */
    public final ColorStateList f3403j;

    /* renamed from: k */
    public final int f3404k;

    /* renamed from: l */
    public final int f3405l;

    /* renamed from: m */
    public int f3406m;

    /* renamed from: n */
    public final boolean f3407n;

    /* renamed from: o */
    public final boolean f3408o;

    /* renamed from: p */
    public final boolean f3409p;

    /* renamed from: q */
    public final boolean f3410q;

    /* renamed from: r */
    public final boolean f3411r;

    /* renamed from: s */
    public final boolean f3412s;

    /* renamed from: t */
    public final boolean f3413t;

    /* renamed from: u */
    public final boolean f3414u;

    /* renamed from: v */
    public int f3415v;

    /* renamed from: w */
    public int f3416w;

    /* renamed from: x */
    public final boolean f3417x;

    /* renamed from: y */
    public final C0361k f3418y;

    /* renamed from: z */
    public boolean f3419z;

    public BottomSheetBehavior() {
        this.f3390a = 0;
        this.f3392b = true;
        this.f3404k = -1;
        this.f3405l = -1;
        this.f3364A = new C0129h(this);
        this.f3369F = 0.5f;
        this.f3371H = -1.0f;
        this.f3374K = true;
        this.f3375L = 4;
        this.f3380Q = 0.1f;
        this.f3386W = new ArrayList();
        this.f3389Z = -1;
        this.f3395c0 = new SparseIntArray();
        this.f3397d0 = new C0126e(this, 0);
    }

    /* renamed from: v */
    public static View m2028v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (AbstractC0158F.m435p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m2028v = m2028v(viewGroup.getChildAt(i));
                if (m2028v != null) {
                    return m2028v;
                }
            }
        }
        return null;
    }

    /* renamed from: w */
    public static int m2029w(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
    }

    /* renamed from: A */
    public final void m2030A(int i) {
        if (i == -1) {
            if (this.f3399f) {
                return;
            } else {
                this.f3399f = true;
            }
        } else {
            if (!this.f3399f && this.f3398e == i) {
                return;
            }
            this.f3399f = false;
            this.f3398e = Math.max(0, i);
        }
        m2038I();
    }

    /* renamed from: B */
    public final void m2031B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0062j.m162p(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f3372I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f3392b && m2047y(i) <= this.f3367D) ? 3 : i;
        WeakReference weakReference = this.f3384U;
        if (weakReference == null || weakReference.get() == null) {
            m2032C(i);
            return;
        }
        View view = (View) this.f3384U.get();
        RunnableC0123b runnableC0123b = new RunnableC0123b(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0123b);
                return;
            }
        }
        runnableC0123b.run();
    }

    /* renamed from: C */
    public final void m2032C(int i) {
        if (this.f3375L == i) {
            return;
        }
        this.f3375L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f3372I;
        }
        WeakReference weakReference = this.f3384U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m2037H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m2037H(false);
        }
        m2036G(i, true);
        ArrayList arrayList = this.f3386W;
        if (arrayList.size() <= 0) {
            m2035F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: D */
    public final boolean m2033D(View view, float f2) {
        if (this.f3373J) {
            return true;
        }
        if (view.getTop() < this.f3370G) {
            return false;
        }
        return Math.abs(((f2 * this.f3380Q) + ((float) view.getTop())) - ((float) this.f3370G)) / ((float) m2044t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.m871o(r4.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        m2032C(2);
        m2036G(r3, true);
        r2.f3364A.m385a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2034E(int i, View view, boolean z2) {
        int m2047y = m2047y(i);
        C0305e c0305e = this.f3376M;
        if (c0305e != null) {
            if (!z2) {
                int left = view.getLeft();
                c0305e.f871r = view;
                c0305e.f856c = -1;
                boolean m864h = c0305e.m864h(left, m2047y, 0, 0);
                if (!m864h && c0305e.f854a == 0 && c0305e.f871r != null) {
                    c0305e.f871r = null;
                }
            }
        }
        m2032C(i);
    }

    /* renamed from: F */
    public final void m2035F() {
        View view;
        int i;
        WeakReference weakReference = this.f3384U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0169Q.m502g(view, 524288);
        AbstractC0169Q.m500e(view, 0);
        AbstractC0169Q.m502g(view, 262144);
        AbstractC0169Q.m500e(view, 0);
        AbstractC0169Q.m502g(view, 1048576);
        AbstractC0169Q.m500e(view, 0);
        SparseIntArray sparseIntArray = this.f3395c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            AbstractC0169Q.m502g(view, i2);
            AbstractC0169Q.m500e(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f3392b && this.f3375L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0117i c0117i = new C0117i(this, 6);
            ArrayList m498c = AbstractC0169Q.m498c(view);
            int i3 = 0;
            while (true) {
                if (i3 >= m498c.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = AbstractC0169Q.f478d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < m498c.size(); i7++) {
                            z2 &= ((C0235e) m498c.get(i7)).m701a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0235e) m498c.get(i3)).f622a).getLabel())) {
                        i = ((C0235e) m498c.get(i3)).m701a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                C0235e c0235e = new C0235e(null, i, string, c0117i, null);
                View.AccessibilityDelegate m497b = AbstractC0169Q.m497b(view);
                C0180b c0180b = m497b == null ? null : m497b instanceof C0178a ? ((C0178a) m497b).f484a : new C0180b(m497b);
                if (c0180b == null) {
                    c0180b = new C0180b();
                }
                AbstractC0169Q.m505j(view, c0180b);
                AbstractC0169Q.m502g(view, c0235e.m701a());
                AbstractC0169Q.m498c(view).add(c0235e);
                AbstractC0169Q.m500e(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f3372I && this.f3375L != 5) {
            AbstractC0169Q.m503h(view, C0235e.f619j, new C0117i(this, 5));
        }
        int i8 = this.f3375L;
        if (i8 == 3) {
            AbstractC0169Q.m503h(view, C0235e.f618i, new C0117i(this, this.f3392b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            AbstractC0169Q.m503h(view, C0235e.f617h, new C0117i(this, this.f3392b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            AbstractC0169Q.m503h(view, C0235e.f618i, new C0117i(this, 4));
            AbstractC0169Q.m503h(view, C0235e.f617h, new C0117i(this, 3));
        }
    }

    /* renamed from: G */
    public final void m2036G(int i, boolean z2) {
        C0357g c0357g = this.f3402i;
        ValueAnimator valueAnimator = this.f3365B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f3375L == 3 && (this.f3417x || m2048z());
        if (this.f3419z == z3 || c0357g == null) {
            return;
        }
        this.f3419z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0357g.f1026f.f1016i, z3 ? m2043s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float m2043s = this.f3419z ? m2043s() : 1.0f;
        C0356f c0356f = c0357g.f1026f;
        if (c0356f.f1016i != m2043s) {
            c0356f.f1016i = m2043s;
            c0357g.f1030j = true;
            c0357g.invalidateSelf();
        }
    }

    /* renamed from: H */
    public final void m2037H(boolean z2) {
        WeakReference weakReference = this.f3384U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f3393b0 != null) {
                    return;
                } else {
                    this.f3393b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f3384U.get() && z2) {
                    this.f3393b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f3393b0 = null;
        }
    }

    /* renamed from: I */
    public final void m2038I() {
        View view;
        if (this.f3384U != null) {
            m2042r();
            if (this.f3375L != 4 || (view = (View) this.f3384U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: c */
    public final void mo2039c(C1639d c1639d) {
        this.f3384U = null;
        this.f3376M = null;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: e */
    public final void mo2040e() {
        this.f3384U = null;
        this.f3376M = null;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: f */
    public final boolean mo2013f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C0305e c0305e;
        if (!view.isShown() || !this.f3374K) {
            this.f3377N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3388Y = -1;
            this.f3389Z = -1;
            VelocityTracker velocityTracker = this.f3387X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3387X = null;
            }
        }
        if (this.f3387X == null) {
            this.f3387X = VelocityTracker.obtain();
        }
        this.f3387X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f3389Z = (int) motionEvent.getY();
            if (this.f3375L != 2) {
                WeakReference weakReference = this.f3385V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m1326o(view2, x2, this.f3389Z)) {
                    this.f3388Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f3391a0 = true;
                }
            }
            this.f3377N = this.f3388Y == -1 && !coordinatorLayout.m1326o(view, x2, this.f3389Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3391a0 = false;
            this.f3388Y = -1;
            if (this.f3377N) {
                this.f3377N = false;
                return false;
            }
        }
        if (!this.f3377N && (c0305e = this.f3376M) != null && c0305e.m872p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f3385V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f3377N || this.f3375L == 1 || coordinatorLayout.m1326o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f3376M == null || (i = this.f3389Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f3376M.f855b)) ? false : true;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: g */
    public final boolean mo215g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f3405l;
        C0357g c0357g = this.f3402i;
        int i3 = 3;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f3384U == null) {
            this.f3400g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f3407n || this.f3399f) ? false : true;
            if (this.f3408o || this.f3409p || this.f3410q || this.f3412s || this.f3413t || this.f3414u || z2) {
                C0125d c0125d = new C0125d(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0298o c0298o = new C0298o();
                c0298o.f829a = paddingStart;
                c0298o.f830b = paddingEnd;
                c0298o.f831c = paddingBottom;
                AbstractC0158F.m440u(view, new C0043j(c0125d, i3, c0298o));
                if (view.isAttachedToWindow()) {
                    AbstractC0156D.m419c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0297n());
                }
            }
            C0184d c0184d = new C0184d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new C0189f0(c0184d));
            } else {
                PathInterpolator pathInterpolator = C0185d0.f504e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0183c0 = new ViewOnApplyWindowInsetsListenerC0183c0(view, c0184d);
                view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0183c0);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0183c0);
                }
            }
            this.f3384U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC1680h.m4852N(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0256a.m775b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC1680h.m4851M(context, R.attr.motionDurationMedium2, 300);
            AbstractC1680h.m4851M(context, R.attr.motionDurationShort3, 150);
            AbstractC1680h.m4851M(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (c0357g != null) {
                view.setBackground(c0357g);
                float f2 = this.f3371H;
                if (f2 == -1.0f) {
                    f2 = AbstractC0158F.m428i(view);
                }
                c0357g.m957j(f2);
            } else {
                ColorStateList colorStateList = this.f3403j;
                if (colorStateList != null) {
                    AbstractC0158F.m436q(view, colorStateList);
                }
            }
            m2035F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f3376M == null) {
            this.f3376M = new C0305e(coordinatorLayout.getContext(), coordinatorLayout, this.f3397d0);
        }
        int top = view.getTop();
        coordinatorLayout.m1328q(view, i);
        this.f3382S = coordinatorLayout.getWidth();
        this.f3383T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f3381R = height;
        int i5 = this.f3383T;
        int i6 = i5 - height;
        int i7 = this.f3416w;
        if (i6 < i7) {
            if (this.f3411r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f3381R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f3381R = i8;
            }
        }
        this.f3367D = Math.max(0, this.f3383T - this.f3381R);
        this.f3368E = (int) ((1.0f - this.f3369F) * this.f3383T);
        m2042r();
        int i9 = this.f3375L;
        if (i9 == 3) {
            view.offsetTopAndBottom(m2046x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f3368E);
        } else if (this.f3372I && i9 == 5) {
            view.offsetTopAndBottom(this.f3383T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f3370G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m2036G(this.f3375L, false);
        this.f3385V = new WeakReference(m2028v(view));
        ArrayList arrayList = this.f3386W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: h */
    public final boolean mo2014h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m2029w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f3404k, marginLayoutParams.width), m2029w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f3405l, marginLayoutParams.height));
        return true;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: i */
    public final boolean mo2041i(View view) {
        WeakReference weakReference = this.f3385V;
        return (weakReference == null || view != weakReference.get() || this.f3375L == 3) ? false : true;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: j */
    public final void mo2015j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f3374K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f3385V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < m2046x()) {
                int m2046x = top - m2046x();
                iArr[1] = m2046x;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                view.offsetTopAndBottom(-m2046x);
                m2032C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                view.offsetTopAndBottom(-i2);
                m2032C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f3370G;
            if (i4 > i5 && !this.f3372I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = AbstractC0169Q.f475a;
                view.offsetTopAndBottom(-i6);
                m2032C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = AbstractC0169Q.f475a;
                view.offsetTopAndBottom(-i2);
                m2032C(1);
            }
        }
        m2045u(view.getTop());
        this.f3378O = i2;
        this.f3379P = true;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: k */
    public final void mo2016k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: m */
    public final void mo2017m(View view, Parcelable parcelable) {
        C0128g c0128g = (C0128g) parcelable;
        int i = this.f3390a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f3398e = c0128g.f392d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f3392b = c0128g.f393e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f3372I = c0128g.f394f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f3373J = c0128g.f395g;
            }
        }
        int i2 = c0128g.f391c;
        if (i2 == 1 || i2 == 2) {
            this.f3375L = 4;
        } else {
            this.f3375L = i2;
        }
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: n */
    public final Parcelable mo2018n(View view) {
        return new C0128g(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: o */
    public final boolean mo2019o(View view, int i, int i2) {
        this.f3378O = 0;
        this.f3379P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f3368E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f3367D) < java.lang.Math.abs(r5 - r3.f3370G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f3370G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f3370G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f3368E) < java.lang.Math.abs(r5 - r3.f3370G)) goto L50;
     */
    @Override // p117x.AbstractC1636a
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2020p(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == m2046x()) {
            m2032C(3);
            return;
        }
        WeakReference weakReference = this.f3385V;
        if (weakReference != null && view2 == weakReference.get() && this.f3379P) {
            if (this.f3378O > 0) {
                if (!this.f3392b) {
                }
                m2034E(i2, view, false);
                this.f3379P = false;
            }
            if (this.f3372I) {
                VelocityTracker velocityTracker = this.f3387X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f3394c);
                    yVelocity = this.f3387X.getYVelocity(this.f3388Y);
                }
                if (m2033D(view, yVelocity)) {
                    i2 = 5;
                    m2034E(i2, view, false);
                    this.f3379P = false;
                }
            }
            if (this.f3378O == 0) {
                int top = view.getTop();
                if (!this.f3392b) {
                    int i3 = this.f3368E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f3392b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            m2034E(i2, view, false);
            this.f3379P = false;
        }
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: q */
    public final boolean mo2021q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3375L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C0305e c0305e = this.f3376M;
        if (c0305e != null && (this.f3374K || i == 1)) {
            c0305e.m866j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3388Y = -1;
            this.f3389Z = -1;
            VelocityTracker velocityTracker = this.f3387X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3387X = null;
            }
        }
        if (this.f3387X == null) {
            this.f3387X = VelocityTracker.obtain();
        }
        this.f3387X.addMovement(motionEvent);
        if (this.f3376M != null && ((this.f3374K || this.f3375L == 1) && actionMasked == 2 && !this.f3377N)) {
            float abs = Math.abs(this.f3389Z - motionEvent.getY());
            C0305e c0305e2 = this.f3376M;
            if (abs > c0305e2.f855b) {
                c0305e2.m858b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3377N;
    }

    /* renamed from: r */
    public final void m2042r() {
        int m2044t = m2044t();
        if (this.f3392b) {
            this.f3370G = Math.max(this.f3383T - m2044t, this.f3367D);
        } else {
            this.f3370G = this.f3383T - m2044t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m2043s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f2;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f3 = 0.0f;
        if (this.f3402i != null && (weakReference = this.f3384U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f3384U.get();
            if (m2048z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C0357g c0357g = this.f3402i;
                float mo939a = c0357g.f1026f.f1008a.f1064e.mo939a(c0357g.m954g());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > 0.0f && mo939a > 0.0f) {
                        f2 = f4 / mo939a;
                        C0357g c0357g2 = this.f3402i;
                        float mo939a2 = c0357g2.f1026f.f1008a.f1065f.mo939a(c0357g2.m954g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f5 = radius;
                            if (f5 > 0.0f && mo939a2 > 0.0f) {
                                f3 = f5 / mo939a2;
                            }
                        }
                        return Math.max(f2, f3);
                    }
                }
                f2 = 0.0f;
                C0357g c0357g22 = this.f3402i;
                float mo939a22 = c0357g22.f1026f.f1008a.f1065f.mo939a(c0357g22.m954g());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f3);
            }
        }
        return 0.0f;
    }

    /* renamed from: t */
    public final int m2044t() {
        int i;
        return this.f3399f ? Math.min(Math.max(this.f3400g, this.f3383T - ((this.f3382S * 9) / 16)), this.f3381R) + this.f3415v : (this.f3407n || this.f3408o || (i = this.f3406m) <= 0) ? this.f3398e + this.f3415v : Math.max(this.f3398e, i + this.f3401h);
    }

    /* renamed from: u */
    public final void m2045u(int i) {
        if (((View) this.f3384U.get()) != null) {
            ArrayList arrayList = this.f3386W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f3370G;
            if (i <= i2 && i2 != m2046x()) {
                m2046x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: x */
    public final int m2046x() {
        if (this.f3392b) {
            return this.f3367D;
        }
        return Math.max(this.f3366C, this.f3411r ? 0 : this.f3416w);
    }

    /* renamed from: y */
    public final int m2047y(int i) {
        if (i == 3) {
            return m2046x();
        }
        if (i == 4) {
            return this.f3370G;
        }
        if (i == 5) {
            return this.f3383T;
        }
        if (i == 6) {
            return this.f3368E;
        }
        throw new IllegalArgumentException(AbstractC0062j.m156j(i, "Invalid state to get top offset: "));
    }

    /* renamed from: z */
    public final boolean m2048z() {
        WeakReference weakReference = this.f3384U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f3384U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.f3390a = 0;
        this.f3392b = true;
        this.f3404k = -1;
        this.f3405l = -1;
        this.f3364A = new C0129h(this);
        this.f3369F = 0.5f;
        this.f3371H = -1.0f;
        this.f3374K = true;
        this.f3375L = 4;
        this.f3380Q = 0.1f;
        this.f3386W = new ArrayList();
        this.f3389Z = -1;
        this.f3395c0 = new SparseIntArray();
        this.f3397d0 = new C0126e(this, i2);
        this.f3401h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f167b);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3403j = AbstractC0088l.m255B(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f3418y = C0361k.m965b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m963a();
        }
        C0361k c0361k = this.f3418y;
        if (c0361k != null) {
            C0357g c0357g = new C0357g(c0361k);
            this.f3402i = c0357g;
            c0357g.m956i(context);
            ColorStateList colorStateList = this.f3403j;
            if (colorStateList != null) {
                this.f3402i.m958k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3402i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m2043s(), 1.0f);
        this.f3365B = ofFloat;
        ofFloat.setDuration(500L);
        this.f3365B.addUpdateListener(new C0124c(i2, this));
        this.f3371H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f3404k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f3405l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            m2030A(i);
        } else {
            m2030A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f3372I != z2) {
            this.f3372I = z2;
            if (!z2 && this.f3375L == 5) {
                m2031B(4);
            }
            m2035F();
        }
        this.f3407n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f3392b != z3) {
            this.f3392b = z3;
            if (this.f3384U != null) {
                m2042r();
            }
            m2032C((this.f3392b && this.f3375L == 6) ? 3 : this.f3375L);
            m2036G(this.f3375L, true);
            m2035F();
        }
        this.f3373J = obtainStyledAttributes.getBoolean(12, false);
        this.f3374K = obtainStyledAttributes.getBoolean(4, true);
        this.f3390a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f3369F = f2;
            if (this.f3384U != null) {
                this.f3368E = (int) ((1.0f - f2) * this.f3383T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f3366C = i3;
                    m2036G(this.f3375L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f3366C = dimensionPixelOffset;
                    m2036G(this.f3375L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f3396d = obtainStyledAttributes.getInt(11, 500);
            this.f3408o = obtainStyledAttributes.getBoolean(17, false);
            this.f3409p = obtainStyledAttributes.getBoolean(18, false);
            this.f3410q = obtainStyledAttributes.getBoolean(19, false);
            this.f3411r = obtainStyledAttributes.getBoolean(20, true);
            this.f3412s = obtainStyledAttributes.getBoolean(14, false);
            this.f3413t = obtainStyledAttributes.getBoolean(15, false);
            this.f3414u = obtainStyledAttributes.getBoolean(16, false);
            this.f3417x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f3394c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
