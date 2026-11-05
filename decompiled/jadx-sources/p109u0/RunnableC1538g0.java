package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.g0 */
/* loaded from: classes.dex */
public final class RunnableC1538g0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8250a;

    /* renamed from: b */
    public final /* synthetic */ C1541h0 f8251b;

    public /* synthetic */ RunnableC1538g0(C1541h0 c1541h0, int i) {
        this.f8250a = i;
        this.f8251b = c1541h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8250a) {
            case 0:
                C1541h0 c1541h0 = this.f8251b;
                if (c1541h0.f8304i0) {
                    float f2 = c1541h0.f8308k0;
                    if (f2 > 0.0f) {
                        float f3 = f2 - 0.03f;
                        c1541h0.f8308k0 = f3;
                        if (f3 < 0.0f) {
                            c1541h0.f8308k0 = 0.0f;
                        }
                        ViewGroup viewGroup = c1541h0.f8299g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1541h0.f8299g.setAlpha(c1541h0.f8308k0);
                        }
                    }
                    boolean z2 = AbstractC1372y1.f6437g;
                    if (z2 != c1541h0.f8286Z) {
                        c1541h0.f8286Z = z2;
                        if (!c1541h0.m4275n()) {
                            c1541h0.m4260I(true);
                        }
                    }
                    View view = c1541h0.f8270J;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1541h0.f8279S;
                        if (c1541h0.f8281U) {
                            j2 += SystemClock.elapsedRealtime() - c1541h0.f8282V;
                        }
                        long j3 = c1541h0.f8280T;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1541h0.m4267d(j2);
                    }
                    c1541h0.f8297f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1541h0 c1541h02 = this.f8251b;
                if (c1541h02.f8304i0) {
                    TextView textView = c1541h02.f8316p;
                    Context context = c1541h02.f8291c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1541h02.f8297f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
