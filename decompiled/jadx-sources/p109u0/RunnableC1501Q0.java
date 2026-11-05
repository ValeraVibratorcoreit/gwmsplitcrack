package p109u0;

/* renamed from: u0.Q0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1501Q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7749a;

    /* renamed from: b */
    public final /* synthetic */ C1506T0 f7750b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7751c;

    public /* synthetic */ RunnableC1501Q0(C1506T0 c1506t0, boolean z2, int i) {
        this.f7749a = i;
        this.f7750b = c1506t0;
        this.f7751c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7749a) {
            case 0:
                this.f7750b.m4020p(this.f7751c);
                break;
            default:
                this.f7750b.m3981a(this.f7751c);
                break;
        }
    }
}
