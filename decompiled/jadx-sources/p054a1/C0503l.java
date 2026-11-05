package p054a1;

import android.text.Editable;
import p034Q0.AbstractC0293j;

/* renamed from: a1.l */
/* loaded from: classes.dex */
public final class C0503l extends AbstractC0293j {

    /* renamed from: f */
    public final /* synthetic */ C0506o f1585f;

    public C0503l(C0506o c0506o) {
        this.f1585f = c0506o;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1585f.m1223b().mo1200a();
    }

    @Override // p034Q0.AbstractC0293j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1585f.m1223b().mo1236b();
    }
}
