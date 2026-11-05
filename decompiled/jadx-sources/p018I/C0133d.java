package p018I;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: I.d */
/* loaded from: classes.dex */
public final class C0133d {

    /* renamed from: a */
    public final TextPaint f411a;

    /* renamed from: b */
    public final TextDirectionHeuristic f412b;

    /* renamed from: c */
    public final int f413c;

    /* renamed from: d */
    public final int f414d;

    public C0133d(PrecomputedText.Params params) {
        this.f411a = params.getTextPaint();
        this.f412b = params.getTextDirection();
        this.f413c = params.getBreakStrategy();
        this.f414d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0133d)) {
            return false;
        }
        C0133d c0133d = (C0133d) obj;
        if (this.f413c == c0133d.f413c && this.f414d == c0133d.f414d) {
            TextPaint textPaint = this.f411a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c0133d.f411a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f412b == c0133d.f412b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f411a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f412b, Integer.valueOf(this.f413c), Integer.valueOf(this.f414d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f411a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f412b);
        sb.append(", breakStrategy=" + this.f413c);
        sb.append(", hyphenationFrequency=" + this.f414d);
        sb.append("}");
        return sb.toString();
    }
}
