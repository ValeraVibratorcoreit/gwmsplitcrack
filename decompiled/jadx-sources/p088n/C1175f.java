package p088n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.f */
/* loaded from: classes.dex */
public class C1175f implements Iterable {

    /* renamed from: a */
    public C1172c f5358a;

    /* renamed from: b */
    public C1172c f5359b;

    /* renamed from: c */
    public final WeakHashMap f5360c = new WeakHashMap();

    /* renamed from: d */
    public int f5361d = 0;

    /* renamed from: a */
    public C1172c mo2825a(Object obj) {
        C1172c c1172c = this.f5358a;
        while (c1172c != null && !c1172c.f5351a.equals(obj)) {
            c1172c = c1172c.f5353c;
        }
        return c1172c;
    }

    /* renamed from: b */
    public Object mo2826b(Object obj) {
        C1172c mo2825a = mo2825a(obj);
        if (mo2825a == null) {
            return null;
        }
        this.f5361d--;
        WeakHashMap weakHashMap = this.f5360c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1174e) it.next()).mo2827a(mo2825a);
            }
        }
        C1172c c1172c = mo2825a.f5354d;
        if (c1172c != null) {
            c1172c.f5353c = mo2825a.f5353c;
        } else {
            this.f5358a = mo2825a.f5353c;
        }
        C1172c c1172c2 = mo2825a.f5353c;
        if (c1172c2 != null) {
            c1172c2.f5354d = c1172c;
        } else {
            this.f5359b = c1172c;
        }
        mo2825a.f5353c = null;
        mo2825a.f5354d = null;
        return mo2825a.f5352b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p088n.C1171b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1175f)) {
            return false;
        }
        C1175f c1175f = (C1175f) obj;
        if (this.f5361d != c1175f.f5361d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1175f.iterator();
        while (true) {
            C1171b c1171b = (C1171b) it;
            if (!c1171b.hasNext()) {
                break;
            }
            C1171b c1171b2 = (C1171b) it2;
            if (!c1171b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1171b.next();
            Object next = c1171b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C1171b c1171b = (C1171b) it;
            if (!c1171b.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c1171b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1171b c1171b = new C1171b(this.f5358a, this.f5359b, 0);
        this.f5360c.put(c1171b, Boolean.FALSE);
        return c1171b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1171b c1171b = (C1171b) it;
            if (!c1171b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1171b.next()).toString());
            if (c1171b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
