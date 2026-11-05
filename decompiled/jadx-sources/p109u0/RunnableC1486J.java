package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.J */
/* loaded from: classes.dex */
public final class RunnableC1486J implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7442a;

    /* renamed from: b */
    public final /* synthetic */ C1488K f7443b;

    public /* synthetic */ RunnableC1486J(C1488K c1488k, int i) {
        this.f7442a = i;
        this.f7443b = c1488k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7442a) {
            case 0:
                C1488K c1488k = this.f7443b;
                if (c1488k.f7494k0) {
                    float f2 = c1488k.f7510s0;
                    if (f2 > 0.0f) {
                        float f3 = f2 - 0.03f;
                        c1488k.f7510s0 = f3;
                        if (f3 < 0.0f) {
                            c1488k.f7510s0 = 0.0f;
                        }
                        ViewGroup viewGroup = c1488k.f7485g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1488k.f7485g.setAlpha(c1488k.f7510s0);
                        }
                    }
                    View view = c1488k.f7468V;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1488k.f7478c0;
                        if (c1488k.f7482e0) {
                            j2 += SystemClock.elapsedRealtime() - c1488k.f7484f0;
                        }
                        long j3 = c1488k.f7480d0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1488k.m3733b(j2);
                    }
                    c1488k.f7483f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1488K c1488k2 = this.f7443b;
                if (c1488k2.f7494k0) {
                    TextView textView = c1488k2.f7509s;
                    Context context = c1488k2.f7477c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1488k2.f7483f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
