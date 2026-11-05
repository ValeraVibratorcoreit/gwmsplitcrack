package p041U0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import com.sun.jna.Function;
import p006C.AbstractC0055c;

/* renamed from: U0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0338a {

    /* renamed from: a */
    public static final int[] f965a = {R.attr.state_pressed};

    /* renamed from: b */
    public static final int[] f966b = {R.attr.state_focused};

    /* renamed from: c */
    public static final int[] f967c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d */
    public static final int[] f968d = {R.attr.state_selected};

    /* renamed from: a */
    public static int m936a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return AbstractC0055c.m107d(colorForState, Math.min(Color.alpha(colorForState) * 2, Function.USE_VARARGS));
    }
}
