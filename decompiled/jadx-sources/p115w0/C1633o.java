package p115w0;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: w0.o */
/* loaded from: classes.dex */
public final class C1633o implements TextWatcher {

    /* renamed from: f */
    public final Runnable f9300f;

    public C1633o(Runnable runnable) {
        this.f9300f = runnable;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f9300f.run();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
