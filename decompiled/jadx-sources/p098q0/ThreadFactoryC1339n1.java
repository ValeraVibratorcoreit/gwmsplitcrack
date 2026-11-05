package p098q0;

import java.util.concurrent.ThreadFactory;

/* renamed from: q0.n1 */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1339n1 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "TBox-SSH");
        thread.setDaemon(true);
        return thread;
    }
}
