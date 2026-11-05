package p082l;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.sun.jna.win32.DLLCallback;

/* renamed from: l.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC1118h0 {

    /* renamed from: a */
    public static final int[] f5168a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f5169b = new int[0];

    static {
        new Rect();
    }

    /* renamed from: a */
    public static void m2729a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f5168a);
        } else {
            drawable.setState(f5169b);
        }
        drawable.setState(state);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2730b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case DLLCallback.DLL_FPTRS /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
