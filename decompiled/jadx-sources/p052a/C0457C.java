package p052a;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;
import p046X.C0379G;
import p046X.C0387O;
import p090n1.C1177a;

/* renamed from: a.C */
/* loaded from: classes.dex */
public final class C0457C {

    /* renamed from: a */
    public final Runnable f1463a;

    /* renamed from: b */
    public final C1177a f1464b = new C1177a();

    /* renamed from: c */
    public C0379G f1465c;

    /* renamed from: d */
    public final OnBackInvokedCallback f1466d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f1467e;

    /* renamed from: f */
    public boolean f1468f;

    /* renamed from: g */
    public boolean f1469g;

    public C0457C(Runnable runnable) {
        this.f1463a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f1466d = i >= 34 ? C0485y.f1538a.m1199a(new C0480t(this, 0), new C0480t(this, 1), new C0481u(this, 0), new C0481u(this, 1)) : C0483w.f1533a.m1196a(new C0481u(this, 2));
        }
    }

    /* renamed from: a */
    public final void m1167a() {
        Object obj;
        if (this.f1465c == null) {
            C1177a c1177a = this.f1464b;
            ListIterator<E> listIterator = c1177a.listIterator(c1177a.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((C0379G) obj).f1123a) {
                        break;
                    }
                }
            }
        }
        this.f1465c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: b */
    public final void m1168b() {
        C0379G c0379g;
        C0379G c0379g2 = this.f1465c;
        if (c0379g2 == null) {
            C1177a c1177a = this.f1464b;
            c1177a.getClass();
            ListIterator listIterator = c1177a.listIterator(c1177a.f5366c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0379g = 0;
                    break;
                } else {
                    c0379g = listIterator.previous();
                    if (((C0379G) c0379g).f1123a) {
                        break;
                    }
                }
            }
            c0379g2 = c0379g;
        }
        this.f1465c = null;
        if (c0379g2 == null) {
            this.f1463a.run();
            return;
        }
        C0387O c0387o = c0379g2.f1126d;
        c0387o.m1037y(true);
        if (c0387o.f1156h.f1123a) {
            c0387o.m998O();
        } else {
            c0387o.f1155g.m1168b();
        }
    }

    /* renamed from: c */
    public final void m1169c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1467e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1466d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0483w c0483w = C0483w.f1533a;
        if (z2 && !this.f1468f) {
            c0483w.m1197b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1468f = true;
        } else {
            if (z2 || !this.f1468f) {
                return;
            }
            c0483w.m1198c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1468f = false;
        }
    }

    /* renamed from: d */
    public final void m1170d() {
        boolean z2 = this.f1469g;
        boolean z3 = false;
        C1177a c1177a = this.f1464b;
        if (c1177a == null || !c1177a.isEmpty()) {
            Iterator<E> it = c1177a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0379G) it.next()).f1123a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1469g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m1169c(z3);
    }
}
