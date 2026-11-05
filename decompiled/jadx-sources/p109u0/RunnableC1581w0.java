package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.w0 */
/* loaded from: classes.dex */
public final class RunnableC1581w0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8840a;

    /* renamed from: b */
    public final /* synthetic */ C1583x0 f8841b;

    public /* synthetic */ RunnableC1581w0(C1583x0 c1583x0, int i) {
        this.f8840a = i;
        this.f8841b = c1583x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8840a) {
            case 0:
                C1583x0 c1583x0 = this.f8841b;
                if (c1583x0.f8868K0) {
                    if (!c1583x0.f8880Q0) {
                        C1572s c1572s = c1583x0.f8860G0;
                        float f2 = c1572s.f8682h;
                        float f3 = c1583x0.f8862H0.f8682h;
                        c1572s.m4471b(c1583x0.f8950r);
                        c1583x0.f8862H0.m4471b(c1583x0.f8953s);
                        C1583x0.m4619a(c1583x0, c1583x0.f8963x, c1583x0.f8967z, f2, c1583x0.f8860G0.f8682h);
                        C1583x0.m4619a(c1583x0, c1583x0.f8965y, c1583x0.f8847A, f3, c1583x0.f8862H0.f8682h);
                        C1572s c1572s2 = c1583x0.f8864I0;
                        if (c1572s2 != null) {
                            c1572s2.m4471b(c1583x0.f8955t);
                        }
                        C1572s c1572s3 = c1583x0.f8866J0;
                        if (c1572s3 != null) {
                            c1572s3.m4471b(c1583x0.f8957u);
                        }
                    }
                    c1583x0.f8914f.postDelayed(this, 16L);
                    break;
                }
                break;
            case 1:
                C1583x0 c1583x02 = this.f8841b;
                if (c1583x02.f8868K0) {
                    float f4 = c1583x02.f8937m1;
                    if (f4 > 0.0f) {
                        float f5 = f4 - 0.03f;
                        c1583x02.f8937m1 = f5;
                        if (f5 < 0.0f) {
                            c1583x02.f8937m1 = 0.0f;
                        }
                        ViewGroup viewGroup = c1583x02.f8917g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1583x02.f8917g.setAlpha(c1583x02.f8937m1);
                        }
                    }
                    boolean z2 = AbstractC1372y1.f6437g;
                    if (z2 != c1583x02.f8856E0) {
                        c1583x02.f8856E0 = z2;
                        c1583x02.m4709q(true);
                    }
                    View view = c1583x02.f8936m0;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1583x02.f8964x0;
                        if (c1583x02.f8968z0) {
                            j2 += SystemClock.elapsedRealtime() - c1583x02.f8848A0;
                        }
                        long j3 = c1583x02.f8966y0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1583x02.m4715s(j2);
                    }
                    c1583x02.f8914f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1583x0 c1583x03 = this.f8841b;
                if (c1583x03.f8868K0) {
                    TextView textView = c1583x03.f8895Y;
                    Context context = c1583x03.f8905c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1583x03.f8914f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
