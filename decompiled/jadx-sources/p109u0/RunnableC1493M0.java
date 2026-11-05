package p109u0;

import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import p098q0.AbstractC1372y1;

/* renamed from: u0.M0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1493M0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7654a;

    /* renamed from: b */
    public final /* synthetic */ C1506T0 f7655b;

    public /* synthetic */ RunnableC1493M0(C1506T0 c1506t0, int i) {
        this.f7654a = i;
        this.f7655b = c1506t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7654a) {
            case 0:
                C1506T0 c1506t0 = this.f7655b;
                c1506t0.m4039v0(c1506t0.f7829e.m1753i());
                break;
            case 1:
                this.f7655b.m4020p(false);
                break;
            case 2:
                this.f7655b.m4020p(false);
                break;
            case 3:
                C1506T0 c1506t02 = this.f7655b;
                if (!c1506t02.f7784J0) {
                    c1506t02.f7794O0 = false;
                    c1506t02.m4025q1(false);
                    break;
                }
                break;
            case 4:
                C1506T0 c1506t03 = this.f7655b;
                if (c1506t03.m4006k0() && !c1506t03.f7828d1) {
                    float m4019o1 = c1506t03.m4019o1();
                    if (Math.abs(c1506t03.f7816Z0 - m4019o1) > 0.001f) {
                        c1506t03.f7816Z0 = m4019o1;
                        c1506t03.m3947D();
                        break;
                    }
                }
                break;
            case 5:
                this.f7655b.m4031s1();
                break;
            case 6:
                C1506T0 c1506t04 = this.f7655b;
                c1506t04.f7796P0 = 1.0f;
                c1506t04.m4038v();
                break;
            case 7:
                this.f7655b.m4020p(false);
                break;
            case 8:
                C1506T0 c1506t05 = this.f7655b;
                c1506t05.f7796P0 = 0.0f;
                c1506t05.f7784J0 = true;
                c1506t05.f7802S0 = false;
                AbstractC1372y1.m3287R(false, true);
                c1506t05.m4038v();
                c1506t05.m3956I();
                break;
            case Platform.GNU /* 9 */:
                this.f7655b.m3946C0();
                break;
            case Platform.KFREEBSD /* 10 */:
                this.f7655b.m4009l0();
                break;
            case Platform.NETBSD /* 11 */:
                C1506T0 c1506t06 = this.f7655b;
                int height = c1506t06.f7785K.getHeight();
                if (height > 0) {
                    C1506T0.m3931U0(c1506t06.f7795P, height);
                    break;
                }
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                C1506T0 c1506t07 = this.f7655b;
                c1506t07.f7770C0.m3920a(c1506t07.f7863r);
                break;
            case 13:
                C1506T0 c1506t08 = this.f7655b;
                c1506t08.f7772D0.m3920a(c1506t08.f7865s);
                break;
            case 14:
                C1506T0 c1506t09 = this.f7655b;
                c1506t09.f7774E0.m3920a(c1506t09.f7867t);
                break;
            case 15:
                C1506T0 c1506t010 = this.f7655b;
                c1506t010.f7776F0.m3920a(c1506t010.f7869u);
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                this.f7655b.m3947D();
                break;
            case 17:
                this.f7655b.m4020p(false);
                break;
            case 18:
                this.f7655b.m4041w();
                break;
            case 19:
                this.f7655b.m4029s();
                break;
            case 20:
                C1506T0 c1506t011 = this.f7655b;
                if (c1506t011.f7782I0) {
                    c1506t011.f7782I0 = false;
                    AbstractC1372y1.m3286Q(false);
                    c1506t011.m3981a(true);
                    break;
                }
                break;
            case 21:
                this.f7655b.m3963M();
                break;
            case 22:
                this.f7655b.m4038v();
                break;
            default:
                this.f7655b.m4030s0();
                break;
        }
    }
}
