package p038T;

import java.util.concurrent.ThreadFactory;

/* renamed from: T.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0307a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f878a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f878a);
        thread.setPriority(10);
        return thread;
    }
}
