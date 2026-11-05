package p070g;

import android.view.ViewGroup;
import p022K.AbstractC0169Q;
import p022K.C0175X;

/* renamed from: g.p */
/* loaded from: classes.dex */
public final class RunnableC0877p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4382a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0887z f4383b;

    public /* synthetic */ RunnableC0877p(LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z, int i) {
        this.f4382a = i;
        this.f4383b = layoutInflaterFactory2C0887z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f4382a) {
            case 0:
                LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4383b;
                if ((layoutInflaterFactory2C0887z.f4446e0 & 1) != 0) {
                    layoutInflaterFactory2C0887z.m2455u(0);
                }
                if ((layoutInflaterFactory2C0887z.f4446e0 & 4096) != 0) {
                    layoutInflaterFactory2C0887z.m2455u(108);
                }
                layoutInflaterFactory2C0887z.f4445d0 = false;
                layoutInflaterFactory2C0887z.f4446e0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z2 = this.f4383b;
                layoutInflaterFactory2C0887z2.f4417B.showAtLocation(layoutInflaterFactory2C0887z2.f4416A, 55, 0, 0);
                C0175X c0175x = layoutInflaterFactory2C0887z2.f4419D;
                if (c0175x != null) {
                    c0175x.m521b();
                }
                if (!(layoutInflaterFactory2C0887z2.f4420E && (viewGroup = layoutInflaterFactory2C0887z2.f4421F) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0887z2.f4416A.setAlpha(1.0f);
                    layoutInflaterFactory2C0887z2.f4416A.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0887z2.f4416A.setAlpha(0.0f);
                    C0175X m496a = AbstractC0169Q.m496a(layoutInflaterFactory2C0887z2.f4416A);
                    m496a.m520a(1.0f);
                    layoutInflaterFactory2C0887z2.f4419D = m496a;
                    m496a.m523d(new C0879r(0, this));
                    break;
                }
        }
    }
}
