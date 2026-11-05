package p038T;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.viewpager2.widget.ViewPager2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p011E.InterfaceMenuItemC0092a;
import p020J.C0145c;
import p022K.AbstractC0169Q;
import p024L.C0235e;
import p040U.C0336a;
import p040U.C0337b;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0390S;
import p046X.C0394W;
import p076j.AbstractC0952a;
import p076j.C0956e;
import p079k.MenuC1002B;
import p079k.MenuC1018m;
import p079k.MenuItemC1025t;
import p091o.C1192b;
import p091o.C1195e;
import p091o.C1201k;
import p095p0.C1231j;
import p121y0.AbstractC1687o;

/* renamed from: T.t */
/* loaded from: classes.dex */
public final class C0326t {

    /* renamed from: a */
    public final Object f923a;

    /* renamed from: b */
    public final Object f924b;

    /* renamed from: c */
    public Object f925c;

    /* renamed from: d */
    public Object f926d;

    public C0326t(int i) {
        switch (i) {
            case 3:
                this.f923a = new C1192b();
                this.f924b = new SparseArray();
                this.f925c = new C1195e();
                this.f926d = new C1192b();
                break;
            case 4:
            default:
                this.f923a = new ArrayList();
                this.f924b = new HashMap();
                this.f925c = new HashMap();
                break;
            case 5:
                this.f923a = new C0145c(10);
                this.f924b = new C1201k();
                this.f925c = new ArrayList();
                this.f926d = new HashSet();
                break;
        }
    }

    /* renamed from: a */
    public void m908a(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (((ArrayList) this.f923a).contains(abstractComponentCallbacksC0423v)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0423v);
        }
        synchronized (((ArrayList) this.f923a)) {
            ((ArrayList) this.f923a).add(abstractComponentCallbacksC0423v);
        }
        abstractComponentCallbacksC0423v.f1367p = true;
    }

    /* renamed from: b */
    public void m909b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1201k) this.f924b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m909b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: c */
    public AbstractComponentCallbacksC0423v m910c(String str) {
        C0394W c0394w = (C0394W) ((HashMap) this.f924b).get(str);
        if (c0394w != null) {
            return c0394w.f1209c;
        }
        return null;
    }

    /* renamed from: d */
    public AbstractComponentCallbacksC0423v m911d(String str) {
        for (C0394W c0394w : ((HashMap) this.f924b).values()) {
            if (c0394w != null) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
                if (!str.equals(abstractComponentCallbacksC0423v.f1361j)) {
                    abstractComponentCallbacksC0423v = abstractComponentCallbacksC0423v.f1376y.f1151c.m911d(str);
                }
                if (abstractComponentCallbacksC0423v != null) {
                    return abstractComponentCallbacksC0423v;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public C0956e m912e(AbstractC0952a abstractC0952a) {
        ArrayList arrayList = (ArrayList) this.f925c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0956e c0956e = (C0956e) arrayList.get(i);
            if (c0956e != null && c0956e.f4582b == abstractC0952a) {
                return c0956e;
            }
        }
        C0956e c0956e2 = new C0956e((Context) this.f924b, abstractC0952a);
        arrayList.add(c0956e2);
        return c0956e2;
    }

    /* renamed from: f */
    public ArrayList m913f() {
        ArrayList arrayList = new ArrayList();
        for (C0394W c0394w : ((HashMap) this.f924b).values()) {
            if (c0394w != null) {
                arrayList.add(c0394w);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public ArrayList m914g() {
        ArrayList arrayList = new ArrayList();
        for (C0394W c0394w : ((HashMap) this.f924b).values()) {
            if (c0394w != null) {
                arrayList.add(c0394w.f1209c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public List m915h() {
        ArrayList arrayList;
        if (((ArrayList) this.f923a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f923a)) {
            arrayList = new ArrayList((ArrayList) this.f923a);
        }
        return arrayList;
    }

    /* renamed from: i */
    public void m916i(C0394W c0394w) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
        String str = abstractComponentCallbacksC0423v.f1361j;
        HashMap hashMap = (HashMap) this.f924b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0423v.f1361j, c0394w);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0423v);
        }
    }

    /* renamed from: j */
    public void m917j(C0394W c0394w) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
        if (abstractComponentCallbacksC0423v.f1338F) {
            ((C0390S) this.f926d).m1043e(abstractComponentCallbacksC0423v);
        }
        HashMap hashMap = (HashMap) this.f924b;
        if (hashMap.get(abstractComponentCallbacksC0423v.f1361j) == c0394w && ((C0394W) hashMap.put(abstractComponentCallbacksC0423v.f1361j, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0423v);
        }
    }

    /* renamed from: k */
    public boolean m918k(AbstractC0952a abstractC0952a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f923a).onActionItemClicked(m912e(abstractC0952a), new MenuItemC1025t((Context) this.f924b, (InterfaceMenuItemC0092a) menuItem));
    }

    /* renamed from: l */
    public boolean m919l(AbstractC0952a abstractC0952a, MenuC1018m menuC1018m) {
        C0956e m912e = m912e(abstractC0952a);
        C1201k c1201k = (C1201k) this.f926d;
        Menu menu = (Menu) c1201k.getOrDefault(menuC1018m, null);
        if (menu == null) {
            menu = new MenuC1002B((Context) this.f924b, menuC1018m);
            c1201k.put(menuC1018m, menu);
        }
        return ((ActionMode.Callback) this.f923a).onCreateActionMode(m912e, menu);
    }

    /* renamed from: m */
    public void m920m() {
        int mo2089a;
        int i = R.id.accessibilityActionPageLeft;
        ViewPager2 viewPager2 = (ViewPager2) this.f926d;
        AbstractC0169Q.m502g(viewPager2, R.id.accessibilityActionPageLeft);
        AbstractC0169Q.m500e(viewPager2, 0);
        AbstractC0169Q.m502g(viewPager2, R.id.accessibilityActionPageRight);
        AbstractC0169Q.m500e(viewPager2, 0);
        AbstractC0169Q.m502g(viewPager2, R.id.accessibilityActionPageUp);
        AbstractC0169Q.m500e(viewPager2, 0);
        AbstractC0169Q.m502g(viewPager2, R.id.accessibilityActionPageDown);
        AbstractC0169Q.m500e(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (mo2089a = viewPager2.getAdapter().mo2089a()) == 0 || !viewPager2.f2161w) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        C1231j c1231j = (C1231j) this.f924b;
        C1231j c1231j2 = (C1231j) this.f923a;
        if (orientation != 0) {
            if (viewPager2.f2147i < mo2089a - 1) {
                AbstractC0169Q.m503h(viewPager2, new C0235e(R.id.accessibilityActionPageDown), c1231j2);
            }
            if (viewPager2.f2147i > 0) {
                AbstractC0169Q.m503h(viewPager2, new C0235e(R.id.accessibilityActionPageUp), c1231j);
                return;
            }
            return;
        }
        boolean z2 = viewPager2.f2150l.m2227C() == 1;
        int i2 = z2 ? 16908360 : 16908361;
        if (z2) {
            i = 16908361;
        }
        if (viewPager2.f2147i < mo2089a - 1) {
            AbstractC0169Q.m503h(viewPager2, new C0235e(i2), c1231j2);
        }
        if (viewPager2.f2147i > 0) {
            AbstractC0169Q.m503h(viewPager2, new C0235e(i), c1231j);
        }
    }

    public C0326t(Typeface typeface, C0337b c0337b) {
        int i;
        int i2;
        this.f926d = typeface;
        this.f923a = c0337b;
        this.f925c = new C0325s(1024);
        int m415a = c0337b.m415a(6);
        if (m415a != 0) {
            int i3 = m415a + c0337b.f467a;
            i = ((ByteBuffer) c0337b.f470d).getInt(((ByteBuffer) c0337b.f470d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f924b = new char[i * 2];
        int m415a2 = c0337b.m415a(6);
        if (m415a2 != 0) {
            int i4 = m415a2 + c0337b.f467a;
            i2 = ((ByteBuffer) c0337b.f470d).getInt(((ByteBuffer) c0337b.f470d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C0329w c0329w = new C0329w(this, i5);
            C0336a m928c = c0329w.m928c();
            int m415a3 = m928c.m415a(4);
            Character.toChars(m415a3 != 0 ? ((ByteBuffer) m928c.f470d).getInt(m415a3 + m928c.f467a) : 0, (char[]) this.f924b, i5 * 2);
            AbstractC1687o.m4937f("invalid metadata codepoint length", c0329w.m927b() > 0);
            ((C0325s) this.f925c).m907a(c0329w, 0, c0329w.m927b() - 1);
        }
    }

    public C0326t(Context context, ActionMode.Callback callback) {
        this.f924b = context;
        this.f923a = callback;
        this.f925c = new ArrayList();
        this.f926d = new C1201k();
    }

    public C0326t(ViewPager2 viewPager2) {
        this.f926d = viewPager2;
        this.f923a = new C1231j(this, 0);
        this.f924b = new C1231j(this, 1);
    }
}
