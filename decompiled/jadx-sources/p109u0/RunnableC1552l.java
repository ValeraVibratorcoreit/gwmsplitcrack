package p109u0;

/* renamed from: u0.l */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1552l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8370a;

    /* renamed from: b */
    public final /* synthetic */ C1576u f8371b;

    /* renamed from: c */
    public final /* synthetic */ boolean f8372c;

    public /* synthetic */ RunnableC1552l(C1576u c1576u, boolean z2, int i) {
        this.f8370a = i;
        this.f8371b = c1576u;
        this.f8372c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8370a) {
            case 0:
                this.f8371b.m4585t(this.f8372c);
                break;
            default:
                this.f8371b.m4539b(this.f8372c);
                break;
        }
    }
}
