package p112v0;

import androidx.lifecycle.EnumC0548m;
import com.altaysoft.t500_split.MainActivity;
import p098q0.RunnableC1320h0;

/* renamed from: v0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1611d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9233a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f9234b;

    /* renamed from: c */
    public final /* synthetic */ RunnableC1320h0 f9235c;

    /* renamed from: d */
    public final /* synthetic */ int f9236d;

    public /* synthetic */ RunnableC1611d(MainActivity mainActivity, RunnableC1320h0 runnableC1320h0, int i, int i2) {
        this.f9233a = i2;
        this.f9234b = mainActivity;
        this.f9235c = runnableC1320h0;
        this.f9236d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9233a) {
            case 0:
                MainActivity mainActivity = this.f9234b;
                if (!mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                    boolean z2 = mainActivity.f1501f.f2001c.compareTo(EnumC0548m.f1994e) >= 0;
                    RunnableC1320h0 runnableC1320h0 = this.f9235c;
                    if (!z2) {
                        int i = this.f9236d;
                        if (i < 40) {
                            AbstractC1612e.f9244h.postDelayed(new RunnableC1611d(mainActivity, runnableC1320h0, i, 1), 50L);
                            break;
                        }
                    } else {
                        runnableC1320h0.run();
                        break;
                    }
                }
                break;
            default:
                AbstractC1612e.f9244h.post(new RunnableC1611d(this.f9234b, this.f9235c, this.f9236d + 1, 0));
                break;
        }
    }
}
