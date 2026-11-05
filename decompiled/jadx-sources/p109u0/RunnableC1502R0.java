package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.R0 */
/* loaded from: classes.dex */
public final class RunnableC1502R0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7752a;

    /* renamed from: b */
    public final /* synthetic */ C1506T0 f7753b;

    public /* synthetic */ RunnableC1502R0(C1506T0 c1506t0, int i) {
        this.f7752a = i;
        this.f7753b = c1506t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7752a) {
            case 0:
                C1506T0 c1506t0 = this.f7753b;
                if (c1506t0.f7778G0) {
                    if (!c1506t0.f7790M0) {
                        C1504S0 c1504s0 = c1506t0.f7770C0;
                        if (c1504s0 != null) {
                            c1504s0.m3921b(c1506t0.f7863r);
                        }
                        C1504S0 c1504s02 = c1506t0.f7772D0;
                        if (c1504s02 != null) {
                            c1504s02.m3921b(c1506t0.f7865s);
                        }
                        C1504S0 c1504s03 = c1506t0.f7774E0;
                        if (c1504s03 != null) {
                            c1504s03.m3921b(c1506t0.f7867t);
                        }
                        C1504S0 c1504s04 = c1506t0.f7776F0;
                        if (c1504s04 != null) {
                            c1504s04.m3921b(c1506t0.f7869u);
                        }
                        c1506t0.m4046y();
                        c1506t0.m3944B0();
                    }
                    c1506t0.f7832f.postDelayed(this, 16L);
                    break;
                }
                break;
            case 1:
                C1506T0 c1506t02 = this.f7753b;
                if (c1506t02.f7778G0) {
                    float f2 = c1506t02.f7837g1;
                    if (f2 > 0.0f) {
                        float f3 = f2 - 0.03f;
                        c1506t02.f7837g1 = f3;
                        if (f3 < 0.0f) {
                            c1506t02.f7837g1 = 0.0f;
                        }
                        ViewGroup viewGroup = c1506t02.f7835g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1506t02.f7835g.setAlpha(c1506t02.f7837g1);
                        }
                    }
                    boolean z2 = AbstractC1372y1.f6437g;
                    if (z2 != c1506t02.f7766A0) {
                        c1506t02.f7766A0 = z2;
                        c1506t02.m4020p(true);
                    }
                    View view = c1506t02.f7842i0;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1506t02.f7868t0;
                        if (c1506t02.f7872v0) {
                            j2 += SystemClock.elapsedRealtime() - c1506t02.f7874w0;
                        }
                        long j3 = c1506t02.f7870u0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1506t02.m4026r(j2);
                    }
                    c1506t02.f7832f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1506T0 c1506t03 = this.f7753b;
                if (c1506t03.f7778G0) {
                    TextView textView = c1506t03.f7805U;
                    Context context = c1506t03.f7823c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1506t03.f7832f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
