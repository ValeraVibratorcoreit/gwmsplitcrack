package p121y0;

import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.stats.StatisticsActivity;

/* renamed from: y0.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1681i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9575a;

    /* renamed from: b */
    public final /* synthetic */ StatisticsActivity f9576b;

    public /* synthetic */ RunnableC1681i(StatisticsActivity statisticsActivity, int i) {
        this.f9575a = i;
        this.f9576b = statisticsActivity;
    }

    /* renamed from: a */
    private final void m4885a() {
        StatisticsActivity statisticsActivity = this.f9576b;
        int i = StatisticsActivity.f3272X;
        statisticsActivity.getClass();
        C1683k c1683k = C1683k.f9580s;
        if (c1683k == null) {
            cfgData m1784i = cfgData.m1784i();
            m1784i.f2695t1 = 0.0f;
            m1784i.f2700u1 = System.currentTimeMillis();
            m1784i.m1799s(statisticsActivity);
            return;
        }
        synchronized (c1683k) {
            cfgData cfgdata = c1683k.f9583c;
            cfgdata.f2695t1 = 0.0f;
            cfgdata.f2700u1 = System.currentTimeMillis();
            c1683k.f9583c.m1799s(c1683k.f9581a);
        }
    }

    /* renamed from: b */
    private final void m4886b() {
        StatisticsActivity statisticsActivity = this.f9576b;
        int i = StatisticsActivity.f3272X;
        statisticsActivity.getClass();
        C1683k c1683k = C1683k.f9580s;
        if (c1683k == null) {
            cfgData m1784i = cfgData.m1784i();
            m1784i.f2705v1 = Float.NaN;
            m1784i.f2710w1 = System.currentTimeMillis();
            m1784i.m1799s(statisticsActivity);
            return;
        }
        synchronized (c1683k) {
            cfgData cfgdata = c1683k.f9583c;
            cfgdata.f2705v1 = Float.NaN;
            cfgdata.f2710w1 = System.currentTimeMillis();
            c1683k.f9583c.m1799s(c1683k.f9581a);
        }
    }

    /* renamed from: c */
    private final void m4887c() {
        StatisticsActivity statisticsActivity = this.f9576b;
        int i = StatisticsActivity.f3272X;
        statisticsActivity.getClass();
        C1683k c1683k = C1683k.f9580s;
        if (c1683k == null) {
            cfgData m1784i = cfgData.m1784i();
            m1784i.f2715x1 = Float.NaN;
            m1784i.f2720y1 = System.currentTimeMillis();
            m1784i.m1799s(statisticsActivity);
            return;
        }
        synchronized (c1683k) {
            cfgData cfgdata = c1683k.f9583c;
            cfgdata.f2715x1 = Float.NaN;
            cfgdata.f2720y1 = System.currentTimeMillis();
            c1683k.f9583c.m1799s(c1683k.f9581a);
        }
    }

    /* renamed from: d */
    private final void m4888d() {
        StatisticsActivity statisticsActivity = this.f9576b;
        int i = StatisticsActivity.f3272X;
        statisticsActivity.getClass();
        C1683k c1683k = C1683k.f9580s;
        if (c1683k == null) {
            cfgData m1784i = cfgData.m1784i();
            m1784i.f2725z1 = Float.NaN;
            m1784i.f2491A1 = System.currentTimeMillis();
            m1784i.m1799s(statisticsActivity);
            return;
        }
        synchronized (c1683k) {
            cfgData cfgdata = c1683k.f9583c;
            cfgdata.f2725z1 = Float.NaN;
            cfgdata.f2491A1 = System.currentTimeMillis();
            c1683k.f9583c.m1799s(c1683k.f9581a);
        }
    }

    /* renamed from: e */
    private final void m4889e() {
        StatisticsActivity statisticsActivity = this.f9576b;
        int i = StatisticsActivity.f3272X;
        statisticsActivity.getClass();
        C1683k c1683k = C1683k.f9580s;
        if (c1683k == null) {
            cfgData m1784i = cfgData.m1784i();
            m1784i.f2496B1 = Float.NaN;
            m1784i.f2501C1 = System.currentTimeMillis();
            m1784i.m1799s(statisticsActivity);
            return;
        }
        synchronized (c1683k) {
            cfgData cfgdata = c1683k.f9583c;
            cfgdata.f2496B1 = Float.NaN;
            cfgdata.f2501C1 = System.currentTimeMillis();
            c1683k.f9583c.m1799s(c1683k.f9581a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9575a) {
            case 0:
                StatisticsActivity statisticsActivity = this.f9576b;
                int i = StatisticsActivity.f3272X;
                statisticsActivity.getClass();
                C1683k c1683k = C1683k.f9580s;
                if (c1683k == null) {
                    cfgData m1784i = cfgData.m1784i();
                    m1784i.f2516F1 = 0.0f;
                    m1784i.f2520G1 = System.currentTimeMillis();
                    carData.getInstance().setFuelUsedLiters(0.0f);
                    m1784i.m1799s(statisticsActivity);
                    return;
                }
                synchronized (c1683k) {
                    cfgData cfgdata = c1683k.f9583c;
                    cfgdata.f2516F1 = 0.0f;
                    cfgdata.f2520G1 = System.currentTimeMillis();
                    c1683k.f9584d.setFuelUsedLiters(0.0f);
                    c1683k.f9594n = 0.0f;
                    c1683k.f9583c.m1799s(c1683k.f9581a);
                }
                return;
            case 1:
                int i2 = StatisticsActivity.f3272X;
                this.f9576b.m1993w();
                return;
            case 2:
                StatisticsActivity statisticsActivity2 = this.f9576b;
                int i3 = StatisticsActivity.f3272X;
                statisticsActivity2.getClass();
                C1683k c1683k2 = C1683k.f9580s;
                if (c1683k2 == null) {
                    cfgData m1784i2 = cfgData.m1784i();
                    m1784i2.f2675p1 = 0L;
                    m1784i2.f2680q1 = System.currentTimeMillis();
                    m1784i2.m1799s(statisticsActivity2);
                    return;
                }
                synchronized (c1683k2) {
                    cfgData cfgdata2 = c1683k2.f9583c;
                    cfgdata2.f2675p1 = 0L;
                    cfgdata2.f2680q1 = System.currentTimeMillis();
                    c1683k2.f9583c.m1799s(c1683k2.f9581a);
                    c1683k2.f9598r = -1;
                    c1683k2.m4904m();
                }
                return;
            case 3:
                StatisticsActivity statisticsActivity3 = this.f9576b;
                int i4 = StatisticsActivity.f3272X;
                statisticsActivity3.getClass();
                C1683k c1683k3 = C1683k.f9580s;
                if (c1683k3 == null) {
                    cfgData m1784i3 = cfgData.m1784i();
                    m1784i3.f2685r1 = 0.0f;
                    m1784i3.f2690s1 = System.currentTimeMillis();
                    m1784i3.m1799s(statisticsActivity3);
                    return;
                }
                synchronized (c1683k3) {
                    cfgData cfgdata3 = c1683k3.f9583c;
                    cfgdata3.f2685r1 = 0.0f;
                    cfgdata3.f2690s1 = System.currentTimeMillis();
                    c1683k3.f9583c.m1799s(c1683k3.f9581a);
                }
                return;
            case 4:
                m4885a();
                return;
            case 5:
                m4886b();
                return;
            case 6:
                m4887c();
                return;
            case 7:
                m4888d();
                return;
            case 8:
                m4889e();
                return;
            default:
                StatisticsActivity statisticsActivity4 = this.f9576b;
                int i5 = StatisticsActivity.f3272X;
                statisticsActivity4.getClass();
                C1683k c1683k4 = C1683k.f9580s;
                if (c1683k4 == null) {
                    cfgData m1784i4 = cfgData.m1784i();
                    m1784i4.f2506D1 = Float.NaN;
                    m1784i4.f2511E1 = System.currentTimeMillis();
                    m1784i4.m1799s(statisticsActivity4);
                    return;
                }
                synchronized (c1683k4) {
                    cfgData cfgdata4 = c1683k4.f9583c;
                    cfgdata4.f2506D1 = Float.NaN;
                    cfgdata4.f2511E1 = System.currentTimeMillis();
                    c1683k4.f9583c.m1799s(c1683k4.f9581a);
                }
                return;
        }
    }
}
