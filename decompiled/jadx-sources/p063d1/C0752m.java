package p063d1;

import com.altaysoft.t500_split.network.ApiResponse;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p003B.C0043j;
import p069f1.C0836h;
import p069f1.C0838j;
import p072g1.AbstractC0920a0;
import p072g1.C0909P;
import p072g1.C0910Q;
import p072g1.C0921b;
import p072g1.C0923d;
import p072g1.C0926g;
import p072g1.C0928i;
import p072g1.C0930k;
import p072g1.C0931l;
import p072g1.C0937r;
import p072g1.C0940u;
import p078j1.AbstractC1000e;
import p081k1.C1048a;
import p084l1.C1158a;
import p084l1.C1160c;

/* renamed from: d1.m */
/* loaded from: classes.dex */
public final class C0752m {

    /* renamed from: f */
    public static final EnumC0747h f3878f;

    /* renamed from: g */
    public static final EnumC0763x f3879g;

    /* renamed from: h */
    public static final EnumC0763x f3880h;

    /* renamed from: a */
    public final ThreadLocal f3881a;

    /* renamed from: b */
    public final ConcurrentHashMap f3882b;

    /* renamed from: c */
    public final C0043j f3883c;

    /* renamed from: d */
    public final C0928i f3884d;

    /* renamed from: e */
    public final List f3885e;

    static {
        C0748i c0748i = C0748i.f3870d;
        f3878f = EnumC0747h.f3868a;
        f3879g = EnumC0763x.f3890a;
        f3880h = EnumC0763x.f3891b;
    }

    public C0752m() {
        C0836h c0836h = C0836h.f4227c;
        Map emptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.f3881a = new ThreadLocal();
        this.f3882b = new ConcurrentHashMap();
        C0043j c0043j = new C0043j(emptyMap, 13, emptyList2);
        this.f3883c = c0043j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC0920a0.f4484A);
        C0759t c0759t = EnumC0763x.f3890a;
        EnumC0763x enumC0763x = f3879g;
        arrayList.add(enumC0763x == c0759t ? C0931l.f4534d : new C0930k(1, enumC0763x));
        arrayList.add(c0836h);
        arrayList.addAll(emptyList);
        arrayList.add(AbstractC0920a0.f4501p);
        arrayList.add(AbstractC0920a0.f4492g);
        arrayList.add(AbstractC0920a0.f4489d);
        arrayList.add(AbstractC0920a0.f4490e);
        arrayList.add(AbstractC0920a0.f4491f);
        C0940u c0940u = AbstractC0920a0.f4496k;
        arrayList.add(new C0910Q(Long.TYPE, Long.class, c0940u));
        arrayList.add(new C0910Q(Double.TYPE, Double.class, new C0749j(0)));
        arrayList.add(new C0910Q(Float.TYPE, Float.class, new C0749j(1)));
        C0760u c0760u = EnumC0763x.f3891b;
        EnumC0763x enumC0763x2 = f3880h;
        arrayList.add(enumC0763x2 == c0760u ? C0931l.f4533c : new C0930k(0, new C0931l(enumC0763x2)));
        arrayList.add(AbstractC0920a0.f4493h);
        arrayList.add(AbstractC0920a0.f4494i);
        arrayList.add(new C0909P(AtomicLong.class, new C0750k(new C0750k(c0940u, 0), 2), 0));
        arrayList.add(new C0909P(AtomicLongArray.class, new C0750k(new C0750k(c0940u, 1), 2), 0));
        arrayList.add(AbstractC0920a0.f4495j);
        arrayList.add(AbstractC0920a0.f4497l);
        arrayList.add(AbstractC0920a0.f4502q);
        arrayList.add(AbstractC0920a0.f4503r);
        arrayList.add(new C0909P(BigDecimal.class, AbstractC0920a0.f4498m, 0));
        arrayList.add(new C0909P(BigInteger.class, AbstractC0920a0.f4499n, 0));
        arrayList.add(new C0909P(C0838j.class, AbstractC0920a0.f4500o, 0));
        arrayList.add(AbstractC0920a0.f4504s);
        arrayList.add(AbstractC0920a0.f4505t);
        arrayList.add(AbstractC0920a0.f4507v);
        arrayList.add(AbstractC0920a0.f4508w);
        arrayList.add(AbstractC0920a0.f4510y);
        arrayList.add(AbstractC0920a0.f4506u);
        arrayList.add(AbstractC0920a0.f4487b);
        arrayList.add(C0926g.f4521c);
        arrayList.add(AbstractC0920a0.f4509x);
        if (AbstractC1000e.f4736a) {
            arrayList.add(AbstractC1000e.f4738c);
            arrayList.add(AbstractC1000e.f4737b);
            arrayList.add(AbstractC1000e.f4739d);
        }
        arrayList.add(C0921b.f4512c);
        arrayList.add(AbstractC0920a0.f4486a);
        arrayList.add(new C0923d(c0043j, 0));
        arrayList.add(new C0923d(c0043j, 1));
        C0928i c0928i = new C0928i(c0043j);
        this.f3884d = c0928i;
        arrayList.add(c0928i);
        arrayList.add(AbstractC0920a0.f4485B);
        arrayList.add(new C0937r(c0043j, f3878f, c0836h, c0928i, emptyList2));
        this.f3885e = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: a */
    public final Object m2197a(String str) {
        Class cls = ApiResponse.class;
        C1048a c1048a = new C1048a(cls);
        Object obj = null;
        if (str != null) {
            C1158a c1158a = new C1158a(new StringReader(str));
            c1158a.f5321o = 2;
            boolean z2 = true;
            c1158a.f5321o = 1;
            try {
                try {
                    try {
                        c1158a.m2788C();
                        z2 = false;
                        obj = m2198b(c1048a).mo2196a(c1158a);
                    } catch (Throwable th) {
                        c1158a.f5321o = 2;
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new C0755p(e2);
                } catch (IllegalStateException e3) {
                    throw new C0755p(e3);
                }
            } catch (EOFException e4) {
                if (!z2) {
                    throw new C0755p(e4);
                }
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e5.getMessage(), e5);
            }
            c1158a.f5321o = 2;
            if (obj != null) {
                try {
                    if (c1158a.m2788C() != 10) {
                        throw new C0755p("JSON document was not fully consumed.");
                    }
                } catch (C1160c e6) {
                    throw new C0755p(e6);
                } catch (IOException e7) {
                    throw new C0755p(e7);
                }
            }
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(obj);
    }

    /* renamed from: b */
    public final AbstractC0764y m2198b(C1048a c1048a) {
        boolean z2;
        ConcurrentHashMap concurrentHashMap = this.f3882b;
        AbstractC0764y abstractC0764y = (AbstractC0764y) concurrentHashMap.get(c1048a);
        if (abstractC0764y != null) {
            return abstractC0764y;
        }
        ThreadLocal threadLocal = this.f3881a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z2 = true;
        } else {
            AbstractC0764y abstractC0764y2 = (AbstractC0764y) map.get(c1048a);
            if (abstractC0764y2 != null) {
                return abstractC0764y2;
            }
            z2 = false;
        }
        try {
            C0751l c0751l = new C0751l();
            map.put(c1048a, c0751l);
            Iterator it = this.f3885e.iterator();
            AbstractC0764y abstractC0764y3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC0764y3 = ((InterfaceC0765z) it.next()).mo2205a(this, c1048a);
                if (abstractC0764y3 != null) {
                    if (c0751l.f3877a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c0751l.f3877a = abstractC0764y3;
                    map.put(c1048a, abstractC0764y3);
                }
            }
            if (z2) {
                threadLocal.remove();
            }
            if (abstractC0764y3 != null) {
                if (z2) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC0764y3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + c1048a);
        } catch (Throwable th) {
            if (z2) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f3885e + ",instanceCreators:" + this.f3883c + "}";
    }
}
