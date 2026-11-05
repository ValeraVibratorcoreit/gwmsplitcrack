package p024L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.i */
/* loaded from: classes.dex */
public final class C0239i {

    /* renamed from: a */
    public final AccessibilityNodeInfo.CollectionItemInfo f626a;

    public C0239i(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f626a = collectionItemInfo;
    }

    /* renamed from: a */
    public static C0239i m727a(boolean z2, int i, int i2, int i3, int i4) {
        return new C0239i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z2));
    }
}
