package p098q0;

import android.os.SystemClock;
import com.altaysoft.t500_split.carData;
import p006C.AbstractC0062j;

/* renamed from: q0.B0 */
/* loaded from: classes.dex */
public final class RunnableC1247B0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5577a;

    /* renamed from: b */
    public final /* synthetic */ C1253D0 f5578b;

    public /* synthetic */ RunnableC1247B0(C1253D0 c1253d0, int i) {
        this.f5577a = i;
        this.f5578b = c1253d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5577a) {
            case 0:
                C1253D0 c1253d0 = this.f5578b;
                if (c1253d0.f5620W && c1253d0.f5623Z == 6 && !c1253d0.f5622Y) {
                    float f2 = c1253d0.f5649m0;
                    float f3 = c1253d0.f5645k0;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - c1253d0.f5651n0;
                    float m149c = AbstractC0062j.m149c(f3, f2, Math.min(1.0f, elapsedRealtime / 1000.0f), f2);
                    c1253d0.f5643j0 = m149c;
                    boolean z2 = false;
                    boolean z3 = Math.abs(m149c - f3) > 0.001f && elapsedRealtime < 1050;
                    float f4 = c1253d0.f5657q0;
                    float f5 = c1253d0.f5655p0;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - c1253d0.f5659r0;
                    float m149c2 = AbstractC0062j.m149c(f5, f4, Math.min(1.0f, elapsedRealtime2 / 1000.0f), f4);
                    c1253d0.f5653o0 = m149c2;
                    if (Math.abs(m149c2 - f5) > 0.001f && elapsedRealtime2 < 1050) {
                        z2 = true;
                    }
                    boolean z4 = z3 | z2;
                    c1253d0.m2964b(carData.getInstance());
                    if (z4) {
                        c1253d0.f5633e0.postDelayed(this, 16L);
                        break;
                    }
                }
                break;
            default:
                C1253D0 c1253d02 = this.f5578b;
                if (c1253d02.f5620W) {
                    if (c1253d02.f5623Z == 4 && !c1253d02.f5622Y) {
                        c1253d02.m2968f();
                    }
                    if (c1253d02.f5623Z == 7 && !c1253d02.f5622Y) {
                        long j2 = c1253d02.f5625a0;
                        if (c1253d02.f5631d0) {
                            j2 += SystemClock.elapsedRealtime() - c1253d02.f5629c0;
                        }
                        long j3 = c1253d02.f5627b0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1253d02.m2966d(j2);
                    }
                    c1253d02.f5633e0.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
