package p024L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.f */
/* loaded from: classes.dex */
public abstract class AbstractC0236f {
    /* renamed from: a */
    public static Object m702a(int i, float f2, float f3, float f4) {
        return new AccessibilityNodeInfo.RangeInfo(i, f2, f3, f4);
    }

    /* renamed from: b */
    public static CharSequence m703b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: c */
    public static void m704c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
