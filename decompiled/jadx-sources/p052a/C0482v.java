package p052a;

import android.window.OnBackInvokedCallback;
import p070g.LayoutInflaterFactory2C0887z;
import p104s1.InterfaceC1417a;
import p107t1.AbstractC1461d;

/* renamed from: a.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C0482v implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f1531a;

    /* renamed from: b */
    public final /* synthetic */ Object f1532b;

    public /* synthetic */ C0482v(int i, Object obj) {
        this.f1531a = i;
        this.f1532b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1531a) {
            case 0:
                InterfaceC1417a interfaceC1417a = (InterfaceC1417a) this.f1532b;
                AbstractC1461d.m3494e("$onBackInvoked", interfaceC1417a);
                interfaceC1417a.mo1164a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0887z) this.f1532b).m2443C();
                break;
            default:
                ((Runnable) this.f1532b).run();
                break;
        }
    }
}
