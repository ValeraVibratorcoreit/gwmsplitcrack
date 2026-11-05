package p054a1;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: a1.r */
/* loaded from: classes.dex */
public final class C0509r extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C0510s f1622a;

    public C0509r(C0510s c0510s) {
        this.f1622a = c0510s;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f1622a.f1632h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
