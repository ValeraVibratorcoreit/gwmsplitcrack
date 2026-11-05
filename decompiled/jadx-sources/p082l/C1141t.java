package p082l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.t */
/* loaded from: classes.dex */
public final class C1141t {

    /* renamed from: b */
    public static final PorterDuff.Mode f5271b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C1141t f5272c;

    /* renamed from: a */
    public C1064H0 f5273a;

    /* renamed from: a */
    public static synchronized C1141t m2762a() {
        C1141t c1141t;
        synchronized (C1141t.class) {
            try {
                if (f5272c == null) {
                    m2764d();
                }
                c1141t = f5272c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1141t;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m2763c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m2670e;
        synchronized (C1141t.class) {
            m2670e = C1064H0.m2670e(i, mode);
        }
        return m2670e;
    }

    /* renamed from: d */
    public static synchronized void m2764d() {
        synchronized (C1141t.class) {
            if (f5272c == null) {
                C1141t c1141t = new C1141t();
                f5272c = c1141t;
                c1141t.f5273a = C1064H0.m2669b();
                C1064H0 c1064h0 = f5272c.f5273a;
                C1139s c1139s = new C1139s();
                synchronized (c1064h0) {
                    c1064h0.f5052e = c1139s;
                }
            }
        }
    }

    /* renamed from: e */
    public static void m2765e(Drawable drawable, C1078O0 c1078o0, int[] iArr) {
        PorterDuff.Mode mode = C1064H0.f5045f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c1078o0.f5086d;
        if (!z2 && !c1078o0.f5085c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? c1078o0.f5083a : null;
        PorterDuff.Mode mode2 = c1078o0.f5085c ? c1078o0.f5084b : C1064H0.f5045f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = C1064H0.m2670e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    /* renamed from: b */
    public final synchronized Drawable m2766b(Context context, int i) {
        return this.f5273a.m2672c(context, i);
    }
}
