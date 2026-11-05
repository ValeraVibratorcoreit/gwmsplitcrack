package p082l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c */
/* loaded from: classes.dex */
public final class RunnableC1106c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5152a;

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f5153b;

    public /* synthetic */ RunnableC1106c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f5152a = i;
        this.f5153b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5152a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5153b;
                actionBarOverlayLayout.m1274h();
                actionBarOverlayLayout.f1746B = actionBarOverlayLayout.f1755i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1747C);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5153b;
                actionBarOverlayLayout2.m1274h();
                actionBarOverlayLayout2.f1746B = actionBarOverlayLayout2.f1755i.animate().translationY(-actionBarOverlayLayout2.f1755i.getHeight()).setListener(actionBarOverlayLayout2.f1747C);
                break;
        }
    }
}
