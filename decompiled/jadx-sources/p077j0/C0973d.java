package p077j0;

import android.view.ViewGroup;
import p121y0.AbstractC1680h;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class C0973d extends AbstractC0983n {

    /* renamed from: a */
    public boolean f4660a = false;

    /* renamed from: b */
    public final ViewGroup f4661b;

    public C0973d(ViewGroup viewGroup) {
        this.f4661b = viewGroup;
    }

    @Override // p077j0.AbstractC0983n, p077j0.InterfaceC0980k
    /* renamed from: a */
    public final void mo2514a(AbstractC0982m abstractC0982m) {
        AbstractC1680h.m4861W(this.f4661b, false);
        this.f4660a = true;
    }

    @Override // p077j0.AbstractC0983n, p077j0.InterfaceC0980k
    /* renamed from: d */
    public final void mo2516d() {
        AbstractC1680h.m4861W(this.f4661b, false);
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: e */
    public final void mo2517e(AbstractC0982m abstractC0982m) {
        if (!this.f4660a) {
            AbstractC1680h.m4861W(this.f4661b, false);
        }
        abstractC0982m.mo2536x(this);
    }

    @Override // p077j0.AbstractC0983n, p077j0.InterfaceC0980k
    /* renamed from: f */
    public final void mo2518f() {
        AbstractC1680h.m4861W(this.f4661b, true);
    }
}
