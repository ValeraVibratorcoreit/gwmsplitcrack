package p082l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p079k.InterfaceC1003C;

/* renamed from: l.q0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1136q0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    public final float f5237f;

    /* renamed from: g */
    public final int f5238g;

    /* renamed from: h */
    public final int f5239h;

    /* renamed from: i */
    public final View f5240i;

    /* renamed from: j */
    public RunnableC1134p0 f5241j;

    /* renamed from: k */
    public RunnableC1134p0 f5242k;

    /* renamed from: l */
    public boolean f5243l;

    /* renamed from: m */
    public int f5244m;

    /* renamed from: n */
    public final int[] f5245n = new int[2];

    public AbstractViewOnTouchListenerC1136q0(View view) {
        this.f5240i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f5237f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f5238g = tapTimeout;
        this.f5239h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m2753a() {
        RunnableC1134p0 runnableC1134p0 = this.f5242k;
        View view = this.f5240i;
        if (runnableC1134p0 != null) {
            view.removeCallbacks(runnableC1134p0);
        }
        RunnableC1134p0 runnableC1134p02 = this.f5241j;
        if (runnableC1134p02 != null) {
            view.removeCallbacks(runnableC1134p02);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC1003C mo2602b();

    /* renamed from: c */
    public abstract boolean mo2603c();

    /* renamed from: d */
    public boolean mo2604d() {
        InterfaceC1003C mo2602b = mo2602b();
        if (mo2602b == null || !mo2602b.mo2577b()) {
            return true;
        }
        mo2602b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C1130n0 mo2579j;
        boolean z3 = this.f5243l;
        View view2 = this.f5240i;
        if (z3) {
            InterfaceC1003C mo2602b = mo2602b();
            if (mo2602b != null && mo2602b.mo2577b() && (mo2579j = mo2602b.mo2579j()) != null && mo2579j.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f5245n;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                mo2579j.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean m2743b = mo2579j.m2743b(obtainNoHistory, this.f5244m);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (m2743b) {
                }
            }
            if (mo2604d()) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f5244m);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f5237f;
                                float f3 = -f2;
                                if (x2 < f3 || y2 < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y2 >= (view2.getBottom() - view2.getTop()) + f2) {
                                    m2753a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (mo2603c()) {
                                        z2 = true;
                                        if (z2) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    m2753a();
                } else {
                    this.f5244m = motionEvent.getPointerId(0);
                    if (this.f5241j == null) {
                        this.f5241j = new RunnableC1134p0(this, 0);
                    }
                    view2.postDelayed(this.f5241j, this.f5238g);
                    if (this.f5242k == null) {
                        this.f5242k = new RunnableC1134p0(this, 1);
                    }
                    view2.postDelayed(this.f5242k, this.f5239h);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f5243l = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f5243l = false;
        this.f5244m = -1;
        RunnableC1134p0 runnableC1134p0 = this.f5241j;
        if (runnableC1134p0 != null) {
            this.f5240i.removeCallbacks(runnableC1134p0);
        }
    }
}
