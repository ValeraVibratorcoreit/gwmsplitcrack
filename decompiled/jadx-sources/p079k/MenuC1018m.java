package p079k;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0000a;
import p022K.AbstractC0171T;

/* renamed from: k.m */
/* loaded from: classes.dex */
public class MenuC1018m implements Menu {

    /* renamed from: y */
    public static final int[] f4828y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f4829a;

    /* renamed from: b */
    public final Resources f4830b;

    /* renamed from: c */
    public boolean f4831c;

    /* renamed from: d */
    public final boolean f4832d;

    /* renamed from: e */
    public InterfaceC1016k f4833e;

    /* renamed from: f */
    public final ArrayList f4834f;

    /* renamed from: g */
    public final ArrayList f4835g;

    /* renamed from: h */
    public boolean f4836h;

    /* renamed from: i */
    public final ArrayList f4837i;

    /* renamed from: j */
    public final ArrayList f4838j;

    /* renamed from: k */
    public boolean f4839k;

    /* renamed from: m */
    public CharSequence f4841m;

    /* renamed from: n */
    public Drawable f4842n;

    /* renamed from: o */
    public View f4843o;

    /* renamed from: v */
    public C1020o f4850v;

    /* renamed from: x */
    public boolean f4852x;

    /* renamed from: l */
    public int f4840l = 0;

    /* renamed from: p */
    public boolean f4844p = false;

    /* renamed from: q */
    public boolean f4845q = false;

    /* renamed from: r */
    public boolean f4846r = false;

    /* renamed from: s */
    public boolean f4847s = false;

    /* renamed from: t */
    public final ArrayList f4848t = new ArrayList();

    /* renamed from: u */
    public final CopyOnWriteArrayList f4849u = new CopyOnWriteArrayList();

    /* renamed from: w */
    public boolean f4851w = false;

    public MenuC1018m(Context context) {
        boolean z2 = false;
        this.f4829a = context;
        Resources resources = context.getResources();
        this.f4830b = resources;
        this.f4834f = new ArrayList();
        this.f4835g = new ArrayList();
        this.f4836h = true;
        this.f4837i = new ArrayList();
        this.f4838j = new ArrayList();
        this.f4839k = true;
        if (resources.getConfiguration().keyboard != 1 && AbstractC0171T.m510b(ViewConfiguration.get(context))) {
            z2 = true;
        }
        this.f4832d = z2;
    }

    /* renamed from: a */
    public final C1020o m2613a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f4828y[i5] << 16) | (65535 & i3);
        C1020o c1020o = new C1020o(this, i, i2, i3, i6, charSequence, this.f4840l);
        ArrayList arrayList = this.f4834f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C1020o) arrayList.get(size)).f4862d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c1020o);
        m2620p(true);
        return c1020o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m2613a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f4829a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1020o m2613a = m2613a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            m2613a.setIcon(resolveInfo.loadIcon(packageManager));
            m2613a.f4865g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = m2613a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m2614b(InterfaceC1030y interfaceC1030y, Context context) {
        this.f4849u.add(new WeakReference(interfaceC1030y));
        interfaceC1030y.mo2610g(context, this);
        this.f4839k = true;
    }

    /* renamed from: c */
    public final void m2615c(boolean z2) {
        if (this.f4847s) {
            return;
        }
        this.f4847s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4849u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1030y interfaceC1030y = (InterfaceC1030y) weakReference.get();
            if (interfaceC1030y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1030y.mo2580a(this, z2);
            }
        }
        this.f4847s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1020o c1020o = this.f4850v;
        if (c1020o != null) {
            mo2593d(c1020o);
        }
        this.f4834f.clear();
        m2620p(true);
    }

    public final void clearHeader() {
        this.f4842n = null;
        this.f4841m = null;
        this.f4843o = null;
        m2620p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m2615c(true);
    }

    /* renamed from: d */
    public boolean mo2593d(C1020o c1020o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4849u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4850v == c1020o) {
            m2627w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1030y interfaceC1030y = (InterfaceC1030y) weakReference.get();
                if (interfaceC1030y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC1030y.mo2609e(c1020o);
                    if (z2) {
                        break;
                    }
                }
            }
            m2626v();
            if (z2) {
                this.f4850v = null;
            }
        }
        return z2;
    }

    /* renamed from: e */
    public boolean mo2594e(MenuC1018m menuC1018m, MenuItem menuItem) {
        InterfaceC1016k interfaceC1016k = this.f4833e;
        return interfaceC1016k != null && interfaceC1016k.mo1877j(menuC1018m, menuItem);
    }

    /* renamed from: f */
    public boolean mo2595f(C1020o c1020o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4849u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m2627w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1030y interfaceC1030y = (InterfaceC1030y) weakReference.get();
            if (interfaceC1030y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC1030y.mo2608c(c1020o);
                if (z2) {
                    break;
                }
            }
        }
        m2626v();
        if (z2) {
            this.f4850v = c1020o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f4834f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1020o c1020o = (C1020o) arrayList.get(i2);
            if (c1020o.f4859a == i) {
                return c1020o;
            }
            if (c1020o.hasSubMenu() && (findItem = c1020o.f4873o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C1020o m2616g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4848t;
        arrayList.clear();
        m2617h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1020o) arrayList.get(0);
        }
        boolean mo2599n = mo2599n();
        for (int i2 = 0; i2 < size; i2++) {
            C1020o c1020o = (C1020o) arrayList.get(i2);
            char c2 = mo2599n ? c1020o.f4868j : c1020o.f4866h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (mo2599n && c2 == '\b' && i == 67))) {
                return c1020o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f4834f.get(i);
    }

    /* renamed from: h */
    public final void m2617h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean mo2599n = mo2599n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f4834f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C1020o c1020o = (C1020o) arrayList2.get(i2);
                if (c1020o.hasSubMenu()) {
                    c1020o.f4873o.m2617h(arrayList, i, keyEvent);
                }
                char c2 = mo2599n ? c1020o.f4868j : c1020o.f4866h;
                if ((modifiers & 69647) == ((mo2599n ? c1020o.f4869k : c1020o.f4867i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (mo2599n && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c1020o.isEnabled()) {
                        arrayList.add(c1020o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f4852x) {
            return true;
        }
        ArrayList arrayList = this.f4834f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1020o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m2618i() {
        ArrayList m2619l = m2619l();
        if (this.f4839k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4849u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1030y interfaceC1030y = (InterfaceC1030y) weakReference.get();
                if (interfaceC1030y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC1030y.mo2582h();
                }
            }
            ArrayList arrayList = this.f4837i;
            ArrayList arrayList2 = this.f4838j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = m2619l.size();
                for (int i = 0; i < size; i++) {
                    C1020o c1020o = (C1020o) m2619l.get(i);
                    if (c1020o.m2631f()) {
                        arrayList.add(c1020o);
                    } else {
                        arrayList2.add(c1020o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m2619l());
            }
            this.f4839k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2616g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo2596j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public MenuC1018m mo2597k() {
        return this;
    }

    /* renamed from: l */
    public final ArrayList m2619l() {
        boolean z2 = this.f4836h;
        ArrayList arrayList = this.f4835g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4834f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1020o c1020o = (C1020o) arrayList2.get(i);
            if (c1020o.isVisible()) {
                arrayList.add(c1020o);
            }
        }
        this.f4836h = false;
        this.f4839k = true;
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo2598m() {
        return this.f4851w;
    }

    /* renamed from: n */
    public boolean mo2599n() {
        return this.f4831c;
    }

    /* renamed from: o */
    public boolean mo2600o() {
        return this.f4832d;
    }

    /* renamed from: p */
    public final void m2620p(boolean z2) {
        if (this.f4844p) {
            this.f4845q = true;
            if (z2) {
                this.f4846r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f4836h = true;
            this.f4839k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4849u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m2627w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1030y interfaceC1030y = (InterfaceC1030y) weakReference.get();
            if (interfaceC1030y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1030y.mo2583i();
            }
        }
        m2626v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m2621q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1020o m2616g = m2616g(i, keyEvent);
        boolean m2621q = m2616g != null ? m2621q(m2616g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m2615c(true);
        }
        return m2621q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2621q(MenuItem menuItem, InterfaceC1030y interfaceC1030y, int i) {
        boolean z2;
        C1020o c1020o = (C1020o) menuItem;
        if (c1020o == null || !c1020o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1020o.f4874p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1020o)) {
            MenuC1018m menuC1018m = c1020o.f4872n;
            if (!menuC1018m.mo2594e(menuC1018m, c1020o)) {
                Intent intent = c1020o.f4865g;
                if (intent != null) {
                    try {
                        menuC1018m.f4829a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p = c1020o.f4856A;
                if (actionProviderVisibilityListenerC1021p == null || !actionProviderVisibilityListenerC1021p.f4886b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p2 = c1020o.f4856A;
                    boolean z3 = actionProviderVisibilityListenerC1021p2 == null && actionProviderVisibilityListenerC1021p2.f4886b.hasSubMenu();
                    if (!c1020o.m2630e()) {
                        z2 |= c1020o.expandActionView();
                        if (z2) {
                            m2615c(true);
                        }
                    } else if (c1020o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            m2615c(false);
                        }
                        if (!c1020o.hasSubMenu()) {
                            SubMenuC1005E subMenuC1005E = new SubMenuC1005E(this.f4829a, this, c1020o);
                            c1020o.f4873o = subMenuC1005E;
                            subMenuC1005E.setHeaderTitle(c1020o.f4863e);
                        }
                        SubMenuC1005E subMenuC1005E2 = c1020o.f4873o;
                        if (z3) {
                            actionProviderVisibilityListenerC1021p2.f4887c.getClass();
                            actionProviderVisibilityListenerC1021p2.f4886b.onPrepareSubMenu(subMenuC1005E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f4849u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC1030y != null ? interfaceC1030y.mo2581d(subMenuC1005E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC1030y interfaceC1030y2 = (InterfaceC1030y) weakReference.get();
                                if (interfaceC1030y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC1030y2.mo2581d(subMenuC1005E2);
                                }
                            }
                        }
                        z2 |= r0;
                        if (!z2) {
                            m2615c(true);
                        }
                    } else if ((i & 1) == 0) {
                        m2615c(true);
                    }
                    return z2;
                }
            }
        }
        z2 = true;
        ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p22 = c1020o.f4856A;
        if (actionProviderVisibilityListenerC1021p22 == null) {
        }
        if (!c1020o.m2630e()) {
        }
        return z2;
    }

    /* renamed from: r */
    public final void m2622r(InterfaceC1030y interfaceC1030y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4849u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1030y interfaceC1030y2 = (InterfaceC1030y) weakReference.get();
            if (interfaceC1030y2 == null || interfaceC1030y2 == interfaceC1030y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f4834f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C1020o) arrayList.get(i3)).f4860b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C1020o) arrayList.get(i3)).f4860b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f4834f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            m2620p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f4834f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1020o) arrayList.get(i2)).f4859a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f4834f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            m2620p(true);
        }
    }

    /* renamed from: s */
    public final void m2623s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2596j());
        int size = this.f4834f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1005E) item.getSubMenu()).m2623s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f4834f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1020o c1020o = (C1020o) arrayList.get(i2);
            if (c1020o.f4860b == i) {
                c1020o.f4882x = (c1020o.f4882x & (-5)) | (z3 ? 4 : 0);
                c1020o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f4851w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f4834f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1020o c1020o = (C1020o) arrayList.get(i2);
            if (c1020o.f4860b == i) {
                c1020o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f4834f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1020o c1020o = (C1020o) arrayList.get(i2);
            if (c1020o.f4860b == i) {
                int i3 = c1020o.f4882x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c1020o.f4882x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m2620p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f4831c = z2;
        m2620p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4834f.size();
    }

    /* renamed from: t */
    public final void m2624t(Bundle bundle) {
        int size = this.f4834f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1005E) item.getSubMenu()).m2624t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2596j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m2625u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f4843o = view;
            this.f4841m = null;
            this.f4842n = null;
        } else {
            if (i > 0) {
                this.f4841m = this.f4830b.getText(i);
            } else if (charSequence != null) {
                this.f4841m = charSequence;
            }
            if (i2 > 0) {
                this.f4842n = AbstractC0000a.m1b(this.f4829a, i2);
            } else if (drawable != null) {
                this.f4842n = drawable;
            }
            this.f4843o = null;
        }
        m2620p(false);
    }

    /* renamed from: v */
    public final void m2626v() {
        this.f4844p = false;
        if (this.f4845q) {
            this.f4845q = false;
            m2620p(this.f4846r);
        }
    }

    /* renamed from: w */
    public final void m2627w() {
        if (this.f4844p) {
            return;
        }
        this.f4844p = true;
        this.f4845q = false;
        this.f4846r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m2613a(0, 0, 0, this.f4830b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f4830b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2613a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1020o m2613a = m2613a(i, i2, i3, charSequence);
        SubMenuC1005E subMenuC1005E = new SubMenuC1005E(this.f4829a, this, m2613a);
        m2613a.f4873o = subMenuC1005E;
        subMenuC1005E.setHeaderTitle(m2613a.f4863e);
        return subMenuC1005E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m2613a(i, i2, i3, this.f4830b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f4830b.getString(i4));
    }
}
