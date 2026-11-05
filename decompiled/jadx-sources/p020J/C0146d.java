package p020J;

/* renamed from: J.d */
/* loaded from: classes.dex */
public final class C0146d extends C0145c {

    /* renamed from: c */
    public final Object f453c;

    public C0146d(int i) {
        super(i);
        this.f453c = new Object();
    }

    @Override // p020J.C0145c
    /* renamed from: a */
    public final Object mo401a() {
        Object mo401a;
        synchronized (this.f453c) {
            mo401a = super.mo401a();
        }
        return mo401a;
    }

    @Override // p020J.C0145c
    /* renamed from: c */
    public final boolean mo403c(Object obj) {
        boolean mo403c;
        synchronized (this.f453c) {
            mo403c = super.mo403c(obj);
        }
        return mo403c;
    }
}
