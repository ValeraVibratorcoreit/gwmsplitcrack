package p034Q0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: Q0.g */
/* loaded from: classes.dex */
public final class C0290g {

    /* renamed from: a */
    public CharSequence f805a;

    /* renamed from: b */
    public final TextPaint f806b;

    /* renamed from: c */
    public final int f807c;

    /* renamed from: d */
    public int f808d;

    /* renamed from: j */
    public boolean f814j;

    /* renamed from: e */
    public Layout.Alignment f809e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f810f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f811g = 1.0f;

    /* renamed from: h */
    public int f812h = 1;

    /* renamed from: i */
    public boolean f813i = true;

    /* renamed from: k */
    public TextUtils.TruncateAt f815k = null;

    public C0290g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f805a = charSequence;
        this.f806b = textPaint;
        this.f807c = i;
        this.f808d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m837a() {
        if (this.f805a == null) {
            this.f805a = "";
        }
        int max = Math.max(0, this.f807c);
        CharSequence charSequence = this.f805a;
        int i = this.f810f;
        TextPaint textPaint = this.f806b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f815k);
        }
        int min = Math.min(charSequence.length(), this.f808d);
        this.f808d = min;
        if (this.f814j && this.f810f == 1) {
            this.f809e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f809e);
        obtain.setIncludePad(this.f813i);
        obtain.setTextDirection(this.f814j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f815k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f810f);
        float f2 = this.f811g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f810f > 1) {
            obtain.setHyphenationFrequency(this.f812h);
        }
        return obtain.build();
    }
}
