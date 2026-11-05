package p098q0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0648p;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.RunnableC0011e;
import p001A0.RunnableC0020n;
import p109u0.AbstractC1539g1;
import p115w0.AbstractC1634p;

/* renamed from: q0.g0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1317g0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6121a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f6122b;

    /* renamed from: c */
    public final /* synthetic */ boolean f6123c;

    public /* synthetic */ RunnableC1317g0(MainActivity mainActivity, boolean z2, int i) {
        this.f6121a = i;
        this.f6122b = mainActivity;
        this.f6123c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f6123c;
        MainActivity mainActivity = this.f6122b;
        switch (this.f6121a) {
            case 0:
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                if (!mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1320h0(mainActivity, 3), z2 ? 300L : 200L);
                    break;
                }
                break;
            default:
                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                if (!mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    cfgData cfgdata = mainActivity.f2309E;
                    if (z2 && cfgdata.f2651k2 && AbstractC1539g1.m4196R(cfgdata.f2544M1)) {
                        Context applicationContext = mainActivity.getApplicationContext();
                        String m1870s = AbstractC0638f.m1870s(cfgdata.f2544M1);
                        Handler handler = new Handler(Looper.getMainLooper());
                        if (AbstractC0648p.m1920m(cfgdata, m1870s)) {
                            handler.postDelayed(new RunnableC1329k0(mainActivity, handler, applicationContext, m1870s), 2000L);
                        } else {
                            handler.postDelayed(new RunnableC1329k0(mainActivity, applicationContext, m1870s, handler), 7000L);
                        }
                    }
                    if (z2 && !cfgdata.f2660m1 && cfgdata.f2584W1) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0020n(17, mainActivity), 9000L);
                    }
                    if (!AbstractC1634p.f9304d) {
                        AbstractC1634p.f9304d = true;
                        if (cfgData.m1784i().f2513E3 != 2) {
                            RunnableC0011e runnableC0011e = new RunnableC0011e(mainActivity.getApplicationContext(), 5);
                            Handler handler2 = AbstractC1634p.f9301a;
                            AbstractC1634p.f9301a.postDelayed(runnableC0011e, 10000L);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
