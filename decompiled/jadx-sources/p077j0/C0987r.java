package p077j0;

/* renamed from: j0.r */
/* loaded from: classes.dex */
public final class C0987r extends AbstractC0983n {

    /* renamed from: a */
    public final /* synthetic */ int f4723a = 1;

    /* renamed from: b */
    public AbstractC0982m f4724b;

    public /* synthetic */ C0987r() {
    }

    @Override // p077j0.AbstractC0983n, p077j0.InterfaceC0980k
    /* renamed from: b */
    public void mo2515b(AbstractC0982m abstractC0982m) {
        switch (this.f4723a) {
            case 1:
                C0970a c0970a = (C0970a) this.f4724b;
                if (!c0970a.f4657D) {
                    c0970a.m2552G();
                    c0970a.f4657D = true;
                    break;
                }
                break;
        }
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: e */
    public final void mo2517e(AbstractC0982m abstractC0982m) {
        switch (this.f4723a) {
            case 0:
                this.f4724b.mo2538z();
                abstractC0982m.mo2536x(this);
                break;
            default:
                C0970a c0970a = (C0970a) this.f4724b;
                int i = c0970a.f4656C - 1;
                c0970a.f4656C = i;
                if (i == 0) {
                    c0970a.f4657D = false;
                    c0970a.m2557m();
                }
                abstractC0982m.mo2536x(this);
                break;
        }
    }

    public C0987r(AbstractC0982m abstractC0982m) {
        this.f4724b = abstractC0982m;
    }
}
