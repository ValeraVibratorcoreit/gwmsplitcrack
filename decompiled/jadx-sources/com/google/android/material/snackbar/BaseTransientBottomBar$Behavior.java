package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p045W0.C0355e;
import p049Y0.AbstractC0437c;
import p049Y0.C0440f;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C0355e f3598h;

    public BaseTransientBottomBar$Behavior() {
        C0355e c0355e = new C0355e(14);
        this.f3361e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f3362f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f3360d = 0;
        this.f3598h = c0355e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p117x.AbstractC1636a
    /* renamed from: f */
    public final boolean mo2013f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3598h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0440f.f1413b == null) {
                    C0440f.f1413b = new C0440f();
                }
                synchronized (C0440f.f1413b.f1414a) {
                }
            }
        } else if (coordinatorLayout.m1326o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0440f.f1413b == null) {
                C0440f.f1413b = new C0440f();
            }
            synchronized (C0440f.f1413b.f1414a) {
            }
        }
        return super.mo2013f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: r */
    public final boolean mo2027r(View view) {
        this.f3598h.getClass();
        return view instanceof AbstractC0437c;
    }
}
