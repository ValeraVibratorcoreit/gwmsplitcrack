package p048Y;

import android.util.Log;
import p046X.AbstractComponentCallbacksC0423v;
import p107t1.AbstractC1461d;

/* renamed from: Y.d */
/* loaded from: classes.dex */
public abstract class AbstractC0434d {

    /* renamed from: a */
    public static final C0433c f1401a = C0433c.f1400a;

    /* renamed from: a */
    public static C0433c m1142a(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        while (abstractComponentCallbacksC0423v != null) {
            if (abstractComponentCallbacksC0423v.m1134q()) {
                abstractComponentCallbacksC0423v.m1128k();
            }
            abstractComponentCallbacksC0423v = abstractComponentCallbacksC0423v.f1377z;
        }
        return f1401a;
    }

    /* renamed from: b */
    public static void m1143b(C0431a c0431a) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0431a.f1394a.getClass().getName()), c0431a);
        }
    }

    /* renamed from: c */
    public static final void m1144c(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, String str) {
        AbstractC1461d.m3494e("fragment", abstractComponentCallbacksC0423v);
        AbstractC1461d.m3494e("previousFragmentId", str);
        m1143b(new C0431a(abstractComponentCallbacksC0423v, "Attempting to reuse fragment " + abstractComponentCallbacksC0423v + " with previous ID " + str));
        m1142a(abstractComponentCallbacksC0423v).getClass();
    }
}
