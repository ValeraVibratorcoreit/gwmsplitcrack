package p098q0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.C0540e;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0548m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.altaysoft.t500_split.configActivity.CFG4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p006C.AbstractC0062j;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0376D;
import p046X.C0387O;
import p046X.C0394W;
import p046X.C0398a;
import p046X.C0422u;
import p051Z0.C0451i;
import p068f0.AbstractC0792W;
import p068f0.AbstractC0828z;
import p071g0.C0888a;
import p091o.AbstractC1194d;
import p091o.C1193c;
import p091o.C1195e;
import p091o.C1197g;
import p092o0.C1204b;
import p092o0.C1205c;
import p092o0.C1206d;
import p092o0.ViewOnLayoutChangeListenerC1203a;
import p101r0.C1384f;
import p101r0.C1395q;
import p101r0.C1396r;
import p101r0.C1398t;
import p101r0.C1402x;

/* renamed from: q0.z1 */
/* loaded from: classes.dex */
public final class C1375z1 extends AbstractC0828z {

    /* renamed from: c */
    public final C0555t f6454c;

    /* renamed from: d */
    public final C0387O f6455d;

    /* renamed from: e */
    public final C1195e f6456e;

    /* renamed from: f */
    public final C1195e f6457f;

    /* renamed from: g */
    public final C1195e f6458g;

    /* renamed from: h */
    public C1205c f6459h;

    /* renamed from: i */
    public boolean f6460i;

    /* renamed from: j */
    public boolean f6461j;

    public C1375z1(CFG4 cfg4) {
        C0387O m2405l = cfg4.m2405l();
        this.f6456e = new C1195e();
        this.f6457f = new C1195e();
        this.f6458g = new C1195e();
        this.f6460i = false;
        this.f6461j = false;
        this.f6455d = m2405l;
        this.f6454c = cfg4.f1501f;
        if (this.f4209a.m2206a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f4210b = true;
    }

    /* renamed from: j */
    public static void m3321j(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* renamed from: k */
    public static boolean m3322k(long j2) {
        return j2 >= 0 && j2 < ((long) 5);
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: a */
    public final int mo2089a() {
        return 5;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: b */
    public final long mo2090b(int i) {
        return i;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: c */
    public final void mo2345c(RecyclerView recyclerView) {
        if (this.f6459h != null) {
            throw new IllegalArgumentException();
        }
        C1205c c1205c = new C1205c(this);
        this.f6459h = c1205c;
        ViewPager2 m2877a = C1205c.m2877a(recyclerView);
        c1205c.f5431d = m2877a;
        C1204b c1204b = new C1204b(0, c1205c);
        c1205c.f5428a = c1204b;
        ((ArrayList) m2877a.f2146h.f5427b).add(c1204b);
        C0451i c0451i = new C0451i(c1205c);
        c1205c.f5429b = c0451i;
        this.f4209a.registerObserver(c0451i);
        C0888a c0888a = new C0888a(5, c1205c);
        c1205c.f5430c = c0888a;
        this.f6454c.m1377a(c0888a);
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: d */
    public final void mo2091d(AbstractC0792W abstractC0792W, int i) {
        Bundle bundle;
        C1206d c1206d = (C1206d) abstractC0792W;
        long j2 = c1206d.f3999e;
        FrameLayout frameLayout = (FrameLayout) c1206d.f3995a;
        int id = frameLayout.getId();
        Long m3324m = m3324m(id);
        C1195e c1195e = this.f6458g;
        if (m3324m != null && m3324m.longValue() != j2) {
            m3326o(m3324m.longValue());
            c1195e.m2858f(m3324m.longValue());
        }
        c1195e.m2857e(j2, Integer.valueOf(id));
        long j3 = i;
        C1195e c1195e2 = this.f6456e;
        if (c1195e2.f5391a) {
            c1195e2.m2854b();
        }
        if (AbstractC1194d.m2852b(c1195e2.f5392b, c1195e2.f5394d, j3) < 0) {
            AbstractComponentCallbacksC0423v c1402x = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new C1402x() : new C1384f() : new C1395q() : new C1396r() : new C1398t() : new C1402x();
            Bundle bundle2 = null;
            C0422u c0422u = (C0422u) this.f6457f.m2855c(j3, null);
            if (c1402x.f1374w != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (c0422u != null && (bundle = c0422u.f1331a) != null) {
                bundle2 = bundle;
            }
            c1402x.f1358g = bundle2;
            c1195e2.m2857e(j3, c1402x);
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (frameLayout.isAttachedToWindow()) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1203a(this, frameLayout, c1206d));
        }
        m3323l();
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: e */
    public final AbstractC0792W mo2092e(ViewGroup viewGroup) {
        int i = C1206d.f5434t;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new C1206d(frameLayout);
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: f */
    public final void mo2346f(RecyclerView recyclerView) {
        C1205c c1205c = this.f6459h;
        c1205c.getClass();
        ViewPager2 m2877a = C1205c.m2877a(recyclerView);
        ((ArrayList) m2877a.f2146h.f5427b).remove(c1205c.f5428a);
        C0451i c0451i = c1205c.f5429b;
        C1375z1 c1375z1 = c1205c.f5433f;
        c1375z1.f4209a.unregisterObserver(c0451i);
        c1375z1.f6454c.m1382f(c1205c.f5430c);
        c1205c.f5431d = null;
        this.f6459h = null;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ boolean mo2347g(AbstractC0792W abstractC0792W) {
        return true;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: h */
    public final void mo2348h(AbstractC0792W abstractC0792W) {
        m3325n((C1206d) abstractC0792W);
        m3323l();
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: i */
    public final void mo2349i(AbstractC0792W abstractC0792W) {
        Long m3324m = m3324m(((FrameLayout) ((C1206d) abstractC0792W).f3995a).getId());
        if (m3324m != null) {
            m3326o(m3324m.longValue());
            this.f6458g.m2858f(m3324m.longValue());
        }
    }

    /* renamed from: l */
    public final void m3323l() {
        C1195e c1195e;
        C1195e c1195e2;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v;
        View view;
        if (!this.f6461j || this.f6455d.m995L()) {
            return;
        }
        C1193c c1193c = new C1193c();
        int i = 0;
        while (true) {
            c1195e = this.f6456e;
            int m2859g = c1195e.m2859g();
            c1195e2 = this.f6458g;
            if (i >= m2859g) {
                break;
            }
            long m2856d = c1195e.m2856d(i);
            if (!m3322k(m2856d)) {
                c1193c.add(Long.valueOf(m2856d));
                c1195e2.m2858f(m2856d);
            }
            i++;
        }
        if (!this.f6460i) {
            this.f6461j = false;
            for (int i2 = 0; i2 < c1195e.m2859g(); i2++) {
                long m2856d2 = c1195e.m2856d(i2);
                if (c1195e2.f5391a) {
                    c1195e2.m2854b();
                }
                if (AbstractC1194d.m2852b(c1195e2.f5392b, c1195e2.f5394d, m2856d2) < 0 && ((abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) c1195e.m2855c(m2856d2, null)) == null || (view = abstractComponentCallbacksC0423v.f1342J) == null || view.getParent() == null)) {
                    c1193c.add(Long.valueOf(m2856d2));
                }
            }
        }
        Iterator it = c1193c.iterator();
        while (true) {
            C1197g c1197g = (C1197g) it;
            if (!c1197g.hasNext()) {
                return;
            } else {
                m3326o(((Long) c1197g.next()).longValue());
            }
        }
    }

    /* renamed from: m */
    public final Long m3324m(int i) {
        Long l2 = null;
        int i2 = 0;
        while (true) {
            C1195e c1195e = this.f6458g;
            if (i2 >= c1195e.m2859g()) {
                return l2;
            }
            if (((Integer) c1195e.m2860h(i2)).intValue() == i) {
                if (l2 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l2 = Long.valueOf(c1195e.m2856d(i2));
            }
            i2++;
        }
    }

    /* renamed from: n */
    public final void m3325n(C1206d c1206d) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) this.f6456e.m2855c(c1206d.f3999e, null);
        if (abstractComponentCallbacksC0423v == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) c1206d.f3995a;
        View view = abstractComponentCallbacksC0423v.f1342J;
        if (!abstractComponentCallbacksC0423v.m1134q() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean m1134q = abstractComponentCallbacksC0423v.m1134q();
        C0387O c0387o = this.f6455d;
        if (m1134q && view == null) {
            ((CopyOnWriteArrayList) c0387o.f1160l.f141g).add(new C0376D(new C0198k(this, abstractComponentCallbacksC0423v, frameLayout)));
            return;
        }
        if (abstractComponentCallbacksC0423v.m1134q() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                m3321j(view, frameLayout);
                return;
            }
            return;
        }
        if (abstractComponentCallbacksC0423v.m1134q()) {
            m3321j(view, frameLayout);
            return;
        }
        if (c0387o.m995L()) {
            if (c0387o.f1142G) {
                return;
            }
            this.f6454c.m1377a(new C0540e(this, c1206d));
            return;
        }
        ((CopyOnWriteArrayList) c0387o.f1160l.f141g).add(new C0376D(new C0198k(this, abstractComponentCallbacksC0423v, frameLayout)));
        C0398a c0398a = new C0398a(c0387o);
        c0398a.m1075e(0, abstractComponentCallbacksC0423v, "f" + c1206d.f3999e, 1);
        c0398a.m1078h(abstractComponentCallbacksC0423v, EnumC0548m.f1993d);
        if (c0398a.f1234g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0398a.f1243p.m1038z(c0398a, false);
        this.f6459h.m2878b(false);
    }

    /* renamed from: o */
    public final void m3326o(long j2) {
        ViewParent parent;
        C1195e c1195e = this.f6456e;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) c1195e.m2855c(j2, null);
        if (abstractComponentCallbacksC0423v == null) {
            return;
        }
        View view = abstractComponentCallbacksC0423v.f1342J;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean m3322k = m3322k(j2);
        C1195e c1195e2 = this.f6457f;
        if (!m3322k) {
            c1195e2.m2858f(j2);
        }
        if (!abstractComponentCallbacksC0423v.m1134q()) {
            c1195e.m2858f(j2);
            return;
        }
        C0387O c0387o = this.f6455d;
        if (c0387o.m995L()) {
            this.f6461j = true;
            return;
        }
        if (abstractComponentCallbacksC0423v.m1134q() && m3322k(j2)) {
            C0394W c0394w = (C0394W) ((HashMap) c0387o.f1151c.f924b).get(abstractComponentCallbacksC0423v.f1361j);
            if (c0394w != null) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = c0394w.f1209c;
                if (abstractComponentCallbacksC0423v2.equals(abstractComponentCallbacksC0423v)) {
                    c1195e2.m2857e(j2, abstractComponentCallbacksC0423v2.f1357f > -1 ? new C0422u(c0394w.m1061o()) : null);
                }
            }
            c0387o.m1014c0(new IllegalStateException(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " is not currently in the FragmentManager")));
            throw null;
        }
        C0398a c0398a = new C0398a(c0387o);
        c0398a.m1077g(abstractComponentCallbacksC0423v);
        if (c0398a.f1234g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0398a.f1243p.m1038z(c0398a, false);
        c1195e.m2858f(j2);
    }
}
