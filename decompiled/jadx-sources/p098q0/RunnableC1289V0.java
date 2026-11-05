package p098q0;

/* renamed from: q0.V0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1289V0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6031a;

    /* renamed from: b */
    public final /* synthetic */ C1324i1 f6032b;

    public /* synthetic */ RunnableC1289V0(C1324i1 c1324i1, int i) {
        this.f6031a = i;
        this.f6032b = c1324i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6031a) {
            case 0:
                this.f6032b.m3219e();
                break;
            case 1:
                C1324i1 c1324i1 = this.f6032b;
                c1324i1.f6180N0 = false;
                c1324i1.m3217c();
                c1324i1.m3204J();
                c1324i1.m3232t();
                break;
            case 2:
                this.f6032b.m3203I();
                break;
            case 3:
                this.f6032b.m3225m();
                break;
            default:
                this.f6032b.m3196B();
                break;
        }
    }
}
