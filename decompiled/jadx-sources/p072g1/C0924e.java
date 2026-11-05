package p072g1;

import java.util.Date;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p081k1.C1048a;

/* renamed from: g1.e */
/* loaded from: classes.dex */
public class C0924e implements InterfaceC0765z {
    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        if (c1048a.f4990a == Date.class) {
            return new C0926g();
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
