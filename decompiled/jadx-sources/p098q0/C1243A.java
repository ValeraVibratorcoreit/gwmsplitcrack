package p098q0;

import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0548m;
import androidx.lifecycle.InterfaceC0553r;

/* renamed from: q0.A */
/* loaded from: classes.dex */
public final class C1243A implements InterfaceC0553r {

    /* renamed from: f */
    public final /* synthetic */ int f5542f;

    /* renamed from: g */
    public final C0555t f5543g;

    public C1243A(int i) {
        this.f5542f = i;
        switch (i) {
            case 1:
                C0555t c0555t = new C0555t(this);
                this.f5543g = c0555t;
                EnumC0548m enumC0548m = EnumC0548m.f1993d;
                c0555t.m1379c("setCurrentState");
                c0555t.m1381e(enumC0548m);
                break;
            case 2:
                C0555t c0555t2 = new C0555t(this);
                this.f5543g = c0555t2;
                EnumC0548m enumC0548m2 = EnumC0548m.f1993d;
                c0555t2.m1379c("setCurrentState");
                c0555t2.m1381e(enumC0548m2);
                break;
            default:
                C0555t c0555t3 = new C0555t(this);
                this.f5543g = c0555t3;
                EnumC0548m enumC0548m3 = EnumC0548m.f1993d;
                c0555t3.m1379c("setCurrentState");
                c0555t3.m1381e(enumC0548m3);
                break;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0553r
    /* renamed from: d */
    public final C0555t mo1068d() {
        switch (this.f5542f) {
        }
        return this.f5543g;
    }
}
