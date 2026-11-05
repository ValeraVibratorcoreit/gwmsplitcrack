package p121y0;

import com.altaysoft.t500_split.stats.RefuelsActivity;
import com.altaysoft.t500_split.stats.TripsActivity;
import java.util.ArrayList;
import p070g.AbstractActivityC0870i;

/* renamed from: y0.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1678f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9566a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0870i f9567b;

    public /* synthetic */ RunnableC1678f(AbstractActivityC0870i abstractActivityC0870i, int i) {
        this.f9566a = i;
        this.f9567b = abstractActivityC0870i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9566a) {
            case 0:
                RefuelsActivity refuelsActivity = (RefuelsActivity) this.f9567b;
                int i = RefuelsActivity.f3268H;
                refuelsActivity.getClass();
                C1683k c1683k = C1683k.f9580s;
                if (c1683k != null) {
                    synchronized (c1683k) {
                        c1683k.f9590j.clear();
                        c1683k.f9593m = true;
                        c1683k.m4902k();
                    }
                } else {
                    AbstractC1680h.m4853O(refuelsActivity, new ArrayList());
                }
                refuelsActivity.m1984u();
                return;
            default:
                TripsActivity tripsActivity = (TripsActivity) this.f9567b;
                int i2 = TripsActivity.f3293H;
                tripsActivity.getClass();
                C1683k c1683k2 = C1683k.f9580s;
                if (c1683k2 != null) {
                    synchronized (c1683k2) {
                        c1683k2.f9589i.clear();
                        c1683k2.f9591k = null;
                        c1683k2.f9588h = 0L;
                        c1683k2.f9596p = null;
                        c1683k2.f9592l = true;
                        c1683k2.m4903l();
                    }
                } else {
                    AbstractC1687o.m4927V(tripsActivity, new ArrayList());
                }
                tripsActivity.m1996t();
                return;
        }
    }
}
