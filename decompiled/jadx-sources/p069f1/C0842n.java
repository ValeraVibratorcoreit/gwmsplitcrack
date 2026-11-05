package p069f1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import p034Q0.C0295l;

/* renamed from: f1.n */
/* loaded from: classes.dex */
public final class C0842n extends AbstractMap implements Serializable {

    /* renamed from: i */
    public static final C0295l f4248i = new C0295l(3);

    /* renamed from: a */
    public final Comparator f4249a;

    /* renamed from: b */
    public final boolean f4250b;

    /* renamed from: c */
    public C0841m f4251c;

    /* renamed from: d */
    public int f4252d;

    /* renamed from: e */
    public int f4253e;

    /* renamed from: f */
    public final C0841m f4254f;

    /* renamed from: g */
    public C0840l f4255g;

    /* renamed from: h */
    public C0840l f4256h;

    public C0842n(boolean z2) {
        C0295l c0295l = f4248i;
        this.f4252d = 0;
        this.f4253e = 0;
        this.f4249a = c0295l;
        this.f4250b = z2;
        this.f4254f = new C0841m(z2);
    }

    /* renamed from: a */
    public final C0841m m2365a(Object obj, boolean z2) {
        int i;
        C0841m c0841m;
        C0841m c0841m2 = this.f4251c;
        C0295l c0295l = f4248i;
        Comparator comparator = this.f4249a;
        if (c0841m2 != null) {
            Comparable comparable = comparator == c0295l ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c0841m2.f4244f;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return c0841m2;
                }
                C0841m c0841m3 = i < 0 ? c0841m2.f4240b : c0841m2.f4241c;
                if (c0841m3 == null) {
                    break;
                }
                c0841m2 = c0841m3;
            }
        } else {
            i = 0;
        }
        if (!z2) {
            return null;
        }
        C0841m c0841m4 = this.f4254f;
        if (c0841m2 != null) {
            c0841m = new C0841m(this.f4250b, c0841m2, obj, c0841m4, c0841m4.f4243e);
            if (i < 0) {
                c0841m2.f4240b = c0841m;
            } else {
                c0841m2.f4241c = c0841m;
            }
            m2366b(c0841m2, true);
        } else {
            if (comparator == c0295l && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c0841m = new C0841m(this.f4250b, c0841m2, obj, c0841m4, c0841m4.f4243e);
            this.f4251c = c0841m;
        }
        this.f4252d++;
        this.f4253e++;
        return c0841m;
    }

    /* renamed from: b */
    public final void m2366b(C0841m c0841m, boolean z2) {
        while (c0841m != null) {
            C0841m c0841m2 = c0841m.f4240b;
            C0841m c0841m3 = c0841m.f4241c;
            int i = c0841m2 != null ? c0841m2.f4247i : 0;
            int i2 = c0841m3 != null ? c0841m3.f4247i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C0841m c0841m4 = c0841m3.f4240b;
                C0841m c0841m5 = c0841m3.f4241c;
                int i4 = (c0841m4 != null ? c0841m4.f4247i : 0) - (c0841m5 != null ? c0841m5.f4247i : 0);
                if (i4 == -1 || (i4 == 0 && !z2)) {
                    m2369e(c0841m);
                } else {
                    m2370f(c0841m3);
                    m2369e(c0841m);
                }
                if (z2) {
                    return;
                }
            } else if (i3 == 2) {
                C0841m c0841m6 = c0841m2.f4240b;
                C0841m c0841m7 = c0841m2.f4241c;
                int i5 = (c0841m6 != null ? c0841m6.f4247i : 0) - (c0841m7 != null ? c0841m7.f4247i : 0);
                if (i5 == 1 || (i5 == 0 && !z2)) {
                    m2370f(c0841m);
                } else {
                    m2369e(c0841m2);
                    m2370f(c0841m);
                }
                if (z2) {
                    return;
                }
            } else if (i3 == 0) {
                c0841m.f4247i = i + 1;
                if (z2) {
                    return;
                }
            } else {
                c0841m.f4247i = Math.max(i, i2) + 1;
                if (!z2) {
                    return;
                }
            }
            c0841m = c0841m.f4239a;
        }
    }

    /* renamed from: c */
    public final void m2367c(C0841m c0841m, boolean z2) {
        C0841m c0841m2;
        C0841m c0841m3;
        int i;
        if (z2) {
            C0841m c0841m4 = c0841m.f4243e;
            c0841m4.f4242d = c0841m.f4242d;
            c0841m.f4242d.f4243e = c0841m4;
        }
        C0841m c0841m5 = c0841m.f4240b;
        C0841m c0841m6 = c0841m.f4241c;
        C0841m c0841m7 = c0841m.f4239a;
        int i2 = 0;
        if (c0841m5 == null || c0841m6 == null) {
            if (c0841m5 != null) {
                m2368d(c0841m, c0841m5);
                c0841m.f4240b = null;
            } else if (c0841m6 != null) {
                m2368d(c0841m, c0841m6);
                c0841m.f4241c = null;
            } else {
                m2368d(c0841m, null);
            }
            m2366b(c0841m7, false);
            this.f4252d--;
            this.f4253e++;
            return;
        }
        if (c0841m5.f4247i > c0841m6.f4247i) {
            C0841m c0841m8 = c0841m5.f4241c;
            while (true) {
                C0841m c0841m9 = c0841m8;
                c0841m3 = c0841m5;
                c0841m5 = c0841m9;
                if (c0841m5 == null) {
                    break;
                } else {
                    c0841m8 = c0841m5.f4241c;
                }
            }
        } else {
            C0841m c0841m10 = c0841m6.f4240b;
            while (true) {
                c0841m2 = c0841m6;
                c0841m6 = c0841m10;
                if (c0841m6 == null) {
                    break;
                } else {
                    c0841m10 = c0841m6.f4240b;
                }
            }
            c0841m3 = c0841m2;
        }
        m2367c(c0841m3, false);
        C0841m c0841m11 = c0841m.f4240b;
        if (c0841m11 != null) {
            i = c0841m11.f4247i;
            c0841m3.f4240b = c0841m11;
            c0841m11.f4239a = c0841m3;
            c0841m.f4240b = null;
        } else {
            i = 0;
        }
        C0841m c0841m12 = c0841m.f4241c;
        if (c0841m12 != null) {
            i2 = c0841m12.f4247i;
            c0841m3.f4241c = c0841m12;
            c0841m12.f4239a = c0841m3;
            c0841m.f4241c = null;
        }
        c0841m3.f4247i = Math.max(i, i2) + 1;
        m2368d(c0841m, c0841m3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f4251c = null;
        this.f4252d = 0;
        this.f4253e++;
        C0841m c0841m = this.f4254f;
        c0841m.f4243e = c0841m;
        c0841m.f4242d = c0841m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C0841m c0841m = null;
        if (obj != null) {
            try {
                c0841m = m2365a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c0841m != null;
    }

    /* renamed from: d */
    public final void m2368d(C0841m c0841m, C0841m c0841m2) {
        C0841m c0841m3 = c0841m.f4239a;
        c0841m.f4239a = null;
        if (c0841m2 != null) {
            c0841m2.f4239a = c0841m3;
        }
        if (c0841m3 == null) {
            this.f4251c = c0841m2;
        } else if (c0841m3.f4240b == c0841m) {
            c0841m3.f4240b = c0841m2;
        } else {
            c0841m3.f4241c = c0841m2;
        }
    }

    /* renamed from: e */
    public final void m2369e(C0841m c0841m) {
        C0841m c0841m2 = c0841m.f4240b;
        C0841m c0841m3 = c0841m.f4241c;
        C0841m c0841m4 = c0841m3.f4240b;
        C0841m c0841m5 = c0841m3.f4241c;
        c0841m.f4241c = c0841m4;
        if (c0841m4 != null) {
            c0841m4.f4239a = c0841m;
        }
        m2368d(c0841m, c0841m3);
        c0841m3.f4240b = c0841m;
        c0841m.f4239a = c0841m3;
        int max = Math.max(c0841m2 != null ? c0841m2.f4247i : 0, c0841m4 != null ? c0841m4.f4247i : 0) + 1;
        c0841m.f4247i = max;
        c0841m3.f4247i = Math.max(max, c0841m5 != null ? c0841m5.f4247i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0840l c0840l = this.f4255g;
        if (c0840l != null) {
            return c0840l;
        }
        C0840l c0840l2 = new C0840l(this, 0);
        this.f4255g = c0840l2;
        return c0840l2;
    }

    /* renamed from: f */
    public final void m2370f(C0841m c0841m) {
        C0841m c0841m2 = c0841m.f4240b;
        C0841m c0841m3 = c0841m.f4241c;
        C0841m c0841m4 = c0841m2.f4240b;
        C0841m c0841m5 = c0841m2.f4241c;
        c0841m.f4240b = c0841m5;
        if (c0841m5 != null) {
            c0841m5.f4239a = c0841m;
        }
        m2368d(c0841m, c0841m2);
        c0841m2.f4241c = c0841m;
        c0841m.f4239a = c0841m2;
        int max = Math.max(c0841m3 != null ? c0841m3.f4247i : 0, c0841m5 != null ? c0841m5.f4247i : 0) + 1;
        c0841m.f4247i = max;
        c0841m2.f4247i = Math.max(max, c0841m4 != null ? c0841m4.f4247i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        C0841m c0841m;
        if (obj != null) {
            try {
                c0841m = m2365a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (c0841m == null) {
                return c0841m.f4246h;
            }
            return null;
        }
        c0841m = null;
        if (c0841m == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0840l c0840l = this.f4256h;
        if (c0840l != null) {
            return c0840l;
        }
        C0840l c0840l2 = new C0840l(this, 1);
        this.f4256h = c0840l2;
        return c0840l2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f4250b) {
            throw new NullPointerException("value == null");
        }
        C0841m m2365a = m2365a(obj, true);
        Object obj3 = m2365a.f4246h;
        m2365a.f4246h = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        C0841m c0841m;
        if (obj != null) {
            try {
                c0841m = m2365a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (c0841m != null) {
                m2367c(c0841m, true);
            }
            if (c0841m == null) {
                return c0841m.f4246h;
            }
            return null;
        }
        c0841m = null;
        if (c0841m != null) {
        }
        if (c0841m == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4252d;
    }
}
