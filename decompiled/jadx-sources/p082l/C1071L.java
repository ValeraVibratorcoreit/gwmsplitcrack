package p082l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p079k.ViewTreeObserverOnGlobalLayoutListenerC1009d;

/* renamed from: l.L */
/* loaded from: classes.dex */
public final class C1071L implements PopupWindow.OnDismissListener {

    /* renamed from: f */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1009d f5067f;

    /* renamed from: g */
    public final /* synthetic */ C1073M f5068g;

    public C1071L(C1073M c1073m, ViewTreeObserverOnGlobalLayoutListenerC1009d viewTreeObserverOnGlobalLayoutListenerC1009d) {
        this.f5068g = c1073m;
        this.f5067f = viewTreeObserverOnGlobalLayoutListenerC1009d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f5068g.f5073L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f5067f);
        }
    }
}
