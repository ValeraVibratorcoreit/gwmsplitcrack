package p109u0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.B */
/* loaded from: classes.dex */
public final class RunnableC1470B implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7171a;

    /* renamed from: b */
    public final /* synthetic */ C1474D f7172b;

    public /* synthetic */ RunnableC1470B(C1474D c1474d, int i) {
        this.f7171a = i;
        this.f7172b = c1474d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7171a) {
            case 0:
                C1474D c1474d = this.f7172b;
                if (c1474d.f7192C0) {
                    if (!c1474d.f7204I0) {
                        c1474d.f7188A0.m3500b(c1474d.f7278r);
                        c1474d.f7190B0.m3500b(c1474d.f7280s);
                    }
                    c1474d.f7254f.postDelayed(this, 16L);
                    break;
                }
                break;
            case 1:
                C1474D c1474d2 = this.f7172b;
                if (c1474d2.f7192C0) {
                    float f2 = c1474d2.f7238Z0;
                    if (f2 > 0.0f) {
                        float f3 = f2 - 0.03f;
                        c1474d2.f7238Z0 = f3;
                        if (f3 < 0.0f) {
                            c1474d2.f7238Z0 = 0.0f;
                        }
                        ViewGroup viewGroup = c1474d2.f7256g;
                        if (viewGroup != null) {
                            viewGroup.animate().cancel();
                            c1474d2.f7256g.setAlpha(c1474d2.f7238Z0);
                        }
                    }
                    View view = c1474d2.f7273o0;
                    if (view != null && view.getVisibility() == 0) {
                        long j2 = c1474d2.f7287v0;
                        if (c1474d2.f7291x0) {
                            j2 += SystemClock.elapsedRealtime() - c1474d2.f7293y0;
                        }
                        long j3 = c1474d2.f7289w0;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1474d2.m3567m(j2);
                    }
                    c1474d2.f7254f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1474D c1474d3 = this.f7172b;
                if (c1474d3.f7192C0) {
                    TextView textView = c1474d3.f7246c0;
                    Context context = c1474d3.f7245c;
                    if (textView != null) {
                        textView.setText(AbstractC1372y1.m3307m(context));
                    }
                    AbstractC1539g1.m4226k0(context);
                    c1474d3.f7254f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
