package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.altaysoft.t500_split.media.C0639g;
import java.util.WeakHashMap;
import p013F0.C0098b;
import p022K.AbstractC0169Q;
import p024L.C0235e;
import p036S.C0305e;
import p117x.AbstractC1636a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC1636a {

    /* renamed from: a */
    public C0305e f3357a;

    /* renamed from: b */
    public boolean f3358b;

    /* renamed from: c */
    public boolean f3359c;

    /* renamed from: d */
    public int f3360d = 2;

    /* renamed from: e */
    public float f3361e = 0.0f;

    /* renamed from: f */
    public float f3362f = 0.5f;

    /* renamed from: g */
    public final C0098b f3363g = new C0098b(this);

    @Override // p117x.AbstractC1636a
    /* renamed from: f */
    public boolean mo2013f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f3358b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.m1326o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3358b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3358b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f3357a == null) {
            this.f3357a = new C0305e(coordinatorLayout.getContext(), coordinatorLayout, this.f3363g);
        }
        return !this.f3359c && this.f3357a.m872p(motionEvent);
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: g */
    public final boolean mo215g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0169Q.m502g(view, 1048576);
            AbstractC0169Q.m500e(view, 0);
            if (mo2027r(view)) {
                AbstractC0169Q.m503h(view, C0235e.f619j, new C0639g(3, this));
            }
        }
        return false;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: q */
    public final boolean mo2021q(View view, MotionEvent motionEvent) {
        if (this.f3357a == null) {
            return false;
        }
        if (this.f3359c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f3357a.m866j(motionEvent);
        return true;
    }

    /* renamed from: r */
    public boolean mo2027r(View view) {
        return true;
    }
}
