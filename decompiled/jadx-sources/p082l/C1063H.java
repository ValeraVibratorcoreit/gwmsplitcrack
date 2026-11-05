package p082l;

import p079k.InterfaceC1003C;

/* renamed from: l.H */
/* loaded from: classes.dex */
public final class C1063H extends AbstractViewOnTouchListenerC1136q0 {

    /* renamed from: o */
    public final /* synthetic */ C1073M f5043o;

    /* renamed from: p */
    public final /* synthetic */ C1079P f5044p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063H(C1079P c1079p, C1079P c1079p2, C1073M c1073m) {
        super(c1079p2);
        this.f5044p = c1079p;
        this.f5043o = c1073m;
    }

    @Override // p082l.AbstractViewOnTouchListenerC1136q0
    /* renamed from: b */
    public final InterfaceC1003C mo2602b() {
        return this.f5043o;
    }

    @Override // p082l.AbstractViewOnTouchListenerC1136q0
    /* renamed from: c */
    public final boolean mo2603c() {
        C1079P c1079p = this.f5044p;
        if (c1079p.getInternalPopup().mo2678b()) {
            return true;
        }
        c1079p.f5093k.mo2680e(c1079p.getTextDirection(), c1079p.getTextAlignment());
        return true;
    }
}
