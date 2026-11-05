package p118x0;

import android.os.Handler;
import android.os.SystemClock;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.splitinfo.SkinAnalogClockView;
import com.altaysoft.t500_split.stats.RefuelsActivity;
import com.altaysoft.t500_split.stats.StatisticsActivity;
import com.altaysoft.t500_split.stats.TripsActivity;
import p111v.C1594f;
import p121y0.C1683k;

/* renamed from: x0.n */
/* loaded from: classes.dex */
public final class RunnableC1658n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9459a;

    /* renamed from: b */
    public final /* synthetic */ Object f9460b;

    public /* synthetic */ RunnableC1658n(int i, Object obj) {
        this.f9459a = i;
        this.f9460b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9459a) {
            case 0:
                SkinAnalogClockView skinAnalogClockView = (SkinAnalogClockView) this.f9460b;
                if (skinAnalogClockView.f3233q) {
                    skinAnalogClockView.invalidate();
                    skinAnalogClockView.postDelayed(this, SkinAnalogClockView.m1971d(skinAnalogClockView.f3227k) ? 50L : 250L);
                    return;
                }
                return;
            case 1:
                C1660p c1660p = (C1660p) this.f9460b;
                if (c1660p.f9469c) {
                    carData cardata = carData.getInstance();
                    float m4813b = C1660p.m4813b(Float.valueOf(cardata.m1780z()));
                    float m4813b2 = C1660p.m4813b(Float.valueOf(cardata.m1779y()));
                    float m4813b3 = C1660p.m4813b(Float.valueOf(cardata.m1765o()));
                    int m1757k = cardata.m1757k();
                    int m1749g = cardata.m1749g();
                    int i = 0;
                    if (m1757k != 3 && m1757k != 4 && m1749g >= 0) {
                        i = m1749g;
                    }
                    C1594f c1594f = c1660p.f9467a;
                    C1659o c1659o = new C1659o(m4813b, m4813b2, m4813b3, i, SystemClock.elapsedRealtime());
                    synchronized (c1594f) {
                        C1659o[] c1659oArr = (C1659o[]) c1594f.f9082c;
                        int i2 = c1594f.f9080a;
                        c1659oArr[i2] = c1659o;
                        c1594f.f9080a = (i2 + 1) % 1800;
                        int i3 = c1594f.f9081b;
                        if (i3 < 1800) {
                            c1594f.f9081b = i3 + 1;
                        }
                    }
                    ((C1660p) this.f9460b).f9468b.postDelayed(this, 2000L);
                    return;
                }
                return;
            case 2:
                RefuelsActivity refuelsActivity = (RefuelsActivity) this.f9460b;
                if (refuelsActivity.isFinishing()) {
                    return;
                }
                int i4 = RefuelsActivity.f3268H;
                refuelsActivity.m1984u();
                refuelsActivity.f3269E.postDelayed(this, 2000L);
                return;
            case 3:
                StatisticsActivity statisticsActivity = (StatisticsActivity) this.f9460b;
                if (statisticsActivity.isFinishing()) {
                    return;
                }
                int i5 = StatisticsActivity.f3272X;
                statisticsActivity.m1993w();
                statisticsActivity.f3273E.postDelayed(this, 1000L);
                return;
            case 4:
                C1683k c1683k = (C1683k) this.f9460b;
                if (c1683k.f9585e) {
                    try {
                        C1683k.m4890a(c1683k);
                    } catch (RuntimeException unused) {
                    }
                    if (c1683k.f9585e) {
                        Handler handler = c1683k.f9582b;
                        handler.removeCallbacks(this);
                        handler.postDelayed(this, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                TripsActivity tripsActivity = (TripsActivity) this.f9460b;
                if (tripsActivity.isFinishing()) {
                    return;
                }
                int i6 = TripsActivity.f3293H;
                tripsActivity.m1996t();
                tripsActivity.f3294E.postDelayed(this, 2000L);
                return;
        }
    }
}
