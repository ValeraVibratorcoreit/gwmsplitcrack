package p054a1;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p022K.C0180b;
import p024L.C0240j;
import p082l.C1096Y;

/* renamed from: a1.z */
/* loaded from: classes.dex */
public final class C0517z extends C0180b {

    /* renamed from: d */
    public final TextInputLayout f1680d;

    public C0517z(TextInputLayout textInputLayout) {
        this.f1680d = textInputLayout;
    }

    @Override // p022K.C0180b
    /* renamed from: d */
    public final void mo400d(View view, C0240j c0240j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f491a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1680d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f3722z0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        C0515x c0515x = textInputLayout.f3683g;
        C1096Y c1096y = c0515x.f1668g;
        if (c1096y.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c1096y);
            accessibilityNodeInfo.setTraversalAfter(c1096y);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c0515x.f1670i);
        }
        if (!isEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (!z2 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C1096Y c1096y2 = textInputLayout.f3699o.f1649y;
        if (c1096y2 != null) {
            accessibilityNodeInfo.setLabelFor(c1096y2);
        }
        textInputLayout.f3685h.m1223b().mo1217n(c0240j);
    }

    @Override // p022K.C0180b
    /* renamed from: e */
    public final void mo529e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo529e(view, accessibilityEvent);
        this.f1680d.f3685h.m1223b().mo1218o(accessibilityEvent);
    }
}
