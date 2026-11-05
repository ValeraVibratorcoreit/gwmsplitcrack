package p046X;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0528K;
import androidx.lifecycle.C0534Q;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.C0560y;
import androidx.lifecycle.EnumC0548m;
import androidx.lifecycle.InterfaceC0535S;
import androidx.lifecycle.InterfaceC0543h;
import androidx.lifecycle.InterfaceC0553r;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.RunnableC0020n;
import p001A0.RunnableC0024r;
import p006C.AbstractC0062j;
import p053a0.C0489c;
import p070g.AbstractActivityC0870i;
import p071g0.C0891d;
import p071g0.C0892e;
import p071g0.InterfaceC0893f;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: X.v */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0423v implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0553r, InterfaceC0535S, InterfaceC0543h, InterfaceC0893f {

    /* renamed from: Y */
    public static final Object f1332Y = new Object();

    /* renamed from: A */
    public int f1333A;

    /* renamed from: B */
    public int f1334B;

    /* renamed from: C */
    public String f1335C;

    /* renamed from: D */
    public boolean f1336D;

    /* renamed from: E */
    public boolean f1337E;

    /* renamed from: F */
    public boolean f1338F;

    /* renamed from: H */
    public boolean f1340H;

    /* renamed from: I */
    public ViewGroup f1341I;

    /* renamed from: J */
    public View f1342J;

    /* renamed from: K */
    public boolean f1343K;

    /* renamed from: M */
    public C0420s f1345M;

    /* renamed from: N */
    public boolean f1346N;

    /* renamed from: O */
    public LayoutInflater f1347O;

    /* renamed from: P */
    public boolean f1348P;

    /* renamed from: Q */
    public String f1349Q;

    /* renamed from: R */
    public EnumC0548m f1350R;

    /* renamed from: S */
    public C0555t f1351S;

    /* renamed from: T */
    public C0396Y f1352T;

    /* renamed from: U */
    public final C0560y f1353U;

    /* renamed from: V */
    public C0892e f1354V;

    /* renamed from: W */
    public final ArrayList f1355W;

    /* renamed from: X */
    public final C0418q f1356X;

    /* renamed from: g */
    public Bundle f1358g;

    /* renamed from: h */
    public SparseArray f1359h;

    /* renamed from: i */
    public Bundle f1360i;

    /* renamed from: k */
    public Bundle f1362k;

    /* renamed from: l */
    public AbstractComponentCallbacksC0423v f1363l;

    /* renamed from: n */
    public int f1365n;

    /* renamed from: p */
    public boolean f1367p;

    /* renamed from: q */
    public boolean f1368q;

    /* renamed from: r */
    public boolean f1369r;

    /* renamed from: s */
    public boolean f1370s;

    /* renamed from: t */
    public boolean f1371t;

    /* renamed from: u */
    public boolean f1372u;

    /* renamed from: v */
    public int f1373v;

    /* renamed from: w */
    public C0387O f1374w;

    /* renamed from: x */
    public C0427z f1375x;

    /* renamed from: z */
    public AbstractComponentCallbacksC0423v f1377z;

    /* renamed from: f */
    public int f1357f = -1;

    /* renamed from: j */
    public String f1361j = UUID.randomUUID().toString();

    /* renamed from: m */
    public String f1364m = null;

    /* renamed from: o */
    public Boolean f1366o = null;

    /* renamed from: y */
    public C0387O f1376y = new C0387O();

    /* renamed from: G */
    public boolean f1339G = true;

    /* renamed from: L */
    public boolean f1344L = true;

    public AbstractComponentCallbacksC0423v() {
        new RunnableC0020n(5, this);
        this.f1350R = EnumC0548m.f1994e;
        this.f1353U = new C0560y();
        new AtomicInteger();
        this.f1355W = new ArrayList();
        this.f1356X = new C0418q(this);
        m1132o();
    }

    /* renamed from: A */
    public void mo1103A() {
        this.f1340H = true;
    }

    /* renamed from: B */
    public LayoutInflater mo1104B(Bundle bundle) {
        C0427z c0427z = this.f1375x;
        if (c0427z == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0870i abstractActivityC0870i = c0427z.f1388o;
        LayoutInflater cloneInContext = abstractActivityC0870i.getLayoutInflater().cloneInContext(abstractActivityC0870i);
        cloneInContext.setFactory2(this.f1376y.f1154f);
        return cloneInContext;
    }

    /* renamed from: C */
    public void mo1116C() {
        this.f1340H = true;
    }

    /* renamed from: D */
    public void mo1117D() {
        this.f1340H = true;
    }

    /* renamed from: E */
    public void mo1105E(Bundle bundle) {
    }

    /* renamed from: F */
    public void mo1106F() {
        this.f1340H = true;
    }

    /* renamed from: G */
    public void mo1107G() {
        this.f1340H = true;
    }

    /* renamed from: H */
    public void mo1108H(Bundle bundle) {
        this.f1340H = true;
    }

    /* renamed from: I */
    public void mo1109I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1376y.m997N();
        this.f1372u = true;
        this.f1352T = new C0396Y(this, mo1067c(), new RunnableC0024r(3, this));
        View mo1138x = mo1138x(layoutInflater, viewGroup);
        this.f1342J = mo1138x;
        if (mo1138x == null) {
            if (this.f1352T.f1224i != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1352T = null;
            return;
        }
        this.f1352T.m1070f();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f1342J + " for Fragment " + this);
        }
        AbstractC0528K.m1368f(this.f1342J, this.f1352T);
        View view = this.f1342J;
        C0396Y c0396y = this.f1352T;
        AbstractC1461d.m3494e("<this>", view);
        view.setTag(R.id.view_tree_view_model_store_owner, c0396y);
        AbstractC1687o.m4928W(this.f1342J, this.f1352T);
        this.f1353U.m1401j(this.f1352T);
    }

    /* renamed from: J */
    public final AbstractActivityC0870i m1118J() {
        AbstractActivityC0870i m1124g = m1124g();
        if (m1124g != null) {
            return m1124g;
        }
        throw new IllegalStateException(AbstractC0062j.m159m("Fragment ", this, " not attached to an activity."));
    }

    /* renamed from: K */
    public final Context m1119K() {
        Context m1126i = m1126i();
        if (m1126i != null) {
            return m1126i;
        }
        throw new IllegalStateException(AbstractC0062j.m159m("Fragment ", this, " not attached to a context."));
    }

    /* renamed from: L */
    public final View m1120L() {
        View view = this.f1342J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC0062j.m159m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* renamed from: M */
    public final void m1121M(int i, int i2, int i3, int i4) {
        if (this.f1345M == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m1123f().f1321b = i;
        m1123f().f1322c = i2;
        m1123f().f1323d = i3;
        m1123f().f1324e = i4;
    }

    /* renamed from: N */
    public final void m1122N(Bundle bundle) {
        C0387O c0387o = this.f1374w;
        if (c0387o != null) {
            if (c0387o == null ? false : c0387o.m995L()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1362k = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0543h
    /* renamed from: a */
    public final C0489c mo1065a() {
        Application application;
        Context applicationContext = m1119K().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m1119K().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0489c c0489c = new C0489c(0);
        LinkedHashMap linkedHashMap = c0489c.f1544a;
        if (application != null) {
            linkedHashMap.put(AbstractC0528K.f1970d, application);
        }
        linkedHashMap.put(AbstractC0528K.f1967a, this);
        linkedHashMap.put(AbstractC0528K.f1968b, this);
        Bundle bundle = this.f1362k;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0528K.f1969c, bundle);
        }
        return c0489c;
    }

    @Override // p071g0.InterfaceC0893f
    /* renamed from: b */
    public final C0891d mo1066b() {
        return this.f1354V.f4475b;
    }

    @Override // androidx.lifecycle.InterfaceC0535S
    /* renamed from: c */
    public final C0534Q mo1067c() {
        if (this.f1374w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1127j() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1374w.f1147L.f1187d;
        C0534Q c0534q = (C0534Q) hashMap.get(this.f1361j);
        if (c0534q != null) {
            return c0534q;
        }
        C0534Q c0534q2 = new C0534Q();
        hashMap.put(this.f1361j, c0534q2);
        return c0534q2;
    }

    @Override // androidx.lifecycle.InterfaceC0553r
    /* renamed from: d */
    public final C0555t mo1068d() {
        return this.f1351S;
    }

    /* renamed from: e */
    public AbstractC1680h mo1111e() {
        return new C0419r(this);
    }

    /* renamed from: f */
    public final C0420s m1123f() {
        if (this.f1345M == null) {
            C0420s c0420s = new C0420s();
            Object obj = f1332Y;
            c0420s.f1326g = obj;
            c0420s.f1327h = obj;
            c0420s.f1328i = obj;
            c0420s.f1329j = 1.0f;
            c0420s.f1330k = null;
            this.f1345M = c0420s;
        }
        return this.f1345M;
    }

    /* renamed from: g */
    public final AbstractActivityC0870i m1124g() {
        C0427z c0427z = this.f1375x;
        if (c0427z == null) {
            return null;
        }
        return c0427z.f1384k;
    }

    /* renamed from: h */
    public final C0387O m1125h() {
        if (this.f1375x != null) {
            return this.f1376y;
        }
        throw new IllegalStateException(AbstractC0062j.m159m("Fragment ", this, " has not been attached yet."));
    }

    /* renamed from: i */
    public final Context m1126i() {
        C0427z c0427z = this.f1375x;
        if (c0427z == null) {
            return null;
        }
        return c0427z.f1385l;
    }

    /* renamed from: j */
    public final int m1127j() {
        EnumC0548m enumC0548m = this.f1350R;
        return (enumC0548m == EnumC0548m.f1991b || this.f1377z == null) ? enumC0548m.ordinal() : Math.min(enumC0548m.ordinal(), this.f1377z.m1127j());
    }

    /* renamed from: k */
    public final C0387O m1128k() {
        C0387O c0387o = this.f1374w;
        if (c0387o != null) {
            return c0387o;
        }
        throw new IllegalStateException(AbstractC0062j.m159m("Fragment ", this, " not associated with a fragment manager."));
    }

    /* renamed from: l */
    public final Resources m1129l() {
        return m1119K().getResources();
    }

    /* renamed from: m */
    public final String m1130m(int i) {
        return m1129l().getString(i);
    }

    /* renamed from: n */
    public final C0396Y m1131n() {
        C0396Y c0396y = this.f1352T;
        if (c0396y != null) {
            return c0396y;
        }
        throw new IllegalStateException(AbstractC0062j.m159m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    /* renamed from: o */
    public final void m1132o() {
        this.f1351S = new C0555t(this);
        this.f1354V = new C0892e(this);
        ArrayList arrayList = this.f1355W;
        C0418q c0418q = this.f1356X;
        if (arrayList.contains(c0418q)) {
            return;
        }
        if (this.f1357f < 0) {
            arrayList.add(c0418q);
            return;
        }
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0418q.f1318a;
        abstractComponentCallbacksC0423v.f1354V.m2467a();
        AbstractC0528K.m1366d(abstractComponentCallbacksC0423v);
        Bundle bundle = abstractComponentCallbacksC0423v.f1358g;
        abstractComponentCallbacksC0423v.f1354V.m2468b(bundle != null ? bundle.getBundle("registryState") : null);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1340H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m1118J().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1340H = true;
    }

    /* renamed from: p */
    public final void m1133p() {
        m1132o();
        this.f1349Q = this.f1361j;
        this.f1361j = UUID.randomUUID().toString();
        this.f1367p = false;
        this.f1368q = false;
        this.f1369r = false;
        this.f1370s = false;
        this.f1371t = false;
        this.f1373v = 0;
        this.f1374w = null;
        this.f1376y = new C0387O();
        this.f1375x = null;
        this.f1333A = 0;
        this.f1334B = 0;
        this.f1335C = null;
        this.f1336D = false;
        this.f1337E = false;
    }

    /* renamed from: q */
    public final boolean m1134q() {
        return this.f1375x != null && this.f1367p;
    }

    /* renamed from: r */
    public final boolean m1135r() {
        if (!this.f1336D) {
            C0387O c0387o = this.f1374w;
            if (c0387o == null) {
                return false;
            }
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1377z;
            c0387o.getClass();
            if (!(abstractComponentCallbacksC0423v == null ? false : abstractComponentCallbacksC0423v.m1135r())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m1136s() {
        return this.f1373v > 0;
    }

    /* renamed from: t */
    public void mo1112t() {
        this.f1340H = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1361j);
        if (this.f1333A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1333A));
        }
        if (this.f1335C != null) {
            sb.append(" tag=");
            sb.append(this.f1335C);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1137u(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* renamed from: v */
    public void mo1113v(AbstractActivityC0870i abstractActivityC0870i) {
        this.f1340H = true;
        C0427z c0427z = this.f1375x;
        if ((c0427z == null ? null : c0427z.f1384k) != null) {
            this.f1340H = true;
        }
    }

    /* renamed from: w */
    public void mo1114w(Bundle bundle) {
        Bundle bundle2;
        this.f1340H = true;
        Bundle bundle3 = this.f1358g;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f1376y.m1003T(bundle2);
            C0387O c0387o = this.f1376y;
            c0387o.f1140E = false;
            c0387o.f1141F = false;
            c0387o.f1147L.f1190g = false;
            c0387o.m1032t(1);
        }
        C0387O c0387o2 = this.f1376y;
        if (c0387o2.f1167s >= 1) {
            return;
        }
        c0387o2.f1140E = false;
        c0387o2.f1141F = false;
        c0387o2.f1147L.f1190g = false;
        c0387o2.m1032t(1);
    }

    /* renamed from: x */
    public View mo1138x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: y */
    public void mo1139y() {
        this.f1340H = true;
    }

    /* renamed from: z */
    public void mo1115z() {
        this.f1340H = true;
    }
}
