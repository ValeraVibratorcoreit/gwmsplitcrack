package p016H;

import java.util.concurrent.ThreadFactory;

/* renamed from: H.l */
/* loaded from: classes.dex */
public final class ThreadFactoryC0120l implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0119k(runnable);
    }
}
