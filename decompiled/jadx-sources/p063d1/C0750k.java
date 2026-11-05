package p063d1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p084l1.C1158a;

/* renamed from: d1.k */
/* loaded from: classes.dex */
public final class C0750k extends AbstractC0764y {

    /* renamed from: a */
    public final /* synthetic */ int f3875a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0764y f3876b;

    public /* synthetic */ C0750k(AbstractC0764y abstractC0764y, int i) {
        this.f3875a = i;
        this.f3876b = abstractC0764y;
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        switch (this.f3875a) {
            case 0:
                return new AtomicLong(((Number) this.f3876b.mo2196a(c1158a)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                c1158a.m2797d();
                while (c1158a.m2805p()) {
                    arrayList.add(Long.valueOf(((Number) this.f3876b.mo2196a(c1158a)).longValue()));
                }
                c1158a.m2801l();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (c1158a.m2788C() != 9) {
                    return this.f3876b.mo2196a(c1158a);
                }
                c1158a.m2814y();
                return null;
        }
    }
}
