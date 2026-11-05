package p098q0;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: q0.U */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1286U implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f */
    public final /* synthetic */ View f5955f;

    /* renamed from: g */
    public final /* synthetic */ C1288V f5956g;

    public ViewTreeObserverOnGlobalLayoutListenerC1286U(C1288V c1288v, View view) {
        this.f5956g = c1288v;
        this.f5955f = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = C1288V.f5998F;
        View view2 = this.f5955f;
        if (view != view2) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            if (C1288V.f6001I == this) {
                C1288V.f6001I = null;
                return;
            }
            return;
        }
        if (view2.getWidth() <= 0 || view2.getHeight() <= 0) {
            return;
        }
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
        if (C1288V.f6001I == this) {
            C1288V.f6001I = null;
        }
        C1288V c1288v = this.f5956g;
        if (c1288v.f6020p) {
            c1288v.m3144u();
        }
    }
}
