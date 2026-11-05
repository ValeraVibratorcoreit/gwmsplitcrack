package p046X;

import java.util.ArrayList;

/* renamed from: X.N */
/* loaded from: classes.dex */
public final class C0386N implements InterfaceC0385M {

    /* renamed from: a */
    public final int f1134a;

    /* renamed from: b */
    public final /* synthetic */ C0387O f1135b;

    public C0386N(C0387O c0387o, int i) {
        this.f1135b = c0387o;
        this.f1134a = i;
    }

    @Override // p046X.InterfaceC0385M
    /* renamed from: a */
    public final boolean mo982a(ArrayList arrayList, ArrayList arrayList2) {
        C0387O c0387o = this.f1135b;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0387o.f1171w;
        int i = this.f1134a;
        if (abstractComponentCallbacksC0423v == null || i >= 0 || !abstractComponentCallbacksC0423v.m1125h().m999P(-1, 0)) {
            return c0387o.m1000Q(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
