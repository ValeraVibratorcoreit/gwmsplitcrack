package p079k;

import android.view.MenuItem;

/* renamed from: k.r */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1023r implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    public final MenuItem.OnActionExpandListener f4889a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC1025t f4890b;

    public MenuItemOnActionExpandListenerC1023r(MenuItemC1025t menuItemC1025t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4890b = menuItemC1025t;
        this.f4889a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f4889a.onMenuItemActionCollapse(this.f4890b.m1088g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f4889a.onMenuItemActionExpand(this.f4890b.m1088g(menuItem));
    }
}
