package p109u0;

import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import p098q0.AbstractC1372y1;

/* renamed from: u0.r0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1571r0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8673a;

    /* renamed from: b */
    public final /* synthetic */ C1583x0 f8674b;

    public /* synthetic */ RunnableC1571r0(C1583x0 c1583x0, int i) {
        this.f8673a = i;
        this.f8674b = c1583x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8673a) {
            case 0:
                C1583x0 c1583x0 = this.f8674b;
                c1583x0.m4737z0(c1583x0.f8911e.m1753i());
                break;
            case 1:
                this.f8674b.m4709q(false);
                break;
            case 2:
                this.f8674b.m4709q(false);
                break;
            case 3:
                this.f8674b.m4709q(false);
                break;
            case 4:
                this.f8674b.m4718t();
                break;
            case 5:
                this.f8674b.m4735y1();
                break;
            case 6:
                this.f8674b.m4730x();
                break;
            case 7:
                this.f8674b.m4643G0();
                break;
            case 8:
                this.f8674b.m4709q(false);
                break;
            case Platform.GNU /* 9 */:
                C1583x0 c1583x02 = this.f8674b;
                c1583x02.f8886T0 = 1.0f;
                c1583x02.m4727w();
                break;
            case Platform.KFREEBSD /* 10 */:
                C1583x0 c1583x03 = this.f8674b;
                c1583x03.f8886T0 = 0.0f;
                c1583x03.f8874N0 = true;
                c1583x03.f8892W0 = false;
                AbstractC1372y1.m3287R(false, true);
                c1583x03.m4727w();
                c1583x03.m4647J();
                break;
            case Platform.NETBSD /* 11 */:
                C1583x0 c1583x04 = this.f8674b;
                int height = c1583x04.f8875O.getHeight();
                if (height > 0) {
                    C1583x0.m4615X0(c1583x04.f8885T, height);
                    break;
                }
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                this.f8674b.m4636D();
                break;
            case 13:
                C1583x0 c1583x05 = this.f8674b;
                c1583x05.f8860G0.m4470a(c1583x05.f8950r);
                break;
            case 14:
                C1583x0 c1583x06 = this.f8674b;
                c1583x06.f8862H0.m4470a(c1583x06.f8953s);
                break;
            case 15:
                C1583x0 c1583x07 = this.f8674b;
                c1583x07.f8864I0.m4470a(c1583x07.f8955t);
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                C1583x0 c1583x08 = this.f8674b;
                c1583x08.f8866J0.m4470a(c1583x08.f8957u);
                break;
            case 17:
                C1583x0 c1583x09 = this.f8674b;
                if (!c1583x09.f8874N0) {
                    c1583x09.f8884S0 = false;
                    c1583x09.m4726v1(false);
                    break;
                }
                break;
            case 18:
                C1583x0 c1583x010 = this.f8674b;
                if (c1583x010.m4695l0() && !c1583x010.f8928j1) {
                    float m4720t1 = c1583x010.m4720t1();
                    if (Math.abs(c1583x010.f8916f1 - m4720t1) > 0.001f) {
                        c1583x010.f8916f1 = m4720t1;
                        c1583x010.m4636D();
                        break;
                    }
                }
                break;
            case 19:
                C1583x0 c1583x011 = this.f8674b;
                if (c1583x011.f8872M0) {
                    c1583x011.f8872M0 = false;
                    AbstractC1372y1.m3286Q(false);
                    c1583x011.m4671b(true);
                    break;
                }
                break;
            case 20:
                this.f8674b.m4727w();
                break;
            case 21:
                this.f8674b.m4655N();
                break;
            case 22:
                this.f8674b.m4698m0();
                break;
            default:
                this.f8674b.m4725v0();
                break;
        }
    }
}
