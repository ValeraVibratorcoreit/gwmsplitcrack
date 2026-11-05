package p098q0;

import p118x0.C1670z;

/* renamed from: q0.e1 */
/* loaded from: classes.dex */
public final class RunnableC1312e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6111a;

    /* renamed from: b */
    public final /* synthetic */ C1324i1 f6112b;

    public /* synthetic */ RunnableC1312e1(C1324i1 c1324i1, int i) {
        this.f6111a = i;
        this.f6112b = c1324i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6111a) {
            case 0:
                C1324i1 c1324i1 = this.f6112b;
                if (c1324i1.f6172J0) {
                    c1324i1.m3208N();
                    c1324i1.f6208b.postDelayed(this, 250L);
                    break;
                }
                break;
            case 1:
                C1324i1 c1324i12 = this.f6112b;
                if (c1324i12.f6172J0) {
                    c1324i12.m3233u();
                    c1324i12.f6208b.postDelayed(this, 2000L);
                    break;
                }
                break;
            case 2:
                C1324i1 c1324i13 = this.f6112b;
                if (c1324i13.f6172J0) {
                    if (c1324i13.f6178M0 == 2) {
                        c1324i13.m3231s();
                    }
                    c1324i13.f6208b.postDelayed(this, 2000L);
                    break;
                }
                break;
            case 3:
                C1324i1 c1324i14 = this.f6112b;
                if (c1324i14.f6172J0) {
                    C1670z.m4822d(c1324i14.f6205a).m4831i(true, new C1300a1(c1324i14, 1));
                    c1324i14.f6208b.postDelayed(this, 900000L);
                    break;
                }
                break;
            default:
                C1324i1 c1324i15 = this.f6112b;
                if (c1324i15.f6172J0) {
                    if (c1324i15.f6178M0 == 4) {
                        c1324i15.m3205K();
                    }
                    c1324i15.f6208b.postDelayed(this, 30000L);
                    break;
                }
                break;
        }
    }
}
