package p092o0;

import android.view.ViewParent;
import androidx.lifecycle.EnumC0548m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0387O;
import p046X.C0398a;
import p051Z0.C0451i;
import p071g0.C0888a;
import p091o.C1195e;
import p098q0.C1375z1;

/* renamed from: o0.c */
/* loaded from: classes.dex */
public final class C1205c {

    /* renamed from: a */
    public C1204b f5428a;

    /* renamed from: b */
    public C0451i f5429b;

    /* renamed from: c */
    public C0888a f5430c;

    /* renamed from: d */
    public ViewPager2 f5431d;

    /* renamed from: e */
    public long f5432e = -1;

    /* renamed from: f */
    public final /* synthetic */ C1375z1 f5433f;

    public C1205c(C1375z1 c1375z1) {
        this.f5433f = c1375z1;
    }

    /* renamed from: a */
    public static ViewPager2 m2877a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    /* renamed from: b */
    public final void m2878b(boolean z2) {
        int currentItem;
        C1375z1 c1375z1 = this.f5433f;
        if (!c1375z1.f6455d.m995L() && this.f5431d.getScrollState() == 0) {
            C1195e c1195e = c1375z1.f6456e;
            if (c1195e.m2859g() != 0 && (currentItem = this.f5431d.getCurrentItem()) < 5) {
                long j2 = currentItem;
                if (j2 != this.f5432e || z2) {
                    AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = null;
                    AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = (AbstractComponentCallbacksC0423v) c1195e.m2855c(j2, null);
                    if (abstractComponentCallbacksC0423v2 == null || !abstractComponentCallbacksC0423v2.m1134q()) {
                        return;
                    }
                    this.f5432e = j2;
                    C0387O c0387o = c1375z1.f6455d;
                    c0387o.getClass();
                    C0398a c0398a = new C0398a(c0387o);
                    for (int i = 0; i < c1195e.m2859g(); i++) {
                        long m2856d = c1195e.m2856d(i);
                        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v3 = (AbstractComponentCallbacksC0423v) c1195e.m2860h(i);
                        if (abstractComponentCallbacksC0423v3.m1134q()) {
                            if (m2856d != this.f5432e) {
                                c0398a.m1078h(abstractComponentCallbacksC0423v3, EnumC0548m.f1993d);
                            } else {
                                abstractComponentCallbacksC0423v = abstractComponentCallbacksC0423v3;
                            }
                            boolean z3 = m2856d == this.f5432e;
                            if (abstractComponentCallbacksC0423v3.f1339G != z3) {
                                abstractComponentCallbacksC0423v3.f1339G = z3;
                            }
                        }
                    }
                    if (abstractComponentCallbacksC0423v != null) {
                        c0398a.m1078h(abstractComponentCallbacksC0423v, EnumC0548m.f1994e);
                    }
                    if (c0398a.f1228a.isEmpty()) {
                        return;
                    }
                    if (c0398a.f1234g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c0398a.f1243p.m1038z(c0398a, false);
                }
            }
        }
    }
}
