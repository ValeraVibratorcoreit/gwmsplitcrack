package p001A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: A0.h */
/* loaded from: classes.dex */
public final class C0014h {

    /* renamed from: a */
    public final String[] f40a;

    /* renamed from: b */
    public final List f41b;

    /* renamed from: c */
    public final Map f42c;

    public C0014h(String[] strArr, ArrayList arrayList) {
        this.f40a = strArr;
        this.f41b = Collections.unmodifiableList(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0013g c0013g = (C0013g) it.next();
            for (String str : c0013g.f38d) {
                linkedHashMap.put(AbstractC0015i.m24d(str), c0013g);
            }
        }
        this.f42c = Collections.unmodifiableMap(linkedHashMap);
    }
}
