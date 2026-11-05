package p068f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p022K.C0198k;
import p022K.C0208p;

/* renamed from: f0.D */
/* loaded from: classes.dex */
public abstract class AbstractC0774D {

    /* renamed from: a */
    public C0827y f3920a;

    /* renamed from: b */
    public ArrayList f3921b;

    /* renamed from: c */
    public long f3922c;

    /* renamed from: d */
    public long f3923d;

    /* renamed from: e */
    public long f3924e;

    /* renamed from: f */
    public long f3925f;

    /* renamed from: b */
    public static void m2207b(AbstractC0792W abstractC0792W) {
        RecyclerView recyclerView;
        int i = abstractC0792W.f4004j;
        if (abstractC0792W.m2274g() || (i & 4) != 0 || (recyclerView = abstractC0792W.f4012r) == null) {
            return;
        }
        recyclerView.m1494G(abstractC0792W);
    }

    /* renamed from: a */
    public abstract boolean mo2208a(AbstractC0792W abstractC0792W, AbstractC0792W abstractC0792W2, C0208p c0208p, C0208p c0208p2);

    /* renamed from: c */
    public final void m2209c(AbstractC0792W abstractC0792W) {
        C0827y c0827y = this.f3920a;
        if (c0827y != null) {
            boolean z2 = true;
            abstractC0792W.m2282o(true);
            if (abstractC0792W.f4002h != null && abstractC0792W.f4003i == null) {
                abstractC0792W.f4002h = null;
            }
            abstractC0792W.f4003i = null;
            if ((abstractC0792W.f4004j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0827y.f4208a;
            recyclerView.m1515c0();
            C0198k c0198k = recyclerView.f2089j;
            C0827y c0827y2 = (C0827y) c0198k.f533b;
            RecyclerView recyclerView2 = c0827y2.f4208a;
            View view = abstractC0792W.f3995a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0198k.m611v(view);
            } else {
                C0798b c0798b = (C0798b) c0198k.f534c;
                if (c0798b.m2289d(indexOfChild)) {
                    c0798b.m2291f(indexOfChild);
                    c0198k.m611v(view);
                    c0827y2.m2344h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                AbstractC0792W m1483J = RecyclerView.m1483J(view);
                C0784N c0784n = recyclerView.f2083g;
                c0784n.m2261j(m1483J);
                c0784n.m2258g(m1483J);
            }
            recyclerView.m1516d0(!z2);
            if (z2 || !abstractC0792W.m2278k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* renamed from: d */
    public abstract void mo2210d(AbstractC0792W abstractC0792W);

    /* renamed from: e */
    public abstract void mo2211e();

    /* renamed from: f */
    public abstract boolean mo2212f();
}
