package p022K;

import android.view.View;
import android.view.ViewParent;

/* renamed from: K.V */
/* loaded from: classes.dex */
public abstract class AbstractC0173V {
    /* renamed from: a */
    public static boolean m513a(ViewParent viewParent, View view, float f2, float f3, boolean z2) {
        return viewParent.onNestedFling(view, f2, f3, z2);
    }

    /* renamed from: b */
    public static boolean m514b(ViewParent viewParent, View view, float f2, float f3) {
        return viewParent.onNestedPreFling(view, f2, f3);
    }

    /* renamed from: c */
    public static void m515c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* renamed from: d */
    public static void m516d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* renamed from: e */
    public static void m517e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* renamed from: f */
    public static boolean m518f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* renamed from: g */
    public static void m519g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
