package p109u0;

/* renamed from: u0.C0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1473C0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7180a;

    /* renamed from: b */
    public final /* synthetic */ C1477E0 f7181b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7182c;

    public /* synthetic */ RunnableC1473C0(C1477E0 c1477e0, boolean z2, int i) {
        this.f7180a = i;
        this.f7181b = c1477e0;
        this.f7182c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7180a) {
            case 0:
                this.f7181b.m3656b(this.f7182c);
                break;
            default:
                this.f7181b.m3692q(this.f7182c);
                break;
        }
    }
}
