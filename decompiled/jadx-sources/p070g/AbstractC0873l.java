package p070g;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: g.l */
/* loaded from: classes.dex */
public abstract class AbstractC0873l {
    /* renamed from: a */
    public static LocaleList m2413a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* renamed from: b */
    public static void m2414b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
