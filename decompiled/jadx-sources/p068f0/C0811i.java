package p068f0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import p022K.C0208p;

/* renamed from: f0.i */
/* loaded from: classes.dex */
public final class C0811i extends AbstractC0774D {

    /* renamed from: s */
    public static TimeInterpolator f4091s;

    /* renamed from: g */
    public boolean f4092g;

    /* renamed from: h */
    public ArrayList f4093h;

    /* renamed from: i */
    public ArrayList f4094i;

    /* renamed from: j */
    public ArrayList f4095j;

    /* renamed from: k */
    public ArrayList f4096k;

    /* renamed from: l */
    public ArrayList f4097l;

    /* renamed from: m */
    public ArrayList f4098m;

    /* renamed from: n */
    public ArrayList f4099n;

    /* renamed from: o */
    public ArrayList f4100o;

    /* renamed from: p */
    public ArrayList f4101p;

    /* renamed from: q */
    public ArrayList f4102q;

    /* renamed from: r */
    public ArrayList f4103r;

    /* renamed from: h */
    public static void m2304h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0792W) arrayList.get(size)).f3995a.animate().cancel();
        }
    }

    @Override // p068f0.AbstractC0774D
    /* renamed from: a */
    public final boolean mo2208a(AbstractC0792W abstractC0792W, AbstractC0792W abstractC0792W2, C0208p c0208p, C0208p c0208p2) {
        int i;
        int i2;
        int i3 = c0208p.f560a;
        int i4 = c0208p.f561b;
        if (abstractC0792W2.m2283p()) {
            int i5 = c0208p.f560a;
            i2 = c0208p.f561b;
            i = i5;
        } else {
            i = c0208p2.f560a;
            i2 = c0208p2.f561b;
        }
        if (abstractC0792W == abstractC0792W2) {
            return m2305g(abstractC0792W, i3, i4, i, i2);
        }
        View view = abstractC0792W.f3995a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2309l(abstractC0792W);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m2309l(abstractC0792W2);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = abstractC0792W2.f3995a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f4096k;
        C0808g c0808g = new C0808g();
        c0808g.f4076a = abstractC0792W;
        c0808g.f4077b = abstractC0792W2;
        c0808g.f4078c = i3;
        c0808g.f4079d = i4;
        c0808g.f4080e = i;
        c0808g.f4081f = i2;
        arrayList.add(c0808g);
        return true;
    }

    @Override // p068f0.AbstractC0774D
    /* renamed from: d */
    public final void mo2210d(AbstractC0792W abstractC0792W) {
        View view = abstractC0792W.f3995a;
        view.animate().cancel();
        ArrayList arrayList = this.f4095j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0810h) arrayList.get(size)).f4086a == abstractC0792W) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2209c(abstractC0792W);
                arrayList.remove(size);
            }
        }
        m2307j(this.f4096k, abstractC0792W);
        if (this.f4093h.remove(abstractC0792W)) {
            view.setAlpha(1.0f);
            m2209c(abstractC0792W);
        }
        if (this.f4094i.remove(abstractC0792W)) {
            view.setAlpha(1.0f);
            m2209c(abstractC0792W);
        }
        ArrayList arrayList2 = this.f4099n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m2307j(arrayList3, abstractC0792W);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f4098m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0810h) arrayList5.get(size4)).f4086a == abstractC0792W) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2209c(abstractC0792W);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f4097l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC0792W)) {
                view.setAlpha(1.0f);
                m2209c(abstractC0792W);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f4102q.remove(abstractC0792W);
        this.f4100o.remove(abstractC0792W);
        this.f4103r.remove(abstractC0792W);
        this.f4101p.remove(abstractC0792W);
        m2306i();
    }

    @Override // p068f0.AbstractC0774D
    /* renamed from: e */
    public final void mo2211e() {
        ArrayList arrayList = this.f4095j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0810h c0810h = (C0810h) arrayList.get(size);
            View view = c0810h.f4086a.f3995a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2209c(c0810h.f4086a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f4093h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m2209c((AbstractC0792W) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f4094i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0792W abstractC0792W = (AbstractC0792W) arrayList3.get(size3);
            abstractC0792W.f3995a.setAlpha(1.0f);
            m2209c(abstractC0792W);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f4096k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0808g c0808g = (C0808g) arrayList4.get(size4);
            AbstractC0792W abstractC0792W2 = c0808g.f4076a;
            if (abstractC0792W2 != null) {
                m2308k(c0808g, abstractC0792W2);
            }
            AbstractC0792W abstractC0792W3 = c0808g.f4077b;
            if (abstractC0792W3 != null) {
                m2308k(c0808g, abstractC0792W3);
            }
        }
        arrayList4.clear();
        if (mo2212f()) {
            ArrayList arrayList5 = this.f4098m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0810h c0810h2 = (C0810h) arrayList6.get(size6);
                    View view2 = c0810h2.f4086a.f3995a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2209c(c0810h2.f4086a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f4097l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC0792W abstractC0792W4 = (AbstractC0792W) arrayList8.get(size8);
                    abstractC0792W4.f3995a.setAlpha(1.0f);
                    m2209c(abstractC0792W4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f4099n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0808g c0808g2 = (C0808g) arrayList10.get(size10);
                    AbstractC0792W abstractC0792W5 = c0808g2.f4076a;
                    if (abstractC0792W5 != null) {
                        m2308k(c0808g2, abstractC0792W5);
                    }
                    AbstractC0792W abstractC0792W6 = c0808g2.f4077b;
                    if (abstractC0792W6 != null) {
                        m2308k(c0808g2, abstractC0792W6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m2304h(this.f4102q);
            m2304h(this.f4101p);
            m2304h(this.f4100o);
            m2304h(this.f4103r);
            ArrayList arrayList11 = this.f3921b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p068f0.AbstractC0774D
    /* renamed from: f */
    public final boolean mo2212f() {
        return (this.f4094i.isEmpty() && this.f4096k.isEmpty() && this.f4095j.isEmpty() && this.f4093h.isEmpty() && this.f4101p.isEmpty() && this.f4102q.isEmpty() && this.f4100o.isEmpty() && this.f4103r.isEmpty() && this.f4098m.isEmpty() && this.f4097l.isEmpty() && this.f4099n.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    public final boolean m2305g(AbstractC0792W abstractC0792W, int i, int i2, int i3, int i4) {
        View view = abstractC0792W.f3995a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0792W.f3995a.getTranslationY());
        m2309l(abstractC0792W);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m2209c(abstractC0792W);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f4095j;
        C0810h c0810h = new C0810h();
        c0810h.f4086a = abstractC0792W;
        c0810h.f4087b = translationX;
        c0810h.f4088c = translationY;
        c0810h.f4089d = i3;
        c0810h.f4090e = i4;
        arrayList.add(c0810h);
        return true;
    }

    /* renamed from: i */
    public final void m2306i() {
        if (mo2212f()) {
            return;
        }
        ArrayList arrayList = this.f3921b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: j */
    public final void m2307j(ArrayList arrayList, AbstractC0792W abstractC0792W) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0808g c0808g = (C0808g) arrayList.get(size);
            if (m2308k(c0808g, abstractC0792W) && c0808g.f4076a == null && c0808g.f4077b == null) {
                arrayList.remove(c0808g);
            }
        }
    }

    /* renamed from: k */
    public final boolean m2308k(C0808g c0808g, AbstractC0792W abstractC0792W) {
        if (c0808g.f4077b == abstractC0792W) {
            c0808g.f4077b = null;
        } else {
            if (c0808g.f4076a != abstractC0792W) {
                return false;
            }
            c0808g.f4076a = null;
        }
        abstractC0792W.f3995a.setAlpha(1.0f);
        View view = abstractC0792W.f3995a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m2209c(abstractC0792W);
        return true;
    }

    /* renamed from: l */
    public final void m2309l(AbstractC0792W abstractC0792W) {
        if (f4091s == null) {
            f4091s = new ValueAnimator().getInterpolator();
        }
        abstractC0792W.f3995a.animate().setInterpolator(f4091s);
        mo2210d(abstractC0792W);
    }
}
