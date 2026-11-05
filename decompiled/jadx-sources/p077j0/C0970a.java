package p077j0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p010D1.AbstractC0088l;
import p038T.C0326t;
import p069f1.C0833e;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public final class C0970a extends AbstractC0982m {

    /* renamed from: A */
    public ArrayList f4654A;

    /* renamed from: B */
    public boolean f4655B;

    /* renamed from: C */
    public int f4656C;

    /* renamed from: D */
    public boolean f4657D;

    /* renamed from: E */
    public int f4658E;

    @Override // p077j0.AbstractC0982m
    /* renamed from: A */
    public final void mo2521A(long j2) {
        ArrayList arrayList;
        this.f4696c = j2;
        if (j2 < 0 || (arrayList = this.f4654A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0982m) this.f4654A.get(i)).mo2521A(j2);
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: B */
    public final void mo2522B(AbstractC0088l abstractC0088l) {
        this.f4658E |= 8;
        int size = this.f4654A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0982m) this.f4654A.get(i)).mo2522B(abstractC0088l);
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: C */
    public final void mo2523C(TimeInterpolator timeInterpolator) {
        this.f4658E |= 1;
        ArrayList arrayList = this.f4654A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0982m) this.f4654A.get(i)).mo2523C(timeInterpolator);
            }
        }
        this.f4697d = timeInterpolator;
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: D */
    public final void mo2524D(C0833e c0833e) {
        super.mo2524D(c0833e);
        this.f4658E |= 4;
        if (this.f4654A != null) {
            for (int i = 0; i < this.f4654A.size(); i++) {
                ((AbstractC0982m) this.f4654A.get(i)).mo2524D(c0833e);
            }
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: E */
    public final void mo2525E() {
        this.f4658E |= 2;
        int size = this.f4654A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0982m) this.f4654A.get(i)).mo2525E();
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: F */
    public final void mo2526F(long j2) {
        this.f4695b = j2;
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: H */
    public final String mo2527H(String str) {
        String mo2527H = super.mo2527H(str);
        for (int i = 0; i < this.f4654A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo2527H);
            sb.append("\n");
            sb.append(((AbstractC0982m) this.f4654A.get(i)).mo2527H(str + "  "));
            mo2527H = sb.toString();
        }
        return mo2527H;
    }

    /* renamed from: I */
    public final void m2528I(AbstractC0982m abstractC0982m) {
        this.f4654A.add(abstractC0982m);
        abstractC0982m.f4702i = this;
        long j2 = this.f4696c;
        if (j2 >= 0) {
            abstractC0982m.mo2521A(j2);
        }
        if ((this.f4658E & 1) != 0) {
            abstractC0982m.mo2523C(this.f4697d);
        }
        if ((this.f4658E & 2) != 0) {
            abstractC0982m.mo2525E();
        }
        if ((this.f4658E & 4) != 0) {
            abstractC0982m.mo2524D(this.f4715v);
        }
        if ((this.f4658E & 8) != 0) {
            abstractC0982m.mo2522B(null);
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: c */
    public final void mo2529c() {
        super.mo2529c();
        int size = this.f4654A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0982m) this.f4654A.get(i)).mo2529c();
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: d */
    public final void mo2530d(C0989t c0989t) {
        if (m2561t(c0989t.f4726b)) {
            Iterator it = this.f4654A.iterator();
            while (it.hasNext()) {
                AbstractC0982m abstractC0982m = (AbstractC0982m) it.next();
                if (abstractC0982m.m2561t(c0989t.f4726b)) {
                    abstractC0982m.mo2530d(c0989t);
                    c0989t.f4727c.add(abstractC0982m);
                }
            }
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: f */
    public final void mo2531f(C0989t c0989t) {
        int size = this.f4654A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0982m) this.f4654A.get(i)).mo2531f(c0989t);
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: g */
    public final void mo2532g(C0989t c0989t) {
        if (m2561t(c0989t.f4726b)) {
            Iterator it = this.f4654A.iterator();
            while (it.hasNext()) {
                AbstractC0982m abstractC0982m = (AbstractC0982m) it.next();
                if (abstractC0982m.m2561t(c0989t.f4726b)) {
                    abstractC0982m.mo2532g(c0989t);
                    c0989t.f4727c.add(abstractC0982m);
                }
            }
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0982m clone() {
        C0970a c0970a = (C0970a) super.clone();
        c0970a.f4654A = new ArrayList();
        int size = this.f4654A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0982m clone = ((AbstractC0982m) this.f4654A.get(i)).clone();
            c0970a.f4654A.add(clone);
            clone.f4702i = c0970a;
        }
        return c0970a;
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: l */
    public final void mo2534l(FrameLayout frameLayout, C0326t c0326t, C0326t c0326t2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f4695b;
        int size = this.f4654A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0982m abstractC0982m = (AbstractC0982m) this.f4654A.get(i);
            if (j2 > 0 && (this.f4655B || i == 0)) {
                long j3 = abstractC0982m.f4695b;
                if (j3 > 0) {
                    abstractC0982m.mo2526F(j3 + j2);
                } else {
                    abstractC0982m.mo2526F(j2);
                }
            }
            abstractC0982m.mo2534l(frameLayout, c0326t, c0326t2, arrayList, arrayList2);
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: w */
    public final void mo2535w(ViewGroup viewGroup) {
        super.mo2535w(viewGroup);
        int size = this.f4654A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0982m) this.f4654A.get(i)).mo2535w(viewGroup);
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: x */
    public final AbstractC0982m mo2536x(InterfaceC0980k interfaceC0980k) {
        super.mo2536x(interfaceC0980k);
        return this;
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: y */
    public final void mo2537y(FrameLayout frameLayout) {
        super.mo2537y(frameLayout);
        int size = this.f4654A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0982m) this.f4654A.get(i)).mo2537y(frameLayout);
        }
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: z */
    public final void mo2538z() {
        if (this.f4654A.isEmpty()) {
            m2552G();
            m2557m();
            return;
        }
        C0987r c0987r = new C0987r();
        c0987r.f4724b = this;
        Iterator it = this.f4654A.iterator();
        while (it.hasNext()) {
            ((AbstractC0982m) it.next()).m2553a(c0987r);
        }
        this.f4656C = this.f4654A.size();
        if (this.f4655B) {
            Iterator it2 = this.f4654A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0982m) it2.next()).mo2538z();
            }
            return;
        }
        for (int i = 1; i < this.f4654A.size(); i++) {
            ((AbstractC0982m) this.f4654A.get(i - 1)).m2553a(new C0987r((AbstractC0982m) this.f4654A.get(i)));
        }
        AbstractC0982m abstractC0982m = (AbstractC0982m) this.f4654A.get(0);
        if (abstractC0982m != null) {
            abstractC0982m.mo2538z();
        }
    }
}
