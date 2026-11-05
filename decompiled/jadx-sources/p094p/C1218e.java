package p094p;

import p010D1.AbstractC0088l;

/* renamed from: p.e */
/* loaded from: classes.dex */
public final class C1218e extends AbstractC0088l {
    @Override // p010D1.AbstractC0088l
    /* renamed from: f0 */
    public final void mo305f0(C1219f c1219f, C1219f c1219f2) {
        c1219f.f5459b = c1219f2;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: g0 */
    public final void mo306g0(C1219f c1219f, Thread thread) {
        c1219f.f5458a = thread;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: l */
    public final boolean mo311l(AbstractFutureC1220g abstractFutureC1220g, C1216c c1216c) {
        C1216c c1216c2 = C1216c.f5450b;
        synchronized (abstractFutureC1220g) {
            try {
                if (abstractFutureC1220g.f5465b != c1216c) {
                    return false;
                }
                abstractFutureC1220g.f5465b = c1216c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: m */
    public final boolean mo313m(AbstractFutureC1220g abstractFutureC1220g, Object obj, Object obj2) {
        synchronized (abstractFutureC1220g) {
            try {
                if (abstractFutureC1220g.f5464a != obj) {
                    return false;
                }
                abstractFutureC1220g.f5464a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: n */
    public final boolean mo315n(AbstractFutureC1220g abstractFutureC1220g, C1219f c1219f, C1219f c1219f2) {
        synchronized (abstractFutureC1220g) {
            try {
                if (abstractFutureC1220g.f5466c != c1219f) {
                    return false;
                }
                abstractFutureC1220g.f5466c = c1219f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
