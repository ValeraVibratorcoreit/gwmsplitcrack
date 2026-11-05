package p068f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p022K.C0208p;

/* renamed from: f0.y */
/* loaded from: classes.dex */
public final class C0827y {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f4208a;

    public /* synthetic */ C0827y(RecyclerView recyclerView) {
        this.f4208a = recyclerView;
    }

    /* renamed from: a */
    public void m2337a(C0796a c0796a) {
        int i = c0796a.f4019a;
        RecyclerView recyclerView = this.f4208a;
        if (i == 1) {
            recyclerView.f2103q.mo1409X(c0796a.f4020b, c0796a.f4021c);
            return;
        }
        if (i == 2) {
            recyclerView.f2103q.mo1413a0(c0796a.f4020b, c0796a.f4021c);
        } else if (i == 4) {
            recyclerView.f2103q.mo1414b0(c0796a.f4020b, c0796a.f4021c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f2103q.mo1412Z(c0796a.f4020b, c0796a.f4021c);
        }
    }

    /* renamed from: b */
    public AbstractC0792W m2338b(int i) {
        RecyclerView recyclerView = this.f4208a;
        int m603m = recyclerView.f2089j.m603m();
        int i2 = 0;
        AbstractC0792W abstractC0792W = null;
        while (true) {
            if (i2 >= m603m) {
                break;
            }
            AbstractC0792W m1483J = RecyclerView.m1483J(recyclerView.f2089j.m602l(i2));
            if (m1483J != null && !m1483J.m2276i() && m1483J.f3997c == i) {
                if (!((ArrayList) recyclerView.f2089j.f535d).contains(m1483J.f3995a)) {
                    abstractC0792W = m1483J;
                    break;
                }
                abstractC0792W = m1483J;
            }
            i2++;
        }
        if (abstractC0792W == null || ((ArrayList) recyclerView.f2089j.f535d).contains(abstractC0792W.f3995a)) {
            return null;
        }
        return abstractC0792W;
    }

    /* renamed from: c */
    public void m2339c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f4208a;
        int m603m = recyclerView.f2089j.m603m();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m603m; i6++) {
            View m602l = recyclerView.f2089j.m602l(i6);
            AbstractC0792W m1483J = RecyclerView.m1483J(m602l);
            if (m1483J != null && !m1483J.m2283p() && (i4 = m1483J.f3997c) >= i && i4 < i5) {
                m1483J.m2268a(2);
                m1483J.m2268a(1024);
                ((C0779I) m602l.getLayoutParams()).f3949c = true;
            }
        }
        C0784N c0784n = recyclerView.f2083g;
        ArrayList arrayList = c0784n.f3959c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0792W abstractC0792W = (AbstractC0792W) arrayList.get(size);
            if (abstractC0792W != null && (i3 = abstractC0792W.f3997c) >= i && i3 < i5) {
                abstractC0792W.m2268a(2);
                c0784n.m2256e(size);
            }
        }
        recyclerView.f2096m0 = true;
    }

    /* renamed from: d */
    public void m2340d(int i, int i2) {
        RecyclerView recyclerView = this.f4208a;
        int m603m = recyclerView.f2089j.m603m();
        for (int i3 = 0; i3 < m603m; i3++) {
            AbstractC0792W m1483J = RecyclerView.m1483J(recyclerView.f2089j.m602l(i3));
            if (m1483J != null && !m1483J.m2283p() && m1483J.f3997c >= i) {
                m1483J.m2280m(i2, false);
                recyclerView.f2088i0.f3978f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2083g.f3959c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0792W abstractC0792W = (AbstractC0792W) arrayList.get(i4);
            if (abstractC0792W != null && abstractC0792W.f3997c >= i) {
                abstractC0792W.m2280m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2094l0 = true;
    }

    /* renamed from: e */
    public void m2341e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f4208a;
        int m603m = recyclerView.f2089j.m603m();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < m603m; i11++) {
            AbstractC0792W m1483J = RecyclerView.m1483J(recyclerView.f2089j.m602l(i11));
            if (m1483J != null && (i9 = m1483J.f3997c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    m1483J.m2280m(i2 - i, false);
                } else {
                    m1483J.m2280m(i5, false);
                }
                recyclerView.f2088i0.f3978f = true;
            }
        }
        C0784N c0784n = recyclerView.f2083g;
        c0784n.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = c0784n.f3959c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC0792W abstractC0792W = (AbstractC0792W) arrayList.get(i12);
            if (abstractC0792W != null && (i8 = abstractC0792W.f3997c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0792W.m2280m(i2 - i, false);
                } else {
                    abstractC0792W.m2280m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2094l0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2342f(AbstractC0792W abstractC0792W, C0208p c0208p, C0208p c0208p2) {
        boolean z2;
        RecyclerView recyclerView = this.f4208a;
        recyclerView.getClass();
        abstractC0792W.m2282o(false);
        C0811i c0811i = (C0811i) recyclerView.f2066N;
        if (c0208p != null) {
            c0811i.getClass();
            int i = c0208p.f560a;
            int i2 = c0208p2.f560a;
            if (i != i2 || c0208p.f561b != c0208p2.f561b) {
                z2 = c0811i.m2305g(abstractC0792W, i, c0208p.f561b, i2, c0208p2.f561b);
                if (z2) {
                    return;
                }
                recyclerView.m1506T();
                return;
            }
        }
        c0811i.m2309l(abstractC0792W);
        abstractC0792W.f3995a.setAlpha(0.0f);
        c0811i.f4094i.add(abstractC0792W);
        z2 = true;
        if (z2) {
        }
    }

    /* renamed from: g */
    public void m2343g(AbstractC0792W abstractC0792W, C0208p c0208p, C0208p c0208p2) {
        boolean z2;
        RecyclerView recyclerView = this.f4208a;
        recyclerView.f2083g.m2261j(abstractC0792W);
        recyclerView.m1518f(abstractC0792W);
        abstractC0792W.m2282o(false);
        C0811i c0811i = (C0811i) recyclerView.f2066N;
        c0811i.getClass();
        int i = c0208p.f560a;
        int i2 = c0208p.f561b;
        View view = abstractC0792W.f3995a;
        int left = c0208p2 == null ? view.getLeft() : c0208p2.f560a;
        int top = c0208p2 == null ? view.getTop() : c0208p2.f561b;
        if (abstractC0792W.m2276i() || (i == left && i2 == top)) {
            c0811i.m2309l(abstractC0792W);
            c0811i.f4093h.add(abstractC0792W);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0811i.m2305g(abstractC0792W, i, i2, left, top);
        }
        if (z2) {
            recyclerView.m1506T();
        }
    }

    /* renamed from: h */
    public void m2344h(int i) {
        RecyclerView recyclerView = this.f4208a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m1526o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
