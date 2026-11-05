package p068f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j */
/* loaded from: classes.dex */
public final class C0812j extends AbstractC0781K {

    /* renamed from: a */
    public final /* synthetic */ C0814l f4104a;

    public C0812j(C0814l c0814l) {
        this.f4104a = c0814l;
    }

    @Override // p068f0.AbstractC0781K
    /* renamed from: b */
    public final void mo2076b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0814l c0814l = this.f4104a;
        int computeVerticalScrollRange = c0814l.f4129s.computeVerticalScrollRange();
        int i3 = c0814l.f4128r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0814l.f4111a;
        c0814l.f4130t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0814l.f4129s.computeHorizontalScrollRange();
        int i6 = c0814l.f4127q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0814l.f4131u = z2;
        boolean z3 = c0814l.f4130t;
        if (!z3 && !z2) {
            if (c0814l.f4132v != 0) {
                c0814l.m2313f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0814l.f4122l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0814l.f4121k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0814l.f4131u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0814l.f4125o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0814l.f4124n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0814l.f4132v;
        if (i7 == 0 || i7 == 1) {
            c0814l.m2313f(1);
        }
    }
}
