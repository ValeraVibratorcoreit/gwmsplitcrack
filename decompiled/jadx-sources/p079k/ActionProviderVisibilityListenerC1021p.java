package p079k;

import android.view.ActionProvider;
import com.altaysoft.t500_split.media.C0639g;

/* renamed from: k.p */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1021p implements ActionProvider.VisibilityListener {

    /* renamed from: a */
    public C0639g f4885a;

    /* renamed from: b */
    public final ActionProvider f4886b;

    /* renamed from: c */
    public final /* synthetic */ MenuItemC1025t f4887c;

    public ActionProviderVisibilityListenerC1021p(MenuItemC1025t menuItemC1025t, ActionProvider actionProvider) {
        this.f4887c = menuItemC1025t;
        this.f4886b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0639g c0639g = this.f4885a;
        if (c0639g != null) {
            MenuC1018m menuC1018m = ((C1020o) c0639g.f3011g).f4872n;
            menuC1018m.f4836h = true;
            menuC1018m.m2620p(true);
        }
    }
}
