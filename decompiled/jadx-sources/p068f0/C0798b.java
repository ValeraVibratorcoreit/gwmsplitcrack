package p068f0;

/* renamed from: f0.b */
/* loaded from: classes.dex */
public final class C0798b {

    /* renamed from: a */
    public long f4029a = 0;

    /* renamed from: b */
    public C0798b f4030b;

    /* renamed from: a */
    public final void m2286a(int i) {
        if (i < 64) {
            this.f4029a &= ~(1 << i);
            return;
        }
        C0798b c0798b = this.f4030b;
        if (c0798b != null) {
            c0798b.m2286a(i - 64);
        }
    }

    /* renamed from: b */
    public final int m2287b(int i) {
        C0798b c0798b = this.f4030b;
        if (c0798b == null) {
            return i >= 64 ? Long.bitCount(this.f4029a) : Long.bitCount(this.f4029a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f4029a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f4029a) + c0798b.m2287b(i - 64);
    }

    /* renamed from: c */
    public final void m2288c() {
        if (this.f4030b == null) {
            this.f4030b = new C0798b();
        }
    }

    /* renamed from: d */
    public final boolean m2289d(int i) {
        if (i < 64) {
            return (this.f4029a & (1 << i)) != 0;
        }
        m2288c();
        return this.f4030b.m2289d(i - 64);
    }

    /* renamed from: e */
    public final void m2290e(int i, boolean z2) {
        if (i >= 64) {
            m2288c();
            this.f4030b.m2290e(i - 64, z2);
            return;
        }
        long j2 = this.f4029a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f4029a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            m2293h(i);
        } else {
            m2286a(i);
        }
        if (z3 || this.f4030b != null) {
            m2288c();
            this.f4030b.m2290e(0, z3);
        }
    }

    /* renamed from: f */
    public final boolean m2291f(int i) {
        if (i >= 64) {
            m2288c();
            return this.f4030b.m2291f(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f4029a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f4029a = j4;
        long j5 = j2 - 1;
        this.f4029a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0798b c0798b = this.f4030b;
        if (c0798b != null) {
            if (c0798b.m2289d(0)) {
                m2293h(63);
            }
            this.f4030b.m2291f(0);
        }
        return z2;
    }

    /* renamed from: g */
    public final void m2292g() {
        this.f4029a = 0L;
        C0798b c0798b = this.f4030b;
        if (c0798b != null) {
            c0798b.m2292g();
        }
    }

    /* renamed from: h */
    public final void m2293h(int i) {
        if (i < 64) {
            this.f4029a |= 1 << i;
        } else {
            m2288c();
            this.f4030b.m2293h(i - 64);
        }
    }

    public final String toString() {
        if (this.f4030b == null) {
            return Long.toBinaryString(this.f4029a);
        }
        return this.f4030b.toString() + "xx" + Long.toBinaryString(this.f4029a);
    }
}
