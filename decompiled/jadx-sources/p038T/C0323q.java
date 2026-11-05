package p038T;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A0.RunnableC0024r;
import p016H.AbstractC0111c;
import p016H.C0112d;
import p016H.C0117i;
import p016H.C0118j;
import p045W0.C0355e;
import p121y0.AbstractC1687o;

/* renamed from: T.q */
/* loaded from: classes.dex */
public final class C0323q implements InterfaceC0314h {

    /* renamed from: f */
    public final Context f912f;

    /* renamed from: g */
    public final C0112d f913g;

    /* renamed from: h */
    public final C0355e f914h;

    /* renamed from: i */
    public final Object f915i;

    /* renamed from: j */
    public Handler f916j;

    /* renamed from: k */
    public ThreadPoolExecutor f917k;

    /* renamed from: l */
    public ThreadPoolExecutor f918l;

    /* renamed from: m */
    public AbstractC1687o f919m;

    public C0323q(Context context, C0112d c0112d) {
        C0355e c0355e = C0324r.f920d;
        this.f915i = new Object();
        AbstractC1687o.m4939h("Context cannot be null", context);
        this.f912f = context.getApplicationContext();
        this.f913g = c0112d;
        this.f914h = c0355e;
    }

    /* renamed from: a */
    public final void m905a() {
        synchronized (this.f915i) {
            try {
                this.f919m = null;
                Handler handler = this.f916j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f916j = null;
                ThreadPoolExecutor threadPoolExecutor = this.f918l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f917k = null;
                this.f918l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final C0118j m906b() {
        try {
            C0355e c0355e = this.f914h;
            Context context = this.f912f;
            C0112d c0112d = this.f913g;
            c0355e.getClass();
            C0117i m349a = AbstractC0111c.m349a(context, c0112d);
            int i = m349a.f368f;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            C0118j[] c0118jArr = (C0118j[]) m349a.f369g;
            if (c0118jArr == null || c0118jArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0118jArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // p038T.InterfaceC0314h
    /* renamed from: q */
    public final void mo894q(AbstractC1687o abstractC1687o) {
        synchronized (this.f915i) {
            this.f919m = abstractC1687o;
        }
        synchronized (this.f915i) {
            try {
                if (this.f919m == null) {
                    return;
                }
                if (this.f917k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0307a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f918l = threadPoolExecutor;
                    this.f917k = threadPoolExecutor;
                }
                this.f917k.execute(new RunnableC0024r(2, this));
            } finally {
            }
        }
    }
}
