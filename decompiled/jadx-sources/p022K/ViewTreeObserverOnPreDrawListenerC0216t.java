package p022K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.t */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0216t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    public final View f567f;

    /* renamed from: g */
    public ViewTreeObserver f568g;

    /* renamed from: h */
    public final Runnable f569h;

    public ViewTreeObserverOnPreDrawListenerC0216t(View view, Runnable runnable) {
        this.f567f = view;
        this.f568g = view.getViewTreeObserver();
        this.f569h = runnable;
    }

    /* renamed from: a */
    public static void m674a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0216t viewTreeObserverOnPreDrawListenerC0216t = new ViewTreeObserverOnPreDrawListenerC0216t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0216t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0216t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f568g.isAlive();
        View view = this.f567f;
        if (isAlive) {
            this.f568g.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f569h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f568g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f568g.isAlive();
        View view2 = this.f567f;
        if (isAlive) {
            this.f568g.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
