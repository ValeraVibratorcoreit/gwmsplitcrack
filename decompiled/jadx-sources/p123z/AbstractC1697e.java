package p123z;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: z.e */
/* loaded from: classes.dex */
public abstract class AbstractC1697e {
    /* renamed from: a */
    public static int m4970a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* renamed from: b */
    public static String m4971b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AppOpsManager m4972c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
