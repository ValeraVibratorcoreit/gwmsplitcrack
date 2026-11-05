package p046X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.l */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0413l implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0417p f1299f;

    public DialogInterfaceOnCancelListenerC0413l(DialogInterfaceOnCancelListenerC0417p dialogInterfaceOnCancelListenerC0417p) {
        this.f1299f = dialogInterfaceOnCancelListenerC0417p;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0417p dialogInterfaceOnCancelListenerC0417p = this.f1299f;
        Dialog dialog = dialogInterfaceOnCancelListenerC0417p.f1313i0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0417p.onCancel(dialog);
        }
    }
}
