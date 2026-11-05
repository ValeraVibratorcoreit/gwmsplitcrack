package p068f0;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p014G.AbstractC0107h;
import p022K.AbstractC0169Q;
import p022K.C0178a;
import p022K.C0180b;
import p022K.C0198k;
import p022K.C0208p;

/* renamed from: f0.N */
/* loaded from: classes.dex */
public final class C0784N {

    /* renamed from: a */
    public final ArrayList f3957a;

    /* renamed from: b */
    public ArrayList f3958b;

    /* renamed from: c */
    public final ArrayList f3959c;

    /* renamed from: d */
    public final List f3960d;

    /* renamed from: e */
    public int f3961e;

    /* renamed from: f */
    public int f3962f;

    /* renamed from: g */
    public C0783M f3963g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f3964h;

    public C0784N(RecyclerView recyclerView) {
        this.f3964h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3957a = arrayList;
        this.f3958b = null;
        this.f3959c = new ArrayList();
        this.f3960d = Collections.unmodifiableList(arrayList);
        this.f3961e = 2;
        this.f3962f = 2;
    }

    /* renamed from: a */
    public final void m2252a(AbstractC0792W abstractC0792W, boolean z2) {
        RecyclerView.m1488j(abstractC0792W);
        RecyclerView recyclerView = this.f3964h;
        C0794Y c0794y = recyclerView.f2102p0;
        if (c0794y != null) {
            C0793X c0793x = c0794y.f4016e;
            View view = abstractC0792W.f3995a;
            AbstractC0169Q.m505j(view, c0793x != null ? (C0180b) c0793x.f4014e.remove(view) : null);
        }
        if (z2) {
            AbstractC0828z abstractC0828z = recyclerView.f2101p;
            if (abstractC0828z != null) {
                abstractC0828z.mo2349i(abstractC0792W);
            }
            if (recyclerView.f2088i0 != null) {
                recyclerView.f2091k.m74L(abstractC0792W);
            }
        }
        abstractC0792W.f4012r = null;
        C0783M m2254c = m2254c();
        m2254c.getClass();
        int i = abstractC0792W.f4000f;
        ArrayList arrayList = m2254c.m2251a(i).f3951a;
        if (((C0782L) m2254c.f3955a.get(i)).f3952b <= arrayList.size()) {
            return;
        }
        abstractC0792W.m2281n();
        arrayList.add(abstractC0792W);
    }

    /* renamed from: b */
    public final int m2253b(int i) {
        RecyclerView recyclerView = this.f3964h;
        if (i >= 0 && i < recyclerView.f2088i0.m2265b()) {
            return !recyclerView.f2088i0.f3979g ? i : recyclerView.f2087i.m355f(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f2088i0.m2265b() + recyclerView.m1537z());
    }

    /* renamed from: c */
    public final C0783M m2254c() {
        if (this.f3963g == null) {
            C0783M c0783m = new C0783M();
            c0783m.f3955a = new SparseArray();
            c0783m.f3956b = 0;
            this.f3963g = c0783m;
        }
        return this.f3963g;
    }

    /* renamed from: d */
    public final void m2255d() {
        ArrayList arrayList = this.f3959c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2256e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f2051y0;
        C0815m c0815m = this.f3964h.f2086h0;
        int[] iArr2 = c0815m.f4139c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0815m.f4140d = 0;
    }

    /* renamed from: e */
    public final void m2256e(int i) {
        ArrayList arrayList = this.f3959c;
        m2252a((AbstractC0792W) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* renamed from: f */
    public final void m2257f(View view) {
        AbstractC0792W m1483J = RecyclerView.m1483J(view);
        boolean m2278k = m1483J.m2278k();
        RecyclerView recyclerView = this.f3964h;
        if (m2278k) {
            recyclerView.removeDetachedView(view, false);
        }
        if (m1483J.m2277j()) {
            m1483J.f4008n.m2261j(m1483J);
        } else if (m1483J.m2284q()) {
            m1483J.f4004j &= -33;
        }
        m2258g(m1483J);
        if (recyclerView.f2066N == null || m1483J.m2275h()) {
            return;
        }
        recyclerView.f2066N.mo2210d(m1483J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        r5 = r5 - 1;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2258g(AbstractC0792W abstractC0792W) {
        boolean z2;
        AbstractC0828z abstractC0828z;
        boolean z3;
        boolean m2277j = abstractC0792W.m2277j();
        RecyclerView recyclerView = this.f3964h;
        boolean z4 = true;
        View view = abstractC0792W.f3995a;
        if (m2277j || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC0792W.m2277j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m1537z());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC0792W.m2278k()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0792W + recyclerView.m1537z());
        }
        if (abstractC0792W.m2283p()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.m1537z());
        }
        if ((abstractC0792W.f4004j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            if (view.hasTransientState()) {
                z2 = true;
                abstractC0828z = recyclerView.f2101p;
                if ((abstractC0828z == null && z2 && abstractC0828z.mo2347g(abstractC0792W)) || abstractC0792W.m2275h()) {
                    if (this.f3962f <= 0 || abstractC0792W.m2271d(526)) {
                        z3 = false;
                    } else {
                        ArrayList arrayList = this.f3959c;
                        int size = arrayList.size();
                        if (size >= this.f3962f && size > 0) {
                            m2256e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.f2051y0;
                        if (size > 0) {
                            C0815m c0815m = recyclerView.f2086h0;
                            int i = abstractC0792W.f3997c;
                            if (c0815m.f4139c != null) {
                                int i2 = c0815m.f4140d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0815m.f4139c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((AbstractC0792W) arrayList.get(i4)).f3997c;
                                C0815m c0815m2 = recyclerView.f2086h0;
                                if (c0815m2.f4139c == null) {
                                    break;
                                }
                                int i6 = c0815m2.f4140d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0815m2.f4139c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, abstractC0792W);
                        z3 = true;
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        m2252a(abstractC0792W, true);
                    }
                    r1 = z3;
                } else {
                    z4 = false;
                }
                recyclerView.f2091k.m74L(abstractC0792W);
                if (r1 && !z4 && z2) {
                    abstractC0792W.f4012r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        abstractC0828z = recyclerView.f2101p;
        if (abstractC0828z == null) {
        }
        z4 = false;
        recyclerView.f2091k.m74L(abstractC0792W);
        if (r1) {
        }
    }

    /* renamed from: h */
    public final void m2259h(View view) {
        AbstractC0774D abstractC0774D;
        AbstractC0792W m1483J = RecyclerView.m1483J(view);
        boolean m2271d = m1483J.m2271d(12);
        RecyclerView recyclerView = this.f3964h;
        if (!m2271d && m1483J.m2279l() && (abstractC0774D = recyclerView.f2066N) != null) {
            C0811i c0811i = (C0811i) abstractC0774D;
            if (m1483J.m2270c().isEmpty() && c0811i.f4092g && !m1483J.m2274g()) {
                if (this.f3958b == null) {
                    this.f3958b = new ArrayList();
                }
                m1483J.f4008n = this;
                m1483J.f4009o = true;
                this.f3958b.add(m1483J);
                return;
            }
        }
        if (m1483J.m2274g() && !m1483J.m2276i() && !recyclerView.f2101p.f4210b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m1537z());
        }
        m1483J.f4008n = this;
        m1483J.f4009o = false;
        this.f3957a.add(m1483J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0416, code lost:
    
        if (r11.m2274g() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x043e, code lost:
    
        if ((r14 + r12) >= r27) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cb, code lost:
    
        if (r11.f4000f != 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0792W m2260i(int i, long j2) {
        boolean z2;
        AbstractC0792W abstractC0792W;
        C0180b c0180b;
        boolean z3;
        View view;
        AbstractC0828z abstractC0828z;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j3;
        AccessibilityManager accessibilityManager;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams2;
        C0779I c0779i;
        AbstractC0792W abstractC0792W2;
        View view2;
        int m2287b;
        boolean z6;
        int size;
        int m355f;
        RecyclerView recyclerView = this.f3964h;
        if (i < 0 || i >= recyclerView.f2088i0.m2265b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f2088i0.m2265b() + recyclerView.m1537z());
        }
        C0789T c0789t = recyclerView.f2088i0;
        if (c0789t.f3979g) {
            ArrayList arrayList2 = this.f3958b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        abstractC0792W = (AbstractC0792W) this.f3958b.get(i2);
                        if (!abstractC0792W.m2284q() && abstractC0792W.m2269b() == i) {
                            abstractC0792W.m2268a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f2101p.f4210b && (m355f = recyclerView.f2087i.m355f(i, 0)) > 0 && m355f < recyclerView.f2101p.mo2089a()) {
                        long mo2090b = recyclerView.f2101p.mo2090b(m355f);
                        for (int i3 = 0; i3 < size; i3++) {
                            AbstractC0792W abstractC0792W3 = (AbstractC0792W) this.f3958b.get(i3);
                            if (!abstractC0792W3.m2284q() && abstractC0792W3.f3999e == mo2090b) {
                                abstractC0792W3.m2268a(32);
                                abstractC0792W = abstractC0792W3;
                                break;
                            }
                        }
                    }
                }
                z2 = abstractC0792W == null;
            }
            abstractC0792W = null;
            if (abstractC0792W == null) {
            }
        } else {
            z2 = false;
            abstractC0792W = null;
        }
        ArrayList arrayList3 = this.f3959c;
        ArrayList arrayList4 = this.f3957a;
        if (abstractC0792W == null) {
            int size2 = arrayList4.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC0792W abstractC0792W4 = (AbstractC0792W) arrayList4.get(i4);
                if (!abstractC0792W4.m2284q() && abstractC0792W4.m2269b() == i && !abstractC0792W4.m2274g() && (c0789t.f3979g || !abstractC0792W4.m2276i())) {
                    abstractC0792W4.m2268a(32);
                    abstractC0792W = abstractC0792W4;
                    break;
                }
            }
            ArrayList arrayList5 = (ArrayList) recyclerView.f2089j.f535d;
            int size3 = arrayList5.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view2 = null;
                    break;
                }
                view2 = (View) arrayList5.get(i5);
                AbstractC0792W m1483J = RecyclerView.m1483J(view2);
                if (m1483J.m2269b() == i && !m1483J.m2274g() && !m1483J.m2276i()) {
                    break;
                }
                i5++;
            }
            if (view2 == null) {
                int size4 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        abstractC0792W = null;
                        break;
                    }
                    AbstractC0792W abstractC0792W5 = (AbstractC0792W) arrayList3.get(i6);
                    if (!abstractC0792W5.m2274g() && abstractC0792W5.m2269b() == i && !abstractC0792W5.m2272e()) {
                        arrayList3.remove(i6);
                        abstractC0792W = abstractC0792W5;
                        break;
                    }
                    i6++;
                }
            } else {
                AbstractC0792W m1483J2 = RecyclerView.m1483J(view2);
                C0198k c0198k = recyclerView.f2089j;
                int indexOfChild = ((C0827y) c0198k.f533b).f4208a.indexOfChild(view2);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                }
                C0798b c0798b = (C0798b) c0198k.f534c;
                if (!c0798b.m2289d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                }
                c0798b.m2286a(indexOfChild);
                c0198k.m611v(view2);
                C0198k c0198k2 = recyclerView.f2089j;
                int indexOfChild2 = ((C0827y) c0198k2.f533b).f4208a.indexOfChild(view2);
                if (indexOfChild2 != -1) {
                    C0798b c0798b2 = (C0798b) c0198k2.f534c;
                    if (!c0798b2.m2289d(indexOfChild2)) {
                        m2287b = indexOfChild2 - c0798b2.m2287b(indexOfChild2);
                        if (m2287b != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m1483J2 + recyclerView.m1537z());
                        }
                        recyclerView.f2089j.m594d(m2287b);
                        m2259h(view2);
                        m1483J2.m2268a(8224);
                        abstractC0792W = m1483J2;
                    }
                }
                m2287b = -1;
                if (m2287b != -1) {
                }
            }
            if (abstractC0792W != null) {
                if (abstractC0792W.m2276i()) {
                    z6 = c0789t.f3979g;
                } else {
                    int i7 = abstractC0792W.f3997c;
                    if (i7 < 0 || i7 >= recyclerView.f2101p.mo2089a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0792W + recyclerView.m1537z());
                    }
                    if (!c0789t.f3979g) {
                        recyclerView.f2101p.getClass();
                    }
                    AbstractC0828z abstractC0828z2 = recyclerView.f2101p;
                    if (!abstractC0828z2.f4210b || abstractC0792W.f3999e == abstractC0828z2.mo2090b(abstractC0792W.f3997c)) {
                        z6 = true;
                    }
                    z6 = false;
                }
                if (z6) {
                    z2 = true;
                } else {
                    abstractC0792W.m2268a(4);
                    if (abstractC0792W.m2277j()) {
                        recyclerView.removeDetachedView(abstractC0792W.f3995a, false);
                        abstractC0792W.f4008n.m2261j(abstractC0792W);
                    } else if (abstractC0792W.m2284q()) {
                        abstractC0792W.f4004j &= -33;
                    }
                    m2258g(abstractC0792W);
                    abstractC0792W = null;
                }
            }
        }
        if (abstractC0792W == null) {
            int m355f2 = recyclerView.f2087i.m355f(i, 0);
            if (m355f2 < 0 || m355f2 >= recyclerView.f2101p.mo2089a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + m355f2 + ").state:" + c0789t.m2265b() + recyclerView.m1537z());
            }
            recyclerView.f2101p.getClass();
            AbstractC0828z abstractC0828z3 = recyclerView.f2101p;
            if (abstractC0828z3.f4210b) {
                long mo2090b2 = abstractC0828z3.mo2090b(m355f2);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        AbstractC0792W abstractC0792W6 = (AbstractC0792W) arrayList4.get(size5);
                        if (abstractC0792W6.f3999e == mo2090b2 && !abstractC0792W6.m2284q()) {
                            if (abstractC0792W6.f4000f == 0) {
                                abstractC0792W6.m2268a(32);
                                if (abstractC0792W6.m2276i() && !c0789t.f3979g) {
                                    abstractC0792W6.f4004j = (abstractC0792W6.f4004j & (-15)) | 2;
                                }
                                abstractC0792W = abstractC0792W6;
                            } else {
                                arrayList4.remove(size5);
                                View view3 = abstractC0792W6.f3995a;
                                recyclerView.removeDetachedView(view3, false);
                                AbstractC0792W m1483J3 = RecyclerView.m1483J(view3);
                                m1483J3.f4008n = null;
                                m1483J3.f4009o = false;
                                m1483J3.f4004j &= -33;
                                m2258g(m1483J3);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            AbstractC0792W abstractC0792W7 = (AbstractC0792W) arrayList3.get(size6);
                            if (abstractC0792W7.f3999e != mo2090b2 || abstractC0792W7.m2272e()) {
                                size6--;
                            } else if (abstractC0792W7.f4000f == 0) {
                                arrayList3.remove(size6);
                                abstractC0792W = abstractC0792W7;
                            } else {
                                m2256e(size6);
                            }
                        }
                        abstractC0792W = null;
                    }
                }
                if (abstractC0792W != null) {
                    abstractC0792W.f3997c = m355f2;
                    z2 = true;
                }
            }
            if (abstractC0792W == null) {
                C0782L c0782l = (C0782L) m2254c().f3955a.get(0);
                if (c0782l != null) {
                    ArrayList arrayList6 = c0782l.f3951a;
                    if (!arrayList6.isEmpty()) {
                        for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
                            if (!((AbstractC0792W) arrayList6.get(size7)).m2272e()) {
                                abstractC0792W2 = (AbstractC0792W) arrayList6.remove(size7);
                                break;
                            }
                        }
                    }
                }
                abstractC0792W2 = null;
                if (abstractC0792W2 != null) {
                    abstractC0792W2.m2281n();
                    int[] iArr = RecyclerView.f2051y0;
                }
                abstractC0792W = abstractC0792W2;
            }
            if (abstractC0792W == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j4 = this.f3963g.m2251a(0).f3953c;
                    if (!(j4 == 0 || j4 + nanoTime < j2)) {
                        return null;
                    }
                }
                c0180b = null;
                AbstractC0828z abstractC0828z4 = recyclerView.f2101p;
                abstractC0828z4.getClass();
                try {
                    int i8 = AbstractC0107h.f342a;
                    Trace.beginSection("RV CreateView");
                    abstractC0792W = abstractC0828z4.mo2092e(recyclerView);
                    View view4 = abstractC0792W.f3995a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC0792W.f4000f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.f2051y0;
                    RecyclerView m1482E = RecyclerView.m1482E(view4);
                    if (m1482E != null) {
                        abstractC0792W.f3996b = new WeakReference(m1482E);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C0782L m2251a = this.f3963g.m2251a(0);
                    long j5 = m2251a.f3953c;
                    if (j5 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * 3);
                    }
                    m2251a.f3953c = nanoTime2;
                    if (z2 && !c0789t.f3979g && abstractC0792W.m2271d(8192)) {
                        abstractC0792W.f4004j &= -8193;
                        if (c0789t.f3982j) {
                            AbstractC0774D.m2207b(abstractC0792W);
                            AbstractC0774D abstractC0774D = recyclerView.f2066N;
                            abstractC0792W.m2270c();
                            abstractC0774D.getClass();
                            C0208p c0208p = new C0208p();
                            c0208p.m662a(abstractC0792W);
                            recyclerView.m1507U(abstractC0792W, c0208p);
                        }
                    }
                    z3 = c0789t.f3979g;
                    view = abstractC0792W.f3995a;
                    if (z3 || !abstractC0792W.m2273f()) {
                        if (abstractC0792W.m2273f()) {
                            if (!((abstractC0792W.f4004j & 2) != 0)) {
                            }
                        }
                        int m355f3 = recyclerView.f2087i.m355f(i, 0);
                        abstractC0792W.f4012r = recyclerView;
                        int i9 = abstractC0792W.f4000f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            long j6 = this.f3963g.m2251a(i9).f3954d;
                            if (j6 != 0) {
                            }
                        }
                        abstractC0828z = recyclerView.f2101p;
                        abstractC0828z.getClass();
                        abstractC0792W.f3997c = m355f3;
                        if (abstractC0828z.f4210b) {
                            abstractC0792W.f3999e = abstractC0828z.mo2090b(m355f3);
                        }
                        abstractC0792W.f4004j = (abstractC0792W.f4004j & (-520)) | 1;
                        int i10 = AbstractC0107h.f342a;
                        Trace.beginSection("RV OnBindView");
                        abstractC0792W.m2270c();
                        abstractC0828z.mo2091d(abstractC0792W, m355f3);
                        arrayList = abstractC0792W.f4005k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        abstractC0792W.f4004j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C0779I) {
                            ((C0779I) layoutParams).f3949c = true;
                        }
                        Trace.endSection();
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        C0782L m2251a2 = this.f3963g.m2251a(abstractC0792W.f4000f);
                        j3 = m2251a2.f3954d;
                        if (j3 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j3 / 4) * 3);
                        }
                        m2251a2.f3954d = nanoTime4;
                        accessibilityManager = recyclerView.f2055C;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                            if (view.getImportantForAccessibility() == 0) {
                                z4 = true;
                                view.setImportantForAccessibility(1);
                            } else {
                                z4 = true;
                            }
                            C0794Y c0794y = recyclerView.f2102p0;
                            if (c0794y != null) {
                                C0793X c0793x = c0794y.f4016e;
                                if (c0793x != null) {
                                    View.AccessibilityDelegate m497b = AbstractC0169Q.m497b(view);
                                    if (m497b != null) {
                                        c0180b = m497b instanceof C0178a ? ((C0178a) m497b).f484a : new C0180b(m497b);
                                    }
                                    if (c0180b != null && c0180b != c0793x) {
                                        c0793x.f4014e.put(view, c0180b);
                                    }
                                }
                                AbstractC0169Q.m505j(view, c0793x);
                            }
                        }
                        if (c0789t.f3979g) {
                            abstractC0792W.f4001g = i;
                        }
                        z5 = z4;
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 == null) {
                            c0779i = (C0779I) recyclerView.generateDefaultLayoutParams();
                            view.setLayoutParams(c0779i);
                        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                            c0779i = (C0779I) layoutParams2;
                        } else {
                            c0779i = (C0779I) recyclerView.generateLayoutParams(layoutParams2);
                            view.setLayoutParams(c0779i);
                        }
                        c0779i.f3947a = abstractC0792W;
                        c0779i.f3950d = (z2 || !z5) ? false : z4;
                        return abstractC0792W;
                    }
                    abstractC0792W.f4001g = i;
                    z5 = false;
                    z4 = true;
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                    }
                    c0779i.f3947a = abstractC0792W;
                    c0779i.f3950d = (z2 || !z5) ? false : z4;
                    return abstractC0792W;
                } catch (Throwable th) {
                    int i11 = AbstractC0107h.f342a;
                    Trace.endSection();
                    throw th;
                }
            }
        }
        c0180b = null;
        if (z2) {
            abstractC0792W.f4004j &= -8193;
            if (c0789t.f3982j) {
            }
        }
        z3 = c0789t.f3979g;
        view = abstractC0792W.f3995a;
        if (z3) {
        }
        if (abstractC0792W.m2273f()) {
        }
        int m355f32 = recyclerView.f2087i.m355f(i, 0);
        abstractC0792W.f4012r = recyclerView;
        int i92 = abstractC0792W.f4000f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j2 != Long.MAX_VALUE) {
        }
        abstractC0828z = recyclerView.f2101p;
        abstractC0828z.getClass();
        abstractC0792W.f3997c = m355f32;
        if (abstractC0828z.f4210b) {
        }
        abstractC0792W.f4004j = (abstractC0792W.f4004j & (-520)) | 1;
        int i102 = AbstractC0107h.f342a;
        Trace.beginSection("RV OnBindView");
        abstractC0792W.m2270c();
        abstractC0828z.mo2091d(abstractC0792W, m355f32);
        arrayList = abstractC0792W.f4005k;
        if (arrayList != null) {
        }
        abstractC0792W.f4004j &= -1025;
        layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0779I) {
        }
        Trace.endSection();
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        C0782L m2251a22 = this.f3963g.m2251a(abstractC0792W.f4000f);
        j3 = m2251a22.f3954d;
        if (j3 != 0) {
        }
        m2251a22.f3954d = nanoTime42;
        accessibilityManager = recyclerView.f2055C;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (c0789t.f3979g) {
        }
        z5 = z4;
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
        }
        c0779i.f3947a = abstractC0792W;
        c0779i.f3950d = (z2 || !z5) ? false : z4;
        return abstractC0792W;
    }

    /* renamed from: j */
    public final void m2261j(AbstractC0792W abstractC0792W) {
        if (abstractC0792W.f4009o) {
            this.f3958b.remove(abstractC0792W);
        } else {
            this.f3957a.remove(abstractC0792W);
        }
        abstractC0792W.f4008n = null;
        abstractC0792W.f4009o = false;
        abstractC0792W.f4004j &= -33;
    }

    /* renamed from: k */
    public final void m2262k() {
        AbstractC0778H abstractC0778H = this.f3964h.f2103q;
        this.f3962f = this.f3961e + (abstractC0778H != null ? abstractC0778H.f3941j : 0);
        ArrayList arrayList = this.f3959c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3962f; size--) {
            m2256e(size);
        }
    }
}
