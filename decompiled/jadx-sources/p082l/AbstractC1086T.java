package p082l;

import android.widget.TextView;

/* renamed from: l.T */
/* loaded from: classes.dex */
public abstract class AbstractC1086T {
    /* renamed from: a */
    public static int m2702a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    public static void m2703b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static void m2704c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* renamed from: d */
    public static boolean m2705d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
