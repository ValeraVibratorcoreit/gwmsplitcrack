package p109u0;

/* renamed from: u0.m0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1556m0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8394a;

    /* renamed from: b */
    public final /* synthetic */ C1568q0 f8395b;

    /* renamed from: c */
    public final /* synthetic */ boolean f8396c;

    public /* synthetic */ RunnableC1556m0(C1568q0 c1568q0, boolean z2, int i) {
        this.f8394a = i;
        this.f8395b = c1568q0;
        this.f8396c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8394a) {
            case 0:
                this.f8395b.m4419q(this.f8396c);
                break;
            default:
                this.f8395b.m4380b(this.f8396c);
                break;
        }
    }
}
