package p047X0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p001A0.RunnableC0010d;
import p006C.AbstractC0062j;
import p022K.AbstractC0169Q;
import p024L.InterfaceC0249s;

/* renamed from: X0.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0429b implements InterfaceC0249s {

    /* renamed from: f */
    public final /* synthetic */ int f1391f;

    /* renamed from: g */
    public final /* synthetic */ Object f1392g;

    public /* synthetic */ C0429b(int i, String str) {
        this.f1391f = i;
        this.f1392g = str;
    }

    @Override // p024L.InterfaceC0249s
    /* renamed from: e */
    public boolean mo366e(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1392g;
        sideSheetBehavior.getClass();
        int i = this.f1391f;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0062j.m162p(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f3591p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.m2097r(i);
        } else {
            View view2 = (View) sideSheetBehavior.f3591p.get();
            RunnableC0010d runnableC0010d = new RunnableC0010d(sideSheetBehavior, i, 3);
            ViewParent parent = view2.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                if (view2.isAttachedToWindow()) {
                    view2.post(runnableC0010d);
                }
            }
            runnableC0010d.run();
        }
        return true;
    }

    public /* synthetic */ C0429b(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1392g = sideSheetBehavior;
        this.f1391f = i;
    }
}
