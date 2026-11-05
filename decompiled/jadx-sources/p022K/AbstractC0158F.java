package p022K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.altaysoft.t500_split.R;
import p006C.C0058f;

/* renamed from: K.F */
/* loaded from: classes.dex */
public abstract class AbstractC0158F {
    /* renamed from: a */
    public static void m420a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static C0221v0 m421b(View view, C0221v0 c0221v0, Rect rect) {
        WindowInsets m685f = c0221v0.m685f();
        if (m685f != null) {
            return C0221v0.m680g(view, view.computeSystemWindowInsets(m685f, rect));
        }
        rect.setEmpty();
        return c0221v0;
    }

    /* renamed from: c */
    public static boolean m422c(View view, float f2, float f3, boolean z2) {
        return view.dispatchNestedFling(f2, f3, z2);
    }

    /* renamed from: d */
    public static boolean m423d(View view, float f2, float f3) {
        return view.dispatchNestedPreFling(f2, f3);
    }

    /* renamed from: e */
    public static boolean m424e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* renamed from: f */
    public static boolean m425f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* renamed from: g */
    public static ColorStateList m426g(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: h */
    public static PorterDuff.Mode m427h(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: i */
    public static float m428i(View view) {
        return view.getElevation();
    }

    /* renamed from: j */
    public static C0221v0 m429j(View view) {
        if (!AbstractC0197j0.f530d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0197j0.f527a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0197j0.f528b.get(obj);
            Rect rect2 = (Rect) AbstractC0197j0.f529c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            AbstractC0205n0 c0203m0 = i >= 30 ? new C0203m0() : i >= 29 ? new C0201l0() : new C0199k0();
            c0203m0.mo615e(C0058f.m140b(rect.left, rect.top, rect.right, rect.bottom));
            c0203m0.mo616g(C0058f.m140b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0221v0 mo614b = c0203m0.mo614b();
            mo614b.f573a.mo659p(mo614b);
            mo614b.f573a.mo653d(view.getRootView());
            return mo614b;
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
    }

    /* renamed from: k */
    public static String m430k(View view) {
        return view.getTransitionName();
    }

    /* renamed from: l */
    public static float m431l(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: m */
    public static float m432m(View view) {
        return view.getZ();
    }

    /* renamed from: n */
    public static boolean m433n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: o */
    public static boolean m434o(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: p */
    public static boolean m435p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: q */
    public static void m436q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: r */
    public static void m437r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: s */
    public static void m438s(View view, float f2) {
        view.setElevation(f2);
    }

    /* renamed from: t */
    public static void m439t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    /* renamed from: u */
    public static void m440u(View view, InterfaceC0210q interfaceC0210q) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0210q);
        }
        if (interfaceC0210q == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0157E(view, interfaceC0210q));
        }
    }

    /* renamed from: v */
    public static void m441v(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: w */
    public static void m442w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    /* renamed from: x */
    public static void m443x(View view, float f2) {
        view.setZ(f2);
    }

    /* renamed from: y */
    public static boolean m444y(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* renamed from: z */
    public static void m445z(View view) {
        view.stopNestedScroll();
    }
}
