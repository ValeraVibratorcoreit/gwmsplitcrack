package p098q0;

import android.view.View;
import android.widget.AdapterView;
import com.altaysoft.t500_split.AutoBrightnessSettingsActivity;
import com.altaysoft.t500_split.AutoPresetSettingsActivity;
import com.altaysoft.t500_split.cfgData;

/* renamed from: q0.l */
/* loaded from: classes.dex */
public final class C1331l implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    public final /* synthetic */ int f6281f;

    /* renamed from: g */
    public final /* synthetic */ boolean[] f6282g;

    /* renamed from: h */
    public final /* synthetic */ Object f6283h;

    public /* synthetic */ C1331l(boolean[] zArr, Object obj, int i) {
        this.f6281f = i;
        this.f6282g = zArr;
        this.f6283h = obj;
    }

    /* renamed from: a */
    private final void m3238a(AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m3239b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        Object obj = this.f6283h;
        boolean[] zArr = this.f6282g;
        switch (this.f6281f) {
            case 0:
                if (!zArr[0]) {
                    C1322i c1322i = (C1322i) obj;
                    int m1781b = cfgData.m1781b(i, 0);
                    switch (c1322i.f6146a) {
                        case 0:
                            int i2 = AutoBrightnessSettingsActivity.f2262E;
                            AutoBrightnessSettingsActivity autoBrightnessSettingsActivity = c1322i.f6147b;
                            autoBrightnessSettingsActivity.getClass();
                            c1322i.f6148c.f2676p2 = m1781b;
                            cfgData.m1784i().m1795o(autoBrightnessSettingsActivity);
                            AbstractC1319h.m3189e(autoBrightnessSettingsActivity);
                            break;
                        default:
                            int i3 = AutoBrightnessSettingsActivity.f2262E;
                            AutoBrightnessSettingsActivity autoBrightnessSettingsActivity2 = c1322i.f6147b;
                            autoBrightnessSettingsActivity2.getClass();
                            c1322i.f6148c.f2681q2 = m1781b;
                            cfgData.m1784i().m1795o(autoBrightnessSettingsActivity2);
                            AbstractC1319h.m3189e(autoBrightnessSettingsActivity2);
                            break;
                    }
                }
                break;
            default:
                if (!zArr[0]) {
                    int m1782c = cfgData.m1782c(i + 1, 1);
                    C1334m c1334m = (C1334m) obj;
                    switch (c1334m.f6291a) {
                        case 0:
                            int i4 = AutoPresetSettingsActivity.f2263F;
                            AutoPresetSettingsActivity autoPresetSettingsActivity = c1334m.f6292b;
                            autoPresetSettingsActivity.getClass();
                            c1334m.f6293c.f2701u2 = m1782c;
                            autoPresetSettingsActivity.m1648v();
                            break;
                        default:
                            int i5 = AutoPresetSettingsActivity.f2263F;
                            AutoPresetSettingsActivity autoPresetSettingsActivity2 = c1334m.f6292b;
                            autoPresetSettingsActivity2.getClass();
                            c1334m.f6293c.f2706v2 = m1782c;
                            autoPresetSettingsActivity2.m1648v();
                            break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f6281f;
    }
}
