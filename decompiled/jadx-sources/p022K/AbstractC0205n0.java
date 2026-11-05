package p022K;

import p006C.C0058f;
import p121y0.AbstractC1687o;

/* renamed from: K.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC0205n0 {

    /* renamed from: a */
    public final C0221v0 f548a;

    /* renamed from: b */
    public C0058f[] f549b;

    public AbstractC0205n0() {
        this(new C0221v0());
    }

    /* renamed from: a */
    public final void m647a() {
        C0058f[] c0058fArr = this.f549b;
        if (c0058fArr != null) {
            C0058f c0058f = c0058fArr[0];
            C0058f c0058f2 = c0058fArr[1];
            C0221v0 c0221v0 = this.f548a;
            if (c0058f2 == null) {
                c0058f2 = c0221v0.f573a.mo654f(2);
            }
            if (c0058f == null) {
                c0058f = c0221v0.f573a.mo654f(1);
            }
            mo616g(C0058f.m139a(c0058f, c0058f2));
            C0058f c0058f3 = this.f549b[AbstractC1687o.m4950w(16)];
            if (c0058f3 != null) {
                mo631f(c0058f3);
            }
            C0058f c0058f4 = this.f549b[AbstractC1687o.m4950w(32)];
            if (c0058f4 != null) {
                mo630d(c0058f4);
            }
            C0058f c0058f5 = this.f549b[AbstractC1687o.m4950w(64)];
            if (c0058f5 != null) {
                mo632h(c0058f5);
            }
        }
    }

    /* renamed from: b */
    public abstract C0221v0 mo614b();

    /* renamed from: c */
    public void mo641c(int i, C0058f c0058f) {
        if (this.f549b == null) {
            this.f549b = new C0058f[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f549b[AbstractC1687o.m4950w(i2)] = c0058f;
            }
        }
    }

    /* renamed from: d */
    public void mo630d(C0058f c0058f) {
    }

    /* renamed from: e */
    public abstract void mo615e(C0058f c0058f);

    /* renamed from: f */
    public void mo631f(C0058f c0058f) {
    }

    /* renamed from: g */
    public abstract void mo616g(C0058f c0058f);

    /* renamed from: h */
    public void mo632h(C0058f c0058f) {
    }

    public AbstractC0205n0(C0221v0 c0221v0) {
        this.f548a = c0221v0;
    }
}
