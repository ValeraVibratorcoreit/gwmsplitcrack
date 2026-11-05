package p038T;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: T.u */
/* loaded from: classes.dex */
public final class C0327u implements TextWatcher, SpanWatcher {

    /* renamed from: f */
    public final Object f927f;

    /* renamed from: g */
    public final AtomicInteger f928g = new AtomicInteger(0);

    public C0327u(Object obj) {
        this.f927f = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f927f).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f927f).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f928g.get() <= 0 || !(obj instanceof C0330x)) {
            ((SpanWatcher) this.f927f).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.f928g.get() <= 0 || !(obj instanceof C0330x)) {
            ((SpanWatcher) this.f927f).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f928g.get() <= 0 || !(obj instanceof C0330x)) {
            ((SpanWatcher) this.f927f).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f927f).onTextChanged(charSequence, i, i2, i3);
    }
}
