package p098q0;

import android.widget.TextView;

/* renamed from: q0.J */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1265J implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5733a;

    /* renamed from: b */
    public final /* synthetic */ C1275O f5734b;

    public /* synthetic */ RunnableC1265J(C1275O c1275o, int i) {
        this.f5733a = i;
        this.f5734b = c1275o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5733a) {
            case 0:
                C1275O c1275o = this.f5734b;
                TextView textView = c1275o.f5835S;
                if (textView != null) {
                    textView.setText("");
                    c1275o.f5835S.setAlpha(0.0f);
                    break;
                }
                break;
            case 1:
                C1275O c1275o2 = this.f5734b;
                TextView textView2 = c1275o2.f5835S;
                if (textView2 != null) {
                    textView2.animate().cancel();
                    c1275o2.f5835S.animate().alpha(0.0f).setDuration(350L).withEndAction(new RunnableC1265J(c1275o2, 0)).start();
                    break;
                }
                break;
            default:
                C1275O c1275o3 = this.f5734b;
                if (c1275o3.f5830P0 != null) {
                    c1275o3.f5836S0 = false;
                    c1275o3.m3078m();
                    float rightQnxHoleOpenProgress = c1275o3.f5830P0.getRightQnxHoleOpenProgress();
                    c1275o3.f5828O0 = false;
                    AbstractC1372y1.m3287R(false, true);
                    if (Math.abs(rightQnxHoleOpenProgress) >= 0.001f) {
                        c1275o3.m3065S(rightQnxHoleOpenProgress, 0.0f);
                        break;
                    } else {
                        c1275o3.m3074i();
                        break;
                    }
                }
                break;
        }
    }
}
