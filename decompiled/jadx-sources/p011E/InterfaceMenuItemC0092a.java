package p011E;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p079k.ActionProviderVisibilityListenerC1021p;

/* renamed from: E.a */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0092a extends MenuItem {
    /* renamed from: a */
    InterfaceMenuItemC0092a mo325a(ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p);

    /* renamed from: b */
    ActionProviderVisibilityListenerC1021p mo326b();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0092a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0092a setTooltipText(CharSequence charSequence);
}
