package p098q0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.altaysoft.t500_split.cfgData;

/* renamed from: q0.x0 */
/* loaded from: classes.dex */
public abstract class AbstractC1368x0 {

    /* renamed from: a */
    public static String f6422a = TelephonyManager.EXTRA_STATE_IDLE;

    /* renamed from: b */
    public static C1365w0 f6423b;

    /* renamed from: c */
    public static int f6424c;

    /* renamed from: a */
    public static void m3267a(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        boolean z2 = TelephonyManager.EXTRA_STATE_OFFHOOK.equals(f6422a) || TelephonyManager.EXTRA_STATE_RINGING.equals(f6422a);
        if (TelephonyManager.EXTRA_STATE_IDLE.equals(str) && z2 && !cfgData.m1784i().f2645j1 && !AbstractC1372y1.m3273D(AbstractC1372y1.m3314t(0))) {
            AbstractC1256E0.m2998M(context.getApplicationContext(), false);
        }
        f6422a = str;
    }

    /* renamed from: b */
    public static synchronized void m3268b(ContextWrapper contextWrapper) {
        synchronized (AbstractC1368x0.class) {
            try {
                if (f6424c == 0) {
                    f6423b = new C1365w0();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                    Context applicationContext = contextWrapper.getApplicationContext();
                    if (Build.VERSION.SDK_INT >= 33) {
                        applicationContext.registerReceiver(f6423b, intentFilter, 4);
                    } else {
                        applicationContext.registerReceiver(f6423b, intentFilter);
                    }
                }
                f6424c++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m3269c(ContextWrapper contextWrapper) {
        synchronized (AbstractC1368x0.class) {
            int i = f6424c;
            if (i <= 0) {
                return;
            }
            int i2 = i - 1;
            f6424c = i2;
            if (i2 > 0 || f6423b == null) {
                return;
            }
            try {
                contextWrapper.getApplicationContext().unregisterReceiver(f6423b);
            } catch (Exception unused) {
            }
            f6423b = null;
        }
    }
}
