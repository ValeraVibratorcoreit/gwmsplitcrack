package p109u0;

/* renamed from: u0.d1 */
/* loaded from: classes.dex */
public final class C1530d1 {

    /* renamed from: a */
    public final int f8180a;

    /* renamed from: b */
    public final int f8181b;

    /* renamed from: c */
    public final int f8182c;

    /* renamed from: d */
    public final int f8183d;

    /* renamed from: e */
    public final int f8184e;

    /* renamed from: f */
    public final int f8185f;

    public C1530d1(int i, int i2, int i3, int i4, int i5) {
        this.f8180a = i;
        this.f8181b = i2;
        this.f8182c = i3;
        this.f8183d = i4;
        this.f8184e = AbstractC1561o.m4298b(i4, i, i3, 1);
        this.f8185f = Math.max(1, i5 - i2);
    }

    /* renamed from: a */
    public final int m4168a(int i, String str) {
        boolean m4300a = C1563o1.m4300a(str);
        int i2 = this.f8184e;
        if (!m4300a) {
            if (C1563o1.m4301b(str)) {
                i2 /= 2;
            }
            return i - this.f8180a;
        }
        i -= i2;
        return i - this.f8180a;
    }

    /* renamed from: b */
    public final int m4169b(int i, String str) {
        boolean m4302c = C1563o1.m4302c(str);
        int i2 = this.f8181b;
        return m4302c ? (i - (this.f8185f / 2)) - i2 : i - i2;
    }
}
