package p031P;

import android.content.Intent;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.InterfaceC0649q;
import com.altaysoft.t500_split.splitinfo.WeatherFullscreenActivity;
import p014G.InterfaceC0101b;
import p016H.C0112d;
import p046X.C0401b0;
import p058c.C0567a;
import p058c.InterfaceC0568b;
import p107t1.AbstractC1461d;
import p118x0.C1669y;
import p118x0.InterfaceC1666v;

/* renamed from: P.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0264b implements InterfaceC0101b, InterfaceC0649q, InterfaceC0568b, InterfaceC1666v {

    /* renamed from: f */
    public final /* synthetic */ Object f701f;

    public /* synthetic */ C0264b(Object obj) {
        this.f701f = obj;
    }

    @Override // p118x0.InterfaceC1666v
    /* renamed from: a */
    public void mo783a(C1669y c1669y) {
        int i = WeatherFullscreenActivity.f3250V;
        ((WeatherFullscreenActivity) this.f701f).m1981u(c1669y);
    }

    @Override // p058c.InterfaceC0568b
    /* renamed from: b */
    public void mo784b(Object obj) {
        Intent intent;
        String stringExtra;
        C0567a c0567a = (C0567a) obj;
        int i = YmSettingsActivity.f2370J;
        YmSettingsActivity ymSettingsActivity = (YmSettingsActivity) this.f701f;
        ymSettingsActivity.getClass();
        if (c0567a.f2171a != -1 || (intent = c0567a.f2172b) == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
            return;
        }
        String trim = stringExtra.trim();
        if (trim.isEmpty()) {
            return;
        }
        cfgData m1784i = cfgData.m1784i();
        m1784i.f2656l2 = trim;
        m1784i.m1795o(ymSettingsActivity);
        if (ymSettingsActivity.f2371E == null) {
            return;
        }
        if (trim.isEmpty()) {
            ymSettingsActivity.f2371E.setText(R.string.ym_pick_account);
        } else {
            ymSettingsActivity.f2371E.setText(trim);
        }
    }

    @Override // p014G.InterfaceC0101b
    /* renamed from: c */
    public void mo341c() {
        C0401b0 c0401b0 = (C0401b0) this.f701f;
        AbstractC1461d.m3494e("this$0", c0401b0);
        c0401b0.m1079a();
    }

    @Override // com.altaysoft.t500_split.media.InterfaceC0649q
    /* renamed from: e */
    public void mo19e(C0112d c0112d) {
        Exception exc = (Exception) this.f701f;
        c0112d.m359j(exc.getMessage() == null ? "ошибка" : exc.getMessage());
    }
}
