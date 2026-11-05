package p079k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.altaysoft.t500_split.media.C0639g;
import java.util.ArrayList;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p011E.InterfaceMenuItemC0092a;

/* renamed from: k.o */
/* loaded from: classes.dex */
public final class C1020o implements InterfaceMenuItemC0092a {

    /* renamed from: A */
    public ActionProviderVisibilityListenerC1021p f4856A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f4857B;

    /* renamed from: a */
    public final int f4859a;

    /* renamed from: b */
    public final int f4860b;

    /* renamed from: c */
    public final int f4861c;

    /* renamed from: d */
    public final int f4862d;

    /* renamed from: e */
    public CharSequence f4863e;

    /* renamed from: f */
    public CharSequence f4864f;

    /* renamed from: g */
    public Intent f4865g;

    /* renamed from: h */
    public char f4866h;

    /* renamed from: j */
    public char f4868j;

    /* renamed from: l */
    public Drawable f4870l;

    /* renamed from: n */
    public final MenuC1018m f4872n;

    /* renamed from: o */
    public SubMenuC1005E f4873o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f4874p;

    /* renamed from: q */
    public CharSequence f4875q;

    /* renamed from: r */
    public CharSequence f4876r;

    /* renamed from: y */
    public int f4883y;

    /* renamed from: z */
    public View f4884z;

    /* renamed from: i */
    public int f4867i = 4096;

    /* renamed from: k */
    public int f4869k = 4096;

    /* renamed from: m */
    public int f4871m = 0;

    /* renamed from: s */
    public ColorStateList f4877s = null;

    /* renamed from: t */
    public PorterDuff.Mode f4878t = null;

    /* renamed from: u */
    public boolean f4879u = false;

    /* renamed from: v */
    public boolean f4880v = false;

    /* renamed from: w */
    public boolean f4881w = false;

    /* renamed from: x */
    public int f4882x = 16;

    /* renamed from: C */
    public boolean f4858C = false;

    public C1020o(MenuC1018m menuC1018m, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f4872n = menuC1018m;
        this.f4859a = i2;
        this.f4860b = i;
        this.f4861c = i3;
        this.f4862d = i4;
        this.f4863e = charSequence;
        this.f4883y = i5;
    }

    /* renamed from: c */
    public static void m2628c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p011E.InterfaceMenuItemC0092a
    /* renamed from: a */
    public final InterfaceMenuItemC0092a mo325a(ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p) {
        this.f4884z = null;
        this.f4856A = actionProviderVisibilityListenerC1021p;
        this.f4872n.m2620p(true);
        ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p2 = this.f4856A;
        if (actionProviderVisibilityListenerC1021p2 != null) {
            actionProviderVisibilityListenerC1021p2.f4885a = new C0639g(26, this);
            actionProviderVisibilityListenerC1021p2.f4886b.setVisibilityListener(actionProviderVisibilityListenerC1021p2);
        }
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a
    /* renamed from: b */
    public final ActionProviderVisibilityListenerC1021p mo326b() {
        return this.f4856A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4883y & 8) == 0) {
            return false;
        }
        if (this.f4884z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4857B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4872n.mo2593d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m2629d(Drawable drawable) {
        if (drawable != null && this.f4881w && (this.f4879u || this.f4880v)) {
            drawable = drawable.mutate();
            if (this.f4879u) {
                AbstractC0070a.m206h(drawable, this.f4877s);
            }
            if (this.f4880v) {
                AbstractC0070a.m207i(drawable, this.f4878t);
            }
            this.f4881w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m2630e() {
        ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p;
        if ((this.f4883y & 8) == 0) {
            return false;
        }
        if (this.f4884z == null && (actionProviderVisibilityListenerC1021p = this.f4856A) != null) {
            this.f4884z = actionProviderVisibilityListenerC1021p.f4886b.onCreateActionView(this);
        }
        return this.f4884z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2630e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4857B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4872n.mo2595f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m2631f() {
        return (this.f4882x & 32) == 32;
    }

    /* renamed from: g */
    public final void m2632g(boolean z2) {
        if (z2) {
            this.f4882x |= 32;
        } else {
            this.f4882x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4884z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p = this.f4856A;
        if (actionProviderVisibilityListenerC1021p == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC1021p.f4886b.onCreateActionView(this);
        this.f4884z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4869k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4868j;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4875q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4860b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4870l;
        if (drawable != null) {
            return m2629d(drawable);
        }
        int i = this.f4871m;
        if (i == 0) {
            return null;
        }
        Drawable m257D = AbstractC0088l.m257D(this.f4872n.f4829a, i);
        this.f4871m = 0;
        this.f4870l = m257D;
        return m2629d(m257D);
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4877s;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4878t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4865g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4859a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4867i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4866h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4861c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4873o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4863e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4864f;
        return charSequence != null ? charSequence : this.f4863e;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4876r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4873o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4858C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4882x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4882x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4882x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p = this.f4856A;
        return (actionProviderVisibilityListenerC1021p == null || !actionProviderVisibilityListenerC1021p.f4886b.overridesItemVisibility()) ? (this.f4882x & 8) == 0 : (this.f4882x & 8) == 0 && this.f4856A.f4886b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f4884z = view;
        this.f4856A = null;
        if (view != null && view.getId() == -1 && (i = this.f4859a) > 0) {
            view.setId(i);
        }
        MenuC1018m menuC1018m = this.f4872n;
        menuC1018m.f4839k = true;
        menuC1018m.m2620p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f4868j == c2) {
            return this;
        }
        this.f4868j = Character.toLowerCase(c2);
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f4882x;
        int i2 = (z2 ? 1 : 0) | (i & (-2));
        this.f4882x = i2;
        if (i != i2) {
            this.f4872n.m2620p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f4882x;
        if ((i & 4) != 0) {
            MenuC1018m menuC1018m = this.f4872n;
            menuC1018m.getClass();
            ArrayList arrayList = menuC1018m.f4834f;
            int size = arrayList.size();
            menuC1018m.m2627w();
            for (int i2 = 0; i2 < size; i2++) {
                C1020o c1020o = (C1020o) arrayList.get(i2);
                if (c1020o.f4860b == this.f4860b && (c1020o.f4882x & 4) != 0 && c1020o.isCheckable()) {
                    boolean z3 = c1020o == this;
                    int i3 = c1020o.f4882x;
                    int i4 = (z3 ? 2 : 0) | (i3 & (-3));
                    c1020o.f4882x = i4;
                    if (i3 != i4) {
                        c1020o.f4872n.m2620p(false);
                    }
                }
            }
            menuC1018m.m2626v();
        } else {
            int i5 = (i & (-3)) | (z2 ? 2 : 0);
            this.f4882x = i5;
            if (i != i5) {
                this.f4872n.m2620p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f4882x |= 16;
        } else {
            this.f4882x &= -17;
        }
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4871m = 0;
        this.f4870l = drawable;
        this.f4881w = true;
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4877s = colorStateList;
        this.f4879u = true;
        this.f4881w = true;
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4878t = mode;
        this.f4880v = true;
        this.f4881w = true;
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4865g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f4866h == c2) {
            return this;
        }
        this.f4866h = c2;
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4857B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4874p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f4866h = c2;
        this.f4868j = Character.toLowerCase(c3);
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4883y = i;
        MenuC1018m menuC1018m = this.f4872n;
        menuC1018m.f4839k = true;
        menuC1018m.m2620p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4863e = charSequence;
        this.f4872n.m2620p(false);
        SubMenuC1005E subMenuC1005E = this.f4873o;
        if (subMenuC1005E != null) {
            subMenuC1005E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4864f = charSequence;
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f4882x;
        int i2 = (z2 ? 0 : 8) | (i & (-9));
        this.f4882x = i2;
        if (i != i2) {
            MenuC1018m menuC1018m = this.f4872n;
            menuC1018m.f4836h = true;
            menuC1018m.m2620p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4863e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final InterfaceMenuItemC0092a setContentDescription(CharSequence charSequence) {
        this.f4875q = charSequence;
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final InterfaceMenuItemC0092a setTooltipText(CharSequence charSequence) {
        this.f4876r = charSequence;
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f4868j == c2 && this.f4869k == i) {
            return this;
        }
        this.f4868j = Character.toLowerCase(c2);
        this.f4869k = KeyEvent.normalizeMetaState(i);
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.f4866h == c2 && this.f4867i == i) {
            return this;
        }
        this.f4866h = c2;
        this.f4867i = KeyEvent.normalizeMetaState(i);
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f4866h = c2;
        this.f4867i = KeyEvent.normalizeMetaState(i);
        this.f4868j = Character.toLowerCase(c3);
        this.f4869k = KeyEvent.normalizeMetaState(i2);
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f4870l = null;
        this.f4871m = i;
        this.f4881w = true;
        this.f4872n.m2620p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f4872n.f4829a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.f4872n.f4829a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f4884z = inflate;
        this.f4856A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f4859a) > 0) {
            inflate.setId(i2);
        }
        MenuC1018m menuC1018m = this.f4872n;
        menuC1018m.f4839k = true;
        menuC1018m.m2620p(true);
        return this;
    }
}
