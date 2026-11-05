package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import p001A0.RunnableC0020n;
import p022K.AbstractC0169Q;
import p038T.AbstractC0308b;
import p038T.C0316j;
import p038T.RunnableC0318l;
import p071g0.C0891d;
import p092o0.C1206d;
import p098q0.C1375z1;

/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public final class C0540e implements InterfaceC0551p {

    /* renamed from: a */
    public final /* synthetic */ int f1986a;

    /* renamed from: b */
    public final Object f1987b;

    /* renamed from: c */
    public final Object f1988c;

    public /* synthetic */ C0540e(Object obj, int i, Object obj2) {
        this.f1986a = i;
        this.f1987b = obj;
        this.f1988c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0551p
    /* renamed from: d */
    public final void mo1177d(InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l) {
        Object obj = this.f1988c;
        Object obj2 = this.f1987b;
        switch (this.f1986a) {
            case 0:
                int i = AbstractC0539d.f1985a[enumC0547l.ordinal()];
                C0316j c0316j = (C0316j) obj2;
                if (i == 3) {
                    c0316j.f900b.getClass();
                    AbstractC0308b.m874a(Looper.getMainLooper()).postDelayed(new RunnableC0318l(0), 500L);
                    c0316j.f899a.m1382f(c0316j);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0551p interfaceC0551p = (InterfaceC0551p) obj;
                if (interfaceC0551p != null) {
                    interfaceC0551p.mo1177d(interfaceC0553r, enumC0547l);
                    return;
                }
                return;
            case 1:
                if (enumC0547l == EnumC0547l.ON_START) {
                    ((C0555t) obj2).m1382f(this);
                    ((C0891d) obj).m2466f();
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((C0536a) obj).f1978a;
                InterfaceC0552q interfaceC0552q = (InterfaceC0552q) obj2;
                C0536a.m1371a((List) hashMap.get(enumC0547l), interfaceC0553r, enumC0547l, interfaceC0552q);
                C0536a.m1371a((List) hashMap.get(EnumC0547l.ON_ANY), interfaceC0553r, enumC0547l, interfaceC0552q);
                return;
            case 3:
                C1375z1 c1375z1 = (C1375z1) obj;
                if (c1375z1.f6455d.m995L()) {
                    return;
                }
                interfaceC0553r.mo1068d().m1382f(this);
                C1206d c1206d = (C1206d) obj2;
                FrameLayout frameLayout = (FrameLayout) c1206d.f3995a;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                if (frameLayout.isAttachedToWindow()) {
                    c1375z1.m3325n(c1206d);
                    return;
                }
                return;
            default:
                if (enumC0547l == EnumC0547l.ON_DESTROY) {
                    ((Handler) obj2).removeCallbacks((RunnableC0020n) obj);
                    interfaceC0553r.mo1068d().m1382f(this);
                    return;
                }
                return;
        }
    }

    public C0540e(InterfaceC0552q interfaceC0552q) {
        this.f1986a = 2;
        this.f1987b = interfaceC0552q;
        C0538c c0538c = C0538c.f1982c;
        Class<?> cls = interfaceC0552q.getClass();
        C0536a c0536a = (C0536a) c0538c.f1983a.get(cls);
        this.f1988c = c0536a == null ? c0538c.m1373a(cls, null) : c0536a;
    }

    public C0540e(C1375z1 c1375z1, C1206d c1206d) {
        this.f1986a = 3;
        this.f1988c = c1375z1;
        this.f1987b = c1206d;
    }
}
