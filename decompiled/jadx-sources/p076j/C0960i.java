package p076j;

import p010D1.AbstractC0088l;
import p082l.C1097Y0;

/* renamed from: j.i */
/* loaded from: classes.dex */
public final class C0960i extends AbstractC0088l {

    /* renamed from: c */
    public final /* synthetic */ int f4623c;

    /* renamed from: d */
    public boolean f4624d;

    /* renamed from: e */
    public int f4625e;

    /* renamed from: f */
    public final /* synthetic */ Object f4626f;

    public C0960i(C0961j c0961j) {
        this.f4623c = 0;
        this.f4626f = c0961j;
        this.f4624d = false;
        this.f4625e = 0;
    }

    @Override // p022K.InterfaceC0176Y
    /* renamed from: a */
    public final void mo525a() {
        switch (this.f4623c) {
            case 0:
                int i = this.f4625e + 1;
                this.f4625e = i;
                C0961j c0961j = (C0961j) this.f4626f;
                if (i == c0961j.f4627a.size()) {
                    AbstractC0088l abstractC0088l = c0961j.f4630d;
                    if (abstractC0088l != null) {
                        abstractC0088l.mo525a();
                    }
                    this.f4625e = 0;
                    this.f4624d = false;
                    c0961j.f4631e = false;
                    break;
                }
                break;
            default:
                if (!this.f4624d) {
                    ((C1097Y0) this.f4626f).f5132a.setVisibility(this.f4625e);
                    break;
                }
                break;
        }
    }

    @Override // p010D1.AbstractC0088l, p022K.InterfaceC0176Y
    /* renamed from: b */
    public void mo299b() {
        switch (this.f4623c) {
            case 1:
                this.f4624d = true;
                break;
        }
    }

    @Override // p010D1.AbstractC0088l, p022K.InterfaceC0176Y
    /* renamed from: c */
    public final void mo301c() {
        switch (this.f4623c) {
            case 0:
                if (!this.f4624d) {
                    this.f4624d = true;
                    AbstractC0088l abstractC0088l = ((C0961j) this.f4626f).f4630d;
                    if (abstractC0088l != null) {
                        abstractC0088l.mo301c();
                        break;
                    }
                }
                break;
            default:
                ((C1097Y0) this.f4626f).f5132a.setVisibility(0);
                break;
        }
    }

    public C0960i(C1097Y0 c1097y0, int i) {
        this.f4623c = 1;
        this.f4626f = c1097y0;
        this.f4625e = i;
        this.f4624d = false;
    }
}
