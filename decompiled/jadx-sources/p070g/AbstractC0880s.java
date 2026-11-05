package p070g;

import android.os.PowerManager;
import java.util.Locale;

/* renamed from: g.s */
/* loaded from: classes.dex */
public abstract class AbstractC0880s {
    /* renamed from: a */
    public static boolean m2426a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* renamed from: b */
    public static String m2427b(Locale locale) {
        return locale.toLanguageTag();
    }
}
