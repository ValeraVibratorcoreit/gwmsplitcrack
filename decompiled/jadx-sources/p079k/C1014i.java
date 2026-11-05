package p079k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p016H.C0117i;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;

/* renamed from: k.i */
/* loaded from: classes.dex */
public final class C1014i implements InterfaceC1030y, AdapterView.OnItemClickListener {

    /* renamed from: f */
    public Context f4816f;

    /* renamed from: g */
    public LayoutInflater f4817g;

    /* renamed from: h */
    public MenuC1018m f4818h;

    /* renamed from: i */
    public ExpandedMenuView f4819i;

    /* renamed from: j */
    public InterfaceC1029x f4820j;

    /* renamed from: k */
    public C1013h f4821k;

    public C1014i(ContextWrapper contextWrapper) {
        this.f4816f = contextWrapper;
        this.f4817g = LayoutInflater.from(contextWrapper);
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: a */
    public final void mo2580a(MenuC1018m menuC1018m, boolean z2) {
        InterfaceC1029x interfaceC1029x = this.f4820j;
        if (interfaceC1029x != null) {
            interfaceC1029x.mo1874a(menuC1018m, z2);
        }
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: c */
    public final boolean mo2608c(C1020o c1020o) {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: d */
    public final boolean mo2581d(SubMenuC1005E subMenuC1005E) {
        if (!subMenuC1005E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC1019n dialogInterfaceOnKeyListenerC1019n = new DialogInterfaceOnKeyListenerC1019n();
        dialogInterfaceOnKeyListenerC1019n.f4853f = subMenuC1005E;
        Context context = subMenuC1005E.f4829a;
        C0117i c0117i = new C0117i(context);
        C0863b c0863b = (C0863b) c0117i.f369g;
        C1014i c1014i = new C1014i(c0863b.f4320a);
        dialogInterfaceOnKeyListenerC1019n.f4855h = c1014i;
        c1014i.f4820j = dialogInterfaceOnKeyListenerC1019n;
        subMenuC1005E.m2614b(c1014i, context);
        C1014i c1014i2 = dialogInterfaceOnKeyListenerC1019n.f4855h;
        if (c1014i2.f4821k == null) {
            c1014i2.f4821k = new C1013h(c1014i2);
        }
        c0863b.f4326g = c1014i2.f4821k;
        c0863b.f4327h = dialogInterfaceOnKeyListenerC1019n;
        View view = subMenuC1005E.f4843o;
        if (view != null) {
            c0863b.f4324e = view;
        } else {
            c0863b.f4322c = subMenuC1005E.f4842n;
            c0863b.f4323d = subMenuC1005E.f4841m;
        }
        c0863b.f4325f = dialogInterfaceOnKeyListenerC1019n;
        DialogInterfaceC0867f m365a = c0117i.m365a();
        dialogInterfaceOnKeyListenerC1019n.f4854g = m365a;
        m365a.setOnDismissListener(dialogInterfaceOnKeyListenerC1019n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC1019n.f4854g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC1019n.f4854g.show();
        InterfaceC1029x interfaceC1029x = this.f4820j;
        if (interfaceC1029x == null) {
            return true;
        }
        interfaceC1029x.mo1875b(subMenuC1005E);
        return true;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: e */
    public final boolean mo2609e(C1020o c1020o) {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: g */
    public final void mo2610g(Context context, MenuC1018m menuC1018m) {
        if (this.f4816f != null) {
            this.f4816f = context;
            if (this.f4817g == null) {
                this.f4817g = LayoutInflater.from(context);
            }
        }
        this.f4818h = menuC1018m;
        C1013h c1013h = this.f4821k;
        if (c1013h != null) {
            c1013h.notifyDataSetChanged();
        }
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: h */
    public final boolean mo2582h() {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: i */
    public final void mo2583i() {
        C1013h c1013h = this.f4821k;
        if (c1013h != null) {
            c1013h.notifyDataSetChanged();
        }
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: k */
    public final void mo2584k(InterfaceC1029x interfaceC1029x) {
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f4818h.m2621q(this.f4821k.getItem(i), this, 0);
    }
}
