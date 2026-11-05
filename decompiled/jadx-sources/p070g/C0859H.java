package p070g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p003B.C0043j;
import p010D1.AbstractC0088l;
import p022K.AbstractC0156D;
import p022K.AbstractC0169Q;

/* renamed from: g.H */
/* loaded from: classes.dex */
public final class C0859H extends AbstractC0088l {

    /* renamed from: c */
    public final /* synthetic */ int f4285c;

    /* renamed from: d */
    public final /* synthetic */ C0861J f4286d;

    public /* synthetic */ C0859H(C0861J c0861j, int i) {
        this.f4285c = i;
        this.f4286d = c0861j;
    }

    @Override // p022K.InterfaceC0176Y
    /* renamed from: a */
    public final void mo525a() {
        View view;
        C0861J c0861j = this.f4286d;
        switch (this.f4285c) {
            case 0:
                if (c0861j.f4308q && (view = c0861j.f4300i) != null) {
                    view.setTranslationY(0.0f);
                    c0861j.f4297f.setTranslationY(0.0f);
                }
                c0861j.f4297f.setVisibility(8);
                c0861j.f4297f.setTransitioning(false);
                c0861j.f4312u = null;
                C0043j c0043j = c0861j.f4304m;
                if (c0043j != null) {
                    c0043j.m68F(c0861j.f4303l);
                    c0861j.f4303l = null;
                    c0861j.f4304m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0861j.f4296e;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    AbstractC0156D.m419c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c0861j.f4312u = null;
                c0861j.f4297f.requestLayout();
                break;
        }
    }
}
