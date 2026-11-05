package p014G;

import java.util.Locale;
import p018I.AbstractC0132c;

/* renamed from: G.d */
/* loaded from: classes.dex */
public abstract class AbstractC0103d {

    /* renamed from: a */
    public static final Locale[] f338a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: a */
    public static Locale m343a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: b */
    public static boolean m344b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f338a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String m392c = AbstractC0132c.m392c(AbstractC0132c.m390a(AbstractC0132c.m391b(locale)));
                if (!m392c.isEmpty()) {
                    return m392c.equals(AbstractC0132c.m392c(AbstractC0132c.m390a(AbstractC0132c.m391b(locale2))));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i].equals(locale)) {
                break;
            }
            i++;
        }
        return false;
    }
}
