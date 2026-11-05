package p109u0;

import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import p098q0.AbstractC1372y1;

/* renamed from: u0.y0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1585y0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8974a;

    /* renamed from: b */
    public final /* synthetic */ C1477E0 f8975b;

    public /* synthetic */ RunnableC1585y0(C1477E0 c1477e0, int i) {
        this.f8974a = i;
        this.f8975b = c1477e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8974a) {
            case 0:
                C1477E0 c1477e0 = this.f8975b;
                c1477e0.m3612B0(c1477e0.f7367e.m1753i());
                break;
            case 1:
                this.f8975b.m3714x0();
                break;
            case 2:
                this.f8975b.m3692q(false);
                break;
            case 3:
                this.f8975b.m3692q(false);
                break;
            case 4:
                C1477E0 c1477e02 = this.f8975b;
                if (!c1477e02.f7330N0) {
                    c1477e02.f7340S0 = false;
                    c1477e02.m3715x1(false);
                    break;
                }
                break;
            case 5:
                this.f8975b.m3692q(false);
                break;
            case 6:
                this.f8975b.m3701t();
                break;
            case 7:
                C1477E0 c1477e03 = this.f8975b;
                int height = c1477e03.f7331O.getHeight();
                if (height > 0) {
                    C1477E0.m3597Z0(c1477e03.f7341T, height);
                    break;
                }
                break;
            case 8:
                this.f8975b.m3687o0();
                break;
            case Platform.GNU /* 9 */:
                C1477E0 c1477e04 = this.f8975b;
                if (c1477e04.m3684n0() && !c1477e04.f7384j1) {
                    float m3709v1 = c1477e04.m3709v1();
                    if (Math.abs(c1477e04.f7372f1 - m3709v1) > 0.001f) {
                        c1477e04.f7372f1 = m3709v1;
                        c1477e04.m3617D();
                        break;
                    }
                }
                break;
            case Platform.KFREEBSD /* 10 */:
                this.f8975b.m3629I0();
                break;
            case Platform.NETBSD /* 11 */:
                C1477E0 c1477e05 = this.f8975b;
                c1477e05.f7316G0.m4470a(c1477e05.f7406r);
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                C1477E0 c1477e06 = this.f8975b;
                c1477e06.f7318H0.m4470a(c1477e06.f7409s);
                break;
            case 13:
                this.f8975b.m3692q(false);
                break;
            case 14:
                C1477E0 c1477e07 = this.f8975b;
                c1477e07.f7320I0.m4470a(c1477e07.f7411t);
                break;
            case 15:
                C1477E0 c1477e08 = this.f8975b;
                c1477e08.f7322J0.m4470a(c1477e08.f7413u);
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                C1477E0 c1477e09 = this.f8975b;
                c1477e09.f7342T0 = 1.0f;
                c1477e09.m3710w();
                break;
            case 17:
                C1477E0 c1477e010 = this.f8975b;
                c1477e010.f7342T0 = 0.0f;
                c1477e010.f7330N0 = true;
                c1477e010.f7348W0 = false;
                AbstractC1372y1.m3287R(false, true);
                c1477e010.m3710w();
                c1477e010.m3630J();
                break;
            case 18:
                this.f8975b.m3713x();
                break;
            case 19:
                C1477E0 c1477e011 = this.f8975b;
                if (c1477e011.f7328M0) {
                    c1477e011.f7328M0 = false;
                    AbstractC1372y1.m3286Q(false);
                    c1477e011.m3656b(true);
                    break;
                }
                break;
            case 20:
                this.f8975b.m3617D();
                break;
            case 21:
                this.f8975b.m3638N();
                break;
            case 22:
                this.f8975b.m3710w();
                break;
            default:
                this.f8975b.m3610A1();
                break;
        }
    }
}
