package p105t;

import java.util.ArrayList;

/* renamed from: t.l */
/* loaded from: classes.dex */
public final class C1451l {

    /* renamed from: a */
    public AbstractC1454o f6831a;

    /* renamed from: b */
    public ArrayList f6832b;

    /* renamed from: a */
    public static long m3458a(C1445f c1445f, long j2) {
        AbstractC1454o abstractC1454o = c1445f.f6819d;
        if (abstractC1454o instanceof C1449j) {
            return j2;
        }
        ArrayList arrayList = c1445f.f6826k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC1443d interfaceC1443d = (InterfaceC1443d) arrayList.get(i);
            if (interfaceC1443d instanceof C1445f) {
                C1445f c1445f2 = (C1445f) interfaceC1443d;
                if (c1445f2.f6819d != abstractC1454o) {
                    j3 = Math.min(j3, m3458a(c1445f2, c1445f2.f6821f + j2));
                }
            }
        }
        if (c1445f != abstractC1454o.f6849i) {
            return j3;
        }
        long mo3431j = abstractC1454o.mo3431j();
        long j4 = j2 - mo3431j;
        return Math.min(Math.min(j3, m3458a(abstractC1454o.f6848h, j4)), j4 - r9.f6821f);
    }

    /* renamed from: b */
    public static long m3459b(C1445f c1445f, long j2) {
        AbstractC1454o abstractC1454o = c1445f.f6819d;
        if (abstractC1454o instanceof C1449j) {
            return j2;
        }
        ArrayList arrayList = c1445f.f6826k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC1443d interfaceC1443d = (InterfaceC1443d) arrayList.get(i);
            if (interfaceC1443d instanceof C1445f) {
                C1445f c1445f2 = (C1445f) interfaceC1443d;
                if (c1445f2.f6819d != abstractC1454o) {
                    j3 = Math.max(j3, m3459b(c1445f2, c1445f2.f6821f + j2));
                }
            }
        }
        if (c1445f != abstractC1454o.f6848h) {
            return j3;
        }
        long mo3431j = abstractC1454o.mo3431j();
        long j4 = j2 + mo3431j;
        return Math.max(Math.max(j3, m3459b(abstractC1454o.f6849i, j4)), j4 - r9.f6821f);
    }
}
