package p098q0;

/* renamed from: q0.v */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1361v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6397a;

    /* renamed from: b */
    public final /* synthetic */ C1364w f6398b;

    public /* synthetic */ RunnableC1361v(C1364w c1364w, int i) {
        this.f6397a = i;
        this.f6398b = c1364w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6397a) {
            case 0:
                C1364w c1364w = this.f6398b;
                if (c1364w.f6411e && c1364w.f6408b != null && !c1364w.f6412f) {
                    c1364w.m3262a();
                    c1364w.f6412f = true;
                    AbstractC1256E0.m3012e(c1364w.f6408b, new RunnableC1361v(c1364w, 2));
                    break;
                }
                break;
            case 1:
                C1364w c1364w2 = this.f6398b;
                if (c1364w2.f6411e) {
                    c1364w2.m3263b();
                    break;
                }
                break;
            default:
                C1364w c1364w3 = this.f6398b;
                c1364w3.m3264d();
                c1364w3.f6412f = false;
                break;
        }
    }
}
