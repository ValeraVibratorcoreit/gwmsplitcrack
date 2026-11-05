package p038T;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p040U.C0336a;
import p121y0.AbstractC1687o;

/* renamed from: T.x */
/* loaded from: classes.dex */
public final class C0330x extends ReplacementSpan {

    /* renamed from: b */
    public final C0329w f936b;

    /* renamed from: e */
    public TextPaint f939e;

    /* renamed from: a */
    public final Paint.FontMetricsInt f935a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public short f937c = -1;

    /* renamed from: d */
    public float f938d = 1.0f;

    public C0330x(C0329w c0329w) {
        AbstractC1687o.m4939h("rasterizer cannot be null", c0329w);
        this.f936b = c0329w;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f939e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f939e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, i3, f2 + this.f937c, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        C0315i.m895a().getClass();
        float f3 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        C0329w c0329w = this.f936b;
        C0326t c0326t = c0329w.f933b;
        Typeface typeface = (Typeface) c0326t.f926d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c0326t.f924b, c0329w.f932a * 2, 2, f2, f3, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f935a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0329w c0329w = this.f936b;
        this.f938d = abs / (c0329w.m928c().m415a(14) != 0 ? ((ByteBuffer) r8.f470d).getShort(r1 + r8.f467a) : (short) 0);
        C0336a m928c = c0329w.m928c();
        int m415a = m928c.m415a(14);
        if (m415a != 0) {
            ((ByteBuffer) m928c.f470d).getShort(m415a + m928c.f467a);
        }
        short s2 = (short) ((c0329w.m928c().m415a(12) != 0 ? ((ByteBuffer) r5.f470d).getShort(r7 + r5.f467a) : (short) 0) * this.f938d);
        this.f937c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
