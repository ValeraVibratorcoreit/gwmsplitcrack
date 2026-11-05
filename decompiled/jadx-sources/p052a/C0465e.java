package p052a;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.InterfaceC0551p;
import androidx.lifecycle.InterfaceC0553r;
import p070g.AbstractActivityC0870i;
import p071g0.C0891d;
import p107t1.AbstractC1461d;

/* renamed from: a.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0465e implements InterfaceC0551p {

    /* renamed from: a */
    public final /* synthetic */ int f1480a;

    /* renamed from: b */
    public final /* synthetic */ Object f1481b;

    public /* synthetic */ C0465e(int i, Object obj) {
        this.f1480a = i;
        this.f1481b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0551p
    /* renamed from: d */
    public final void mo1177d(InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l) {
        Window window;
        View peekDecorView;
        switch (this.f1480a) {
            case 0:
                AbstractActivityC0870i abstractActivityC0870i = (AbstractActivityC0870i) this.f1481b;
                if (enumC0547l == EnumC0547l.ON_STOP && (window = abstractActivityC0870i.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0870i abstractActivityC0870i2 = (AbstractActivityC0870i) this.f1481b;
                if (enumC0547l == EnumC0547l.ON_DESTROY) {
                    abstractActivityC0870i2.f1502g.f2165b = null;
                    if (!abstractActivityC0870i2.isChangingConfigurations()) {
                        abstractActivityC0870i2.mo1067c().m1370a();
                    }
                    ViewTreeObserverOnDrawListenerC0469i viewTreeObserverOnDrawListenerC0469i = abstractActivityC0870i2.f1506k;
                    AbstractActivityC0870i abstractActivityC0870i3 = viewTreeObserverOnDrawListenerC0469i.f1489d;
                    abstractActivityC0870i3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0469i);
                    abstractActivityC0870i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0469i);
                    break;
                }
                break;
            default:
                C0891d c0891d = (C0891d) this.f1481b;
                AbstractC1461d.m3494e("this$0", c0891d);
                if (enumC0547l != EnumC0547l.ON_START) {
                    if (enumC0547l == EnumC0547l.ON_STOP) {
                        c0891d.f4470c = false;
                        break;
                    }
                } else {
                    c0891d.f4470c = true;
                    break;
                }
                break;
        }
    }
}
