package p054a1;

import android.view.View;

/* renamed from: a1.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0493b implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f1549a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0507p f1550b;

    public /* synthetic */ ViewOnFocusChangeListenerC0493b(AbstractC0507p abstractC0507p, int i) {
        this.f1549a = i;
        this.f1550b = abstractC0507p;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f1549a) {
            case 0:
                C0496e c0496e = (C0496e) this.f1550b;
                c0496e.m1210t(c0496e.m1211u());
                break;
            default:
                C0502k c0502k = (C0502k) this.f1550b;
                c0502k.f1578l = z2;
                c0502k.m1238q();
                if (!z2) {
                    c0502k.m1219t(false);
                    c0502k.f1579m = false;
                    break;
                }
                break;
        }
    }
}
