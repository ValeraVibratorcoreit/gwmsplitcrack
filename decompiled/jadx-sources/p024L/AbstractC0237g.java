package p024L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.g */
/* loaded from: classes.dex */
public abstract class AbstractC0237g {
    /* renamed from: a */
    public static C0239i m705a(boolean z2, int i, int i2, int i3, int i4, boolean z3, String str, String str2) {
        return new C0239i(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build());
    }

    /* renamed from: b */
    public static C0240j m706b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
        if (child != null) {
            return new C0240j(child, 0);
        }
        return null;
    }

    /* renamed from: c */
    public static String m707c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* renamed from: d */
    public static String m708d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m709e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* renamed from: f */
    public static C0240j m710f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new C0240j(parent, 0);
        }
        return null;
    }

    /* renamed from: g */
    public static String m711g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: h */
    public static boolean m712h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: i */
    public static void m713i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    /* renamed from: j */
    public static void m714j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
