package p121y0;

import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p106t0.EnumC1457c;

/* renamed from: y0.c */
/* loaded from: classes.dex */
public final class C1675c {

    /* renamed from: a */
    public final cfgData f9551a;

    /* renamed from: b */
    public final carData f9552b;

    /* renamed from: c */
    public final ArrayDeque f9553c = new ArrayDeque();

    /* renamed from: d */
    public boolean f9554d = true;

    /* renamed from: e */
    public boolean f9555e = true;

    /* renamed from: f */
    public List f9556f = Collections.emptyList();

    public C1675c(cfgData cfgdata, carData cardata) {
        this.f9551a = cfgdata;
        this.f9552b = cardata;
    }

    /* renamed from: a */
    public static void m4835a(ArrayList arrayList, int i, float f2, float f3) {
        if (m4836c(f3) && m4836c(f2) && f3 - f2 >= 7.0f) {
            arrayList.add(new C1673a(f2, f3, i));
        }
    }

    /* renamed from: c */
    public static boolean m4836c(float f2) {
        return !Float.isNaN(f2) && !Float.isInfinite(f2) && f2 >= 0.0f && f2 <= 110.0f;
    }

    /* renamed from: d */
    public static boolean m4837d(float f2, float f3) {
        if (!m4836c(f2)) {
            return false;
        }
        if (f2 > 0.0f) {
            return true;
        }
        return m4836c(f3) && f3 <= 5.0f;
    }

    /* renamed from: b */
    public final void m4838b(long j2, float f2, float f3) {
        ArrayDeque arrayDeque = this.f9553c;
        arrayDeque.addLast(new C1674b(j2, f2, f3));
        long j3 = j2 - 120000;
        while (!arrayDeque.isEmpty() && ((C1674b) arrayDeque.peekFirst()).f9548a < j3) {
            arrayDeque.pollFirst();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* renamed from: e */
    public final int m4839e(long j2, float f2) {
        float m1774t;
        boolean z2;
        this.f9556f = Collections.emptyList();
        cfgData cfgdata = this.f9551a;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        carData cardata = this.f9552b;
        if (enumC1457c == null || !enumC1457c.f7147f) {
            m1774t = cardata.m1774t();
        } else {
            m1774t = cardata.m1775u();
            if (cfgdata.f2543M0 == EnumC1457c.T500_BT_NEW) {
                m1774t *= 10.0f;
            }
        }
        EnumC1457c enumC1457c2 = cfgdata.f2543M0;
        float m1776v = (enumC1457c2 == null || !enumC1457c2.f7147f) ? Float.NaN : cardata.m1776v();
        if (!m4837d(m1774t, cfgdata.f2532J1)) {
            m1774t = Float.NaN;
        }
        if (!m4837d(m1776v, cfgdata.f2536K1)) {
            m1776v = Float.NaN;
        }
        if (Float.isNaN(m1774t) && Float.isNaN(m1776v)) {
            return 0;
        }
        float f3 = cfgdata.f2532J1;
        float f4 = cfgdata.f2536K1;
        ArrayList arrayList = new ArrayList(2);
        if (Float.isNaN(m1774t) || !this.f9554d) {
            z2 = false;
        } else {
            this.f9554d = false;
            m4835a(arrayList, 1, f3, m1774t);
            z2 = m4840f(m1774t, Float.NaN);
        }
        ?? r12 = z2;
        if (!Float.isNaN(m1776v)) {
            r12 = z2;
            if (this.f9555e) {
                this.f9555e = false;
                m4835a(arrayList, 2, f4, m1776v);
                r12 = (z2 ? 1 : 0) | (m4840f(Float.NaN, m1776v) ? 1 : 0);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayDeque arrayDeque = this.f9553c;
        if (!isEmpty) {
            this.f9556f = arrayList;
            cfgdata.f2524H1 = 0.0f;
            cfgdata.f2528I1 = j2;
            m4840f(m1774t, m1776v);
            arrayDeque.clear();
            m4838b(j2, m1774t, m1776v);
            return 2;
        }
        if (f2 >= 1.0f) {
            arrayDeque.clear();
            return r12;
        }
        m4838b(j2, m1774t, m1776v);
        float m4841g = m4841g(true);
        if (m4836c(m4841g) && m4836c(f3)) {
            f3 = Math.min(m4841g, f3);
        } else if (m4836c(m4841g)) {
            f3 = m4841g;
        }
        m4835a(arrayList, 1, f3, m1774t);
        float m4841g2 = m4841g(false);
        if (m4836c(m4841g2) && m4836c(f4)) {
            f4 = Math.min(m4841g2, f4);
        } else if (m4836c(m4841g2)) {
            f4 = m4841g2;
        }
        m4835a(arrayList, 2, f4, m1776v);
        if (arrayList.isEmpty()) {
            return (m4840f(m1774t, m1776v) || r12 != 0) ? 1 : 0;
        }
        this.f9556f = arrayList;
        cfgdata.f2524H1 = 0.0f;
        cfgdata.f2528I1 = j2;
        m4840f(m1774t, m1776v);
        arrayDeque.clear();
        m4838b(j2, m1774t, m1776v);
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4840f(float f2, float f3) {
        boolean z2;
        boolean isNaN = Float.isNaN(f2);
        cfgData cfgdata = this.f9551a;
        if (!isNaN) {
            float f4 = cfgdata.f2532J1;
            if ((!Float.isNaN(f4) || !Float.isNaN(f2)) && f4 != f2) {
                cfgdata.f2532J1 = f2;
                z2 = true;
                if (!Float.isNaN(f3)) {
                    float f5 = cfgdata.f2536K1;
                    if ((!Float.isNaN(f5) || !Float.isNaN(f3)) && f5 != f3) {
                        cfgdata.f2536K1 = f3;
                        return true;
                    }
                }
                return z2;
            }
        }
        z2 = false;
        if (!Float.isNaN(f3)) {
        }
        return z2;
    }

    /* renamed from: g */
    public final float m4841g(boolean z2) {
        Iterator it = this.f9553c.iterator();
        float f2 = Float.NaN;
        while (it.hasNext()) {
            C1674b c1674b = (C1674b) it.next();
            float f3 = z2 ? c1674b.f9549b : c1674b.f9550c;
            if (!Float.isNaN(f3)) {
                if (!Float.isNaN(f2)) {
                    f3 = Math.min(f2, f3);
                }
                f2 = f3;
            }
        }
        return f2;
    }
}
