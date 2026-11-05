package p018I;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: I.c */
/* loaded from: classes.dex */
public abstract class AbstractC0132c {
    /* renamed from: a */
    public static ULocale m390a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* renamed from: b */
    public static ULocale m391b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: c */
    public static String m392c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
