package p098q0;

import android.view.View;
import android.widget.AdapterView;
import com.altaysoft.t500_split.SplitInfoSettingsActivity;
import com.altaysoft.t500_split.cfgData;

/* renamed from: q0.j1 */
/* loaded from: classes.dex */
public final class C1327j1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    public final /* synthetic */ boolean[] f6269f;

    /* renamed from: g */
    public final /* synthetic */ cfgData f6270g;

    /* renamed from: h */
    public final /* synthetic */ SplitInfoSettingsActivity f6271h;

    public C1327j1(SplitInfoSettingsActivity splitInfoSettingsActivity, boolean[] zArr, cfgData cfgdata) {
        this.f6271h = splitInfoSettingsActivity;
        this.f6269f = zArr;
        this.f6270g = cfgdata;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        if (this.f6269f[0]) {
            return;
        }
        int m1783d = cfgData.m1783d(i);
        cfgData cfgdata = this.f6270g;
        cfgdata.f2517F2 = m1783d;
        cfgdata.m1795o(this.f6271h);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
