package p109u0;

/* renamed from: u0.J0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1487J0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7444a;

    /* renamed from: b */
    public final /* synthetic */ C1491L0 f7445b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7446c;

    public /* synthetic */ RunnableC1487J0(C1491L0 c1491l0, boolean z2, int i) {
        this.f7444a = i;
        this.f7445b = c1491l0;
        this.f7446c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7444a) {
            case 0:
                this.f7445b.m3858q(this.f7446c);
                break;
            default:
                this.f7445b.m3822b(this.f7446c);
                break;
        }
    }
}
