package p042V;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p038T.C0315i;

/* renamed from: V.i */
/* loaded from: classes.dex */
public final class C0347i implements TextWatcher {

    /* renamed from: f */
    public final EditText f985f;

    /* renamed from: g */
    public C0346h f986g;

    /* renamed from: h */
    public boolean f987h = true;

    public C0347i(EditText editText) {
        this.f985f = editText;
    }

    /* renamed from: a */
    public static void m938a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0315i m895a = C0315i.m895a();
            if (editableText == null) {
                length = 0;
            } else {
                m895a.getClass();
                length = editableText.length();
            }
            m895a.m899e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f985f;
        if (editText.isInEditMode() || !this.f987h || C0315i.f889k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int m896b = C0315i.m895a().m896b();
        if (m896b != 0) {
            if (m896b == 1) {
                C0315i.m895a().m899e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (m896b != 3) {
                return;
            }
        }
        C0315i m895a = C0315i.m895a();
        if (this.f986g == null) {
            this.f986g = new C0346h(editText);
        }
        m895a.m900f(this.f986g);
    }
}
