package p072g1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p084l1.C1158a;

/* renamed from: g1.t */
/* loaded from: classes.dex */
public class C0939t extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        ArrayList arrayList = new ArrayList();
        c1158a.m2797d();
        while (c1158a.m2805p()) {
            try {
                arrayList.add(Integer.valueOf(c1158a.m2810u()));
            } catch (NumberFormatException e2) {
                throw new C0755p(e2);
            }
        }
        c1158a.m2801l();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }
}
