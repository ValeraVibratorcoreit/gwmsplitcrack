package p051Z0;

import android.view.View;

/* renamed from: Z0.g */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0449g implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f1432a;

    /* renamed from: b */
    public final /* synthetic */ C0450h f1433b;

    public ViewOnLayoutChangeListenerC0449g(C0450h c0450h, View view) {
        this.f1433b = c0450h;
        this.f1432a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f1432a;
        if (view2.getVisibility() == 0) {
            this.f1433b.m1154c(view2);
        }
    }
}
