package p076j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p006C.AbstractC0062j;
import p011E.InterfaceMenuItemC0092a;
import p022K.AbstractC0200l;
import p079k.ActionProviderVisibilityListenerC1021p;
import p079k.C1020o;
import p079k.MenuItemC1025t;

/* renamed from: j.g */
/* loaded from: classes.dex */
public final class C0958g {

    /* renamed from: A */
    public CharSequence f4586A;

    /* renamed from: B */
    public CharSequence f4587B;

    /* renamed from: E */
    public final /* synthetic */ C0959h f4590E;

    /* renamed from: a */
    public final Menu f4591a;

    /* renamed from: h */
    public boolean f4598h;

    /* renamed from: i */
    public int f4599i;

    /* renamed from: j */
    public int f4600j;

    /* renamed from: k */
    public CharSequence f4601k;

    /* renamed from: l */
    public CharSequence f4602l;

    /* renamed from: m */
    public int f4603m;

    /* renamed from: n */
    public char f4604n;

    /* renamed from: o */
    public int f4605o;

    /* renamed from: p */
    public char f4606p;

    /* renamed from: q */
    public int f4607q;

    /* renamed from: r */
    public int f4608r;

    /* renamed from: s */
    public boolean f4609s;

    /* renamed from: t */
    public boolean f4610t;

    /* renamed from: u */
    public boolean f4611u;

    /* renamed from: v */
    public int f4612v;

    /* renamed from: w */
    public int f4613w;

    /* renamed from: x */
    public String f4614x;

    /* renamed from: y */
    public String f4615y;

    /* renamed from: z */
    public ActionProviderVisibilityListenerC1021p f4616z;

    /* renamed from: C */
    public ColorStateList f4588C = null;

    /* renamed from: D */
    public PorterDuff.Mode f4589D = null;

    /* renamed from: b */
    public int f4592b = 0;

    /* renamed from: c */
    public int f4593c = 0;

    /* renamed from: d */
    public int f4594d = 0;

    /* renamed from: e */
    public int f4595e = 0;

    /* renamed from: f */
    public boolean f4596f = true;

    /* renamed from: g */
    public boolean f4597g = true;

    public C0958g(C0959h c0959h, Menu menu) {
        this.f4590E = c0959h;
        this.f4591a = menu;
    }

    /* renamed from: a */
    public final Object m2498a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f4590E.f4621c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* renamed from: b */
    public final void m2499b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f4609s).setVisible(this.f4610t).setEnabled(this.f4611u).setCheckable(this.f4608r >= 1).setTitleCondensed(this.f4602l).setIcon(this.f4603m);
        int i = this.f4612v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f4615y;
        C0959h c0959h = this.f4590E;
        if (str != null) {
            if (c0959h.f4621c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0959h.f4622d == null) {
                c0959h.f4622d = C0959h.m2500a(c0959h.f4621c);
            }
            Object obj = c0959h.f4622d;
            String str2 = this.f4615y;
            MenuItemOnMenuItemClickListenerC0957f menuItemOnMenuItemClickListenerC0957f = new MenuItemOnMenuItemClickListenerC0957f();
            menuItemOnMenuItemClickListenerC0957f.f4584a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0957f.f4585b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0957f.f4583c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0957f);
            } catch (Exception e2) {
                StringBuilder m163q = AbstractC0062j.m163q("Couldn't resolve menu item onClick handler ", str2, " in class ");
                m163q.append(cls.getName());
                InflateException inflateException = new InflateException(m163q.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f4608r >= 2) {
            if (menuItem instanceof C1020o) {
                C1020o c1020o = (C1020o) menuItem;
                c1020o.f4882x = (c1020o.f4882x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC1025t) {
                MenuItemC1025t menuItemC1025t = (MenuItemC1025t) menuItem;
                try {
                    Method method = menuItemC1025t.f4894d;
                    InterfaceMenuItemC0092a interfaceMenuItemC0092a = menuItemC1025t.f4893c;
                    if (method == null) {
                        menuItemC1025t.f4894d = interfaceMenuItemC0092a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1025t.f4894d.invoke(interfaceMenuItemC0092a, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f4614x;
        if (str3 != null) {
            menuItem.setActionView((View) m2498a(str3, C0959h.f4617e, c0959h.f4619a));
            z2 = true;
        }
        int i2 = this.f4613w;
        if (i2 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC1021p actionProviderVisibilityListenerC1021p = this.f4616z;
        if (actionProviderVisibilityListenerC1021p != null) {
            if (menuItem instanceof InterfaceMenuItemC0092a) {
                ((InterfaceMenuItemC0092a) menuItem).mo325a(actionProviderVisibilityListenerC1021p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f4586A;
        boolean z3 = menuItem instanceof InterfaceMenuItemC0092a;
        if (z3) {
            ((InterfaceMenuItemC0092a) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0200l.m624h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f4587B;
        if (z3) {
            ((InterfaceMenuItemC0092a) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0200l.m629m(menuItem, charSequence2);
        }
        char c2 = this.f4604n;
        int i3 = this.f4605o;
        if (z3) {
            ((InterfaceMenuItemC0092a) menuItem).setAlphabeticShortcut(c2, i3);
        } else {
            AbstractC0200l.m623g(menuItem, c2, i3);
        }
        char c3 = this.f4606p;
        int i4 = this.f4607q;
        if (z3) {
            ((InterfaceMenuItemC0092a) menuItem).setNumericShortcut(c3, i4);
        } else {
            AbstractC0200l.m627k(menuItem, c3, i4);
        }
        PorterDuff.Mode mode = this.f4589D;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC0092a) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0200l.m626j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f4588C;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC0092a) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0200l.m625i(menuItem, colorStateList);
            }
        }
    }
}
