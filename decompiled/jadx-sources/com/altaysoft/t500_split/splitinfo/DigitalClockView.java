package com.altaysoft.t500_split.splitinfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import p001A0.RunnableC0020n;

/* loaded from: classes.dex */
public final class DigitalClockView extends View {

    /* renamed from: D */
    public static final int[] f3142D = {63, 6, 91, 79, 102, 109, 125, 7, 127, 111};

    /* renamed from: A */
    public boolean f3143A;

    /* renamed from: B */
    public boolean f3144B;

    /* renamed from: C */
    public final RunnableC0020n f3145C;

    /* renamed from: f */
    public final Paint f3146f;

    /* renamed from: g */
    public final Paint f3147g;

    /* renamed from: h */
    public final Paint f3148h;

    /* renamed from: i */
    public final Paint f3149i;

    /* renamed from: j */
    public final Paint f3150j;

    /* renamed from: k */
    public final Paint f3151k;

    /* renamed from: l */
    public final Paint f3152l;

    /* renamed from: m */
    public final Paint f3153m;

    /* renamed from: n */
    public final Paint f3154n;

    /* renamed from: o */
    public final Paint f3155o;

    /* renamed from: p */
    public final RectF f3156p;

    /* renamed from: q */
    public final Path f3157q;

    /* renamed from: r */
    public final Calendar f3158r;

    /* renamed from: s */
    public int f3159s;

    /* renamed from: t */
    public int f3160t;

    /* renamed from: u */
    public int f3161u;

    /* renamed from: v */
    public int f3162v;

    /* renamed from: w */
    public int f3163w;

    /* renamed from: x */
    public int f3164x;

    /* renamed from: y */
    public int f3165y;

    /* renamed from: z */
    public long f3166z;

    public DigitalClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f3146f = paint;
        Paint paint2 = new Paint(1);
        this.f3147g = paint2;
        Paint paint3 = new Paint(1);
        this.f3148h = paint3;
        Paint paint4 = new Paint(1);
        this.f3149i = paint4;
        Paint paint5 = new Paint(1);
        this.f3150j = paint5;
        Paint paint6 = new Paint(1);
        this.f3151k = paint6;
        Paint paint7 = new Paint(1);
        this.f3152l = paint7;
        Paint paint8 = new Paint(1);
        this.f3153m = paint8;
        Paint paint9 = new Paint(1);
        this.f3154n = paint9;
        Paint paint10 = new Paint(1);
        this.f3155o = paint10;
        this.f3156p = new RectF();
        this.f3157q = new Path();
        this.f3158r = Calendar.getInstance();
        this.f3159s = 0;
        this.f3160t = -1;
        this.f3161u = -1;
        this.f3145C = new RunnableC0020n(27, this);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(m1957a(3.0f));
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint4.setTextAlign(align);
        paint4.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint5.setStyle(style);
        paint5.setColor(-3617582);
        paint6.setStyle(style);
        paint6.setColor(583584978);
        paint7.setStyle(style);
        paint8.setStyle(style2);
        paint8.setStrokeWidth(m1957a(1.5f));
        paint8.setColor(872415231);
        paint9.setStyle(style);
        paint9.setColor(-657414);
        paint10.setStyle(style);
    }

    /* renamed from: a */
    public final int m1957a(float f2) {
        return Math.round(f2 * getResources().getDisplayMetrics().density);
    }

    /* renamed from: b */
    public final void m1958b(Canvas canvas, float f2, float f3, float f4, float f5, String str, String str2, float f6) {
        float f7;
        Paint paint;
        float f8;
        String str3 = str2;
        float f9 = (f5 / 2.0f) + f3;
        float m1957a = m1957a(14.0f);
        Paint paint2 = this.f3152l;
        paint2.setColor(-14012096);
        RectF rectF = this.f3156p;
        float f10 = f2 + f4;
        float f11 = f3 + f5;
        rectF.set(f2, f3, f10, f11);
        canvas.drawRoundRect(rectF, m1957a, m1957a, paint2);
        paint2.setColor(-13353906);
        canvas.save();
        canvas.clipRect(f2, f3, f10, f9);
        canvas.drawRoundRect(rectF, m1957a, m1957a, paint2);
        canvas.restore();
        Paint paint3 = this.f3148h;
        paint3.setColor(-1512208);
        paint3.setTypeface(Typeface.create("sans-serif-medium", 1));
        paint3.setTextSize(0.58f * f5);
        Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
        float f12 = f9 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        float f13 = (f4 / 2.0f) + f2;
        Paint paint4 = this.f3153m;
        if (f6 >= 0.999f || str.equals(str2)) {
            canvas.drawText(str3, f13, f12, paint3);
            canvas.drawLine(m1957a(6.0f) + f2, f9, f10 - m1957a(6.0f), f9, paint4);
            return;
        }
        String str4 = f6 < 0.5f ? str : str3;
        canvas.save();
        canvas.clipRect(f2, f9, f10, f11);
        canvas.drawText(str4, f13, f12, paint3);
        canvas.restore();
        canvas.save();
        canvas.clipRect(f2, f3, f10, f9);
        canvas.drawText(str3, f13, f12, paint3);
        canvas.restore();
        if (f6 < 0.5f) {
            f7 = 1.0f - (f6 * 2.0f);
            str3 = str;
        } else {
            f7 = 2.0f * (f6 - 0.5f);
        }
        if (f7 > 0.03f) {
            canvas.save();
            canvas.clipRect(f2, f3, f10, f9);
            canvas.translate(0.0f, f9);
            canvas.scale(1.0f, f7);
            canvas.translate(0.0f, -f9);
            paint2.setColor(-12958888);
            rectF.set(f2, f3, f10, f9 + m1957a);
            canvas.drawRoundRect(rectF, m1957a, m1957a, paint2);
            canvas.clipRect(f2, f3, f10, f9);
            canvas.drawText(str3, f13, f12, paint3);
            Paint paint5 = this.f3155o;
            paint5.setColor(((int) ((1.0f - f7) * 140.0f)) << 24);
            paint = paint4;
            f8 = 6.0f;
            canvas.drawRect(f2, f3, f10, f9, paint5);
            canvas.restore();
        } else {
            paint = paint4;
            f8 = 6.0f;
        }
        canvas.drawLine(m1957a(f8) + f2, f9, f10 - m1957a(f8), f9, paint);
    }

    /* renamed from: c */
    public final void m1959c(Canvas canvas, float f2, float f3, float f4, float f5, boolean z2) {
        Paint paint = z2 ? this.f3150j : this.f3151k;
        float f6 = 0.45f * f5;
        float f7 = f5 / 2.0f;
        float f8 = f3 + f7;
        Path path = this.f3157q;
        path.reset();
        float f9 = f2 + f6;
        float f10 = f8 - f7;
        path.moveTo(f9, f10);
        float f11 = f4 + f2;
        float f12 = f11 - f6;
        path.lineTo(f12, f10);
        path.lineTo(f11, f8);
        float f13 = f7 + f8;
        path.lineTo(f12, f13);
        path.lineTo(f9, f13);
        path.lineTo(f2, f8);
        path.close();
        canvas.drawPath(path, paint);
    }

    /* renamed from: d */
    public final void m1960d(Canvas canvas, float f2, float f3, float f4, float f5, boolean z2) {
        Paint paint = z2 ? this.f3150j : this.f3151k;
        float f6 = 0.45f * f4;
        float f7 = f4 / 2.0f;
        float f8 = f2 + f7;
        Path path = this.f3157q;
        path.reset();
        path.moveTo(f8, f3);
        float f9 = f8 + f7;
        float f10 = f3 + f6;
        path.lineTo(f9, f10);
        float f11 = f3 + f5;
        float f12 = f11 - f6;
        path.lineTo(f9, f12);
        path.lineTo(f8, f11);
        float f13 = f8 - f7;
        path.lineTo(f13, f12);
        path.lineTo(f13, f10);
        path.close();
        canvas.drawPath(path, paint);
    }

    /* renamed from: e */
    public final void m1961e(float f2, float f3, float f4, float f5, int i, Canvas canvas) {
        int i2 = (i < 0 || i > 9) ? 0 : f3142D[i];
        float max = Math.max(m1957a(4.0f), 0.14f * f4);
        float f6 = max * 0.55f;
        float f7 = f2 + f6;
        float f8 = f4 - (f6 * 2.0f);
        m1959c(canvas, f7, f3, f8, max, (i2 & 1) != 0);
        float f9 = (f2 + f4) - max;
        float f10 = f3 + f6;
        float f11 = f5 / 2.0f;
        float f12 = f11 - f6;
        m1960d(canvas, f9, f10, max, f12, (i2 & 2) != 0);
        float f13 = f3 + f11;
        m1960d(canvas, f9, f13, max, f12, (i2 & 4) != 0);
        m1959c(canvas, f7, (f3 + f5) - max, f8, max, (i2 & 8) != 0);
        m1960d(canvas, f2, f13, max, f12, (i2 & 16) != 0);
        m1960d(canvas, f2, f10, max, f12, (i2 & 32) != 0);
        m1959c(canvas, f7, f13 - (max / 2.0f), f8, max, (i2 & 64) != 0);
    }

    /* renamed from: f */
    public final void m1962f() {
        RunnableC0020n runnableC0020n = this.f3145C;
        removeCallbacks(runnableC0020n);
        if (this.f3144B) {
            postDelayed(runnableC0020n, (this.f3159s == 2 && this.f3143A) ? 16L : Math.max(200L, 1000 - (System.currentTimeMillis() % 1000)));
        }
    }

    public int getStyle() {
        return this.f3159s;
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0275  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f2;
        String str;
        String str2;
        float f3;
        float f4;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = this.f3158r;
        calendar.setTimeInMillis(currentTimeMillis);
        boolean is24HourFormat = DateFormat.is24HourFormat(getContext());
        int i = is24HourFormat ? calendar.get(11) : calendar.get(10);
        int i2 = (is24HourFormat || i != 0) ? i : 12;
        int i3 = calendar.get(12);
        String str3 = is24HourFormat ? null : calendar.get(9) == 0 ? "AM" : "PM";
        int i4 = this.f3159s;
        Paint paint = this.f3149i;
        Paint paint2 = this.f3147g;
        Paint paint3 = this.f3146f;
        if (i4 == 1) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float min = Math.min(width, height) - m1957a(6.0f);
            paint3.setColor(-16118770);
            paint2.setColor(-12960188);
            float f5 = width - min;
            float f6 = height - min;
            float f7 = width + min;
            float f8 = height + min;
            canvas.drawRoundRect(f5, f6, f7, f8, m1957a(20.0f), m1957a(20.0f), paint3);
            canvas.drawRoundRect(f5, f6, f7, f8, m1957a(20.0f), m1957a(20.0f), paint2);
            float f9 = min * 0.55f;
            float f10 = f9 * 0.55f;
            float f11 = 0.22f * f10;
            float f12 = 0.35f * f10;
            float f13 = width - ((((f11 * 3.0f) + (f10 * 4.0f)) + f12) / 2.0f);
            float m1957a = (height - (f9 / 2.0f)) - (str3 != null ? m1957a(10.0f) : 0);
            int i5 = (is24HourFormat || i2 >= 10) ? i2 / 10 : -1;
            int i6 = i2 % 10;
            int i7 = i3 / 10;
            int i8 = i3 % 10;
            if (i5 >= 0) {
                f3 = width;
                f4 = 3.0f;
                m1961e(f13, m1957a, f10, f9, i5, canvas);
            } else {
                f3 = width;
                f4 = 3.0f;
                f13 -= f12;
            }
            float f14 = f10 + f11;
            float f15 = f13 + f14;
            m1961e(f15, m1957a, f10, f9, i6, canvas);
            float f16 = f15 + f14;
            float f17 = (f12 / 2.0f) + f16;
            float max = Math.max(m1957a(f4), 0.06f * f9);
            Paint paint4 = this.f3150j;
            canvas.drawCircle(f17, (0.32f * f9) + m1957a, max, paint4);
            canvas.drawCircle(f17, (0.68f * f9) + m1957a, max, paint4);
            float f18 = f12 + f11 + f16;
            m1961e(f18, m1957a, f10, f9, i7, canvas);
            m1961e(f18 + f14, m1957a, f10, f9, i8, canvas);
            if (str3 != null) {
                paint.setColor(-6643544);
                paint.setTextSize(min * 0.11f);
                canvas.drawText(str3, f3, ((m1957a + f9) + m1957a(8.0f)) - paint.getFontMetrics().ascent, paint);
                return;
            }
            return;
        }
        if (i4 != 2) {
            float width2 = getWidth() / 2.0f;
            float height2 = getHeight() / 2.0f;
            float min2 = Math.min(width2, height2) - m1957a(6.0f);
            paint3.setColor(-15592166);
            paint2.setColor(-10854296);
            float f19 = width2 - min2;
            float f20 = height2 - min2;
            float f21 = width2 + min2;
            float f22 = height2 + min2;
            canvas.drawRoundRect(f19, f20, f21, f22, m1957a(28.0f), m1957a(28.0f), paint3);
            canvas.drawRoundRect(f19, f20, f21, f22, m1957a(28.0f), m1957a(28.0f), paint2);
            String format = is24HourFormat ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i2), Integer.valueOf(i3));
            Paint paint5 = this.f3148h;
            paint5.setColor(-1512208);
            paint5.setTypeface(Typeface.create("sans-serif-thin", 0));
            paint5.setTextSize(min2 * (is24HourFormat ? 0.58f : 0.5f));
            Paint.FontMetrics fontMetrics = paint5.getFontMetrics();
            float m1957a2 = (height2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f)) - (str3 != null ? m1957a(16.0f) : 0);
            canvas.drawText(format, width2, m1957a2, paint5);
            if (str3 != null) {
                paint.setColor(-6643544);
                paint.setTextSize(0.13f * min2);
                canvas.drawText(str3, width2, (m1957a2 + m1957a(8.0f)) - paint.getFontMetrics().ascent, paint);
                return;
            }
            return;
        }
        float width3 = getWidth() / 2.0f;
        float height3 = getHeight() / 2.0f;
        float min3 = Math.min(width3, height3) - m1957a(6.0f);
        paint3.setColor(-15328734);
        paint2.setColor(-10854296);
        float f23 = width3 - min3;
        float f24 = height3 - min3;
        float f25 = width3 + min3;
        float f26 = height3 + min3;
        canvas.drawRoundRect(f23, f24, f25, f26, m1957a(28.0f), m1957a(28.0f), paint3);
        canvas.drawRoundRect(f23, f24, f25, f26, m1957a(28.0f), m1957a(28.0f), paint2);
        int i9 = this.f3160t;
        if (i9 < 0) {
            this.f3160t = i2;
            this.f3161u = i3;
            this.f3143A = false;
        } else {
            if (!this.f3143A && (i2 != i9 || i3 != this.f3161u)) {
                this.f3162v = i9;
                this.f3163w = this.f3161u;
                this.f3164x = i2;
                this.f3165y = i3;
                this.f3166z = SystemClock.uptimeMillis();
                this.f3143A = true;
                m1962f();
            }
            if (this.f3143A) {
                float uptimeMillis = (SystemClock.uptimeMillis() - this.f3166z) / 280.0f;
                if (uptimeMillis < 1.0f) {
                    f2 = (3.0f - (uptimeMillis * 2.0f)) * uptimeMillis * uptimeMillis;
                    Locale locale = Locale.US;
                    String format2 = String.format(locale, "%02d", Integer.valueOf(!this.f3143A ? this.f3162v : i2));
                    if (this.f3143A) {
                        i2 = this.f3164x;
                    }
                    String format3 = String.format(locale, "%02d", Integer.valueOf(i2));
                    String format4 = String.format(locale, "%02d", Integer.valueOf(!this.f3143A ? this.f3163w : i3));
                    if (this.f3143A) {
                        i3 = this.f3165y;
                    }
                    String format5 = String.format(locale, "%02d", Integer.valueOf(i3));
                    if (this.f3143A) {
                        str = format3;
                        str2 = format5;
                    } else {
                        str = format2;
                        str2 = format4;
                    }
                    float f27 = min3 * 0.78f;
                    float f28 = 0.58f * min3;
                    float max2 = Math.max(m1957a(40.0f), min3 * 0.22f);
                    float f29 = width3 - (((f28 * 2.0f) + max2) / 2.0f);
                    float m1957a3 = (height3 - (f27 / 2.0f)) - (str3 == null ? m1957a(14.0f) : 0);
                    float f30 = !str.equals(format3) ? 1.0f : f2;
                    float f31 = !str2.equals(format5) ? 1.0f : f2;
                    m1958b(canvas, f29, m1957a3, f28, f27, str, format3, f30);
                    float f32 = f29 + f28;
                    float f33 = (max2 / 2.0f) + f32;
                    float max3 = Math.max(m1957a(4.0f), 0.05f * f27);
                    Paint paint6 = this.f3154n;
                    paint6.setColor(-6643544);
                    canvas.drawCircle(f33, (0.35f * f27) + m1957a3, max3, paint6);
                    canvas.drawCircle(f33, (0.65f * f27) + m1957a3, max3, paint6);
                    m1958b(canvas, f32 + max2, m1957a3, f28, f27, str2, format5, f31);
                    if (str3 == null) {
                        paint.setColor(-6643544);
                        paint.setTextSize(min3 * 0.11f);
                        canvas.drawText(str3, width3, ((m1957a3 + f27) + m1957a(10.0f)) - paint.getFontMetrics().ascent, paint);
                        return;
                    }
                    return;
                }
                this.f3143A = false;
                this.f3160t = this.f3164x;
                this.f3161u = this.f3165y;
                m1962f();
            }
        }
        f2 = 1.0f;
        Locale locale2 = Locale.US;
        String format22 = String.format(locale2, "%02d", Integer.valueOf(!this.f3143A ? this.f3162v : i2));
        if (this.f3143A) {
        }
        String format32 = String.format(locale2, "%02d", Integer.valueOf(i2));
        String format42 = String.format(locale2, "%02d", Integer.valueOf(!this.f3143A ? this.f3163w : i3));
        if (this.f3143A) {
        }
        String format52 = String.format(locale2, "%02d", Integer.valueOf(i3));
        if (this.f3143A) {
        }
        float f272 = min3 * 0.78f;
        float f282 = 0.58f * min3;
        float max22 = Math.max(m1957a(40.0f), min3 * 0.22f);
        float f292 = width3 - (((f282 * 2.0f) + max22) / 2.0f);
        float m1957a32 = (height3 - (f272 / 2.0f)) - (str3 == null ? m1957a(14.0f) : 0);
        if (!str.equals(format32)) {
        }
        if (!str2.equals(format52)) {
        }
        m1958b(canvas, f292, m1957a32, f282, f272, str, format32, f30);
        float f322 = f292 + f282;
        float f332 = (max22 / 2.0f) + f322;
        float max32 = Math.max(m1957a(4.0f), 0.05f * f272);
        Paint paint62 = this.f3154n;
        paint62.setColor(-6643544);
        canvas.drawCircle(f332, (0.35f * f272) + m1957a32, max32, paint62);
        canvas.drawCircle(f332, (0.65f * f272) + m1957a32, max32, paint62);
        m1958b(canvas, f322 + max22, m1957a32, f282, f272, str2, format52, f31);
        if (str3 == null) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int m1951c = AnalogClockView.m1951c(i, i2, m1957a(540.0f));
        setMeasuredDimension(m1951c, m1951c);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        setRunning(i == 0 && isAttachedToWindow());
    }

    public void setRunning(boolean z2) {
        if (this.f3144B == z2) {
            return;
        }
        this.f3144B = z2;
        removeCallbacks(this.f3145C);
        if (this.f3144B) {
            m1962f();
        }
    }

    public void setStyle(int i) {
        int i2 = ((i % 3) + 3) % 3;
        if (this.f3159s == i2) {
            return;
        }
        this.f3159s = i2;
        this.f3160t = -1;
        this.f3161u = -1;
        this.f3143A = false;
        invalidate();
        if (this.f3144B) {
            m1962f();
        }
    }
}
