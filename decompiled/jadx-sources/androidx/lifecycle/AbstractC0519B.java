package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import com.sun.jna.Callback;
import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.B */
/* loaded from: classes.dex */
public abstract class AbstractC0519B {
    /* renamed from: a */
    public static final void m1358a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC1461d.m3494e("activity", activity);
        AbstractC1461d.m3494e(Callback.METHOD_NAME, activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
