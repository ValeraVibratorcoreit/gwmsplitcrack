package p101r0;

import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import p098q0.AbstractC1372y1;

/* renamed from: r0.d */
/* loaded from: classes.dex */
public final class RunnableC1382d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6473a;

    /* renamed from: b */
    public final /* synthetic */ int f6474b;

    /* renamed from: c */
    public final /* synthetic */ C1384f f6475c;

    public RunnableC1382d(C1384f c1384f, int i, int i2) {
        this.f6475c = c1384f;
        this.f6473a = i;
        this.f6474b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1384f c1384f = this.f6475c;
        int i = this.f6473a;
        if (i == 1) {
            AbstractC1372y1.m3288S(c1384f.m1124g(), c1384f.m1130m(R.string.error_message_title), c1384f.m1130m(R.string.incorrect_id_password), null);
            return;
        }
        if (i == 2) {
            AbstractC1372y1.m3288S(c1384f.m1124g(), c1384f.m1130m(R.string.error_message_title), c1384f.m1130m(R.string.partner_id_already_saved), null);
            return;
        }
        if (i == 3) {
            AbstractC1372y1.m3288S(c1384f.m1124g(), c1384f.m1130m(R.string.error_message_title), c1384f.m1130m(R.string.partner_id_blocked), null);
            return;
        }
        if (i != 4) {
            if (i != 99) {
                return;
            }
            AbstractC1372y1.m3288S(c1384f.m1124g(), c1384f.m1130m(R.string.error_message_title), c1384f.m1130m(R.string.partner_id_check_error), null);
            return;
        }
        cfgData cfgdata = CFG4.f2728F;
        int i2 = this.f6474b;
        cfgdata.f2605b1 = i2;
        cfgdata.f2508D3 = AbstractC1372y1.m3310p(i2);
        cfgdata.m1795o(c1384f.m1124g());
        cfgdata.f2665n1 = 0L;
        cfgdata.f2670o1 = 0L;
        AbstractC1372y1.m3288S(c1384f.m1124g(), c1384f.m1130m(R.string.Message), c1384f.m1130m(R.string.partner_id_check_success), null);
        c1384f.m3327O();
    }
}
