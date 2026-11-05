package p109u0;

/* renamed from: u0.u0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1577u0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8831a;

    /* renamed from: b */
    public final /* synthetic */ C1583x0 f8832b;

    /* renamed from: c */
    public final /* synthetic */ boolean f8833c;

    public /* synthetic */ RunnableC1577u0(C1583x0 c1583x0, boolean z2, int i) {
        this.f8831a = i;
        this.f8832b = c1583x0;
        this.f8833c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8831a) {
            case 0:
                this.f8832b.m4709q(this.f8833c);
                break;
            default:
                this.f8832b.m4671b(this.f8833c);
                break;
        }
    }
}
