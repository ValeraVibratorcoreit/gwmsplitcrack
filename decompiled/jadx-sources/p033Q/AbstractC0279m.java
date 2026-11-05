package p033Q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* renamed from: Q.m */
/* loaded from: classes.dex */
public abstract class AbstractC0279m {
    /* renamed from: a */
    public static int m809a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* renamed from: b */
    public static ColorStateList m810b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* renamed from: c */
    public static PorterDuff.Mode m811c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* renamed from: d */
    public static int m812d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* renamed from: e */
    public static void m813e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* renamed from: f */
    public static void m814f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* renamed from: g */
    public static void m815g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* renamed from: h */
    public static void m816h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
