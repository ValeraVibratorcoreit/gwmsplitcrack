package p082l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.altaysoft.t500_split.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p008D.AbstractC0070a;
import p080k0.C1047p;
import p091o.C1195e;
import p091o.C1202l;

/* renamed from: l.H0 */
/* loaded from: classes.dex */
public final class C1064H0 {

    /* renamed from: g */
    public static C1064H0 f5046g;

    /* renamed from: a */
    public WeakHashMap f5048a;

    /* renamed from: b */
    public final WeakHashMap f5049b = new WeakHashMap(0);

    /* renamed from: c */
    public TypedValue f5050c;

    /* renamed from: d */
    public boolean f5051d;

    /* renamed from: e */
    public C1139s f5052e;

    /* renamed from: f */
    public static final PorterDuff.Mode f5045f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public static final C1062G0 f5047h = new C1062G0(6);

    /* renamed from: b */
    public static synchronized C1064H0 m2669b() {
        C1064H0 c1064h0;
        synchronized (C1064H0.class) {
            try {
                if (f5046g == null) {
                    f5046g = new C1064H0();
                }
                c1064h0 = f5046g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1064h0;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m2670e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1064H0.class) {
            C1062G0 c1062g0 = f5047h;
            c1062g0.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c1062g0.m2861a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final Drawable m2671a(Context context, int i) {
        Drawable drawable;
        if (this.f5050c == null) {
            this.f5050c = new TypedValue();
        }
        TypedValue typedValue = this.f5050c;
        context.getResources().getValue(i, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1195e c1195e = (C1195e) this.f5049b.get(context);
            drawable = null;
            if (c1195e != null) {
                WeakReference weakReference = (WeakReference) c1195e.m2855c(j2, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        c1195e.m2858f(j2);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f5052e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{m2672c(context, R.drawable.abc_cab_background_internal_bg), m2672c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C1139s.m2756c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C1139s.m2756c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C1139s.m2756c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        C1195e c1195e2 = (C1195e) this.f5049b.get(context);
                        if (c1195e2 == null) {
                            c1195e2 = new C1195e();
                            this.f5049b.put(context, c1195e2);
                        }
                        c1195e2.m2857e(j2, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    /* renamed from: c */
    public final synchronized Drawable m2672c(Context context, int i) {
        return m2673d(context, i, false);
    }

    /* renamed from: d */
    public final synchronized Drawable m2673d(Context context, int i, boolean z2) {
        Drawable m2671a;
        try {
            if (!this.f5051d) {
                this.f5051d = true;
                Drawable m2672c = m2672c(context, R.drawable.abc_vector_test);
                if (m2672c == null || (!(m2672c instanceof C1047p) && !"android.graphics.drawable.VectorDrawable".equals(m2672c.getClass().getName()))) {
                    this.f5051d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            m2671a = m2671a(context, i);
            if (m2671a == null) {
                m2671a = AbstractC0000a.m1b(context, i);
            }
            if (m2671a != null) {
                m2671a = m2675g(context, i, z2, m2671a);
            }
            if (m2671a != null) {
                AbstractC1118h0.m2729a(m2671a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m2671a;
    }

    /* renamed from: f */
    public final synchronized ColorStateList m2674f(Context context, int i) {
        ColorStateList colorStateList;
        C1202l c1202l;
        WeakHashMap weakHashMap = this.f5048a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c1202l = (C1202l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1202l.m2875b(i, null);
        if (colorStateList == null) {
            C1139s c1139s = this.f5052e;
            if (c1139s != null) {
                colorStateList2 = c1139s.m2758d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f5048a == null) {
                    this.f5048a = new WeakHashMap();
                }
                C1202l c1202l2 = (C1202l) this.f5048a.get(context);
                if (c1202l2 == null) {
                    c1202l2 = new C1202l();
                    this.f5048a.put(context, c1202l2);
                }
                c1202l2.m2874a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m2675g(Context context, int i, boolean z2, Drawable drawable) {
        int i2;
        boolean z3;
        int round;
        ColorStateList m2674f = m2674f(context, i);
        PorterDuff.Mode mode = null;
        if (m2674f != null) {
            Drawable mutate = drawable.mutate();
            AbstractC0070a.m206h(mutate, m2674f);
            if (this.f5052e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return mutate;
            }
            AbstractC0070a.m207i(mutate, mode);
            return mutate;
        }
        if (this.f5052e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int m2692c = AbstractC1074M0.m2692c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1141t.f5271b;
                C1139s.m2757e(findDrawableByLayerId, m2692c, mode2);
                C1139s.m2757e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1074M0.m2692c(context, R.attr.colorControlNormal), mode2);
                C1139s.m2757e(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC1074M0.m2692c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int m2691b = AbstractC1074M0.m2691b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1141t.f5271b;
                C1139s.m2757e(findDrawableByLayerId2, m2691b, mode3);
                C1139s.m2757e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1074M0.m2692c(context, R.attr.colorControlActivated), mode3);
                C1139s.m2757e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC1074M0.m2692c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C1139s c1139s = this.f5052e;
        boolean z4 = false;
        if (c1139s != null) {
            PorterDuff.Mode mode4 = C1141t.f5271b;
            if (C1139s.m2754a(c1139s.f5250a, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C1139s.m2754a(c1139s.f5252c, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C1139s.m2754a(c1139s.f5253d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                    z3 = true;
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    if (z3) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C1141t.m2763c(AbstractC1074M0.m2692c(context, i2), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z4 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    z3 = false;
                    round = -1;
                    if (z3) {
                    }
                }
                i2 = 16842801;
            }
            z3 = true;
            round = -1;
            if (z3) {
            }
        }
        if (z4 || !z2) {
            return drawable;
        }
        return null;
    }
}
