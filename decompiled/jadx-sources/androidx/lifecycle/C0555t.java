package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p002A1.C0033a;
import p006C.AbstractC0062j;
import p038T.C0316j;
import p071g0.C0888a;
import p085m.C1161a;
import p088n.C1170a;
import p088n.C1171b;
import p088n.C1172c;
import p088n.C1173d;
import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public final class C0555t {

    /* renamed from: a */
    public final boolean f1999a;

    /* renamed from: b */
    public C1170a f2000b;

    /* renamed from: c */
    public EnumC0548m f2001c;

    /* renamed from: d */
    public final WeakReference f2002d;

    /* renamed from: e */
    public int f2003e;

    /* renamed from: f */
    public boolean f2004f;

    /* renamed from: g */
    public boolean f2005g;

    /* renamed from: h */
    public final ArrayList f2006h;

    /* renamed from: i */
    public final C0033a f2007i;

    public C0555t(InterfaceC0553r interfaceC0553r) {
        AbstractC1461d.m3494e("provider", interfaceC0553r);
        new AtomicReference(null);
        this.f1999a = true;
        this.f2000b = new C1170a();
        EnumC0548m enumC0548m = EnumC0548m.f1991b;
        this.f2001c = enumC0548m;
        this.f2006h = new ArrayList();
        this.f2002d = new WeakReference(interfaceC0553r);
        this.f2007i = new C0033a(enumC0548m);
    }

    /* renamed from: a */
    public final void m1377a(InterfaceC0552q interfaceC0552q) {
        InterfaceC0551p c0540e;
        InterfaceC0553r interfaceC0553r;
        ArrayList arrayList = this.f2006h;
        Object obj = null;
        m1379c("addObserver");
        EnumC0548m enumC0548m = this.f2001c;
        EnumC0548m enumC0548m2 = EnumC0548m.f1990a;
        if (enumC0548m != enumC0548m2) {
            enumC0548m2 = EnumC0548m.f1991b;
        }
        C0554s c0554s = new C0554s();
        HashMap hashMap = AbstractC0556u.f2008a;
        boolean z2 = interfaceC0552q instanceof InterfaceC0551p;
        boolean z3 = interfaceC0552q instanceof C0316j;
        if (z2 && z3) {
            c0540e = new C0540e((C0316j) interfaceC0552q, r3, (InterfaceC0551p) interfaceC0552q);
        } else if (z3) {
            c0540e = new C0540e((C0316j) interfaceC0552q, r3, obj);
        } else if (z2) {
            c0540e = (InterfaceC0551p) interfaceC0552q;
        } else {
            Class<?> cls = interfaceC0552q.getClass();
            if (AbstractC0556u.m1387c(cls) == 2) {
                Object obj2 = AbstractC0556u.f2009b.get(cls);
                AbstractC1461d.m3491b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0556u.m1385a((Constructor) list.get(0), interfaceC0552q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0542g[] interfaceC0542gArr = new InterfaceC0542g[size];
                if (size > 0) {
                    AbstractC0556u.m1385a((Constructor) list.get(0), interfaceC0552q);
                    throw null;
                }
                c0540e = new C0888a(3, interfaceC0542gArr);
            } else {
                c0540e = new C0540e(interfaceC0552q);
            }
        }
        c0554s.f1998b = c0540e;
        c0554s.f1997a = enumC0548m2;
        C1170a c1170a = this.f2000b;
        C1172c mo2825a = c1170a.mo2825a(interfaceC0552q);
        if (mo2825a != null) {
            obj = mo2825a.f5352b;
        } else {
            HashMap hashMap2 = c1170a.f5347e;
            C1172c c1172c = new C1172c(interfaceC0552q, c0554s);
            c1170a.f5361d++;
            C1172c c1172c2 = c1170a.f5359b;
            if (c1172c2 == null) {
                c1170a.f5358a = c1172c;
                c1170a.f5359b = c1172c;
            } else {
                c1172c2.f5353c = c1172c;
                c1172c.f5354d = c1172c2;
                c1170a.f5359b = c1172c;
            }
            hashMap2.put(interfaceC0552q, c1172c);
        }
        if (((C0554s) obj) == null && (interfaceC0553r = (InterfaceC0553r) this.f2002d.get()) != null) {
            r3 = (this.f2003e != 0 || this.f2004f) ? 1 : 0;
            EnumC0548m m1378b = m1378b(interfaceC0552q);
            this.f2003e++;
            while (c0554s.f1997a.compareTo(m1378b) < 0 && this.f2000b.f5347e.containsKey(interfaceC0552q)) {
                arrayList.add(c0554s.f1997a);
                C0545j c0545j = EnumC0547l.Companion;
                EnumC0548m enumC0548m3 = c0554s.f1997a;
                c0545j.getClass();
                EnumC0547l m1374a = C0545j.m1374a(enumC0548m3);
                if (m1374a == null) {
                    throw new IllegalStateException("no event up from " + c0554s.f1997a);
                }
                c0554s.m1376a(interfaceC0553r, m1374a);
                arrayList.remove(arrayList.size() - 1);
                m1378b = m1378b(interfaceC0552q);
            }
            if (r3 == 0) {
                m1384h();
            }
            this.f2003e--;
        }
    }

    /* renamed from: b */
    public final EnumC0548m m1378b(InterfaceC0552q interfaceC0552q) {
        C0554s c0554s;
        HashMap hashMap = this.f2000b.f5347e;
        C1172c c1172c = hashMap.containsKey(interfaceC0552q) ? ((C1172c) hashMap.get(interfaceC0552q)).f5354d : null;
        EnumC0548m enumC0548m = (c1172c == null || (c0554s = (C0554s) c1172c.f5352b) == null) ? null : c0554s.f1997a;
        ArrayList arrayList = this.f2006h;
        EnumC0548m enumC0548m2 = arrayList.isEmpty() ? null : (EnumC0548m) arrayList.get(arrayList.size() - 1);
        EnumC0548m enumC0548m3 = this.f2001c;
        AbstractC1461d.m3494e("state1", enumC0548m3);
        if (enumC0548m == null || enumC0548m.compareTo(enumC0548m3) >= 0) {
            enumC0548m = enumC0548m3;
        }
        return (enumC0548m2 == null || enumC0548m2.compareTo(enumC0548m) >= 0) ? enumC0548m : enumC0548m2;
    }

    /* renamed from: c */
    public final void m1379c(String str) {
        if (this.f1999a) {
            C1161a.m2823c0().f5335d.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0062j.m161o("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* renamed from: d */
    public final void m1380d(EnumC0547l enumC0547l) {
        AbstractC1461d.m3494e("event", enumC0547l);
        m1379c("handleLifecycleEvent");
        m1381e(enumC0547l.m1375a());
    }

    /* renamed from: e */
    public final void m1381e(EnumC0548m enumC0548m) {
        EnumC0548m enumC0548m2 = this.f2001c;
        if (enumC0548m2 == enumC0548m) {
            return;
        }
        EnumC0548m enumC0548m3 = EnumC0548m.f1991b;
        EnumC0548m enumC0548m4 = EnumC0548m.f1990a;
        if (enumC0548m2 == enumC0548m3 && enumC0548m == enumC0548m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0548m + ", but was " + this.f2001c + " in component " + this.f2002d.get()).toString());
        }
        this.f2001c = enumC0548m;
        if (this.f2004f || this.f2003e != 0) {
            this.f2005g = true;
            return;
        }
        this.f2004f = true;
        m1384h();
        this.f2004f = false;
        if (this.f2001c == enumC0548m4) {
            this.f2000b = new C1170a();
        }
    }

    /* renamed from: f */
    public final void m1382f(InterfaceC0552q interfaceC0552q) {
        AbstractC1461d.m3494e("observer", interfaceC0552q);
        m1379c("removeObserver");
        this.f2000b.mo2826b(interfaceC0552q);
    }

    /* renamed from: g */
    public final void m1383g(EnumC0548m enumC0548m) {
        m1379c("setCurrentState");
        m1381e(enumC0548m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f2005g = false;
        r0 = r7.f2001c;
        r1 = r7.f2007i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = p005B1.AbstractC0052a.f192a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = p002A1.C0033a.f110c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (p107t1.AbstractC1461d.m3490a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f111b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f111b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f111b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r2 != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r1.f111b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f111b = r0 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1384h() {
        InterfaceC0553r interfaceC0553r = (InterfaceC0553r) this.f2002d.get();
        if (interfaceC0553r == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1170a c1170a = this.f2000b;
            if (c1170a.f5361d != 0) {
                C1172c c1172c = c1170a.f5358a;
                AbstractC1461d.m3491b(c1172c);
                EnumC0548m enumC0548m = ((C0554s) c1172c.f5352b).f1997a;
                C1172c c1172c2 = this.f2000b.f5359b;
                AbstractC1461d.m3491b(c1172c2);
                EnumC0548m enumC0548m2 = ((C0554s) c1172c2.f5352b).f1997a;
                if (enumC0548m == enumC0548m2 && this.f2001c == enumC0548m2) {
                    break;
                }
                this.f2005g = false;
                EnumC0548m enumC0548m3 = this.f2001c;
                C1172c c1172c3 = this.f2000b.f5358a;
                AbstractC1461d.m3491b(c1172c3);
                if (enumC0548m3.compareTo(((C0554s) c1172c3.f5352b).f1997a) < 0) {
                    C1170a c1170a2 = this.f2000b;
                    C1171b c1171b = new C1171b(c1170a2.f5359b, c1170a2.f5358a, 1);
                    c1170a2.f5360c.put(c1171b, Boolean.FALSE);
                    while (c1171b.hasNext() && !this.f2005g) {
                        Map.Entry entry = (Map.Entry) c1171b.next();
                        AbstractC1461d.m3493d("next()", entry);
                        InterfaceC0552q interfaceC0552q = (InterfaceC0552q) entry.getKey();
                        C0554s c0554s = (C0554s) entry.getValue();
                        while (c0554s.f1997a.compareTo(this.f2001c) > 0 && !this.f2005g && this.f2000b.f5347e.containsKey(interfaceC0552q)) {
                            C0545j c0545j = EnumC0547l.Companion;
                            EnumC0548m enumC0548m4 = c0554s.f1997a;
                            c0545j.getClass();
                            AbstractC1461d.m3494e("state", enumC0548m4);
                            int ordinal = enumC0548m4.ordinal();
                            EnumC0547l enumC0547l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0547l.ON_PAUSE : EnumC0547l.ON_STOP : EnumC0547l.ON_DESTROY;
                            if (enumC0547l == null) {
                                throw new IllegalStateException("no event down from " + c0554s.f1997a);
                            }
                            this.f2006h.add(enumC0547l.m1375a());
                            c0554s.m1376a(interfaceC0553r, enumC0547l);
                            this.f2006h.remove(r4.size() - 1);
                        }
                    }
                }
                C1172c c1172c4 = this.f2000b.f5359b;
                if (!this.f2005g && c1172c4 != null && this.f2001c.compareTo(((C0554s) c1172c4.f5352b).f1997a) > 0) {
                    C1170a c1170a3 = this.f2000b;
                    c1170a3.getClass();
                    C1173d c1173d = new C1173d(c1170a3);
                    c1170a3.f5360c.put(c1173d, Boolean.FALSE);
                    while (c1173d.hasNext() && !this.f2005g) {
                        Map.Entry entry2 = (Map.Entry) c1173d.next();
                        InterfaceC0552q interfaceC0552q2 = (InterfaceC0552q) entry2.getKey();
                        C0554s c0554s2 = (C0554s) entry2.getValue();
                        while (c0554s2.f1997a.compareTo(this.f2001c) < 0 && !this.f2005g && this.f2000b.f5347e.containsKey(interfaceC0552q2)) {
                            this.f2006h.add(c0554s2.f1997a);
                            C0545j c0545j2 = EnumC0547l.Companion;
                            EnumC0548m enumC0548m5 = c0554s2.f1997a;
                            c0545j2.getClass();
                            EnumC0547l m1374a = C0545j.m1374a(enumC0548m5);
                            if (m1374a == null) {
                                throw new IllegalStateException("no event up from " + c0554s2.f1997a);
                            }
                            c0554s2.m1376a(interfaceC0553r, m1374a);
                            this.f2006h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
