package p036S;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import p001A0.RunnableC0020n;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;

/* renamed from: S.e */
/* loaded from: classes.dex */
public final class C0305e {

    /* renamed from: v */
    public static final InterpolatorC0304d f853v = new InterpolatorC0304d(0);

    /* renamed from: a */
    public int f854a;

    /* renamed from: b */
    public final int f855b;

    /* renamed from: d */
    public float[] f857d;

    /* renamed from: e */
    public float[] f858e;

    /* renamed from: f */
    public float[] f859f;

    /* renamed from: g */
    public float[] f860g;

    /* renamed from: h */
    public int[] f861h;

    /* renamed from: i */
    public int[] f862i;

    /* renamed from: j */
    public int[] f863j;

    /* renamed from: k */
    public int f864k;

    /* renamed from: l */
    public VelocityTracker f865l;

    /* renamed from: m */
    public final float f866m;

    /* renamed from: n */
    public final float f867n;

    /* renamed from: o */
    public final int f868o;

    /* renamed from: p */
    public final OverScroller f869p;

    /* renamed from: q */
    public final AbstractC0088l f870q;

    /* renamed from: r */
    public View f871r;

    /* renamed from: s */
    public boolean f872s;

    /* renamed from: t */
    public final CoordinatorLayout f873t;

    /* renamed from: c */
    public int f856c = -1;

    /* renamed from: u */
    public final RunnableC0020n f874u = new RunnableC0020n(3, this);

    public C0305e(Context context, CoordinatorLayout coordinatorLayout, AbstractC0088l abstractC0088l) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0088l == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f873t = coordinatorLayout;
        this.f870q = abstractC0088l;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f868o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f855b = viewConfiguration.getScaledTouchSlop();
        this.f866m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f867n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f869p = new OverScroller(context, f853v);
    }

    /* renamed from: a */
    public final void m857a() {
        this.f856c = -1;
        float[] fArr = this.f857d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f858e, 0.0f);
            Arrays.fill(this.f859f, 0.0f);
            Arrays.fill(this.f860g, 0.0f);
            Arrays.fill(this.f861h, 0);
            Arrays.fill(this.f862i, 0);
            Arrays.fill(this.f863j, 0);
            this.f864k = 0;
        }
        VelocityTracker velocityTracker = this.f865l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f865l = null;
        }
    }

    /* renamed from: b */
    public final void m858b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f873t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f871r = view;
        this.f856c = i;
        this.f870q.mo298a0(view, i);
        m870n(1);
    }

    /* renamed from: c */
    public final boolean m859c(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        AbstractC0088l abstractC0088l = this.f870q;
        boolean z2 = abstractC0088l.mo293P(view) > 0;
        boolean z3 = abstractC0088l.mo294Q() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f855b) : z3 && Math.abs(f3) > ((float) this.f855b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i = this.f855b;
        return f4 > ((float) (i * i));
    }

    /* renamed from: d */
    public final void m860d(int i) {
        float[] fArr = this.f857d;
        if (fArr != null) {
            int i2 = this.f864k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f858e[i] = 0.0f;
                this.f859f[i] = 0.0f;
                this.f860g[i] = 0.0f;
                this.f861h[i] = 0;
                this.f862i[i] = 0;
                this.f863j[i] = 0;
                this.f864k = (~i3) & i2;
            }
        }
    }

    /* renamed from: e */
    public final int m861e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f873t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: f */
    public final boolean m862f() {
        if (this.f854a == 2) {
            OverScroller overScroller = this.f869p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f871r.getLeft();
            int top = currY - this.f871r.getTop();
            if (left != 0) {
                View view = this.f871r;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f871r;
                WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f870q.mo302c0(this.f871r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f873t.post(this.f874u);
            }
        }
        return this.f854a == 2;
    }

    /* renamed from: g */
    public final View m863g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f873t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f870q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m864h(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f871r.getLeft();
        int top = this.f871r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f869p;
        int i7 = 0;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m870n(0);
            return false;
        }
        View view = this.f871r;
        int i8 = (int) this.f867n;
        int i9 = (int) this.f866m;
        int abs = Math.abs(i3);
        if (abs < i8) {
            i3 = 0;
        } else if (abs > i9) {
            i3 = i3 > 0 ? i9 : -i9;
        }
        int abs2 = Math.abs(i4);
        if (abs2 >= i8) {
            if (abs2 > i9) {
                if (i4 > 0) {
                    i4 = i9;
                } else {
                    i7 = -i9;
                }
            }
            int abs3 = Math.abs(i5);
            int abs4 = Math.abs(i6);
            int abs5 = Math.abs(i3);
            int abs6 = Math.abs(i4);
            int i10 = abs5 + abs6;
            int i11 = abs3 + abs4;
            if (i3 == 0) {
                f2 = abs5;
                f3 = i10;
            } else {
                f2 = abs3;
                f3 = i11;
            }
            float f6 = f2 / f3;
            if (i4 == 0) {
                f4 = abs6;
                f5 = i10;
            } else {
                f4 = abs4;
                f5 = i11;
            }
            float f7 = f4 / f5;
            AbstractC0088l abstractC0088l = this.f870q;
            overScroller.startScroll(left, top, i5, i6, (int) ((m861e(i6, i4, abstractC0088l.mo294Q()) * f7) + (m861e(i5, i3, abstractC0088l.mo293P(view)) * f6)));
            m870n(2);
            return true;
        }
        i4 = i7;
        int abs32 = Math.abs(i5);
        int abs42 = Math.abs(i6);
        int abs52 = Math.abs(i3);
        int abs62 = Math.abs(i4);
        int i102 = abs52 + abs62;
        int i112 = abs32 + abs42;
        if (i3 == 0) {
        }
        float f62 = f2 / f3;
        if (i4 == 0) {
        }
        float f72 = f4 / f5;
        AbstractC0088l abstractC0088l2 = this.f870q;
        overScroller.startScroll(left, top, i5, i6, (int) ((m861e(i6, i4, abstractC0088l2.mo294Q()) * f72) + (m861e(i5, i3, abstractC0088l2.mo293P(view)) * f62)));
        m870n(2);
        return true;
    }

    /* renamed from: i */
    public final boolean m865i(int i) {
        if ((this.f864k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: j */
    public final void m866j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m857a();
        }
        if (this.f865l == null) {
            this.f865l = VelocityTracker.obtain();
        }
        this.f865l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m863g = m863g((int) x2, (int) y2);
            m868l(x2, y2, pointerId);
            m873q(m863g, pointerId);
            int i3 = this.f861h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f854a == 1) {
                m867k();
            }
            m857a();
            return;
        }
        AbstractC0088l abstractC0088l = this.f870q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f854a == 1) {
                    this.f872s = true;
                    abstractC0088l.mo303d0(this.f871r, 0.0f, 0.0f);
                    this.f872s = false;
                    if (this.f854a == 1) {
                        m870n(0);
                    }
                }
                m857a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m868l(x3, y3, pointerId2);
                if (this.f854a == 0) {
                    m873q(m863g((int) x3, (int) y3), pointerId2);
                    int i4 = this.f861h[pointerId2];
                    return;
                }
                int i5 = (int) x3;
                int i6 = (int) y3;
                View view = this.f871r;
                if (view != null) {
                    i2 = (i5 < view.getLeft() || i5 >= view.getRight() || i6 < view.getTop() || i6 >= view.getBottom()) ? 0 : 1;
                }
                if (i2 != 0) {
                    m873q(this.f871r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f854a == 1 && pointerId3 == this.f856c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f856c) {
                        View m863g2 = m863g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f871r;
                        if (m863g2 == view2 && m873q(view2, pointerId4)) {
                            i = this.f856c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m867k();
                }
            }
            m860d(pointerId3);
            return;
        }
        if (this.f854a == 1) {
            if (m865i(this.f856c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f856c);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f859f;
                int i7 = this.f856c;
                int i8 = (int) (x4 - fArr[i7]);
                int i9 = (int) (y4 - this.f860g[i7]);
                int left = this.f871r.getLeft() + i8;
                int top = this.f871r.getTop() + i9;
                int left2 = this.f871r.getLeft();
                int top2 = this.f871r.getTop();
                if (i8 != 0) {
                    left = abstractC0088l.mo317r(this.f871r, left);
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    this.f871r.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = abstractC0088l.mo318s(this.f871r, top);
                    WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                    this.f871r.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC0088l.mo302c0(this.f871r, left, top);
                }
                m869m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m865i(pointerId5)) {
                float x5 = motionEvent.getX(i2);
                float y5 = motionEvent.getY(i2);
                float f2 = x5 - this.f857d[pointerId5];
                float f3 = y5 - this.f858e[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i10 = this.f861h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i11 = this.f861h[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i12 = this.f861h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i13 = this.f861h[pointerId5];
                if (this.f854a != 1) {
                    View m863g3 = m863g((int) x5, (int) y5);
                    if (m859c(m863g3, f2, f3) && m873q(m863g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m869m(motionEvent);
    }

    /* renamed from: k */
    public final void m867k() {
        VelocityTracker velocityTracker = this.f865l;
        float f2 = this.f866m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f865l.getXVelocity(this.f856c);
        float f3 = this.f867n;
        float abs = Math.abs(xVelocity);
        float f4 = 0.0f;
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f865l.getYVelocity(this.f856c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f3) {
            if (abs2 > f2) {
                if (yVelocity <= 0.0f) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f872s = true;
        this.f870q.mo303d0(this.f871r, xVelocity, f4);
        this.f872s = false;
        if (this.f854a == 1) {
            m870n(0);
        }
    }

    /* renamed from: l */
    public final void m868l(float f2, float f3, int i) {
        float[] fArr = this.f857d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f858e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f859f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f860g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f861h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f862i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f863j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f857d = fArr2;
            this.f858e = fArr3;
            this.f859f = fArr4;
            this.f860g = fArr5;
            this.f861h = iArr;
            this.f862i = iArr2;
            this.f863j = iArr3;
        }
        float[] fArr9 = this.f857d;
        this.f859f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f858e;
        this.f860g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.f861h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        CoordinatorLayout coordinatorLayout = this.f873t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f868o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f864k |= 1 << i;
    }

    /* renamed from: m */
    public final void m869m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m865i(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f859f[pointerId] = x2;
                this.f860g[pointerId] = y2;
            }
        }
    }

    /* renamed from: n */
    public final void m870n(int i) {
        this.f873t.removeCallbacks(this.f874u);
        if (this.f854a != i) {
            this.f854a = i;
            this.f870q.mo300b0(i);
            if (this.f854a == 0) {
                this.f871r = null;
            }
        }
    }

    /* renamed from: o */
    public final boolean m871o(int i, int i2) {
        if (this.f872s) {
            return m864h(i, i2, (int) this.f865l.getXVelocity(this.f856c), (int) this.f865l.getYVelocity(this.f856c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m872p(MotionEvent motionEvent) {
        View m863g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m857a();
        }
        if (this.f865l == null) {
            this.f865l = VelocityTracker.obtain();
        }
        this.f865l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            m868l(x2, y2, pointerId);
                            int i = this.f854a;
                            if (i == 0) {
                                int i2 = this.f861h[pointerId];
                            } else if (i == 2 && (m863g = m863g((int) x2, (int) y2)) == this.f871r) {
                                m873q(m863g, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            m860d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f857d != null && this.f858e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if (m865i(pointerId2)) {
                            float x3 = motionEvent.getX(i3);
                            float y3 = motionEvent.getY(i3);
                            float f2 = x3 - this.f857d[pointerId2];
                            float f3 = y3 - this.f858e[pointerId2];
                            View m863g2 = m863g((int) x3, (int) y3);
                            boolean z2 = m863g2 != null && m859c(m863g2, f2, f3);
                            if (z2) {
                                int left = m863g2.getLeft();
                                AbstractC0088l abstractC0088l = this.f870q;
                                int mo317r = abstractC0088l.mo317r(m863g2, ((int) f2) + left);
                                int top = m863g2.getTop();
                                int mo318s = abstractC0088l.mo318s(m863g2, ((int) f3) + top);
                                int mo293P = abstractC0088l.mo293P(m863g2);
                                int mo294Q = abstractC0088l.mo294Q();
                                if (mo293P != 0) {
                                    if (mo293P > 0) {
                                    }
                                }
                                if (mo294Q == 0) {
                                    break;
                                }
                                if (mo294Q > 0 && mo318s == top) {
                                    break;
                                }
                            }
                            Math.abs(f2);
                            Math.abs(f3);
                            int i4 = this.f861h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f2);
                            int i5 = this.f861h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f3);
                            int i6 = this.f861h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f2);
                            int i7 = this.f861h[pointerId2];
                            if (this.f854a == 1) {
                                break;
                            }
                            if (z2 && m873q(m863g2, pointerId2)) {
                                break;
                            }
                        }
                    }
                    m869m(motionEvent);
                }
            }
            m857a();
        } else {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            m868l(x4, y4, pointerId3);
            View m863g3 = m863g((int) x4, (int) y4);
            if (m863g3 == this.f871r && this.f854a == 2) {
                m873q(m863g3, pointerId3);
            }
            int i8 = this.f861h[pointerId3];
        }
        return this.f854a == 1;
    }

    /* renamed from: q */
    public final boolean m873q(View view, int i) {
        if (view == this.f871r && this.f856c == i) {
            return true;
        }
        if (view == null || !this.f870q.mo319s0(view, i)) {
            return false;
        }
        this.f856c = i;
        m858b(view, i);
        return true;
    }
}
