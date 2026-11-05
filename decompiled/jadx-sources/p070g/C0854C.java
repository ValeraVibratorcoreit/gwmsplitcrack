package p070g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import java.lang.reflect.Constructor;
import p082l.C1053C;
import p082l.C1096Y;
import p082l.C1131o;
import p082l.C1135q;
import p091o.C1201k;

/* renamed from: g.C */
/* loaded from: classes.dex */
public class C0854C {

    /* renamed from: b */
    public static final Class[] f4270b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f4271c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f4272d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f4273e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f4274f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f4275g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C1201k f4276h = new C1201k();

    /* renamed from: a */
    public final Object[] f4277a = new Object[2];

    /* renamed from: a */
    public C1131o mo2136a(Context context, AttributeSet attributeSet) {
        return new C1131o(context, attributeSet);
    }

    /* renamed from: b */
    public AppCompatButton mo2137b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: c */
    public C1135q mo2138c(Context context, AttributeSet attributeSet) {
        return new C1135q(context, attributeSet, com.altaysoft.t500_split.R.attr.checkboxStyle);
    }

    /* renamed from: d */
    public C1053C mo2139d(Context context, AttributeSet attributeSet) {
        return new C1053C(context, attributeSet);
    }

    /* renamed from: e */
    public C1096Y mo2140e(Context context, AttributeSet attributeSet) {
        return new C1096Y(context, attributeSet);
    }

    /* renamed from: f */
    public final View m2373f(Context context, String str, String str2) {
        String concat;
        C1201k c1201k = f4276h;
        Constructor constructor = (Constructor) c1201k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4270b);
            c1201k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f4277a);
    }
}
