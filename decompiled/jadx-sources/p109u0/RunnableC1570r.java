package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.r */
/* loaded from: classes.dex */
public final class RunnableC1570r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8671a;

    /* renamed from: b */
    public final /* synthetic */ C1576u f8672b;

    public /* synthetic */ RunnableC1570r(C1576u c1576u, int i) {
        this.f8671a = i;
        this.f8672b = c1576u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8671a) {
            case 0:
                C1576u c1576u = this.f8672b;
                if (c1576u.f8755a1) {
                    if (!c1576u.f8773g1) {
                        C1572s c1572s = c1576u.f8746W0;
                        float f2 = c1572s.f8682h;
                        float f3 = c1576u.f8748X0.f8682h;
                        c1572s.m4471b(c1576u.f8804r);
                        c1576u.f8748X0.m4471b(c1576u.f8807s);
                        c1576u.m4581r1();
                        C1576u.m4484a(c1576u, c1576u.f8710F, c1576u.f8715H, f2, c1576u.f8746W0.f8682h);
                        C1576u.m4484a(c1576u, c1576u.f8713G, c1576u.f8717I, f3, c1576u.f8748X0.f8682h);
                    }
                    c1576u.f8768f.postDelayed(this, 16L);
                    break;
                }
                break;
            case 1:
                C1576u c1576u2 = this.f8672b;
                if (c1576u2.f8755a1) {
                    float f4 = c1576u2.f8697A1;
                    if (f4 > 0.0f) {
                        float f5 = f4 - 0.03f;
                        c1576u2.f8697A1 = f5;
                        if (f5 < 0.0f) {
                            c1576u2.f8697A1 = 0.0f;
                        }
                        ViewGroup viewGroup = c1576u2.f8771g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1576u2.f8771g.setAlpha(c1576u2.f8697A1);
                        }
                    }
                    boolean z2 = AbstractC1372y1.f6437g;
                    if (z2 != c1576u2.f8742U0) {
                        c1576u2.f8742U0 = z2;
                        c1576u2.m4585t(true);
                    }
                    View view = c1576u2.f8702C0;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1576u2.f8728N0;
                        if (c1576u2.f8732P0) {
                            j2 += SystemClock.elapsedRealtime() - c1576u2.f8734Q0;
                        }
                        long j3 = c1576u2.f8730O0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1576u2.m4591v(j2);
                    }
                    c1576u2.f8768f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1576u c1576u3 = this.f8672b;
                if (c1576u3.f8755a1) {
                    TextView textView = c1576u3.f8796o0;
                    Context context = c1576u3.f8759c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1576u3.f8768f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
