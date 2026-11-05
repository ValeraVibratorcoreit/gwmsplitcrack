package p085m;

import p121y0.AbstractC1687o;

/* renamed from: m.a */
/* loaded from: classes.dex */
public final class C1161a extends AbstractC1687o {

    /* renamed from: e */
    public static volatile C1161a f5334e;

    /* renamed from: d */
    public final C1163c f5335d = new C1163c();

    /* renamed from: c0 */
    public static C1161a m2823c0() {
        if (f5334e != null) {
            return f5334e;
        }
        synchronized (C1161a.class) {
            try {
                if (f5334e == null) {
                    f5334e = new C1161a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5334e;
    }
}
