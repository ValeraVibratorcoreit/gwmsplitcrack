package p034Q0;

import android.view.View;
import java.util.WeakHashMap;
import p022K.AbstractC0156D;
import p022K.AbstractC0169Q;

/* renamed from: Q0.n */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0297n implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0156D.m419c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
