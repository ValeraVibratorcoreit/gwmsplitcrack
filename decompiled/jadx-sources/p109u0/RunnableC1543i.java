package p109u0;

import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import p098q0.AbstractC1372y1;

/* renamed from: u0.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1543i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8334a;

    /* renamed from: b */
    public final /* synthetic */ C1576u f8335b;

    public /* synthetic */ RunnableC1543i(C1576u c1576u, int i) {
        this.f8334a = i;
        this.f8335b = c1576u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8334a) {
            case 0:
                C1576u c1576u = this.f8335b;
                if (!c1576u.f8764d1) {
                    c1576u.f8779i1 = false;
                    c1576u.m4593v1(false);
                    break;
                }
                break;
            case 1:
                C1576u c1576u2 = this.f8335b;
                c1576u2.f8782j1 = 1.0f;
                c1576u2.m4603z();
                break;
            case 2:
                C1576u c1576u3 = this.f8335b;
                c1576u3.f8782j1 = 0.0f;
                c1576u3.f8764d1 = true;
                c1576u3.f8791m1 = false;
                AbstractC1372y1.m3287R(false, true);
                c1576u3.m4603z();
                c1576u3.m4517L();
                break;
            case 3:
                this.f8335b.m4594w();
                break;
            case 4:
                this.f8335b.m4602y1();
                break;
            case 5:
                C1576u c1576u4 = this.f8335b;
                c1576u4.f8746W0.m4470a(c1576u4.f8804r);
                c1576u4.m4579q1(c1576u4.f8804r);
                break;
            case 6:
                C1576u c1576u5 = this.f8335b;
                c1576u5.f8748X0.m4470a(c1576u5.f8807s);
                c1576u5.m4579q1(c1576u5.f8807s);
                break;
            case 7:
                C1576u c1576u6 = this.f8335b;
                c1576u6.f8750Y0.m4470a(c1576u6.f8704D);
                break;
            case 8:
                C1576u c1576u7 = this.f8335b;
                c1576u7.f8752Z0.m4470a(c1576u7.f8707E);
                break;
            case Platform.GNU /* 9 */:
                C1576u c1576u8 = this.f8335b;
                int height = c1576u8.f8754a0.getHeight();
                if (height > 0) {
                    C1576u.m4481X0(c1576u8.f8769f0, height);
                    break;
                }
                break;
            case Platform.KFREEBSD /* 10 */:
                this.f8335b.m4511H0();
                break;
            case Platform.NETBSD /* 11 */:
                this.f8335b.m4506F();
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                this.f8335b.m4494A();
                break;
            case 13:
                this.f8335b.m4595w0();
                break;
            case 14:
                C1576u c1576u9 = this.f8335b;
                c1576u9.m4495A0(c1576u9.f8765e.m1753i());
                break;
            case 15:
                C1576u c1576u10 = this.f8335b;
                if (c1576u10.m4572o0() && !c1576u10.f8824x1) {
                    float m4584s1 = c1576u10.m4584s1();
                    if (Math.abs(c1576u10.f8812t1 - m4584s1) > 0.001f) {
                        c1576u10.f8812t1 = m4584s1;
                        c1576u10.m4506F();
                        break;
                    }
                }
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                this.f8335b.m4603z();
                break;
            case 17:
                C1576u c1576u11 = this.f8335b;
                if (c1576u11.f8761c1) {
                    c1576u11.f8761c1 = false;
                    AbstractC1372y1.m3286Q(false);
                    c1576u11.m4539b(true);
                    break;
                }
                break;
            case 18:
                this.f8335b.m4585t(false);
                break;
            case 19:
                this.f8335b.m4524P();
                break;
            case 20:
                this.f8335b.m4585t(false);
                break;
            case 21:
                this.f8335b.m4585t(false);
                break;
            default:
                this.f8335b.m4585t(false);
                break;
        }
    }
}
