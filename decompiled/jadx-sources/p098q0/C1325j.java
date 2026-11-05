package p098q0;

import android.view.View;
import android.widget.CompoundButton;
import com.altaysoft.t500_split.AutoBrightnessSettingsActivity;
import com.altaysoft.t500_split.AutoPresetSettingsActivity;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.cfgData;
import p070g.AbstractActivityC0870i;

/* renamed from: q0.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C1325j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f6261a;

    /* renamed from: b */
    public final /* synthetic */ cfgData f6262b;

    /* renamed from: c */
    public final /* synthetic */ View f6263c;

    /* renamed from: d */
    public final /* synthetic */ AbstractActivityC0870i f6264d;

    public /* synthetic */ C1325j(AbstractActivityC0870i abstractActivityC0870i, cfgData cfgdata, View view, int i) {
        this.f6261a = i;
        this.f6264d = abstractActivityC0870i;
        this.f6262b = cfgdata;
        this.f6263c = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        View view = this.f6263c;
        cfgData cfgdata = this.f6262b;
        AbstractActivityC0870i abstractActivityC0870i = this.f6264d;
        switch (this.f6261a) {
            case 0:
                int i = AutoBrightnessSettingsActivity.f2262E;
                AutoBrightnessSettingsActivity autoBrightnessSettingsActivity = (AutoBrightnessSettingsActivity) abstractActivityC0870i;
                autoBrightnessSettingsActivity.getClass();
                cfgdata.f2671o2 = z2;
                view.setAlpha(z2 ? 1.0f : 0.4f);
                AutoBrightnessSettingsActivity.m1643u(view, z2);
                cfgData.m1784i().m1795o(autoBrightnessSettingsActivity);
                AbstractC1319h.m3189e(autoBrightnessSettingsActivity);
                break;
            case 1:
                int i2 = AutoPresetSettingsActivity.f2263F;
                AutoPresetSettingsActivity autoPresetSettingsActivity = (AutoPresetSettingsActivity) abstractActivityC0870i;
                autoPresetSettingsActivity.getClass();
                cfgdata.f2691s2 = z2;
                view.setAlpha(z2 ? 1.0f : 0.4f);
                AutoPresetSettingsActivity.m1645w(view, z2);
                autoPresetSettingsActivity.m1648v();
                break;
            default:
                int i3 = YmSettingsActivity.f2370J;
                YmSettingsActivity ymSettingsActivity = (YmSettingsActivity) abstractActivityC0870i;
                ymSettingsActivity.getClass();
                cfgdata.f2666n2 = z2;
                if (view != null) {
                    view.setAlpha(z2 ? 1.0f : 0.4f);
                    YmSettingsActivity.m1708v(view, z2);
                }
                cfgdata.m1795o(ymSettingsActivity);
                break;
        }
    }
}
