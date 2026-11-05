package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.D0 */
/* loaded from: classes.dex */
public final class RunnableC1475D0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7296a;

    /* renamed from: b */
    public final /* synthetic */ C1477E0 f7297b;

    public /* synthetic */ RunnableC1475D0(C1477E0 c1477e0, int i) {
        this.f7296a = i;
        this.f7297b = c1477e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7296a) {
            case 0:
                C1477E0 c1477e0 = this.f7297b;
                if (c1477e0.f7324K0) {
                    if (!c1477e0.f7336Q0) {
                        C1572s c1572s = c1477e0.f7316G0;
                        float f2 = c1572s.f8682h;
                        float f3 = c1477e0.f7318H0.f8682h;
                        c1572s.m4471b(c1477e0.f7406r);
                        c1477e0.f7318H0.m4471b(c1477e0.f7409s);
                        C1477E0.m3598a(c1477e0, c1477e0.f7419x, c1477e0.f7423z, f2, c1477e0.f7316G0.f8682h);
                        C1477E0.m3598a(c1477e0, c1477e0.f7421y, c1477e0.f7303A, f3, c1477e0.f7318H0.f8682h);
                        C1572s c1572s2 = c1477e0.f7320I0;
                        if (c1572s2 != null) {
                            c1572s2.m4471b(c1477e0.f7411t);
                        }
                        C1572s c1572s3 = c1477e0.f7322J0;
                        if (c1572s3 != null) {
                            c1572s3.m4471b(c1477e0.f7413u);
                        }
                    }
                    c1477e0.f7370f.postDelayed(this, 16L);
                    break;
                }
                break;
            case 1:
                C1477E0 c1477e02 = this.f7297b;
                if (c1477e02.f7324K0) {
                    float f4 = c1477e02.f7393m1;
                    if (f4 > 0.0f) {
                        float f5 = f4 - 0.03f;
                        c1477e02.f7393m1 = f5;
                        if (f5 < 0.0f) {
                            c1477e02.f7393m1 = 0.0f;
                        }
                        ViewGroup viewGroup = c1477e02.f7373g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1477e02.f7373g.setAlpha(c1477e02.f7393m1);
                        }
                    }
                    boolean z2 = AbstractC1372y1.f6437g;
                    if (z2 != c1477e02.f7312E0) {
                        c1477e02.f7312E0 = z2;
                        c1477e02.m3692q(true);
                    }
                    View view = c1477e02.f7392m0;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1477e02.f7420x0;
                        if (c1477e02.f7424z0) {
                            j2 += SystemClock.elapsedRealtime() - c1477e02.f7304A0;
                        }
                        long j3 = c1477e02.f7422y0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1477e02.m3698s(j2);
                    }
                    c1477e02.f7370f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1477E0 c1477e03 = this.f7297b;
                if (c1477e03.f7324K0) {
                    TextView textView = c1477e03.f7351Y;
                    Context context = c1477e03.f7361c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1477e03.f7370f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
