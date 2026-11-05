package p098q0;

import android.view.View;
import android.widget.AdapterView;
import com.altaysoft.t500_split.media.AbstractC0638f;

/* renamed from: q0.h1 */
/* loaded from: classes.dex */
public final class C1321h1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    public final /* synthetic */ int f6144f;

    /* renamed from: g */
    public final /* synthetic */ C1324i1 f6145g;

    public /* synthetic */ C1321h1(C1324i1 c1324i1, int i) {
        this.f6144f = i;
        this.f6145g = c1324i1;
    }

    /* renamed from: a */
    private final void m3190a(AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m3191b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        switch (this.f6144f) {
            case 0:
                C1324i1 c1324i1 = this.f6145g;
                if (c1324i1.f6234m0) {
                    c1324i1.f6218e0.setWindowMinutes(C1324i1.f6152f1[Math.max(0, Math.min(i, 3))]);
                    c1324i1.m3231s();
                    break;
                }
                break;
            default:
                C1324i1 c1324i12 = this.f6145g;
                if (c1324i12.f6174K0 && !c1324i12.f6176L0) {
                    String str = (i < 0 || i >= c1324i12.f6188R0.size()) ? null : (String) this.f6145g.f6188R0.get(i);
                    AbstractC0638f.f3008b = (str == null || !str.isEmpty()) ? str : null;
                    this.f6145g.m3209O();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f6144f;
    }
}
