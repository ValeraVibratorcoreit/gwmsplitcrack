package p054a1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;

/* renamed from: a1.y */
/* loaded from: classes.dex */
public final class C0516y implements TextWatcher {

    /* renamed from: f */
    public int f1677f;

    /* renamed from: g */
    public final /* synthetic */ EditText f1678g;

    /* renamed from: h */
    public final /* synthetic */ TextInputLayout f1679h;

    public C0516y(TextInputLayout textInputLayout, EditText editText) {
        this.f1679h = textInputLayout;
        this.f1678g = editText;
        this.f1677f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1679h;
        textInputLayout.m2132u(!textInputLayout.f3657F0, false);
        if (textInputLayout.f3701p) {
            textInputLayout.m2125n(editable);
        }
        if (textInputLayout.f3717x) {
            textInputLayout.m2133v(editable);
        }
        EditText editText = this.f1678g;
        int lineCount = editText.getLineCount();
        int i = this.f1677f;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f3720y0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f1677f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
