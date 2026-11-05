package com.altaysoft.t500_split.splitinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import p098q0.C1315f1;
import p098q0.C1324i1;
import p118x0.InterfaceC1647c;

/* loaded from: classes.dex */
public final class HorizontalSwipeFrameLayout extends FrameLayout {

    /* renamed from: f */
    public final int f3193f;

    /* renamed from: g */
    public final float f3194g;

    /* renamed from: h */
    public InterfaceC1647c f3195h;

    /* renamed from: i */
    public View f3196i;

    /* renamed from: j */
    public VelocityTracker f3197j;

    /* renamed from: k */
    public float f3198k;

    /* renamed from: l */
    public float f3199l;

    /* renamed from: m */
    public boolean f3200m;

    /* renamed from: n */
    public boolean f3201n;

    /* renamed from: o */
    public boolean f3202o;

    /* renamed from: p */
    public boolean f3203p;

    public HorizontalSwipeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3193f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3194g = r2.getScaledMinimumFlingVelocity();
    }

    /* renamed from: a */
    public final boolean m1967a(float f2, float f3) {
        View view = this.f3196i;
        if (view == null || view.getVisibility() != 0 || view.getWidth() <= 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f2 < iArr[0] || f2 >= view.getWidth() + r3) {
            return false;
        }
        int i = iArr[1];
        return f3 >= ((float) i) && f3 < ((float) (view.getHeight() + i));
    }

    public float getMinFlingVelocity() {
        return this.f3194g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r0 != 3) goto L49;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3195h == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f3197j == null) {
            this.f3197j = VelocityTracker.obtain();
        }
        this.f3197j.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f3200m && !this.f3201n) {
                        float x2 = motionEvent.getX() - this.f3198k;
                        float y2 = motionEvent.getY() - this.f3199l;
                        float abs = Math.abs(y2);
                        float f2 = this.f3193f;
                        if (abs > f2 && Math.abs(y2) > Math.abs(x2) * 1.2f) {
                            if (((C1315f1) this.f3195h).m3182f(this.f3198k)) {
                                this.f3203p = true;
                                this.f3201n = true;
                                if (getParent() != null) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return true;
                            }
                            this.f3200m = false;
                        } else if (Math.abs(x2) > f2 && Math.abs(x2) > Math.abs(y2) * 1.2f) {
                            if (((C1315f1) this.f3195h).m3179b()) {
                                this.f3202o = true;
                                this.f3201n = true;
                                if (getParent() != null) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return true;
                            }
                            this.f3200m = false;
                        }
                    }
                }
            }
            VelocityTracker velocityTracker = this.f3197j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3197j = null;
            }
            this.f3200m = false;
            this.f3201n = false;
            this.f3202o = false;
            this.f3203p = false;
        } else {
            this.f3198k = motionEvent.getX();
            this.f3199l = motionEvent.getY();
            this.f3200m = true;
            this.f3201n = false;
            this.f3202o = false;
            this.f3203p = false;
            m1967a(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return this.f3201n || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3195h == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f3197j == null) {
            this.f3197j = VelocityTracker.obtain();
        }
        this.f3197j.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3198k = motionEvent.getX();
            this.f3199l = motionEvent.getY();
            this.f3200m = true;
            this.f3201n = true;
            this.f3202o = false;
            this.f3203p = false;
            m1967a(motionEvent.getRawX(), motionEvent.getRawY());
            return true;
        }
        float f2 = 0.0f;
        if (actionMasked == 1) {
            float x2 = motionEvent.getX() - this.f3198k;
            VelocityTracker velocityTracker = this.f3197j;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000);
                f2 = this.f3197j.getXVelocity();
            }
            if (this.f3203p) {
                ((C1315f1) this.f3195h).m3183g();
            } else if (this.f3202o) {
                ((C1315f1) this.f3195h).m3180d(x2, f2);
            }
            VelocityTracker velocityTracker2 = this.f3197j;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f3197j = null;
            }
            this.f3200m = false;
            this.f3201n = false;
            this.f3202o = false;
            this.f3203p = false;
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return true;
            }
            if (this.f3203p) {
                ((C1315f1) this.f3195h).m3183g();
            } else if (this.f3202o) {
                ((C1315f1) this.f3195h).m3180d(0.0f, 0.0f);
            }
            VelocityTracker velocityTracker3 = this.f3197j;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f3197j = null;
            }
            this.f3200m = false;
            this.f3201n = false;
            this.f3202o = false;
            this.f3203p = false;
            return true;
        }
        float x3 = motionEvent.getX() - this.f3198k;
        float y2 = motionEvent.getY() - this.f3199l;
        if (this.f3203p) {
            ((C1315f1) this.f3195h).m3181e(y2, motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (!this.f3202o) {
            float abs = Math.abs(y2);
            float f3 = this.f3193f;
            if (abs > f3 && Math.abs(y2) > Math.abs(x3) * 1.2f) {
                if (!((C1315f1) this.f3195h).m3182f(this.f3198k)) {
                    this.f3200m = false;
                    return false;
                }
                this.f3203p = true;
                ((C1315f1) this.f3195h).m3181e(y2, motionEvent.getX(), motionEvent.getY());
                return true;
            }
            if (Math.abs(x3) <= f3 || Math.abs(x3) <= Math.abs(y2) * 1.2f) {
                return true;
            }
            if (!((C1315f1) this.f3195h).m3179b()) {
                this.f3200m = false;
                return false;
            }
            this.f3202o = true;
        }
        ((C1324i1) ((C1315f1) this.f3195h).f6118f).m3229q(x3);
        return true;
    }

    public void setDragListener(InterfaceC1647c interfaceC1647c) {
        this.f3195h = interfaceC1647c;
    }

    public void setPreferSwipeTarget(View view) {
        this.f3196i = view;
    }
}
