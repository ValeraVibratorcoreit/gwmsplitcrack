package p070g;

import java.util.concurrent.Executor;

/* renamed from: g.n */
/* loaded from: classes.dex */
public final class ExecutorC0875n implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
