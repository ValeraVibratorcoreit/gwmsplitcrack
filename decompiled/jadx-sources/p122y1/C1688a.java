package p122y1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: y1.a */
/* loaded from: classes.dex */
public final class C1688a implements InterfaceC1691d {

    /* renamed from: a */
    public final AtomicReference f9621a;

    public C1688a(C1690c c1690c) {
        this.f9621a = new AtomicReference(c1690c);
    }

    @Override // p122y1.InterfaceC1691d
    public final Iterator iterator() {
        InterfaceC1691d interfaceC1691d = (InterfaceC1691d) this.f9621a.getAndSet(null);
        if (interfaceC1691d != null) {
            return interfaceC1691d.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
