package p046X;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p006C.AbstractC0062j;
import p014G.C0102c;
import p014G.InterfaceC0101b;
import p031P.C0264b;
import p097q.AbstractC1241e;
import p107t1.AbstractC1461d;

/* renamed from: X.b0 */
/* loaded from: classes.dex */
public final class C0401b0 {

    /* renamed from: a */
    public int f1263a;

    /* renamed from: b */
    public int f1264b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0423v f1265c;

    /* renamed from: d */
    public final ArrayList f1266d;

    /* renamed from: e */
    public final LinkedHashSet f1267e;

    /* renamed from: f */
    public boolean f1268f;

    /* renamed from: g */
    public boolean f1269g;

    /* renamed from: h */
    public final C0394W f1270h;

    public C0401b0(int i, int i2, C0394W c0394w, C0102c c0102c) {
        AbstractC0062j.m165s(i, "finalState");
        AbstractC0062j.m165s(i2, "lifecycleImpact");
        AbstractC1461d.m3494e("fragmentStateManager", c0394w);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
        AbstractC1461d.m3493d("fragmentStateManager.fragment", abstractComponentCallbacksC0423v);
        AbstractC0062j.m165s(i, "finalState");
        AbstractC0062j.m165s(i2, "lifecycleImpact");
        AbstractC1461d.m3494e("fragment", abstractComponentCallbacksC0423v);
        this.f1263a = i;
        this.f1264b = i2;
        this.f1265c = abstractComponentCallbacksC0423v;
        this.f1266d = new ArrayList();
        this.f1267e = new LinkedHashSet();
        c0102c.m342a(new C0264b(this));
        this.f1270h = c0394w;
    }

    /* renamed from: a */
    public final void m1079a() {
        if (this.f1268f) {
            return;
        }
        this.f1268f = true;
        LinkedHashSet linkedHashSet = this.f1267e;
        if (linkedHashSet.isEmpty()) {
            m1080b();
            return;
        }
        for (C0102c c0102c : new LinkedHashSet(linkedHashSet)) {
            synchronized (c0102c) {
                try {
                    if (!c0102c.f335a) {
                        c0102c.f335a = true;
                        c0102c.f337c = true;
                        InterfaceC0101b interfaceC0101b = c0102c.f336b;
                        if (interfaceC0101b != null) {
                            try {
                                interfaceC0101b.mo341c();
                            } catch (Throwable th) {
                                synchronized (c0102c) {
                                    c0102c.f337c = false;
                                    c0102c.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0102c) {
                            c0102c.f337c = false;
                            c0102c.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1080b() {
        if (!this.f1269g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1269g = true;
            Iterator it = this.f1266d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1270h.m1057k();
    }

    /* renamed from: c */
    public final void m1081c(int i, int i2) {
        AbstractC0062j.m165s(i, "finalState");
        AbstractC0062j.m165s(i2, "lifecycleImpact");
        int m2943b = AbstractC1241e.m2943b(i2);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1265c;
        if (m2943b == 0) {
            if (this.f1263a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0423v + " mFinalState = " + AbstractC0062j.m172z(this.f1263a) + " -> " + AbstractC0062j.m172z(i) + '.');
                }
                this.f1263a = i;
                return;
            }
            return;
        }
        if (m2943b == 1) {
            if (this.f1263a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0423v + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0062j.m171y(this.f1264b) + " to ADDING.");
                }
                this.f1263a = 2;
                this.f1264b = 2;
                return;
            }
            return;
        }
        if (m2943b != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0423v + " mFinalState = " + AbstractC0062j.m172z(this.f1263a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0062j.m171y(this.f1264b) + " to REMOVING.");
        }
        this.f1263a = 1;
        this.f1264b = 3;
    }

    /* renamed from: d */
    public final void m1082d() {
        int i = this.f1264b;
        C0394W c0394w = this.f1270h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
                AbstractC1461d.m3493d("fragmentStateManager.fragment", abstractComponentCallbacksC0423v);
                View m1120L = abstractComponentCallbacksC0423v.m1120L();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + m1120L.findFocus() + " on view " + m1120L + " for Fragment " + abstractComponentCallbacksC0423v);
                }
                m1120L.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = c0394w.f1209c;
        AbstractC1461d.m3493d("fragmentStateManager.fragment", abstractComponentCallbacksC0423v2);
        View findFocus = abstractComponentCallbacksC0423v2.f1342J.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0423v2.m1123f().f1330k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0423v2);
            }
        }
        View m1120L2 = this.f1265c.m1120L();
        if (m1120L2.getParent() == null) {
            c0394w.m1048b();
            m1120L2.setAlpha(0.0f);
        }
        if (m1120L2.getAlpha() == 0.0f && m1120L2.getVisibility() == 0) {
            m1120L2.setVisibility(4);
        }
        C0420s c0420s = abstractComponentCallbacksC0423v2.f1345M;
        m1120L2.setAlpha(c0420s == null ? 1.0f : c0420s.f1329j);
    }

    public final String toString() {
        StringBuilder m163q = AbstractC0062j.m163q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        m163q.append(AbstractC0062j.m172z(this.f1263a));
        m163q.append(" lifecycleImpact = ");
        m163q.append(AbstractC0062j.m171y(this.f1264b));
        m163q.append(" fragment = ");
        m163q.append(this.f1265c);
        m163q.append('}');
        return m163q.toString();
    }
}
