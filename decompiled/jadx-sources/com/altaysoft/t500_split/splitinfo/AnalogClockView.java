package com.altaysoft.t500_split.splitinfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import java.util.Calendar;
import p001A0.RunnableC0020n;

/* loaded from: classes.dex */
public final class AnalogClockView extends View {

    /* renamed from: f */
    public final Paint f3111f;

    /* renamed from: g */
    public final Paint f3112g;

    /* renamed from: h */
    public final Paint f3113h;

    /* renamed from: i */
    public final Paint f3114i;

    /* renamed from: j */
    public final Paint f3115j;

    /* renamed from: k */
    public final Paint f3116k;

    /* renamed from: l */
    public final Paint f3117l;

    /* renamed from: m */
    public final Paint f3118m;

    /* renamed from: n */
    public final RectF f3119n;

    /* renamed from: o */
    public final Calendar f3120o;

    /* renamed from: p */
    public boolean f3121p;

    /* renamed from: q */
    public final RunnableC0020n f3122q;

    public AnalogClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f3111f = paint;
        Paint paint2 = new Paint(1);
        this.f3112g = paint2;
        Paint paint3 = new Paint(1);
        this.f3113h = paint3;
        Paint paint4 = new Paint(1);
        this.f3114i = paint4;
        Paint paint5 = new Paint(1);
        this.f3115j = paint5;
        Paint paint6 = new Paint(1);
        this.f3116k = paint6;
        Paint paint7 = new Paint(1);
        this.f3117l = paint7;
        Paint paint8 = new Paint(1);
        this.f3118m = paint8;
        this.f3119n = new RectF();
        this.f3120o = Calendar.getInstance();
        this.f3122q = new RunnableC0020n(25, this);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-15592166);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(m1952a(3.0f));
        paint2.setColor(-10854296);
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        paint3.setColor(-3091238);
        paint4.setColor(-1512208);
        paint4.setTextAlign(Paint.Align.CENTER);
        paint4.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint5.setStyle(style2);
        paint5.setStrokeCap(cap);
        paint5.setColor(-854793);
        paint5.setStrokeWidth(m1952a(7.0f));
        paint6.setStyle(style2);
        paint6.setStrokeCap(cap);
        paint6.setColor(-1643794);
        paint6.setStrokeWidth(m1952a(4.5f));
        paint7.setStyle(style2);
        paint7.setStrokeCap(cap);
        paint7.setColor(-6643544);
        paint7.setStrokeWidth(m1952a(2.0f));
        paint8.setStyle(style);
        paint8.setColor(-3617582);
    }

    /* renamed from: b */
    public static void m1950b(Canvas canvas, float f2, float f3, float f4, float f5, Paint paint) {
        double radians = Math.toRadians(f4 - 90.0d);
        canvas.drawLine(f2, f3, (((float) Math.cos(radians)) * f5) + f2, (((float) Math.sin(radians)) * f5) + f3, paint);
    }

    /* renamed from: c */
    public static int m1951c(int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0) {
            size = i3;
        }
        if (size2 <= 0) {
            size2 = i3;
        }
        int min = Math.min(Math.min(size, size2), i3);
        return min > 0 ? min : i3;
    }

    /* renamed from: a */
    public final int m1952a(float f2) {
        return Math.round(f2 * getResources().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            setRunning(true);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        setRunning(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(width, height) - m1952a(6.0f);
        canvas.drawCircle(width, height, min, this.f3111f);
        RectF rectF = this.f3119n;
        rectF.set(width - min, height - min, width + min, height + min);
        Paint paint = this.f3112g;
        canvas.drawOval(rectF, paint);
        paint.setStrokeWidth(m1952a(1.2f));
        paint.setColor(861560936);
        canvas.drawCircle(width, height, min - m1952a(14.0f), paint);
        float f2 = 3.0f;
        paint.setStrokeWidth(m1952a(3.0f));
        paint.setColor(-10854296);
        int i2 = 0;
        while (true) {
            if (i2 >= 60) {
                break;
            }
            double radians = Math.toRadians((i2 * 6.0d) - 90.0d);
            i = i2 % 5 != 0 ? 0 : 1;
            float m1952a = min - m1952a(10.0f);
            float m1952a2 = min - m1952a(i != 0 ? 28.0f : 18.0f);
            Paint paint2 = this.f3113h;
            paint2.setStrokeWidth(i != 0 ? m1952a(f2) : m1952a(1.4f));
            paint2.setColor(i != 0 ? -1512208 : 1724962010);
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            canvas.drawLine((cos * m1952a2) + width, (m1952a2 * sin) + height, (cos * m1952a) + width, (sin * m1952a) + height, paint2);
            i2++;
            f2 = 3.0f;
        }
        Paint paint3 = this.f3114i;
        paint3.setTextSize(0.12f * min);
        Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
        float m1952a3 = min - m1952a(48.0f);
        while (i <= 12) {
            double radians2 = Math.toRadians((i * 30.0d) - 90.0d);
            canvas.drawText(Integer.toString(i), (((float) Math.cos(radians2)) * m1952a3) + width, ((((float) Math.sin(radians2)) * m1952a3) + height) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint3);
            i++;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f3120o.setTimeInMillis(currentTimeMillis);
        m1950b(canvas, width, height, (((r3.get(13) / 3600.0f) + ((r3.get(12) / 60.0f) + r3.get(10))) / 12.0f) * 360.0f, min * 0.52f, this.f3115j);
        m1950b(canvas, width, height, (((r3.get(14) / 60000.0f) + ((r3.get(13) / 60.0f) + r3.get(12))) / 60.0f) * 360.0f, min * 0.72f, this.f3116k);
        float f3 = (((r3.get(14) / 1000.0f) + r3.get(13)) / 60.0f) * 360.0f;
        Paint paint4 = this.f3117l;
        m1950b(canvas, width, height, f3, min * 0.82f, paint4);
        double radians3 = Math.toRadians(f3 - 90.0d);
        canvas.drawLine(width, height, width - ((((float) Math.cos(radians3)) * min) * 0.18f), height - ((((float) Math.sin(radians3)) * min) * 0.18f), paint4);
        float m1952a4 = m1952a(7.0f);
        Paint paint5 = this.f3118m;
        canvas.drawCircle(width, height, m1952a4, paint5);
        paint5.setColor(-15065564);
        canvas.drawCircle(width, height, m1952a(3.5f), paint5);
        paint5.setColor(-3617582);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int m1951c = m1951c(i, i2, m1952a(540.0f));
        setMeasuredDimension(m1951c, m1951c);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        setRunning(i == 0 && isAttachedToWindow());
    }

    public void setRunning(boolean z2) {
        if (this.f3121p == z2) {
            return;
        }
        this.f3121p = z2;
        RunnableC0020n runnableC0020n = this.f3122q;
        removeCallbacks(runnableC0020n);
        if (this.f3121p) {
            post(runnableC0020n);
        }
    }
}
