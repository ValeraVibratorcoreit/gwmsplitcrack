package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.p0 */
/* loaded from: classes.dex */
public final class RunnableC1565p0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8525a;

    /* renamed from: b */
    public final /* synthetic */ C1568q0 f8526b;

    public /* synthetic */ RunnableC1565p0(C1568q0 c1568q0, int i) {
        this.f8525a = i;
        this.f8526b = c1568q0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8525a) {
            case 0:
                C1568q0 c1568q0 = this.f8526b;
                if (c1568q0.f8567M0) {
                    if (!c1568q0.f8579S0) {
                        C1572s c1572s = c1568q0.f8559I0;
                        float f2 = c1572s.f8682h;
                        float f3 = c1568q0.f8561J0.f8682h;
                        c1572s.m4471b(c1568q0.f8645r);
                        c1568q0.f8561J0.m4471b(c1568q0.f8648s);
                        C1568q0.m4329a(c1568q0, c1568q0.f8660x, c1568q0.f8664z, f2, c1568q0.f8559I0.f8682h);
                        C1568q0.m4329a(c1568q0, c1568q0.f8662y, c1568q0.f8542A, f3, c1568q0.f8561J0.f8682h);
                        C1572s c1572s2 = c1568q0.f8563K0;
                        if (c1572s2 != null) {
                            c1572s2.m4471b(c1568q0.f8651t);
                        }
                        C1572s c1572s3 = c1568q0.f8565L0;
                        if (c1572s3 != null) {
                            c1572s3.m4471b(c1568q0.f8654u);
                        }
                    }
                    c1568q0.f8609f.postDelayed(this, 16L);
                    break;
                }
                break;
            case 1:
                C1568q0 c1568q02 = this.f8526b;
                if (c1568q02.f8567M0) {
                    float f4 = c1568q02.f8638o1;
                    if (f4 > 0.0f) {
                        float f5 = f4 - 0.03f;
                        c1568q02.f8638o1 = f5;
                        if (f5 < 0.0f) {
                            c1568q02.f8638o1 = 0.0f;
                        }
                        ViewGroup viewGroup = c1568q02.f8612g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1568q02.f8612g.setAlpha(c1568q02.f8638o1);
                        }
                    }
                    boolean z2 = AbstractC1372y1.f6437g;
                    if (z2 != c1568q02.f8555G0) {
                        c1568q02.f8555G0 = z2;
                        c1568q02.m4419q(true);
                    }
                    View view = c1568q02.f8637o0;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1568q02.f8665z0;
                        if (c1568q02.f8545B0) {
                            j2 += SystemClock.elapsedRealtime() - c1568q02.f8547C0;
                        }
                        long j3 = c1568q02.f8543A0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1568q02.m4425s(j2);
                    }
                    c1568q02.f8609f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1568q0 c1568q03 = this.f8526b;
                if (c1568q03.f8567M0) {
                    TextView textView = c1568q03.f8595a0;
                    Context context = c1568q03.f8600c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1568q03.f8609f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
