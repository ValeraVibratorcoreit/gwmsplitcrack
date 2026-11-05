package p082l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: l.p0 */
/* loaded from: classes.dex */
public final class RunnableC1134p0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5231a;

    /* renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC1136q0 f5232b;

    public /* synthetic */ RunnableC1134p0(AbstractViewOnTouchListenerC1136q0 abstractViewOnTouchListenerC1136q0, int i) {
        this.f5231a = i;
        this.f5232b = abstractViewOnTouchListenerC1136q0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5231a) {
            case 0:
                ViewParent parent = this.f5232b.f5240i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC1136q0 abstractViewOnTouchListenerC1136q0 = this.f5232b;
                abstractViewOnTouchListenerC1136q0.m2753a();
                View view = abstractViewOnTouchListenerC1136q0.f5240i;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1136q0.mo2603c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC1136q0.f5243l = true;
                    break;
                }
                break;
        }
    }
}
