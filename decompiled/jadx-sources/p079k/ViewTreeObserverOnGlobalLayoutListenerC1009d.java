package p079k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p082l.C1060F0;
import p082l.C1073M;
import p082l.C1079P;

/* renamed from: k.d */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1009d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f */
    public final /* synthetic */ int f4780f;

    /* renamed from: g */
    public final /* synthetic */ Object f4781g;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1009d(int i, Object obj) {
        this.f4780f = i;
        this.f4781g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f4780f) {
            case 0:
                ViewOnKeyListenerC1012g viewOnKeyListenerC1012g = (ViewOnKeyListenerC1012g) this.f4781g;
                if (viewOnKeyListenerC1012g.mo2577b()) {
                    ArrayList arrayList = viewOnKeyListenerC1012g.f4800m;
                    if (arrayList.size() > 0 && !((C1011f) arrayList.get(0)).f4786a.f4998D) {
                        View view = viewOnKeyListenerC1012g.f4807t;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C1011f) it.next()).f4786a.mo2578f();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC1012g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC1004D viewOnKeyListenerC1004D = (ViewOnKeyListenerC1004D) this.f4781g;
                if (viewOnKeyListenerC1004D.mo2577b()) {
                    C1060F0 c1060f0 = viewOnKeyListenerC1004D.f4747m;
                    if (!c1060f0.f4998D) {
                        View view2 = viewOnKeyListenerC1004D.f4752r;
                        if (view2 != null && view2.isShown()) {
                            c1060f0.mo2578f();
                            break;
                        } else {
                            viewOnKeyListenerC1004D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C1079P c1079p = (C1079P) this.f4781g;
                if (!c1079p.getInternalPopup().mo2678b()) {
                    c1079p.f5093k.mo2680e(c1079p.getTextDirection(), c1079p.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1079p.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C1073M c1073m = (C1073M) this.f4781g;
                C1079P c1079p2 = c1073m.f5073L;
                c1073m.getClass();
                if (!c1079p2.isAttachedToWindow() || !c1079p2.getGlobalVisibleRect(c1073m.f5071J)) {
                    c1073m.dismiss();
                    break;
                } else {
                    c1073m.m2689s();
                    c1073m.mo2578f();
                    break;
                }
                break;
        }
    }
}
