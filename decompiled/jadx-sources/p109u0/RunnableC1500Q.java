package p109u0;

import android.widget.ImageView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.Q */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1500Q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7747a;

    /* renamed from: b */
    public final /* synthetic */ C1509V f7748b;

    public /* synthetic */ RunnableC1500Q(C1509V c1509v, int i) {
        this.f7747a = i;
        this.f7748b = c1509v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7747a) {
            case 0:
                this.f7748b.m4070k();
                break;
            case 1:
                this.f7748b.m4062a();
                break;
            case 2:
                this.f7748b.m4065d();
                break;
            case 3:
                C1509V c1509v = this.f7748b;
                ImageView imageView = c1509v.f7908S;
                if (imageView != null) {
                    imageView.requestLayout();
                }
                c1509v.m4071l(c1509v.f7924e.m1745e());
                c1509v.m4061G();
                break;
            case 4:
                this.f7748b.m4061G();
                break;
            case 5:
                C1509V c1509v2 = this.f7748b;
                if (c1509v2.f7951r0) {
                    c1509v2.f7955t0 = false;
                    c1509v2.m4059E();
                    break;
                }
                break;
            default:
                C1509V c1509v3 = this.f7748b;
                c1509v3.f7951r0 = false;
                c1509v3.f7957u0 = 0.0f;
                AbstractC1372y1.m3287R(false, true);
                c1509v3.m4061G();
                break;
        }
    }
}
