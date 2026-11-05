package p082l;

import android.view.View;
import android.widget.AdapterView;
import com.altaysoft.t500_split.splitinfo.ChartsFullscreenActivity;
import com.altaysoft.t500_split.splitinfo.FullscreenChartsView;

/* renamed from: l.t0 */
/* loaded from: classes.dex */
public final class C1142t0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    public final /* synthetic */ int f5274f;

    /* renamed from: g */
    public final /* synthetic */ Object f5275g;

    public /* synthetic */ C1142t0(int i, Object obj) {
        this.f5274f = i;
        this.f5275g = obj;
    }

    /* renamed from: a */
    private final void m2767a(AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m2768b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C1130n0 c1130n0;
        switch (this.f5274f) {
            case 0:
                if (i != -1 && (c1130n0 = ((C1050A0) this.f5275g).f5002h) != null) {
                    c1130n0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ChartsFullscreenActivity chartsFullscreenActivity = (ChartsFullscreenActivity) this.f5275g;
                if (chartsFullscreenActivity.f3129J && chartsFullscreenActivity.f3125F != null) {
                    chartsFullscreenActivity.f3125F.setWindowMinutes(ChartsFullscreenActivity.f3123M[Math.max(0, Math.min(i, 3))]);
                    FullscreenChartsView fullscreenChartsView = chartsFullscreenActivity.f3125F;
                    if (!Float.isNaN(fullscreenChartsView.f3192z)) {
                        fullscreenChartsView.f3192z = Float.NaN;
                        fullscreenChartsView.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f5274f;
    }
}
