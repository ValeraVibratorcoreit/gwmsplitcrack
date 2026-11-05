package p046X;

import android.view.View;
import p121y0.AbstractC1680h;

/* renamed from: X.r */
/* loaded from: classes.dex */
public final class C0419r extends AbstractC1680h {

    /* renamed from: k */
    public final /* synthetic */ AbstractComponentCallbacksC0423v f1319k;

    public C0419r(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        this.f1319k = abstractComponentCallbacksC0423v;
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: F */
    public final View mo1101F(int i) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1319k;
        View view = abstractComponentCallbacksC0423v.f1342J;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0423v + " does not have a view");
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: I */
    public final boolean mo1102I() {
        return this.f1319k.f1342J != null;
    }
}
