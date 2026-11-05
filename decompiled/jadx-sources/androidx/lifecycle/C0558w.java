package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public final class C0558w extends AbstractC0559x implements InterfaceC0551p {

    /* renamed from: e */
    public final InterfaceC0553r f2010e;

    /* renamed from: f */
    public final /* synthetic */ C0560y f2011f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558w(C0560y c0560y, InterfaceC0553r interfaceC0553r, InterfaceC0561z interfaceC0561z) {
        super(c0560y, interfaceC0561z);
        this.f2011f = c0560y;
        this.f2010e = interfaceC0553r;
    }

    @Override // androidx.lifecycle.AbstractC0559x
    /* renamed from: b */
    public final void mo1389b() {
        this.f2010e.mo1068d().m1382f(this);
    }

    @Override // androidx.lifecycle.AbstractC0559x
    /* renamed from: c */
    public final boolean mo1390c(InterfaceC0553r interfaceC0553r) {
        return this.f2010e == interfaceC0553r;
    }

    @Override // androidx.lifecycle.InterfaceC0551p
    /* renamed from: d */
    public final void mo1177d(InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l) {
        InterfaceC0553r interfaceC0553r2 = this.f2010e;
        EnumC0548m enumC0548m = interfaceC0553r2.mo1068d().f2001c;
        if (enumC0548m == EnumC0548m.f1990a) {
            this.f2011f.m1399h(this.f2012a);
            return;
        }
        EnumC0548m enumC0548m2 = null;
        while (enumC0548m2 != enumC0548m) {
            m1391a(mo1388e());
            enumC0548m2 = enumC0548m;
            enumC0548m = interfaceC0553r2.mo1068d().f2001c;
        }
    }

    @Override // androidx.lifecycle.AbstractC0559x
    /* renamed from: e */
    public final boolean mo1388e() {
        return this.f2010e.mo1068d().f2001c.compareTo(EnumC0548m.f1993d) >= 0;
    }
}
