package p072g1;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p069f1.AbstractC0832d;
import p081k1.C1048a;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public class C0919a implements InterfaceC0765z {
    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        Type type = c1048a.f4991b;
        boolean z2 = type instanceof GenericArrayType;
        if (!z2 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z2 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C0921b(c0752m, c0752m.m2198b(new C1048a(genericComponentType)), AbstractC0832d.m2357h(genericComponentType));
    }
}
