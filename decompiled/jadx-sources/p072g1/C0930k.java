package p072g1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.EnumC0763x;
import p063d1.InterfaceC0765z;
import p081k1.C1048a;

/* renamed from: g1.k */
/* loaded from: classes.dex */
public final class C0930k implements InterfaceC0765z {

    /* renamed from: a */
    public final /* synthetic */ int f4531a;

    /* renamed from: b */
    public final /* synthetic */ Object f4532b;

    public /* synthetic */ C0930k(int i, Object obj) {
        this.f4531a = i;
        this.f4532b = obj;
    }

    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        switch (this.f4531a) {
            case 0:
                if (c1048a.f4990a == Number.class) {
                    return (C0931l) this.f4532b;
                }
                return null;
            case 1:
                if (c1048a.f4990a == Object.class) {
                    return new C0931l(c0752m, (EnumC0763x) this.f4532b);
                }
                return null;
            default:
                Class cls = c1048a.f4990a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C0904K) this.f4532b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f4531a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C0904K) this.f4532b) + "]";
            default:
                return super.toString();
        }
    }
}
