package p109u0;

import android.widget.ImageView;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.W */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1511W implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7970a;

    /* renamed from: b */
    public final /* synthetic */ C1520a0 f7971b;

    public /* synthetic */ RunnableC1511W(C1520a0 c1520a0, int i) {
        this.f7970a = i;
        this.f7971b = c1520a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7970a) {
            case 0:
                this.f7971b.m4133D();
                break;
            case 1:
                this.f7971b.m4141j();
                break;
            case 2:
                this.f7971b.m4139f();
                break;
            case 3:
                C1520a0 c1520a0 = this.f7971b;
                if (c1520a0.f8105p0) {
                    c1520a0.f8109r0 = false;
                    c1520a0.m4132C();
                    break;
                }
                break;
            case 4:
                this.f7971b.m4136c();
                break;
            case 5:
                C1520a0 c1520a02 = this.f7971b;
                TextView textView = c1520a02.f8063P;
                if (textView != null) {
                    textView.requestLayout();
                }
                TextView textView2 = c1520a02.f8066S;
                if (textView2 != null) {
                    textView2.requestLayout();
                }
                ImageView imageView = c1520a02.f8065R;
                if (imageView != null) {
                    imageView.requestLayout();
                }
                ImageView imageView2 = c1520a02.f8067T;
                if (imageView2 != null) {
                    imageView2.requestLayout();
                }
                c1520a02.m4142k(c1520a02.f8082e.m1745e());
                c1520a02.m4133D();
                break;
            default:
                C1520a0 c1520a03 = this.f7971b;
                c1520a03.f8105p0 = false;
                c1520a03.f8111s0 = 0.0f;
                AbstractC1372y1.m3287R(false, true);
                c1520a03.m4133D();
                break;
        }
    }
}
