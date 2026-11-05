package p109u0;

import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.HashMap;
import java.util.Map;
import p098q0.C1260G0;

/* renamed from: u0.X0 */
/* loaded from: classes.dex */
public final class RunnableC1514X0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7976a;

    /* renamed from: b */
    public final /* synthetic */ C1518Z0 f7977b;

    public /* synthetic */ RunnableC1514X0(C1518Z0 c1518z0, int i) {
        this.f7976a = i;
        this.f7977b = c1518z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1560n1 c1560n1;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        switch (this.f7976a) {
            case 0:
                C1518Z0 c1518z0 = this.f7977b;
                if (c1518z0.f8006S) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    float f2 = c1518z0.f8005R == 0 ? 16.0f : uptimeMillis - r3;
                    c1518z0.f8005R = uptimeMillis;
                    if (f2 < 1.0f) {
                        f2 = 1.0f;
                    }
                    if (f2 > 100.0f) {
                        f2 = 100.0f;
                    }
                    C1260G0 c1260g0 = c1518z0.f8001N;
                    if (c1260g0 != null && (imageView4 = c1518z0.f8030m) != null) {
                        c1260g0.m3035b(1.0f, f2, imageView4);
                        C1524b1 c1524b1 = c1518z0.f8032o;
                        if (c1524b1 != null) {
                            c1524b1.setNeedleAngle(c1518z0.f8030m.getRotation());
                        }
                    }
                    C1260G0 c1260g02 = c1518z0.f8002O;
                    if (c1260g02 != null && (imageView3 = c1518z0.f8031n) != null) {
                        c1260g02.m3035b(1.0f, f2, imageView3);
                        C1524b1 c1524b12 = c1518z0.f8033p;
                        if (c1524b12 != null) {
                            c1524b12.setNeedleAngle(c1518z0.f8031n.getRotation());
                        }
                    }
                    C1260G0 c1260g03 = c1518z0.f8003P;
                    if (c1260g03 != null && (imageView2 = c1518z0.f8034q) != null) {
                        c1260g03.m3035b(1.0f, f2, imageView2);
                    }
                    C1260G0 c1260g04 = c1518z0.f8004Q;
                    if (c1260g04 != null && (imageView = c1518z0.f8035r) != null) {
                        c1260g04.m3035b(1.0f, f2, imageView);
                    }
                    HashMap hashMap = c1518z0.f7998K;
                    if (!hashMap.isEmpty()) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            C1516Y0 c1516y0 = (C1516Y0) entry.getValue();
                            if (c1516y0.f7985f && (c1560n1 = (C1560n1) c1518z0.f7995H.get(entry.getKey())) != null && c1560n1.f8466g0) {
                                float m4089w = C1518Z0.m4089w(c1516y0, elapsedRealtime);
                                if (Float.isNaN(c1516y0.f7982c) || Math.abs(m4089w - c1516y0.f7982c) >= 5.0E-4f) {
                                    c1516y0.f7982c = m4089w;
                                    c1518z0.m4098I((String) entry.getKey(), m4089w, true);
                                }
                            }
                        }
                    }
                    c1518z0.f8023f.postDelayed(this, 16L);
                    break;
                }
                break;
            case 1:
                C1518Z0 c1518z02 = this.f7977b;
                if (c1518z02.f8006S) {
                    float f3 = c1518z02.f8008U;
                    if (f3 > 0.0f) {
                        float f4 = f3 - 0.03f;
                        c1518z02.f8008U = f4;
                        if (f4 < 0.0f) {
                            c1518z02.f8008U = 0.0f;
                        }
                        FrameLayout frameLayout = c1518z02.f8025h;
                        if (frameLayout != null) {
                            frameLayout.animate().cancel();
                            c1518z02.f8025h.setAlpha(c1518z02.f8008U);
                        }
                    }
                    c1518z02.m4124z("clock");
                    c1518z02.m4124z("date");
                    c1518z02.m4092C("moto_hours");
                    LinearLayout linearLayout = c1518z02.f8038u;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        long j2 = c1518z02.f7990C;
                        if (c1518z02.f7991D) {
                            j2 += SystemClock.elapsedRealtime() - c1518z02.f7992E;
                        }
                        long j3 = c1518z02.f7989B;
                        if (j3 > 0 && j2 > j3) {
                            j2 = j3;
                        }
                        c1518z02.m4111f(j2);
                    }
                    c1518z02.f8023f.postDelayed(this, 200L);
                    break;
                }
                break;
            default:
                C1518Z0 c1518z03 = this.f7977b;
                if (c1518z03.f8006S) {
                    AbstractC1539g1.m4226k0(c1518z03.f8014a);
                    c1518z03.f8023f.postDelayed(this, 2000L);
                    break;
                }
                break;
        }
    }
}
