package p079k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p011E.InterfaceMenuItemC0092a;
import p046X.AbstractC0408g;
import p091o.C1201k;

/* renamed from: k.B */
/* loaded from: classes.dex */
public class MenuC1002B extends AbstractC0408g implements Menu {

    /* renamed from: c */
    public final MenuC1018m f4740c;

    public MenuC1002B(Context context, MenuC1018m menuC1018m) {
        super(context);
        if (menuC1018m == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f4740c = menuC1018m;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1088g(this.f4740c.m2613a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f4740c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m1088g(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f4740c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1201k c1201k = (C1201k) this.f1284b;
        if (c1201k != null) {
            c1201k.clear();
        }
        this.f4740c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f4740c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m1088g(this.f4740c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m1088g(this.f4740c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f4740c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f4740c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f4740c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f4740c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C1201k) this.f1284b) != null) {
            int i2 = 0;
            while (true) {
                C1201k c1201k = (C1201k) this.f1284b;
                if (i2 >= c1201k.f5418c) {
                    break;
                }
                if (((InterfaceMenuItemC0092a) c1201k.m2871h(i2)).getGroupId() == i) {
                    ((C1201k) this.f1284b).m2872i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f4740c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C1201k) this.f1284b) != null) {
            int i2 = 0;
            while (true) {
                C1201k c1201k = (C1201k) this.f1284b;
                if (i2 >= c1201k.f5418c) {
                    break;
                }
                if (((InterfaceMenuItemC0092a) c1201k.m2871h(i2)).getItemId() == i) {
                    ((C1201k) this.f1284b).m2872i(i2);
                    break;
                }
                i2++;
            }
        }
        this.f4740c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        this.f4740c.setGroupCheckable(i, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        this.f4740c.setGroupEnabled(i, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        this.f4740c.setGroupVisible(i, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f4740c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4740c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f4740c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1088g(this.f4740c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f4740c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1088g(this.f4740c.m2613a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f4740c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1088g(this.f4740c.add(i, i2, i3, i4));
    }
}
