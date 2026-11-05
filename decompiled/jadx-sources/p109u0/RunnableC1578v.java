package p109u0;

import com.sun.jna.Platform;
import p098q0.AbstractC1372y1;

/* renamed from: u0.v */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1578v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8834a;

    /* renamed from: b */
    public final /* synthetic */ C1474D f8835b;

    public /* synthetic */ RunnableC1578v(C1474D c1474d, int i) {
        this.f8834a = i;
        this.f8835b = c1474d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8834a) {
            case 0:
                this.f8835b.m3576t();
                break;
            case 1:
                this.f8835b.m3524F0();
                break;
            case 2:
                this.f8835b.m3572p();
                break;
            case 3:
                C1474D c1474d = this.f8835b;
                c1474d.m3548c0(c1474d.f7251e.m1753i());
                break;
            case 4:
                C1474D c1474d2 = this.f8835b;
                c1474d2.f7188A0.m3499a(c1474d2.f7278r);
                break;
            case 5:
                C1474D c1474d3 = this.f8835b;
                c1474d3.f7190B0.m3499a(c1474d3.f7280s);
                break;
            case 6:
                this.f8835b.m3568n();
                break;
            case 7:
                C1474D c1474d4 = this.f8835b;
                if (c1474d4.f7196E0) {
                    c1474d4.f7196E0 = false;
                    AbstractC1372y1.m3286Q(false);
                    c1474d4.m3544a(true);
                    break;
                }
                break;
            case 8:
                this.f8835b.m3575r();
                break;
            case Platform.GNU /* 9 */:
                C1474D c1474d5 = this.f8835b;
                c1474d5.f7210L0 = 1.0f;
                c1474d5.m3572p();
                break;
            case Platform.KFREEBSD /* 10 */:
                C1474D c1474d6 = this.f8835b;
                c1474d6.f7210L0 = 0.0f;
                c1474d6.f7198F0 = true;
                c1474d6.f7216O0 = false;
                AbstractC1372y1.m3287R(false, true);
                c1474d6.m3572p();
                c1474d6.m3516B();
                break;
            case Platform.NETBSD /* 11 */:
                this.f8835b.m3522E();
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                this.f8835b.m3577u();
                break;
            case 13:
                C1474D c1474d7 = this.f8835b;
                if (!c1474d7.f7198F0) {
                    c1474d7.f7208K0 = false;
                    c1474d7.m3523E0(false);
                    break;
                }
                break;
            default:
                this.f8835b.m3543Z();
                break;
        }
    }
}
