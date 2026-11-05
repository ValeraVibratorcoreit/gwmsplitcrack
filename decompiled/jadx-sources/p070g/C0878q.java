package p070g;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.altaysoft.t500_split.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000A.AbstractC0001b;
import p006C.C0058f;
import p022K.AbstractC0156D;
import p022K.AbstractC0159G;
import p022K.AbstractC0169Q;
import p022K.AbstractC0205n0;
import p022K.C0199k0;
import p022K.C0201l0;
import p022K.C0203m0;
import p022K.C0221v0;
import p022K.InterfaceC0210q;
import p079k.InterfaceC1029x;
import p079k.MenuC1018m;
import p082l.AbstractC1108c1;
import p082l.InterfaceC1112e0;
import p121y0.AbstractC1680h;

/* renamed from: g.q */
/* loaded from: classes.dex */
public final class C0878q implements InterfaceC0210q, InterfaceC1112e0, InterfaceC1029x {

    /* renamed from: f */
    public final /* synthetic */ int f4384f;

    /* renamed from: g */
    public final /* synthetic */ LayoutInflaterFactory2C0887z f4385g;

    public /* synthetic */ C0878q(LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z, int i) {
        this.f4384f = i;
        this.f4385g = layoutInflaterFactory2C0887z;
    }

    @Override // p079k.InterfaceC1029x
    /* renamed from: a */
    public void mo1874a(MenuC1018m menuC1018m, boolean z2) {
        C0886y c0886y;
        switch (this.f4384f) {
            case 2:
                this.f4385g.m2452q(menuC1018m);
                break;
            default:
                MenuC1018m mo2597k = menuC1018m.mo2597k();
                int i = 0;
                boolean z3 = mo2597k != menuC1018m;
                if (z3) {
                    menuC1018m = mo2597k;
                }
                LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4385g;
                C0886y[] c0886yArr = layoutInflaterFactory2C0887z.f4432Q;
                int length = c0886yArr != null ? c0886yArr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0886y = null;
                    } else {
                        c0886y = c0886yArr[i];
                        if (c0886y == null || c0886y.f4404h != menuC1018m) {
                            i++;
                        }
                    }
                }
                if (c0886y != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0887z.m2453r(c0886y, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0887z.m2451o(c0886y.f4397a, c0886y, mo2597k);
                        layoutInflaterFactory2C0887z.m2453r(c0886y, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p079k.InterfaceC1029x
    /* renamed from: b */
    public boolean mo1875b(MenuC1018m menuC1018m) {
        Window.Callback callback;
        switch (this.f4384f) {
            case 2:
                Window.Callback callback2 = this.f4385g.f4456q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC1018m);
                    break;
                }
                break;
            default:
                if (menuC1018m == menuC1018m.mo2597k()) {
                    LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4385g;
                    if (layoutInflaterFactory2C0887z.f4426K && (callback = layoutInflaterFactory2C0887z.f4456q.getCallback()) != null && !layoutInflaterFactory2C0887z.f4437V) {
                        callback.onMenuOpened(108, menuC1018m);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // p022K.InterfaceC0210q
    /* renamed from: c */
    public C0221v0 mo18c(View view, C0221v0 c0221v0) {
        int i;
        boolean z2;
        C0221v0 c0221v02;
        boolean z3;
        int m684d = c0221v0.m684d();
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4385g;
        layoutInflaterFactory2C0887z.getClass();
        int m684d2 = c0221v0.m684d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0887z.f4416A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0887z.f4416A.getLayoutParams();
            if (layoutInflaterFactory2C0887z.f4416A.isShown()) {
                if (layoutInflaterFactory2C0887z.f4449h0 == null) {
                    layoutInflaterFactory2C0887z.f4449h0 = new Rect();
                    layoutInflaterFactory2C0887z.f4450i0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0887z.f4449h0;
                Rect rect2 = layoutInflaterFactory2C0887z.f4450i0;
                rect.set(c0221v0.m682b(), c0221v0.m684d(), c0221v0.m683c(), c0221v0.m681a());
                ViewGroup viewGroup = layoutInflaterFactory2C0887z.f4421F;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC1108c1.m2728a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC1680h.f9573i) {
                        AbstractC1680h.f9573i = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC1680h.f9574j = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC1680h.f9574j.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC1680h.f9574j;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e2) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0887z.f4421F;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                C0221v0 m446a = AbstractC0159G.m446a(viewGroup2);
                int m682b = m446a == null ? 0 : m446a.m682b();
                int m683c = m446a == null ? 0 : m446a.m683c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                Context context = layoutInflaterFactory2C0887z.f4455p;
                if (i2 <= 0 || layoutInflaterFactory2C0887z.f4423H != null) {
                    View view2 = layoutInflaterFactory2C0887z.f4423H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != m682b || marginLayoutParams2.rightMargin != m683c) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = m682b;
                            marginLayoutParams2.rightMargin = m683c;
                            layoutInflaterFactory2C0887z.f4423H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0887z.f4423H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m682b;
                    layoutParams.rightMargin = m683c;
                    layoutInflaterFactory2C0887z.f4421F.addView(layoutInflaterFactory2C0887z.f4423H, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0887z.f4423H;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0887z.f4423H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0001b.m3a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0001b.m3a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0887z.f4428M && r11) {
                    m684d2 = 0;
                }
                z2 = r11;
                r11 = z3;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = false;
                } else {
                    z2 = false;
                    r11 = false;
                }
            }
            if (r11) {
                layoutInflaterFactory2C0887z.f4416A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0887z.f4423H;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (m684d != m684d2) {
            int m682b2 = c0221v0.m682b();
            int m683c2 = c0221v0.m683c();
            int m681a = c0221v0.m681a();
            int i7 = Build.VERSION.SDK_INT;
            AbstractC0205n0 c0203m0 = i7 >= 30 ? new C0203m0(c0221v0) : i7 >= 29 ? new C0201l0(c0221v0) : new C0199k0(c0221v0);
            c0203m0.mo616g(C0058f.m140b(m682b2, m684d2, m683c2, m681a));
            c0221v02 = c0203m0.mo614b();
        } else {
            c0221v02 = c0221v0;
        }
        WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
        WindowInsets m685f = c0221v02.m685f();
        if (m685f == null) {
            return c0221v02;
        }
        WindowInsets m418b = AbstractC0156D.m418b(view, m685f);
        return !m418b.equals(m685f) ? C0221v0.m680g(view, m418b) : c0221v02;
    }
}
