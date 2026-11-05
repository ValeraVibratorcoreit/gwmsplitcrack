package p123z;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: z.d */
/* loaded from: classes.dex */
public abstract class AbstractC1696d {
    /* renamed from: a */
    public static <T> T m4966a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: b */
    public static int m4967b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: c */
    public static int m4968c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: d */
    public static String m4969d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
