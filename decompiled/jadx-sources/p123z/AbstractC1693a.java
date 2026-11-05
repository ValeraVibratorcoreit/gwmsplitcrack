package p123z;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: z.a */
/* loaded from: classes.dex */
public abstract class AbstractC1693a {
    /* renamed from: a */
    public static void m4955a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    /* renamed from: b */
    public static void m4956b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: c */
    public static boolean m4957c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
