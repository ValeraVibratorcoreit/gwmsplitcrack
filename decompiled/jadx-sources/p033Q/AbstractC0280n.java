package p033Q;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: Q.n */
/* loaded from: classes.dex */
public abstract class AbstractC0280n {
    /* renamed from: a */
    public static CharSequence m817a(PrecomputedText precomputedText) {
        return precomputedText;
    }

    /* renamed from: b */
    public static String[] m818b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: c */
    public static PrecomputedText.Params m819c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* renamed from: d */
    public static void m820d(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
