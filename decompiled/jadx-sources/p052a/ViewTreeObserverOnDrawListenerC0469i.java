package p052a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import p001A0.RunnableC0024r;
import p070g.AbstractActivityC0870i;
import p107t1.AbstractC1461d;

/* renamed from: a.i */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0469i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a */
    public final long f1486a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b */
    public Runnable f1487b;

    /* renamed from: c */
    public boolean f1488c;

    /* renamed from: d */
    public final /* synthetic */ AbstractActivityC0870i f1489d;

    public ViewTreeObserverOnDrawListenerC0469i(AbstractActivityC0870i abstractActivityC0870i) {
        this.f1489d = abstractActivityC0870i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1461d.m3494e("runnable", runnable);
        this.f1487b = runnable;
        View decorView = this.f1489d.getWindow().getDecorView();
        AbstractC1461d.m3493d("window.decorView", decorView);
        if (!this.f1488c) {
            decorView.postOnAnimation(new RunnableC0024r(5, this));
        } else if (AbstractC1461d.m3490a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1487b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1486a) {
                this.f1488c = false;
                this.f1489d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1487b = null;
        C0479s c0479s = (C0479s) this.f1489d.f1507l.m2824a();
        synchronized (c0479s.f1524a) {
            z2 = c0479s.f1525b;
        }
        if (z2) {
            this.f1488c = false;
            this.f1489d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1489d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
