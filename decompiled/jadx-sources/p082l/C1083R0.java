package p082l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p046X.C0380H;
import p079k.InterfaceC1016k;
import p079k.MenuC1018m;

/* renamed from: l.R0 */
/* loaded from: classes.dex */
public final class C1083R0 implements InterfaceC1129n, InterfaceC1016k {

    /* renamed from: f */
    public final /* synthetic */ Toolbar f5102f;

    public /* synthetic */ C1083R0(Toolbar toolbar) {
        this.f5102f = toolbar;
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: j */
    public boolean mo1877j(MenuC1018m menuC1018m, MenuItem menuItem) {
        this.f5102f.getClass();
        return false;
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: p */
    public void mo1878p(MenuC1018m menuC1018m) {
        Toolbar toolbar = this.f5102f;
        C1123k c1123k = toolbar.f1827f.f1782y;
        if (c1123k == null || !c1123k.m2734j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1816L.f534c).iterator();
            while (it.hasNext()) {
                ((C0380H) it.next()).f1127a.m1031s();
            }
        }
    }
}
