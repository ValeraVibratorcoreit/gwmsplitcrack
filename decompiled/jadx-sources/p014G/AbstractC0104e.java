package p014G;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: G.e */
/* loaded from: classes.dex */
public abstract class AbstractC0104e {
    /* renamed from: a */
    public static LocaleList m345a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: b */
    public static LocaleList m346b() {
        return LocaleList.getAdjustedDefault();
    }

    /* renamed from: c */
    public static LocaleList m347c() {
        return LocaleList.getDefault();
    }
}
