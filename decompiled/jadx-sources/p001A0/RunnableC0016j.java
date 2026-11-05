package p001A0;

import android.content.Context;
import com.altaysoft.t500_split.cfgData;

/* renamed from: A0.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0016j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44a;

    /* renamed from: b */
    public final /* synthetic */ C0021o f45b;

    public /* synthetic */ RunnableC0016j(C0021o c0021o, int i) {
        this.f44a = i;
        this.f45b = c0021o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44a) {
            case 0:
                this.f45b.m29a();
                break;
            case 1:
                C0021o c0021o = this.f45b;
                if (c0021o.f65e <= 0) {
                    c0021o.f71k = false;
                    c0021o.m35i();
                    c0021o.m33g();
                    Context context = c0021o.f67g;
                    if (context != null) {
                        C0006C m10c = C0006C.m10c(context);
                        m10c.f10b.post(new RunnableC0004A(m10c, 0));
                    }
                    AbstractC0023q.m38a(1);
                    break;
                }
                break;
            default:
                C0021o c0021o2 = this.f45b;
                c0021o2.f74n = 0L;
                c0021o2.f61a.removeCallbacks(c0021o2.f79s);
                Context context2 = c0021o2.f67g;
                if (context2 != null) {
                    C0006C m10c2 = C0006C.m10c(context2);
                    m10c2.f10b.post(new RunnableC0004A(m10c2, 0));
                }
                if (cfgData.m1784i().f2551O0 && c0021o2.f72l) {
                    AbstractC0023q.m38a(2);
                    break;
                }
                break;
        }
    }
}
