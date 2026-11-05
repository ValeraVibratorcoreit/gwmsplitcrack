package p052a;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.AbstractC0522E;
import androidx.lifecycle.AbstractC0528K;
import androidx.lifecycle.C0534Q;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0548m;
import androidx.lifecycle.FragmentC0524G;
import androidx.lifecycle.InterfaceC0535S;
import androidx.lifecycle.InterfaceC0543h;
import androidx.lifecycle.InterfaceC0553r;
import com.altaysoft.t500_split.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p020J.InterfaceC0143a;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p022K.InterfaceC0196j;
import p045W0.C0355e;
import p046X.C0380H;
import p046X.C0424w;
import p046X.C0426y;
import p053a0.C0489c;
import p055b.C0562a;
import p055b.InterfaceC0563b;
import p070g.AbstractActivityC0870i;
import p071g0.C0888a;
import p071g0.C0891d;
import p071g0.C0892e;
import p071g0.InterfaceC0893f;
import p087m1.C1168c;
import p104s1.InterfaceC1417a;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p123z.C1698f;
import p123z.C1701i;

/* renamed from: a.l */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0472l extends Activity implements InterfaceC0535S, InterfaceC0543h, InterfaceC0893f, InterfaceC0458D, InterfaceC0553r, InterfaceC0196j {

    /* renamed from: x */
    public static final /* synthetic */ int f1500x = 0;

    /* renamed from: f */
    public final C0555t f1501f = new C0555t(this);

    /* renamed from: g */
    public final C0562a f1502g = new C0562a();

    /* renamed from: h */
    public final C0198k f1503h;

    /* renamed from: i */
    public final C0892e f1504i;

    /* renamed from: j */
    public C0534Q f1505j;

    /* renamed from: k */
    public final ViewTreeObserverOnDrawListenerC0469i f1506k;

    /* renamed from: l */
    public final C1168c f1507l;

    /* renamed from: m */
    public final AtomicInteger f1508m;

    /* renamed from: n */
    public final C0470j f1509n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f1510o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f1511p;

    /* renamed from: q */
    public final CopyOnWriteArrayList f1512q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f1513r;

    /* renamed from: s */
    public final CopyOnWriteArrayList f1514s;

    /* renamed from: t */
    public final CopyOnWriteArrayList f1515t;

    /* renamed from: u */
    public boolean f1516u;

    /* renamed from: v */
    public boolean f1517v;

    /* renamed from: w */
    public final C1168c f1518w;

    public AbstractActivityC0472l() {
        AbstractActivityC0870i abstractActivityC0870i = (AbstractActivityC0870i) this;
        this.f1503h = new C0198k(new RunnableC0464d(abstractActivityC0870i, 0));
        C0892e c0892e = new C0892e(this);
        this.f1504i = c0892e;
        this.f1506k = new ViewTreeObserverOnDrawListenerC0469i(abstractActivityC0870i);
        this.f1507l = new C1168c(new C0471k(abstractActivityC0870i, 1));
        this.f1508m = new AtomicInteger();
        this.f1509n = new C0470j(abstractActivityC0870i);
        this.f1510o = new CopyOnWriteArrayList();
        this.f1511p = new CopyOnWriteArrayList();
        this.f1512q = new CopyOnWriteArrayList();
        this.f1513r = new CopyOnWriteArrayList();
        this.f1514s = new CopyOnWriteArrayList();
        this.f1515t = new CopyOnWriteArrayList();
        C0555t c0555t = this.f1501f;
        if (c0555t == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        c0555t.m1377a(new C0465e(0, abstractActivityC0870i));
        this.f1501f.m1377a(new C0465e(1, abstractActivityC0870i));
        this.f1501f.m1377a(new C0888a(2, abstractActivityC0870i));
        c0892e.m2467a();
        AbstractC0528K.m1366d(this);
        c0892e.f4475b.m2465e("android:support:activity-result", new C0424w(1, abstractActivityC0870i));
        m1186g(new C0426y(abstractActivityC0870i, 1));
        this.f1518w = new C1168c(new C0471k(abstractActivityC0870i, 2));
    }

    @Override // androidx.lifecycle.InterfaceC0543h
    /* renamed from: a */
    public final C0489c mo1065a() {
        C0489c c0489c = new C0489c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0489c.f1544a;
        if (application != null) {
            C0355e c0355e = AbstractC0528K.f1970d;
            Application application2 = getApplication();
            AbstractC1461d.m3493d("application", application2);
            linkedHashMap.put(c0355e, application2);
        }
        linkedHashMap.put(AbstractC0528K.f1967a, this);
        linkedHashMap.put(AbstractC0528K.f1968b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC0528K.f1969c, extras);
        }
        return c0489c;
    }

    @Override // p071g0.InterfaceC0893f
    /* renamed from: b */
    public final C0891d mo1066b() {
        return this.f1504i.f4475b;
    }

    @Override // androidx.lifecycle.InterfaceC0535S
    /* renamed from: c */
    public final C0534Q mo1067c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1505j == null) {
            C0468h c0468h = (C0468h) getLastNonConfigurationInstance();
            if (c0468h != null) {
                this.f1505j = c0468h.f1485a;
            }
            if (this.f1505j == null) {
                this.f1505j = new C0534Q();
            }
        }
        C0534Q c0534q = this.f1505j;
        AbstractC1461d.m3491b(c0534q);
        return c0534q;
    }

    @Override // androidx.lifecycle.InterfaceC0553r
    /* renamed from: d */
    public final C0555t mo1068d() {
        return this.f1501f;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1461d.m3494e("event", keyEvent);
        AbstractC1461d.m3493d("window.decorView", getWindow().getDecorView());
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1461d.m3494e("event", keyEvent);
        AbstractC1461d.m3493d("window.decorView", getWindow().getDecorView());
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    /* renamed from: f */
    public final void m1185f(InterfaceC0143a interfaceC0143a) {
        AbstractC1461d.m3494e("listener", interfaceC0143a);
        this.f1510o.add(interfaceC0143a);
    }

    /* renamed from: g */
    public final void m1186g(InterfaceC0563b interfaceC0563b) {
        C0562a c0562a = this.f1502g;
        c0562a.getClass();
        AbstractActivityC0472l abstractActivityC0472l = c0562a.f2165b;
        if (abstractActivityC0472l != null) {
            interfaceC0563b.mo1141a(abstractActivityC0472l);
        }
        c0562a.f2164a.add(interfaceC0563b);
    }

    /* renamed from: h */
    public final C0457C m1187h() {
        return (C0457C) this.f1518w.m2824a();
    }

    /* renamed from: i */
    public final void m1188i(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC0524G.f1965g;
        AbstractC0522E.m1361b(this);
    }

    /* renamed from: j */
    public final void m1189j(Bundle bundle) {
        AbstractC1461d.m3494e("outState", bundle);
        this.f1501f.m1383g(EnumC0548m.f1992c);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f1509n.m1179a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        m1187h().m1168b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC1461d.m3494e("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1510o.iterator();
        while (it.hasNext()) {
            ((InterfaceC0143a) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1504i.m2468b(bundle);
        C0562a c0562a = this.f1502g;
        c0562a.getClass();
        c0562a.f2165b = this;
        Iterator it = c0562a.f2164a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0563b) it.next()).mo1141a(this);
        }
        m1188i(bundle);
        int i = FragmentC0524G.f1965g;
        AbstractC0522E.m1361b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        AbstractC1461d.m3494e("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1503h.f534c).iterator();
        while (it.hasNext()) {
            ((C0380H) it.next()).f1127a.m1022j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        AbstractC1461d.m3494e("item", menuItem);
        boolean z2 = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1503h.f534c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((C0380H) it.next()).f1127a.m1027o()) {
                break;
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f1516u) {
            return;
        }
        Iterator it = this.f1513r.iterator();
        while (it.hasNext()) {
            ((InterfaceC0143a) it.next()).accept(new C1698f(z2));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC1461d.m3494e("intent", intent);
        super.onNewIntent(intent);
        Iterator it = this.f1512q.iterator();
        while (it.hasNext()) {
            ((InterfaceC0143a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        AbstractC1461d.m3494e("menu", menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1503h.f534c).iterator();
        while (it.hasNext()) {
            ((C0380H) it.next()).f1127a.m1028p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f1517v) {
            return;
        }
        Iterator it = this.f1514s.iterator();
        while (it.hasNext()) {
            ((InterfaceC0143a) it.next()).accept(new C1701i(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        AbstractC1461d.m3494e("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1503h.f534c).iterator();
        while (it.hasNext()) {
            ((C0380H) it.next()).f1127a.m1031s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC1461d.m3494e("permissions", strArr);
        AbstractC1461d.m3494e("grantResults", iArr);
        if (this.f1509n.m1179a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0468h c0468h;
        C0534Q c0534q = this.f1505j;
        if (c0534q == null && (c0468h = (C0468h) getLastNonConfigurationInstance()) != null) {
            c0534q = c0468h.f1485a;
        }
        if (c0534q == null) {
            return null;
        }
        C0468h c0468h2 = new C0468h();
        c0468h2.f1485a = c0534q;
        return c0468h2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC1461d.m3494e("outState", bundle);
        C0555t c0555t = this.f1501f;
        if (c0555t != null) {
            EnumC0548m enumC0548m = EnumC0548m.f1992c;
            c0555t.m1379c("setCurrentState");
            c0555t.m1381e(enumC0548m);
        }
        m1189j(bundle);
        this.f1504i.m2469c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1511p.iterator();
        while (it.hasNext()) {
            ((InterfaceC0143a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1515t.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC1680h.m4880v()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0479s c0479s = (C0479s) this.f1507l.m2824a();
            synchronized (c0479s.f1524a) {
                try {
                    c0479s.f1525b = true;
                    Iterator it = c0479s.f1526c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1417a) it.next()).mo1164a();
                    }
                    c0479s.f1526c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        View decorView = getWindow().getDecorView();
        AbstractC1461d.m3493d("window.decorView", decorView);
        AbstractC0528K.m1368f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1461d.m3493d("window.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1461d.m3493d("window.decorView", decorView3);
        AbstractC1687o.m4928W(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1461d.m3493d("window.decorView", decorView4);
        AbstractC1680h.m4854P(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC1461d.m3493d("window.decorView", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        AbstractC1461d.m3493d("window.decorView", decorView6);
        ViewTreeObserverOnDrawListenerC0469i viewTreeObserverOnDrawListenerC0469i = this.f1506k;
        viewTreeObserverOnDrawListenerC0469i.getClass();
        if (!viewTreeObserverOnDrawListenerC0469i.f1488c) {
            viewTreeObserverOnDrawListenerC0469i.f1488c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0469i);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        AbstractC1461d.m3494e("intent", intent);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        AbstractC1461d.m3494e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AbstractC1461d.m3494e("intent", intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        AbstractC1461d.m3494e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        AbstractC1461d.m3494e("newConfig", configuration);
        this.f1516u = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1516u = false;
            Iterator it = this.f1513r.iterator();
            while (it.hasNext()) {
                ((InterfaceC0143a) it.next()).accept(new C1698f(z2));
            }
        } catch (Throwable th) {
            this.f1516u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        AbstractC1461d.m3494e("newConfig", configuration);
        this.f1517v = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1517v = false;
            Iterator it = this.f1514s.iterator();
            while (it.hasNext()) {
                ((InterfaceC0143a) it.next()).accept(new C1701i(z2));
            }
        } catch (Throwable th) {
            this.f1517v = false;
            throw th;
        }
    }
}
