package p102s;

import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p006C.AbstractC0062j;
import p097q.AbstractC1241e;
import p097q.C1242f;
import p105t.AbstractC1447h;
import p105t.C1453n;

/* renamed from: s.c */
/* loaded from: classes.dex */
public final class C1405c {

    /* renamed from: b */
    public int f6620b;

    /* renamed from: c */
    public boolean f6621c;

    /* renamed from: d */
    public final C1406d f6622d;

    /* renamed from: e */
    public final int f6623e;

    /* renamed from: f */
    public C1405c f6624f;

    /* renamed from: i */
    public C1242f f6627i;

    /* renamed from: a */
    public HashSet f6619a = null;

    /* renamed from: g */
    public int f6625g = 0;

    /* renamed from: h */
    public int f6626h = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    public C1405c(C1406d c1406d, int i) {
        this.f6622d = c1406d;
        this.f6623e = i;
    }

    /* renamed from: a */
    public final void m3353a(C1405c c1405c, int i) {
        m3354b(c1405c, i, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, false);
    }

    /* renamed from: b */
    public final boolean m3354b(C1405c c1405c, int i, int i2, boolean z2) {
        if (c1405c == null) {
            m3362j();
            return true;
        }
        if (!z2 && !m3361i(c1405c)) {
            return false;
        }
        this.f6624f = c1405c;
        if (c1405c.f6619a == null) {
            c1405c.f6619a = new HashSet();
        }
        HashSet hashSet = this.f6624f.f6619a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f6625g = i;
        this.f6626h = i2;
        return true;
    }

    /* renamed from: c */
    public final void m3355c(int i, ArrayList arrayList, C1453n c1453n) {
        HashSet hashSet = this.f6619a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC1447h.m3446b(((C1405c) it.next()).f6622d, i, arrayList, c1453n);
            }
        }
    }

    /* renamed from: d */
    public final int m3356d() {
        if (this.f6621c) {
            return this.f6620b;
        }
        return 0;
    }

    /* renamed from: e */
    public final int m3357e() {
        C1405c c1405c;
        if (this.f6622d.f6667g0 == 8) {
            return 0;
        }
        int i = this.f6626h;
        return (i == Integer.MIN_VALUE || (c1405c = this.f6624f) == null || c1405c.f6622d.f6667g0 != 8) ? this.f6625g : i;
    }

    /* renamed from: f */
    public final C1405c m3358f() {
        int i = this.f6623e;
        int m2943b = AbstractC1241e.m2943b(i);
        C1406d c1406d = this.f6622d;
        switch (m2943b) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1406d.f6638K;
            case 2:
                return c1406d.f6639L;
            case 3:
                return c1406d.f6636I;
            case 4:
                return c1406d.f6637J;
            default:
                throw new AssertionError(AbstractC0062j.m170x(i));
        }
    }

    /* renamed from: g */
    public final boolean m3359g() {
        HashSet hashSet = this.f6619a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1405c) it.next()).m3358f().m3360h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m3360h() {
        return this.f6624f != null;
    }

    /* renamed from: i */
    public final boolean m3361i(C1405c c1405c) {
        if (c1405c == null) {
            return false;
        }
        int i = this.f6623e;
        C1406d c1406d = c1405c.f6622d;
        int i2 = c1405c.f6623e;
        if (i2 == i) {
            return i != 6 || (c1406d.f6632E && this.f6622d.f6632E);
        }
        switch (AbstractC1241e.m2943b(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c1406d instanceof C1410h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c1406d instanceof C1410h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC0062j.m170x(i));
        }
    }

    /* renamed from: j */
    public final void m3362j() {
        HashSet hashSet;
        C1405c c1405c = this.f6624f;
        if (c1405c != null && (hashSet = c1405c.f6619a) != null) {
            hashSet.remove(this);
            if (this.f6624f.f6619a.size() == 0) {
                this.f6624f.f6619a = null;
            }
        }
        this.f6619a = null;
        this.f6624f = null;
        this.f6625g = 0;
        this.f6626h = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f6621c = false;
        this.f6620b = 0;
    }

    /* renamed from: k */
    public final void m3363k() {
        C1242f c1242f = this.f6627i;
        if (c1242f == null) {
            this.f6627i = new C1242f(1);
        } else {
            c1242f.m2947c();
        }
    }

    /* renamed from: l */
    public final void m3364l(int i) {
        this.f6620b = i;
        this.f6621c = true;
    }

    public final String toString() {
        return this.f6622d.f6669h0 + ":" + AbstractC0062j.m170x(this.f6623e);
    }
}
