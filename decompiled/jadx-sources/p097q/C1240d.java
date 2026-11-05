package p097q;

import java.util.Arrays;
import p003B.C0043j;
import p034Q0.C0295l;

/* renamed from: q.d */
/* loaded from: classes.dex */
public final class C1240d extends C1238b {

    /* renamed from: f */
    public C1242f[] f5525f;

    /* renamed from: g */
    public C1242f[] f5526g;

    /* renamed from: h */
    public int f5527h;

    /* renamed from: i */
    public C0043j f5528i;

    @Override // p097q.C1238b
    /* renamed from: d */
    public final C1242f mo2914d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f5527h; i2++) {
            C1242f[] c1242fArr = this.f5525f;
            C1242f c1242f = c1242fArr[i2];
            if (!zArr[c1242f.f5531b]) {
                C0043j c0043j = this.f5528i;
                c0043j.f141g = c1242f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C1242f) c0043j.f141g).f5537h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C1242f c1242f2 = c1242fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c1242f2.f5537h[i3];
                            float f4 = ((C1242f) c0043j.f141g).f5537h[i3];
                            if (f4 == f3) {
                                i3--;
                            } else if (f4 >= f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f5525f[i];
    }

    @Override // p097q.C1238b
    /* renamed from: e */
    public final boolean mo2915e() {
        return this.f5527h == 0;
    }

    @Override // p097q.C1238b
    /* renamed from: i */
    public final void mo2919i(C1239c c1239c, C1238b c1238b, boolean z2) {
        C1242f c1242f = c1238b.f5503a;
        if (c1242f == null) {
            return;
        }
        C1237a c1237a = c1238b.f5506d;
        int m2906d = c1237a.m2906d();
        for (int i = 0; i < m2906d; i++) {
            C1242f m2907e = c1237a.m2907e(i);
            float m2908f = c1237a.m2908f(i);
            C0043j c0043j = this.f5528i;
            c0043j.f141g = m2907e;
            boolean z3 = m2907e.f5530a;
            float[] fArr = c1242f.f5537h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C1242f) c0043j.f141g).f5537h;
                    float f2 = (fArr[i2] * m2908f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((C1242f) c0043j.f141g).f5537h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C1240d) c0043j.f142h).m2941k((C1242f) c0043j.f141g);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * m2908f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((C1242f) c0043j.f141g).f5537h[i3] = f4;
                    } else {
                        ((C1242f) c0043j.f141g).f5537h[i3] = 0.0f;
                    }
                }
                m2940j(m2907e);
            }
            this.f5504b = (c1238b.f5504b * m2908f) + this.f5504b;
        }
        m2941k(c1242f);
    }

    /* renamed from: j */
    public final void m2940j(C1242f c1242f) {
        int i;
        int i2 = this.f5527h + 1;
        C1242f[] c1242fArr = this.f5525f;
        if (i2 > c1242fArr.length) {
            C1242f[] c1242fArr2 = (C1242f[]) Arrays.copyOf(c1242fArr, c1242fArr.length * 2);
            this.f5525f = c1242fArr2;
            this.f5526g = (C1242f[]) Arrays.copyOf(c1242fArr2, c1242fArr2.length * 2);
        }
        C1242f[] c1242fArr3 = this.f5525f;
        int i3 = this.f5527h;
        c1242fArr3[i3] = c1242f;
        int i4 = i3 + 1;
        this.f5527h = i4;
        if (i4 > 1 && c1242fArr3[i3].f5531b > c1242f.f5531b) {
            int i5 = 0;
            while (true) {
                i = this.f5527h;
                if (i5 >= i) {
                    break;
                }
                this.f5526g[i5] = this.f5525f[i5];
                i5++;
            }
            Arrays.sort(this.f5526g, 0, i, new C0295l(5));
            for (int i6 = 0; i6 < this.f5527h; i6++) {
                this.f5525f[i6] = this.f5526g[i6];
            }
        }
        c1242f.f5530a = true;
        c1242f.m2945a(this);
    }

    /* renamed from: k */
    public final void m2941k(C1242f c1242f) {
        int i = 0;
        while (i < this.f5527h) {
            if (this.f5525f[i] == c1242f) {
                while (true) {
                    int i2 = this.f5527h;
                    if (i >= i2 - 1) {
                        this.f5527h = i2 - 1;
                        c1242f.f5530a = false;
                        return;
                    } else {
                        C1242f[] c1242fArr = this.f5525f;
                        int i3 = i + 1;
                        c1242fArr[i] = c1242fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p097q.C1238b
    public final String toString() {
        String str = " goal -> (" + this.f5504b + ") : ";
        for (int i = 0; i < this.f5527h; i++) {
            C1242f c1242f = this.f5525f[i];
            C0043j c0043j = this.f5528i;
            c0043j.f141g = c1242f;
            str = str + c0043j + " ";
        }
        return str;
    }
}
