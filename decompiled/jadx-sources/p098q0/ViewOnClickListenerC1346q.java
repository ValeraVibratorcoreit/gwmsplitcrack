package p098q0;

import android.view.View;
import com.altaysoft.t500_split.ClimateTestActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.network.C0654a;
import com.altaysoft.t500_split.stats.RefuelsActivity;
import com.altaysoft.t500_split.stats.TripsActivity;
import p001A0.RunnableC0018l;
import p070g.DialogInterfaceC0867f;
import p103s0.C1414b;
import p109u0.RunnableC1559n0;
import p115w0.C1632n;
import p121y0.AbstractC1680h;
import p121y0.C1676d;
import p121y0.C1685m;

/* renamed from: q0.q */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1346q implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f6332f;

    /* renamed from: g */
    public final /* synthetic */ Object f6333g;

    /* renamed from: h */
    public final /* synthetic */ Object f6334h;

    public /* synthetic */ ViewOnClickListenerC1346q(Object obj, int i, Object obj2) {
        this.f6332f = i;
        this.f6333g = obj;
        this.f6334h = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0654a c0654a;
        switch (this.f6332f) {
            case 0:
                int i = ClimateTestActivity.f2265I;
                ClimateTestActivity climateTestActivity = (ClimateTestActivity) this.f6333g;
                climateTestActivity.getClass();
                Runnable runnable = ((C1355t) this.f6334h).f6365f;
                if (!climateTestActivity.f2269H) {
                    climateTestActivity.f2269H = true;
                    new Thread(new RunnableC0018l(climateTestActivity, 11, runnable), "clima-set").start();
                    break;
                }
                break;
            case 1:
                C1414b c1414b = (C1414b) this.f6333g;
                DialogInterfaceC0867f dialogInterfaceC0867f = (DialogInterfaceC0867f) this.f6334h;
                c1414b.getClass();
                C1344p0 c1344p0 = C1344p0.f6319i;
                if (c1344p0.f6325f && (c0654a = c1344p0.f6320a) != null) {
                    c0654a.f3082e = true;
                }
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, c1414b.f6784p0, null);
                break;
            case 2:
                C1632n c1632n = (C1632n) this.f6333g;
                c1632n.getClass();
                int i2 = RefuelsActivity.f3268H;
                C1676d c1676d = (C1676d) this.f6334h;
                RefuelsActivity refuelsActivity = (RefuelsActivity) c1632n.f9299b;
                AbstractC1680h.m4857S(refuelsActivity, R.string.refuels_delete_title, refuelsActivity.getString(R.string.refuels_delete_confirm), R.string.refuels_delete, new RunnableC1559n0(refuelsActivity, 18, c1676d));
                break;
            default:
                C1632n c1632n2 = (C1632n) this.f6333g;
                c1632n2.getClass();
                int i3 = TripsActivity.f3293H;
                C1685m c1685m = (C1685m) this.f6334h;
                TripsActivity tripsActivity = (TripsActivity) c1632n2.f9299b;
                AbstractC1680h.m4857S(tripsActivity, R.string.trips_delete_title, tripsActivity.getString(R.string.trips_delete_confirm), R.string.trips_delete, new RunnableC1559n0(tripsActivity, 20, c1685m));
                break;
        }
    }
}
