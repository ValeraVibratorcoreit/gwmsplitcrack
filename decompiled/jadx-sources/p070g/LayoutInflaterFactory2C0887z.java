package p070g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0548m;
import androidx.lifecycle.InterfaceC0553r;
import com.sun.jna.Platform;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p014G.AbstractC0104e;
import p014G.C0105f;
import p014G.C0106g;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.C0153A;
import p022K.C0175X;
import p022K.C0198k;
import p022K.InterfaceC0196j;
import p046X.AbstractC0408g;
import p067f.AbstractC0770a;
import p076j.AbstractC0952a;
import p076j.C0954c;
import p076j.C0959h;
import p079k.C1013h;
import p079k.C1014i;
import p079k.C1020o;
import p079k.InterfaceC1016k;
import p079k.MenuC1018m;
import p082l.AbstractC1102a1;
import p082l.C1055D;
import p082l.C1059F;
import p082l.C1079P;
import p082l.C1087T0;
import p082l.C1097Y0;
import p082l.C1110d0;
import p082l.C1115g;
import p082l.C1123k;
import p082l.C1137r;
import p082l.C1141t;
import p082l.C1145v;
import p082l.C1151y;
import p082l.C1153z;
import p082l.InterfaceC1114f0;
import p082l.InterfaceC1116g0;
import p091o.C1201k;
import p123z.AbstractC1695c;

/* renamed from: g.z */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0887z extends AbstractC0876o implements InterfaceC1016k, LayoutInflater.Factory2 {

    /* renamed from: m0 */
    public static final C1201k f4413m0 = new C1201k();

    /* renamed from: n0 */
    public static final int[] f4414n0 = {R.attr.windowBackground};

    /* renamed from: o0 */
    public static final boolean f4415o0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A */
    public ActionBarContextView f4416A;

    /* renamed from: B */
    public PopupWindow f4417B;

    /* renamed from: C */
    public RunnableC0877p f4418C;

    /* renamed from: E */
    public boolean f4420E;

    /* renamed from: F */
    public ViewGroup f4421F;

    /* renamed from: G */
    public TextView f4422G;

    /* renamed from: H */
    public View f4423H;

    /* renamed from: I */
    public boolean f4424I;

    /* renamed from: J */
    public boolean f4425J;

    /* renamed from: K */
    public boolean f4426K;

    /* renamed from: L */
    public boolean f4427L;

    /* renamed from: M */
    public boolean f4428M;

    /* renamed from: N */
    public boolean f4429N;

    /* renamed from: O */
    public boolean f4430O;

    /* renamed from: P */
    public boolean f4431P;

    /* renamed from: Q */
    public C0886y[] f4432Q;

    /* renamed from: R */
    public C0886y f4433R;

    /* renamed from: S */
    public boolean f4434S;

    /* renamed from: T */
    public boolean f4435T;

    /* renamed from: U */
    public boolean f4436U;

    /* renamed from: V */
    public boolean f4437V;

    /* renamed from: W */
    public Configuration f4438W;

    /* renamed from: X */
    public final int f4439X;

    /* renamed from: Y */
    public int f4440Y;

    /* renamed from: Z */
    public int f4441Z;

    /* renamed from: a0 */
    public boolean f4442a0;

    /* renamed from: b0 */
    public C0884w f4443b0;

    /* renamed from: c0 */
    public C0884w f4444c0;

    /* renamed from: d0 */
    public boolean f4445d0;

    /* renamed from: e0 */
    public int f4446e0;

    /* renamed from: g0 */
    public boolean f4448g0;

    /* renamed from: h0 */
    public Rect f4449h0;

    /* renamed from: i0 */
    public Rect f4450i0;

    /* renamed from: j0 */
    public C0854C f4451j0;

    /* renamed from: k0 */
    public OnBackInvokedDispatcher f4452k0;

    /* renamed from: l0 */
    public OnBackInvokedCallback f4453l0;

    /* renamed from: o */
    public final Object f4454o;

    /* renamed from: p */
    public final Context f4455p;

    /* renamed from: q */
    public Window f4456q;

    /* renamed from: r */
    public WindowCallbackC0883v f4457r;

    /* renamed from: s */
    public final Object f4458s;

    /* renamed from: t */
    public C0861J f4459t;

    /* renamed from: u */
    public C0959h f4460u;

    /* renamed from: v */
    public CharSequence f4461v;

    /* renamed from: w */
    public InterfaceC1114f0 f4462w;

    /* renamed from: x */
    public C0878q f4463x;

    /* renamed from: y */
    public C0878q f4464y;

    /* renamed from: z */
    public AbstractC0952a f4465z;

    /* renamed from: D */
    public C0175X f4419D = null;

    /* renamed from: f0 */
    public final RunnableC0877p f4447f0 = new RunnableC0877p(this, 0);

    public LayoutInflaterFactory2C0887z(Context context, Window window, InterfaceC0871j interfaceC0871j, Object obj) {
        AbstractActivityC0870i abstractActivityC0870i;
        this.f4439X = -100;
        this.f4455p = context;
        this.f4454o = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0870i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0870i = (AbstractActivityC0870i) context;
                    break;
                }
            }
            abstractActivityC0870i = null;
            if (abstractActivityC0870i != null) {
                this.f4439X = ((LayoutInflaterFactory2C0887z) abstractActivityC0870i.m2404k()).f4439X;
            }
        }
        if (this.f4439X == -100) {
            C1201k c1201k = f4413m0;
            Integer num = (Integer) c1201k.getOrDefault(this.f4454o.getClass().getName(), null);
            if (num != null) {
                this.f4439X = num.intValue();
                c1201k.remove(this.f4454o.getClass().getName());
            }
        }
        if (window != null) {
            m2450m(window);
        }
        C1141t.m2764d();
    }

    /* renamed from: n */
    public static C0105f m2439n(Context context) {
        C0105f c0105f;
        C0105f c0105f2;
        if (Build.VERSION.SDK_INT >= 33 || (c0105f = AbstractC0876o.f4375h) == null) {
            return null;
        }
        C0105f m2429b = AbstractC0881t.m2429b(context.getApplicationContext().getResources().getConfiguration());
        C0106g c0106g = c0105f.f340a;
        if (c0106g.f341a.isEmpty()) {
            c0105f2 = C0105f.f339b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < m2429b.f340a.f341a.size() + c0106g.f341a.size()) {
                Locale locale = i < c0106g.f341a.size() ? c0106g.f341a.get(i) : m2429b.f340a.f341a.get(i - c0106g.f341a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c0105f2 = new C0105f(new C0106g(AbstractC0104e.m345a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c0105f2.f340a.f341a.isEmpty() ? m2429b : c0105f2;
    }

    /* renamed from: s */
    public static Configuration m2440s(Context context, int i, C0105f c0105f, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c0105f != null) {
            AbstractC0881t.m2431d(configuration2, c0105f);
        }
        return configuration2;
    }

    /* renamed from: A */
    public final void m2441A(int i) {
        this.f4446e0 = (1 << i) | this.f4446e0;
        if (this.f4445d0) {
            return;
        }
        View decorView = this.f4456q.getDecorView();
        RunnableC0877p runnableC0877p = this.f4447f0;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        decorView.postOnAnimation(runnableC0877p);
        this.f4445d0 = true;
    }

    /* renamed from: B */
    public final int m2442B(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m2458x(context).mo1087f();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f4444c0 == null) {
                    this.f4444c0 = new C0884w(this, context);
                }
                return this.f4444c0.mo1087f();
            }
        }
        return i;
    }

    /* renamed from: C */
    public final boolean m2443C() {
        InterfaceC1116g0 interfaceC1116g0;
        C1087T0 c1087t0;
        boolean z2 = this.f4434S;
        this.f4434S = false;
        C0886y m2459y = m2459y(0);
        if (m2459y.f4409m) {
            if (!z2) {
                m2453r(m2459y, true);
            }
            return true;
        }
        AbstractC0952a abstractC0952a = this.f4465z;
        if (abstractC0952a != null) {
            abstractC0952a.mo2376a();
            return true;
        }
        m2460z();
        C0861J c0861j = this.f4459t;
        if (c0861j == null || (interfaceC1116g0 = c0861j.f4298g) == null || (c1087t0 = ((C1097Y0) interfaceC1116g0).f5132a.f1821Q) == null || c1087t0.f5104g == null) {
            return false;
        }
        C1087T0 c1087t02 = ((C1097Y0) interfaceC1116g0).f5132a.f1821Q;
        C1020o c1020o = c1087t02 == null ? null : c1087t02.f5104g;
        if (c1020o != null) {
            c1020o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f4821k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2444D(C0886y c0886y, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0886y.f4409m || this.f4437V) {
            return;
        }
        int i2 = c0886y.f4397a;
        Context context = this.f4455p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f4456q.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0886y.f4404h)) {
            m2453r(c0886y, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !m2446F(c0886y, keyEvent)) {
            return;
        }
        C0885x c0885x = c0886y.f4401e;
        if (c0885x == null || c0886y.f4410n) {
            if (c0885x == null) {
                m2460z();
                C0861J c0861j = this.f4459t;
                Context m2392w0 = c0861j != null ? c0861j.m2392w0() : null;
                if (m2392w0 != null) {
                    context = m2392w0;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.altaysoft.t500_split.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.altaysoft.t500_split.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.altaysoft.t500_split.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0954c c0954c = new C0954c(context, 0);
                c0954c.getTheme().setTo(newTheme);
                c0886y.f4406j = c0954c;
                TypedArray obtainStyledAttributes = c0954c.obtainStyledAttributes(AbstractC0770a.f3903j);
                c0886y.f4398b = obtainStyledAttributes.getResourceId(86, 0);
                c0886y.f4400d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                c0886y.f4401e = new C0885x(this, c0886y.f4406j);
                c0886y.f4399c = 81;
            } else if (c0886y.f4410n && c0885x.getChildCount() > 0) {
                c0886y.f4401e.removeAllViews();
            }
            View view = c0886y.f4403g;
            if (view == null) {
                if (c0886y.f4404h != null) {
                    if (this.f4464y == null) {
                        this.f4464y = new C0878q(this, 3);
                    }
                    C0878q c0878q = this.f4464y;
                    if (c0886y.f4405i == null) {
                        C1014i c1014i = new C1014i(c0886y.f4406j);
                        c0886y.f4405i = c1014i;
                        c1014i.f4820j = c0878q;
                        MenuC1018m menuC1018m = c0886y.f4404h;
                        menuC1018m.m2614b(c1014i, menuC1018m.f4829a);
                    }
                    C1014i c1014i2 = c0886y.f4405i;
                    C0885x c0885x2 = c0886y.f4401e;
                    if (c1014i2.f4819i == null) {
                        c1014i2.f4819i = (ExpandedMenuView) c1014i2.f4817g.inflate(com.altaysoft.t500_split.R.layout.abc_expanded_menu_layout, (ViewGroup) c0885x2, false);
                        if (c1014i2.f4821k == null) {
                            c1014i2.f4821k = new C1013h(c1014i2);
                        }
                        c1014i2.f4819i.setAdapter((ListAdapter) c1014i2.f4821k);
                        c1014i2.f4819i.setOnItemClickListener(c1014i2);
                    }
                    ExpandedMenuView expandedMenuView = c1014i2.f4819i;
                    c0886y.f4402f = expandedMenuView;
                }
                c0886y.f4410n = true;
                return;
            }
            c0886y.f4402f = view;
            if (c0886y.f4402f != null) {
                if (c0886y.f4403g == null) {
                    C1014i c1014i3 = c0886y.f4405i;
                    if (c1014i3.f4821k == null) {
                        c1014i3.f4821k = new C1013h(c1014i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = c0886y.f4402f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0886y.f4401e.setBackgroundResource(c0886y.f4398b);
                ViewParent parent = c0886y.f4402f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0886y.f4402f);
                }
                c0886y.f4401e.addView(c0886y.f4402f, layoutParams2);
                if (!c0886y.f4402f.hasFocus()) {
                    c0886y.f4402f.requestFocus();
                }
            }
            c0886y.f4410n = true;
            return;
        }
        View view2 = c0886y.f4403g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            c0886y.f4408l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = c0886y.f4399c;
            layoutParams3.windowAnimations = c0886y.f4400d;
            windowManager.addView(c0886y.f4401e, layoutParams3);
            c0886y.f4409m = true;
            if (i2 != 0) {
                m2448H();
                return;
            }
            return;
        }
        i = -2;
        c0886y.f4408l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = c0886y.f4399c;
        layoutParams32.windowAnimations = c0886y.f4400d;
        windowManager.addView(c0886y.f4401e, layoutParams32);
        c0886y.f4409m = true;
        if (i2 != 0) {
        }
    }

    /* renamed from: E */
    public final boolean m2445E(C0886y c0886y, int i, KeyEvent keyEvent) {
        MenuC1018m menuC1018m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0886y.f4407k || m2446F(c0886y, keyEvent)) && (menuC1018m = c0886y.f4404h) != null) {
            return menuC1018m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m2446F(C0886y c0886y, KeyEvent keyEvent) {
        InterfaceC1114f0 interfaceC1114f0;
        InterfaceC1114f0 interfaceC1114f02;
        Resources.Theme theme;
        InterfaceC1114f0 interfaceC1114f03;
        InterfaceC1114f0 interfaceC1114f04;
        if (this.f4437V) {
            return false;
        }
        if (c0886y.f4407k) {
            return true;
        }
        C0886y c0886y2 = this.f4433R;
        if (c0886y2 != null && c0886y2 != c0886y) {
            m2453r(c0886y2, false);
        }
        Window.Callback callback = this.f4456q.getCallback();
        int i = c0886y.f4397a;
        if (callback != null) {
            c0886y.f4403g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC1114f04 = this.f4462w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1114f04;
            actionBarOverlayLayout.m1277k();
            ((C1097Y0) actionBarOverlayLayout.f1756j).f5143l = true;
        }
        if (c0886y.f4403g == null) {
            MenuC1018m menuC1018m = c0886y.f4404h;
            if (menuC1018m == null || c0886y.f4411o) {
                if (menuC1018m == null) {
                    Context context = this.f4455p;
                    if ((i == 0 || i == 108) && this.f4462w != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.altaysoft.t500_split.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.altaysoft.t500_split.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.altaysoft.t500_split.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0954c c0954c = new C0954c(context, 0);
                            c0954c.getTheme().setTo(theme);
                            context = c0954c;
                        }
                    }
                    MenuC1018m menuC1018m2 = new MenuC1018m(context);
                    menuC1018m2.f4833e = this;
                    MenuC1018m menuC1018m3 = c0886y.f4404h;
                    if (menuC1018m2 != menuC1018m3) {
                        if (menuC1018m3 != null) {
                            menuC1018m3.m2622r(c0886y.f4405i);
                        }
                        c0886y.f4404h = menuC1018m2;
                        C1014i c1014i = c0886y.f4405i;
                        if (c1014i != null) {
                            menuC1018m2.m2614b(c1014i, menuC1018m2.f4829a);
                        }
                    }
                    if (c0886y.f4404h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC1114f02 = this.f4462w) != null) {
                    if (this.f4463x == null) {
                        this.f4463x = new C0878q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC1114f02).m1278l(c0886y.f4404h, this.f4463x);
                }
                c0886y.f4404h.m2627w();
                if (!callback.onCreatePanelMenu(i, c0886y.f4404h)) {
                    MenuC1018m menuC1018m4 = c0886y.f4404h;
                    if (menuC1018m4 != null) {
                        if (menuC1018m4 != null) {
                            menuC1018m4.m2622r(c0886y.f4405i);
                        }
                        c0886y.f4404h = null;
                    }
                    if (z2 && (interfaceC1114f0 = this.f4462w) != null) {
                        ((ActionBarOverlayLayout) interfaceC1114f0).m1278l(null, this.f4463x);
                    }
                    return false;
                }
                c0886y.f4411o = false;
            }
            c0886y.f4404h.m2627w();
            Bundle bundle = c0886y.f4412p;
            if (bundle != null) {
                c0886y.f4404h.m2623s(bundle);
                c0886y.f4412p = null;
            }
            if (!callback.onPreparePanel(0, c0886y.f4403g, c0886y.f4404h)) {
                if (z2 && (interfaceC1114f03 = this.f4462w) != null) {
                    ((ActionBarOverlayLayout) interfaceC1114f03).m1278l(null, this.f4463x);
                }
                c0886y.f4404h.m2626v();
                return false;
            }
            c0886y.f4404h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0886y.f4404h.m2626v();
        }
        c0886y.f4407k = true;
        c0886y.f4408l = false;
        this.f4433R = c0886y;
        return true;
    }

    /* renamed from: G */
    public final void m2447G() {
        if (this.f4420E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: H */
    public final void m2448H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f4452k0 != null && (m2459y(0).f4409m || this.f4465z != null)) {
                z2 = true;
            }
            if (z2 && this.f4453l0 == null) {
                this.f4453l0 = AbstractC0882u.m2433b(this.f4452k0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f4453l0) == null) {
                    return;
                }
                AbstractC0882u.m2434c(this.f4452k0, onBackInvokedCallback);
                this.f4453l0 = null;
            }
        }
    }

    @Override // p070g.AbstractC0876o
    /* renamed from: a */
    public final void mo2418a() {
        LayoutInflater from = LayoutInflater.from(this.f4455p);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0887z) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p070g.AbstractC0876o
    /* renamed from: c */
    public final void mo2419c() {
        String str;
        this.f4435T = true;
        m2449l(false, true);
        m2457w();
        Object obj = this.f4454o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC1695c.m4962e(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0861J c0861j = this.f4459t;
                if (c0861j == null) {
                    this.f4448g0 = true;
                } else {
                    c0861j.m2394y0(true);
                }
            }
            synchronized (AbstractC0876o.f4380m) {
                AbstractC0876o.m2417e(this);
                AbstractC0876o.f4379l.add(new WeakReference(this));
            }
        }
        this.f4438W = new Configuration(this.f4455p.getResources().getConfiguration());
        this.f4436U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // p070g.AbstractC0876o
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2420d() {
        C0884w c0884w;
        C0884w c0884w2;
        if (this.f4454o instanceof Activity) {
            synchronized (AbstractC0876o.f4380m) {
                AbstractC0876o.m2417e(this);
            }
        }
        if (this.f4445d0) {
            this.f4456q.getDecorView().removeCallbacks(this.f4447f0);
        }
        this.f4437V = true;
        if (this.f4439X != -100) {
            Object obj = this.f4454o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f4413m0.put(this.f4454o.getClass().getName(), Integer.valueOf(this.f4439X));
                c0884w = this.f4443b0;
                if (c0884w != null) {
                    c0884w.m1084c();
                }
                c0884w2 = this.f4444c0;
                if (c0884w2 == null) {
                    c0884w2.m1084c();
                    return;
                }
                return;
            }
        }
        f4413m0.remove(this.f4454o.getClass().getName());
        c0884w = this.f4443b0;
        if (c0884w != null) {
        }
        c0884w2 = this.f4444c0;
        if (c0884w2 == null) {
        }
    }

    @Override // p070g.AbstractC0876o
    /* renamed from: f */
    public final boolean mo2421f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f4430O && i == 108) {
            return false;
        }
        if (this.f4426K && i == 1) {
            this.f4426K = false;
        }
        if (i == 1) {
            m2447G();
            this.f4430O = true;
            return true;
        }
        if (i == 2) {
            m2447G();
            this.f4424I = true;
            return true;
        }
        if (i == 5) {
            m2447G();
            this.f4425J = true;
            return true;
        }
        if (i == 10) {
            m2447G();
            this.f4428M = true;
            return true;
        }
        if (i == 108) {
            m2447G();
            this.f4426K = true;
            return true;
        }
        if (i != 109) {
            return this.f4456q.requestFeature(i);
        }
        m2447G();
        this.f4427L = true;
        return true;
    }

    @Override // p070g.AbstractC0876o
    /* renamed from: g */
    public final void mo2422g(int i) {
        m2456v();
        ViewGroup viewGroup = (ViewGroup) this.f4421F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4455p).inflate(i, viewGroup);
        this.f4457r.m2435a(this.f4456q.getCallback());
    }

    @Override // p070g.AbstractC0876o
    /* renamed from: h */
    public final void mo2423h(View view) {
        m2456v();
        ViewGroup viewGroup = (ViewGroup) this.f4421F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4457r.m2435a(this.f4456q.getCallback());
    }

    @Override // p070g.AbstractC0876o
    /* renamed from: i */
    public final void mo2424i(View view, ViewGroup.LayoutParams layoutParams) {
        m2456v();
        ViewGroup viewGroup = (ViewGroup) this.f4421F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4457r.m2435a(this.f4456q.getCallback());
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: j */
    public final boolean mo1877j(MenuC1018m menuC1018m, MenuItem menuItem) {
        C0886y c0886y;
        Window.Callback callback = this.f4456q.getCallback();
        if (callback != null && !this.f4437V) {
            MenuC1018m mo2597k = menuC1018m.mo2597k();
            C0886y[] c0886yArr = this.f4432Q;
            int length = c0886yArr != null ? c0886yArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0886y = c0886yArr[i];
                    if (c0886y != null && c0886y.f4404h == mo2597k) {
                        break;
                    }
                    i++;
                } else {
                    c0886y = null;
                    break;
                }
            }
            if (c0886y != null) {
                return callback.onMenuItemSelected(c0886y.f4397a, menuItem);
            }
        }
        return false;
    }

    @Override // p070g.AbstractC0876o
    /* renamed from: k */
    public final void mo2425k(CharSequence charSequence) {
        this.f4461v = charSequence;
        InterfaceC1114f0 interfaceC1114f0 = this.f4462w;
        if (interfaceC1114f0 != null) {
            interfaceC1114f0.setWindowTitle(charSequence);
            return;
        }
        C0861J c0861j = this.f4459t;
        if (c0861j == null) {
            TextView textView = this.f4422G;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C1097Y0 c1097y0 = (C1097Y0) c0861j.f4298g;
        if (c1097y0.f5138g) {
            return;
        }
        c1097y0.f5139h = charSequence;
        if ((c1097y0.f5133b & 8) != 0) {
            Toolbar toolbar = c1097y0.f5132a;
            toolbar.setTitle(charSequence);
            if (c1097y0.f5138g) {
                AbstractC0169Q.m506k(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0178  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2449l(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        C0105f m2429b;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f4437V) {
            return false;
        }
        int i3 = this.f4439X;
        if (i3 == -100) {
            i3 = AbstractC0876o.f4374g;
        }
        Context context = this.f4455p;
        int m2442B = m2442B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        C0105f m2439n = i4 < 33 ? m2439n(context) : null;
        if (!z3 && m2439n != null) {
            m2439n = AbstractC0881t.m2429b(context.getResources().getConfiguration());
        }
        Configuration m2440s = m2440s(context, m2442B, m2439n, null, false);
        boolean z5 = this.f4442a0;
        Object obj = this.f4454o;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f4438W;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = m2440s.uiMode & 48;
                C0105f m2429b2 = AbstractC0881t.m2429b(configuration);
                m2429b = m2439n != null ? null : AbstractC0881t.m2429b(m2440s);
                i2 = i5 == i6 ? 512 : 0;
                if (m2429b != null && !m2429b2.equals(m2429b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f4435T && ((f4415o0 || this.f4436U) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        if (Build.VERSION.SDK_INT >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(m2440s.getLayoutDirection());
                        }
                        activity.recreate();
                        z4 = true;
                        if (!z4 || i2 == 0) {
                            z6 = z4;
                        } else {
                            boolean z7 = (i2 & i) == i2;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (m2429b != null) {
                                AbstractC0881t.m2431d(configuration2, m2429b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i7 = this.f4440Y;
                            if (i7 != 0) {
                                context.setTheme(i7);
                                context.getTheme().applyStyle(this.f4440Y, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof InterfaceC0553r) {
                                    if (((InterfaceC0553r) activity2).mo1068d().f2001c.compareTo(EnumC0548m.f1992c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f4436U && !this.f4437V) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0870i)) {
                            if ((i2 & 512) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                        }
                        if (m2429b != null) {
                            AbstractC0881t.m2430c(AbstractC0881t.m2429b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            m2458x(context).m1091j();
                        } else {
                            C0884w c0884w = this.f4443b0;
                            if (c0884w != null) {
                                c0884w.m1084c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f4444c0 == null) {
                                this.f4444c0 = new C0884w(this, context);
                            }
                            this.f4444c0.m1091j();
                        } else {
                            C0884w c0884w2 = this.f4444c0;
                            if (c0884w2 != null) {
                                c0884w2.m1084c();
                            }
                        }
                        return z6;
                    }
                }
                z4 = false;
                if (z4) {
                }
                z6 = z4;
                if (z6) {
                    if ((i2 & 512) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                }
                if (m2429b != null) {
                }
                if (i3 == 0) {
                }
                if (i3 == 3) {
                }
                return z6;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f4441Z = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f4441Z = 0;
            }
        }
        this.f4442a0 = true;
        i = this.f4441Z;
        configuration = this.f4438W;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = m2440s.uiMode & 48;
        C0105f m2429b22 = AbstractC0881t.m2429b(configuration);
        if (m2439n != null) {
        }
        if (i52 == i62) {
        }
        if (m2429b != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z4 = false;
        if (z4) {
        }
        z6 = z4;
        if (z6) {
        }
        if (m2429b != null) {
        }
        if (i3 == 0) {
        }
        if (i3 == 3) {
        }
        return z6;
    }

    /* renamed from: m */
    public final void m2450m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f4456q != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0883v) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC0883v windowCallbackC0883v = new WindowCallbackC0883v(this, callback);
        this.f4457r = windowCallbackC0883v;
        window.setCallback(windowCallbackC0883v);
        int[] iArr = f4414n0;
        Context context = this.f4455p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C1141t m2762a = C1141t.m2762a();
            synchronized (m2762a) {
                drawable = m2762a.f5273a.m2673d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f4456q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f4452k0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f4453l0) != null) {
            AbstractC0882u.m2434c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4453l0 = null;
        }
        Object obj = this.f4454o;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f4452k0 = AbstractC0882u.m2432a(activity);
                m2448H();
            }
        }
        this.f4452k0 = null;
        m2448H();
    }

    /* renamed from: o */
    public final void m2451o(int i, C0886y c0886y, MenuC1018m menuC1018m) {
        if (menuC1018m == null) {
            if (c0886y == null && i >= 0) {
                C0886y[] c0886yArr = this.f4432Q;
                if (i < c0886yArr.length) {
                    c0886y = c0886yArr[i];
                }
            }
            if (c0886y != null) {
                menuC1018m = c0886y.f4404h;
            }
        }
        if ((c0886y == null || c0886y.f4409m) && !this.f4437V) {
            WindowCallbackC0883v windowCallbackC0883v = this.f4457r;
            Window.Callback callback = this.f4456q.getCallback();
            windowCallbackC0883v.getClass();
            try {
                windowCallbackC0883v.f4391i = true;
                callback.onPanelClosed(i, menuC1018m);
            } finally {
                windowCallbackC0883v.f4391i = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0115, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c1055d;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f4451j0 == null) {
            int[] iArr = AbstractC0770a.f3903j;
            Context context2 = this.f4455p;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f4451j0 = new C0854C();
            } else {
                try {
                    this.f4451j0 = (C0854C) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f4451j0 = new C0854C();
                }
            }
        }
        C0854C c0854c = this.f4451j0;
        int i2 = AbstractC1102a1.f5150a;
        c0854c.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3917x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0954c = (resourceId == 0 || ((context instanceof C0954c) && ((C0954c) context).f4570a == resourceId)) ? context : new C0954c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str2.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1455429095:
                if (str2.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1346021293:
                if (str2.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -938935918:
                if (str2.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str2.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -339785223:
                if (str2.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 776382189:
                if (str2.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 799298502:
                if (str2.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1125864064:
                if (str2.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1413872058:
                if (str2.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1601505219:
                if (str2.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1666676343:
                if (str2.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2001146706:
                if (str2.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                c1055d = new C1055D(c0954c, attributeSet);
                break;
            case 1:
                c1055d = new C1137r(c0954c, attributeSet);
                break;
            case 2:
                c1055d = new C1153z(c0954c, attributeSet);
                break;
            case 3:
                c1055d = c0854c.mo2140e(c0954c, attributeSet);
                break;
            case 4:
                c1055d = new AppCompatImageButton(c0954c, attributeSet);
                break;
            case 5:
                c1055d = new C1059F(c0954c, attributeSet);
                break;
            case 6:
                c1055d = new C1079P(c0954c, attributeSet);
                break;
            case 7:
                c1055d = c0854c.mo2139d(c0954c, attributeSet);
                break;
            case '\b':
                c1055d = new C1110d0(c0954c, attributeSet);
                break;
            case Platform.GNU /* 9 */:
                c1055d = new C1151y(c0954c, attributeSet, 0);
                break;
            case Platform.KFREEBSD /* 10 */:
                c1055d = c0854c.mo2136a(c0954c, attributeSet);
                break;
            case Platform.NETBSD /* 11 */:
                c1055d = c0854c.mo2138c(c0954c, attributeSet);
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                c1055d = new C1145v(c0954c, attributeSet);
                break;
            case '\r':
                c1055d = c0854c.mo2137b(c0954c, attributeSet);
                break;
            default:
                c1055d = null;
                break;
        }
        if (c1055d == null && context != c0954c) {
            Object[] objArr = c0854c.f4277a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0954c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0854C.f4275g;
                        if (i3 < 3) {
                            View m2373f = c0854c.m2373f(c0954c, str2, strArr[i3]);
                            if (m2373f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = m2373f;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    View m2373f2 = c0854c.m2373f(c0954c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = m2373f2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c1055d = view2;
        }
        if (c1055d != null) {
            Context context3 = c1055d.getContext();
            if ((context3 instanceof ContextWrapper) && c1055d.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0854C.f4271c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c1055d.setOnClickListener(new ViewOnClickListenerC0853B(c1055d, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0954c.obtainStyledAttributes(attributeSet, C0854C.f4272d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    i = 0;
                    new C0153A(com.altaysoft.t500_split.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m416d(c1055d, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0954c.obtainStyledAttributes(attributeSet, C0854C.f4273e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    AbstractC0169Q.m506k(c1055d, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0954c.obtainStyledAttributes(attributeSet, C0854C.f4274f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                    new C0153A(com.altaysoft.t500_split.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).m416d(c1055d, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c1055d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.m2734j() != false) goto L20;
     */
    @Override // p079k.InterfaceC1016k
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1878p(MenuC1018m menuC1018m) {
        ActionMenuView actionMenuView;
        C1123k c1123k;
        C1123k c1123k2;
        C1123k c1123k3;
        InterfaceC1114f0 interfaceC1114f0 = this.f4462w;
        if (interfaceC1114f0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1114f0;
            actionBarOverlayLayout.m1277k();
            Toolbar toolbar = ((C1097Y0) actionBarOverlayLayout.f1756j).f5132a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1827f) != null && actionMenuView.f1781x) {
                if (ViewConfiguration.get(this.f4455p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f4462w;
                    actionBarOverlayLayout2.m1277k();
                    ActionMenuView actionMenuView2 = ((C1097Y0) actionBarOverlayLayout2.f1756j).f5132a.f1827f;
                    if (actionMenuView2 != null) {
                        C1123k c1123k4 = actionMenuView2.f1782y;
                        if (c1123k4 != null) {
                            if (c1123k4.f5199z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f4456q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f4462w;
                actionBarOverlayLayout3.m1277k();
                ActionMenuView actionMenuView3 = ((C1097Y0) actionBarOverlayLayout3.f1756j).f5132a.f1827f;
                if ((actionMenuView3 == null || (c1123k3 = actionMenuView3.f1782y) == null || !c1123k3.m2734j()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f4462w;
                    actionBarOverlayLayout4.m1277k();
                    ActionMenuView actionMenuView4 = ((C1097Y0) actionBarOverlayLayout4.f1756j).f5132a.f1827f;
                    if (actionMenuView4 != null && (c1123k2 = actionMenuView4.f1782y) != null) {
                        c1123k2.m2733f();
                    }
                    if (this.f4437V) {
                        return;
                    }
                    callback.onPanelClosed(108, m2459y(0).f4404h);
                    return;
                }
                if (callback == null || this.f4437V) {
                    return;
                }
                if (this.f4445d0 && (1 & this.f4446e0) != 0) {
                    View decorView = this.f4456q.getDecorView();
                    RunnableC0877p runnableC0877p = this.f4447f0;
                    decorView.removeCallbacks(runnableC0877p);
                    runnableC0877p.run();
                }
                C0886y m2459y = m2459y(0);
                MenuC1018m menuC1018m2 = m2459y.f4404h;
                if (menuC1018m2 == null || m2459y.f4411o || !callback.onPreparePanel(0, m2459y.f4403g, menuC1018m2)) {
                    return;
                }
                callback.onMenuOpened(108, m2459y.f4404h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f4462w;
                actionBarOverlayLayout5.m1277k();
                ActionMenuView actionMenuView5 = ((C1097Y0) actionBarOverlayLayout5.f1756j).f5132a.f1827f;
                if (actionMenuView5 == null || (c1123k = actionMenuView5.f1782y) == null) {
                    return;
                }
                c1123k.m2735l();
                return;
            }
        }
        C0886y m2459y2 = m2459y(0);
        m2459y2.f4410n = true;
        m2453r(m2459y2, false);
        m2444D(m2459y2, null);
    }

    /* renamed from: q */
    public final void m2452q(MenuC1018m menuC1018m) {
        C1123k c1123k;
        if (this.f4431P) {
            return;
        }
        this.f4431P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4462w;
        actionBarOverlayLayout.m1277k();
        ActionMenuView actionMenuView = ((C1097Y0) actionBarOverlayLayout.f1756j).f5132a.f1827f;
        if (actionMenuView != null && (c1123k = actionMenuView.f1782y) != null) {
            c1123k.m2733f();
            C1115g c1115g = c1123k.f5198y;
            if (c1115g != null && c1115g.m2636b()) {
                c1115g.f4905i.dismiss();
            }
        }
        Window.Callback callback = this.f4456q.getCallback();
        if (callback != null && !this.f4437V) {
            callback.onPanelClosed(108, menuC1018m);
        }
        this.f4431P = false;
    }

    /* renamed from: r */
    public final void m2453r(C0886y c0886y, boolean z2) {
        C0885x c0885x;
        InterfaceC1114f0 interfaceC1114f0;
        C1123k c1123k;
        if (z2 && c0886y.f4397a == 0 && (interfaceC1114f0 = this.f4462w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1114f0;
            actionBarOverlayLayout.m1277k();
            ActionMenuView actionMenuView = ((C1097Y0) actionBarOverlayLayout.f1756j).f5132a.f1827f;
            if (actionMenuView != null && (c1123k = actionMenuView.f1782y) != null && c1123k.m2734j()) {
                m2452q(c0886y.f4404h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f4455p.getSystemService("window");
        if (windowManager != null && c0886y.f4409m && (c0885x = c0886y.f4401e) != null) {
            windowManager.removeView(c0885x);
            if (z2) {
                m2451o(c0886y.f4397a, c0886y, null);
            }
        }
        c0886y.f4407k = false;
        c0886y.f4408l = false;
        c0886y.f4409m = false;
        c0886y.f4402f = null;
        c0886y.f4410n = true;
        if (this.f4433R == c0886y) {
            this.f4433R = null;
        }
        if (c0886y.f4397a == 0) {
            m2448H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d6, code lost:
    
        if (r7.m2733f() != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fc, code lost:
    
        if (r7.m2735l() != false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2454t(KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        ActionMenuView actionMenuView;
        C1123k c1123k;
        Object obj = this.f4454o;
        if (((obj instanceof InterfaceC0196j) || (obj instanceof DialogInterfaceC0867f)) && this.f4456q.getDecorView() != null) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        }
        if (keyEvent.getKeyCode() == 82) {
            WindowCallbackC0883v windowCallbackC0883v = this.f4457r;
            Window.Callback callback = this.f4456q.getCallback();
            windowCallbackC0883v.getClass();
            try {
                windowCallbackC0883v.f4390h = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                windowCallbackC0883v.f4390h = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f4434S = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                C0886y m2459y = m2459y(0);
                if (m2459y.f4409m) {
                    return true;
                }
                m2446F(m2459y, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f4465z != null) {
                    return true;
                }
                C0886y m2459y2 = m2459y(0);
                InterfaceC1114f0 interfaceC1114f0 = this.f4462w;
                Context context = this.f4455p;
                if (interfaceC1114f0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1114f0;
                    actionBarOverlayLayout.m1277k();
                    Toolbar toolbar = ((C1097Y0) actionBarOverlayLayout.f1756j).f5132a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1827f) != null && actionMenuView.f1781x && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f4462w;
                        actionBarOverlayLayout2.m1277k();
                        ActionMenuView actionMenuView2 = ((C1097Y0) actionBarOverlayLayout2.f1756j).f5132a.f1827f;
                        if (actionMenuView2 == null || (c1123k = actionMenuView2.f1782y) == null || !c1123k.m2734j()) {
                            if (!this.f4437V && m2446F(m2459y2, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f4462w;
                                actionBarOverlayLayout3.m1277k();
                                ActionMenuView actionMenuView3 = ((C1097Y0) actionBarOverlayLayout3.f1756j).f5132a.f1827f;
                                if (actionMenuView3 != null) {
                                    C1123k c1123k2 = actionMenuView3.f1782y;
                                    if (c1123k2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f4462w;
                            actionBarOverlayLayout4.m1277k();
                            ActionMenuView actionMenuView4 = ((C1097Y0) actionBarOverlayLayout4.f1756j).f5132a.f1827f;
                            if (actionMenuView4 != null) {
                                C1123k c1123k3 = actionMenuView4.f1782y;
                                if (c1123k3 != null) {
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            return true;
                        }
                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                }
                boolean z4 = m2459y2.f4409m;
                if (z4 || m2459y2.f4408l) {
                    m2453r(m2459y2, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (m2459y2.f4407k) {
                        if (m2459y2.f4411o) {
                            m2459y2.f4407k = false;
                            z3 = m2446F(m2459y2, keyEvent);
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            m2444D(m2459y2, keyEvent);
                            z2 = true;
                            if (z2) {
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
        } else if (m2443C()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void m2455u(int i) {
        C0886y m2459y = m2459y(i);
        if (m2459y.f4404h != null) {
            Bundle bundle = new Bundle();
            m2459y.f4404h.m2624t(bundle);
            if (bundle.size() > 0) {
                m2459y.f4412p = bundle;
            }
            m2459y.f4404h.m2627w();
            m2459y.f4404h.clear();
        }
        m2459y.f4411o = true;
        m2459y.f4410n = true;
        if ((i == 108 || i == 0) && this.f4462w != null) {
            C0886y m2459y2 = m2459y(0);
            m2459y2.f4407k = false;
            m2446F(m2459y2, null);
        }
    }

    /* renamed from: v */
    public final void m2456v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f4420E) {
            return;
        }
        int[] iArr = AbstractC0770a.f3903j;
        Context context = this.f4455p;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            mo2421f(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            mo2421f(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            mo2421f(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            mo2421f(10);
        }
        this.f4429N = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        m2457w();
        this.f4456q.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f4430O) {
            viewGroup = this.f4428M ? (ViewGroup) from.inflate(com.altaysoft.t500_split.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.altaysoft.t500_split.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f4429N) {
            viewGroup = (ViewGroup) from.inflate(com.altaysoft.t500_split.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f4427L = false;
            this.f4426K = false;
        } else if (this.f4426K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.altaysoft.t500_split.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0954c(context, typedValue.resourceId) : context).inflate(com.altaysoft.t500_split.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1114f0 interfaceC1114f0 = (InterfaceC1114f0) viewGroup.findViewById(com.altaysoft.t500_split.R.id.decor_content_parent);
            this.f4462w = interfaceC1114f0;
            interfaceC1114f0.setWindowCallback(this.f4456q.getCallback());
            if (this.f4427L) {
                ((ActionBarOverlayLayout) this.f4462w).m1276j(109);
            }
            if (this.f4424I) {
                ((ActionBarOverlayLayout) this.f4462w).m1276j(2);
            }
            if (this.f4425J) {
                ((ActionBarOverlayLayout) this.f4462w).m1276j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f4426K + ", windowActionBarOverlay: " + this.f4427L + ", android:windowIsFloating: " + this.f4429N + ", windowActionModeOverlay: " + this.f4428M + ", windowNoTitle: " + this.f4430O + " }");
        }
        C0878q c0878q = new C0878q(this, i2);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(viewGroup, c0878q);
        if (this.f4462w == null) {
            this.f4422G = (TextView) viewGroup.findViewById(com.altaysoft.t500_split.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.altaysoft.t500_split.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f4456q.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f4456q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0878q(this, i));
        this.f4421F = viewGroup;
        Object obj = this.f4454o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4461v;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1114f0 interfaceC1114f02 = this.f4462w;
            if (interfaceC1114f02 != null) {
                interfaceC1114f02.setWindowTitle(title);
            } else {
                C0861J c0861j = this.f4459t;
                if (c0861j != null) {
                    C1097Y0 c1097y0 = (C1097Y0) c0861j.f4298g;
                    if (!c1097y0.f5138g) {
                        c1097y0.f5139h = title;
                        if ((c1097y0.f5133b & 8) != 0) {
                            Toolbar toolbar = c1097y0.f5132a;
                            toolbar.setTitle(title);
                            if (c1097y0.f5138g) {
                                AbstractC0169Q.m506k(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f4422G;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f4421F.findViewById(R.id.content);
        View decorView = this.f4456q.getDecorView();
        contentFrameLayout2.f1800l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f4420E = true;
        C0886y m2459y = m2459y(0);
        if (this.f4437V || m2459y.f4404h != null) {
            return;
        }
        m2441A(108);
    }

    /* renamed from: w */
    public final void m2457w() {
        if (this.f4456q == null) {
            Object obj = this.f4454o;
            if (obj instanceof Activity) {
                m2450m(((Activity) obj).getWindow());
            }
        }
        if (this.f4456q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: x */
    public final AbstractC0408g m2458x(Context context) {
        if (this.f4443b0 == null) {
            if (C0198k.f531e == null) {
                Context applicationContext = context.getApplicationContext();
                C0198k.f531e = new C0198k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4443b0 = new C0884w(this, C0198k.f531e);
        }
        return this.f4443b0;
    }

    /* renamed from: y */
    public final C0886y m2459y(int i) {
        C0886y[] c0886yArr = this.f4432Q;
        if (c0886yArr == null || c0886yArr.length <= i) {
            C0886y[] c0886yArr2 = new C0886y[i + 1];
            if (c0886yArr != null) {
                System.arraycopy(c0886yArr, 0, c0886yArr2, 0, c0886yArr.length);
            }
            this.f4432Q = c0886yArr2;
            c0886yArr = c0886yArr2;
        }
        C0886y c0886y = c0886yArr[i];
        if (c0886y != null) {
            return c0886y;
        }
        C0886y c0886y2 = new C0886y();
        c0886y2.f4397a = i;
        c0886y2.f4410n = false;
        c0886yArr[i] = c0886y2;
        return c0886y2;
    }

    /* renamed from: z */
    public final void m2460z() {
        m2456v();
        if (this.f4426K && this.f4459t == null) {
            Object obj = this.f4454o;
            if (obj instanceof Activity) {
                this.f4459t = new C0861J((Activity) obj, this.f4427L);
            } else if (obj instanceof Dialog) {
                this.f4459t = new C0861J((Dialog) obj);
            }
            C0861J c0861j = this.f4459t;
            if (c0861j != null) {
                c0861j.m2394y0(this.f4448g0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
