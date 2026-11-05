package p107t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p087m1.C1167b;
import p090n1.AbstractC1190n;
import p104s1.InterfaceC1417a;
import p104s1.InterfaceC1418b;
import p104s1.InterfaceC1419c;
import p104s1.InterfaceC1420d;
import p104s1.InterfaceC1421e;
import p104s1.InterfaceC1422f;
import p104s1.InterfaceC1423g;
import p104s1.InterfaceC1424h;
import p104s1.InterfaceC1425i;
import p104s1.InterfaceC1426j;
import p104s1.InterfaceC1427k;
import p104s1.InterfaceC1428l;
import p104s1.InterfaceC1429m;
import p104s1.InterfaceC1430n;
import p104s1.InterfaceC1431o;
import p104s1.InterfaceC1432p;
import p104s1.InterfaceC1433q;
import p104s1.InterfaceC1434r;
import p104s1.InterfaceC1435s;
import p104s1.InterfaceC1436t;
import p104s1.InterfaceC1437u;
import p104s1.InterfaceC1438v;
import p104s1.InterfaceC1439w;
import p119x1.InterfaceC1671a;
import p121y0.AbstractC1680h;
import p125z1.AbstractC1718g;

/* renamed from: t1.b */
/* loaded from: classes.dex */
public final class C1459b implements InterfaceC1671a, InterfaceC1458a {

    /* renamed from: b */
    public static final Map f7158b;

    /* renamed from: c */
    public static final HashMap f7159c;

    /* renamed from: a */
    public final Class f7160a;

    static {
        List asList = Arrays.asList(InterfaceC1417a.class, InterfaceC1428l.class, InterfaceC1432p.class, InterfaceC1433q.class, InterfaceC1434r.class, InterfaceC1435s.class, InterfaceC1436t.class, InterfaceC1437u.class, InterfaceC1438v.class, InterfaceC1439w.class, InterfaceC1418b.class, InterfaceC1419c.class, InterfaceC1420d.class, InterfaceC1421e.class, InterfaceC1422f.class, InterfaceC1423g.class, InterfaceC1424h.class, InterfaceC1425i.class, InterfaceC1426j.class, InterfaceC1427k.class, InterfaceC1429m.class, InterfaceC1430n.class, InterfaceC1431o.class);
        AbstractC1461d.m3493d("asList(this)", asList);
        ArrayList arrayList = new ArrayList(asList.size());
        int i = 0;
        for (Object obj : asList) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C1167b((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f7158b = AbstractC1190n.m2836d0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC1461d.m3493d("primitiveFqNames.values", values);
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC1461d.m3493d("kotlinName", str);
            sb.append(AbstractC1718g.m4993v0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f7158b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f7159c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1190n.m2835c0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC1718g.m4993v0((String) entry2.getValue()));
        }
    }

    public C1459b(Class cls) {
        this.f7160a = cls;
    }

    @Override // p107t1.InterfaceC1458a
    /* renamed from: a */
    public final Class mo3489a() {
        return this.f7160a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1459b) && AbstractC1680h.m4875q(this).equals(AbstractC1680h.m4875q((InterfaceC1671a) obj));
    }

    public final int hashCode() {
        return AbstractC1680h.m4875q(this).hashCode();
    }

    public final String toString() {
        return this.f7160a.toString() + " (Kotlin reflection is not available)";
    }
}
