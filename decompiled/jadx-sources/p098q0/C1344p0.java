package p098q0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0560y;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.network.C0654a;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p001A0.RunnableC0018l;
import p001A0.RunnableC0024r;

/* renamed from: q0.p0 */
/* loaded from: classes.dex */
public final class C1344p0 {

    /* renamed from: h */
    public static C1341o0 f6318h;

    /* renamed from: i */
    public static C1344p0 f6319i;

    /* renamed from: a */
    public final C0654a f6320a;

    /* renamed from: e */
    public final Context f6324e;

    /* renamed from: b */
    public final C0560y f6321b = new C0560y();

    /* renamed from: c */
    public final C0560y f6322c = new C0560y();

    /* renamed from: d */
    public final C0560y f6323d = new C0560y();

    /* renamed from: f */
    public volatile boolean f6325f = false;

    /* renamed from: g */
    public final ExecutorService f6326g = Executors.newFixedThreadPool(2);

    public C1344p0(Context context) {
        String str;
        this.f6324e = context.getApplicationContext();
        try {
            this.f6320a = new C0654a();
        } catch (MalformedURLException unused) {
        }
        C1341o0 c1341o0 = new C1341o0();
        cfgData.m1784i().m1791k(context, false);
        c1341o0.f6305d = cfgData.m1784i().f2548N1;
        c1341o0.f6306e = cfgData.m1784i().f2544M1;
        c1341o0.f6308g = cfgData.m1784i().f2537K2;
        c1341o0.f6307f = cfgData.m1784i().f2545M2;
        c1341o0.f6309h = cfgData.m1784i().f2646j2;
        c1341o0.f6310i = cfgData.m1784i().f2672o3;
        c1341o0.f6311j = cfgData.m1784i().f2605b1;
        c1341o0.f6312k = cfgData.m1784i().f2620e1;
        c1341o0.f6303b = cfgData.m1784i().f2543M0.f7143b;
        try {
            c1341o0.f6304c = (int) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
        } catch (Throwable unused2) {
        }
        try {
            str = AbstractC1372y1.m3312r("persist.gwm.vehicle.vin");
        } catch (Throwable unused3) {
            str = "UNKNOWN";
        }
        c1341o0.f6313l = str;
        c1341o0.f6302a = AbstractC1372y1.m3279J(str);
        f6318h = c1341o0;
        f6319i = this;
    }

    /* renamed from: b */
    public static void m3240b(RunnableC0024r runnableC0024r) {
        if (runnableC0024r == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(runnableC0024r);
    }

    /* renamed from: a */
    public final void m3241a(RunnableC0024r runnableC0024r) {
        if (!cfgData.m1784i().f2559Q0) {
            new Thread(new RunnableC0018l(this, 16, runnableC0024r)).start();
            return;
        }
        carData cardata = carData.getInstance();
        cardata.f2468q.m1398g(Boolean.FALSE);
        m3240b(runnableC0024r);
    }
}
