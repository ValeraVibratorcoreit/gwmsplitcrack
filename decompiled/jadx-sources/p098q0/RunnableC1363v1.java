package p098q0;

import android.os.SystemClock;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.cfgData;

/* renamed from: q0.v1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1363v1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6403a;

    /* renamed from: b */
    public final /* synthetic */ TopOverlayService f6404b;

    public /* synthetic */ RunnableC1363v1(TopOverlayService topOverlayService, int i) {
        this.f6403a = i;
        this.f6404b = topOverlayService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TopOverlayService topOverlayService = this.f6404b;
        switch (this.f6403a) {
            case 0:
                TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                topOverlayService.getClass();
                if (SystemClock.uptimeMillis() >= topOverlayService.f2363k) {
                    topOverlayService.m1705a();
                    break;
                } else {
                    topOverlayService.m1705a();
                    break;
                }
            case 1:
                topOverlayService.f2364l = 0L;
                if (!cfgData.m1784i().f2545M2 && !cfgData.m1784i().f2549N2) {
                    topOverlayService.stopSelf();
                    break;
                }
                break;
            case 2:
                topOverlayService.f2358f.m3255b();
                break;
            case 3:
                TopOverlayService topOverlayService3 = TopOverlayService.f2357r;
                topOverlayService.m1705a();
                break;
            default:
                TopOverlayService topOverlayService4 = TopOverlayService.f2357r;
                topOverlayService.m1706b();
                break;
        }
    }
}
