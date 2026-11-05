package p070g;

import android.content.res.Configuration;
import android.os.LocaleList;
import p014G.C0105f;

/* renamed from: g.t */
/* loaded from: classes.dex */
public abstract class AbstractC0881t {
    /* renamed from: a */
    public static void m2428a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* renamed from: b */
    public static C0105f m2429b(Configuration configuration) {
        return C0105f.m348a(configuration.getLocales().toLanguageTags());
    }

    /* renamed from: c */
    public static void m2430c(C0105f c0105f) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c0105f.f340a.f341a.toLanguageTags()));
    }

    /* renamed from: d */
    public static void m2431d(Configuration configuration, C0105f c0105f) {
        configuration.setLocales(LocaleList.forLanguageTags(c0105f.f340a.f341a.toLanguageTags()));
    }
}
