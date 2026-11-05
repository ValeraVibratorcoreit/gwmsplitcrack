package p098q0;

import android.app.ActivityManager;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.cfgData;
import java.util.Locale;
import p109u0.AbstractC1539g1;

/* renamed from: q0.N */
/* loaded from: classes.dex */
public final class RunnableC1273N implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5791a;

    /* renamed from: b */
    public final /* synthetic */ C1275O f5792b;

    public /* synthetic */ RunnableC1273N(C1275O c1275o, int i) {
        this.f5791a = i;
        this.f5792b = c1275o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float approximate;
        switch (this.f5791a) {
            case 0:
                C1275O c1275o = this.f5792b;
                if (!c1275o.f5882m) {
                    float f2 = 1.0f;
                    if (!c1275o.f5884m1) {
                        c1275o.f5803C.m3035b(1.0f, 16.0f, c1275o.f5907u0);
                        c1275o.f5801B.m3035b(1.0f, 16.0f, c1275o.f5901s0);
                    }
                    cfgData cfgdata = c1275o.f5894q;
                    int i = cfgdata.f2620e1;
                    if (i == 24) {
                        f2 = NativeLib.approximate(AbstractC1256E0.f5697n, c1275o.f5799A.f5721g, 0.0f, 220.0f);
                        approximate = NativeLib.approximate(AbstractC1256E0.f5696m, c1275o.f5917z.f5721g, 0.0f, 8.0f);
                    } else if (i == 25 || i == 26) {
                        f2 = NativeLib.approximate(AbstractC1256E0.f5699p, c1275o.f5799A.f5721g, 0.0f, 220.0f);
                        approximate = NativeLib.approximate(AbstractC1256E0.f5698o, c1275o.f5917z.f5721g, 0.0f, 8.0f);
                    } else if (i == 33 || i == 35) {
                        f2 = NativeLib.approximate(AbstractC1256E0.f5701r, c1275o.f5799A.f5721g, 0.0f, 220.0f);
                        approximate = NativeLib.approximate(AbstractC1256E0.f5700q, c1275o.f5917z.f5721g, 0.0f, 8.0f);
                    } else if (i == 34) {
                        f2 = NativeLib.approximate(AbstractC1256E0.f5703t, c1275o.f5799A.f5721g, 0.0f, 220.0f);
                        approximate = NativeLib.approximate(AbstractC1256E0.f5702s, c1275o.f5917z.f5721g, 0.0f, 8.0f);
                    } else if (i == 37) {
                        f2 = NativeLib.approximate(AbstractC1256E0.f5705v, c1275o.f5799A.f5721g, 0.0f, 220.0f);
                        approximate = NativeLib.approximate(AbstractC1256E0.f5704u, c1275o.f5917z.f5721g, 0.0f, 8.0f);
                    } else {
                        approximate = 1.0f;
                    }
                    int i2 = -256;
                    if (!c1275o.f5884m1 && c1275o.f5799A.m3035b(f2, 16.0f, c1275o.f5903t)) {
                        float f3 = c1275o.f5799A.f5721g;
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        int i3 = f3 > cfgdata.f2568S1 ? -65536 : f3 > cfgdata.f2564R1 ? -256 : -1;
                        c1275o.f5857d0.setTextColor(i3);
                        c1275o.f5845X.setTextColor(i3);
                        String format = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f3));
                        if (!c1275o.f5826N0) {
                            c1275o.f5845X.setText(format);
                        }
                        if (c1275o.f5844W0) {
                            c1275o.f5857d0.setText(format);
                        }
                    }
                    if (!c1275o.f5884m1 && c1275o.f5917z.m3035b(approximate, 16.0f, c1275o.f5906u)) {
                        float f4 = c1275o.f5917z.f5721g;
                        float f5 = f4 >= 0.0f ? f4 : 0.0f;
                        if (f5 > cfgdata.f2576U1) {
                            i2 = -65536;
                        } else if (f5 <= cfgdata.f2572T1) {
                            i2 = -1;
                        }
                        c1275o.f5849Z.setTextColor(i2);
                        c1275o.f5862f0.setTextColor(i2);
                        String m2986A = AbstractC1256E0.m2986A(f5);
                        if (!c1275o.f5826N0) {
                            c1275o.f5849Z.setText(m2986A);
                        }
                        if (c1275o.f5844W0) {
                            c1275o.f5862f0.setText(m2986A);
                            break;
                        }
                    }
                }
                break;
            case 1:
                C1275O c1275o2 = this.f5792b;
                c1275o2.f5839U.setText(AbstractC1372y1.m3307m(c1275o2));
                break;
            case 2:
                C1275O c1275o3 = this.f5792b;
                float f6 = c1275o3.f5822L0;
                if (f6 > 0.0f) {
                    float f7 = f6 - 0.01f;
                    c1275o3.f5822L0 = f7;
                    if (f7 > 1.0f) {
                        c1275o3.f5835S.setAlpha(1.0f);
                    } else {
                        c1275o3.f5835S.setAlpha(f7);
                    }
                }
                float f8 = c1275o3.f5820K0;
                if (f8 > 0.0f) {
                    float f9 = f8 - 0.03f;
                    c1275o3.f5820K0 = f9;
                    c1275o3.f5809F.setAlpha(f9);
                }
                int i4 = c1275o3.f5909v + 1;
                c1275o3.f5909v = i4;
                if (i4 > 600) {
                    c1275o3.f5909v = 0;
                    long m3308n = AbstractC1372y1.m3308n();
                    ActivityManager activityManager = c1275o3.f5885n;
                    if (activityManager != null) {
                        activityManager.getMemoryInfo(c1275o3.f5888o);
                    }
                    long j2 = c1275o3.f5888o.availMem / 1048576;
                    if (m3308n >= 1000) {
                        c1275o3.f5837T.setTextColor(-1);
                        c1275o3.f5837T.setText(String.format("Free RAM %,dMB; Free Storage  %,dMB", Long.valueOf(j2), Long.valueOf(m3308n)));
                        break;
                    } else {
                        c1275o3.f5837T.setVisibility(0);
                        c1275o3.f5837T.setTextColor(-256);
                        c1275o3.f5837T.setText(String.format("Free Storage  %,dMB", Long.valueOf(m3308n)));
                        break;
                    }
                }
                break;
            case 3:
                C1275O c1275o4 = this.f5792b;
                c1275o4.f5864g.post(c1275o4.f5905t1);
                AbstractC1539g1.m4226k0(c1275o4);
                c1275o4.f5873j.postDelayed(this, 2000L);
                break;
            case 4:
                C1275O c1275o5 = this.f5792b;
                c1275o5.f5864g.post(c1275o5.f5908u1);
                c1275o5.f5876k.postDelayed(this, 200L);
                break;
            default:
                C1275O c1275o6 = this.f5792b;
                c1275o6.f5864g.post(c1275o6.f5902s1);
                c1275o6.f5879l.postDelayed(this, 16L);
                break;
        }
    }
}
