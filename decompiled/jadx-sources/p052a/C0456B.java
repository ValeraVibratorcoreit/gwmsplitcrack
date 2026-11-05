package p052a;

import java.io.Serializable;
import p087m1.C1169d;
import p087m1.InterfaceC1166a;
import p104s1.InterfaceC1417a;
import p107t1.AbstractC1464g;
import p107t1.C1463f;
import p107t1.InterfaceC1458a;
import p107t1.InterfaceC1460c;

/* renamed from: a.B */
/* loaded from: classes.dex */
public final /* synthetic */ class C0456B implements InterfaceC1417a, InterfaceC1460c, Serializable, InterfaceC1166a {

    /* renamed from: a */
    public transient C0456B f1458a;

    /* renamed from: b */
    public final Object f1459b;

    /* renamed from: c */
    public final boolean f1460c = false;

    /* renamed from: d */
    public final int f1461d = 0;

    /* renamed from: e */
    public final /* synthetic */ int f1462e;

    public C0456B(int i, Object obj) {
        this.f1462e = i;
        this.f1459b = obj;
    }

    @Override // p104s1.InterfaceC1417a
    /* renamed from: a */
    public final Object mo1164a() {
        switch (this.f1462e) {
            case 0:
                ((C0457C) this.f1459b).m1170d();
                break;
            default:
                ((C0457C) this.f1459b).m1170d();
                break;
        }
        return C1169d.f5345c;
    }

    @Override // p107t1.InterfaceC1460c
    /* renamed from: b */
    public final int mo1165b() {
        return 0;
    }

    /* renamed from: d */
    public final InterfaceC1458a m1166d() {
        if (!this.f1460c) {
            return AbstractC1464g.m3498a(C0457C.class);
        }
        AbstractC1464g.f7163a.getClass();
        return new C1463f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0456B) {
            C0456B c0456b = (C0456B) obj;
            c0456b.getClass();
            return this.f1461d == c0456b.f1461d && this.f1459b.equals(c0456b.f1459b) && m1166d().equals(c0456b.m1166d());
        }
        if (!(obj instanceof C0456B)) {
            return false;
        }
        C0456B c0456b2 = this.f1458a;
        if (c0456b2 == null) {
            AbstractC1464g.f7163a.getClass();
            this.f1458a = this;
            c0456b2 = this;
        }
        return obj.equals(c0456b2);
    }

    public final int hashCode() {
        m1166d();
        return (((m1166d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        C0456B c0456b = this.f1458a;
        if (c0456b == null) {
            AbstractC1464g.f7163a.getClass();
            this.f1458a = this;
            c0456b = this;
        }
        return c0456b != this ? c0456b.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
