package p098q0;

/* renamed from: q0.t0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1356t0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6366a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f6367b;

    public /* synthetic */ RunnableC1356t0(Runnable runnable, int i) {
        this.f6366a = i;
        this.f6367b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6366a) {
            case 0:
                Runnable runnable = this.f6367b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Runnable runnable2 = this.f6367b;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
