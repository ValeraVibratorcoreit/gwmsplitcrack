package p098q0;

import android.content.Context;
import android.media.session.MediaController;
import android.os.Handler;
import android.os.SystemClock;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0635c;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0648p;
import p001A0.RunnableC0020n;

/* renamed from: q0.l0 */
/* loaded from: classes.dex */
public final class RunnableC1332l0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6284a = 1;

    /* renamed from: b */
    public final /* synthetic */ Context f6285b;

    /* renamed from: c */
    public final /* synthetic */ Handler f6286c;

    /* renamed from: d */
    public final /* synthetic */ String f6287d;

    /* renamed from: e */
    public final /* synthetic */ long f6288e;

    public RunnableC1332l0(Context context, String str, long j2, Handler handler) {
        this.f6285b = context;
        this.f6287d = str;
        this.f6288e = j2;
        this.f6286c = handler;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaController mediaController;
        long j2 = this.f6288e;
        Handler handler = this.f6286c;
        Context context = this.f6285b;
        switch (this.f6284a) {
            case 0:
                if (!MainActivity.m1677t(context)) {
                    if (System.currentTimeMillis() - j2 < 300000) {
                        handler.postDelayed(this, 1000L);
                        break;
                    }
                } else {
                    String[] strArr = AbstractC0648p.f3051a;
                    cfgData m1784i = cfgData.m1784i();
                    String str = this.f6287d;
                    if (AbstractC0648p.m1920m(m1784i, str)) {
                        int i = m1784i.f2661m2;
                        if (i != 1 && i != 2) {
                            i = 0;
                        }
                        Context applicationContext = context.getApplicationContext();
                        MediaController mediaController2 = null;
                        if (AbstractC0638f.m1863l(applicationContext, str)) {
                            if (applicationContext != null && str != null && !str.isEmpty()) {
                                try {
                                    mediaController = AbstractC0638f.m1853b(AbstractC0638f.m1855d(applicationContext), str);
                                } catch (SecurityException | Exception unused) {
                                }
                                if (AbstractC0638f.m1866o(mediaController) == i) {
                                    AbstractC0648p.f3055e = true;
                                }
                            }
                            mediaController = null;
                            if (AbstractC0638f.m1866o(mediaController) == i) {
                            }
                        }
                        if (applicationContext != null && str != null && !str.isEmpty()) {
                            try {
                                mediaController2 = AbstractC0638f.m1853b(AbstractC0638f.m1855d(applicationContext), str);
                            } catch (SecurityException | Exception unused2) {
                            }
                        }
                        if (AbstractC0638f.m1866o(mediaController2) == i) {
                            AbstractC0648p.f3055e = true;
                            AbstractC0638f.m1868q(applicationContext, str);
                            if (AbstractC0638f.m1862k(str)) {
                                AbstractC0635c.m1849b(applicationContext, str);
                            }
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (!AbstractC0648p.f3055e || elapsedRealtime - AbstractC0648p.f3065o >= 4000) {
                                AbstractC0648p.f3055e = true;
                                AbstractC0648p.f3065o = elapsedRealtime;
                                if (i == 1) {
                                    AbstractC0638f.m1869r(applicationContext);
                                } else {
                                    String str2 = m1784i.f2656l2;
                                    AbstractC0638f.m1867p(applicationContext, str2 == null ? "" : str2.trim());
                                }
                            }
                        }
                    }
                    if (!AbstractC0638f.m1863l(context, str) && System.currentTimeMillis() - j2 < 300000) {
                        handler.postDelayed(this, 5000L);
                        break;
                    }
                }
                break;
            default:
                if (!MainActivity.m1677t(context)) {
                    if (System.currentTimeMillis() - j2 < 300000) {
                        handler.postDelayed(this, 5000L);
                        break;
                    }
                } else {
                    handler.postDelayed(new RunnableC0020n(18, this), 3000L);
                    break;
                }
                break;
        }
    }

    public RunnableC1332l0(Context context, Handler handler, String str, long j2) {
        this.f6285b = context;
        this.f6286c = handler;
        this.f6287d = str;
        this.f6288e = j2;
    }
}
