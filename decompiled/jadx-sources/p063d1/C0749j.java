package p063d1;

import p084l1.C1158a;

/* renamed from: d1.j */
/* loaded from: classes.dex */
public final class C0749j extends AbstractC0764y {

    /* renamed from: a */
    public final /* synthetic */ int f3874a;

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        switch (this.f3874a) {
            case 0:
                if (c1158a.m2788C() != 9) {
                    return Double.valueOf(c1158a.m2809t());
                }
                c1158a.m2814y();
                return null;
            case 1:
                if (c1158a.m2788C() != 9) {
                    return Float.valueOf((float) c1158a.m2809t());
                }
                c1158a.m2814y();
                return null;
            default:
                c1158a.m2794I();
                return null;
        }
    }

    public String toString() {
        switch (this.f3874a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
