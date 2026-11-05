package p082l;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: l.y0 */
/* loaded from: classes.dex */
public final class C1152y0 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C1050A0 f5290a;

    public C1152y0(C1050A0 c1050a0) {
        this.f5290a = c1050a0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C1050A0 c1050a0 = this.f5290a;
            if (c1050a0.f4999E.getInputMethodMode() == 2 || c1050a0.f4999E.getContentView() == null) {
                return;
            }
            Handler handler = c1050a0.f4995A;
            RunnableC1148w0 runnableC1148w0 = c1050a0.f5017w;
            handler.removeCallbacks(runnableC1148w0);
            runnableC1148w0.run();
        }
    }
}
