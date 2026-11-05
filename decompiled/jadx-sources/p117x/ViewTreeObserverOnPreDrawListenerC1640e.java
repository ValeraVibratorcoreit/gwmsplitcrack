package p117x;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.e */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1640e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f */
    public final /* synthetic */ CoordinatorLayout f9321f;

    public ViewTreeObserverOnPreDrawListenerC1640e(CoordinatorLayout coordinatorLayout) {
        this.f9321f = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f9321f.m1327p(0);
        return true;
    }
}
