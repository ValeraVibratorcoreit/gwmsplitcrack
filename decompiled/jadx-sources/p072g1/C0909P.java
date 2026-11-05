package p072g1;

import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p081k1.C1048a;

/* renamed from: g1.P */
/* loaded from: classes.dex */
public final class C0909P implements InterfaceC0765z {

    /* renamed from: a */
    public final /* synthetic */ int f4477a;

    /* renamed from: b */
    public final /* synthetic */ Class f4478b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0764y f4479c;

    public /* synthetic */ C0909P(Class cls, AbstractC0764y abstractC0764y, int i) {
        this.f4477a = i;
        this.f4478b = cls;
        this.f4479c = abstractC0764y;
    }

    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        switch (this.f4477a) {
            case 0:
                if (c1048a.f4990a == this.f4478b) {
                    return this.f4479c;
                }
                return null;
            default:
                Class cls = this.f4478b;
                Class<?> cls2 = c1048a.f4990a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0922c(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f4477a) {
            case 0:
                return "Factory[type=" + this.f4478b.getName() + ",adapter=" + this.f4479c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f4478b.getName() + ",adapter=" + this.f4479c + "]";
        }
    }
}
