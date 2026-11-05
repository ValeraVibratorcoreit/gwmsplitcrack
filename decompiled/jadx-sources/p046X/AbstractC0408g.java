package p046X;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import android.view.View;
import com.altaysoft.t500_split.media.C0633a;
import java.util.LinkedHashSet;
import p011E.InterfaceMenuItemC0092a;
import p014G.C0102c;
import p070g.LayoutInflaterFactory2C0887z;
import p079k.MenuItemC1025t;
import p091o.C1201k;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1687o;

/* renamed from: X.g */
/* loaded from: classes.dex */
public abstract class AbstractC0408g {

    /* renamed from: a */
    public Object f1283a;

    /* renamed from: b */
    public Object f1284b;

    public AbstractC0408g(Context context) {
        this.f1283a = context;
    }

    /* renamed from: c */
    public void m1084c() {
        C0633a c0633a = (C0633a) this.f1283a;
        if (c0633a != null) {
            try {
                ((LayoutInflaterFactory2C0887z) this.f1284b).f4455p.unregisterReceiver(c0633a);
            } catch (IllegalArgumentException unused) {
            }
            this.f1283a = null;
        }
    }

    /* renamed from: d */
    public void m1085d() {
        C0401b0 c0401b0 = (C0401b0) this.f1283a;
        C0102c c0102c = (C0102c) this.f1284b;
        LinkedHashSet linkedHashSet = c0401b0.f1267e;
        if (linkedHashSet.remove(c0102c) && linkedHashSet.isEmpty()) {
            c0401b0.m1080b();
        }
    }

    /* renamed from: e */
    public abstract IntentFilter mo1086e();

    /* renamed from: f */
    public abstract int mo1087f();

    /* renamed from: g */
    public MenuItem m1088g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0092a)) {
            return menuItem;
        }
        InterfaceMenuItemC0092a interfaceMenuItemC0092a = (InterfaceMenuItemC0092a) menuItem;
        if (((C1201k) this.f1284b) == null) {
            this.f1284b = new C1201k();
        }
        MenuItem menuItem2 = (MenuItem) ((C1201k) this.f1284b).getOrDefault(interfaceMenuItemC0092a, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1025t menuItemC1025t = new MenuItemC1025t((Context) this.f1283a, interfaceMenuItemC0092a);
        ((C1201k) this.f1284b).put(interfaceMenuItemC0092a, menuItemC1025t);
        return menuItemC1025t;
    }

    /* renamed from: h */
    public boolean m1089h() {
        C0401b0 c0401b0 = (C0401b0) this.f1283a;
        View view = c0401b0.f1265c.f1342J;
        AbstractC1461d.m3493d("operation.fragment.mView", view);
        int m4934c = AbstractC1687o.m4934c(view);
        int i = c0401b0.f1263a;
        return m4934c == i || !(m4934c == 2 || i == 2);
    }

    /* renamed from: i */
    public abstract void mo1090i();

    /* renamed from: j */
    public void m1091j() {
        m1084c();
        IntentFilter mo1086e = mo1086e();
        if (mo1086e.countActions() == 0) {
            return;
        }
        if (((C0633a) this.f1283a) == null) {
            this.f1283a = new C0633a(1, this);
        }
        ((LayoutInflaterFactory2C0887z) this.f1284b).f4455p.registerReceiver((C0633a) this.f1283a, mo1086e);
    }

    public AbstractC0408g(C0401b0 c0401b0, C0102c c0102c) {
        this.f1283a = c0401b0;
        this.f1284b = c0102c;
    }

    public AbstractC0408g(LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z) {
        this.f1284b = layoutInflaterFactory2C0887z;
    }
}
