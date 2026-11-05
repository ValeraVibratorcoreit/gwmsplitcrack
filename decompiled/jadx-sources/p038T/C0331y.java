package p038T;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: T.y */
/* loaded from: classes.dex */
public final class C0331y implements Spannable {

    /* renamed from: a */
    public boolean f940a = false;

    /* renamed from: b */
    public Spannable f941b;

    public C0331y(Spannable spannable) {
        this.f941b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f941b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f941b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f941b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f941b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f941b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f941b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f941b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f941b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f941b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f941b;
        if (!this.f940a && (spannable instanceof PrecomputedText)) {
            this.f941b = new SpannableString(spannable);
        }
        this.f940a = true;
        this.f941b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.f941b;
        if (!this.f940a && (spannable instanceof PrecomputedText)) {
            this.f941b = new SpannableString(spannable);
        }
        this.f940a = true;
        this.f941b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f941b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f941b.toString();
    }
}
