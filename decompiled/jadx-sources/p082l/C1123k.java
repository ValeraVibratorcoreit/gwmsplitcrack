package p082l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import java.util.ArrayList;
import p079k.AbstractC1026u;
import p079k.ActionProviderVisibilityListenerC1021p;
import p079k.C1020o;
import p079k.InterfaceC1001A;
import p079k.InterfaceC1029x;
import p079k.InterfaceC1030y;
import p079k.InterfaceC1031z;
import p079k.MenuC1018m;
import p079k.SubMenuC1005E;

/* renamed from: l.k */
/* loaded from: classes.dex */
public final class C1123k implements InterfaceC1030y {

    /* renamed from: A */
    public C1117h f5177A;

    /* renamed from: f */
    public final Context f5179f;

    /* renamed from: g */
    public Context f5180g;

    /* renamed from: h */
    public MenuC1018m f5181h;

    /* renamed from: i */
    public final LayoutInflater f5182i;

    /* renamed from: j */
    public InterfaceC1029x f5183j;

    /* renamed from: m */
    public InterfaceC1001A f5186m;

    /* renamed from: n */
    public C1121j f5187n;

    /* renamed from: o */
    public Drawable f5188o;

    /* renamed from: p */
    public boolean f5189p;

    /* renamed from: q */
    public boolean f5190q;

    /* renamed from: r */
    public boolean f5191r;

    /* renamed from: s */
    public int f5192s;

    /* renamed from: t */
    public int f5193t;

    /* renamed from: u */
    public int f5194u;

    /* renamed from: v */
    public boolean f5195v;

    /* renamed from: x */
    public C1115g f5197x;

    /* renamed from: y */
    public C1115g f5198y;

    /* renamed from: z */
    public RunnableC1119i f5199z;

    /* renamed from: k */
    public final int f5184k = R.layout.abc_action_menu_layout;

    /* renamed from: l */
    public final int f5185l = R.layout.abc_action_menu_item_layout;

    /* renamed from: w */
    public final SparseBooleanArray f5196w = new SparseBooleanArray();

    /* renamed from: B */
    public final C0639g f5178B = new C0639g(27, this);

    public C1123k(Context context) {
        this.f5179f = context;
        this.f5182i = LayoutInflater.from(context);
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: a */
    public final void mo2580a(MenuC1018m menuC1018m, boolean z2) {
        m2733f();
        C1115g c1115g = this.f5198y;
        if (c1115g != null && c1115g.m2636b()) {
            c1115g.f4905i.dismiss();
        }
        InterfaceC1029x interfaceC1029x = this.f5183j;
        if (interfaceC1029x != null) {
            interfaceC1029x.mo1874a(menuC1018m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: b */
    public final View m2732b(C1020o c1020o, View view, ViewGroup viewGroup) {
        View actionView = c1020o.getActionView();
        if (actionView == null || c1020o.m2630e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1031z ? (InterfaceC1031z) view : (InterfaceC1031z) this.f5182i.inflate(this.f5185l, viewGroup, false);
            actionMenuItemView.mo1258b(c1020o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f5186m);
            if (this.f5177A == null) {
                this.f5177A = new C1117h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f5177A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c1020o.f4858C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1127m)) {
            actionView.setLayoutParams(ActionMenuView.m1280k(layoutParams));
        }
        return actionView;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: c */
    public final boolean mo2608c(C1020o c1020o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p079k.InterfaceC1030y
    /* renamed from: d */
    public final boolean mo2581d(SubMenuC1005E subMenuC1005E) {
        boolean z2;
        if (!subMenuC1005E.hasVisibleItems()) {
            return false;
        }
        SubMenuC1005E subMenuC1005E2 = subMenuC1005E;
        while (true) {
            MenuC1018m menuC1018m = subMenuC1005E2.f4761z;
            if (menuC1018m == this.f5181h) {
                break;
            }
            subMenuC1005E2 = (SubMenuC1005E) menuC1018m;
        }
        ViewGroup viewGroup = (ViewGroup) this.f5186m;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC1031z) && ((InterfaceC1031z) childAt).getItemData() == subMenuC1005E2.f4760A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC1005E.f4760A.getClass();
        int size = subMenuC1005E.f4834f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC1005E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C1115g c1115g = new C1115g(this, this.f5180g, subMenuC1005E, view);
        this.f5198y = c1115g;
        c1115g.f4903g = z2;
        AbstractC1026u abstractC1026u = c1115g.f4905i;
        if (abstractC1026u != null) {
            abstractC1026u.mo2587o(z2);
        }
        C1115g c1115g2 = this.f5198y;
        if (!c1115g2.m2636b()) {
            if (c1115g2.f4901e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c1115g2.m2638d(0, 0, false, false);
        }
        InterfaceC1029x interfaceC1029x = this.f5183j;
        if (interfaceC1029x != null) {
            interfaceC1029x.mo1875b(subMenuC1005E);
        }
        return true;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: e */
    public final boolean mo2609e(C1020o c1020o) {
        return false;
    }

    /* renamed from: f */
    public final boolean m2733f() {
        Object obj;
        RunnableC1119i runnableC1119i = this.f5199z;
        if (runnableC1119i != null && (obj = this.f5186m) != null) {
            ((View) obj).removeCallbacks(runnableC1119i);
            this.f5199z = null;
            return true;
        }
        C1115g c1115g = this.f5197x;
        if (c1115g == null) {
            return false;
        }
        if (c1115g.m2636b()) {
            c1115g.f4905i.dismiss();
        }
        return true;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: g */
    public final void mo2610g(Context context, MenuC1018m menuC1018m) {
        this.f5180g = context;
        LayoutInflater.from(context);
        this.f5181h = menuC1018m;
        Resources resources = context.getResources();
        if (!this.f5191r) {
            this.f5190q = true;
        }
        int i = 2;
        this.f5192s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f5194u = i;
        int i4 = this.f5192s;
        if (this.f5190q) {
            if (this.f5187n == null) {
                C1121j c1121j = new C1121j(this, this.f5179f);
                this.f5187n = c1121j;
                if (this.f5189p) {
                    c1121j.setImageDrawable(this.f5188o);
                    this.f5188o = null;
                    this.f5189p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f5187n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f5187n.getMeasuredWidth();
        } else {
            this.f5187n = null;
        }
        this.f5193t = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: h */
    public final boolean mo2582h() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC1018m menuC1018m = this.f5181h;
        if (menuC1018m != null) {
            arrayList = menuC1018m.m2619l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f5194u;
        int i4 = this.f5193t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f5186m;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            C1020o c1020o = (C1020o) arrayList.get(i5);
            int i8 = c1020o.f4883y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f5195v && c1020o.f4858C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f5190q && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f5196w;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C1020o c1020o2 = (C1020o) arrayList.get(i10);
            int i12 = c1020o2.f4883y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c1020o2.f4860b;
            if (z4) {
                View m2732b = m2732b(c1020o2, null, viewGroup);
                m2732b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m2732b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c1020o2.m2632g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View m2732b2 = m2732b(c1020o2, null, viewGroup);
                    m2732b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = m2732b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C1020o c1020o3 = (C1020o) arrayList.get(i14);
                        if (c1020o3.f4860b == i13) {
                            if (c1020o3.m2631f()) {
                                i9++;
                            }
                            c1020o3.m2632g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c1020o2.m2632g(z6);
            } else {
                c1020o2.m2632g(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p079k.InterfaceC1030y
    /* renamed from: i */
    public final void mo2583i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f5186m;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC1018m menuC1018m = this.f5181h;
            if (menuC1018m != null) {
                menuC1018m.m2618i();
                ArrayList m2619l = this.f5181h.m2619l();
                int size = m2619l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1020o c1020o = (C1020o) m2619l.get(i2);
                    if (c1020o.m2631f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C1020o itemData = childAt instanceof InterfaceC1031z ? ((InterfaceC1031z) childAt).getItemData() : null;
                        View m2732b = m2732b(c1020o, childAt, viewGroup);
                        if (c1020o != itemData) {
                            m2732b.setPressed(false);
                            m2732b.jumpDrawablesToCurrentState();
                        }
                        if (m2732b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) m2732b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(m2732b);
                            }
                            ((ViewGroup) this.f5186m).addView(m2732b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f5187n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f5186m).requestLayout();
        MenuC1018m menuC1018m2 = this.f5181h;
        if (menuC1018m2 != null) {
            menuC1018m2.m2618i();
            ArrayList arrayList2 = menuC1018m2.f4837i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p = ((C1020o) arrayList2.get(i3)).f4856A;
            }
        }
        MenuC1018m menuC1018m3 = this.f5181h;
        if (menuC1018m3 != null) {
            menuC1018m3.m2618i();
            arrayList = menuC1018m3.f4838j;
        }
        if (this.f5190q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C1020o) arrayList.get(0)).f4858C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f5187n == null) {
                this.f5187n = new C1121j(this, this.f5179f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f5187n.getParent();
            if (viewGroup3 != this.f5186m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f5187n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f5186m;
                C1121j c1121j = this.f5187n;
                actionMenuView.getClass();
                C1127m m1279j = ActionMenuView.m1279j();
                m1279j.f5202a = true;
                actionMenuView.addView(c1121j, m1279j);
            }
        } else {
            C1121j c1121j2 = this.f5187n;
            if (c1121j2 != null) {
                Object parent = c1121j2.getParent();
                Object obj = this.f5186m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f5187n);
                }
            }
        }
        ((ActionMenuView) this.f5186m).setOverflowReserved(this.f5190q);
    }

    /* renamed from: j */
    public final boolean m2734j() {
        C1115g c1115g = this.f5197x;
        return c1115g != null && c1115g.m2636b();
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: k */
    public final void mo2584k(InterfaceC1029x interfaceC1029x) {
        throw null;
    }

    /* renamed from: l */
    public final boolean m2735l() {
        MenuC1018m menuC1018m;
        if (!this.f5190q || m2734j() || (menuC1018m = this.f5181h) == null || this.f5186m == null || this.f5199z != null) {
            return false;
        }
        menuC1018m.m2618i();
        if (menuC1018m.f4838j.isEmpty()) {
            return false;
        }
        RunnableC1119i runnableC1119i = new RunnableC1119i(this, new C1115g(this, this.f5180g, this.f5181h, this.f5187n));
        this.f5199z = runnableC1119i;
        ((View) this.f5186m).post(runnableC1119i);
        return true;
    }
}
