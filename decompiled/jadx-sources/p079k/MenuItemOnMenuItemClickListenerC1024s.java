package p079k;

import android.view.MenuItem;

/* renamed from: k.s */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1024s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final MenuItem.OnMenuItemClickListener f4891a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC1025t f4892b;

    public MenuItemOnMenuItemClickListenerC1024s(MenuItemC1025t menuItemC1025t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4892b = menuItemC1025t;
        this.f4891a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f4891a.onMenuItemClick(this.f4892b.m1088g(menuItem));
    }
}
