package p082l;

import android.database.DataSetObserver;

/* renamed from: l.x0 */
/* loaded from: classes.dex */
public final class C1150x0 extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ C1050A0 f5289a;

    public C1150x0(C1050A0 c1050a0) {
        this.f5289a = c1050a0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C1050A0 c1050a0 = this.f5289a;
        if (c1050a0.f4999E.isShowing()) {
            c1050a0.mo2578f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f5289a.dismiss();
    }
}
