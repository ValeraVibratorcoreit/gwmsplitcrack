package p072g1;

import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p081k1.C1048a;

/* renamed from: g1.N */
/* loaded from: classes.dex */
public class C0907N implements InterfaceC0765z {
    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        Class cls = c1048a.f4990a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new C0929j(cls);
    }
}
