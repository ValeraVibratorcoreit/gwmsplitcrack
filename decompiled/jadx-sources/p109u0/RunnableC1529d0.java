package p109u0;

import com.altaysoft.t500_split.R;
import p098q0.AbstractC1372y1;

/* renamed from: u0.d0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1529d0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8178a;

    /* renamed from: b */
    public final /* synthetic */ C1541h0 f8179b;

    public /* synthetic */ RunnableC1529d0(C1541h0 c1541h0, int i) {
        this.f8178a = i;
        this.f8179b = c1541h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8178a) {
            case 0:
                C1541h0 c1541h0 = this.f8179b;
                c1541h0.getClass();
                if (!AbstractC1372y1.f6443m) {
                    c1541h0.m4269f();
                    AbstractC1539g1.m4215f(R.drawable.ip_theme_46_top_bar, c1541h0.f8301h, AbstractC1539g1.m4230m0(c1541h0.f8293d, c1541h0.f8295e));
                    break;
                }
                break;
            case 1:
                C1541h0 c1541h02 = this.f8179b;
                if (c1541h02.f8293d.f2652k3 && !AbstractC1372y1.f6443m) {
                    AbstractC1372y1.m3292W(c1541h02.f8291c, false);
                }
                c1541h02.m4265b(true);
                break;
            case 2:
                this.f8179b.m4263L();
                break;
            case 3:
                this.f8179b.m4264a();
                break;
            case 4:
                this.f8179b.m4277t();
                break;
            case 5:
                C1541h0 c1541h03 = this.f8179b;
                if (c1541h03.f8294d0) {
                    c1541h03.f8298f0 = false;
                    C1541h0.f8260q0 = false;
                    c1541h03.m4261J();
                    break;
                }
                break;
            case 6:
                C1541h0 c1541h04 = this.f8179b;
                if (c1541h04.f8293d.f2652k3) {
                    AbstractC1372y1.m3292W(c1541h04.f8291c, false);
                }
                c1541h04.m4260I(false);
                break;
            case 7:
                this.f8179b.m4269f();
                break;
            default:
                C1541h0 c1541h05 = this.f8179b;
                c1541h05.f8294d0 = false;
                c1541h05.f8300g0 = 0.0f;
                C1541h0.f8258o0 = 0.0f;
                AbstractC1372y1.m3287R(false, true);
                c1541h05.m4269f();
                break;
        }
    }
}
