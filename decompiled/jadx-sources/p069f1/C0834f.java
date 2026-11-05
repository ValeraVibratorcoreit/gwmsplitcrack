package p069f1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;
import p063d1.C0755p;

/* renamed from: f1.f */
/* loaded from: classes.dex */
public final class C0834f implements InterfaceC0843o {

    /* renamed from: f */
    public final /* synthetic */ int f4220f;

    /* renamed from: g */
    public final /* synthetic */ Type f4221g;

    public /* synthetic */ C0834f(Type type, int i) {
        this.f4220f = i;
        this.f4221g = type;
    }

    @Override // p069f1.InterfaceC0843o
    /* renamed from: o */
    public final Object mo902o() {
        switch (this.f4220f) {
            case 0:
                Type type = this.f4221g;
                if (!(type instanceof ParameterizedType)) {
                    throw new C0755p("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C0755p("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f4221g;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new C0755p("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new C0755p("Invalid EnumMap type: " + type3.toString());
        }
    }
}
