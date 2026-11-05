package p082l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: l.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC1122j0 {

    /* renamed from: a */
    public static final Method f5173a;

    /* renamed from: b */
    public static final Method f5174b;

    /* renamed from: c */
    public static final Method f5175c;

    /* renamed from: d */
    public static final boolean f5176d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f5173a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f5174b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f5175c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f5176d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
