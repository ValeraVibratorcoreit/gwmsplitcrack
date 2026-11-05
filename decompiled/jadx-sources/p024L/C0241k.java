package p024L;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.altaysoft.t500_split.media.C0639g;
import java.util.List;

/* renamed from: L.k */
/* loaded from: classes.dex */
public final class C0241k extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C0639g f629a;

    public C0241k(C0639g c0639g) {
        this.f629a = c0639g;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f629a.getClass();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C0240j mo849t = this.f629a.mo849t(i);
        if (mo849t == null) {
            return null;
        }
        return mo849t.f627a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f629a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C0240j mo850v = this.f629a.mo850v(i);
        if (mo850v == null) {
            return null;
        }
        return mo850v.f627a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f629a.mo848A(i, i2, bundle);
    }
}
