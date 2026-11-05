package p070g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p001A0.RunnableC0018l;

/* renamed from: g.m */
/* loaded from: classes.dex */
public final class ExecutorC0874m implements Executor {

    /* renamed from: a */
    public final Object f4369a = new Object();

    /* renamed from: b */
    public final ArrayDeque f4370b = new ArrayDeque();

    /* renamed from: c */
    public final ExecutorC0875n f4371c;

    /* renamed from: d */
    public Runnable f4372d;

    public ExecutorC0874m(ExecutorC0875n executorC0875n) {
        this.f4371c = executorC0875n;
    }

    /* renamed from: a */
    public final void m2415a() {
        synchronized (this.f4369a) {
            try {
                Runnable runnable = (Runnable) this.f4370b.poll();
                this.f4372d = runnable;
                if (runnable != null) {
                    this.f4371c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f4369a) {
            try {
                this.f4370b.add(new RunnableC0018l(this, 9, runnable));
                if (this.f4372d == null) {
                    m2415a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
