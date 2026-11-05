package p109u0;

import android.widget.ImageView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.L */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1490L implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7525a;

    /* renamed from: b */
    public final /* synthetic */ C1498P f7526b;

    public /* synthetic */ RunnableC1490L(C1498P c1498p, int i) {
        this.f7525a = i;
        this.f7526b = c1498p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7525a) {
            case 0:
                this.f7526b.m3899a();
                break;
            case 1:
                this.f7526b.m3898F();
                break;
            case 2:
                this.f7526b.m3902d();
                break;
            case 3:
                C1498P c1498p = this.f7526b;
                ImageView imageView = c1498p.f7685S;
                if (imageView != null) {
                    imageView.requestLayout();
                }
                c1498p.m3908l(c1498p.f7701e.m1745e());
                c1498p.m3898F();
                break;
            case 4:
                C1498P c1498p2 = this.f7526b;
                c1498p2.f7728r0 = false;
                c1498p2.f7734u0 = 0.0f;
                AbstractC1372y1.m3287R(false, true);
                c1498p2.m3898F();
                break;
            case 5:
                C1498P c1498p3 = this.f7526b;
                if (c1498p3.f7728r0) {
                    c1498p3.f7732t0 = false;
                    c1498p3.m3896D();
                    break;
                }
                break;
            default:
                this.f7526b.m3907k();
                break;
        }
    }
}
