package p046X;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0553r;
import androidx.lifecycle.InterfaceC0561z;

/* renamed from: X.n */
/* loaded from: classes.dex */
public final class C0415n implements InterfaceC0561z {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0417p f1301a;

    public C0415n(DialogInterfaceOnCancelListenerC0417p dialogInterfaceOnCancelListenerC0417p) {
        this.f1301a = dialogInterfaceOnCancelListenerC0417p;
    }

    @Override // androidx.lifecycle.InterfaceC0561z
    /* renamed from: a */
    public final void mo1100a(Object obj) {
        if (((InterfaceC0553r) obj) != null) {
            DialogInterfaceOnCancelListenerC0417p dialogInterfaceOnCancelListenerC0417p = this.f1301a;
            if (dialogInterfaceOnCancelListenerC0417p.f1309e0) {
                View m1120L = dialogInterfaceOnCancelListenerC0417p.m1120L();
                if (m1120L.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0417p.f1313i0 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0417p.f1313i0);
                    }
                    dialogInterfaceOnCancelListenerC0417p.f1313i0.setContentView(m1120L);
                }
            }
        }
    }
}
