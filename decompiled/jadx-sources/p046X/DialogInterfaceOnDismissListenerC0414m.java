package p046X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.m */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0414m implements DialogInterface.OnDismissListener {

    /* renamed from: f */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0417p f1300f;

    public DialogInterfaceOnDismissListenerC0414m(DialogInterfaceOnCancelListenerC0417p dialogInterfaceOnCancelListenerC0417p) {
        this.f1300f = dialogInterfaceOnCancelListenerC0417p;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0417p dialogInterfaceOnCancelListenerC0417p = this.f1300f;
        Dialog dialog = dialogInterfaceOnCancelListenerC0417p.f1313i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0417p.onDismiss(dialog);
        }
    }
}
