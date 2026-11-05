package p016H;

import android.os.Process;

/* renamed from: H.k */
/* loaded from: classes.dex */
public final class C0119k extends Thread {

    /* renamed from: a */
    public final int f375a;

    public C0119k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f375a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f375a);
        super.run();
    }
}
