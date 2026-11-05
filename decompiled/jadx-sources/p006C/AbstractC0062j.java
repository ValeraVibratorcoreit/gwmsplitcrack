package p006C;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import p046X.AbstractComponentCallbacksC0423v;
import p097q.AbstractC1241e;
import p107t1.AbstractC1461d;

/* renamed from: C.j */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0062j {
    /* renamed from: A */
    public static /* synthetic */ String m146A(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case Platform.GNU /* 9 */:
                return "NULL";
            case Platform.KFREEBSD /* 10 */:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* renamed from: a */
    public static final void m147a(View view, int i) {
        AbstractC1461d.m3494e("view", view);
        int m2943b = AbstractC1241e.m2943b(i);
        if (m2943b == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (m2943b == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (m2943b == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (m2943b != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* renamed from: b */
    public static /* synthetic */ int m148b(int i) {
        switch (i) {
            case 1:
            case 2:
                return R.drawable.ip_back_t500_transparent;
            case 3:
                return R.drawable.logo_menu_asiaforce;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case Platform.GNU /* 9 */:
            case Platform.KFREEBSD /* 10 */:
            case Platform.NETBSD /* 11 */:
            case Platform.DRAGONFLYBSD /* 12 */:
            case 13:
            case 14:
            case 15:
            case DLLCallback.DLL_FPTRS /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return R.drawable.ip_back_t500_transparent;
            case 31:
                return R.drawable.logo_menu_arctictrucks;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                return R.drawable.ip_back_t500_transparent;
            default:
                throw null;
        }
    }

    /* renamed from: c */
    public static float m149c(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    /* renamed from: d */
    public static int m150d(float f2, float f3, float f4) {
        return Math.round((f2 * f3) + f4);
    }

    /* renamed from: e */
    public static int m151e(float f2, float f3, float f4, float f5) {
        return Math.round(((f2 - f3) * f4) + f5);
    }

    /* renamed from: f */
    public static int m152f(float f2, float f3, int i) {
        return Math.max(i, Math.round(f2 * f3));
    }

    /* renamed from: g */
    public static int m153g(float f2, float f3, ImageView imageView) {
        imageView.setPivotX(f2 * f3);
        return imageView.getHeight();
    }

    /* renamed from: h */
    public static int m154h(String str, String str2, SharedPreferences sharedPreferences, int i) {
        return sharedPreferences.getInt(str + str2, i);
    }

    /* renamed from: i */
    public static ForegroundColorSpan m155i(TextView textView, int i, int i2) {
        textView.setTextColor(i);
        return new ForegroundColorSpan(i2);
    }

    /* renamed from: j */
    public static String m156j(int i, String str) {
        return str + i;
    }

    /* renamed from: k */
    public static String m157k(SharedPreferences.Editor editor, String str, int i, String str2, String str3) {
        editor.putInt(str, i);
        return str2 + str3;
    }

    /* renamed from: l */
    public static String m158l(SharedPreferences.Editor editor, String str, boolean z2, String str2, String str3) {
        editor.putBoolean(str, z2);
        return str2 + str3;
    }

    /* renamed from: m */
    public static String m159m(String str, AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, String str2) {
        return str + abstractComponentCallbacksC0423v + str2;
    }

    /* renamed from: n */
    public static String m160n(String str, String str2) {
        return str + str2;
    }

    /* renamed from: o */
    public static String m161o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: p */
    public static String m162p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: q */
    public static StringBuilder m163q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: r */
    public static void m164r(float f2, float f3, float f4, TextView textView, int i) {
        textView.setTextSize(i, f2 * f3 * f4);
    }

    /* renamed from: s */
    public static /* synthetic */ void m165s(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1461d.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            AbstractC1461d.m3495f(nullPointerException, AbstractC1461d.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: t */
    public static void m166t(ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new DecelerateInterpolator());
    }

    /* renamed from: u */
    public static boolean m167u(String str, String str2, SharedPreferences sharedPreferences, boolean z2) {
        return sharedPreferences.getBoolean(str + str2, z2);
    }

    /* renamed from: v */
    public static int m168v(float f2, float f3, float f4) {
        return Math.round(f2 * f3 * f4);
    }

    /* renamed from: w */
    public static String m169w(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: x */
    public static /* synthetic */ String m170x(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case Platform.GNU /* 9 */:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* renamed from: y */
    public static /* synthetic */ String m171y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    /* renamed from: z */
    public static /* synthetic */ String m172z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
