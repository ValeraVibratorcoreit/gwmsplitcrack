package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import p001A0.RunnableC0020n;
import p006C.AbstractC0062j;
import p085m.C1161a;
import p085m.C1163c;
import p088n.C1171b;
import p088n.C1172c;
import p088n.C1173d;
import p088n.C1175f;

/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public class C0560y {

    /* renamed from: k */
    public static final Object f2016k = new Object();

    /* renamed from: a */
    public final Object f2017a;

    /* renamed from: b */
    public final C1175f f2018b;

    /* renamed from: c */
    public int f2019c;

    /* renamed from: d */
    public boolean f2020d;

    /* renamed from: e */
    public volatile Object f2021e;

    /* renamed from: f */
    public volatile Object f2022f;

    /* renamed from: g */
    public int f2023g;

    /* renamed from: h */
    public boolean f2024h;

    /* renamed from: i */
    public boolean f2025i;

    /* renamed from: j */
    public final RunnableC0020n f2026j;

    public C0560y(Object obj) {
        this.f2017a = new Object();
        this.f2018b = new C1175f();
        this.f2019c = 0;
        this.f2022f = f2016k;
        this.f2026j = new RunnableC0020n(8, this);
        this.f2021e = obj;
        this.f2023g = 0;
    }

    /* renamed from: a */
    public static void m1392a(String str) {
        C1161a.m2823c0().f5335d.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0062j.m161o("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m1393b(AbstractC0559x abstractC0559x) {
        if (abstractC0559x.f2013b) {
            if (!abstractC0559x.mo1388e()) {
                abstractC0559x.m1391a(false);
                return;
            }
            int i = abstractC0559x.f2014c;
            int i2 = this.f2023g;
            if (i >= i2) {
                return;
            }
            abstractC0559x.f2014c = i2;
            abstractC0559x.f2012a.mo1100a(this.f2021e);
        }
    }

    /* renamed from: c */
    public final void m1394c(AbstractC0559x abstractC0559x) {
        if (this.f2024h) {
            this.f2025i = true;
            return;
        }
        this.f2024h = true;
        do {
            this.f2025i = false;
            if (abstractC0559x != null) {
                m1393b(abstractC0559x);
                abstractC0559x = null;
            } else {
                C1175f c1175f = this.f2018b;
                c1175f.getClass();
                C1173d c1173d = new C1173d(c1175f);
                c1175f.f5360c.put(c1173d, Boolean.FALSE);
                while (c1173d.hasNext()) {
                    m1393b((AbstractC0559x) ((Map.Entry) c1173d.next()).getValue());
                    if (this.f2025i) {
                        break;
                    }
                }
            }
        } while (this.f2025i);
        this.f2024h = false;
    }

    /* renamed from: d */
    public final Object m1395d() {
        Object obj = this.f2021e;
        if (obj != f2016k) {
            return obj;
        }
        return null;
    }

    /* renamed from: e */
    public final void m1396e(InterfaceC0553r interfaceC0553r, InterfaceC0561z interfaceC0561z) {
        Object obj;
        m1392a("observe");
        if (interfaceC0553r.mo1068d().f2001c == EnumC0548m.f1990a) {
            return;
        }
        C0558w c0558w = new C0558w(this, interfaceC0553r, interfaceC0561z);
        C1175f c1175f = this.f2018b;
        C1172c mo2825a = c1175f.mo2825a(interfaceC0561z);
        if (mo2825a != null) {
            obj = mo2825a.f5352b;
        } else {
            C1172c c1172c = new C1172c(interfaceC0561z, c0558w);
            c1175f.f5361d++;
            C1172c c1172c2 = c1175f.f5359b;
            if (c1172c2 == null) {
                c1175f.f5358a = c1172c;
                c1175f.f5359b = c1172c;
            } else {
                c1172c2.f5353c = c1172c;
                c1172c.f5354d = c1172c2;
                c1175f.f5359b = c1172c;
            }
            obj = null;
        }
        AbstractC0559x abstractC0559x = (AbstractC0559x) obj;
        if (abstractC0559x != null && !abstractC0559x.mo1390c(interfaceC0553r)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0559x != null) {
            return;
        }
        interfaceC0553r.mo1068d().m1377a(c0558w);
    }

    /* renamed from: f */
    public final void m1397f(InterfaceC0561z interfaceC0561z) {
        Object obj;
        m1392a("observeForever");
        C0557v c0557v = new C0557v(this, interfaceC0561z);
        C1175f c1175f = this.f2018b;
        C1172c mo2825a = c1175f.mo2825a(interfaceC0561z);
        if (mo2825a != null) {
            obj = mo2825a.f5352b;
        } else {
            C1172c c1172c = new C1172c(interfaceC0561z, c0557v);
            c1175f.f5361d++;
            C1172c c1172c2 = c1175f.f5359b;
            if (c1172c2 == null) {
                c1175f.f5358a = c1172c;
                c1175f.f5359b = c1172c;
            } else {
                c1172c2.f5353c = c1172c;
                c1172c.f5354d = c1172c2;
                c1175f.f5359b = c1172c;
            }
            obj = null;
        }
        AbstractC0559x abstractC0559x = (AbstractC0559x) obj;
        if (abstractC0559x instanceof C0558w) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0559x != null) {
            return;
        }
        c0557v.m1391a(true);
    }

    /* renamed from: g */
    public final void m1398g(Object obj) {
        boolean z2;
        synchronized (this.f2017a) {
            z2 = this.f2022f == f2016k;
            this.f2022f = obj;
        }
        if (z2) {
            C1161a m2823c0 = C1161a.m2823c0();
            RunnableC0020n runnableC0020n = this.f2026j;
            C1163c c1163c = m2823c0.f5335d;
            if (c1163c.f5338e == null) {
                synchronized (c1163c.f5337d) {
                    try {
                        if (c1163c.f5338e == null) {
                            c1163c.f5338e = Handler.createAsync(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c1163c.f5338e.post(runnableC0020n);
        }
    }

    /* renamed from: h */
    public final void m1399h(InterfaceC0561z interfaceC0561z) {
        m1392a("removeObserver");
        AbstractC0559x abstractC0559x = (AbstractC0559x) this.f2018b.mo2826b(interfaceC0561z);
        if (abstractC0559x == null) {
            return;
        }
        abstractC0559x.mo1389b();
        abstractC0559x.m1391a(false);
    }

    /* renamed from: i */
    public final void m1400i(InterfaceC0553r interfaceC0553r) {
        m1392a("removeObservers");
        Iterator it = this.f2018b.iterator();
        while (true) {
            C1171b c1171b = (C1171b) it;
            if (!c1171b.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) c1171b.next();
            if (((AbstractC0559x) entry.getValue()).mo1390c(interfaceC0553r)) {
                m1399h((InterfaceC0561z) entry.getKey());
            }
        }
    }

    /* renamed from: j */
    public final void m1401j(Object obj) {
        m1392a("setValue");
        this.f2023g++;
        this.f2021e = obj;
        m1394c(null);
    }

    public C0560y() {
        this.f2017a = new Object();
        this.f2018b = new C1175f();
        this.f2019c = 0;
        Object obj = f2016k;
        this.f2022f = obj;
        this.f2026j = new RunnableC0020n(8, this);
        this.f2021e = obj;
        this.f2023g = -1;
    }
}
