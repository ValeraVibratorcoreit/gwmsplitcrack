package p098q0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.InterfaceC0553r;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import p109u0.AbstractC1569q1;

/* renamed from: q0.Y */
/* loaded from: classes.dex */
public abstract class AbstractC1294Y {

    /* renamed from: a */
    public static final Handler f6039a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final RunnableC1290W f6040b = new RunnableC1290W(0);

    /* renamed from: c */
    public static C1302b0 f6041c;

    /* renamed from: a */
    public static void m3149a(Context context) {
        Integer num;
        if (context == null) {
            return;
        }
        m3152d();
        cfgData m1784i = cfgData.m1784i();
        if (AbstractC1372y1.m3299e("ip_message") || !m1784i.f2507D2) {
            C1311e0.m3165d(context).m3171e();
        }
        if (AbstractC1372y1.m3299e("ip_message")) {
            C1288V.m3128n();
            return;
        }
        C1288V m3126i = C1288V.m3126i(context);
        if (!m1784i.f2497B2 && !m1784i.f2502C2) {
            C1288V.m3128n();
            return;
        }
        if (m3154f() || !m1784i.f2537K2) {
            C1288V.m3128n();
            return;
        }
        int i = 0;
        if (m1784i.f2497B2 && (num = (Integer) carData.getInstance().f2450h.m1395d()) != null) {
            i = num.intValue();
        }
        m3126i.m3146w(i);
        m3150b();
    }

    /* renamed from: b */
    public static void m3150b() {
        C1288V c1288v;
        m3152d();
        if (cfgData.m1784i().f2512E2 && !AbstractC1372y1.m3299e("ip_message") && (c1288v = C1288V.f5996D) != null && c1288v.f6020p && c1288v.m3140k()) {
            f6039a.postDelayed(f6040b, 3000L);
        }
    }

    /* renamed from: c */
    public static void m3151c(InterfaceC0553r interfaceC0553r, Context context) {
        if (interfaceC0553r == null || context == null) {
            return;
        }
        carData cardata = carData.getInstance();
        carData.m1712X(cardata.f2444f, interfaceC0553r, new C1292X(context, 0));
        carData.m1712X(cardata.f2447g, interfaceC0553r, new C1292X(context, 1));
        carData.m1712X(cardata.f2450h, interfaceC0553r, new C1292X(context, 2));
    }

    /* renamed from: d */
    public static void m3152d() {
        f6039a.removeCallbacks(f6040b);
    }

    /* renamed from: e */
    public static void m3153e(Context context) {
        if (context == null) {
            return;
        }
        m3152d();
        C1288V.m3126i(context).m3142o(true);
    }

    /* renamed from: f */
    public static boolean m3154f() {
        int i = AbstractC1569q1.f8666a;
        cfgData m1784i = cfgData.m1784i();
        if ((m1784i == null || !AbstractC1569q1.m4455g(m1784i.f2620e1)) ? false : !AbstractC1569q1.f8668c) {
            return !AbstractC1372y1.m3272C();
        }
        carData cardata = AbstractC1372y1.f6431a;
        if ((cfgData.m1784i().f2561Q2 && AbstractC1372y1.f6442l) || AbstractC1372y1.m3272C()) {
            return AbstractC1372y1.f6439i && !AbstractC1372y1.m3272C();
        }
        return true;
    }
}
