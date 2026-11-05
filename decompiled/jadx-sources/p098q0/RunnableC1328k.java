package p098q0;

import com.altaysoft.t500_split.AutoBrightnessSettingsActivity;
import com.altaysoft.t500_split.AutoPresetSettingsActivity;
import com.altaysoft.t500_split.SplitInfoSettingsActivity;

/* renamed from: q0.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1328k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6272a;

    /* renamed from: b */
    public final /* synthetic */ boolean[] f6273b;

    public /* synthetic */ RunnableC1328k(boolean[] zArr, int i) {
        this.f6272a = i;
        this.f6273b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean[] zArr = this.f6273b;
        switch (this.f6272a) {
            case 0:
                int i = AutoBrightnessSettingsActivity.f2262E;
                zArr[0] = false;
                break;
            case 1:
                int i2 = AutoPresetSettingsActivity.f2263F;
                zArr[0] = false;
                break;
            default:
                int i3 = SplitInfoSettingsActivity.f2342E;
                zArr[0] = false;
                break;
        }
    }
}
