package p091o;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a */
/* loaded from: classes.dex */
public final class C1191a {

    /* renamed from: a */
    public C1198h f5371a;

    /* renamed from: b */
    public C1198h f5372b;

    /* renamed from: c */
    public C1200j f5373c;

    /* renamed from: d */
    public final /* synthetic */ int f5374d;

    /* renamed from: e */
    public final /* synthetic */ Object f5375e;

    public /* synthetic */ C1191a(int i, Object obj) {
        this.f5374d = i;
        this.f5375e = obj;
    }

    /* renamed from: h */
    public static boolean m2837h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m2838a() {
        switch (this.f5374d) {
            case 0:
                ((C1192b) this.f5375e).clear();
                break;
            default:
                ((C1193c) this.f5375e).clear();
                break;
        }
    }

    /* renamed from: b */
    public final Object m2839b(int i, int i2) {
        switch (this.f5374d) {
            case 0:
                return ((C1192b) this.f5375e).f5417b[(i << 1) + i2];
            default:
                return ((C1193c) this.f5375e).f5384b[i];
        }
    }

    /* renamed from: c */
    public final Map m2840c() {
        switch (this.f5374d) {
            case 0:
                return (C1192b) this.f5375e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* renamed from: d */
    public final int m2841d() {
        switch (this.f5374d) {
            case 0:
                return ((C1192b) this.f5375e).f5418c;
            default:
                return ((C1193c) this.f5375e).f5385c;
        }
    }

    /* renamed from: e */
    public final int m2842e(Object obj) {
        switch (this.f5374d) {
            case 0:
                return ((C1192b) this.f5375e).m2868e(obj);
            default:
                return ((C1193c) this.f5375e).indexOf(obj);
        }
    }

    /* renamed from: f */
    public final int m2843f(Object obj) {
        switch (this.f5374d) {
            case 0:
                return ((C1192b) this.f5375e).m2870g(obj);
            default:
                return ((C1193c) this.f5375e).indexOf(obj);
        }
    }

    /* renamed from: g */
    public final void m2844g(int i) {
        switch (this.f5374d) {
            case 0:
                ((C1192b) this.f5375e).m2872i(i);
                break;
            default:
                ((C1193c) this.f5375e).m2850e(i);
                break;
        }
    }

    /* renamed from: i */
    public final Object[] m2845i(int i, Object[] objArr) {
        int m2841d = m2841d();
        if (objArr.length < m2841d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m2841d);
        }
        for (int i2 = 0; i2 < m2841d; i2++) {
            objArr[i2] = m2839b(i2, i);
        }
        if (objArr.length > m2841d) {
            objArr[m2841d] = null;
        }
        return objArr;
    }
}
