package p063d1;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: d1.n */
/* loaded from: classes.dex */
public final class C0753n extends AbstractC0754o implements Iterable {

    /* renamed from: a */
    public final ArrayList f3886a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0753n) && ((C0753n) obj).f3886a.equals(this.f3886a));
    }

    public final int hashCode() {
        return this.f3886a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3886a.iterator();
    }
}
