package p022K;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: K.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC0197j0 {

    /* renamed from: a */
    public static final Field f527a;

    /* renamed from: b */
    public static final Field f528b;

    /* renamed from: c */
    public static final Field f529c;

    /* renamed from: d */
    public static final boolean f530d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f527a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f528b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f529c = declaredField3;
            declaredField3.setAccessible(true);
            f530d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
