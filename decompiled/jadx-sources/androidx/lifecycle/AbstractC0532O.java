package androidx.lifecycle;

import java.util.Iterator;
import p056b0.C0564a;

/* renamed from: androidx.lifecycle.O */
/* loaded from: classes.dex */
public abstract class AbstractC0532O {

    /* renamed from: a */
    public final C0564a f1976a = new C0564a();

    /* renamed from: a */
    public final void m1369a() {
        C0564a c0564a = this.f1976a;
        if (c0564a != null && !c0564a.f2169d) {
            c0564a.f2169d = true;
            synchronized (c0564a.f2166a) {
                try {
                    Iterator it = c0564a.f2167b.values().iterator();
                    while (it.hasNext()) {
                        C0564a.m1574a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0564a.f2168c.iterator();
                    while (it2.hasNext()) {
                        C0564a.m1574a((AutoCloseable) it2.next());
                    }
                    c0564a.f2168c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo1040b();
    }

    /* renamed from: b */
    public void mo1040b() {
    }
}
