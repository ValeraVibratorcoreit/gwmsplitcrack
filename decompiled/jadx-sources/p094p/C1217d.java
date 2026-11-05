package p094p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010D1.AbstractC0088l;

/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C1217d extends AbstractC0088l {

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f5452c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f5453d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f5454e;

    /* renamed from: f */
    public final AtomicReferenceFieldUpdater f5455f;

    /* renamed from: g */
    public final AtomicReferenceFieldUpdater f5456g;

    public C1217d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5452c = atomicReferenceFieldUpdater;
        this.f5453d = atomicReferenceFieldUpdater2;
        this.f5454e = atomicReferenceFieldUpdater3;
        this.f5455f = atomicReferenceFieldUpdater4;
        this.f5456g = atomicReferenceFieldUpdater5;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: f0 */
    public final void mo305f0(C1219f c1219f, C1219f c1219f2) {
        this.f5453d.lazySet(c1219f, c1219f2);
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: g0 */
    public final void mo306g0(C1219f c1219f, Thread thread) {
        this.f5452c.lazySet(c1219f, thread);
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: l */
    public final boolean mo311l(AbstractFutureC1220g abstractFutureC1220g, C1216c c1216c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1216c c1216c2 = C1216c.f5450b;
        do {
            atomicReferenceFieldUpdater = this.f5455f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1220g, c1216c, c1216c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1220g) == c1216c);
        return false;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: m */
    public final boolean mo313m(AbstractFutureC1220g abstractFutureC1220g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5456g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1220g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1220g) == obj);
        return false;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: n */
    public final boolean mo315n(AbstractFutureC1220g abstractFutureC1220g, C1219f c1219f, C1219f c1219f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5454e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1220g, c1219f, c1219f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1220g) == c1219f);
        return false;
    }
}
