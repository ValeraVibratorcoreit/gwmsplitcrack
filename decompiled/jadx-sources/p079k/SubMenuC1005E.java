package p079k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p006C.AbstractC0062j;

/* renamed from: k.E */
/* loaded from: classes.dex */
public final class SubMenuC1005E extends MenuC1018m implements SubMenu {

    /* renamed from: A */
    public final C1020o f4760A;

    /* renamed from: z */
    public final MenuC1018m f4761z;

    public SubMenuC1005E(Context context, MenuC1018m menuC1018m, C1020o c1020o) {
        super(context);
        this.f4761z = menuC1018m;
        this.f4760A = c1020o;
    }

    @Override // p079k.MenuC1018m
    /* renamed from: d */
    public final boolean mo2593d(C1020o c1020o) {
        return this.f4761z.mo2593d(c1020o);
    }

    @Override // p079k.MenuC1018m
    /* renamed from: e */
    public final boolean mo2594e(MenuC1018m menuC1018m, MenuItem menuItem) {
        return super.mo2594e(menuC1018m, menuItem) || this.f4761z.mo2594e(menuC1018m, menuItem);
    }

    @Override // p079k.MenuC1018m
    /* renamed from: f */
    public final boolean mo2595f(C1020o c1020o) {
        return this.f4761z.mo2595f(c1020o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4760A;
    }

    @Override // p079k.MenuC1018m
    /* renamed from: j */
    public final String mo2596j() {
        C1020o c1020o = this.f4760A;
        int i = c1020o != null ? c1020o.f4859a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC0062j.m156j(i, "android:menu:actionviewstates:");
    }

    @Override // p079k.MenuC1018m
    /* renamed from: k */
    public final MenuC1018m mo2597k() {
        return this.f4761z.mo2597k();
    }

    @Override // p079k.MenuC1018m
    /* renamed from: m */
    public final boolean mo2598m() {
        return this.f4761z.mo2598m();
    }

    @Override // p079k.MenuC1018m
    /* renamed from: n */
    public final boolean mo2599n() {
        return this.f4761z.mo2599n();
    }

    @Override // p079k.MenuC1018m
    /* renamed from: o */
    public final boolean mo2600o() {
        return this.f4761z.mo2600o();
    }

    @Override // p079k.MenuC1018m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f4761z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m2625u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m2625u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m2625u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4760A.setIcon(drawable);
        return this;
    }

    @Override // p079k.MenuC1018m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f4761z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m2625u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m2625u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4760A.setIcon(i);
        return this;
    }
}
