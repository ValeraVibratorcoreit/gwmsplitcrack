package p101r0;

import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import p051Z0.C0448f;
import p051Z0.InterfaceC0445c;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public final class C1379a implements InterfaceC0445c {

    /* renamed from: a */
    public final /* synthetic */ int f6464a;

    /* renamed from: b */
    public final /* synthetic */ int f6465b;

    /* renamed from: c */
    public final /* synthetic */ CFG4 f6466c;

    public C1379a(CFG4 cfg4, int i, int i2) {
        this.f6466c = cfg4;
        this.f6464a = i;
        this.f6465b = i2;
    }

    @Override // p051Z0.InterfaceC0444b
    /* renamed from: a */
    public final void mo1145a(C0448f c0448f) {
        cfgData cfgdata = CFG4.f2728F;
        this.f6466c.getClass();
        CFG4.m1800u(c0448f, false, this.f6464a, this.f6465b);
    }

    @Override // p051Z0.InterfaceC0444b
    /* renamed from: b */
    public final void mo1146b(C0448f c0448f) {
        cfgData cfgdata = CFG4.f2728F;
        this.f6466c.getClass();
        CFG4.m1800u(c0448f, true, this.f6464a, this.f6465b);
    }
}
