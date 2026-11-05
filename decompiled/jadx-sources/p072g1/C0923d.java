package p072g1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p003B.C0043j;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p069f1.AbstractC0832d;
import p081k1.C1048a;

/* renamed from: g1.d */
/* loaded from: classes.dex */
public final class C0923d implements InterfaceC0765z {

    /* renamed from: a */
    public final /* synthetic */ int f4518a;

    /* renamed from: b */
    public final C0043j f4519b;

    public /* synthetic */ C0923d(C0043j c0043j, int i) {
        this.f4518a = i;
        this.f4519b = c0043j;
    }

    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        Class cls;
        Type[] actualTypeArguments;
        C0043j c0043j = this.f4519b;
        cls = Object.class;
        switch (this.f4518a) {
            case 0:
                Class cls2 = c1048a.f4990a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = c1048a.f4991b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                AbstractC0832d.m2351b(Collection.class.isAssignableFrom(cls2));
                Type m2359j = AbstractC0832d.m2359j(type, cls2, AbstractC0832d.m2356g(type, cls2, Collection.class), new HashMap());
                cls = m2359j instanceof ParameterizedType ? ((ParameterizedType) m2359j).getActualTypeArguments()[0] : Object.class;
                return new C0922c(c0752m, cls, c0752m.m2198b(new C1048a(cls)), c0043j.m95z(c1048a));
            default:
                Class cls3 = c1048a.f4990a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = c1048a.f4991b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    AbstractC0832d.m2351b(Map.class.isAssignableFrom(cls3));
                    Type m2359j2 = AbstractC0832d.m2359j(type2, cls3, AbstractC0832d.m2356g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = m2359j2 instanceof ParameterizedType ? ((ParameterizedType) m2359j2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                return new C0929j(this, c0752m, actualTypeArguments[0], (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC0920a0.f4488c : c0752m.m2198b(new C1048a(type3)), actualTypeArguments[1], c0752m.m2198b(new C1048a(actualTypeArguments[1])), c0043j.m95z(c1048a));
        }
    }
}
