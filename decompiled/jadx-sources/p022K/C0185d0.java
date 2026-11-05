package p022K;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.altaysoft.t500_split.R;
import java.util.List;
import p003B.C0043j;
import p050Z.C0441a;

/* renamed from: K.d0 */
/* loaded from: classes.dex */
public final class C0185d0 extends AbstractC0193h0 {

    /* renamed from: e */
    public static final PathInterpolator f504e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f */
    public static final C0441a f505f = new C0441a();

    /* renamed from: g */
    public static final DecelerateInterpolator f506g = new DecelerateInterpolator();

    /* renamed from: e */
    public static void m543e(View view) {
        C0184d m548j = m548j(view);
        if (m548j != null) {
            ((View) m548j.f502j).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m543e(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: f */
    public static void m544f(View view, WindowInsets windowInsets, boolean z2) {
        C0184d m548j = m548j(view);
        if (m548j != null) {
            m548j.f499g = windowInsets;
            if (!z2) {
                View view2 = (View) m548j.f502j;
                int[] iArr = (int[]) m548j.f503k;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                m548j.f500h = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m544f(viewGroup.getChildAt(i), windowInsets, z2);
            }
        }
    }

    /* renamed from: g */
    public static void m545g(View view, C0221v0 c0221v0, List list) {
        C0184d m548j = m548j(view);
        if (m548j != null) {
            m548j.m538a(c0221v0, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m545g(viewGroup.getChildAt(i), c0221v0, list);
            }
        }
    }

    /* renamed from: h */
    public static void m546h(View view, C0043j c0043j) {
        C0184d m548j = m548j(view);
        if (m548j != null) {
            View view2 = (View) m548j.f502j;
            int[] iArr = (int[]) m548j.f503k;
            view2.getLocationOnScreen(iArr);
            int i = m548j.f500h - iArr[1];
            m548j.f501i = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m546h(viewGroup.getChildAt(i2), c0043j);
            }
        }
    }

    /* renamed from: i */
    public static WindowInsets m547i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: j */
    public static C0184d m548j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0183c0) {
            return ((ViewOnApplyWindowInsetsListenerC0183c0) tag).f496a;
        }
        return null;
    }
}
