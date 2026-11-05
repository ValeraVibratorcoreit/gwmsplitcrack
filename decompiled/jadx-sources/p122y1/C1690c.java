package p122y1;

import java.util.Iterator;

/* renamed from: y1.c */
/* loaded from: classes.dex */
public final class C1690c implements InterfaceC1691d {

    /* renamed from: a */
    public final C1692e f9625a;

    public C1690c(C1692e c1692e) {
        this.f9625a = c1692e;
    }

    @Override // p122y1.InterfaceC1691d
    public final Iterator iterator() {
        return new C1689b(this);
    }
}
