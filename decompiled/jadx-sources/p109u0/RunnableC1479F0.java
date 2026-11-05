package p109u0;

import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import p098q0.AbstractC1372y1;

/* renamed from: u0.F0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1479F0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7427a;

    /* renamed from: b */
    public final /* synthetic */ C1491L0 f7428b;

    public /* synthetic */ RunnableC1479F0(C1491L0 c1491l0, int i) {
        this.f7427a = i;
        this.f7428b = c1491l0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7427a) {
            case 0:
                C1491L0 c1491l0 = this.f7428b;
                c1491l0.m3778B0(c1491l0.f7594e.m1753i());
                break;
            case 1:
                this.f7428b.m3858q(false);
                break;
            case 2:
                this.f7428b.m3858q(false);
                break;
            case 3:
                C1491L0 c1491l02 = this.f7428b;
                if (!c1491l02.f7557N0) {
                    c1491l02.f7567S0 = false;
                    c1491l02.m3881x1(false);
                    break;
                }
                break;
            case 4:
                this.f7428b.m3876w();
                break;
            case 5:
                this.f7428b.m3858q(false);
                break;
            case 6:
                this.f7428b.m3879x();
                break;
            case 7:
                C1491L0 c1491l03 = this.f7428b;
                int height = c1491l03.f7558O.getHeight();
                if (height > 0) {
                    C1491L0.m3763Z0(c1491l03.f7568T, height);
                    break;
                }
                break;
            case 8:
                this.f7428b.m3795I0();
                break;
            case Platform.GNU /* 9 */:
                this.f7428b.m3853o0();
                break;
            case Platform.KFREEBSD /* 10 */:
                C1491L0 c1491l04 = this.f7428b;
                c1491l04.f7569T0 = 1.0f;
                c1491l04.m3876w();
                break;
            case Platform.NETBSD /* 11 */:
                C1491L0 c1491l05 = this.f7428b;
                c1491l05.f7569T0 = 0.0f;
                c1491l05.f7557N0 = true;
                c1491l05.f7575W0 = false;
                AbstractC1372y1.m3287R(false, true);
                c1491l05.m3876w();
                c1491l05.m3796J();
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                C1491L0 c1491l06 = this.f7428b;
                if (c1491l06.m3850n0() && !c1491l06.f7611j1) {
                    float m3875v1 = c1491l06.m3875v1();
                    if (Math.abs(c1491l06.f7599f1 - m3875v1) > 0.001f) {
                        c1491l06.f7599f1 = m3875v1;
                        c1491l06.m3783D();
                        break;
                    }
                }
                break;
            case 13:
                this.f7428b.m3858q(false);
                break;
            case 14:
                C1491L0 c1491l07 = this.f7428b;
                c1491l07.f7543G0.m4470a(c1491l07.f7633r);
                break;
            case 15:
                C1491L0 c1491l08 = this.f7428b;
                c1491l08.f7545H0.m4470a(c1491l08.f7636s);
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                C1491L0 c1491l09 = this.f7428b;
                c1491l09.f7547I0.m4470a(c1491l09.f7638t);
                break;
            case 17:
                C1491L0 c1491l010 = this.f7428b;
                c1491l010.f7549J0.m4470a(c1491l010.f7640u);
                break;
            case 18:
                this.f7428b.m3776A1();
                break;
            case 19:
                C1491L0 c1491l011 = this.f7428b;
                if (c1491l011.f7555M0) {
                    c1491l011.f7555M0 = false;
                    AbstractC1372y1.m3286Q(false);
                    c1491l011.m3822b(true);
                    break;
                }
                break;
            case 20:
                this.f7428b.m3783D();
                break;
            case 21:
                this.f7428b.m3804N();
                break;
            case 22:
                this.f7428b.m3867t();
                break;
            default:
                this.f7428b.m3880x0();
                break;
        }
    }
}
