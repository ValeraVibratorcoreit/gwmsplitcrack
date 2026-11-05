package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.altaysoft.t500_split.p061ip.Theme44BarView;
import java.util.Locale;
import p006C.AbstractC0062j;
import p098q0.AbstractC1372y1;

/* renamed from: u0.U */
/* loaded from: classes.dex */
public final class RunnableC1507U implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7881a;

    /* renamed from: b */
    public final /* synthetic */ C1509V f7882b;

    public /* synthetic */ RunnableC1507U(C1509V c1509v, int i) {
        this.f7881a = i;
        this.f7882b = c1509v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m4236r;
        switch (this.f7881a) {
            case 0:
                C1509V c1509v = this.f7882b;
                if (c1509v.f7961w0) {
                    float f2 = c1509v.f7965y0;
                    if (f2 > 0.0f) {
                        float f3 = f2 - 0.03f;
                        c1509v.f7965y0 = f3;
                        if (f3 < 0.0f) {
                            c1509v.f7965y0 = 0.0f;
                        }
                        ViewGroup viewGroup = c1509v.f7928g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1509v.f7928g.setAlpha(c1509v.f7965y0);
                        }
                    }
                    View view = c1509v.f7911V;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1509v.f7923d0;
                        if (c1509v.f7927f0) {
                            j2 += SystemClock.elapsedRealtime() - c1509v.f7929g0;
                        }
                        long j3 = c1509v.f7925e0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1509v.m4063b(j2);
                    }
                    float min = Math.min(1.0f, (SystemClock.elapsedRealtime() - c1509v.f7939l0) / 1000.0f);
                    float f4 = c1509v.f7937k0;
                    float m149c = AbstractC0062j.m149c(c1509v.f7935j0, f4, min, f4);
                    c1509v.f7933i0 = m149c;
                    if (c1509v.f7936k != null) {
                        c1509v.f7936k.setProgress(Math.min(299, Math.max(0, Math.round(Math.min(m149c, 29.9f) * 10.0f))));
                        Theme44BarView theme44BarView = c1509v.f7936k;
                        float f5 = c1509v.f7933i0;
                        if (f5 <= 0.001f) {
                            m4236r = -15066598;
                        } else {
                            float max = Math.max(0.0f, Math.min(1.0f, f5 / 29.9f));
                            m4236r = max < 0.35f ? AbstractC1539g1.m4236r(max / 0.35f, -13092808, -9408400) : AbstractC1539g1.m4236r((max - 0.35f) / 0.65f, -9408400, -2565928);
                        }
                        theme44BarView.setBarProgressColor(m4236r);
                    }
                    TextView textView = c1509v.f7932i;
                    if (textView != null) {
                        if (c1509v.f7933i0 > 0.001f) {
                            textView.setText(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(c1509v.f7933i0)).replace(",", ".") + " L");
                        } else {
                            textView.setText("-.- L");
                        }
                    }
                    if (c1509v.f7934j != null) {
                        c1509v.f7934j.setText(c1509v.f7924e.m1780z() > 0.0f ? "/100km" : "/час");
                    }
                    c1509v.f7926f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1509V c1509v2 = this.f7882b;
                if (c1509v2.f7961w0) {
                    TextView textView2 = c1509v2.f7898I;
                    Context context = c1509v2.f7920c;
                    if (textView2 != null) {
                        textView2.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1509v2.f7926f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
