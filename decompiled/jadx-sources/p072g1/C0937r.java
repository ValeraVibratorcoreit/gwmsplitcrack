package p072g1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p063d1.AbstractC0764y;
import p063d1.C0749j;
import p063d1.C0752m;
import p063d1.C0755p;
import p063d1.EnumC0747h;
import p063d1.InterfaceC0765z;
import p066e1.InterfaceC0768a;
import p066e1.InterfaceC0769b;
import p069f1.AbstractC0832d;
import p069f1.C0836h;
import p075i1.AbstractC0951c;
import p081k1.C1048a;
import p121y0.AbstractC1687o;

/* renamed from: g1.r */
/* loaded from: classes.dex */
public final class C0937r implements InterfaceC0765z {

    /* renamed from: a */
    public final C0043j f4551a;

    /* renamed from: b */
    public final EnumC0747h f4552b;

    /* renamed from: c */
    public final C0836h f4553c;

    /* renamed from: d */
    public final C0928i f4554d;

    /* renamed from: e */
    public final List f4555e;

    public C0937r(C0043j c0043j, EnumC0747h enumC0747h, C0836h c0836h, C0928i c0928i, List list) {
        this.f4551a = c0043j;
        this.f4552b = enumC0747h;
        this.f4553c = c0836h;
        this.f4554d = c0928i;
        this.f4555e = list;
    }

    /* renamed from: b */
    public static void m2477b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC0951c.m2492c(field) + " and " + AbstractC0951c.m2492c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        Class cls = c1048a.f4990a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC1687o abstractC1687o = AbstractC0951c.f4566a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C0749j(2);
        }
        AbstractC0832d.m2355f(this.f4555e);
        return AbstractC0951c.f4566a.mo2486A(cls) ? new C0936q(cls, m2478c(c0752m, c1048a, cls, true)) : new C0934o(this.f4551a.m95z(c1048a), m2478c(c0752m, c1048a, cls, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01af, code lost:
    
        r11 = new p081k1.C1048a(p069f1.AbstractC0832d.m2359j(r1, r12, r12.getGenericSuperclass(), new java.util.HashMap()));
        r12 = r11.f4990a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b8  */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0935p m2478c(C0752m c0752m, C1048a c1048a, Class cls, boolean z2) {
        boolean z3;
        Method method;
        InterfaceC0769b interfaceC0769b;
        boolean z4;
        ?? r15;
        ?? r4;
        List singletonList;
        InterfaceC0768a interfaceC0768a;
        C1048a c1048a2;
        String str;
        boolean z5;
        Field field;
        int i;
        AbstractC0764y abstractC0764y;
        if (cls.isInterface()) {
            return C0935p.f4545b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C1048a c1048a3 = c1048a;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                AbstractC0832d.m2355f(this.f4555e);
            }
            int length = declaredFields.length;
            boolean z6 = false;
            int i2 = 0;
            while (true) {
                Type type = c1048a3.f4991b;
                if (i2 < length) {
                    Field field2 = declaredFields[i2];
                    boolean m2479d = m2479d(field2, true);
                    boolean m2479d2 = m2479d(field2, z6);
                    if (m2479d || m2479d2) {
                        if (!z2) {
                            z3 = m2479d2;
                        } else if (Modifier.isStatic(field2.getModifiers())) {
                            z3 = z6;
                        } else {
                            Method mo2487p = AbstractC0951c.f4566a.mo2487p(field2, cls2);
                            AbstractC0951c.m2495f(mo2487p);
                            if (mo2487p.getAnnotation(InterfaceC0769b.class) != null && field2.getAnnotation(InterfaceC0769b.class) == null) {
                                throw new C0755p(AbstractC0062j.m161o("@SerializedName on ", AbstractC0951c.m2493d(mo2487p, z6), " is not supported"));
                            }
                            z3 = m2479d2;
                            method = mo2487p;
                            if (method == null) {
                                AbstractC0951c.m2495f(field2);
                            }
                            Type m2359j = AbstractC0832d.m2359j(type, cls2, field2.getGenericType(), new HashMap());
                            interfaceC0769b = (InterfaceC0769b) field2.getAnnotation(InterfaceC0769b.class);
                            if (interfaceC0769b != null) {
                                singletonList = Collections.singletonList(this.f4552b.mo2193b(field2));
                            } else {
                                String value = interfaceC0769b.value();
                                String[] alternate = interfaceC0769b.alternate();
                                if (alternate.length == 0) {
                                    singletonList = Collections.singletonList(value);
                                } else {
                                    z4 = true;
                                    ArrayList arrayList = new ArrayList(alternate.length + 1);
                                    arrayList.add(value);
                                    Collections.addAll(arrayList, alternate);
                                    r15 = arrayList;
                                    r4 = 0;
                                    String str2 = (String) r15.get(r4);
                                    C1048a c1048a4 = new C1048a(m2359j);
                                    Class cls3 = c1048a4.f4990a;
                                    boolean z7 = (cls3 == null && cls3.isPrimitive()) ? z4 : r4;
                                    int modifiers = field2.getModifiers();
                                    boolean z8 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r4 : z4;
                                    interfaceC0768a = (InterfaceC0768a) field2.getAnnotation(InterfaceC0768a.class);
                                    if (interfaceC0768a != null) {
                                        c1048a2 = c1048a4;
                                        str = str2;
                                        z5 = false;
                                        field = field2;
                                        i = i2;
                                        abstractC0764y = this.f4554d.m2472b(this.f4551a, c0752m, c1048a2, interfaceC0768a, false);
                                    } else {
                                        c1048a2 = c1048a4;
                                        str = str2;
                                        z5 = r4;
                                        field = field2;
                                        i = i2;
                                        abstractC0764y = null;
                                    }
                                    boolean z9 = abstractC0764y != null ? z4 : z5;
                                    C1048a c1048a5 = c1048a2;
                                    if (abstractC0764y == null) {
                                        abstractC0764y = c0752m.m2198b(c1048a5);
                                    }
                                    C0932m c0932m = new C0932m(str, field, false, method, m2479d ? z9 ? abstractC0764y : new C0931l(c0752m, abstractC0764y, c1048a5.f4991b) : abstractC0764y, abstractC0764y, z7, z8);
                                    if (z3) {
                                        for (String str3 : r15) {
                                            C0932m c0932m2 = (C0932m) linkedHashMap.put(str3, c0932m);
                                            if (c0932m2 != null) {
                                                m2477b(cls, str3, c0932m2.f4537a, field);
                                                throw null;
                                            }
                                        }
                                    }
                                    Field field3 = field;
                                    if (m2479d) {
                                        String str4 = str;
                                        C0932m c0932m3 = (C0932m) linkedHashMap2.put(str4, c0932m);
                                        if (c0932m3 != null) {
                                            m2477b(cls, str4, c0932m3.f4537a, field3);
                                            throw null;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            r4 = z6;
                            z4 = true;
                            r15 = singletonList;
                            String str22 = (String) r15.get(r4);
                            C1048a c1048a42 = new C1048a(m2359j);
                            Class cls32 = c1048a42.f4990a;
                            if (cls32 == null) {
                            }
                            int modifiers2 = field2.getModifiers();
                            if (Modifier.isStatic(modifiers2)) {
                            }
                            interfaceC0768a = (InterfaceC0768a) field2.getAnnotation(InterfaceC0768a.class);
                            if (interfaceC0768a != null) {
                            }
                            if (abstractC0764y != null) {
                            }
                            C1048a c1048a52 = c1048a2;
                            if (abstractC0764y == null) {
                            }
                            if (m2479d) {
                            }
                            C0932m c0932m4 = new C0932m(str, field, false, method, m2479d ? z9 ? abstractC0764y : new C0931l(c0752m, abstractC0764y, c1048a52.f4991b) : abstractC0764y, abstractC0764y, z7, z8);
                            if (z3) {
                            }
                            Field field32 = field;
                            if (m2479d) {
                            }
                        }
                        method = null;
                        if (method == null) {
                        }
                        Type m2359j2 = AbstractC0832d.m2359j(type, cls2, field2.getGenericType(), new HashMap());
                        interfaceC0769b = (InterfaceC0769b) field2.getAnnotation(InterfaceC0769b.class);
                        if (interfaceC0769b != null) {
                        }
                        r4 = z6;
                        z4 = true;
                        r15 = singletonList;
                        String str222 = (String) r15.get(r4);
                        C1048a c1048a422 = new C1048a(m2359j2);
                        Class cls322 = c1048a422.f4990a;
                        if (cls322 == null) {
                        }
                        int modifiers22 = field2.getModifiers();
                        if (Modifier.isStatic(modifiers22)) {
                        }
                        interfaceC0768a = (InterfaceC0768a) field2.getAnnotation(InterfaceC0768a.class);
                        if (interfaceC0768a != null) {
                        }
                        if (abstractC0764y != null) {
                        }
                        C1048a c1048a522 = c1048a2;
                        if (abstractC0764y == null) {
                        }
                        if (m2479d) {
                        }
                        C0932m c0932m42 = new C0932m(str, field, false, method, m2479d ? z9 ? abstractC0764y : new C0931l(c0752m, abstractC0764y, c1048a522.f4991b) : abstractC0764y, abstractC0764y, z7, z8);
                        if (z3) {
                        }
                        Field field322 = field;
                        if (m2479d) {
                        }
                    } else {
                        i = i2;
                        z5 = z6;
                    }
                    i2 = i + 1;
                    z6 = z5;
                }
            }
        }
        return new C0935p(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    /* renamed from: d */
    public final boolean m2479d(Field field, boolean z2) {
        boolean z3;
        C0836h c0836h = this.f4553c;
        c0836h.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || c0836h.m2362b(field.getType(), z2)) {
            z3 = true;
        } else {
            List list = z2 ? c0836h.f4228a : c0836h.f4229b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z3 = false;
        }
        return !z3;
    }
}
