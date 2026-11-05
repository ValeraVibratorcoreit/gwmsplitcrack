package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.altaysoft.t500_split.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0669j;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.RunnableC0020n;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p046X.C0380H;
import p067f.AbstractC0770a;
import p076j.C0959h;
import p079k.C1020o;
import p079k.MenuC1018m;
import p082l.AbstractC1085S0;
import p082l.AbstractC1099Z0;
import p082l.C1068J0;
import p082l.C1083R0;
import p082l.C1087T0;
import p082l.C1089U0;
import p082l.C1093W0;
import p082l.C1096Y;
import p082l.C1097Y0;
import p082l.C1123k;
import p082l.C1151y;
import p082l.InterfaceC1091V0;
import p082l.InterfaceC1116g0;
import p082l.RunnableC1082Q0;
import p082l.ViewOnClickListenerC1095X0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public int f1805A;

    /* renamed from: B */
    public final int f1806B;

    /* renamed from: C */
    public CharSequence f1807C;

    /* renamed from: D */
    public CharSequence f1808D;

    /* renamed from: E */
    public ColorStateList f1809E;

    /* renamed from: F */
    public ColorStateList f1810F;

    /* renamed from: G */
    public boolean f1811G;

    /* renamed from: H */
    public boolean f1812H;

    /* renamed from: I */
    public final ArrayList f1813I;

    /* renamed from: J */
    public final ArrayList f1814J;

    /* renamed from: K */
    public final int[] f1815K;

    /* renamed from: L */
    public final C0198k f1816L;

    /* renamed from: M */
    public ArrayList f1817M;

    /* renamed from: N */
    public final C1083R0 f1818N;

    /* renamed from: O */
    public C1097Y0 f1819O;

    /* renamed from: P */
    public C1123k f1820P;

    /* renamed from: Q */
    public C1087T0 f1821Q;

    /* renamed from: R */
    public boolean f1822R;

    /* renamed from: S */
    public OnBackInvokedCallback f1823S;

    /* renamed from: T */
    public OnBackInvokedDispatcher f1824T;

    /* renamed from: U */
    public boolean f1825U;

    /* renamed from: V */
    public final RunnableC0020n f1826V;

    /* renamed from: f */
    public ActionMenuView f1827f;

    /* renamed from: g */
    public C1096Y f1828g;

    /* renamed from: h */
    public C1096Y f1829h;

    /* renamed from: i */
    public AppCompatImageButton f1830i;

    /* renamed from: j */
    public C1151y f1831j;

    /* renamed from: k */
    public final Drawable f1832k;

    /* renamed from: l */
    public final CharSequence f1833l;

    /* renamed from: m */
    public AppCompatImageButton f1834m;

    /* renamed from: n */
    public View f1835n;

    /* renamed from: o */
    public Context f1836o;

    /* renamed from: p */
    public int f1837p;

    /* renamed from: q */
    public int f1838q;

    /* renamed from: r */
    public int f1839r;

    /* renamed from: s */
    public final int f1840s;

    /* renamed from: t */
    public final int f1841t;

    /* renamed from: u */
    public int f1842u;

    /* renamed from: v */
    public int f1843v;

    /* renamed from: w */
    public int f1844w;

    /* renamed from: x */
    public int f1845x;

    /* renamed from: y */
    public C1068J0 f1846y;

    /* renamed from: z */
    public int f1847z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0959h(getContext());
    }

    /* renamed from: h */
    public static C1089U0 m1286h() {
        C1089U0 c1089u0 = new C1089U0(-2, -2);
        c1089u0.f5107b = 0;
        c1089u0.f5106a = 8388627;
        return c1089u0;
    }

    /* renamed from: i */
    public static C1089U0 m1287i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C1089U0;
        if (z2) {
            C1089U0 c1089u0 = (C1089U0) layoutParams;
            C1089U0 c1089u02 = new C1089U0(c1089u0);
            c1089u02.f5107b = 0;
            c1089u02.f5107b = c1089u0.f5107b;
            return c1089u02;
        }
        if (z2) {
            C1089U0 c1089u03 = new C1089U0((C1089U0) layoutParams);
            c1089u03.f5107b = 0;
            return c1089u03;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1089U0 c1089u04 = new C1089U0(layoutParams);
            c1089u04.f5107b = 0;
            return c1089u04;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1089U0 c1089u05 = new C1089U0(marginLayoutParams);
        c1089u05.f5107b = 0;
        ((ViewGroup.MarginLayoutParams) c1089u05).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1089u05).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1089u05).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1089u05).bottomMargin = marginLayoutParams.bottomMargin;
        return c1089u05;
    }

    /* renamed from: k */
    public static int m1288k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: l */
    public static int m1289l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m1290a(ArrayList arrayList, int i) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1089U0 c1089u0 = (C1089U0) childAt.getLayoutParams();
                if (c1089u0.f5107b == 0 && m1305t(childAt)) {
                    int i3 = c1089u0.f5106a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C1089U0 c1089u02 = (C1089U0) childAt2.getLayoutParams();
            if (c1089u02.f5107b == 0 && m1305t(childAt2)) {
                int i5 = c1089u02.f5106a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1291b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1089U0 m1286h = layoutParams == null ? m1286h() : !checkLayoutParams(layoutParams) ? m1287i(layoutParams) : (C1089U0) layoutParams;
        m1286h.f5107b = 1;
        if (!z2 || this.f1835n == null) {
            addView(view, m1286h);
        } else {
            view.setLayoutParams(m1286h);
            this.f1814J.add(view);
        }
    }

    /* renamed from: c */
    public final void m1292c() {
        if (this.f1834m == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1834m = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1832k);
            this.f1834m.setContentDescription(this.f1833l);
            C1089U0 m1286h = m1286h();
            m1286h.f5106a = (this.f1840s & 112) | 8388611;
            m1286h.f5107b = 2;
            this.f1834m.setLayoutParams(m1286h);
            this.f1834m.setOnClickListener(new ViewOnClickListenerC0669j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1089U0);
    }

    /* renamed from: d */
    public final void m1293d() {
        if (this.f1846y == null) {
            C1068J0 c1068j0 = new C1068J0();
            c1068j0.f5057a = 0;
            c1068j0.f5058b = 0;
            c1068j0.f5059c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            c1068j0.f5060d = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            c1068j0.f5061e = 0;
            c1068j0.f5062f = 0;
            c1068j0.f5063g = false;
            c1068j0.f5064h = false;
            this.f1846y = c1068j0;
        }
    }

    /* renamed from: e */
    public final void m1294e() {
        m1295f();
        ActionMenuView actionMenuView = this.f1827f;
        if (actionMenuView.f1778u == null) {
            MenuC1018m menuC1018m = (MenuC1018m) actionMenuView.getMenu();
            if (this.f1821Q == null) {
                this.f1821Q = new C1087T0(this);
            }
            this.f1827f.setExpandedActionViewsExclusive(true);
            menuC1018m.m2614b(this.f1821Q, this.f1836o);
            m1306u();
        }
    }

    /* renamed from: f */
    public final void m1295f() {
        if (this.f1827f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1827f = actionMenuView;
            actionMenuView.setPopupTheme(this.f1837p);
            this.f1827f.setOnMenuItemClickListener(this.f1818N);
            ActionMenuView actionMenuView2 = this.f1827f;
            C1083R0 c1083r0 = new C1083R0(this);
            actionMenuView2.getClass();
            actionMenuView2.f1783z = c1083r0;
            C1089U0 m1286h = m1286h();
            m1286h.f5106a = (this.f1840s & 112) | 8388613;
            this.f1827f.setLayoutParams(m1286h);
            m1291b(this.f1827f, false);
        }
    }

    /* renamed from: g */
    public final void m1296g() {
        if (this.f1830i == null) {
            this.f1830i = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1089U0 m1286h = m1286h();
            m1286h.f5106a = (this.f1840s & 112) | 8388611;
            this.f1830i.setLayoutParams(m1286h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1286h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1287i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1834m;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f1834m;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1068J0 c1068j0 = this.f1846y;
        if (c1068j0 != null) {
            return c1068j0.f5063g ? c1068j0.f5057a : c1068j0.f5058b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1805A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1068J0 c1068j0 = this.f1846y;
        if (c1068j0 != null) {
            return c1068j0.f5057a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1068J0 c1068j0 = this.f1846y;
        if (c1068j0 != null) {
            return c1068j0.f5058b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1068J0 c1068j0 = this.f1846y;
        if (c1068j0 != null) {
            return c1068j0.f5063g ? c1068j0.f5058b : c1068j0.f5057a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1847z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1018m menuC1018m;
        ActionMenuView actionMenuView = this.f1827f;
        return (actionMenuView == null || (menuC1018m = actionMenuView.f1778u) == null || !menuC1018m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1805A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1847z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1151y c1151y = this.f1831j;
        if (c1151y != null) {
            return c1151y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1151y c1151y = this.f1831j;
        if (c1151y != null) {
            return c1151y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1294e();
        return this.f1827f.getMenu();
    }

    public View getNavButtonView() {
        return this.f1830i;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f1830i;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f1830i;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public C1123k getOuterActionMenuPresenter() {
        return this.f1820P;
    }

    public Drawable getOverflowIcon() {
        m1294e();
        return this.f1827f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1836o;
    }

    public int getPopupTheme() {
        return this.f1837p;
    }

    public CharSequence getSubtitle() {
        return this.f1808D;
    }

    public final TextView getSubtitleTextView() {
        return this.f1829h;
    }

    public CharSequence getTitle() {
        return this.f1807C;
    }

    public int getTitleMarginBottom() {
        return this.f1845x;
    }

    public int getTitleMarginEnd() {
        return this.f1843v;
    }

    public int getTitleMarginStart() {
        return this.f1842u;
    }

    public int getTitleMarginTop() {
        return this.f1844w;
    }

    public final TextView getTitleTextView() {
        return this.f1828g;
    }

    public InterfaceC1116g0 getWrapper() {
        Drawable drawable;
        if (this.f1819O == null) {
            C1097Y0 c1097y0 = new C1097Y0();
            c1097y0.f5145n = 0;
            c1097y0.f5132a = this;
            c1097y0.f5139h = getTitle();
            c1097y0.f5140i = getSubtitle();
            c1097y0.f5138g = c1097y0.f5139h != null;
            c1097y0.f5137f = getNavigationIcon();
            C0198k m591r = C0198k.m591r(getContext(), null, AbstractC0770a.f3894a, R.attr.actionBarStyle);
            c1097y0.f5146o = m591r.m598h(15);
            TypedArray typedArray = (TypedArray) m591r.f534c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1097y0.f5138g = true;
                c1097y0.f5139h = text;
                if ((c1097y0.f5133b & 8) != 0) {
                    Toolbar toolbar = c1097y0.f5132a;
                    toolbar.setTitle(text);
                    if (c1097y0.f5138g) {
                        AbstractC0169Q.m506k(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1097y0.f5140i = text2;
                if ((c1097y0.f5133b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable m598h = m591r.m598h(20);
            if (m598h != null) {
                c1097y0.f5136e = m598h;
                c1097y0.m2724c();
            }
            Drawable m598h2 = m591r.m598h(17);
            if (m598h2 != null) {
                c1097y0.f5135d = m598h2;
                c1097y0.m2724c();
            }
            if (c1097y0.f5137f == null && (drawable = c1097y0.f5146o) != null) {
                c1097y0.f5137f = drawable;
                int i = c1097y0.f5133b & 4;
                Toolbar toolbar2 = c1097y0.f5132a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c1097y0.m2722a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1097y0.f5134c;
                if (view != null && (c1097y0.f5133b & 16) != 0) {
                    removeView(view);
                }
                c1097y0.f5134c = inflate;
                if (inflate != null && (c1097y0.f5133b & 16) != 0) {
                    addView(inflate);
                }
                c1097y0.m2722a(c1097y0.f5133b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                m1293d();
                this.f1846y.m2688a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1838q = resourceId2;
                C1096Y c1096y = this.f1828g;
                if (c1096y != null) {
                    c1096y.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1839r = resourceId3;
                C1096Y c1096y2 = this.f1829h;
                if (c1096y2 != null) {
                    c1096y2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            m591r.m609t();
            if (R.string.abc_action_bar_up_description != c1097y0.f5145n) {
                c1097y0.f5145n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = c1097y0.f5145n;
                    c1097y0.f5141j = i2 != 0 ? getContext().getString(i2) : null;
                    c1097y0.m2723b();
                }
            }
            c1097y0.f5141j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1095X0(c1097y0));
            this.f1819O = c1097y0;
        }
        return this.f1819O;
    }

    /* renamed from: j */
    public final int m1297j(View view, int i) {
        C1089U0 c1089u0 = (C1089U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c1089u0.f5106a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1806B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1089u0).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) c1089u0).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) c1089u0).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: m */
    public void mo1298m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: n */
    public final void m1299n() {
        Iterator it = this.f1817M.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1816L.f534c).iterator();
        while (it2.hasNext()) {
            ((C0380H) it2.next()).f1127a.m1022j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1817M = currentMenuItems2;
    }

    /* renamed from: o */
    public final boolean m1300o(View view) {
        return view.getParent() == this || this.f1814J.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1306u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1826V);
        m1306u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1812H = false;
        }
        if (!this.f1812H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1812H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1812H = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298 A[LOOP:0: B:40:0x0296->B:41:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[LOOP:1: B:44:0x02b3->B:45:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d3 A[LOOP:2: B:48:0x02d1->B:49:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321 A[LOOP:3: B:57:0x031f->B:58:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean m1305t;
        boolean m1305t2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int i18;
        int i19;
        int size2;
        int i20;
        int size3;
        int i21;
        int i22;
        int i23;
        int size4;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.f1815K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!m1305t(this.f1830i)) {
            i5 = paddingLeft;
        } else {
            if (z4) {
                i6 = m1302q(this.f1830i, i24, min, iArr);
                i5 = paddingLeft;
                if (m1305t(this.f1834m)) {
                    if (z4) {
                        i6 = m1302q(this.f1834m, i6, min, iArr);
                    } else {
                        i5 = m1301p(this.f1834m, i5, min, iArr);
                    }
                }
                if (m1305t(this.f1827f)) {
                    if (z4) {
                        i5 = m1301p(this.f1827f, i5, min, iArr);
                    } else {
                        i6 = m1302q(this.f1827f, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i24 - i6));
                int max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i24 - currentContentInsetRight);
                if (m1305t(this.f1835n)) {
                    if (z4) {
                        min2 = m1302q(this.f1835n, min2, min, iArr);
                    } else {
                        max = m1301p(this.f1835n, max, min, iArr);
                    }
                }
                if (m1305t(this.f1831j)) {
                    if (z4) {
                        min2 = m1302q(this.f1831j, min2, min, iArr);
                    } else {
                        max = m1301p(this.f1831j, max, min, iArr);
                    }
                }
                m1305t = m1305t(this.f1828g);
                m1305t2 = m1305t(this.f1829h);
                if (m1305t) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    C1089U0 c1089u0 = (C1089U0) this.f1828g.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) c1089u0).bottomMargin + this.f1828g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1089u0).topMargin;
                }
                if (m1305t2) {
                    i9 = width;
                } else {
                    C1089U0 c1089u02 = (C1089U0) this.f1829h.getLayoutParams();
                    i9 = width;
                    i8 += this.f1829h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1089u02).topMargin + ((ViewGroup.MarginLayoutParams) c1089u02).bottomMargin;
                }
                if (!m1305t || m1305t2) {
                    C1096Y c1096y = !m1305t ? this.f1828g : this.f1829h;
                    C1096Y c1096y2 = !m1305t2 ? this.f1829h : this.f1828g;
                    C1089U0 c1089u03 = (C1089U0) c1096y.getLayoutParams();
                    C1089U0 c1089u04 = (C1089U0) c1096y2.getLayoutParams();
                    if ((m1305t || this.f1828g.getMeasuredWidth() <= 0) && (!m1305t2 || this.f1829h.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1806B & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1089u03).topMargin + this.f1844w;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) c1089u03).topMargin + this.f1844w;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) c1089u03).bottomMargin;
                            int i29 = this.f1845x;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) c1089u04).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1089u04).bottomMargin) - this.f1845x) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1842u : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (m1305t) {
                            C1089U0 c1089u05 = (C1089U0) this.f1828g.getLayoutParams();
                            int measuredWidth = this.f1828g.getMeasuredWidth() + max;
                            int measuredHeight = this.f1828g.getMeasuredHeight() + paddingTop;
                            this.f1828g.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1843v;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c1089u05).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (m1305t2) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1089U0) this.f1829h.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1829h.getMeasuredWidth() + max;
                            this.f1829h.layout(max, i31, measuredWidth2, this.f1829h.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1843v;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1842u : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (m1305t) {
                            C1089U0 c1089u06 = (C1089U0) this.f1828g.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1828g.getMeasuredWidth();
                            int measuredHeight2 = this.f1828g.getMeasuredHeight() + paddingTop;
                            this.f1828g.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1843v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1089u06).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (m1305t2) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1089U0) this.f1829h.getLayoutParams())).topMargin;
                            this.f1829h.layout(min2 - this.f1829h.getMeasuredWidth(), i33, min2, this.f1829h.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1843v;
                        } else {
                            i17 = min2;
                        }
                        if (z3) {
                            min2 = Math.min(i16, i17);
                        }
                        max = i13;
                    }
                } else {
                    i10 = paddingLeft;
                    i12 = min;
                }
                ArrayList arrayList = this.f1813I;
                m1290a(arrayList, 3);
                size = arrayList.size();
                i18 = max;
                for (i19 = 0; i19 < size; i19++) {
                    i18 = m1301p((View) arrayList.get(i19), i18, i12, iArr);
                }
                int i34 = i12;
                m1290a(arrayList, 5);
                size2 = arrayList.size();
                for (i20 = 0; i20 < size2; i20++) {
                    min2 = m1302q((View) arrayList.get(i20), min2, i34, iArr);
                }
                m1290a(arrayList, 1);
                int i35 = iArr[0];
                int i36 = iArr[1];
                size3 = arrayList.size();
                int i37 = i36;
                int i38 = i35;
                i21 = 0;
                int i39 = 0;
                while (i21 < size3) {
                    View view = (View) arrayList.get(i21);
                    C1089U0 c1089u07 = (C1089U0) view.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) c1089u07).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) c1089u07).rightMargin - i37;
                    int max2 = Math.max(0, i40);
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, -i40);
                    int max5 = Math.max(0, -i41);
                    i39 += view.getMeasuredWidth() + max2 + max3;
                    i21++;
                    i37 = max5;
                    i38 = max4;
                }
                i23 = ((((i9 - i10) - i7) / 2) + i10) - (i39 / 2);
                int i42 = i39 + i23;
                if (i23 >= i18) {
                    i18 = i42 > min2 ? i23 - (i42 - min2) : i23;
                }
                size4 = arrayList.size();
                for (i22 = 0; i22 < size4; i22++) {
                    i18 = m1301p((View) arrayList.get(i22), i18, i34, iArr);
                }
                arrayList.clear();
            }
            i5 = m1301p(this.f1830i, paddingLeft, min, iArr);
        }
        i6 = i24;
        if (m1305t(this.f1834m)) {
        }
        if (m1305t(this.f1827f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (m1305t(this.f1835n)) {
        }
        if (m1305t(this.f1831j)) {
        }
        m1305t = m1305t(this.f1828g);
        m1305t2 = m1305t(this.f1829h);
        if (m1305t) {
        }
        if (m1305t2) {
        }
        if (m1305t) {
        }
        if (!m1305t) {
        }
        if (!m1305t2) {
        }
        C1089U0 c1089u032 = (C1089U0) c1096y.getLayoutParams();
        C1089U0 c1089u042 = (C1089U0) c1096y2.getLayoutParams();
        if (m1305t) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1806B & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1813I;
        m1290a(arrayList2, 3);
        size = arrayList2.size();
        i18 = max6;
        while (i19 < size) {
        }
        int i342 = i12;
        m1290a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i20 < size2) {
        }
        m1290a(arrayList2, 1);
        int i352 = iArr[0];
        int i362 = iArr[1];
        size3 = arrayList2.size();
        int i372 = i362;
        int i382 = i352;
        i21 = 0;
        int i392 = 0;
        while (i21 < size3) {
        }
        i23 = ((((i9 - i10) - i7) / 2) + i10) - (i392 / 2);
        int i422 = i392 + i23;
        if (i23 >= i18) {
        }
        size4 = arrayList2.size();
        while (i22 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (m1305t(this.f1830i)) {
            m1304s(this.f1830i, i, 0, i2, this.f1841t);
            i3 = m1288k(this.f1830i) + this.f1830i.getMeasuredWidth();
            i4 = Math.max(0, m1289l(this.f1830i) + this.f1830i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.f1830i.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m1305t(this.f1834m)) {
            m1304s(this.f1834m, i, 0, i2, this.f1841t);
            i3 = m1288k(this.f1834m) + this.f1834m.getMeasuredWidth();
            i4 = Math.max(i4, m1289l(this.f1834m) + this.f1834m.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1834m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.f1815K;
        iArr[c3] = max2;
        if (m1305t(this.f1827f)) {
            m1304s(this.f1827f, i, max, i2, this.f1841t);
            i6 = m1288k(this.f1827f) + this.f1827f.getMeasuredWidth();
            i4 = Math.max(i4, m1289l(this.f1827f) + this.f1827f.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1827f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (m1305t(this.f1835n)) {
            max3 += m1303r(this.f1835n, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, m1289l(this.f1835n) + this.f1835n.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1835n.getMeasuredState());
        }
        if (m1305t(this.f1831j)) {
            max3 += m1303r(this.f1831j, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, m1289l(this.f1831j) + this.f1831j.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1831j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C1089U0) childAt.getLayoutParams()).f5107b == 0 && m1305t(childAt)) {
                max3 += m1303r(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, m1289l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1844w + this.f1845x;
        int i13 = this.f1842u + this.f1843v;
        if (m1305t(this.f1828g)) {
            m1303r(this.f1828g, i, max3 + i13, i2, i12, iArr);
            int m1288k = m1288k(this.f1828g) + this.f1828g.getMeasuredWidth();
            i7 = m1289l(this.f1828g) + this.f1828g.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1828g.getMeasuredState());
            i9 = m1288k;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (m1305t(this.f1829h)) {
            i9 = Math.max(i9, m1303r(this.f1829h, i, max3 + i13, i2, i7 + i12, iArr));
            i7 += m1289l(this.f1829h) + this.f1829h.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.f1829h.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1822R) {
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!m1305t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C1093W0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1093W0 c1093w0 = (C1093W0) parcelable;
        super.onRestoreInstanceState(c1093w0.f833a);
        ActionMenuView actionMenuView = this.f1827f;
        MenuC1018m menuC1018m = actionMenuView != null ? actionMenuView.f1778u : null;
        int i = c1093w0.f5121c;
        if (i != 0 && this.f1821Q != null && menuC1018m != null && (findItem = menuC1018m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c1093w0.f5122d) {
            RunnableC0020n runnableC0020n = this.f1826V;
            removeCallbacks(runnableC0020n);
            post(runnableC0020n);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m1293d();
        C1068J0 c1068j0 = this.f1846y;
        boolean z2 = i == 1;
        if (z2 == c1068j0.f5063g) {
            return;
        }
        c1068j0.f5063g = z2;
        if (!c1068j0.f5064h) {
            c1068j0.f5057a = c1068j0.f5061e;
            c1068j0.f5058b = c1068j0.f5062f;
            return;
        }
        if (z2) {
            int i2 = c1068j0.f5060d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c1068j0.f5061e;
            }
            c1068j0.f5057a = i2;
            int i3 = c1068j0.f5059c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c1068j0.f5062f;
            }
            c1068j0.f5058b = i3;
            return;
        }
        int i4 = c1068j0.f5059c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c1068j0.f5061e;
        }
        c1068j0.f5057a = i4;
        int i5 = c1068j0.f5060d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c1068j0.f5062f;
        }
        c1068j0.f5058b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1123k c1123k;
        C1020o c1020o;
        C1093W0 c1093w0 = new C1093W0(super.onSaveInstanceState());
        C1087T0 c1087t0 = this.f1821Q;
        if (c1087t0 != null && (c1020o = c1087t0.f5104g) != null) {
            c1093w0.f5121c = c1020o.f4859a;
        }
        ActionMenuView actionMenuView = this.f1827f;
        c1093w0.f5122d = (actionMenuView == null || (c1123k = actionMenuView.f1782y) == null || !c1123k.m2734j()) ? false : true;
        return c1093w0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1811G = false;
        }
        if (!this.f1811G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1811G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1811G = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m1301p(View view, int i, int i2, int[] iArr) {
        C1089U0 c1089u0 = (C1089U0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1089u0).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int m1297j = m1297j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m1297j, max + measuredWidth, view.getMeasuredHeight() + m1297j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1089u0).rightMargin + max;
    }

    /* renamed from: q */
    public final int m1302q(View view, int i, int i2, int[] iArr) {
        C1089U0 c1089u0 = (C1089U0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1089u0).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m1297j = m1297j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m1297j, max, view.getMeasuredHeight() + m1297j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1089u0).leftMargin);
    }

    /* renamed from: r */
    public final int m1303r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: s */
    public final void m1304s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1825U != z2) {
            this.f1825U = z2;
            m1306u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0088l.m257D(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1822R = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i != this.f1805A) {
            this.f1805A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i != this.f1847z) {
            this.f1847z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0088l.m257D(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0088l.m257D(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1296g();
        this.f1830i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC1091V0 interfaceC1091V0) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m1294e();
        this.f1827f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1837p != i) {
            this.f1837p = i;
            if (i == 0) {
                this.f1836o = getContext();
            } else {
                this.f1836o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1845x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1843v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1842u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1844w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public final boolean m1305t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: u */
    public final void m1306u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m2698a = AbstractC1085S0.m2698a(this);
            C1087T0 c1087t0 = this.f1821Q;
            boolean z2 = (c1087t0 == null || c1087t0.f5104g == null || m2698a == null || !isAttachedToWindow() || !this.f1825U) ? false : true;
            if (z2 && this.f1824T == null) {
                if (this.f1823S == null) {
                    this.f1823S = AbstractC1085S0.m2699b(new RunnableC1082Q0(this, 0));
                }
                AbstractC1085S0.m2700c(m2698a, this.f1823S);
                this.f1824T = m2698a;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1824T) == null) {
                return;
            }
            AbstractC1085S0.m2701d(onBackInvokedDispatcher, this.f1823S);
            this.f1824T = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1806B = 8388627;
        this.f1813I = new ArrayList();
        this.f1814J = new ArrayList();
        this.f1815K = new int[2];
        this.f1816L = new C0198k(new RunnableC1082Q0(this, 1));
        this.f1817M = new ArrayList();
        this.f1818N = new C1083R0(this);
        this.f1826V = new RunnableC0020n(15, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0770a.f3916w;
        C0198k m591r = C0198k.m591r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC0169Q.m504i(this, context, iArr, attributeSet, (TypedArray) m591r.f534c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) m591r.f534c;
        this.f1838q = typedArray.getResourceId(28, 0);
        this.f1839r = typedArray.getResourceId(19, 0);
        this.f1806B = typedArray.getInteger(0, 8388627);
        this.f1840s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1845x = dimensionPixelOffset;
        this.f1844w = dimensionPixelOffset;
        this.f1843v = dimensionPixelOffset;
        this.f1842u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1842u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1843v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1844w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1845x = dimensionPixelOffset5;
        }
        this.f1841t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m1293d();
        C1068J0 c1068j0 = this.f1846y;
        c1068j0.f5064h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1068j0.f5061e = dimensionPixelSize;
            c1068j0.f5057a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1068j0.f5062f = dimensionPixelSize2;
            c1068j0.f5058b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1068j0.m2688a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1847z = typedArray.getDimensionPixelOffset(10, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        this.f1805A = typedArray.getDimensionPixelOffset(6, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        this.f1832k = m591r.m598h(4);
        this.f1833l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1836o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable m598h = m591r.m598h(16);
        if (m598h != null) {
            setNavigationIcon(m598h);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable m598h2 = m591r.m598h(11);
        if (m598h2 != null) {
            setLogo(m598h2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(m591r.m597g(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(m591r.m597g(20));
        }
        if (typedArray.hasValue(14)) {
            mo1298m(typedArray.getResourceId(14, 0));
        }
        m591r.m609t();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1089U0 c1089u0 = new C1089U0(context, attributeSet);
        c1089u0.f5106a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3895b);
        c1089u0.f5106a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        c1089u0.f5107b = 0;
        return c1089u0;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1292c();
        }
        AppCompatImageButton appCompatImageButton = this.f1834m;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1292c();
            this.f1834m.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f1834m;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f1832k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1831j == null) {
                this.f1831j = new C1151y(getContext());
            }
            if (!m1300o(this.f1831j)) {
                m1291b(this.f1831j, true);
            }
        } else {
            C1151y c1151y = this.f1831j;
            if (c1151y != null && m1300o(c1151y)) {
                removeView(this.f1831j);
                this.f1814J.remove(this.f1831j);
            }
        }
        C1151y c1151y2 = this.f1831j;
        if (c1151y2 != null) {
            c1151y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1831j == null) {
            this.f1831j = new C1151y(getContext());
        }
        C1151y c1151y = this.f1831j;
        if (c1151y != null) {
            c1151y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1296g();
        }
        AppCompatImageButton appCompatImageButton = this.f1830i;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            AbstractC1099Z0.m2725a(this.f1830i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1296g();
            if (!m1300o(this.f1830i)) {
                m1291b(this.f1830i, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f1830i;
            if (appCompatImageButton != null && m1300o(appCompatImageButton)) {
                removeView(this.f1830i);
                this.f1814J.remove(this.f1830i);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f1830i;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1096Y c1096y = this.f1829h;
            if (c1096y != null && m1300o(c1096y)) {
                removeView(this.f1829h);
                this.f1814J.remove(this.f1829h);
            }
        } else {
            if (this.f1829h == null) {
                Context context = getContext();
                C1096Y c1096y2 = new C1096Y(context, null);
                this.f1829h = c1096y2;
                c1096y2.setSingleLine();
                this.f1829h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1839r;
                if (i != 0) {
                    this.f1829h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1810F;
                if (colorStateList != null) {
                    this.f1829h.setTextColor(colorStateList);
                }
            }
            if (!m1300o(this.f1829h)) {
                m1291b(this.f1829h, true);
            }
        }
        C1096Y c1096y3 = this.f1829h;
        if (c1096y3 != null) {
            c1096y3.setText(charSequence);
        }
        this.f1808D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1810F = colorStateList;
        C1096Y c1096y = this.f1829h;
        if (c1096y != null) {
            c1096y.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1096Y c1096y = this.f1828g;
            if (c1096y != null && m1300o(c1096y)) {
                removeView(this.f1828g);
                this.f1814J.remove(this.f1828g);
            }
        } else {
            if (this.f1828g == null) {
                Context context = getContext();
                C1096Y c1096y2 = new C1096Y(context, null);
                this.f1828g = c1096y2;
                c1096y2.setSingleLine();
                this.f1828g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1838q;
                if (i != 0) {
                    this.f1828g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1809E;
                if (colorStateList != null) {
                    this.f1828g.setTextColor(colorStateList);
                }
            }
            if (!m1300o(this.f1828g)) {
                m1291b(this.f1828g, true);
            }
        }
        C1096Y c1096y3 = this.f1828g;
        if (c1096y3 != null) {
            c1096y3.setText(charSequence);
        }
        this.f1807C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1809E = colorStateList;
        C1096Y c1096y = this.f1828g;
        if (c1096y != null) {
            c1096y.setTextColor(colorStateList);
        }
    }
}
