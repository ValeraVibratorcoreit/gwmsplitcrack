package p046X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.B */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0374B implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    public final /* synthetic */ C0394W f1115f;

    /* renamed from: g */
    public final /* synthetic */ LayoutInflaterFactory2C0375C f1116g;

    public ViewOnAttachStateChangeListenerC0374B(LayoutInflaterFactory2C0375C layoutInflaterFactory2C0375C, C0394W c0394w) {
        this.f1116g = layoutInflaterFactory2C0375C;
        this.f1115f = c0394w;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0394W c0394w = this.f1115f;
        c0394w.m1057k();
        C0412k.m1092g((ViewGroup) c0394w.f1209c.f1342J.getParent(), this.f1116g.f1117f).m1098f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
