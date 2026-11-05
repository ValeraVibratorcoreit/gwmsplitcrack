package p022K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: K.l */
/* loaded from: classes.dex */
public abstract class AbstractC0200l {
    /* renamed from: a */
    public static int m617a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* renamed from: b */
    public static CharSequence m618b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* renamed from: c */
    public static ColorStateList m619c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* renamed from: d */
    public static PorterDuff.Mode m620d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* renamed from: e */
    public static int m621e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* renamed from: f */
    public static CharSequence m622f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* renamed from: g */
    public static MenuItem m623g(MenuItem menuItem, char c2, int i) {
        return menuItem.setAlphabeticShortcut(c2, i);
    }

    /* renamed from: h */
    public static MenuItem m624h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* renamed from: i */
    public static MenuItem m625i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: j */
    public static MenuItem m626j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* renamed from: k */
    public static MenuItem m627k(MenuItem menuItem, char c2, int i) {
        return menuItem.setNumericShortcut(c2, i);
    }

    /* renamed from: l */
    public static MenuItem m628l(MenuItem menuItem, char c2, char c3, int i, int i2) {
        return menuItem.setShortcut(c2, c3, i, i2);
    }

    /* renamed from: m */
    public static MenuItem m629m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
