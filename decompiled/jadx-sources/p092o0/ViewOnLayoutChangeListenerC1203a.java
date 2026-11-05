package p092o0;

import android.view.View;
import android.widget.FrameLayout;
import p098q0.C1375z1;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1203a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f5423a;

    /* renamed from: b */
    public final /* synthetic */ C1206d f5424b;

    /* renamed from: c */
    public final /* synthetic */ C1375z1 f5425c;

    public ViewOnLayoutChangeListenerC1203a(C1375z1 c1375z1, FrameLayout frameLayout, C1206d c1206d) {
        this.f5425c = c1375z1;
        this.f5423a = frameLayout;
        this.f5424b = c1206d;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout frameLayout = this.f5423a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f5425c.m3325n(this.f5424b);
        }
    }
}
