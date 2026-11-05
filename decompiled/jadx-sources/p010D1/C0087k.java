package p010D1;

/* renamed from: D1.k */
/* loaded from: classes.dex */
public final class C0087k {

    /* renamed from: a */
    public final byte[] f260a;

    /* renamed from: b */
    public int f261b;

    /* renamed from: c */
    public int f262c;

    /* renamed from: d */
    public boolean f263d;

    /* renamed from: e */
    public final boolean f264e;

    /* renamed from: f */
    public C0087k f265f;

    /* renamed from: g */
    public C0087k f266g;

    public C0087k() {
        this.f260a = new byte[8192];
        this.f264e = true;
        this.f263d = false;
    }

    /* renamed from: a */
    public final C0087k m250a() {
        C0087k c0087k = this.f265f;
        C0087k c0087k2 = c0087k != this ? c0087k : null;
        C0087k c0087k3 = this.f266g;
        c0087k3.f265f = c0087k;
        this.f265f.f266g = c0087k3;
        this.f265f = null;
        this.f266g = null;
        return c0087k2;
    }

    /* renamed from: b */
    public final void m251b(C0087k c0087k) {
        c0087k.f266g = this;
        c0087k.f265f = this.f265f;
        this.f265f.f266g = c0087k;
        this.f265f = c0087k;
    }

    /* renamed from: c */
    public final C0087k m252c() {
        this.f263d = true;
        return new C0087k(this.f260a, this.f261b, this.f262c);
    }

    /* renamed from: d */
    public final void m253d(C0087k c0087k, int i) {
        if (!c0087k.f264e) {
            throw new IllegalArgumentException();
        }
        int i2 = c0087k.f262c;
        int i3 = i2 + i;
        byte[] bArr = c0087k.f260a;
        if (i3 > 8192) {
            if (c0087k.f263d) {
                throw new IllegalArgumentException();
            }
            int i4 = c0087k.f261b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c0087k.f262c -= c0087k.f261b;
            c0087k.f261b = 0;
        }
        System.arraycopy(this.f260a, this.f261b, bArr, c0087k.f262c, i);
        c0087k.f262c += i;
        this.f261b += i;
    }

    public C0087k(byte[] bArr, int i, int i2) {
        this.f260a = bArr;
        this.f261b = i;
        this.f262c = i2;
        this.f263d = true;
        this.f264e = false;
    }
}
