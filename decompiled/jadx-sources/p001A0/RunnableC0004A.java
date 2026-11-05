package p001A0;

import android.widget.FrameLayout;
import p098q0.AbstractC1256E0;

/* renamed from: A0.A */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0004A implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2a;

    /* renamed from: b */
    public final /* synthetic */ C0006C f3b;

    public /* synthetic */ RunnableC0004A(C0006C c0006c, int i) {
        this.f2a = i;
        this.f3b = c0006c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        switch (this.f2a) {
            case 0:
                C0006C c0006c = this.f3b;
                if (c0006c.f14f && !c0006c.f15g) {
                    c0006c.f15g = true;
                    FrameLayout frameLayout2 = c0006c.f11c;
                    if (frameLayout2 != null) {
                        AbstractC1256E0.m3011d(frameLayout2, new RunnableC0004A(c0006c, 1));
                        break;
                    } else {
                        c0006c.f14f = false;
                        c0006c.f15g = false;
                        break;
                    }
                }
                break;
            default:
                C0006C c0006c2 = this.f3b;
                c0006c2.getClass();
                try {
                    if (c0006c2.f13e != null && (frameLayout = c0006c2.f11c) != null && frameLayout.getParent() != null) {
                        c0006c2.f13e.removeView(c0006c2.f11c);
                    }
                } catch (Exception unused) {
                }
                c0006c2.f14f = false;
                c0006c2.f15g = false;
                break;
        }
    }
}
