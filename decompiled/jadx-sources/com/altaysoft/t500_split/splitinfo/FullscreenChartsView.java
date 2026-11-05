package com.altaysoft.t500_split.splitinfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.altaysoft.t500_split.R;
import java.util.Locale;
import p006C.AbstractC0062j;
import p101r0.C1392n;
import p118x0.C1659o;

/* loaded from: classes.dex */
public final class FullscreenChartsView extends View {

    /* renamed from: E */
    public static final /* synthetic */ int f3167E = 0;

    /* renamed from: A */
    public float f3168A;

    /* renamed from: B */
    public float f3169B;

    /* renamed from: C */
    public float f3170C;

    /* renamed from: D */
    public float f3171D;

    /* renamed from: f */
    public final Paint f3172f;

    /* renamed from: g */
    public final Paint f3173g;

    /* renamed from: h */
    public final Paint f3174h;

    /* renamed from: i */
    public final Paint f3175i;

    /* renamed from: j */
    public final Paint f3176j;

    /* renamed from: k */
    public final Paint f3177k;

    /* renamed from: l */
    public final Paint f3178l;

    /* renamed from: m */
    public final Paint f3179m;

    /* renamed from: n */
    public final Paint f3180n;

    /* renamed from: o */
    public final Paint f3181o;

    /* renamed from: p */
    public final Paint f3182p;

    /* renamed from: q */
    public final Paint f3183q;

    /* renamed from: r */
    public final Path f3184r;

    /* renamed from: s */
    public final RectF f3185s;

    /* renamed from: t */
    public C1659o[] f3186t;

    /* renamed from: u */
    public long f3187u;

    /* renamed from: v */
    public int f3188v;

    /* renamed from: w */
    public boolean f3189w;

    /* renamed from: x */
    public boolean f3190x;

    /* renamed from: y */
    public boolean f3191y;

    /* renamed from: z */
    public float f3192z;

    public FullscreenChartsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f3172f = paint;
        Paint paint2 = new Paint(1);
        this.f3173g = paint2;
        Paint paint3 = new Paint(1);
        this.f3174h = paint3;
        Paint paint4 = new Paint(1);
        this.f3175i = paint4;
        Paint paint5 = new Paint(1);
        this.f3176j = paint5;
        Paint paint6 = new Paint(1);
        this.f3177k = paint6;
        Paint paint7 = new Paint(1);
        this.f3178l = paint7;
        Paint paint8 = new Paint(1);
        this.f3179m = paint8;
        Paint paint9 = new Paint(1);
        this.f3180n = paint9;
        Paint paint10 = new Paint(1);
        this.f3181o = paint10;
        Paint paint11 = new Paint(1);
        this.f3182p = paint11;
        Paint paint12 = new Paint(1);
        this.f3183q = paint12;
        this.f3184r = new Path();
        this.f3185s = new RectF();
        this.f3186t = new C1659o[0];
        this.f3187u = 600000L;
        this.f3188v = 1;
        this.f3189w = true;
        this.f3190x = true;
        this.f3191y = true;
        this.f3192z = Float.NaN;
        paint.setColor(872415231);
        paint.setStrokeWidth(1.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setColor(-1996488705);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(3.0f);
        paint3.setStyle(style);
        Paint.Join join = Paint.Join.ROUND;
        paint3.setStrokeJoin(join);
        paint4.setColor(-10565377);
        paint4.setStrokeWidth(3.0f);
        paint4.setStyle(style);
        paint4.setStrokeJoin(join);
        paint5.setColor(-12192);
        paint5.setStrokeWidth(3.0f);
        paint5.setStyle(style);
        paint5.setStrokeJoin(join);
        paint6.setColor(-13735099);
        Paint.Style style2 = Paint.Style.FILL;
        paint6.setStyle(style2);
        paint7.setColor(-1711276033);
        paint7.setTextSize(28.0f);
        paint8.setColor(-855638017);
        paint8.setTextSize(26.0f);
        paint9.setColor(-1518168);
        paint9.setStrokeWidth(2.5f);
        paint9.setStyle(style);
        paint10.setColor(-300278750);
        paint10.setStyle(style2);
        paint11.setTextSize(30.0f);
        paint11.setColor(-657665);
        paint12.setStyle(style2);
        setClickable(true);
    }

    /* renamed from: a */
    public static float m1963a(float f2) {
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    /* renamed from: d */
    public static float m1964d(long j2, long j3, long j4) {
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
    public final void m1965b(Canvas canvas, float f2, float f3, int i) {
        Paint paint = this.f3183q;
        paint.setColor(i);
        canvas.drawCircle(f2, f3, 8.0f, paint);
        Paint paint2 = this.f3180n;
        paint2.setColor(-1);
        canvas.drawCircle(f2, f3, 8.0f, paint2);
        paint2.setColor(-1518168);
    }

    /* renamed from: c */
    public final void m1966c(Canvas canvas, int i, long j2, long j3, float f2, float f3, C1392n c1392n, Paint paint, boolean z2) {
        Path path = this.f3184r;
        path.reset();
        float f4 = 0.0f;
        boolean z3 = false;
        int i2 = i;
        while (true) {
            C1659o[] c1659oArr = this.f3186t;
            if (i2 >= c1659oArr.length) {
                break;
            }
            C1659o c1659o = c1659oArr[i2];
            float m1964d = (m1964d(c1659o.f9461a, j2, j3) * f2) + this.f3168A;
            float m3329a = ((1.0f - c1392n.m3329a(c1659o)) * f3) + this.f3169B;
            if (!z3) {
                path.moveTo(m1964d, m3329a);
                z3 = true;
            } else if (z2) {
                path.lineTo(m1964d, f4);
                path.lineTo(m1964d, m3329a);
            } else {
                path.lineTo(m1964d, m3329a);
            }
            i2++;
            f4 = m3329a;
        }
        if (z3) {
            canvas.drawPath(path, paint);
        }
    }

    public int getChartMode() {
        return this.f3188v;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Paint paint;
        C1659o[] c1659oArr;
        int i;
        long j2;
        int i2;
        int i3;
        float f2;
        float f3;
        int i4;
        C1659o c1659o;
        int i5;
        int[] iArr;
        String[] strArr;
        Paint paint2;
        C1659o[] c1659oArr2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i6 = this.f3188v;
        float f4 = i6 == 1 ? 88.0f : 72.0f;
        float f5 = (i6 == 1 && this.f3190x) ? 88.0f : 28.0f;
        this.f3168A = f4;
        this.f3169B = 56.0f;
        float f6 = width - f5;
        this.f3170C = f6;
        float f7 = height - 56.0f;
        this.f3171D = f7;
        float f8 = f6 - f4;
        float f9 = f7 - 56.0f;
        if (f8 < 40.0f || f9 < 40.0f) {
            return;
        }
        Paint paint3 = this.f3173g;
        canvas.drawRect(f4, 56.0f, f6, f7, paint3);
        int i7 = 0;
        while (true) {
            paint = this.f3172f;
            if (i7 > 6) {
                break;
            }
            float f10 = ((i7 * f9) / 6) + this.f3169B;
            canvas.drawLine(this.f3168A, f10, this.f3170C, f10, (i7 == 0 || i7 == 6) ? paint3 : paint);
            i7++;
        }
        int i8 = 0;
        while (i8 <= 8) {
            float f11 = ((i8 * f8) / 8) + this.f3168A;
            canvas.drawLine(f11, this.f3169B, f11, this.f3171D, (i8 == 0 || i8 == 8) ? paint3 : paint);
            i8++;
        }
        float f12 = this.f3169B - 22.0f;
        int i9 = this.f3188v;
        Paint paint4 = this.f3179m;
        if (i9 == 2) {
            paint4.setTextAlign(Paint.Align.RIGHT);
            paint4.setColor(-855638017);
            canvas.drawText("л/100", this.f3168A - 10.0f, f12, paint4);
        } else {
            if (this.f3189w) {
                paint4.setTextAlign(Paint.Align.RIGHT);
                paint4.setColor(-1);
                canvas.drawText("км/ч", this.f3168A - 10.0f, f12, paint4);
            } else if (this.f3191y) {
                paint4.setTextAlign(Paint.Align.RIGHT);
                paint4.setColor(-12192);
                canvas.drawText("пер.", this.f3168A - 10.0f, f12, paint4);
            }
            if (this.f3190x) {
                paint4.setTextAlign(Paint.Align.LEFT);
                paint4.setColor(-10565377);
                canvas.drawText("×1000", this.f3170C + 10.0f, f12, paint4);
            }
        }
        paint4.setTextAlign(Paint.Align.RIGHT);
        int i10 = 0;
        while (i10 <= 6) {
            float f13 = i10;
            float f14 = 6;
            float f15 = 1.0f - (f13 / f14);
            float f16 = ((f13 * f9) / f14) + this.f3169B;
            float f17 = i10 == 0 ? f16 + 22.0f : i10 == 6 ? f16 - 4.0f : f16 + 9.0f;
            if (this.f3188v == 2) {
                paint4.setColor(-855638017);
                canvas.drawText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f15 * 30.0f)), this.f3168A - 10.0f, f17, paint4);
            } else if (this.f3189w) {
                paint4.setColor(-1);
                canvas.drawText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f15 * 180.0f)), this.f3168A - 10.0f, f17, paint4);
            } else if (this.f3191y) {
                paint4.setColor(-12192);
                canvas.drawText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f15 * 9.0f)), this.f3168A - 10.0f, f17, paint4);
            }
            i10++;
        }
        if (this.f3188v == 1 && this.f3190x) {
            paint4.setTextAlign(Paint.Align.LEFT);
            paint4.setColor(-10565377);
            int i11 = 0;
            while (i11 <= 6) {
                float f18 = i11;
                float f19 = 6;
                float f20 = 1.0f - (f18 / f19);
                float f21 = ((f18 * f9) / f19) + this.f3169B;
                canvas.drawText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f20 * 8.0f)), this.f3170C + 10.0f, i11 == 0 ? f21 + 22.0f : i11 == 6 ? f21 - 4.0f : f21 + 9.0f, paint4);
                i11++;
            }
        }
        paint4.setColor(-855638017);
        paint4.setTextAlign(Paint.Align.LEFT);
        paint4.setTextAlign(Paint.Align.CENTER);
        paint4.setColor(-855638017);
        long max = Math.max(1L, this.f3187u / 60000);
        int i12 = 0;
        while (i12 <= 8) {
            float f22 = i12 / 8;
            float f23 = (f8 * f22) + this.f3168A;
            float f24 = (1.0f - f22) * max;
            canvas.drawText(i12 == 8 ? getContext().getString(R.string.charts_fs_now) : f24 >= 1.0f ? String.format(Locale.ENGLISH, "-%.0f'", Float.valueOf(f24)) : "0'", f23, this.f3171D + 36.0f, paint4);
            i12++;
        }
        C1659o[] c1659oArr3 = this.f3186t;
        if (c1659oArr3.length < 2) {
            Paint paint5 = this.f3178l;
            paint5.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(getContext().getString(R.string.split_info_charts_no_data), (this.f3168A + this.f3170C) / 2.0f, (this.f3169B + this.f3171D) / 2.0f, paint5);
            paint5.setTextAlign(Paint.Align.LEFT);
            return;
        }
        long j3 = c1659oArr3[c1659oArr3.length - 1].f9461a;
        long j4 = j3 - this.f3187u;
        int i13 = 0;
        while (true) {
            c1659oArr = this.f3186t;
            if (i13 >= c1659oArr.length || c1659oArr[i13].f9461a >= j4) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= c1659oArr.length - 1) {
            i = 0;
            i13 = Math.max(0, c1659oArr.length - 2);
        } else {
            i = 0;
        }
        int i14 = i13;
        if (this.f3188v == 1) {
            if (this.f3189w) {
                j2 = j3;
                i2 = i14;
                i3 = i;
                f2 = 1.0f;
                f3 = f9;
                m1966c(canvas, i14, j4, j2, f8, f9, new C1392n(8), this.f3174h, false);
            } else {
                j2 = j3;
                i2 = i14;
                i3 = i;
                f2 = 1.0f;
                f3 = f9;
            }
            if (this.f3190x) {
                m1966c(canvas, i2, j4, j2, f8, f3, new C1392n(9), this.f3175i, false);
            }
            if (this.f3191y) {
                m1966c(canvas, i2, j4, j2, f8, f3, new C1392n(10), this.f3176j, true);
            }
        } else {
            j2 = j3;
            i2 = i14;
            i3 = i;
            f2 = 1.0f;
            f3 = f9;
            if (j2 > j4) {
                i4 = i2;
                if (i4 < this.f3186t.length) {
                    int i15 = i4;
                    while (true) {
                        C1659o[] c1659oArr4 = this.f3186t;
                        if (i15 >= c1659oArr4.length) {
                            break;
                        }
                        float m1964d = (m1964d(c1659oArr4[i15].f9461a, j4, j2) * f8) + this.f3168A;
                        int i16 = i15 + 1;
                        C1659o[] c1659oArr5 = this.f3186t;
                        float m1964d2 = i16 < c1659oArr5.length ? (m1964d(c1659oArr5[i16].f9461a, j4, j2) * f8) + this.f3168A : this.f3170C;
                        float f25 = m1964d + 2.0f;
                        if (m1964d2 < f25) {
                            m1964d2 = Math.min(this.f3170C, f25);
                        }
                        float f26 = f3;
                        float m149c = AbstractC0062j.m149c(1.0f, m1963a(Math.max(0.0f, this.f3186t[i15].f9465e) / 30.0f), f26, this.f3169B);
                        float min = Math.min(m1964d2 - 1.0f, this.f3170C);
                        if (min > m1964d) {
                            canvas.drawRect(m1964d, m149c, min, this.f3171D, this.f3177k);
                        }
                        i15 = i16;
                        f3 = f26;
                    }
                }
                float f27 = f3;
                if (Float.isNaN(this.f3192z)) {
                    float f28 = (f8 * this.f3192z) + this.f3168A;
                    float f29 = this.f3169B;
                    float f30 = this.f3171D;
                    Paint paint6 = this.f3180n;
                    canvas.drawLine(f28, f29, f28, f30, paint6);
                    float f31 = this.f3192z;
                    if (this.f3186t.length == 0 || j2 <= j4) {
                        c1659o = null;
                    } else {
                        long j5 = j4 + ((long) (f31 * (j2 - j4)));
                        long j6 = Long.MAX_VALUE;
                        int i17 = i4;
                        while (true) {
                            c1659oArr2 = this.f3186t;
                            if (i4 >= c1659oArr2.length) {
                                break;
                            }
                            long abs = Math.abs(c1659oArr2[i4].f9461a - j5);
                            if (abs < j6) {
                                j6 = abs;
                                i17 = i4;
                            }
                            i4++;
                        }
                        c1659o = c1659oArr2[i17];
                    }
                    if (c1659o == null) {
                        return;
                    }
                    int i18 = this.f3188v;
                    float f32 = c1659o.f9465e;
                    int i19 = c1659o.f9464d;
                    float f33 = c1659o.f9463c;
                    float f34 = c1659o.f9462b;
                    if (i18 == 1) {
                        if (this.f3189w) {
                            m1965b(canvas, f28, ((f2 - m1963a(f34 / 180.0f)) * f27) + this.f3169B, -1);
                        }
                        if (this.f3190x) {
                            m1965b(canvas, f28, ((f2 - m1963a(f33 / 8000.0f)) * f27) + this.f3169B, -10565377);
                        }
                        if (this.f3191y) {
                            i5 = -12192;
                            m1965b(canvas, f28, ((f2 - m1963a(i19 / 9.0f)) * f27) + this.f3169B, -12192);
                        } else {
                            i5 = -12192;
                        }
                    } else {
                        i5 = -12192;
                        m1965b(canvas, f28, ((f2 - m1963a(f32 / 30.0f)) * f27) + this.f3169B, -13735099);
                    }
                    long max2 = Math.max(0L, j2 - c1659o.f9461a) / 1000;
                    long j7 = max2 / 60;
                    long j8 = max2 % 60;
                    String format = j7 > 0 ? String.format(Locale.ENGLISH, "-%d:%02d", Long.valueOf(j7), Long.valueOf(j8)) : String.format(Locale.ENGLISH, "-0:%02d", Long.valueOf(j8));
                    int i20 = 2;
                    if (this.f3188v == 2) {
                        strArr = new String[2];
                        strArr[i3] = format;
                        strArr[1] = String.format(Locale.ENGLISH, "л/100  %.1f", Float.valueOf(f32));
                        iArr = new int[2];
                        iArr[i3] = -657665;
                        iArr[1] = -13735099;
                    } else {
                        boolean z2 = this.f3189w;
                        int i21 = z2 ? 2 : 1;
                        if (this.f3190x) {
                            i21++;
                        }
                        if (this.f3191y) {
                            i21++;
                        }
                        String[] strArr2 = new String[i21];
                        iArr = new int[i21];
                        strArr2[i3] = format;
                        iArr[i3] = -657665;
                        if (z2) {
                            strArr2[1] = String.format(Locale.ENGLISH, "км/ч  %.0f", Float.valueOf(f34));
                            iArr[1] = -1;
                        } else {
                            i20 = 1;
                        }
                        if (this.f3190x) {
                            strArr2[i20] = String.format(Locale.ENGLISH, "об/мин  %.0f", Float.valueOf(f33));
                            iArr[i20] = -10565377;
                            i20++;
                        }
                        if (this.f3191y) {
                            Locale locale = Locale.ENGLISH;
                            strArr2[i20] = AbstractC0062j.m156j(i19, "пер.  ");
                            iArr[i20] = i5;
                        }
                        strArr = strArr2;
                    }
                    int length = strArr.length;
                    int i22 = i3;
                    float f35 = 0.0f;
                    while (true) {
                        paint2 = this.f3182p;
                        if (i22 >= length) {
                            break;
                        }
                        f35 = Math.max(f35, paint2.measureText(strArr[i22]));
                        i22++;
                    }
                    float f36 = f35 + 28.0f;
                    float length2 = (strArr.length * 36.0f) + 14.0f;
                    float f37 = f28 + 18.0f;
                    if (f37 + f36 > this.f3170C - 4.0f) {
                        f37 = (f28 - 18.0f) - f36;
                    }
                    float f38 = this.f3168A + 4.0f;
                    if (f37 < f38) {
                        f37 = f38;
                    }
                    float f39 = this.f3169B + 12.0f;
                    RectF rectF = this.f3185s;
                    rectF.set(f37, f39, f36 + f37, length2 + f39);
                    canvas.drawRoundRect(rectF, 12.0f, 12.0f, this.f3181o);
                    paint6.setColor(1726535080);
                    canvas.drawRoundRect(rectF, 12.0f, 12.0f, paint6);
                    paint6.setColor(-1518168);
                    float f40 = f39 + 14.0f + 26.0f;
                    for (int i23 = i3; i23 < strArr.length; i23++) {
                        paint2.setColor(iArr[i23]);
                        canvas.drawText(strArr[i23], f37 + 14.0f, f40, paint2);
                        f40 += 36.0f;
                    }
                    return;
                }
                return;
            }
        }
        i4 = i2;
        float f272 = f3;
        if (Float.isNaN(this.f3192z)) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 2) {
            float x2 = motionEvent.getX();
            float f2 = this.f3170C;
            float f3 = this.f3168A;
            float f4 = f2 - f3;
            if (f4 > 1.0f && x2 >= f3 - 20.0f && x2 <= f2 + 20.0f && motionEvent.getY() >= this.f3169B - 20.0f && motionEvent.getY() <= this.f3171D + 40.0f) {
                float f5 = (x2 - this.f3168A) / f4;
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                this.f3192z = f5 <= 1.0f ? f5 : 1.0f;
                invalidate();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChartMode(int i) {
        int i2 = i != 2 ? 1 : 2;
        if (this.f3188v == i2) {
            return;
        }
        this.f3188v = i2;
        invalidate();
    }

    public void setSamples(C1659o[] c1659oArr) {
        if (c1659oArr == null) {
            c1659oArr = new C1659o[0];
        }
        this.f3186t = c1659oArr;
        invalidate();
    }

    public void setShowGear(boolean z2) {
        if (this.f3191y == z2) {
            return;
        }
        this.f3191y = z2;
        invalidate();
    }

    public void setShowRpm(boolean z2) {
        if (this.f3190x == z2) {
            return;
        }
        this.f3190x = z2;
        invalidate();
    }

    public void setShowSpd(boolean z2) {
        if (this.f3189w == z2) {
            return;
        }
        this.f3189w = z2;
        invalidate();
    }

    public void setWindowMinutes(int i) {
        if (i != 5 && i != 10 && i != 30 && i != 60) {
            i = 10;
        }
        long j2 = i * 60000;
        if (j2 == this.f3187u) {
            return;
        }
        this.f3187u = j2;
        invalidate();
    }
}
