package p072g1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p006C.AbstractC0062j;
import p063d1.AbstractC0754o;
import p063d1.AbstractC0764y;
import p063d1.C0753n;
import p063d1.C0756q;
import p063d1.C0757r;
import p063d1.C0758s;
import p069f1.C0838j;
import p069f1.C0839k;
import p069f1.C0840l;
import p069f1.C0841m;
import p084l1.C1158a;
import p084l1.C1159b;
import p097q.AbstractC1241e;

/* renamed from: g1.M */
/* loaded from: classes.dex */
public class C0906M extends AbstractC0764y {
    /* renamed from: b */
    public static AbstractC0754o m2470b(C1158a c1158a, int i) {
        int m2943b = AbstractC1241e.m2943b(i);
        if (m2943b == 5) {
            return new C0758s(c1158a.m2786A());
        }
        if (m2943b == 6) {
            return new C0758s(new C0838j(c1158a.m2786A()));
        }
        if (m2943b == 7) {
            return new C0758s(Boolean.valueOf(c1158a.m2808s()));
        }
        if (m2943b != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0062j.m146A(i)));
        }
        c1158a.m2814y();
        return C0756q.f3887a;
    }

    /* renamed from: c */
    public static void m2471c(C1159b c1159b, AbstractC0754o abstractC0754o) {
        if (abstractC0754o == null || (abstractC0754o instanceof C0756q)) {
            c1159b.m2819k();
            return;
        }
        boolean z2 = abstractC0754o instanceof C0758s;
        if (z2) {
            if (!z2) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC0754o);
            }
            C0758s c0758s = (C0758s) abstractC0754o;
            Serializable serializable = c0758s.f3889a;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean booleanValue = serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c0758s.m2202c());
                    c1159b.m2822n();
                    c1159b.m2816d();
                    c1159b.f5324a.write(booleanValue ? "true" : "false");
                    return;
                }
                String m2202c = c0758s.m2202c();
                if (m2202c == null) {
                    c1159b.m2819k();
                    return;
                }
                c1159b.m2822n();
                c1159b.m2816d();
                c1159b.m2821m(m2202c);
                return;
            }
            Number m2201b = c0758s.m2201b();
            if (m2201b == null) {
                c1159b.m2819k();
                return;
            }
            c1159b.m2822n();
            String obj = m2201b.toString();
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                Class<?> cls = m2201b.getClass();
                if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !C1159b.f5322k.matcher(obj).matches()) {
                    throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
                }
            } else if (c1159b.f5331h != 1) {
                throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
            }
            c1159b.m2816d();
            c1159b.f5324a.append((CharSequence) obj);
            return;
        }
        boolean z3 = abstractC0754o instanceof C0753n;
        if (z3) {
            c1159b.m2822n();
            c1159b.m2816d();
            int i = c1159b.f5326c;
            int[] iArr = c1159b.f5325b;
            if (i == iArr.length) {
                c1159b.f5325b = Arrays.copyOf(iArr, i * 2);
            }
            int[] iArr2 = c1159b.f5325b;
            int i2 = c1159b.f5326c;
            c1159b.f5326c = i2 + 1;
            iArr2[i2] = 1;
            c1159b.f5324a.write(91);
            if (!z3) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC0754o);
            }
            Iterator it = ((C0753n) abstractC0754o).f3886a.iterator();
            while (it.hasNext()) {
                m2471c(c1159b, (AbstractC0754o) it.next());
            }
            c1159b.m2817i(1, 2, ']');
            return;
        }
        boolean z4 = abstractC0754o instanceof C0757r;
        if (!z4) {
            throw new IllegalArgumentException("Couldn't write " + abstractC0754o.getClass());
        }
        c1159b.m2822n();
        c1159b.m2816d();
        int i3 = c1159b.f5326c;
        int[] iArr3 = c1159b.f5325b;
        if (i3 == iArr3.length) {
            c1159b.f5325b = Arrays.copyOf(iArr3, i3 * 2);
        }
        int[] iArr4 = c1159b.f5325b;
        int i4 = c1159b.f5326c;
        c1159b.f5326c = i4 + 1;
        iArr4[i4] = 3;
        c1159b.f5324a.write(123);
        if (!z4) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC0754o);
        }
        Iterator it2 = ((C0840l) ((C0757r) abstractC0754o).f3888a.entrySet()).iterator();
        while (((C0839k) it2).hasNext()) {
            C0841m m2364b = ((C0839k) it2).m2364b();
            String str = (String) m2364b.getKey();
            Objects.requireNonNull(str, "name == null");
            if (c1159b.f5332i != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int m2820l = c1159b.m2820l();
            if (m2820l != 3 && m2820l != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            c1159b.f5332i = str;
            m2471c(c1159b, (AbstractC0754o) m2364b.getValue());
        }
        c1159b.m2817i(3, 5, '}');
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        AbstractC0754o c0753n;
        AbstractC0754o c0753n2;
        int m2788C = c1158a.m2788C();
        int m2943b = AbstractC1241e.m2943b(m2788C);
        if (m2943b == 0) {
            c1158a.m2797d();
            c0753n = new C0753n();
        } else if (m2943b != 2) {
            c0753n = null;
        } else {
            c1158a.m2798i();
            c0753n = new C0757r();
        }
        if (c0753n == null) {
            return m2470b(c1158a, m2788C);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c1158a.m2805p()) {
                String m2812w = c0753n instanceof C0757r ? c1158a.m2812w() : null;
                int m2788C2 = c1158a.m2788C();
                int m2943b2 = AbstractC1241e.m2943b(m2788C2);
                if (m2943b2 == 0) {
                    c1158a.m2797d();
                    c0753n2 = new C0753n();
                } else if (m2943b2 != 2) {
                    c0753n2 = null;
                } else {
                    c1158a.m2798i();
                    c0753n2 = new C0757r();
                }
                boolean z2 = c0753n2 != null;
                if (c0753n2 == null) {
                    c0753n2 = m2470b(c1158a, m2788C2);
                }
                if (c0753n instanceof C0753n) {
                    ((C0753n) c0753n).f3886a.add(c0753n2);
                } else {
                    ((C0757r) c0753n).f3888a.put(m2812w, c0753n2);
                }
                if (z2) {
                    arrayDeque.addLast(c0753n);
                    c0753n = c0753n2;
                }
            } else {
                if (c0753n instanceof C0753n) {
                    c1158a.m2801l();
                } else {
                    c1158a.m2802m();
                }
                if (arrayDeque.isEmpty()) {
                    return c0753n;
                }
                c0753n = (AbstractC0754o) arrayDeque.removeLast();
            }
        }
    }
}
