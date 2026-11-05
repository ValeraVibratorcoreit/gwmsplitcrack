package p098q0;

import android.view.View;

/* renamed from: q0.M0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1272M0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5788a;

    /* renamed from: b */
    public final /* synthetic */ C1287U0 f5789b;

    /* renamed from: c */
    public final /* synthetic */ int f5790c;

    public /* synthetic */ RunnableC1272M0(C1287U0 c1287u0, int i, int i2) {
        this.f5788a = i2;
        this.f5789b = c1287u0;
        this.f5790c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5788a) {
            case 0:
                C1287U0 c1287u0 = this.f5789b;
                if (this.f5790c == c1287u0.f5989t) {
                    c1287u0.f5990u = false;
                    View view = c1287u0.f5978i;
                    if (view != null && c1287u0.f5973d != null && view.getParent() != null) {
                        try {
                            c1287u0.f5973d.removeView(c1287u0.f5978i);
                        } catch (Exception unused) {
                        }
                    }
                    c1287u0.m3116o();
                    break;
                }
                break;
            case 1:
                C1287U0 c1287u02 = this.f5789b;
                int i = c1287u02.f5965F;
                int i2 = this.f5790c;
                if (i2 == i && c1287u02.f5960A != null) {
                    c1287u02.m3106b(c1287u02.f5964E, 94, 220, i2, new RunnableC1272M0(c1287u02, i2, 2));
                    break;
                }
                break;
            default:
                C1287U0 c1287u03 = this.f5789b;
                if (this.f5790c == c1287u03.f5965F) {
                    c1287u03.m3118r();
                    c1287u03.f5966G = false;
                    c1287u03.f5967H = null;
                    c1287u03.m3116o();
                    break;
                }
                break;
        }
    }
}
