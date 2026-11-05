package p038T;

import java.nio.ByteBuffer;
import p040U.C0336a;

/* renamed from: T.p */
/* loaded from: classes.dex */
public final class C0322p {

    /* renamed from: a */
    public int f906a = 1;

    /* renamed from: b */
    public final C0325s f907b;

    /* renamed from: c */
    public C0325s f908c;

    /* renamed from: d */
    public C0325s f909d;

    /* renamed from: e */
    public int f910e;

    /* renamed from: f */
    public int f911f;

    public C0322p(C0325s c0325s) {
        this.f907b = c0325s;
        this.f908c = c0325s;
    }

    /* renamed from: a */
    public final void m903a() {
        this.f906a = 1;
        this.f908c = this.f907b;
        this.f911f = 0;
    }

    /* renamed from: b */
    public final boolean m904b() {
        C0336a m928c = this.f908c.f922b.m928c();
        int m415a = m928c.m415a(6);
        return !(m415a == 0 || ((ByteBuffer) m928c.f470d).get(m415a + m928c.f467a) == 0) || this.f910e == 65039;
    }
}
