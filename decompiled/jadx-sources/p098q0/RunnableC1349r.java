package p098q0;

import com.altaysoft.t500_split.ClimateTestActivity;
import com.altaysoft.t500_split.NativeLib;

/* renamed from: q0.r */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1349r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6344a;

    /* renamed from: b */
    public final /* synthetic */ float f6345b;

    public /* synthetic */ RunnableC1349r(int i, float f2) {
        this.f6344a = i;
        this.f6345b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f2 = this.f6345b;
        switch (this.f6344a) {
            case 0:
                int i = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacTemp(f2);
                break;
            default:
                int i2 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacTemp(f2);
                break;
        }
    }
}
