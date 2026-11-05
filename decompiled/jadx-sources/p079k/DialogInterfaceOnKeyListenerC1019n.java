package p079k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p070g.DialogInterfaceC0867f;

/* renamed from: k.n */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC1019n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1029x {

    /* renamed from: f */
    public SubMenuC1005E f4853f;

    /* renamed from: g */
    public DialogInterfaceC0867f f4854g;

    /* renamed from: h */
    public C1014i f4855h;

    @Override // p079k.InterfaceC1029x
    /* renamed from: a */
    public final void mo1874a(MenuC1018m menuC1018m, boolean z2) {
        DialogInterfaceC0867f dialogInterfaceC0867f;
        if ((z2 || menuC1018m == this.f4853f) && (dialogInterfaceC0867f = this.f4854g) != null) {
            dialogInterfaceC0867f.dismiss();
        }
    }

    @Override // p079k.InterfaceC1029x
    /* renamed from: b */
    public final boolean mo1875b(MenuC1018m menuC1018m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1014i c1014i = this.f4855h;
        if (c1014i.f4821k == null) {
            c1014i.f4821k = new C1013h(c1014i);
        }
        this.f4853f.m2621q(c1014i.f4821k.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f4855h.mo2580a(this.f4853f, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1005E subMenuC1005E = this.f4853f;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4854g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4854g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1005E.m2615c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1005E.performShortcut(i, keyEvent, 0);
    }
}
