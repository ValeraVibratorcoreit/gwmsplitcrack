package p010D1;

/* renamed from: D1.h */
/* loaded from: classes.dex */
public final class C0084h implements InterfaceC0090n {

    /* renamed from: a */
    public final InterfaceC0079c f250a;

    /* renamed from: b */
    public final C0077a f251b;

    /* renamed from: c */
    public C0087k f252c;

    /* renamed from: d */
    public int f253d;

    /* renamed from: e */
    public boolean f254e;

    /* renamed from: f */
    public long f255f;

    public C0084h(InterfaceC0079c interfaceC0079c) {
        this.f250a = interfaceC0079c;
        C0077a mo217a = interfaceC0079c.mo217a();
        this.f251b = mo217a;
        C0087k c0087k = mo217a.f239a;
        this.f252c = c0087k;
        this.f253d = c0087k != null ? c0087k.f261b : -1;
    }

    @Override // p010D1.InterfaceC0090n
    /* renamed from: b */
    public final long mo218b(C0077a c0077a, long j2) {
        C0087k c0087k;
        C0087k c0087k2;
        if (this.f254e) {
            throw new IllegalStateException("closed");
        }
        C0087k c0087k3 = this.f252c;
        C0077a c0077a2 = this.f251b;
        if (c0087k3 != null && (c0087k3 != (c0087k2 = c0077a2.f239a) || this.f253d != c0087k2.f261b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (!this.f250a.mo219c(this.f255f + 1)) {
            return -1L;
        }
        if (this.f252c == null && (c0087k = c0077a2.f239a) != null) {
            this.f252c = c0087k;
            this.f253d = c0087k.f261b;
        }
        long min = Math.min(8192L, c0077a2.f240b - this.f255f);
        long j3 = this.f255f;
        AbstractC0091o.m324a(c0077a2.f240b, j3, min);
        if (min != 0) {
            c0077a.f240b += min;
            C0087k c0087k4 = c0077a2.f239a;
            while (true) {
                long j4 = c0087k4.f262c - c0087k4.f261b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                c0087k4 = c0087k4.f265f;
            }
            long j5 = min;
            while (j5 > 0) {
                C0087k m252c = c0087k4.m252c();
                int i = (int) (m252c.f261b + j3);
                m252c.f261b = i;
                m252c.f262c = Math.min(i + ((int) j5), m252c.f262c);
                C0087k c0087k5 = c0077a.f239a;
                if (c0087k5 == null) {
                    m252c.f266g = m252c;
                    m252c.f265f = m252c;
                    c0077a.f239a = m252c;
                } else {
                    c0087k5.f266g.m251b(m252c);
                }
                j5 -= m252c.f262c - m252c.f261b;
                c0087k4 = c0087k4.f265f;
                j3 = 0;
            }
        }
        this.f255f += min;
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f254e = true;
    }
}
