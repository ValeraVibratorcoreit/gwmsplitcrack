package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p073h0.C0946a;
import p073h0.InterfaceC0947b;
import p090n1.C1187k;
import p107t1.AbstractC1461d;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0947b {
    @Override // p073h0.InterfaceC0947b
    /* renamed from: a */
    public final List mo1355a() {
        return C1187k.f5368a;
    }

    @Override // p073h0.InterfaceC0947b
    /* renamed from: b */
    public final Object mo1356b(Context context) {
        AbstractC1461d.m3494e("context", context);
        C0946a m2480c = C0946a.m2480c(context);
        AbstractC1461d.m3493d("getInstance(context)", m2480c);
        if (!m2480c.f4559b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0550o.f1996a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC1461d.m3492c("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0549n());
        }
        C0521D c0521d = C0521D.f1956n;
        c0521d.getClass();
        c0521d.f1961j = new Handler();
        c0521d.f1962k.m1380d(EnumC0547l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1461d.m3492c("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0520C(c0521d));
        return c0521d;
    }
}
