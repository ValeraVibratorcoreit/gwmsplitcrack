package p098q0;

import android.content.Context;
import android.os.Handler;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.media.AbstractC0635c;
import com.altaysoft.t500_split.media.AbstractC0638f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q0.k0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1329k0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6274a = 1;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f6275b;

    /* renamed from: c */
    public final /* synthetic */ Context f6276c;

    /* renamed from: d */
    public final /* synthetic */ String f6277d;

    /* renamed from: e */
    public final /* synthetic */ Handler f6278e;

    public /* synthetic */ RunnableC1329k0(MainActivity mainActivity, Context context, String str, Handler handler) {
        this.f6275b = mainActivity;
        this.f6276c = context;
        this.f6277d = str;
        this.f6278e = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f6275b;
        switch (this.f6274a) {
            case 0:
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                mainActivity.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                Handler handler = this.f6278e;
                handler.post(new RunnableC1332l0(this.f6276c, this.f6277d, currentTimeMillis, handler));
                break;
            default:
                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                mainActivity.getClass();
                Context context = this.f6276c;
                String str = this.f6277d;
                if (!AbstractC0638f.m1863l(context, str)) {
                    if (AbstractC0638f.m1862k(str)) {
                        AbstractC0635c.m1849b(context, str);
                        AbstractC0638f.m1868q(context, str);
                    } else {
                        AbstractC0638f.m1868q(context, str);
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                Handler handler2 = this.f6278e;
                handler2.postDelayed(new RunnableC1332l0(context, handler2, str, currentTimeMillis2), 5000L);
                break;
        }
    }

    public /* synthetic */ RunnableC1329k0(MainActivity mainActivity, Handler handler, Context context, String str) {
        this.f6275b = mainActivity;
        this.f6278e = handler;
        this.f6276c = context;
        this.f6277d = str;
    }
}
