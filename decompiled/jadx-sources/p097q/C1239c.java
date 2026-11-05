package p097q;

import java.util.ArrayList;
import java.util.Arrays;
import p003B.C0043j;
import p020J.C0145c;
import p022K.C0198k;
import p102s.C1405c;

/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C1239c {

    /* renamed from: p */
    public static boolean f5508p = false;

    /* renamed from: q */
    public static int f5509q = 1000;

    /* renamed from: c */
    public final C1240d f5512c;

    /* renamed from: f */
    public C1238b[] f5515f;

    /* renamed from: l */
    public final C0198k f5521l;

    /* renamed from: o */
    public C1238b f5524o;

    /* renamed from: a */
    public boolean f5510a = false;

    /* renamed from: b */
    public int f5511b = 0;

    /* renamed from: d */
    public int f5513d = 32;

    /* renamed from: e */
    public int f5514e = 32;

    /* renamed from: g */
    public boolean f5516g = false;

    /* renamed from: h */
    public boolean[] f5517h = new boolean[32];

    /* renamed from: i */
    public int f5518i = 1;

    /* renamed from: j */
    public int f5519j = 0;

    /* renamed from: k */
    public int f5520k = 32;

    /* renamed from: m */
    public C1242f[] f5522m = new C1242f[f5509q];

    /* renamed from: n */
    public int f5523n = 0;

    public C1239c() {
        this.f5515f = null;
        this.f5515f = new C1238b[32];
        m2938s();
        C0198k c0198k = new C0198k(7);
        c0198k.f533b = new C0145c();
        c0198k.f534c = new C0145c();
        c0198k.f535d = new C1242f[32];
        this.f5521l = c0198k;
        C1240d c1240d = new C1240d(c0198k);
        c1240d.f5525f = new C1242f[128];
        c1240d.f5526g = new C1242f[128];
        c1240d.f5527h = 0;
        c1240d.f5528i = new C0043j(c1240d);
        this.f5512c = c1240d;
        this.f5524o = new C1238b(c0198k);
    }

    /* renamed from: n */
    public static int m2920n(Object obj) {
        C1242f c1242f = ((C1405c) obj).f6627i;
        if (c1242f != null) {
            return (int) (c1242f.f5534e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: a */
    public final C1242f m2921a(int i) {
        C0145c c0145c = (C0145c) this.f5521l.f534c;
        int i2 = c0145c.f452b;
        C1242f c1242f = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = c0145c.f451a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            c0145c.f452b = i3;
            c1242f = r4;
        }
        C1242f c1242f2 = c1242f;
        if (c1242f2 == null) {
            c1242f2 = new C1242f(i);
            c1242f2.f5541l = i;
        } else {
            c1242f2.m2947c();
            c1242f2.f5541l = i;
        }
        int i4 = this.f5523n;
        int i5 = f5509q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f5509q = i6;
            this.f5522m = (C1242f[]) Arrays.copyOf(this.f5522m, i6);
        }
        C1242f[] c1242fArr = this.f5522m;
        int i7 = this.f5523n;
        this.f5523n = i7 + 1;
        c1242fArr[i7] = c1242f2;
        return c1242f2;
    }

    /* renamed from: b */
    public final void m2922b(C1242f c1242f, C1242f c1242f2, int i, float f2, C1242f c1242f3, C1242f c1242f4, int i2, int i3) {
        C1238b m2932l = m2932l();
        if (c1242f2 == c1242f3) {
            m2932l.f5506d.m2909g(c1242f, 1.0f);
            m2932l.f5506d.m2909g(c1242f4, 1.0f);
            m2932l.f5506d.m2909g(c1242f2, -2.0f);
        } else if (f2 == 0.5f) {
            m2932l.f5506d.m2909g(c1242f, 1.0f);
            m2932l.f5506d.m2909g(c1242f2, -1.0f);
            m2932l.f5506d.m2909g(c1242f3, -1.0f);
            m2932l.f5506d.m2909g(c1242f4, 1.0f);
            if (i > 0 || i2 > 0) {
                m2932l.f5504b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            m2932l.f5506d.m2909g(c1242f, -1.0f);
            m2932l.f5506d.m2909g(c1242f2, 1.0f);
            m2932l.f5504b = i;
        } else if (f2 >= 1.0f) {
            m2932l.f5506d.m2909g(c1242f4, -1.0f);
            m2932l.f5506d.m2909g(c1242f3, 1.0f);
            m2932l.f5504b = -i2;
        } else {
            float f3 = 1.0f - f2;
            m2932l.f5506d.m2909g(c1242f, f3 * 1.0f);
            m2932l.f5506d.m2909g(c1242f2, f3 * (-1.0f));
            m2932l.f5506d.m2909g(c1242f3, (-1.0f) * f2);
            m2932l.f5506d.m2909g(c1242f4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                m2932l.f5504b = (i2 * f2) + ((-i) * f3);
            }
        }
        if (i3 != 8) {
            m2932l.m2911a(this, i3);
        }
        m2923c(m2932l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f5540k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f5540k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f5540k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f5540k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2923c(C1238b c1238b) {
        boolean z2;
        boolean z3;
        C1242f c1242f;
        C1242f m2916f;
        ArrayList arrayList;
        if (this.f5519j + 1 >= this.f5520k || this.f5518i + 1 >= this.f5514e) {
            m2934o();
        }
        if (c1238b.f5507e) {
            z2 = false;
        } else {
            if (this.f5515f.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int m2906d = c1238b.f5506d.m2906d();
                    int i = 0;
                    while (true) {
                        arrayList = c1238b.f5505c;
                        if (i >= m2906d) {
                            break;
                        }
                        C1242f m2907e = c1238b.f5506d.m2907e(i);
                        if (m2907e.f5532c != -1 || m2907e.f5535f) {
                            arrayList.add(m2907e);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C1242f c1242f2 = (C1242f) arrayList.get(i2);
                            if (c1242f2.f5535f) {
                                c1238b.m2918h(this, c1242f2, true);
                            } else {
                                c1238b.mo2919i(this, this.f5515f[c1242f2.f5532c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c1238b.f5503a != null && c1238b.f5506d.m2906d() == 0) {
                    c1238b.f5507e = true;
                    this.f5510a = true;
                }
            }
            if (c1238b.mo2915e()) {
                return;
            }
            float f2 = c1238b.f5504b;
            if (f2 < 0.0f) {
                c1238b.f5504b = f2 * (-1.0f);
                C1237a c1237a = c1238b.f5506d;
                int i3 = c1237a.f5500h;
                for (int i4 = 0; i3 != -1 && i4 < c1237a.f5493a; i4++) {
                    float[] fArr = c1237a.f5499g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c1237a.f5498f[i3];
                }
            }
            int m2906d2 = c1238b.f5506d.m2906d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C1242f c1242f3 = null;
            C1242f c1242f4 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i5 = 0; i5 < m2906d2; i5++) {
                float m2908f = c1238b.f5506d.m2908f(i5);
                C1242f m2907e2 = c1238b.f5506d.m2907e(i5);
                if (m2907e2.f5541l == 1) {
                    if (c1242f3 != null) {
                        if (f3 <= m2908f) {
                            if (!z5) {
                                if (m2907e2.f5540k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    c1242f3 = m2907e2;
                    f3 = m2908f;
                } else if (c1242f3 == null && m2908f < 0.0f) {
                    if (c1242f4 != null) {
                        if (f4 <= m2908f) {
                            if (!z6) {
                                if (m2907e2.f5540k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    c1242f4 = m2907e2;
                    f4 = m2908f;
                }
            }
            if (c1242f3 == null) {
                c1242f3 = c1242f4;
            }
            if (c1242f3 == null) {
                z3 = true;
            } else {
                c1238b.m2917g(c1242f3);
                z3 = false;
            }
            if (c1238b.f5506d.m2906d() == 0) {
                c1238b.f5507e = true;
            }
            if (z3) {
                if (this.f5518i + 1 >= this.f5514e) {
                    m2934o();
                }
                C1242f m2921a = m2921a(3);
                int i6 = this.f5511b + 1;
                this.f5511b = i6;
                this.f5518i++;
                m2921a.f5531b = i6;
                C0198k c0198k = this.f5521l;
                ((C1242f[]) c0198k.f535d)[i6] = m2921a;
                c1238b.f5503a = m2921a;
                int i7 = this.f5519j;
                m2928h(c1238b);
                if (this.f5519j == i7 + 1) {
                    C1238b c1238b2 = this.f5524o;
                    c1238b2.f5503a = null;
                    c1238b2.f5506d.m2904b();
                    for (int i8 = 0; i8 < c1238b.f5506d.m2906d(); i8++) {
                        c1238b2.f5506d.m2903a(c1238b.f5506d.m2907e(i8), c1238b.f5506d.m2908f(i8), true);
                    }
                    m2937r(this.f5524o);
                    if (m2921a.f5532c == -1) {
                        if (c1238b.f5503a == m2921a && (m2916f = c1238b.m2916f(null, m2921a)) != null) {
                            c1238b.m2917g(m2916f);
                        }
                        if (!c1238b.f5507e) {
                            c1238b.f5503a.m2949e(this, c1238b);
                        }
                        ((C0145c) c0198k.f533b).m402b(c1238b);
                        this.f5519j--;
                    }
                    z2 = true;
                    c1242f = c1238b.f5503a;
                    if (c1242f != null) {
                        return;
                    }
                    if (c1242f.f5541l != 1 && c1238b.f5504b < 0.0f) {
                        return;
                    }
                }
            }
            z2 = false;
            c1242f = c1238b.f5503a;
            if (c1242f != null) {
            }
        }
        if (z2) {
            return;
        }
        m2928h(c1238b);
    }

    /* renamed from: d */
    public final void m2924d(C1242f c1242f, int i) {
        int i2 = c1242f.f5532c;
        if (i2 == -1) {
            c1242f.m2948d(this, i);
            for (int i3 = 0; i3 < this.f5511b + 1; i3++) {
                C1242f c1242f2 = ((C1242f[]) this.f5521l.f535d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C1238b m2932l = m2932l();
            m2932l.f5503a = c1242f;
            float f2 = i;
            c1242f.f5534e = f2;
            m2932l.f5504b = f2;
            m2932l.f5507e = true;
            m2923c(m2932l);
            return;
        }
        C1238b c1238b = this.f5515f[i2];
        if (c1238b.f5507e) {
            c1238b.f5504b = i;
            return;
        }
        if (c1238b.f5506d.m2906d() == 0) {
            c1238b.f5507e = true;
            c1238b.f5504b = i;
            return;
        }
        C1238b m2932l2 = m2932l();
        if (i < 0) {
            m2932l2.f5504b = i * (-1);
            m2932l2.f5506d.m2909g(c1242f, 1.0f);
        } else {
            m2932l2.f5504b = i;
            m2932l2.f5506d.m2909g(c1242f, -1.0f);
        }
        m2923c(m2932l2);
    }

    /* renamed from: e */
    public final void m2925e(C1242f c1242f, C1242f c1242f2, int i, int i2) {
        if (i2 == 8 && c1242f2.f5535f && c1242f.f5532c == -1) {
            c1242f.m2948d(this, c1242f2.f5534e + i);
            return;
        }
        C1238b m2932l = m2932l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            m2932l.f5504b = i;
        }
        if (z2) {
            m2932l.f5506d.m2909g(c1242f, 1.0f);
            m2932l.f5506d.m2909g(c1242f2, -1.0f);
        } else {
            m2932l.f5506d.m2909g(c1242f, -1.0f);
            m2932l.f5506d.m2909g(c1242f2, 1.0f);
        }
        if (i2 != 8) {
            m2932l.m2911a(this, i2);
        }
        m2923c(m2932l);
    }

    /* renamed from: f */
    public final void m2926f(C1242f c1242f, C1242f c1242f2, int i, int i2) {
        C1238b m2932l = m2932l();
        C1242f m2933m = m2933m();
        m2933m.f5533d = 0;
        m2932l.m2912b(c1242f, c1242f2, m2933m, i);
        if (i2 != 8) {
            m2932l.f5506d.m2909g(m2930j(i2), (int) (m2932l.f5506d.m2905c(m2933m) * (-1.0f)));
        }
        m2923c(m2932l);
    }

    /* renamed from: g */
    public final void m2927g(C1242f c1242f, C1242f c1242f2, int i, int i2) {
        C1238b m2932l = m2932l();
        C1242f m2933m = m2933m();
        m2933m.f5533d = 0;
        m2932l.m2913c(c1242f, c1242f2, m2933m, i);
        if (i2 != 8) {
            m2932l.f5506d.m2909g(m2930j(i2), (int) (m2932l.f5506d.m2905c(m2933m) * (-1.0f)));
        }
        m2923c(m2932l);
    }

    /* renamed from: h */
    public final void m2928h(C1238b c1238b) {
        int i;
        if (c1238b.f5507e) {
            c1238b.f5503a.m2948d(this, c1238b.f5504b);
        } else {
            C1238b[] c1238bArr = this.f5515f;
            int i2 = this.f5519j;
            c1238bArr[i2] = c1238b;
            C1242f c1242f = c1238b.f5503a;
            c1242f.f5532c = i2;
            this.f5519j = i2 + 1;
            c1242f.m2949e(this, c1238b);
        }
        if (this.f5510a) {
            int i3 = 0;
            while (i3 < this.f5519j) {
                if (this.f5515f[i3] == null) {
                    System.out.println("WTF");
                }
                C1238b c1238b2 = this.f5515f[i3];
                if (c1238b2 != null && c1238b2.f5507e) {
                    c1238b2.f5503a.m2948d(this, c1238b2.f5504b);
                    ((C0145c) this.f5521l.f533b).m402b(c1238b2);
                    this.f5515f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f5519j;
                        if (i4 >= i) {
                            break;
                        }
                        C1238b[] c1238bArr2 = this.f5515f;
                        int i6 = i4 - 1;
                        C1238b c1238b3 = c1238bArr2[i4];
                        c1238bArr2[i6] = c1238b3;
                        C1242f c1242f2 = c1238b3.f5503a;
                        if (c1242f2.f5532c == i4) {
                            c1242f2.f5532c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f5515f[i5] = null;
                    }
                    this.f5519j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f5510a = false;
        }
    }

    /* renamed from: i */
    public final void m2929i() {
        for (int i = 0; i < this.f5519j; i++) {
            C1238b c1238b = this.f5515f[i];
            c1238b.f5503a.f5534e = c1238b.f5504b;
        }
    }

    /* renamed from: j */
    public final C1242f m2930j(int i) {
        if (this.f5518i + 1 >= this.f5514e) {
            m2934o();
        }
        C1242f m2921a = m2921a(4);
        int i2 = this.f5511b + 1;
        this.f5511b = i2;
        this.f5518i++;
        m2921a.f5531b = i2;
        m2921a.f5533d = i;
        ((C1242f[]) this.f5521l.f535d)[i2] = m2921a;
        C1240d c1240d = this.f5512c;
        c1240d.f5528i.f141g = m2921a;
        float[] fArr = m2921a.f5537h;
        Arrays.fill(fArr, 0.0f);
        fArr[m2921a.f5533d] = 1.0f;
        c1240d.m2940j(m2921a);
        return m2921a;
    }

    /* renamed from: k */
    public final C1242f m2931k(Object obj) {
        C1242f c1242f = null;
        if (obj == null) {
            return null;
        }
        if (this.f5518i + 1 >= this.f5514e) {
            m2934o();
        }
        if (obj instanceof C1405c) {
            C1405c c1405c = (C1405c) obj;
            c1242f = c1405c.f6627i;
            if (c1242f == null) {
                c1405c.m3363k();
                c1242f = c1405c.f6627i;
            }
            int i = c1242f.f5531b;
            C0198k c0198k = this.f5521l;
            if (i == -1 || i > this.f5511b || ((C1242f[]) c0198k.f535d)[i] == null) {
                if (i != -1) {
                    c1242f.m2947c();
                }
                int i2 = this.f5511b + 1;
                this.f5511b = i2;
                this.f5518i++;
                c1242f.f5531b = i2;
                c1242f.f5541l = 1;
                ((C1242f[]) c0198k.f535d)[i2] = c1242f;
            }
        }
        return c1242f;
    }

    /* renamed from: l */
    public final C1238b m2932l() {
        Object obj;
        C0198k c0198k = this.f5521l;
        C0145c c0145c = (C0145c) c0198k.f533b;
        int i = c0145c.f452b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c0145c.f451a;
            obj = objArr[i2];
            objArr[i2] = null;
            c0145c.f452b = i2;
        } else {
            obj = null;
        }
        C1238b c1238b = (C1238b) obj;
        if (c1238b == null) {
            return new C1238b(c0198k);
        }
        c1238b.f5503a = null;
        c1238b.f5506d.m2904b();
        c1238b.f5504b = 0.0f;
        c1238b.f5507e = false;
        return c1238b;
    }

    /* renamed from: m */
    public final C1242f m2933m() {
        if (this.f5518i + 1 >= this.f5514e) {
            m2934o();
        }
        C1242f m2921a = m2921a(3);
        int i = this.f5511b + 1;
        this.f5511b = i;
        this.f5518i++;
        m2921a.f5531b = i;
        ((C1242f[]) this.f5521l.f535d)[i] = m2921a;
        return m2921a;
    }

    /* renamed from: o */
    public final void m2934o() {
        int i = this.f5513d * 2;
        this.f5513d = i;
        this.f5515f = (C1238b[]) Arrays.copyOf(this.f5515f, i);
        C0198k c0198k = this.f5521l;
        c0198k.f535d = (C1242f[]) Arrays.copyOf((C1242f[]) c0198k.f535d, this.f5513d);
        int i2 = this.f5513d;
        this.f5517h = new boolean[i2];
        this.f5514e = i2;
        this.f5520k = i2;
    }

    /* renamed from: p */
    public final void m2935p() {
        C1240d c1240d = this.f5512c;
        if (c1240d.mo2915e()) {
            m2929i();
            return;
        }
        if (!this.f5516g) {
            m2936q(c1240d);
            return;
        }
        for (int i = 0; i < this.f5519j; i++) {
            if (!this.f5515f[i].f5507e) {
                m2936q(c1240d);
                return;
            }
        }
        m2929i();
    }

    /* renamed from: q */
    public final void m2936q(C1240d c1240d) {
        int i = 0;
        while (true) {
            if (i >= this.f5519j) {
                break;
            }
            C1238b c1238b = this.f5515f[i];
            int i2 = 1;
            if (c1238b.f5503a.f5541l != 1) {
                float f2 = 0.0f;
                if (c1238b.f5504b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        i3 += i2;
                        float f3 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f5519j) {
                            C1238b c1238b2 = this.f5515f[i6];
                            if (c1238b2.f5503a.f5541l != i2 && !c1238b2.f5507e && c1238b2.f5504b < f2) {
                                int m2906d = c1238b2.f5506d.m2906d();
                                int i8 = 0;
                                while (i8 < m2906d) {
                                    C1242f m2907e = c1238b2.f5506d.m2907e(i8);
                                    float m2905c = c1238b2.f5506d.m2905c(m2907e);
                                    if (m2905c > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = m2907e.f5536g[i9] / m2905c;
                                            if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = m2907e.f5531b;
                                                i4 = i6;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = 0.0f;
                                }
                            }
                            i6++;
                            f2 = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C1238b c1238b3 = this.f5515f[i4];
                            c1238b3.f5503a.f5532c = -1;
                            c1238b3.m2917g(((C1242f[]) this.f5521l.f535d)[i5]);
                            C1242f c1242f = c1238b3.f5503a;
                            c1242f.f5532c = i4;
                            c1242f.m2949e(this, c1238b3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.f5518i / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        m2937r(c1240d);
        m2929i();
    }

    /* renamed from: r */
    public final void m2937r(C1238b c1238b) {
        boolean z2;
        int i = 0;
        for (int i2 = 0; i2 < this.f5518i; i2++) {
            this.f5517h[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            int i4 = 1;
            i3++;
            if (i3 >= this.f5518i * 2) {
                return;
            }
            C1242f c1242f = c1238b.f5503a;
            if (c1242f != null) {
                this.f5517h[c1242f.f5531b] = true;
            }
            C1242f mo2914d = c1238b.mo2914d(this.f5517h);
            if (mo2914d != null) {
                boolean[] zArr = this.f5517h;
                int i5 = mo2914d.f5531b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (mo2914d != null) {
                float f2 = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f5519j) {
                    C1238b c1238b2 = this.f5515f[i6];
                    if (c1238b2.f5503a.f5541l != i4 && !c1238b2.f5507e) {
                        C1237a c1237a = c1238b2.f5506d;
                        int i8 = c1237a.f5500h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c1237a.f5493a; i9++) {
                                if (c1237a.f5497e[i8] == mo2914d.f5531b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c1237a.f5498f[i8];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float m2905c = c1238b2.f5506d.m2905c(mo2914d);
                            if (m2905c < 0.0f) {
                                float f3 = (-c1238b2.f5504b) / m2905c;
                                if (f3 < f2) {
                                    f2 = f3;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C1238b c1238b3 = this.f5515f[i7];
                    c1238b3.f5503a.f5532c = -1;
                    c1238b3.m2917g(mo2914d);
                    C1242f c1242f2 = c1238b3.f5503a;
                    c1242f2.f5532c = i7;
                    c1242f2.m2949e(this, c1238b3);
                }
            } else {
                z3 = true;
            }
            i = 0;
        }
    }

    /* renamed from: s */
    public final void m2938s() {
        for (int i = 0; i < this.f5519j; i++) {
            C1238b c1238b = this.f5515f[i];
            if (c1238b != null) {
                ((C0145c) this.f5521l.f533b).m402b(c1238b);
            }
            this.f5515f[i] = null;
        }
    }

    /* renamed from: t */
    public final void m2939t() {
        C0198k c0198k;
        int i = 0;
        while (true) {
            c0198k = this.f5521l;
            C1242f[] c1242fArr = (C1242f[]) c0198k.f535d;
            if (i >= c1242fArr.length) {
                break;
            }
            C1242f c1242f = c1242fArr[i];
            if (c1242f != null) {
                c1242f.m2947c();
            }
            i++;
        }
        C0145c c0145c = (C0145c) c0198k.f534c;
        C1242f[] c1242fArr2 = this.f5522m;
        int i2 = this.f5523n;
        c0145c.getClass();
        if (i2 > c1242fArr2.length) {
            i2 = c1242fArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C1242f c1242f2 = c1242fArr2[i3];
            int i4 = c0145c.f452b;
            Object[] objArr = c0145c.f451a;
            if (i4 < objArr.length) {
                objArr[i4] = c1242f2;
                c0145c.f452b = i4 + 1;
            }
        }
        this.f5523n = 0;
        Arrays.fill((C1242f[]) c0198k.f535d, (Object) null);
        this.f5511b = 0;
        C1240d c1240d = this.f5512c;
        c1240d.f5527h = 0;
        c1240d.f5504b = 0.0f;
        this.f5518i = 1;
        for (int i5 = 0; i5 < this.f5519j; i5++) {
            C1238b c1238b = this.f5515f[i5];
        }
        m2938s();
        this.f5519j = 0;
        this.f5524o = new C1238b(c0198k);
    }
}
