package p016H;

import java.util.ArrayList;
import p003B.C0043j;
import p020J.InterfaceC0143a;
import p091o.C1201k;

/* renamed from: H.f */
/* loaded from: classes.dex */
public final class C0114f implements InterfaceC0143a {

    /* renamed from: a */
    public final /* synthetic */ int f360a;

    /* renamed from: b */
    public final /* synthetic */ Object f361b;

    public /* synthetic */ C0114f(int i, Object obj) {
        this.f360a = i;
        this.f361b = obj;
    }

    @Override // p020J.InterfaceC0143a
    public final void accept(Object obj) {
        switch (this.f360a) {
            case 0:
                C0115g c0115g = (C0115g) obj;
                if (c0115g == null) {
                    c0115g = new C0115g(-3);
                }
                ((C0043j) this.f361b).m70H(c0115g);
                return;
            default:
                C0115g c0115g2 = (C0115g) obj;
                synchronized (AbstractC0116h.f366c) {
                    try {
                        C1201k c1201k = AbstractC0116h.f367d;
                        ArrayList arrayList = (ArrayList) c1201k.getOrDefault((String) this.f361b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c1201k.remove((String) this.f361b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0143a) arrayList.get(i)).accept(c0115g2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
