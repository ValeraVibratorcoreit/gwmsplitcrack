package p098q0;

import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0548m;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.carData;
import p010D1.AbstractC0088l;
import p112v0.AbstractC1612e;
import p112v0.EnumC1609b;

/* renamed from: q0.W */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1290W implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6033a;

    public /* synthetic */ RunnableC1290W(int i) {
        this.f6033a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC1609b enumC1609b;
        Dialog dialog;
        switch (this.f6033a) {
            case 0:
                AbstractC1294Y.m3152d();
                C1288V.m3129p(false);
                C1288V c1288v = C1288V.f5996D;
                Context context = c1288v != null ? c1288v.f6005a : null;
                if (context != null) {
                    C1311e0.m3165d(context).m3171e();
                }
                carData cardata = carData.getInstance();
                cardata.setIpMessage(0);
                cardata.setIpNotice(0);
                break;
            case 1:
                TopOverlayService topOverlayService = TopOverlayService.f2357r;
                if (topOverlayService != null) {
                    topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 4));
                    break;
                }
                break;
            case 2:
                TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                if (topOverlayService2 != null) {
                    topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                    break;
                }
                break;
            default:
                if (AbstractC1612e.f9239c != null) {
                    MainActivity mainActivity = AbstractC1612e.f9238b;
                    if (mainActivity != null && !mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                        boolean z2 = AbstractC1612e.f9241e;
                        EnumC0548m enumC0548m = EnumC0548m.f1994e;
                        C0555t c0555t = mainActivity.f1501f;
                        if (!z2 || (enumC1609b = AbstractC1612e.f9242f) == null) {
                            Dialog dialog2 = AbstractC1612e.f9237a;
                            if (dialog2 != null && dialog2.isShowing() && c0555t.f2001c.compareTo(enumC0548m) >= 0) {
                                AbstractC1612e.m4771c(mainActivity);
                            }
                        } else if (AbstractC0088l.m261T(mainActivity, enumC1609b)) {
                            if ((c0555t.f2001c.compareTo(enumC0548m) >= 0) && (dialog = AbstractC1612e.f9237a) != null && dialog.isShowing()) {
                                AbstractC1612e.m4771c(mainActivity);
                                AbstractC1612e.f9241e = false;
                                AbstractC1612e.f9242f = null;
                                AbstractC1612e.f9243g = 0;
                            } else {
                                int i = AbstractC1612e.f9243g;
                                if (i < 12) {
                                    AbstractC1612e.f9243g = i + 1;
                                    try {
                                        ActivityManager activityManager = (ActivityManager) mainActivity.getSystemService("activity");
                                        if (activityManager != null) {
                                            activityManager.moveTaskToFront(mainActivity.getTaskId(), 0);
                                        }
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        Intent intent = new Intent(mainActivity, mainActivity.getClass());
                                        intent.addFlags(537001984);
                                        mainActivity.startActivity(intent);
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        }
                        AbstractC1612e.f9244h.postDelayed(AbstractC1612e.f9245i, 500L);
                        break;
                    } else {
                        AbstractC1612e.f9244h.postDelayed(AbstractC1612e.f9245i, 500L);
                        break;
                    }
                }
                break;
        }
    }
}
