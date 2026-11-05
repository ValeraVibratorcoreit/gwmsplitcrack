package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.altaysoft.t500_split.p061ip.Theme45BarView;
import java.util.Locale;
import p006C.AbstractC0062j;
import p098q0.AbstractC1372y1;

/* renamed from: u0.Z */
/* loaded from: classes.dex */
public final class RunnableC1517Z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7986a;

    /* renamed from: b */
    public final /* synthetic */ C1520a0 f7987b;

    public /* synthetic */ RunnableC1517Z(C1520a0 c1520a0, int i) {
        this.f7986a = i;
        this.f7987b = c1520a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m4237s;
        switch (this.f7986a) {
            case 0:
                C1520a0 c1520a0 = this.f7987b;
                if (c1520a0.f8115u0) {
                    float f2 = c1520a0.f8119w0;
                    if (f2 > 0.0f) {
                        float f3 = f2 - 0.03f;
                        c1520a0.f8119w0 = f3;
                        if (f3 < 0.0f) {
                            c1520a0.f8119w0 = 0.0f;
                        }
                        ViewGroup viewGroup = c1520a0.f8086g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1520a0.f8086g.setAlpha(c1520a0.f8119w0);
                        }
                    }
                    View view = c1520a0.f8068U;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1520a0.f8079c0;
                        if (c1520a0.f8083e0) {
                            j2 += SystemClock.elapsedRealtime() - c1520a0.f8085f0;
                        }
                        long j3 = c1520a0.f8081d0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1520a0.m4134a(j2);
                    }
                    float min = Math.min(1.0f, (SystemClock.elapsedRealtime() - c1520a0.f8095k0) / 1000.0f);
                    float f4 = c1520a0.f8093j0;
                    float m149c = AbstractC0062j.m149c(c1520a0.f8091i0, f4, min, f4);
                    c1520a0.f8089h0 = m149c;
                    if (c1520a0.f8094k != null) {
                        c1520a0.f8094k.setProgress(Math.min(299, Math.max(0, Math.round(Math.min(m149c, 29.9f) * 10.0f))));
                        Theme45BarView theme45BarView = c1520a0.f8094k;
                        float f5 = c1520a0.f8089h0;
                        if (f5 <= 0.001f) {
                            m4237s = -15066598;
                        } else {
                            float max = Math.max(0.0f, Math.min(1.0f, f5 / 29.9f));
                            m4237s = max < 0.35f ? AbstractC1539g1.m4237s(max / 0.35f, -13092808, -9408400) : AbstractC1539g1.m4237s((max - 0.35f) / 0.65f, -9408400, -2565928);
                        }
                        theme45BarView.setBarProgressColor(m4237s);
                    }
                    TextView textView = c1520a0.f8090i;
                    if (textView != null) {
                        if (c1520a0.f8089h0 > 0.001f) {
                            textView.setText(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(c1520a0.f8089h0)).replace(",", ".") + " L");
                        } else {
                            textView.setText("-.- L");
                        }
                    }
                    if (c1520a0.f8092j != null) {
                        c1520a0.f8092j.setText(c1520a0.f8082e.m1780z() > 0.0f ? "/100km" : "/час");
                    }
                    c1520a0.f8084f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1520a0 c1520a02 = this.f7987b;
                if (c1520a02.f8115u0) {
                    TextView textView2 = c1520a02.f8056I;
                    Context context = c1520a02.f8078c;
                    if (textView2 != null) {
                        textView2.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1520a02.f8084f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
