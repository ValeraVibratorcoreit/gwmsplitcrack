package p098q0;

/* renamed from: q0.c0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1305c0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6068a;

    /* renamed from: b */
    public final /* synthetic */ C1311e0 f6069b;

    public /* synthetic */ RunnableC1305c0(C1311e0 c1311e0, int i) {
        this.f6068a = i;
        this.f6069b = c1311e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6068a) {
            case 0:
                C1311e0 c1311e0 = this.f6069b;
                if (c1311e0.f6102f && c1311e0.f6098b != null && !c1311e0.f6103g) {
                    c1311e0.m3170c();
                    c1311e0.f6103g = true;
                    AbstractC1256E0.m3012e(c1311e0.f6098b, new RunnableC1305c0(c1311e0, 2));
                    break;
                }
                break;
            case 1:
                C1311e0 c1311e02 = this.f6069b;
                if (c1311e02.f6102f) {
                    c1311e02.m3171e();
                    break;
                }
                break;
            default:
                C1311e0 c1311e03 = this.f6069b;
                c1311e03.m3174j();
                c1311e03.f6103g = false;
                break;
        }
    }
}
