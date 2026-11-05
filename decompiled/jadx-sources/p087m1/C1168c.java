package p087m1;

import java.io.Serializable;
import p104s1.InterfaceC1417a;
import p107t1.AbstractC1461d;
import p107t1.AbstractC1462e;

/* renamed from: m1.c */
/* loaded from: classes.dex */
public final class C1168c implements Serializable {

    /* renamed from: a */
    public AbstractC1462e f5341a;

    /* renamed from: b */
    public volatile Object f5342b = C1169d.f5344b;

    /* renamed from: c */
    public final Object f5343c = this;

    /* JADX WARN: Multi-variable type inference failed */
    public C1168c(InterfaceC1417a interfaceC1417a) {
        this.f5341a = (AbstractC1462e) interfaceC1417a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, s1.a, t1.e] */
    /* renamed from: a */
    public final Object m2824a() {
        Object obj;
        Object obj2 = this.f5342b;
        C1169d c1169d = C1169d.f5344b;
        if (obj2 != c1169d) {
            return obj2;
        }
        synchronized (this.f5343c) {
            obj = this.f5342b;
            if (obj == c1169d) {
                ?? r1 = this.f5341a;
                AbstractC1461d.m3491b(r1);
                obj = r1.mo1164a();
                this.f5342b = obj;
                this.f5341a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f5342b != C1169d.f5344b ? String.valueOf(m2824a()) : "Lazy value not initialized yet.";
    }
}
