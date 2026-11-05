package p102s;

import java.util.ArrayList;
import p105t.AbstractC1447h;
import p105t.C1453n;

/* renamed from: s.i */
/* loaded from: classes.dex */
public abstract class AbstractC1411i extends C1406d {

    /* renamed from: q0 */
    public C1406d[] f6778q0 = new C1406d[4];

    /* renamed from: r0 */
    public int f6779r0 = 0;

    /* renamed from: R */
    public final void m3422R(int i, ArrayList arrayList, C1453n c1453n) {
        for (int i2 = 0; i2 < this.f6779r0; i2++) {
            C1406d c1406d = this.f6778q0[i2];
            ArrayList arrayList2 = c1453n.f6836a;
            if (!arrayList2.contains(c1406d)) {
                arrayList2.add(c1406d);
            }
        }
        for (int i3 = 0; i3 < this.f6779r0; i3++) {
            AbstractC1447h.m3446b(this.f6778q0[i3], i, arrayList, c1453n);
        }
    }

    /* renamed from: S */
    public void mo3416S() {
    }
}
