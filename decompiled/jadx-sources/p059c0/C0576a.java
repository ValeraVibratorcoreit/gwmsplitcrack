package p059c0;

import androidx.lifecycle.AbstractC0532O;
import p046X.C0389Q;
import p091o.C1202l;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public class C0576a extends AbstractC0532O {

    /* renamed from: c */
    public static final C0389Q f2191c = new C0389Q(1);

    /* renamed from: b */
    public final C1202l f2192b = new C1202l();

    @Override // androidx.lifecycle.AbstractC0532O
    /* renamed from: b */
    public final void mo1040b() {
        C1202l c1202l = this.f2192b;
        int i = c1202l.f5422c;
        if (i > 0) {
            c1202l.f5421b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = c1202l.f5421b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c1202l.f5422c = 0;
    }
}
