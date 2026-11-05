package com.altaysoft.t500_split.splitinfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.altaysoft.t500_split.R;
import java.util.Locale;
import p101r0.C1392n;
import p118x0.C1659o;

/* loaded from: classes.dex */
public final class SplitChartsView extends View {

    /* renamed from: t */
    public static final /* synthetic */ int f3235t = 0;

    /* renamed from: f */
    public final Paint f3236f;

    /* renamed from: g */
    public final Paint f3237g;

    /* renamed from: h */
    public final Paint f3238h;

    /* renamed from: i */
    public final Paint f3239i;

    /* renamed from: j */
    public final Paint f3240j;

    /* renamed from: k */
    public final Paint f3241k;

    /* renamed from: l */
    public final Paint f3242l;

    /* renamed from: m */
    public final Paint f3243m;

    /* renamed from: n */
    public final Path f3244n;

    /* renamed from: o */
    public C1659o[] f3245o;

    /* renamed from: p */
    public long f3246p;

    /* renamed from: q */
    public boolean f3247q;

    /* renamed from: r */
    public boolean f3248r;

    /* renamed from: s */
    public boolean f3249s;

    public SplitChartsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f3236f = paint;
        Paint paint2 = new Paint(1);
        this.f3237g = paint2;
        Paint paint3 = new Paint(1);
        this.f3238h = paint3;
        Paint paint4 = new Paint(1);
        this.f3239i = paint4;
        Paint paint5 = new Paint(1);
        this.f3240j = paint5;
        Paint paint6 = new Paint(1);
        this.f3241k = paint6;
        Paint paint7 = new Paint(1);
        this.f3242l = paint7;
        Paint paint8 = new Paint(1);
        this.f3243m = paint8;
        this.f3244n = new Path();
        this.f3245o = new C1659o[0];
        this.f3246p = 600000L;
        this.f3247q = true;
        this.f3248r = true;
        this.f3249s = true;
        paint.setColor(872415231);
        paint.setStrokeWidth(1.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setColor(1728053247);
        paint2.setStrokeWidth(1.5f);
        paint2.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(2.5f);
        paint3.setStyle(style);
        Paint.Join join = Paint.Join.ROUND;
        paint3.setStrokeJoin(join);
        paint4.setColor(-10565377);
        paint4.setStrokeWidth(2.5f);
        paint4.setStyle(style);
        paint4.setStrokeJoin(join);
        paint5.setColor(-12192);
        paint5.setStrokeWidth(2.5f);
        paint5.setStyle(style);
        paint5.setStrokeJoin(join);
        paint6.setColor(-13735099);
        paint6.setStyle(Paint.Style.FILL);
        paint7.setColor(-1711276033);
        paint7.setTextSize(22.0f);
        paint8.setTextSize(20.0f);
    }

    /* renamed from: a */
    public static float m1975a(float f2) {
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    /* renamed from: d */
    public static float m1976d(long j2, long j3, long j4) {
        if (j4 <= j3) {
            return 1.0f;
        }
        float f2 = (j2 - j3) / (j4 - j3);
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    /* renamed from: b */
    public final void m1977b(Canvas canvas, float f2, float f3, float f4, boolean z2) {
        Paint paint;
        C1659o[] c1659oArr;
        int i;
        String str;
        float f5;
        int i2;
        float f6;
        String str2;
        String str3;
        int i3;
        long j2;
        Paint paint2;
        float f7 = f3 - 8.0f;
        float f8 = f4 - f2;
        if (f7 < 10.0f || f8 < 10.0f) {
            return;
        }
        canvas.drawRect(8.0f, f2, f3, f4, this.f3237g);
        int i4 = 1;
        while (true) {
            paint = this.f3236f;
            if (i4 >= 4) {
                break;
            }
            float f9 = ((i4 * f8) / 4.0f) + f2;
            canvas.drawLine(8.0f, f9, f3, f9, paint);
            i4++;
        }
        for (int i5 = 1; i5 < 5; i5++) {
            float f10 = ((i5 * f7) / 5.0f) + 8.0f;
            canvas.drawLine(f10, f2, f10, f4, paint);
        }
        C1659o[] c1659oArr2 = this.f3245o;
        int length = c1659oArr2.length;
        Paint paint3 = this.f3242l;
        if (length < 2) {
            paint3.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(getContext().getString(R.string.split_info_charts_no_data), (8.0f + f3) / 2.0f, (f2 + f4) / 2.0f, paint3);
            paint3.setTextAlign(Paint.Align.LEFT);
            return;
        }
        long j3 = c1659oArr2[c1659oArr2.length - 1].f9461a;
        long j4 = j3 - this.f3246p;
        int i6 = 0;
        while (true) {
            c1659oArr = this.f3245o;
            if (i6 >= c1659oArr.length || c1659oArr[i6].f9461a >= j4) {
                break;
            } else {
                i6++;
            }
        }
        int max = i6 >= c1659oArr.length - 1 ? Math.max(0, c1659oArr.length - 2) : i6;
        if (!z2) {
            int i7 = max;
            String str4 = "0";
            if (j3 > j4 && (i = i7) < this.f3245o.length) {
                float f11 = 8.0f + f7;
                while (true) {
                    C1659o[] c1659oArr3 = this.f3245o;
                    if (i >= c1659oArr3.length) {
                        break;
                    }
                    float m1976d = (m1976d(c1659oArr3[i].f9461a, j4, j3) * f7) + 8.0f;
                    int i8 = i + 1;
                    C1659o[] c1659oArr4 = this.f3245o;
                    if (i8 < c1659oArr4.length) {
                        str = str4;
                        f5 = (m1976d(c1659oArr4[i8].f9461a, j4, j3) * f7) + 8.0f;
                    } else {
                        str = str4;
                        f5 = f11;
                    }
                    float f12 = m1976d + 2.0f;
                    if (f5 < f12) {
                        f5 = Math.min(f11, f12);
                    }
                    float m1975a = ((1.0f - m1975a(Math.max(0.0f, this.f3245o[i].f9465e) / 30.0f)) * f8) + f2;
                    float min = Math.min(f5 - 1.0f, f11);
                    if (min <= m1976d) {
                        i2 = i8;
                        f6 = f11;
                    } else {
                        i2 = i8;
                        f6 = f11;
                        canvas.drawRect(m1976d, m1975a, min, f2 + f8, this.f3241k);
                    }
                    i = i2;
                    f11 = f6;
                    str4 = str;
                }
            }
            paint3.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(str4, 12.0f, f4 - 4.0f, paint3);
            canvas.drawText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(30.0f)), 12.0f, f2 + 18.0f, paint3);
            return;
        }
        if (this.f3247q) {
            str2 = "%.0f";
            str3 = "0";
            i3 = max;
            j2 = j3;
            paint2 = paint3;
            m1978c(canvas, f2, f7, f8, max, j4, j3, new C1392n(11), this.f3238h, false);
        } else {
            str2 = "%.0f";
            str3 = "0";
            i3 = max;
            j2 = j3;
            paint2 = paint3;
        }
        if (this.f3248r) {
            m1978c(canvas, f2, f7, f8, i3, j4, j2, new C1392n(12), this.f3239i, false);
        }
        if (this.f3249s) {
            m1978c(canvas, f2, f7, f8, i3, j4, j2, new C1392n(13), this.f3240j, true);
        }
        paint2.setTextAlign(Paint.Align.LEFT);
        Paint paint4 = paint2;
        float f13 = 12.0f;
        canvas.drawText(str3, 12.0f, f4 - 4.0f, paint4);
        float f14 = f2 + 18.0f;
        Locale locale = Locale.ENGLISH;
        String str5 = str2;
        String format = String.format(locale, str5, Float.valueOf(180.0f));
        String format2 = String.format(locale, str5, Float.valueOf(8.0f));
        String format3 = String.format(locale, str5, Float.valueOf(9.0f));
        if (this.f3247q) {
            paint4.setColor(-1);
            canvas.drawText(format, 12.0f, f14, paint4);
            f13 = paint4.measureText(format) + 14.0f + 12.0f;
        }
        if (this.f3248r) {
            paint4.setColor(-10565377);
            canvas.drawText(format2, f13, f14, paint4);
            f13 += paint4.measureText(format2) + 14.0f;
        }
        if (this.f3249s) {
            paint4.setColor(-12192);
            canvas.drawText(format3, f13, f14, paint4);
        }
        paint4.setColor(-1711276033);
    }

    /* renamed from: c */
    public final void m1978c(Canvas canvas, float f2, float f3, float f4, int i, long j2, long j3, C1392n c1392n, Paint paint, boolean z2) {
        Path path = this.f3244n;
        path.reset();
        float f5 = 0.0f;
        boolean z3 = false;
        int i2 = i;
        while (true) {
            C1659o[] c1659oArr = this.f3245o;
            if (i2 >= c1659oArr.length) {
                break;
            }
            C1659o c1659o = c1659oArr[i2];
            float m1976d = (m1976d(c1659o.f9461a, j2, j3) * f3) + 8.0f;
            float m3329a = ((1.0f - c1392n.m3329a(c1659o)) * f4) + f2;
            if (!z3) {
                path.moveTo(m1976d, m3329a);
                z3 = true;
            } else if (z2) {
                path.lineTo(m1976d, f5);
                path.lineTo(m1976d, m3329a);
            } else {
                path.lineTo(m1976d, m3329a);
            }
            i2++;
            f5 = m3329a;
        }
        if (z3) {
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        float f2 = ((height - 8.0f) - 16.0f) - 24.0f;
        float f3 = 0.58f * f2;
        float f4 = f2 - f3;
        float f5 = f3 + 8.0f;
        float f6 = 16.0f + f5 + 24.0f;
        float f7 = width - 8.0f;
        m1977b(canvas, 8.0f, f7, f5, true);
        String[] strArr = {getContext().getString(R.string.split_info_charts_fuel_inst)};
        Paint paint = this.f3243m;
        paint.setColor(new int[]{-13735099}[0]);
        canvas.drawText("● " + strArr[0], 8.0f, (f6 - 24.0f) + 18.0f, paint);
        paint.measureText("● " + strArr[0]);
        m1977b(canvas, f6, f7, f6 + f4, false);
    }

    public void setSamples(C1659o[] c1659oArr) {
        if (c1659oArr == null) {
            c1659oArr = new C1659o[0];
        }
        this.f3245o = c1659oArr;
        invalidate();
    }

    public void setShowGear(boolean z2) {
        if (this.f3249s == z2) {
            return;
        }
        this.f3249s = z2;
        invalidate();
    }

    public void setShowRpm(boolean z2) {
        if (this.f3248r == z2) {
            return;
        }
        this.f3248r = z2;
        invalidate();
    }

    public void setShowSpd(boolean z2) {
        if (this.f3247q == z2) {
            return;
        }
        this.f3247q = z2;
        invalidate();
    }

    public void setWindowMinutes(int i) {
        if (i != 5 && i != 10 && i != 30 && i != 60) {
            i = 10;
        }
        long j2 = i * 60000;
        if (j2 == this.f3246p) {
            return;
        }
        this.f3246p = j2;
        invalidate();
    }
}
