package p046X;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC0528K;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.EnumC0548m;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p022K.AbstractC0156D;
import p022K.AbstractC0169Q;
import p038T.C0326t;
import p048Y.AbstractC0434d;
import p048Y.C0431a;
import p048Y.C0433c;
import p059c0.C0576a;
import p070g.AbstractActivityC0870i;
import p071g0.C0888a;
import p091o.C1202l;
import p097q.AbstractC1241e;
import p107t1.AbstractC1461d;

/* renamed from: X.W */
/* loaded from: classes.dex */
public final class C0394W {

    /* renamed from: a */
    public final C0043j f1207a;

    /* renamed from: b */
    public final C0326t f1208b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0423v f1209c;

    /* renamed from: d */
    public boolean f1210d = false;

    /* renamed from: e */
    public int f1211e = -1;

    public C0394W(C0043j c0043j, C0326t c0326t, AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        this.f1207a = c0043j;
        this.f1208b = c0326t;
        this.f1209c = abstractComponentCallbacksC0423v;
    }

    /* renamed from: a */
    public final void m1047a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0423v);
        }
        Bundle bundle = abstractComponentCallbacksC0423v.f1358g;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0423v.f1376y.m997N();
        abstractComponentCallbacksC0423v.f1357f = 3;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.mo1112t();
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0423v);
        }
        if (abstractComponentCallbacksC0423v.f1342J != null) {
            Bundle bundle2 = abstractComponentCallbacksC0423v.f1358g;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0423v.f1359h;
            if (sparseArray != null) {
                abstractComponentCallbacksC0423v.f1342J.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0423v.f1359h = null;
            }
            abstractComponentCallbacksC0423v.f1340H = false;
            abstractComponentCallbacksC0423v.mo1108H(bundle3);
            if (!abstractComponentCallbacksC0423v.f1340H) {
                throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onViewStateRestored()"));
            }
            if (abstractComponentCallbacksC0423v.f1342J != null) {
                abstractComponentCallbacksC0423v.f1352T.m1069e(EnumC0547l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0423v.f1358g = null;
        C0387O c0387o = abstractComponentCallbacksC0423v.f1376y;
        c0387o.f1140E = false;
        c0387o.f1141F = false;
        c0387o.f1147L.f1190g = false;
        c0387o.m1032t(4);
        this.f1207a.m79i(false);
    }

    /* renamed from: b */
    public final void m1048b() {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v;
        View view;
        View view2;
        int i = -1;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = this.f1209c;
        View view3 = abstractComponentCallbacksC0423v2.f1341I;
        while (true) {
            abstractComponentCallbacksC0423v = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v3 = tag instanceof AbstractComponentCallbacksC0423v ? (AbstractComponentCallbacksC0423v) tag : null;
            if (abstractComponentCallbacksC0423v3 != null) {
                abstractComponentCallbacksC0423v = abstractComponentCallbacksC0423v3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v4 = abstractComponentCallbacksC0423v2.f1377z;
        if (abstractComponentCallbacksC0423v != null && !abstractComponentCallbacksC0423v.equals(abstractComponentCallbacksC0423v4)) {
            int i2 = abstractComponentCallbacksC0423v2.f1334B;
            C0433c c0433c = AbstractC0434d.f1401a;
            AbstractC0434d.m1143b(new C0431a(abstractComponentCallbacksC0423v2, "Attempting to nest fragment " + abstractComponentCallbacksC0423v2 + " within the view of parent fragment " + abstractComponentCallbacksC0423v + " via container with ID " + i2 + " without using parent's childFragmentManager"));
            AbstractC0434d.m1142a(abstractComponentCallbacksC0423v2).getClass();
        }
        C0326t c0326t = this.f1208b;
        c0326t.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0423v2.f1341I;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0326t.f923a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0423v2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v5 = (AbstractComponentCallbacksC0423v) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0423v5.f1341I == viewGroup && (view = abstractComponentCallbacksC0423v5.f1342J) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v6 = (AbstractComponentCallbacksC0423v) arrayList.get(i3);
                    if (abstractComponentCallbacksC0423v6.f1341I == viewGroup && (view2 = abstractComponentCallbacksC0423v6.f1342J) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        abstractComponentCallbacksC0423v2.f1341I.addView(abstractComponentCallbacksC0423v2.f1342J, i);
    }

    /* renamed from: c */
    public final void m1049c() {
        C0394W c0394w;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0423v);
        }
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = abstractComponentCallbacksC0423v.f1363l;
        C0326t c0326t = this.f1208b;
        if (abstractComponentCallbacksC0423v2 != null) {
            c0394w = (C0394W) ((HashMap) c0326t.f924b).get(abstractComponentCallbacksC0423v2.f1361j);
            if (c0394w == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0423v + " declared target fragment " + abstractComponentCallbacksC0423v.f1363l + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0423v.f1364m = abstractComponentCallbacksC0423v.f1363l.f1361j;
            abstractComponentCallbacksC0423v.f1363l = null;
        } else {
            String str = abstractComponentCallbacksC0423v.f1364m;
            if (str != null) {
                c0394w = (C0394W) ((HashMap) c0326t.f924b).get(str);
                if (c0394w == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC0423v);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(AbstractC0062j.m162p(sb, abstractComponentCallbacksC0423v.f1364m, " that does not belong to this FragmentManager!"));
                }
            } else {
                c0394w = null;
            }
        }
        if (c0394w != null) {
            c0394w.m1057k();
        }
        C0387O c0387o = abstractComponentCallbacksC0423v.f1374w;
        abstractComponentCallbacksC0423v.f1375x = c0387o.f1168t;
        abstractComponentCallbacksC0423v.f1377z = c0387o.f1170v;
        C0043j c0043j = this.f1207a;
        c0043j.m85o(false);
        ArrayList arrayList = abstractComponentCallbacksC0423v.f1355W;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v3 = ((C0418q) it.next()).f1318a;
            abstractComponentCallbacksC0423v3.f1354V.m2467a();
            AbstractC0528K.m1366d(abstractComponentCallbacksC0423v3);
            Bundle bundle = abstractComponentCallbacksC0423v3.f1358g;
            abstractComponentCallbacksC0423v3.f1354V.m2468b(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC0423v.f1376y.m1011b(abstractComponentCallbacksC0423v.f1375x, abstractComponentCallbacksC0423v.mo1111e(), abstractComponentCallbacksC0423v);
        abstractComponentCallbacksC0423v.f1357f = 0;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.mo1113v(abstractComponentCallbacksC0423v.f1375x.f1385l);
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onAttach()"));
        }
        Iterator it2 = abstractComponentCallbacksC0423v.f1374w.f1161m.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0391T) it2.next()).mo981a();
        }
        C0387O c0387o2 = abstractComponentCallbacksC0423v.f1376y;
        c0387o2.f1140E = false;
        c0387o2.f1141F = false;
        c0387o2.f1147L.f1190g = false;
        c0387o2.m1032t(0);
        c0043j.m80j(false);
    }

    /* renamed from: d */
    public final int m1050d() {
        Object obj;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (abstractComponentCallbacksC0423v.f1374w == null) {
            return abstractComponentCallbacksC0423v.f1357f;
        }
        int i = this.f1211e;
        int ordinal = abstractComponentCallbacksC0423v.f1350R.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0423v.f1369r) {
            if (abstractComponentCallbacksC0423v.f1370s) {
                i = Math.max(this.f1211e, 2);
                View view = abstractComponentCallbacksC0423v.f1342J;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1211e < 4 ? Math.min(i, abstractComponentCallbacksC0423v.f1357f) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0423v.f1367p) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0423v.f1341I;
        if (viewGroup != null) {
            C0412k m1092g = C0412k.m1092g(viewGroup, abstractComponentCallbacksC0423v.m1128k());
            m1092g.getClass();
            C0401b0 m1097e = m1092g.m1097e(abstractComponentCallbacksC0423v);
            int i2 = m1097e != null ? m1097e.f1264b : 0;
            Iterator it = m1092g.f1296c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C0401b0 c0401b0 = (C0401b0) obj;
                if (AbstractC1461d.m3490a(c0401b0.f1265c, abstractComponentCallbacksC0423v) && !c0401b0.f1268f) {
                    break;
                }
            }
            C0401b0 c0401b02 = (C0401b0) obj;
            r5 = c0401b02 != null ? c0401b02.f1264b : 0;
            int i3 = i2 == 0 ? -1 : AbstractC0403c0.f1273a[AbstractC1241e.m2943b(i2)];
            if (i3 != -1 && i3 != 1) {
                r5 = i2;
            }
        }
        if (r5 == 2) {
            i = Math.min(i, 6);
        } else if (r5 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0423v.f1368q) {
            i = abstractComponentCallbacksC0423v.m1136s() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0423v.f1343K && abstractComponentCallbacksC0423v.f1357f < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0423v);
        }
        return i;
    }

    /* renamed from: e */
    public final void m1051e() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0423v);
        }
        Bundle bundle2 = abstractComponentCallbacksC0423v.f1358g;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0423v.f1348P) {
            abstractComponentCallbacksC0423v.f1357f = 1;
            Bundle bundle4 = abstractComponentCallbacksC0423v.f1358g;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0423v.f1376y.m1003T(bundle);
            C0387O c0387o = abstractComponentCallbacksC0423v.f1376y;
            c0387o.f1140E = false;
            c0387o.f1141F = false;
            c0387o.f1147L.f1190g = false;
            c0387o.m1032t(1);
            return;
        }
        C0043j c0043j = this.f1207a;
        c0043j.m86p(false);
        abstractComponentCallbacksC0423v.f1376y.m997N();
        abstractComponentCallbacksC0423v.f1357f = 1;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.f1351S.m1377a(new C0888a(1, abstractComponentCallbacksC0423v));
        abstractComponentCallbacksC0423v.mo1114w(bundle3);
        abstractComponentCallbacksC0423v.f1348P = true;
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onCreate()"));
        }
        abstractComponentCallbacksC0423v.f1351S.m1380d(EnumC0547l.ON_CREATE);
        c0043j.m81k(false);
    }

    /* renamed from: f */
    public final void m1052f() {
        String str;
        int i = 0;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (abstractComponentCallbacksC0423v.f1369r) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0423v);
        }
        Bundle bundle = abstractComponentCallbacksC0423v.f1358g;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater mo1104B = abstractComponentCallbacksC0423v.mo1104B(bundle2);
        abstractComponentCallbacksC0423v.f1347O = mo1104B;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0423v.f1341I;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = abstractComponentCallbacksC0423v.f1334B;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException(AbstractC0062j.m159m("Cannot create fragment ", abstractComponentCallbacksC0423v, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0423v.f1374w.f1169u.mo1101F(i2);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0423v.f1371t) {
                        try {
                            str = abstractComponentCallbacksC0423v.m1129l().getResourceName(abstractComponentCallbacksC0423v.f1334B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0423v.f1334B) + " (" + str + ") for fragment " + abstractComponentCallbacksC0423v);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0433c c0433c = AbstractC0434d.f1401a;
                    AbstractC0434d.m1143b(new C0431a(abstractComponentCallbacksC0423v, "Attempting to add fragment " + abstractComponentCallbacksC0423v + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0434d.m1142a(abstractComponentCallbacksC0423v).getClass();
                }
            }
        }
        abstractComponentCallbacksC0423v.f1341I = viewGroup;
        abstractComponentCallbacksC0423v.mo1109I(mo1104B, viewGroup, bundle2);
        if (abstractComponentCallbacksC0423v.f1342J != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0423v);
            }
            abstractComponentCallbacksC0423v.f1342J.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0423v.f1342J.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0423v);
            if (viewGroup != null) {
                m1048b();
            }
            if (abstractComponentCallbacksC0423v.f1336D) {
                abstractComponentCallbacksC0423v.f1342J.setVisibility(8);
            }
            View view = abstractComponentCallbacksC0423v.f1342J;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            if (view.isAttachedToWindow()) {
                AbstractC0156D.m419c(abstractComponentCallbacksC0423v.f1342J);
            } else {
                View view2 = abstractComponentCallbacksC0423v.f1342J;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0393V(i, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0423v.f1358g;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0423v.f1376y.m1032t(2);
            this.f1207a.m91u(abstractComponentCallbacksC0423v, abstractComponentCallbacksC0423v.f1342J, false);
            int visibility = abstractComponentCallbacksC0423v.f1342J.getVisibility();
            abstractComponentCallbacksC0423v.m1123f().f1329j = abstractComponentCallbacksC0423v.f1342J.getAlpha();
            if (abstractComponentCallbacksC0423v.f1341I != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0423v.f1342J.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0423v.m1123f().f1330k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0423v);
                    }
                }
                abstractComponentCallbacksC0423v.f1342J.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0423v.f1357f = 2;
    }

    /* renamed from: g */
    public final void m1053g() {
        AbstractComponentCallbacksC0423v m910c;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0423v);
        }
        boolean z2 = true;
        boolean z3 = abstractComponentCallbacksC0423v.f1368q && !abstractComponentCallbacksC0423v.m1136s();
        C0326t c0326t = this.f1208b;
        if (z3) {
        }
        if (!z3) {
            C0390S c0390s = (C0390S) c0326t.f926d;
            if (!((c0390s.f1185b.containsKey(abstractComponentCallbacksC0423v.f1361j) && c0390s.f1188e) ? c0390s.f1189f : true)) {
                String str = abstractComponentCallbacksC0423v.f1364m;
                if (str != null && (m910c = c0326t.m910c(str)) != null && m910c.f1338F) {
                    abstractComponentCallbacksC0423v.f1363l = m910c;
                }
                abstractComponentCallbacksC0423v.f1357f = 0;
                return;
            }
        }
        C0427z c0427z = abstractComponentCallbacksC0423v.f1375x;
        if (c0427z != null) {
            z2 = ((C0390S) c0326t.f926d).f1189f;
        } else {
            AbstractActivityC0870i abstractActivityC0870i = c0427z.f1385l;
            if (abstractActivityC0870i != null) {
                z2 = true ^ abstractActivityC0870i.isChangingConfigurations();
            }
        }
        if (z3 || z2) {
            ((C0390S) c0326t.f926d).m1041c(abstractComponentCallbacksC0423v);
        }
        abstractComponentCallbacksC0423v.f1376y.m1023k();
        abstractComponentCallbacksC0423v.f1351S.m1380d(EnumC0547l.ON_DESTROY);
        abstractComponentCallbacksC0423v.f1357f = 0;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.f1348P = false;
        abstractComponentCallbacksC0423v.mo1139y();
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onDestroy()"));
        }
        this.f1207a.m82l(false);
        Iterator it = c0326t.m913f().iterator();
        while (it.hasNext()) {
            C0394W c0394w = (C0394W) it.next();
            if (c0394w != null) {
                String str2 = abstractComponentCallbacksC0423v.f1361j;
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = c0394w.f1209c;
                if (str2.equals(abstractComponentCallbacksC0423v2.f1364m)) {
                    abstractComponentCallbacksC0423v2.f1363l = abstractComponentCallbacksC0423v;
                    abstractComponentCallbacksC0423v2.f1364m = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0423v.f1364m;
        if (str3 != null) {
            abstractComponentCallbacksC0423v.f1363l = c0326t.m910c(str3);
        }
        c0326t.m917j(this);
    }

    /* renamed from: h */
    public final void m1054h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0423v);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0423v.f1341I;
        if (viewGroup != null && (view = abstractComponentCallbacksC0423v.f1342J) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0423v.f1376y.m1032t(1);
        if (abstractComponentCallbacksC0423v.f1342J != null && abstractComponentCallbacksC0423v.f1352T.mo1068d().f2001c.compareTo(EnumC0548m.f1992c) >= 0) {
            abstractComponentCallbacksC0423v.f1352T.m1069e(EnumC0547l.ON_DESTROY);
        }
        abstractComponentCallbacksC0423v.f1357f = 1;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.mo1115z();
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onDestroyView()"));
        }
        C1202l c1202l = ((C0576a) new C0639g(abstractComponentCallbacksC0423v.mo1067c(), C0576a.f2191c).m1881w(C0576a.class)).f2192b;
        if (c1202l.f5422c > 0) {
            c1202l.f5421b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0423v.f1372u = false;
        this.f1207a.m92v(false);
        abstractComponentCallbacksC0423v.f1341I = null;
        abstractComponentCallbacksC0423v.f1342J = null;
        abstractComponentCallbacksC0423v.f1352T = null;
        abstractComponentCallbacksC0423v.f1353U.m1401j(null);
        abstractComponentCallbacksC0423v.f1370s = false;
    }

    /* renamed from: i */
    public final void m1055i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0423v);
        }
        abstractComponentCallbacksC0423v.f1357f = -1;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.mo1103A();
        abstractComponentCallbacksC0423v.f1347O = null;
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onDetach()"));
        }
        C0387O c0387o = abstractComponentCallbacksC0423v.f1376y;
        if (!c0387o.f1142G) {
            c0387o.m1023k();
            abstractComponentCallbacksC0423v.f1376y = new C0387O();
        }
        this.f1207a.m83m(false);
        abstractComponentCallbacksC0423v.f1357f = -1;
        abstractComponentCallbacksC0423v.f1375x = null;
        abstractComponentCallbacksC0423v.f1377z = null;
        abstractComponentCallbacksC0423v.f1374w = null;
        if (!abstractComponentCallbacksC0423v.f1368q || abstractComponentCallbacksC0423v.m1136s()) {
            C0390S c0390s = (C0390S) this.f1208b.f926d;
            boolean z2 = true;
            if (c0390s.f1185b.containsKey(abstractComponentCallbacksC0423v.f1361j) && c0390s.f1188e) {
                z2 = c0390s.f1189f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0423v);
        }
        abstractComponentCallbacksC0423v.m1133p();
    }

    /* renamed from: j */
    public final void m1056j() {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (abstractComponentCallbacksC0423v.f1369r && abstractComponentCallbacksC0423v.f1370s && !abstractComponentCallbacksC0423v.f1372u) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0423v);
            }
            Bundle bundle = abstractComponentCallbacksC0423v.f1358g;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater mo1104B = abstractComponentCallbacksC0423v.mo1104B(bundle2);
            abstractComponentCallbacksC0423v.f1347O = mo1104B;
            abstractComponentCallbacksC0423v.mo1109I(mo1104B, null, bundle2);
            View view = abstractComponentCallbacksC0423v.f1342J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0423v.f1342J.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0423v);
                if (abstractComponentCallbacksC0423v.f1336D) {
                    abstractComponentCallbacksC0423v.f1342J.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0423v.f1358g;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0423v.f1376y.m1032t(2);
                this.f1207a.m91u(abstractComponentCallbacksC0423v, abstractComponentCallbacksC0423v.f1342J, false);
                abstractComponentCallbacksC0423v.f1357f = 2;
            }
        }
    }

    /* renamed from: k */
    public final void m1057k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0326t c0326t = this.f1208b;
        boolean z2 = this.f1210d;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0423v);
                return;
            }
            return;
        }
        try {
            this.f1210d = true;
            boolean z3 = false;
            while (true) {
                int m1050d = m1050d();
                int i = abstractComponentCallbacksC0423v.f1357f;
                int i2 = 3;
                if (m1050d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0423v.f1368q && !abstractComponentCallbacksC0423v.m1136s()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0423v);
                        }
                        ((C0390S) c0326t.f926d).m1041c(abstractComponentCallbacksC0423v);
                        c0326t.m917j(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0423v);
                        }
                        abstractComponentCallbacksC0423v.m1133p();
                    }
                    if (abstractComponentCallbacksC0423v.f1346N) {
                        if (abstractComponentCallbacksC0423v.f1342J != null && (viewGroup = abstractComponentCallbacksC0423v.f1341I) != null) {
                            C0412k m1092g = C0412k.m1092g(viewGroup, abstractComponentCallbacksC0423v.m1128k());
                            if (abstractComponentCallbacksC0423v.f1336D) {
                                m1092g.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0423v);
                                }
                                m1092g.m1093a(3, 1, this);
                            } else {
                                m1092g.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0423v);
                                }
                                m1092g.m1093a(2, 1, this);
                            }
                        }
                        C0387O c0387o = abstractComponentCallbacksC0423v.f1374w;
                        if (c0387o != null && abstractComponentCallbacksC0423v.f1367p && C0387O.m983H(abstractComponentCallbacksC0423v)) {
                            c0387o.f1139D = true;
                        }
                        abstractComponentCallbacksC0423v.f1346N = false;
                        abstractComponentCallbacksC0423v.f1376y.m1026n();
                    }
                    this.f1210d = false;
                    return;
                }
                if (m1050d <= i) {
                    switch (i - 1) {
                        case -1:
                            m1055i();
                            break;
                        case 0:
                            m1053g();
                            break;
                        case 1:
                            m1054h();
                            abstractComponentCallbacksC0423v.f1357f = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0423v.f1370s = false;
                            abstractComponentCallbacksC0423v.f1357f = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0423v);
                            }
                            if (abstractComponentCallbacksC0423v.f1342J != null && abstractComponentCallbacksC0423v.f1359h == null) {
                                m1062p();
                            }
                            if (abstractComponentCallbacksC0423v.f1342J != null && (viewGroup2 = abstractComponentCallbacksC0423v.f1341I) != null) {
                                C0412k m1092g2 = C0412k.m1092g(viewGroup2, abstractComponentCallbacksC0423v.m1128k());
                                m1092g2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0423v);
                                }
                                m1092g2.m1093a(1, 3, this);
                            }
                            abstractComponentCallbacksC0423v.f1357f = 3;
                            break;
                        case 4:
                            m1064r();
                            break;
                        case 5:
                            abstractComponentCallbacksC0423v.f1357f = 5;
                            break;
                        case 6:
                            m1058l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m1049c();
                            break;
                        case 1:
                            m1051e();
                            break;
                        case 2:
                            m1056j();
                            m1052f();
                            break;
                        case 3:
                            m1047a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0423v.f1342J != null && (viewGroup3 = abstractComponentCallbacksC0423v.f1341I) != null) {
                                C0412k m1092g3 = C0412k.m1092g(viewGroup3, abstractComponentCallbacksC0423v.m1128k());
                                int visibility = abstractComponentCallbacksC0423v.f1342J.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                m1092g3.m1094b(i2, this);
                            }
                            abstractComponentCallbacksC0423v.f1357f = 4;
                            break;
                        case 5:
                            m1063q();
                            break;
                        case 6:
                            abstractComponentCallbacksC0423v.f1357f = 6;
                            break;
                        case 7:
                            m1060n();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.f1210d = false;
            throw th;
        }
    }

    /* renamed from: l */
    public final void m1058l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0423v);
        }
        abstractComponentCallbacksC0423v.f1376y.m1032t(5);
        if (abstractComponentCallbacksC0423v.f1342J != null) {
            abstractComponentCallbacksC0423v.f1352T.m1069e(EnumC0547l.ON_PAUSE);
        }
        abstractComponentCallbacksC0423v.f1351S.m1380d(EnumC0547l.ON_PAUSE);
        abstractComponentCallbacksC0423v.f1357f = 6;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.mo1116C();
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onPause()"));
        }
        this.f1207a.m84n(false);
    }

    /* renamed from: m */
    public final void m1059m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        Bundle bundle = abstractComponentCallbacksC0423v.f1358g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0423v.f1358g.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0423v.f1358g.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC0423v.f1359h = abstractComponentCallbacksC0423v.f1358g.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC0423v.f1360i = abstractComponentCallbacksC0423v.f1358g.getBundle("viewRegistryState");
        C0392U c0392u = (C0392U) abstractComponentCallbacksC0423v.f1358g.getParcelable("state");
        if (c0392u != null) {
            abstractComponentCallbacksC0423v.f1364m = c0392u.f1202l;
            abstractComponentCallbacksC0423v.f1365n = c0392u.f1203m;
            abstractComponentCallbacksC0423v.f1344L = c0392u.f1204n;
        }
        if (abstractComponentCallbacksC0423v.f1344L) {
            return;
        }
        abstractComponentCallbacksC0423v.f1343K = true;
    }

    /* renamed from: n */
    public final void m1060n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0423v);
        }
        C0420s c0420s = abstractComponentCallbacksC0423v.f1345M;
        View view = c0420s == null ? null : c0420s.f1330k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0423v.f1342J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0423v.f1342J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0423v);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0423v.f1342J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0423v.m1123f().f1330k = null;
        abstractComponentCallbacksC0423v.f1376y.m997N();
        abstractComponentCallbacksC0423v.f1376y.m1037y(true);
        abstractComponentCallbacksC0423v.f1357f = 7;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.mo1117D();
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onResume()"));
        }
        C0555t c0555t = abstractComponentCallbacksC0423v.f1351S;
        EnumC0547l enumC0547l = EnumC0547l.ON_RESUME;
        c0555t.m1380d(enumC0547l);
        if (abstractComponentCallbacksC0423v.f1342J != null) {
            abstractComponentCallbacksC0423v.f1352T.f1224i.m1380d(enumC0547l);
        }
        C0387O c0387o = abstractComponentCallbacksC0423v.f1376y;
        c0387o.f1140E = false;
        c0387o.f1141F = false;
        c0387o.f1147L.f1190g = false;
        c0387o.m1032t(7);
        this.f1207a.m87q(false);
        abstractComponentCallbacksC0423v.f1358g = null;
        abstractComponentCallbacksC0423v.f1359h = null;
        abstractComponentCallbacksC0423v.f1360i = null;
    }

    /* renamed from: o */
    public final Bundle m1061o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (abstractComponentCallbacksC0423v.f1357f == -1 && (bundle = abstractComponentCallbacksC0423v.f1358g) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C0392U(abstractComponentCallbacksC0423v));
        if (abstractComponentCallbacksC0423v.f1357f > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC0423v.mo1105E(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f1207a.m88r(false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC0423v.f1354V.m2469c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle m1004U = abstractComponentCallbacksC0423v.f1376y.m1004U();
            if (!m1004U.isEmpty()) {
                bundle2.putBundle("childFragmentManager", m1004U);
            }
            if (abstractComponentCallbacksC0423v.f1342J != null) {
                m1062p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0423v.f1359h;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC0423v.f1360i;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC0423v.f1362k;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* renamed from: p */
    public final void m1062p() {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (abstractComponentCallbacksC0423v.f1342J == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0423v + " with view " + abstractComponentCallbacksC0423v.f1342J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0423v.f1342J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0423v.f1359h = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0423v.f1352T.f1225j.m2469c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0423v.f1360i = bundle;
    }

    /* renamed from: q */
    public final void m1063q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0423v);
        }
        abstractComponentCallbacksC0423v.f1376y.m997N();
        abstractComponentCallbacksC0423v.f1376y.m1037y(true);
        abstractComponentCallbacksC0423v.f1357f = 5;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.mo1106F();
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onStart()"));
        }
        C0555t c0555t = abstractComponentCallbacksC0423v.f1351S;
        EnumC0547l enumC0547l = EnumC0547l.ON_START;
        c0555t.m1380d(enumC0547l);
        if (abstractComponentCallbacksC0423v.f1342J != null) {
            abstractComponentCallbacksC0423v.f1352T.f1224i.m1380d(enumC0547l);
        }
        C0387O c0387o = abstractComponentCallbacksC0423v.f1376y;
        c0387o.f1140E = false;
        c0387o.f1141F = false;
        c0387o.f1147L.f1190g = false;
        c0387o.m1032t(5);
        this.f1207a.m89s(false);
    }

    /* renamed from: r */
    public final void m1064r() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1209c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0423v);
        }
        C0387O c0387o = abstractComponentCallbacksC0423v.f1376y;
        c0387o.f1141F = true;
        c0387o.f1147L.f1190g = true;
        c0387o.m1032t(4);
        if (abstractComponentCallbacksC0423v.f1342J != null) {
            abstractComponentCallbacksC0423v.f1352T.m1069e(EnumC0547l.ON_STOP);
        }
        abstractComponentCallbacksC0423v.f1351S.m1380d(EnumC0547l.ON_STOP);
        abstractComponentCallbacksC0423v.f1357f = 4;
        abstractComponentCallbacksC0423v.f1340H = false;
        abstractComponentCallbacksC0423v.mo1107G();
        if (!abstractComponentCallbacksC0423v.f1340H) {
            throw new C0405d0(AbstractC0062j.m159m("Fragment ", abstractComponentCallbacksC0423v, " did not call through to super.onStop()"));
        }
        this.f1207a.m90t(false);
    }

    public C0394W(C0043j c0043j, C0326t c0326t, ClassLoader classLoader, C0381I c0381i, Bundle bundle) {
        this.f1207a = c0043j;
        this.f1208b = c0326t;
        C0392U c0392u = (C0392U) bundle.getParcelable("state");
        AbstractComponentCallbacksC0423v m980a = c0381i.m980a(c0392u.f1191a);
        m980a.f1361j = c0392u.f1192b;
        m980a.f1369r = c0392u.f1193c;
        m980a.f1371t = true;
        m980a.f1333A = c0392u.f1194d;
        m980a.f1334B = c0392u.f1195e;
        m980a.f1335C = c0392u.f1196f;
        m980a.f1338F = c0392u.f1197g;
        m980a.f1368q = c0392u.f1198h;
        m980a.f1337E = c0392u.f1199i;
        m980a.f1336D = c0392u.f1200j;
        m980a.f1350R = EnumC0548m.values()[c0392u.f1201k];
        m980a.f1364m = c0392u.f1202l;
        m980a.f1365n = c0392u.f1203m;
        m980a.f1344L = c0392u.f1204n;
        this.f1209c = m980a;
        m980a.f1358g = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        m980a.m1122N(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + m980a);
        }
    }

    public C0394W(C0043j c0043j, C0326t c0326t, AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, Bundle bundle) {
        this.f1207a = c0043j;
        this.f1208b = c0326t;
        this.f1209c = abstractComponentCallbacksC0423v;
        abstractComponentCallbacksC0423v.f1359h = null;
        abstractComponentCallbacksC0423v.f1360i = null;
        abstractComponentCallbacksC0423v.f1373v = 0;
        abstractComponentCallbacksC0423v.f1370s = false;
        abstractComponentCallbacksC0423v.f1367p = false;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = abstractComponentCallbacksC0423v.f1363l;
        abstractComponentCallbacksC0423v.f1364m = abstractComponentCallbacksC0423v2 != null ? abstractComponentCallbacksC0423v2.f1361j : null;
        abstractComponentCallbacksC0423v.f1363l = null;
        abstractComponentCallbacksC0423v.f1358g = bundle;
        abstractComponentCallbacksC0423v.f1362k = bundle.getBundle("arguments");
    }
}
