package p068f0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p038T.AbstractC0312f;

/* renamed from: f0.x */
/* loaded from: classes.dex */
public class C0826x extends AbstractC0780J {

    /* renamed from: a */
    public RecyclerView f4204a;

    /* renamed from: b */
    public final C0795Z f4205b = new C0795Z(this);

    /* renamed from: c */
    public C0825w f4206c;

    /* renamed from: d */
    public C0825w f4207d;

    /* renamed from: c */
    public static int m2329c(View view, AbstractC0312f abstractC0312f) {
        return ((abstractC0312f.mo879c(view) / 2) + abstractC0312f.mo881e(view)) - ((abstractC0312f.mo888l() / 2) + abstractC0312f.mo887k());
    }

    /* renamed from: d */
    public static View m2330d(AbstractC0778H abstractC0778H, AbstractC0312f abstractC0312f) {
        int m2247v = abstractC0778H.m2247v();
        View view = null;
        if (m2247v == 0) {
            return null;
        }
        int mo888l = (abstractC0312f.mo888l() / 2) + abstractC0312f.mo887k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < m2247v; i2++) {
            View m2245u = abstractC0778H.m2245u(i2);
            int abs = Math.abs(((abstractC0312f.mo879c(m2245u) / 2) + abstractC0312f.mo881e(m2245u)) - mo888l);
            if (abs < i) {
                view = m2245u;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final void m2331a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4204a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        C0795Z c0795z = this.f4205b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f2092k0;
            if (arrayList != null) {
                arrayList.remove(c0795z);
            }
            this.f4204a.setOnFlingListener(null);
        }
        this.f4204a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f4204a.m1520h(c0795z);
            this.f4204a.setOnFlingListener(this);
            new Scroller(this.f4204a.getContext(), new DecelerateInterpolator());
            m2336h();
        }
    }

    /* renamed from: b */
    public final int[] m2332b(AbstractC0778H abstractC0778H, View view) {
        int[] iArr = new int[2];
        if (abstractC0778H.mo1467d()) {
            iArr[0] = m2329c(view, m2334f(abstractC0778H));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0778H.mo1468e()) {
            iArr[1] = m2329c(view, m2335g(abstractC0778H));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: e */
    public View mo2333e(AbstractC0778H abstractC0778H) {
        if (abstractC0778H.mo1468e()) {
            return m2330d(abstractC0778H, m2335g(abstractC0778H));
        }
        if (abstractC0778H.mo1467d()) {
            return m2330d(abstractC0778H, m2334f(abstractC0778H));
        }
        return null;
    }

    /* renamed from: f */
    public final AbstractC0312f m2334f(AbstractC0778H abstractC0778H) {
        C0825w c0825w = this.f4207d;
        if (c0825w == null || ((AbstractC0778H) c0825w.f886b) != abstractC0778H) {
            this.f4207d = new C0825w(abstractC0778H, 0);
        }
        return this.f4207d;
    }

    /* renamed from: g */
    public final AbstractC0312f m2335g(AbstractC0778H abstractC0778H) {
        C0825w c0825w = this.f4206c;
        if (c0825w == null || ((AbstractC0778H) c0825w.f886b) != abstractC0778H) {
            this.f4206c = new C0825w(abstractC0778H, 1);
        }
        return this.f4206c;
    }

    /* renamed from: h */
    public final void m2336h() {
        AbstractC0778H layoutManager;
        View mo2333e;
        RecyclerView recyclerView = this.f4204a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo2333e = mo2333e(layoutManager)) == null) {
            return;
        }
        int[] m2332b = m2332b(layoutManager, mo2333e);
        int i = m2332b[0];
        if (i == 0 && m2332b[1] == 0) {
            return;
        }
        this.f4204a.m1513a0(i, false, m2332b[1]);
    }
}
