package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.K0 */
/* loaded from: classes.dex */
public final class RunnableC1489K0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7523a;

    /* renamed from: b */
    public final /* synthetic */ C1491L0 f7524b;

    public /* synthetic */ RunnableC1489K0(C1491L0 c1491l0, int i) {
        this.f7523a = i;
        this.f7524b = c1491l0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7523a) {
            case 0:
                C1491L0 c1491l0 = this.f7524b;
                if (c1491l0.f7551K0) {
                    if (!c1491l0.f7563Q0) {
                        C1572s c1572s = c1491l0.f7543G0;
                        float f2 = c1572s.f8682h;
                        float f3 = c1491l0.f7545H0.f8682h;
                        c1572s.m4471b(c1491l0.f7633r);
                        c1491l0.f7545H0.m4471b(c1491l0.f7636s);
                        C1491L0.m3764a(c1491l0, c1491l0.f7646x, c1491l0.f7650z, f2, c1491l0.f7543G0.f8682h);
                        C1491L0.m3764a(c1491l0, c1491l0.f7648y, c1491l0.f7530A, f3, c1491l0.f7545H0.f8682h);
                        C1572s c1572s2 = c1491l0.f7547I0;
                        if (c1572s2 != null) {
                            c1572s2.m4471b(c1491l0.f7638t);
                        }
                        C1572s c1572s3 = c1491l0.f7549J0;
                        if (c1572s3 != null) {
                            c1572s3.m4471b(c1491l0.f7640u);
                        }
                    }
                    c1491l0.f7597f.postDelayed(this, 16L);
                    break;
                }
                break;
            case 1:
                C1491L0 c1491l02 = this.f7524b;
                if (c1491l02.f7551K0) {
                    float f4 = c1491l02.f7620m1;
                    if (f4 > 0.0f) {
                        float f5 = f4 - 0.03f;
                        c1491l02.f7620m1 = f5;
                        if (f5 < 0.0f) {
                            c1491l02.f7620m1 = 0.0f;
                        }
                        ViewGroup viewGroup = c1491l02.f7600g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1491l02.f7600g.setAlpha(c1491l02.f7620m1);
                        }
                    }
                    boolean z2 = AbstractC1372y1.f6437g;
                    if (z2 != c1491l02.f7539E0) {
                        c1491l02.f7539E0 = z2;
                        c1491l02.m3858q(true);
                    }
                    View view = c1491l02.f7619m0;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1491l02.f7647x0;
                        if (c1491l02.f7651z0) {
                            j2 += SystemClock.elapsedRealtime() - c1491l02.f7531A0;
                        }
                        long j3 = c1491l02.f7649y0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1491l02.m3864s(j2);
                    }
                    c1491l02.f7597f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1491L0 c1491l03 = this.f7524b;
                if (c1491l03.f7551K0) {
                    TextView textView = c1491l03.f7578Y;
                    Context context = c1491l03.f7588c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1491l03.f7597f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
