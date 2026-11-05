package p109u0;

import p098q0.AbstractC1372y1;

/* renamed from: u0.E */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1476E implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7298a;

    /* renamed from: b */
    public final /* synthetic */ C1488K f7299b;

    public /* synthetic */ RunnableC1476E(C1488K c1488k, int i) {
        this.f7298a = i;
        this.f7299b = c1488k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7298a) {
            case 0:
                this.f7299b.m3729B();
                break;
            case 1:
                this.f7299b.m3741m();
                break;
            case 2:
                this.f7299b.m3728A();
                break;
            case 3:
                C1488K c1488k = this.f7299b;
                if (c1488k.f7500n0) {
                    c1488k.f7504p0 = false;
                    c1488k.m3730C();
                    break;
                }
                break;
            case 4:
                this.f7299b.m3731D();
                break;
            default:
                C1488K c1488k2 = this.f7299b;
                c1488k2.f7500n0 = false;
                c1488k2.f7506q0 = 0.0f;
                AbstractC1372y1.m3287R(false, true);
                c1488k2.m3735d();
                break;
        }
    }
}
