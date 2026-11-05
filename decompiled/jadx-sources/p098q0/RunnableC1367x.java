package p098q0;

import android.os.Handler;
import android.os.SystemClock;
import com.altaysoft.t500_split.NativeLib;

/* renamed from: q0.x */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1367x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6420a;

    /* renamed from: b */
    public final /* synthetic */ C1246B f6421b;

    public /* synthetic */ RunnableC1367x(C1246B c1246b, int i) {
        this.f6420a = i;
        this.f6421b = c1246b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.f6420a) {
            case 0:
                C1246B c1246b = this.f6421b;
                if (c1246b.f5566l && c1246b.f5568n >= 0) {
                    long uptimeMillis = SystemClock.uptimeMillis() - c1246b.f5573s;
                    RunnableC1367x runnableC1367x = c1246b.f5574t;
                    Handler handler = c1246b.f5556b;
                    if (uptimeMillis >= 1400) {
                        int i2 = c1246b.f5568n;
                        c1246b.f5568n = -1;
                        if (i2 == 3) {
                            i = 1;
                        } else if (i2 != 29) {
                            try {
                                i = C1246B.m2955k(i2);
                            } catch (Throwable unused) {
                            }
                        } else {
                            i = 2;
                        }
                        NativeLib.nativePropDriveModeHut(i);
                        NativeLib.nativePropDriveMode(C1246B.m2955k(i2));
                        handler.removeCallbacks(runnableC1367x);
                        c1246b.f5568n = -1;
                        c1246b.m2958d();
                        break;
                    } else {
                        handler.removeCallbacks(runnableC1367x);
                        handler.postDelayed(runnableC1367x, 1400 - uptimeMillis);
                        break;
                    }
                }
                break;
            default:
                this.f6421b.m2959h();
                break;
        }
    }
}
