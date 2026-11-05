package p009D0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;
import p117x.AbstractC1636a;

/* renamed from: D0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0075a extends AbstractC1636a {

    /* renamed from: a */
    public C0076b f235a;

    @Override // p117x.AbstractC1636a
    /* renamed from: g */
    public boolean mo215g(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo216r(coordinatorLayout, view, i);
        if (this.f235a == null) {
            this.f235a = new C0076b(view);
        }
        C0076b c0076b = this.f235a;
        View view2 = c0076b.f237g;
        c0076b.f236f = view2.getTop();
        c0076b.f238h = view2.getLeft();
        C0076b c0076b2 = this.f235a;
        View view3 = c0076b2.f237g;
        int top = 0 - (view3.getTop() - c0076b2.f236f);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0076b2.f238h));
        return true;
    }

    /* renamed from: r */
    public void mo216r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m1328q(view, i);
    }
}
