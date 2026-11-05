package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.altaysoft.t500_split.p061ip.Theme43BarView;
import java.util.Locale;
import p006C.AbstractC0062j;
import p098q0.AbstractC1372y1;

/* renamed from: u0.O */
/* loaded from: classes.dex */
public final class RunnableC1496O implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7660a;

    /* renamed from: b */
    public final /* synthetic */ C1498P f7661b;

    public /* synthetic */ RunnableC1496O(C1498P c1498p, int i) {
        this.f7660a = i;
        this.f7661b = c1498p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m4235q;
        switch (this.f7660a) {
            case 0:
                C1498P c1498p = this.f7661b;
                if (c1498p.f7738w0) {
                    float f2 = c1498p.f7742y0;
                    if (f2 > 0.0f) {
                        float f3 = f2 - 0.03f;
                        c1498p.f7742y0 = f3;
                        if (f3 < 0.0f) {
                            c1498p.f7742y0 = 0.0f;
                        }
                        ViewGroup viewGroup = c1498p.f7705g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1498p.f7705g.setAlpha(c1498p.f7742y0);
                        }
                    }
                    View view = c1498p.f7688V;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1498p.f7700d0;
                        if (c1498p.f7704f0) {
                            j2 += SystemClock.elapsedRealtime() - c1498p.f7706g0;
                        }
                        long j3 = c1498p.f7702e0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1498p.m3900b(j2);
                    }
                    float min = Math.min(1.0f, (SystemClock.elapsedRealtime() - c1498p.f7716l0) / 1000.0f);
                    float f4 = c1498p.f7714k0;
                    float m149c = AbstractC0062j.m149c(c1498p.f7712j0, f4, min, f4);
                    c1498p.f7710i0 = m149c;
                    if (c1498p.f7713k != null) {
                        c1498p.f7713k.setProgress(Math.min(299, Math.max(0, Math.round(Math.min(m149c, 29.9f) * 10.0f))));
                        Theme43BarView theme43BarView = c1498p.f7713k;
                        float f5 = c1498p.f7710i0;
                        if (f5 <= 0.001f) {
                            m4235q = -11917264;
                        } else {
                            float max = Math.max(0.0f, Math.min(1.0f, f5 / 29.9f));
                            m4235q = max < 0.35f ? AbstractC1539g1.m4235q(max / 0.35f, -11751576, -28640) : AbstractC1539g1.m4235q((max - 0.35f) / 0.65f, -28640, -1754827);
                        }
                        theme43BarView.setBarProgressColor(m4235q);
                    }
                    TextView textView = c1498p.f7709i;
                    if (textView != null) {
                        if (c1498p.f7710i0 > 0.001f) {
                            textView.setText(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(c1498p.f7710i0)).replace(",", ".") + " L");
                        } else {
                            textView.setText("-.- L");
                        }
                    }
                    if (c1498p.f7711j != null) {
                        c1498p.f7711j.setText(c1498p.f7701e.m1780z() > 0.0f ? "/100km" : "/час");
                    }
                    c1498p.f7703f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1498P c1498p2 = this.f7661b;
                if (c1498p2.f7738w0) {
                    TextView textView2 = c1498p2.f7675I;
                    Context context = c1498p2.f7697c;
                    if (textView2 != null) {
                        textView2.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1498p2.f7703f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
