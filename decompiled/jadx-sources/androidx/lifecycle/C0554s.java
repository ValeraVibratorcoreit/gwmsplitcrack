package androidx.lifecycle;

import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public final class C0554s {

    /* renamed from: a */
    public EnumC0548m f1997a;

    /* renamed from: b */
    public InterfaceC0551p f1998b;

    /* renamed from: a */
    public final void m1376a(InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l) {
        EnumC0548m m1375a = enumC0547l.m1375a();
        EnumC0548m enumC0548m = this.f1997a;
        AbstractC1461d.m3494e("state1", enumC0548m);
        if (m1375a.compareTo(enumC0548m) < 0) {
            enumC0548m = m1375a;
        }
        this.f1997a = enumC0548m;
        this.f1998b.mo1177d(interfaceC0553r, enumC0547l);
        this.f1997a = m1375a;
    }
}
