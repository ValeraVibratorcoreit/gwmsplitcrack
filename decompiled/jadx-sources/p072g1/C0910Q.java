package p072g1;

import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p081k1.C1048a;

/* renamed from: g1.Q */
/* loaded from: classes.dex */
public final class C0910Q implements InterfaceC0765z {

    /* renamed from: a */
    public final /* synthetic */ Class f4480a;

    /* renamed from: b */
    public final /* synthetic */ Class f4481b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0764y f4482c;

    public C0910Q(Class cls, Class cls2, AbstractC0764y abstractC0764y) {
        this.f4480a = cls;
        this.f4481b = cls2;
        this.f4482c = abstractC0764y;
    }

    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        Class cls = this.f4480a;
        Class cls2 = c1048a.f4990a;
        if (cls2 == cls || cls2 == this.f4481b) {
            return this.f4482c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f4481b.getName() + "+" + this.f4480a.getName() + ",adapter=" + this.f4482c + "]";
    }
}
