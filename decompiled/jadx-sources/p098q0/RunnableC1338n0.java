package p098q0;

import android.os.Handler;
import android.os.Looper;
import com.altaysoft.t500_split.cfgData;
import p001A0.RunnableC0018l;

/* renamed from: q0.n0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1338n0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6298a;

    /* renamed from: b */
    public final /* synthetic */ C1344p0 f6299b;

    public /* synthetic */ RunnableC1338n0(C1344p0 c1344p0, int i) {
        this.f6298a = i;
        this.f6299b = c1344p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6298a) {
            case 0:
                C1344p0 c1344p0 = this.f6299b;
                c1344p0.getClass();
                try {
                    c1344p0.f6322c.m1398g(c1344p0.f6320a.m1931d(C1344p0.f6318h));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                C1344p0 c1344p02 = this.f6299b;
                c1344p02.getClass();
                Looper.prepare();
                try {
                    String m1929b = c1344p02.f6320a.m1929b(C1344p0.f6318h);
                    if (m1929b == null || m1929b.equals(cfgData.m1784i().f2586X)) {
                        return;
                    }
                    new Handler(Looper.getMainLooper()).post(new RunnableC0018l(c1344p02, 17, m1929b));
                    return;
                } finally {
                    c1344p02.f6325f = false;
                }
        }
    }
}
