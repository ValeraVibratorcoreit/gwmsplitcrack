package p052a;

import java.util.ListIterator;
import p046X.C0379G;
import p087m1.C1169d;
import p090n1.C1177a;
import p104s1.InterfaceC1428l;
import p107t1.AbstractC1461d;
import p107t1.AbstractC1462e;

/* renamed from: a.t */
/* loaded from: classes.dex */
public final class C0480t extends AbstractC1462e implements InterfaceC1428l {

    /* renamed from: b */
    public final /* synthetic */ int f1527b;

    /* renamed from: c */
    public final /* synthetic */ C0457C f1528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0480t(C0457C c0457c, int i) {
        super(1);
        this.f1527b = i;
        this.f1528c = c0457c;
    }

    @Override // p104s1.InterfaceC1428l
    /* renamed from: c */
    public final Object mo1171c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1527b) {
            case 0:
                AbstractC1461d.m3494e("backEvent", (C0462b) obj);
                C0457C c0457c = this.f1528c;
                C1177a c1177a = c0457c.f1464b;
                ListIterator listIterator = c1177a.listIterator(c1177a.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((C0379G) obj2).f1123a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                C0379G c0379g = (C0379G) obj2;
                if (c0457c.f1465c != null) {
                    c0457c.m1167a();
                }
                c0457c.f1465c = c0379g;
                break;
            default:
                AbstractC1461d.m3494e("backEvent", (C0462b) obj);
                C0457C c0457c2 = this.f1528c;
                if (c0457c2.f1465c == null) {
                    C1177a c1177a2 = c0457c2.f1464b;
                    ListIterator listIterator2 = c1177a2.listIterator(c1177a2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((C0379G) obj3).f1123a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return C1169d.f5345c;
    }
}
