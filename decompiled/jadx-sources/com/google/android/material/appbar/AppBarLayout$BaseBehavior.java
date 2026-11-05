package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p009D0.AbstractC0075a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC0075a {

    /* renamed from: b */
    public boolean f3337b;

    /* renamed from: d */
    public int f3339d;

    /* renamed from: f */
    public VelocityTracker f3341f;

    /* renamed from: c */
    public int f3338c = -1;

    /* renamed from: e */
    public int f3340e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: f */
    public final boolean mo2013f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f3340e < 0) {
            this.f3340e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f3337b) {
            int i = this.f3338c;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y2 - this.f3339d) > this.f3340e) {
                this.f3339d = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f3341f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f3338c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // p009D0.AbstractC0075a, p117x.AbstractC1636a
    /* renamed from: g */
    public final boolean mo215g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: h */
    public final boolean mo2014h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: j */
    public final /* synthetic */ void mo2015j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: k */
    public final void mo2016k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: m */
    public final void mo2017m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: n */
    public final Parcelable mo2018n(View view) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: o */
    public final boolean mo2019o(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: p */
    public final void mo2020p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // p117x.AbstractC1636a
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2021q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f3341f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f3341f.computeCurrentVelocity(1000);
                this.f3341f.getYVelocity(this.f3338c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3338c);
                if (findPointerIndex == -1) {
                    return false;
                }
                this.f3339d = (int) motionEvent.getY(findPointerIndex);
                view.getClass();
                throw new ClassCastException();
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f3338c = motionEvent.getPointerId(i);
                    this.f3339d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f3341f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return this.f3337b;
            }
        }
        this.f3337b = false;
        this.f3338c = -1;
        VelocityTracker velocityTracker3 = this.f3341f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f3341f = null;
        }
        velocityTracker = this.f3341f;
        if (velocityTracker != null) {
        }
        return this.f3337b;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
