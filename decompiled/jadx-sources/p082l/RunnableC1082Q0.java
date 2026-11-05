package p082l;

import androidx.appcompat.widget.Toolbar;
import p079k.C1020o;

/* renamed from: l.Q0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1082Q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5100a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f5101b;

    public /* synthetic */ RunnableC1082Q0(Toolbar toolbar, int i) {
        this.f5100a = i;
        this.f5101b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5100a) {
            case 0:
                C1087T0 c1087t0 = this.f5101b.f1821Q;
                C1020o c1020o = c1087t0 == null ? null : c1087t0.f5104g;
                if (c1020o != null) {
                    c1020o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f5101b.m1299n();
                break;
        }
    }
}
