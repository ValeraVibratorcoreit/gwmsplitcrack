package p098q0;

import android.view.View;

/* renamed from: q0.T */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC1284T implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f5952a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1288V c1288v;
        C1311e0 c1311e0;
        switch (this.f5952a) {
            case 0:
                if ((i != i5 || i2 != i6 || i3 != i7 || i4 != i8) && (c1288v = C1288V.f5996D) != null && c1288v.f6020p) {
                    c1288v.m3144u();
                    break;
                }
                break;
            default:
                if (i4 - i2 != i8 - i6 && (c1311e0 = C1311e0.f6093p) != null && c1311e0.f6102f) {
                    c1311e0.m3173i();
                    break;
                }
                break;
        }
    }
}
