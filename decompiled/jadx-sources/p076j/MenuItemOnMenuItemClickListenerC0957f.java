package p076j;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: j.f */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0957f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c */
    public static final Class[] f4583c = {MenuItem.class};

    /* renamed from: a */
    public Object f4584a;

    /* renamed from: b */
    public Method f4585b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f4585b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f4584a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
