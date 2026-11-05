package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: androidx.lifecycle.Q */
/* loaded from: classes.dex */
public final class C0534Q {

    /* renamed from: a */
    public final LinkedHashMap f1977a = new LinkedHashMap();

    /* renamed from: a */
    public final void m1370a() {
        LinkedHashMap linkedHashMap = this.f1977a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0532O) it.next()).m1369a();
        }
        linkedHashMap.clear();
    }
}
