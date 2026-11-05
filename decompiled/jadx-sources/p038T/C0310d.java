package p038T;

import android.os.Build;
import java.util.ArrayList;
import p010D1.AbstractC0088l;
import p016H.RunnableC0109a;
import p022K.C0198k;
import p121y0.AbstractC1687o;

/* renamed from: T.d */
/* loaded from: classes.dex */
public final class C0310d extends AbstractC1687o {

    /* renamed from: d */
    public final /* synthetic */ C0311e f881d;

    public C0310d(C0311e c0311e) {
        this.f881d = c0311e;
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: H */
    public final void mo875H(Throwable th) {
        this.f881d.f882a.m898d(th);
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: I */
    public final void mo876I(C0326t c0326t) {
        C0311e c0311e = this.f881d;
        c0311e.f884c = c0326t;
        C0326t c0326t2 = c0311e.f884c;
        C0315i c0315i = c0311e.f882a;
        c0311e.f883b = new C0198k(c0326t2, c0315i.f896g, c0315i.f898i, Build.VERSION.SDK_INT >= 34 ? AbstractC0319m.m901a() : AbstractC0088l.m259F());
        C0315i c0315i2 = c0311e.f882a;
        c0315i2.getClass();
        ArrayList arrayList = new ArrayList();
        c0315i2.f890a.writeLock().lock();
        try {
            c0315i2.f892c = 1;
            arrayList.addAll(c0315i2.f891b);
            c0315i2.f891b.clear();
            c0315i2.f890a.writeLock().unlock();
            c0315i2.f893d.post(new RunnableC0109a(arrayList, c0315i2.f892c, (Throwable) null));
        } catch (Throwable th) {
            c0315i2.f890a.writeLock().unlock();
            throw th;
        }
    }
}
