package p014G;

/* renamed from: G.c */
/* loaded from: classes.dex */
public final class C0102c {

    /* renamed from: a */
    public boolean f335a;

    /* renamed from: b */
    public InterfaceC0101b f336b;

    /* renamed from: c */
    public boolean f337c;

    /* renamed from: a */
    public final void m342a(InterfaceC0101b interfaceC0101b) {
        synchronized (this) {
            while (this.f337c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f336b == interfaceC0101b) {
                return;
            }
            this.f336b = interfaceC0101b;
            if (this.f335a) {
                interfaceC0101b.mo341c();
            }
        }
    }
}
