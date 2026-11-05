package p109u0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.TextView;
import p082l.C1096Y;

/* renamed from: u0.c1 */
/* loaded from: classes.dex */
public final class C1527c1 extends C1096Y {

    /* renamed from: l */
    public float f8170l;

    /* renamed from: m */
    public int f8171m;

    /* renamed from: n */
    public boolean f8172n;

    public C1527c1(Context context) {
        super(context, null);
        this.f8171m = -16777216;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004b  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4165h(TextView textView, float f2, String str) {
        int i;
        C1527c1 c1527c1;
        float f3;
        int max;
        if (textView instanceof C1527c1) {
            if (str != null && !str.isEmpty()) {
                try {
                    String trim = str.trim();
                    if (trim.length() == 7 && trim.charAt(0) == '#') {
                        i = Color.parseColor("#FF" + trim.substring(1));
                    } else {
                        i = Color.parseColor(trim);
                    }
                } catch (Exception unused) {
                }
                c1527c1 = (C1527c1) textView;
                f3 = 20.0f;
                if (f2 >= 0.0f) {
                    f2 = 0.0f;
                } else if (f2 > 20.0f) {
                    f2 = 20.0f;
                }
                if (f2 >= 0.0f) {
                    f3 = 0.0f;
                } else if (f2 <= 20.0f) {
                    f3 = f2;
                }
                max = f3 <= 0.0f ? Math.max(1, Math.round(1.0f + f3)) : 0;
                if (c1527c1.f8170l != f3 && c1527c1.f8171m == i && c1527c1.getPaddingLeft() == max && c1527c1.getPaddingTop() == max && c1527c1.getPaddingRight() == max && c1527c1.getPaddingBottom() == max) {
                    return;
                }
                c1527c1.f8170l = f3;
                c1527c1.f8171m = i;
                if (f3 <= 0.0f) {
                    c1527c1.setLayerType(1, null);
                } else {
                    c1527c1.setLayerType(0, null);
                }
                c1527c1.setPadding(max, max, max, max);
                c1527c1.invalidate();
            }
            i = -16777216;
            c1527c1 = (C1527c1) textView;
            f3 = 20.0f;
            if (f2 >= 0.0f) {
            }
            if (f2 >= 0.0f) {
            }
            if (f3 <= 0.0f) {
            }
            if (c1527c1.f8170l != f3) {
            }
            c1527c1.f8170l = f3;
            c1527c1.f8171m = i;
            if (f3 <= 0.0f) {
            }
            c1527c1.setPadding(max, max, max, max);
            c1527c1.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f8172n) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Typeface typeface;
        if (this.f8170l <= 0.0f) {
            TextPaint paint = getPaint();
            if (Math.abs(paint.getTextSkewX()) <= 0.01f && ((typeface = paint.getTypeface()) == null || !typeface.isItalic())) {
                super.onDraw(canvas);
                return;
            }
        }
        TextPaint paint2 = getPaint();
        int currentTextColor = getCurrentTextColor();
        Paint.Style style = paint2.getStyle();
        float strokeWidth = paint2.getStrokeWidth();
        int color = paint2.getColor();
        Paint.Join strokeJoin = paint2.getStrokeJoin();
        this.f8172n = true;
        try {
            CharSequence text = getText();
            String charSequence = text == null ? "" : text.toString();
            getTotalPaddingLeft();
            float width = (getLayout() == null || getLayout().getLineCount() <= 0) ? 0.5f * (getWidth() - paint2.measureText(charSequence)) : getTotalPaddingLeft() + getLayout().getLineLeft(0);
            float baseline = getBaseline();
            if (baseline < 0.0f) {
                baseline = getPaddingTop() - paint2.ascent();
            }
            if (this.f8170l > 0.0f) {
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(this.f8170l * 2.0f);
                paint2.setStrokeJoin(Paint.Join.ROUND);
                paint2.setColor(this.f8171m);
                canvas.drawText(charSequence, width, baseline, paint2);
            }
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(currentTextColor);
            canvas.drawText(charSequence, width, baseline, paint2);
            paint2.setStyle(style);
            paint2.setStrokeWidth(strokeWidth);
            paint2.setColor(color);
            paint2.setStrokeJoin(strokeJoin);
            this.f8172n = false;
        } catch (Throwable th) {
            paint2.setStyle(style);
            paint2.setStrokeWidth(strokeWidth);
            paint2.setColor(color);
            paint2.setStrokeJoin(strokeJoin);
            this.f8172n = false;
            throw th;
        }
    }
}
