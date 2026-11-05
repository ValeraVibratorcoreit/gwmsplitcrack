package p070g;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p003B.C0043j;
import p022K.AbstractC0156D;
import p022K.AbstractC0169Q;
import p022K.C0175X;
import p033Q.AbstractC0278l;
import p038T.C0326t;
import p076j.AbstractC0952a;
import p076j.AbstractC0962k;
import p076j.AbstractC0963l;
import p076j.AbstractC0964m;
import p076j.C0954c;
import p076j.C0955d;
import p079k.MenuC1018m;

/* renamed from: g.v */
/* loaded from: classes.dex */
public final class WindowCallbackC0883v implements Window.Callback {

    /* renamed from: f */
    public final Window.Callback f4388f;

    /* renamed from: g */
    public boolean f4389g;

    /* renamed from: h */
    public boolean f4390h;

    /* renamed from: i */
    public boolean f4391i;

    /* renamed from: j */
    public final /* synthetic */ LayoutInflaterFactory2C0887z f4392j;

    public WindowCallbackC0883v(LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z, Window.Callback callback) {
        this.f4392j = layoutInflaterFactory2C0887z;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f4388f = callback;
    }

    /* renamed from: a */
    public final void m2435a(Window.Callback callback) {
        try {
            this.f4389g = true;
            callback.onContentChanged();
        } finally {
            this.f4389g = false;
        }
    }

    /* renamed from: b */
    public final boolean m2436b(int i, Menu menu) {
        return this.f4388f.onMenuOpened(i, menu);
    }

    /* renamed from: c */
    public final void m2437c(int i, Menu menu) {
        this.f4388f.onPanelClosed(i, menu);
    }

    /* renamed from: d */
    public final void m2438d(List list, Menu menu, int i) {
        AbstractC0963l.m2506a(this.f4388f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4388f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f4390h;
        Window.Callback callback = this.f4388f;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f4392j.m2454t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z2;
        MenuC1018m menuC1018m;
        boolean performShortcut;
        if (this.f4388f.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4392j;
        layoutInflaterFactory2C0887z.m2460z();
        C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
        if (c0861j != null) {
            C0860I c0860i = c0861j.f4302k;
            if (c0860i == null || (menuC1018m = c0860i.f4288i) == null) {
                performShortcut = false;
            } else {
                menuC1018m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC1018m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        C0886y c0886y = layoutInflaterFactory2C0887z.f4433R;
        if (c0886y == null || !layoutInflaterFactory2C0887z.m2445E(c0886y, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0887z.f4433R == null) {
                C0886y m2459y = layoutInflaterFactory2C0887z.m2459y(0);
                layoutInflaterFactory2C0887z.m2446F(m2459y, keyEvent);
                boolean m2445E = layoutInflaterFactory2C0887z.m2445E(m2459y, keyEvent.getKeyCode(), keyEvent);
                m2459y.f4407k = false;
            }
            z2 = false;
            return !z2;
        }
        C0886y c0886y2 = layoutInflaterFactory2C0887z.f4433R;
        if (c0886y2 != null) {
            c0886y2.f4408l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4388f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4388f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4388f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f4388f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f4388f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f4388f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f4389g) {
            this.f4388f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC1018m)) {
            return this.f4388f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f4388f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f4388f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4388f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m2436b(i, menu);
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4392j;
        if (i == 108) {
            layoutInflaterFactory2C0887z.m2460z();
            C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
            if (c0861j != null && true != c0861j.f4305n) {
                c0861j.f4305n = true;
                ArrayList arrayList = c0861j.f4306o;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0887z.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f4391i) {
            this.f4388f.onPanelClosed(i, menu);
            return;
        }
        m2437c(i, menu);
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4392j;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0887z.getClass();
                return;
            }
            C0886y m2459y = layoutInflaterFactory2C0887z.m2459y(i);
            if (m2459y.f4409m) {
                layoutInflaterFactory2C0887z.m2453r(m2459y, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0887z.m2460z();
        C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
        if (c0861j == null || !c0861j.f4305n) {
            return;
        }
        c0861j.f4305n = false;
        ArrayList arrayList = c0861j.f4306o;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        AbstractC0964m.m2507a(this.f4388f, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC1018m menuC1018m = menu instanceof MenuC1018m ? (MenuC1018m) menu : null;
        if (i == 0 && menuC1018m == null) {
            return false;
        }
        if (menuC1018m != null) {
            menuC1018m.f4852x = true;
        }
        boolean onPreparePanel = this.f4388f.onPreparePanel(i, view, menu);
        if (menuC1018m != null) {
            menuC1018m.f4852x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC1018m menuC1018m = this.f4392j.m2459y(0).f4404h;
        if (menuC1018m != null) {
            m2438d(list, menuC1018m, i);
        } else {
            m2438d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0962k.m2504a(this.f4388f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4388f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f4388f.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        boolean z2 = false;
        int i2 = 1;
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4392j;
        layoutInflaterFactory2C0887z.getClass();
        if (i != 0) {
            return AbstractC0962k.m2505b(this.f4388f, callback, i);
        }
        C0326t c0326t = new C0326t(layoutInflaterFactory2C0887z.f4455p, callback);
        AbstractC0952a abstractC0952a = layoutInflaterFactory2C0887z.f4465z;
        if (abstractC0952a != null) {
            abstractC0952a.mo2376a();
        }
        C0043j c0043j = new C0043j(layoutInflaterFactory2C0887z, c0326t, 14, z2);
        layoutInflaterFactory2C0887z.m2460z();
        C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
        if (c0861j != null) {
            C0860I c0860i = c0861j.f4302k;
            if (c0860i != null) {
                c0860i.mo2376a();
            }
            c0861j.f4296e.setHideOnContentScrollEnabled(false);
            c0861j.f4299h.m1270e();
            C0860I c0860i2 = new C0860I(c0861j, c0861j.f4299h.getContext(), c0043j);
            MenuC1018m menuC1018m = c0860i2.f4288i;
            menuC1018m.m2627w();
            try {
                if (((C0326t) c0860i2.f4289j.f141g).m919l(c0860i2, menuC1018m)) {
                    c0861j.f4302k = c0860i2;
                    c0860i2.mo2382g();
                    c0861j.f4299h.m1268c(c0860i2);
                    c0861j.m2391v0(true);
                } else {
                    c0860i2 = null;
                }
                layoutInflaterFactory2C0887z.f4465z = c0860i2;
            } finally {
                menuC1018m.m2626v();
            }
        }
        if (layoutInflaterFactory2C0887z.f4465z == null) {
            C0175X c0175x = layoutInflaterFactory2C0887z.f4419D;
            if (c0175x != null) {
                c0175x.m521b();
            }
            AbstractC0952a abstractC0952a2 = layoutInflaterFactory2C0887z.f4465z;
            if (abstractC0952a2 != null) {
                abstractC0952a2.mo2376a();
            }
            if (layoutInflaterFactory2C0887z.f4416A == null) {
                boolean z3 = layoutInflaterFactory2C0887z.f4429N;
                Context context = layoutInflaterFactory2C0887z.f4455p;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0954c c0954c = new C0954c(context, 0);
                        c0954c.getTheme().setTo(newTheme);
                        context = c0954c;
                    }
                    layoutInflaterFactory2C0887z.f4416A = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0887z.f4417B = popupWindow;
                    AbstractC0278l.m808d(popupWindow, 2);
                    layoutInflaterFactory2C0887z.f4417B.setContentView(layoutInflaterFactory2C0887z.f4416A);
                    layoutInflaterFactory2C0887z.f4417B.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0887z.f4416A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0887z.f4417B.setHeight(-2);
                    layoutInflaterFactory2C0887z.f4418C = new RunnableC0877p(layoutInflaterFactory2C0887z, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0887z.f4421F.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0887z.m2460z();
                        C0861J c0861j2 = layoutInflaterFactory2C0887z.f4459t;
                        Context m2392w0 = c0861j2 != null ? c0861j2.m2392w0() : null;
                        if (m2392w0 != null) {
                            context = m2392w0;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C0887z.f4416A = (ActionBarContextView) viewStubCompat.m1307a();
                    }
                }
            }
            if (layoutInflaterFactory2C0887z.f4416A != null) {
                C0175X c0175x2 = layoutInflaterFactory2C0887z.f4419D;
                if (c0175x2 != null) {
                    c0175x2.m521b();
                }
                layoutInflaterFactory2C0887z.f4416A.m1270e();
                Context context2 = layoutInflaterFactory2C0887z.f4416A.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0887z.f4416A;
                C0955d c0955d = new C0955d();
                c0955d.f4575h = context2;
                c0955d.f4576i = actionBarContextView;
                c0955d.f4577j = c0043j;
                MenuC1018m menuC1018m2 = new MenuC1018m(actionBarContextView.getContext());
                menuC1018m2.f4840l = 1;
                c0955d.f4580m = menuC1018m2;
                menuC1018m2.f4833e = c0955d;
                if (((C0326t) c0043j.f141g).m919l(c0955d, menuC1018m2)) {
                    c0955d.mo2382g();
                    layoutInflaterFactory2C0887z.f4416A.m1268c(c0955d);
                    layoutInflaterFactory2C0887z.f4465z = c0955d;
                    if (layoutInflaterFactory2C0887z.f4420E && (viewGroup = layoutInflaterFactory2C0887z.f4421F) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0887z.f4416A.setAlpha(0.0f);
                        C0175X m496a = AbstractC0169Q.m496a(layoutInflaterFactory2C0887z.f4416A);
                        m496a.m520a(1.0f);
                        layoutInflaterFactory2C0887z.f4419D = m496a;
                        m496a.m523d(new C0879r(i2, layoutInflaterFactory2C0887z));
                    } else {
                        layoutInflaterFactory2C0887z.f4416A.setAlpha(1.0f);
                        layoutInflaterFactory2C0887z.f4416A.setVisibility(0);
                        if (layoutInflaterFactory2C0887z.f4416A.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0887z.f4416A.getParent();
                            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                            AbstractC0156D.m419c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0887z.f4417B != null) {
                        layoutInflaterFactory2C0887z.f4456q.getDecorView().post(layoutInflaterFactory2C0887z.f4418C);
                    }
                } else {
                    layoutInflaterFactory2C0887z.f4465z = null;
                }
            }
            layoutInflaterFactory2C0887z.m2448H();
            layoutInflaterFactory2C0887z.f4465z = layoutInflaterFactory2C0887z.f4465z;
        }
        layoutInflaterFactory2C0887z.m2448H();
        AbstractC0952a abstractC0952a3 = layoutInflaterFactory2C0887z.f4465z;
        if (abstractC0952a3 != null) {
            return c0326t.m912e(abstractC0952a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f4388f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
