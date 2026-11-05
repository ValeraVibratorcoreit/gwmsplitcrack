package p068f0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: f0.m */
/* loaded from: classes.dex */
public final class C0815m {

    /* renamed from: a */
    public int f4137a;

    /* renamed from: b */
    public int f4138b;

    /* renamed from: c */
    public int[] f4139c;

    /* renamed from: d */
    public int f4140d;

    /* renamed from: a */
    public final void m2315a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f4140d;
        int i4 = i3 * 2;
        int[] iArr = this.f4139c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f4139c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f4139c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f4139c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f4140d++;
    }

    /* renamed from: b */
    public final void m2316b(RecyclerView recyclerView, boolean z2) {
        this.f4140d = 0;
        int[] iArr = this.f4139c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0778H abstractC0778H = recyclerView.f2103q;
        if (recyclerView.f2101p == null || abstractC0778H == null || !abstractC0778H.f3940i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f2087i.m356g()) {
                abstractC0778H.mo1475i(recyclerView.f2101p.mo2089a(), this);
            }
        } else if (!recyclerView.m1498L()) {
            abstractC0778H.mo1474h(this.f4137a, this.f4138b, recyclerView.f2088i0, this);
        }
        int i = this.f4140d;
        if (i > abstractC0778H.f3941j) {
            abstractC0778H.f3941j = i;
            abstractC0778H.f3942k = z2;
            recyclerView.f2083g.m2262k();
        }
    }
}
