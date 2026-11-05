package p054a1;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: a1.m */
/* loaded from: classes.dex */
public final class C0504m {

    /* renamed from: a */
    public final /* synthetic */ C0506o f1586a;

    public C0504m(C0506o c0506o) {
        this.f1586a = c0506o;
    }

    /* renamed from: a */
    public final void m1221a(TextInputLayout textInputLayout) {
        C0506o c0506o = this.f1586a;
        if (c0506o.f1610x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0506o.f1610x;
        C0503l c0503l = c0506o.f1591A;
        if (editText != null) {
            editText.removeTextChangedListener(c0503l);
            if (c0506o.f1610x.getOnFocusChangeListener() == c0506o.m1223b().mo1203e()) {
                c0506o.f1610x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0506o.f1610x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0503l);
        }
        c0506o.m1223b().mo1206m(c0506o.f1610x);
        c0506o.m1231j(c0506o.m1223b());
    }
}
