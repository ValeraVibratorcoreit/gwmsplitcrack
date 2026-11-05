package p109u0;

import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import p098q0.AbstractC1372y1;

/* renamed from: u0.i0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1544i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8336a;

    /* renamed from: b */
    public final /* synthetic */ C1568q0 f8337b;

    public /* synthetic */ RunnableC1544i0(C1568q0 c1568q0, int i) {
        this.f8336a = i;
        this.f8337b = c1568q0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8336a) {
            case 0:
                this.f8337b.m4419q(false);
                break;
            case 1:
                this.f8337b.m4408m0();
                break;
            case 2:
                this.f8337b.m4435v0();
                break;
            case 3:
                this.f8337b.m4419q(false);
                break;
            case 4:
                C1568q0 c1568q0 = this.f8337b;
                if (!c1568q0.f8573P0) {
                    c1568q0.f8583U0 = false;
                    c1568q0.m4436v1(false);
                    break;
                }
                break;
            case 5:
                C1568q0 c1568q02 = this.f8337b;
                c1568q02.m4447z0(c1568q02.f8606e.m1753i());
                break;
            case 6:
                this.f8337b.m4419q(false);
                break;
            case 7:
                this.f8337b.m4428t();
                break;
            case 8:
                this.f8337b.m4437w();
                break;
            case Platform.GNU /* 9 */:
                C1568q0 c1568q03 = this.f8337b;
                int height = c1568q03.f8570O.getHeight();
                if (height > 0) {
                    C1568q0.m4324W0(c1568q03.f8584V, height);
                    break;
                }
                break;
            case Platform.KFREEBSD /* 10 */:
                this.f8337b.m4345D();
                break;
            case Platform.NETBSD /* 11 */:
                this.f8337b.m4445y1();
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                C1568q0 c1568q04 = this.f8337b;
                c1568q04.f8585V0 = 1.0f;
                c1568q04.m4437w();
                break;
            case 13:
                this.f8337b.m4419q(false);
                break;
            case 14:
                C1568q0 c1568q05 = this.f8337b;
                c1568q05.f8585V0 = 0.0f;
                c1568q05.f8573P0 = true;
                c1568q05.f8591Y0 = false;
                AbstractC1372y1.m3287R(false, true);
                c1568q05.m4437w();
                c1568q05.m4356J();
                break;
            case 15:
                C1568q0 c1568q06 = this.f8337b;
                c1568q06.f8559I0.m4470a(c1568q06.f8645r);
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                C1568q0 c1568q07 = this.f8337b;
                c1568q07.f8561J0.m4470a(c1568q07.f8648s);
                break;
            case 17:
                C1568q0 c1568q08 = this.f8337b;
                c1568q08.f8563K0.m4470a(c1568q08.f8651t);
                break;
            case 18:
                C1568q0 c1568q09 = this.f8337b;
                c1568q09.f8565L0.m4470a(c1568q09.f8654u);
                break;
            case 19:
                C1568q0 c1568q010 = this.f8337b;
                if (c1568q010.f8571O0) {
                    c1568q010.f8571O0 = false;
                    AbstractC1372y1.m3286Q(false);
                    c1568q010.m4380b(true);
                    break;
                }
                break;
            case 20:
                this.f8337b.m4352G0();
                break;
            case 21:
                this.f8337b.m4364N();
                break;
            case 22:
                C1568q0 c1568q011 = this.f8337b;
                if (c1568q011.m4405l0() && !c1568q011.f8629l1) {
                    float m4430t1 = c1568q011.m4430t1();
                    if (Math.abs(c1568q011.f8617h1 - m4430t1) > 0.001f) {
                        c1568q011.f8617h1 = m4430t1;
                        c1568q011.m4345D();
                        break;
                    }
                }
                break;
            default:
                this.f8337b.m4440x();
                break;
        }
    }
}
