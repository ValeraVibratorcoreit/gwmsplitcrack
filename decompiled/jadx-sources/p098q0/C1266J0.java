package p098q0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import p118x0.C1670z;
import p118x0.RunnableC1665u;

/* renamed from: q0.J0 */
/* loaded from: classes.dex */
public final class C1266J0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ int f5735a;

    /* renamed from: b */
    public final /* synthetic */ Object f5736b;

    public /* synthetic */ C1266J0(int i, Object obj) {
        this.f5735a = i;
        this.f5736b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f5735a) {
            case 0:
                C1268K0 c1268k0 = (C1268K0) this.f5736b;
                Handler handler = c1268k0.f5754b;
                RunnableC1264I0 runnableC1264I0 = c1268k0.f5770r;
                handler.removeCallbacks(runnableC1264I0);
                handler.postDelayed(runnableC1264I0, 400L);
                break;
            default:
                ((C1670z) this.f5736b).f9528c.post(new RunnableC1665u(this, 0));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f5735a) {
            case 0:
                C1268K0 c1268k0 = (C1268K0) this.f5736b;
                Handler handler = c1268k0.f5754b;
                RunnableC1264I0 runnableC1264I0 = c1268k0.f5770r;
                handler.removeCallbacks(runnableC1264I0);
                handler.postDelayed(runnableC1264I0, 400L);
                break;
            default:
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    ((C1670z) this.f5736b).f9528c.post(new RunnableC1665u(this, 1));
                    break;
                }
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.f5735a) {
            case 0:
                C1268K0 c1268k0 = (C1268K0) this.f5736b;
                Handler handler = c1268k0.f5754b;
                RunnableC1264I0 runnableC1264I0 = c1268k0.f5770r;
                handler.removeCallbacks(runnableC1264I0);
                handler.postDelayed(runnableC1264I0, 400L);
                break;
            default:
                super.onLost(network);
                break;
        }
    }
}
