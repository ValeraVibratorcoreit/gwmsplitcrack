package p101r0;

import android.os.Handler;
import android.view.View;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.network.ApiResponse;
import com.altaysoft.t500_split.network.C0654a;
import java.util.LinkedHashMap;
import p063d1.C0752m;
import p098q0.AbstractC1372y1;
import p098q0.C1341o0;
import p098q0.C1344p0;

/* renamed from: r0.e */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1383e implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f6476f;

    /* renamed from: g */
    public final /* synthetic */ C1384f f6477g;

    public /* synthetic */ ViewOnClickListenerC1383e(C1384f c1384f, int i) {
        this.f6476f = i;
        this.f6477g = c1384f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6476f) {
            case 0:
                C1384f c1384f = this.f6477g;
                c1384f.f6486h0.setVisibility(0);
                c1384f.f6487i0.setVisibility(0);
                c1384f.f6488j0.setVisibility(0);
                c1384f.f6489k0.setVisibility(0);
                c1384f.f6490l0.setVisibility(0);
                break;
            default:
                C1384f c1384f2 = this.f6477g;
                if (!c1384f2.f6478Z.m1763n()) {
                    AbstractC1372y1.m3288S(c1384f2.m1124g(), c1384f2.m1130m(R.string.Message), c1384f2.m1130m(R.string.no_internet_connection), null);
                    break;
                } else {
                    int parseInt = Integer.parseInt(c1384f2.f6488j0.getText().toString());
                    String obj = c1384f2.f6489k0.getText().toString();
                    c1384f2.f6488j0.setText("");
                    c1384f2.f6489k0.setText("");
                    int i = 4;
                    c1384f2.f6486h0.setVisibility(4);
                    c1384f2.f6487i0.setVisibility(4);
                    c1384f2.f6488j0.setVisibility(4);
                    c1384f2.f6489k0.setVisibility(4);
                    c1384f2.f6490l0.setVisibility(4);
                    C0654a c0654a = C0654a.f3077h;
                    C1341o0 c1341o0 = C1344p0.f6318h;
                    c0654a.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    cfgData cfgdata = c0654a.f3078a;
                    linkedHashMap.put(cfgdata.f2518G, cfgdata.f2558Q);
                    linkedHashMap.put(cfgdata.f2514F, c1341o0.f6302a);
                    linkedHashMap.put(cfgdata.f2578V, String.valueOf(parseInt));
                    linkedHashMap.put(cfgdata.f2582W, obj);
                    linkedHashMap.put(cfgdata.f2526I, c0654a.f3080c);
                    String m1930c = c0654a.m1930c(linkedHashMap);
                    c0654a.f3081d = m1930c;
                    if (m1930c != null) {
                        C0752m c0752m = c0654a.f3084g;
                        if (!((ApiResponse) c0752m.m2197a(m1930c)).successMessage.contains(cfgdata.f2562R)) {
                            if (((ApiResponse) c0752m.m2197a(c0654a.f3081d)).error.f3070a.contains(cfgdata.f2566S)) {
                                i = 1;
                            } else if (((ApiResponse) c0752m.m2197a(c0654a.f3081d)).error.f3070a.contains(cfgdata.f2570T)) {
                                i = 2;
                            } else if (((ApiResponse) c0752m.m2197a(c0654a.f3081d)).error.f3070a.contains(cfgdata.f2574U)) {
                                i = 3;
                            }
                        }
                        new Handler().postDelayed(new RunnableC1382d(c1384f2, i, parseInt), 250L);
                        break;
                    }
                    i = 99;
                    new Handler().postDelayed(new RunnableC1382d(c1384f2, i, parseInt), 250L);
                }
        }
    }
}
