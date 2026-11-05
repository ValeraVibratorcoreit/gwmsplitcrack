package p090n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p087m1.C1167b;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1687o;

/* renamed from: n1.n */
/* loaded from: classes.dex */
public abstract class AbstractC1190n extends AbstractC1687o {
    /* renamed from: c0 */
    public static int m2835c0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: d0 */
    public static Map m2836d0(ArrayList arrayList) {
        C1188l c1188l = C1188l.f5369a;
        int size = arrayList.size();
        if (size == 0) {
            return c1188l;
        }
        if (size == 1) {
            C1167b c1167b = (C1167b) arrayList.get(0);
            AbstractC1461d.m3494e("pair", c1167b);
            Map singletonMap = Collections.singletonMap(c1167b.f5339a, c1167b.f5340b);
            AbstractC1461d.m3493d("singletonMap(pair.first, pair.second)", singletonMap);
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m2835c0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1167b c1167b2 = (C1167b) it.next();
            linkedHashMap.put(c1167b2.f5339a, c1167b2.f5340b);
        }
        return linkedHashMap;
    }
}
