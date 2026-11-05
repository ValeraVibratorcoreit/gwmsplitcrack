package p082l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: l.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC1128m0 {

    /* renamed from: a */
    public static final Field f5208a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f5208a = field;
    }
}
