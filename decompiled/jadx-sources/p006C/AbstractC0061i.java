package p006C;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;

/* renamed from: C.i */
/* loaded from: classes.dex */
public abstract class AbstractC0061i {

    /* renamed from: a */
    public static final /* synthetic */ int f207a = 0;

    static {
        new ThreadLocal();
    }

    /* renamed from: a */
    public static void m145a(Paint paint, EnumC0053a enumC0053a) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0060h.m144a(paint, enumC0053a != null ? AbstractC0054b.m103a(enumC0053a) : null);
            return;
        }
        if (enumC0053a == null) {
            paint.setXfermode(null);
            return;
        }
        switch (enumC0053a.ordinal()) {
            case 0:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 1:
                mode = PorterDuff.Mode.SRC;
                break;
            case 2:
                mode = PorterDuff.Mode.DST;
                break;
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 6:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 8:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case Platform.GNU /* 9 */:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case Platform.KFREEBSD /* 10 */:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case Platform.NETBSD /* 11 */:
                mode = PorterDuff.Mode.XOR;
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                mode = PorterDuff.Mode.ADD;
                break;
            case 13:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 14:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 15:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 17:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = null;
                break;
        }
        paint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }
}
