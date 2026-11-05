package p098q0;

import com.altaysoft.t500_split.cfgData;
import p109u0.C1537g;

/* renamed from: q0.x1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1369x1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6425a;

    /* renamed from: b */
    public final /* synthetic */ C1537g f6426b;

    public /* synthetic */ RunnableC1369x1(C1537g c1537g, int i) {
        this.f6425a = i;
        this.f6426b = c1537g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6425a) {
            case 0:
                C1537g c1537g = this.f6426b;
                cfgData m1784i = cfgData.m1784i();
                if (!m1784i.f2537K2 || !m1784i.f2652k3) {
                    AbstractC1372y1.f6443m = false;
                    AbstractC1372y1.f6447q = null;
                    break;
                } else if (!AbstractC1372y1.m3271B()) {
                    AbstractC1372y1.m3306l();
                    AbstractC1372y1.f6443m = false;
                    AbstractC1372y1.f6447q = null;
                    break;
                } else {
                    AbstractC1372y1.f6443m = false;
                    AbstractC1372y1.m3292W(c1537g, false);
                    AbstractC1372y1.f6447q = null;
                    break;
                }
                break;
            default:
                this.f6426b.m4175c();
                break;
        }
    }
}
