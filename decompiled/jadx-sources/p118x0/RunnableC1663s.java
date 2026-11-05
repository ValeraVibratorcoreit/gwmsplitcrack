package p118x0;

/* renamed from: x0.s */
/* loaded from: classes.dex */
public final class RunnableC1663s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9477a;

    /* renamed from: b */
    public final /* synthetic */ C1670z f9478b;

    public /* synthetic */ RunnableC1663s(C1670z c1670z, int i) {
        this.f9477a = i;
        this.f9478b = c1670z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1666v interfaceC1666v;
        switch (this.f9477a) {
            case 0:
                InterfaceC1666v interfaceC1666v2 = this.f9478b.f9529d;
                if (interfaceC1666v2 != null) {
                    this.f9478b.m4831i(true, interfaceC1666v2);
                    break;
                }
                break;
            case 1:
                C1670z c1670z = this.f9478b;
                if (c1670z.f9531f) {
                    InterfaceC1666v interfaceC1666v3 = c1670z.f9529d;
                    if (interfaceC1666v3 != null) {
                        C1670z c1670z2 = this.f9478b;
                        if (!c1670z2.f9533h) {
                            c1670z2.m4829g(interfaceC1666v3);
                            long currentTimeMillis = System.currentTimeMillis();
                            C1670z c1670z3 = this.f9478b;
                            if (currentTimeMillis - c1670z3.f9532g >= 900000) {
                                c1670z3.m4834l();
                                break;
                            } else {
                                c1670z3.f9528c.postDelayed(this, 5000L);
                                break;
                            }
                        }
                    }
                    this.f9478b.m4834l();
                    break;
                }
                break;
            default:
                C1670z c1670z4 = this.f9478b;
                c1670z4.f9535j = false;
                if (c1670z4.f9531f && !c1670z4.f9533h && (interfaceC1666v = c1670z4.f9529d) != null) {
                    this.f9478b.f9534i = System.currentTimeMillis();
                    this.f9478b.m4831i(true, interfaceC1666v);
                    break;
                }
                break;
        }
    }
}
