package p046X;

import android.app.Dialog;
import android.view.View;
import p121y0.AbstractC1680h;

/* renamed from: X.o */
/* loaded from: classes.dex */
public final class C0416o extends AbstractC1680h {

    /* renamed from: k */
    public final /* synthetic */ C0419r f1302k;

    /* renamed from: l */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0417p f1303l;

    public C0416o(DialogInterfaceOnCancelListenerC0417p dialogInterfaceOnCancelListenerC0417p, C0419r c0419r) {
        this.f1303l = dialogInterfaceOnCancelListenerC0417p;
        this.f1302k = c0419r;
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: F */
    public final View mo1101F(int i) {
        C0419r c0419r = this.f1302k;
        if (c0419r.mo1102I()) {
            return c0419r.mo1101F(i);
        }
        Dialog dialog = this.f1303l.f1313i0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: I */
    public final boolean mo1102I() {
        return this.f1302k.mo1102I() || this.f1303l.f1317m0;
    }
}
