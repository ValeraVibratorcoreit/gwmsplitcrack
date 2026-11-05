package p072g1;

import java.util.concurrent.ConcurrentHashMap;
import p003B.C0043j;
import p063d1.AbstractC0764y;
import p063d1.C0750k;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p066e1.InterfaceC0768a;
import p069f1.AbstractC0832d;
import p081k1.C1048a;

/* renamed from: g1.i */
/* loaded from: classes.dex */
public final class C0928i implements InterfaceC0765z {

    /* renamed from: c */
    public static final C0927h f4524c = new C0927h(0);

    /* renamed from: a */
    public final C0043j f4525a;

    /* renamed from: b */
    public final ConcurrentHashMap f4526b = new ConcurrentHashMap();

    static {
        new C0927h(0);
    }

    public C0928i(C0043j c0043j) {
        this.f4525a = c0043j;
    }

    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        InterfaceC0768a interfaceC0768a = (InterfaceC0768a) c1048a.f4990a.getAnnotation(InterfaceC0768a.class);
        if (interfaceC0768a == null) {
            return null;
        }
        return m2472b(this.f4525a, c0752m, c1048a, interfaceC0768a, true);
    }

    /* renamed from: b */
    public final AbstractC0764y m2472b(C0043j c0043j, C0752m c0752m, C1048a c1048a, InterfaceC0768a interfaceC0768a, boolean z2) {
        AbstractC0764y mo2205a;
        InterfaceC0765z interfaceC0765z;
        Object mo902o = c0043j.m95z(new C1048a(interfaceC0768a.value())).mo902o();
        boolean nullSafe = interfaceC0768a.nullSafe();
        if (mo902o instanceof AbstractC0764y) {
            mo2205a = (AbstractC0764y) mo902o;
        } else {
            if (!(mo902o instanceof InterfaceC0765z)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo902o.getClass().getName() + " as a @JsonAdapter for " + AbstractC0832d.m2360k(c1048a.f4991b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC0765z interfaceC0765z2 = (InterfaceC0765z) mo902o;
            if (z2 && (interfaceC0765z = (InterfaceC0765z) this.f4526b.putIfAbsent(c1048a.f4990a, interfaceC0765z2)) != null) {
                interfaceC0765z2 = interfaceC0765z;
            }
            mo2205a = interfaceC0765z2.mo2205a(c0752m, c1048a);
        }
        return (mo2205a == null || !nullSafe) ? mo2205a : new C0750k(mo2205a, 2);
    }
}
