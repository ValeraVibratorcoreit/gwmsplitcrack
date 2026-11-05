package p082l;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: l.S */
/* loaded from: classes.dex */
public abstract class AbstractC1084S {
    /* renamed from: a */
    public static LocaleList m2696a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: b */
    public static void m2697b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
