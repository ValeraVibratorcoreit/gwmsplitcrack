package p091o;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.f */
/* loaded from: classes.dex */
public class C1196f {

    /* renamed from: a */
    public final LinkedHashMap f5395a;

    /* renamed from: b */
    public int f5396b;

    /* renamed from: c */
    public int f5397c;

    /* renamed from: d */
    public int f5398d;

    /* renamed from: e */
    public int f5399e;

    public C1196f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5397c = i;
        this.f5395a = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: a */
    public final Object m2861a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f5395a.get(obj);
                if (obj2 != null) {
                    this.f5398d++;
                    return obj2;
                }
                this.f5399e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final Object m2862b(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f5396b++;
                put = this.f5395a.put(obj, obj2);
                if (put != null) {
                    this.f5396b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m2863c(this.f5397c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2863c(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f5396b < 0 || (this.f5395a.isEmpty() && this.f5396b != 0)) {
                        break;
                    }
                    if (this.f5396b <= i || this.f5395a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f5395a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f5395a.remove(key);
                    this.f5396b--;
                } finally {
                }
            }
        }
    }

    public final synchronized String toString() {
        int i;
        try {
            int i2 = this.f5398d;
            int i3 = this.f5399e + i2;
            i = i3 != 0 ? (i2 * 100) / i3 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f5397c + ",hits=" + this.f5398d + ",misses=" + this.f5399e + ",hitRate=" + i + "%]";
    }
}
