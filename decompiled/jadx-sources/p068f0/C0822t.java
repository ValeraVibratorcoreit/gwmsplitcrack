package p068f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.t */
/* loaded from: classes.dex */
public final class C0822t {

    /* renamed from: a */
    public boolean f4172a;

    /* renamed from: b */
    public int f4173b;

    /* renamed from: c */
    public int f4174c;

    /* renamed from: d */
    public int f4175d;

    /* renamed from: e */
    public int f4176e;

    /* renamed from: f */
    public int f4177f;

    /* renamed from: g */
    public int f4178g;

    /* renamed from: h */
    public int f4179h;

    /* renamed from: i */
    public int f4180i;

    /* renamed from: j */
    public int f4181j;

    /* renamed from: k */
    public List f4182k;

    /* renamed from: l */
    public boolean f4183l;

    /* renamed from: a */
    public final void m2324a(View view) {
        int m2269b;
        int size = this.f4182k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC0792W) this.f4182k.get(i2)).f3995a;
            C0779I c0779i = (C0779I) view3.getLayoutParams();
            if (view3 != view && !c0779i.f3947a.m2276i() && (m2269b = (c0779i.f3947a.m2269b() - this.f4175d) * this.f4176e) >= 0 && m2269b < i) {
                view2 = view3;
                if (m2269b == 0) {
                    break;
                } else {
                    i = m2269b;
                }
            }
        }
        if (view2 == null) {
            this.f4175d = -1;
        } else {
            this.f4175d = ((C0779I) view2.getLayoutParams()).f3947a.m2269b();
        }
    }

    /* renamed from: b */
    public final View m2325b(C0784N c0784n) {
        List list = this.f4182k;
        if (list == null) {
            View view = c0784n.m2260i(this.f4175d, Long.MAX_VALUE).f3995a;
            this.f4175d += this.f4176e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC0792W) this.f4182k.get(i)).f3995a;
            C0779I c0779i = (C0779I) view2.getLayoutParams();
            if (!c0779i.f3947a.m2276i() && this.f4175d == c0779i.f3947a.m2269b()) {
                m2324a(view2);
                return view2;
            }
        }
        return null;
    }
}
