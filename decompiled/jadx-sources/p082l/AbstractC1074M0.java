package p082l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p006C.AbstractC0055c;
import p067f.AbstractC0770a;
import p123z.AbstractC1695c;

/* renamed from: l.M0 */
/* loaded from: classes.dex */
public abstract class AbstractC1074M0 {

    /* renamed from: a */
    public static final ThreadLocal f5074a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f5075b = {-16842910};

    /* renamed from: c */
    public static final int[] f5076c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f5077d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f5078e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f5079f = new int[0];

    /* renamed from: g */
    public static final int[] f5080g = new int[1];

    /* renamed from: a */
    public static void m2690a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0770a.f3903j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m2691b(Context context, int i) {
        ColorStateList m2693d = m2693d(context, i);
        if (m2693d != null && m2693d.isStateful()) {
            return m2693d.getColorForState(f5075b, m2693d.getDefaultColor());
        }
        ThreadLocal threadLocal = f5074a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return AbstractC0055c.m107d(m2692c(context, i), Math.round(Color.alpha(r4) * f2));
    }

    /* renamed from: c */
    public static int m2692c(Context context, int i) {
        int[] iArr = f5080g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m2693d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f5080g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC1695c.m4959b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
