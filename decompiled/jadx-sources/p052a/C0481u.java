package p052a;

import p087m1.C1169d;
import p104s1.InterfaceC1417a;
import p107t1.AbstractC1462e;

/* renamed from: a.u */
/* loaded from: classes.dex */
public final class C0481u extends AbstractC1462e implements InterfaceC1417a {

    /* renamed from: b */
    public final /* synthetic */ int f1529b;

    /* renamed from: c */
    public final /* synthetic */ C0457C f1530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0481u(C0457C c0457c, int i) {
        super(0);
        this.f1529b = i;
        this.f1530c = c0457c;
    }

    @Override // p104s1.InterfaceC1417a
    /* renamed from: a */
    public final Object mo1164a() {
        switch (this.f1529b) {
            case 0:
                this.f1530c.m1168b();
                break;
            case 1:
                this.f1530c.m1167a();
                break;
            default:
                this.f1530c.m1168b();
                break;
        }
        return C1169d.f5345c;
    }
}
