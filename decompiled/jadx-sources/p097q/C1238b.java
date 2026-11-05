package p097q;

import java.util.ArrayList;
import p006C.AbstractC0062j;
import p022K.C0198k;

/* renamed from: q.b */
/* loaded from: classes.dex */
public class C1238b {

    /* renamed from: d */
    public final C1237a f5506d;

    /* renamed from: a */
    public C1242f f5503a = null;

    /* renamed from: b */
    public float f5504b = 0.0f;

    /* renamed from: c */
    public final ArrayList f5505c = new ArrayList();

    /* renamed from: e */
    public boolean f5507e = false;

    public C1238b(C0198k c0198k) {
        this.f5506d = new C1237a(this, c0198k);
    }

    /* renamed from: a */
    public final void m2911a(C1239c c1239c, int i) {
        this.f5506d.m2909g(c1239c.m2930j(i), 1.0f);
        this.f5506d.m2909g(c1239c.m2930j(i), -1.0f);
    }

    /* renamed from: b */
    public final void m2912b(C1242f c1242f, C1242f c1242f2, C1242f c1242f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f5504b = i;
        }
        if (z2) {
            this.f5506d.m2909g(c1242f, 1.0f);
            this.f5506d.m2909g(c1242f2, -1.0f);
            this.f5506d.m2909g(c1242f3, -1.0f);
        } else {
            this.f5506d.m2909g(c1242f, -1.0f);
            this.f5506d.m2909g(c1242f2, 1.0f);
            this.f5506d.m2909g(c1242f3, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m2913c(C1242f c1242f, C1242f c1242f2, C1242f c1242f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f5504b = i;
        }
        if (z2) {
            this.f5506d.m2909g(c1242f, 1.0f);
            this.f5506d.m2909g(c1242f2, -1.0f);
            this.f5506d.m2909g(c1242f3, 1.0f);
        } else {
            this.f5506d.m2909g(c1242f, -1.0f);
            this.f5506d.m2909g(c1242f2, 1.0f);
            this.f5506d.m2909g(c1242f3, -1.0f);
        }
    }

    /* renamed from: d */
    public C1242f mo2914d(boolean[] zArr) {
        return m2916f(zArr, null);
    }

    /* renamed from: e */
    public boolean mo2915e() {
        return this.f5503a == null && this.f5504b == 0.0f && this.f5506d.m2906d() == 0;
    }

    /* renamed from: f */
    public final C1242f m2916f(boolean[] zArr, C1242f c1242f) {
        int i;
        int m2906d = this.f5506d.m2906d();
        C1242f c1242f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < m2906d; i2++) {
            float m2908f = this.f5506d.m2908f(i2);
            if (m2908f < 0.0f) {
                C1242f m2907e = this.f5506d.m2907e(i2);
                if ((zArr == null || !zArr[m2907e.f5531b]) && m2907e != c1242f && (((i = m2907e.f5541l) == 3 || i == 4) && m2908f < f2)) {
                    f2 = m2908f;
                    c1242f2 = m2907e;
                }
            }
        }
        return c1242f2;
    }

    /* renamed from: g */
    public final void m2917g(C1242f c1242f) {
        C1242f c1242f2 = this.f5503a;
        if (c1242f2 != null) {
            this.f5506d.m2909g(c1242f2, -1.0f);
            this.f5503a.f5532c = -1;
            this.f5503a = null;
        }
        float m2910h = this.f5506d.m2910h(c1242f, true) * (-1.0f);
        this.f5503a = c1242f;
        if (m2910h == 1.0f) {
            return;
        }
        this.f5504b /= m2910h;
        C1237a c1237a = this.f5506d;
        int i = c1237a.f5500h;
        for (int i2 = 0; i != -1 && i2 < c1237a.f5493a; i2++) {
            float[] fArr = c1237a.f5499g;
            fArr[i] = fArr[i] / m2910h;
            i = c1237a.f5498f[i];
        }
    }

    /* renamed from: h */
    public final void m2918h(C1239c c1239c, C1242f c1242f, boolean z2) {
        if (c1242f == null || !c1242f.f5535f) {
            return;
        }
        float m2905c = this.f5506d.m2905c(c1242f);
        this.f5504b = (c1242f.f5534e * m2905c) + this.f5504b;
        this.f5506d.m2910h(c1242f, z2);
        if (z2) {
            c1242f.m2946b(this);
        }
        if (this.f5506d.m2906d() == 0) {
            this.f5507e = true;
            c1239c.f5510a = true;
        }
    }

    /* renamed from: i */
    public void mo2919i(C1239c c1239c, C1238b c1238b, boolean z2) {
        C1237a c1237a = this.f5506d;
        c1237a.getClass();
        float m2905c = c1237a.m2905c(c1238b.f5503a);
        c1237a.m2910h(c1238b.f5503a, z2);
        C1237a c1237a2 = c1238b.f5506d;
        int m2906d = c1237a2.m2906d();
        for (int i = 0; i < m2906d; i++) {
            C1242f m2907e = c1237a2.m2907e(i);
            c1237a.m2903a(m2907e, c1237a2.m2905c(m2907e) * m2905c, z2);
        }
        this.f5504b = (c1238b.f5504b * m2905c) + this.f5504b;
        if (z2) {
            c1238b.f5503a.m2946b(this);
        }
        if (this.f5503a == null || this.f5506d.m2906d() != 0) {
            return;
        }
        this.f5507e = true;
        c1239c.f5510a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String m160n = AbstractC0062j.m160n(this.f5503a == null ? "0" : "" + this.f5503a, " = ");
        if (this.f5504b != 0.0f) {
            StringBuilder m2942a = AbstractC1241e.m2942a(m160n);
            m2942a.append(this.f5504b);
            m160n = m2942a.toString();
            z2 = true;
        } else {
            z2 = false;
        }
        int m2906d = this.f5506d.m2906d();
        for (int i = 0; i < m2906d; i++) {
            C1242f m2907e = this.f5506d.m2907e(i);
            if (m2907e != null) {
                float m2908f = this.f5506d.m2908f(i);
                if (m2908f != 0.0f) {
                    String c1242f = m2907e.toString();
                    if (!z2) {
                        if (m2908f < 0.0f) {
                            m160n = AbstractC0062j.m160n(m160n, "- ");
                            m2908f *= -1.0f;
                        }
                        m160n = m2908f == 1.0f ? AbstractC0062j.m160n(m160n, c1242f) : m160n + m2908f + " " + c1242f;
                        z2 = true;
                    } else if (m2908f > 0.0f) {
                        m160n = AbstractC0062j.m160n(m160n, " + ");
                        if (m2908f == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        m160n = AbstractC0062j.m160n(m160n, " - ");
                        m2908f *= -1.0f;
                        if (m2908f == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? AbstractC0062j.m160n(m160n, "0.0") : m160n;
    }
}
