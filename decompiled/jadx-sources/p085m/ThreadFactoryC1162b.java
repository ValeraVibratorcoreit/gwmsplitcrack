package p085m;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC1162b implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f5336a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f5336a.getAndIncrement());
        return thread;
    }
}
