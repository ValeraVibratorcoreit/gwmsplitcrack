package p079k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000A.AbstractC0000a;
import p008D.AbstractC0070a;
import p011E.InterfaceMenuItemC0092a;

/* renamed from: k.a */
/* loaded from: classes.dex */
public final class C1006a implements InterfaceMenuItemC0092a {

    /* renamed from: a */
    public CharSequence f4762a;

    /* renamed from: b */
    public CharSequence f4763b;

    /* renamed from: c */
    public Intent f4764c;

    /* renamed from: d */
    public char f4765d;

    /* renamed from: e */
    public int f4766e;

    /* renamed from: f */
    public char f4767f;

    /* renamed from: g */
    public int f4768g;

    /* renamed from: h */
    public Drawable f4769h;

    /* renamed from: i */
    public Context f4770i;

    /* renamed from: j */
    public CharSequence f4771j;

    /* renamed from: k */
    public CharSequence f4772k;

    /* renamed from: l */
    public ColorStateList f4773l;

    /* renamed from: m */
    public PorterDuff.Mode f4774m;

    /* renamed from: n */
    public boolean f4775n;

    /* renamed from: o */
    public boolean f4776o;

    /* renamed from: p */
    public int f4777p;

    @Override // p011E.InterfaceMenuItemC0092a
    /* renamed from: a */
    public final InterfaceMenuItemC0092a mo325a(ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p) {
        throw new UnsupportedOperationException();
    }

    @Override // p011E.InterfaceMenuItemC0092a
    /* renamed from: b */
    public final ActionProviderVisibilityListenerC1021p mo326b() {
        return null;
    }

    /* renamed from: c */
    public final void m2601c() {
        Drawable drawable = this.f4769h;
        if (drawable != null) {
            if (this.f4775n || this.f4776o) {
                this.f4769h = drawable;
                Drawable mutate = drawable.mutate();
                this.f4769h = mutate;
                if (this.f4775n) {
                    AbstractC0070a.m206h(mutate, this.f4773l);
                }
                if (this.f4776o) {
                    AbstractC0070a.m207i(this.f4769h, this.f4774m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4768g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4767f;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4771j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f4769h;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4773l;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4774m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4764c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4766e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4765d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4762a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4763b;
        return charSequence != null ? charSequence : this.f4762a;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4772k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4777p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4777p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4777p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4777p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f4767f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f4777p = (z2 ? 1 : 0) | (this.f4777p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f4777p = (z2 ? 2 : 0) | (this.f4777p & (-3));
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final InterfaceMenuItemC0092a setContentDescription(CharSequence charSequence) {
        this.f4771j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f4777p = (z2 ? 16 : 0) | (this.f4777p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4769h = drawable;
        m2601c();
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4773l = colorStateList;
        this.f4775n = true;
        m2601c();
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4774m = mode;
        this.f4776o = true;
        m2601c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4764c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f4765d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f4765d = c2;
        this.f4767f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4762a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4763b = charSequence;
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final InterfaceMenuItemC0092a setTooltipText(CharSequence charSequence) {
        this.f4772k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f4777p = (this.f4777p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f4767f = Character.toLowerCase(c2);
        this.f4768g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f4771j = charSequence;
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f4765d = c2;
        this.f4766e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f4762a = this.f4770i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f4772k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f4769h = AbstractC0000a.m1b(this.f4770i, i);
        m2601c();
        return this;
    }

    @Override // p011E.InterfaceMenuItemC0092a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f4765d = c2;
        this.f4766e = KeyEvent.normalizeMetaState(i);
        this.f4767f = Character.toLowerCase(c3);
        this.f4768g = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
