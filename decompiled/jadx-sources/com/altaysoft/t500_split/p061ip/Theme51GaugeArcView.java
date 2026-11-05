package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import p001A0.RunnableC0020n;
import p006C.AbstractC0062j;

/* loaded from: classes.dex */
public final class Theme51GaugeArcView extends View {

    /* renamed from: A */
    public int f2919A;

    /* renamed from: B */
    public boolean f2920B;

    /* renamed from: C */
    public float f2921C;

    /* renamed from: D */
    public float f2922D;

    /* renamed from: E */
    public final float f2923E;

    /* renamed from: F */
    public final float f2924F;

    /* renamed from: G */
    public int f2925G;

    /* renamed from: H */
    public boolean f2926H;

    /* renamed from: I */
    public float[] f2927I;

    /* renamed from: J */
    public float f2928J;

    /* renamed from: K */
    public float f2929K;

    /* renamed from: L */
    public float f2930L;

    /* renamed from: M */
    public float f2931M;

    /* renamed from: N */
    public float f2932N;

    /* renamed from: O */
    public float f2933O;

    /* renamed from: P */
    public float f2934P;

    /* renamed from: Q */
    public float f2935Q;

    /* renamed from: R */
    public float f2936R;

    /* renamed from: S */
    public Bitmap[] f2937S;

    /* renamed from: T */
    public float f2938T;

    /* renamed from: U */
    public final RunnableC0020n f2939U;

    /* renamed from: f */
    public final Paint f2940f;

    /* renamed from: g */
    public final Paint f2941g;

    /* renamed from: h */
    public final Paint f2942h;

    /* renamed from: i */
    public final Paint f2943i;

    /* renamed from: j */
    public final Paint f2944j;

    /* renamed from: k */
    public final Paint f2945k;

    /* renamed from: l */
    public final RectF f2946l;

    /* renamed from: m */
    public final Matrix f2947m;

    /* renamed from: n */
    public final int[] f2948n;

    /* renamed from: o */
    public final float[] f2949o;

    /* renamed from: p */
    public float f2950p;

    /* renamed from: q */
    public float f2951q;

    /* renamed from: r */
    public float f2952r;

    /* renamed from: s */
    public float f2953s;

    /* renamed from: t */
    public float f2954t;

    /* renamed from: u */
    public float f2955u;

    /* renamed from: v */
    public float f2956v;

    /* renamed from: w */
    public float f2957w;

    /* renamed from: x */
    public float f2958x;

    /* renamed from: y */
    public boolean f2959y;

    /* renamed from: z */
    public int f2960z;

    public Theme51GaugeArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f2940f = paint;
        Paint paint2 = new Paint(1);
        this.f2941g = paint2;
        Paint paint3 = new Paint(1);
        this.f2942h = paint3;
        Paint paint4 = new Paint(1);
        this.f2943i = paint4;
        Paint paint5 = new Paint(1);
        this.f2944j = paint5;
        Paint paint6 = new Paint(3);
        this.f2945k = paint6;
        this.f2946l = new RectF();
        this.f2947m = new Matrix();
        this.f2948n = new int[3];
        this.f2949o = new float[3];
        this.f2950p = 0.88f;
        this.f2952r = 20.0f;
        this.f2954t = 1.0f;
        this.f2955u = -135.0f;
        this.f2956v = 135.0f;
        this.f2960z = 864870568;
        this.f2919A = -1718820696;
        this.f2923E = 0.2f;
        this.f2924F = 0.12f;
        this.f2928J = 1.0f;
        this.f2929K = Float.POSITIVE_INFINITY;
        this.f2930L = 0.55f;
        this.f2931M = 0.72f;
        this.f2933O = 42.0f;
        this.f2934P = 28.0f;
        this.f2935Q = 16.0f;
        this.f2936R = 2.5f;
        this.f2939U = new RunnableC0020n(24, this);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.BUTT;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint4.setStyle(Paint.Style.FILL);
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        paint4.setFakeBoldText(true);
        paint4.setHinting(0);
        paint4.setLinearText(true);
        paint4.setSubpixelText(false);
        paint5.setStyle(style);
        paint5.setTextAlign(align);
        paint5.setFakeBoldText(true);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        paint5.setHinting(0);
        paint5.setLinearText(true);
        paint5.setSubpixelText(false);
        paint6.setFilterBitmap(true);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public static float m1830a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    /* renamed from: e */
    public static int m1831e(float f2, int i, int i2) {
        float m1830a = m1830a(f2, 0.0f, 1.0f);
        return Color.argb(AbstractC0062j.m150d(Color.alpha(i2) - Color.alpha(i), m1830a, Color.alpha(i)), AbstractC0062j.m150d(Color.red(i2) - Color.red(i), m1830a, Color.red(i)), AbstractC0062j.m150d(Color.green(i2) - Color.green(i), m1830a, Color.green(i)), AbstractC0062j.m150d(Color.blue(i2) - Color.blue(i), m1830a, Color.blue(i)));
    }

    /* renamed from: b */
    public final void m1832b(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f2953s = f2;
        this.f2954t = Math.max(f3, f2 + 1.0E-4f);
        this.f2955u = f4;
        this.f2956v = f5;
        this.f2950p = Math.max(0.05f, Math.min(0.98f, f6));
        this.f2952r = Math.max(1.0f, f7);
        this.f2951q = f8;
        invalidate();
    }

    /* renamed from: c */
    public final void m1833c(Canvas canvas, float f2, float f3, float f4, float f5, float f6) {
        if (f5 <= 0.5f + f4) {
            return;
        }
        float m1830a = m1830a(f6, this.f2953s, this.f2954t);
        float f7 = this.f2953s;
        float f8 = (m1830a - f7) / (this.f2954t - f7);
        float f9 = this.f2955u;
        double radians = Math.toRadians(AbstractC0062j.m149c(this.f2956v, f9, f8, f9));
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        boolean z2 = f6 <= this.f2957w + 0.001f;
        Paint paint = this.f2942h;
        paint.setColor(z2 ? -871626234 : -1427052848);
        canvas.drawLine((f4 * sin) + f2, f3 - (f4 * cos), (sin * f5) + f2, f3 - (f5 * cos), paint);
    }

    /* renamed from: d */
    public final boolean m1834d(float f2) {
        float f3 = this.f2922D;
        if (f3 <= 0.0f) {
            return false;
        }
        float f4 = f2 / f3;
        return Math.abs(f4 - ((float) Math.round(f4))) < 0.001f;
    }

    /* renamed from: f */
    public final void m1835f() {
        if (this.f2937S == null) {
            return;
        }
        int i = 0;
        while (true) {
            Bitmap[] bitmapArr = this.f2937S;
            if (i >= bitmapArr.length) {
                this.f2937S = null;
                this.f2938T = 0.0f;
                return;
            }
            Bitmap bitmap = bitmapArr[i];
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            this.f2937S[i] = null;
            i++;
        }
    }

    /* renamed from: g */
    public final void m1836g(float f2, float f3, float f4) {
        m1835f();
        this.f2927I = null;
        if (f4 <= 0.0f || f3 < f2) {
            this.f2926H = false;
            invalidate();
            return;
        }
        this.f2926H = true;
        this.f2928J = f4;
        int floor = (int) Math.floor(((f3 - f2) / f4) + 0.5f);
        int i = floor + 1;
        float[] fArr = new float[floor + 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f5 = (i2 * f4) + f2;
            if (f5 > (f4 * 0.01f) + f3) {
                break;
            }
            if (f5 > f3) {
                f5 = f3;
            }
            fArr[i3] = f5;
            i2++;
            i3++;
        }
        if (i3 == 0 || Math.abs(fArr[i3 - 1] - f3) > f4 * 0.01f) {
            fArr[i3] = f3;
            i3++;
        }
        float[] fArr2 = new float[i3];
        this.f2927I = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, i3);
        float f6 = getResources().getDisplayMetrics().density;
        this.f2933O = 59.999996f * f6;
        this.f2934P = 39.0f * f6;
        this.f2935Q = 22.5f * f6;
        float f7 = f6 * 2.5f;
        this.f2936R = f7;
        this.f2944j.setStrokeWidth(f7);
        this.f2958x = this.f2957w;
        invalidate();
    }

    public float getValue() {
        return this.f2957w;
    }

    /* renamed from: h */
    public final float m1837h() {
        return Math.max(0.55f, (8.0f / Math.max(1.0f, Math.max(1.0f, this.f2946l.width() * 0.5f))) * 57.295776f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2939U);
        this.f2959y = false;
        m1835f();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Paint.Style style;
        Paint.Cap cap;
        Paint paint;
        float f2;
        Paint.Style style2;
        Paint.Cap cap2;
        int i;
        Paint paint2;
        Shader shader;
        float f3;
        float min;
        float f4;
        float f5;
        int i2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        boolean z2;
        float f12;
        Bitmap bitmap;
        float f13;
        float[] fArr;
        Bitmap[] bitmapArr;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        float f14 = width * 0.5f;
        float f15 = height * 0.5f;
        float min2 = ((Math.min(width, height) * 0.5f) * this.f2950p) - this.f2951q;
        float f16 = this.f2952r * 0.5f;
        if (min2 < f16) {
            min2 = f16;
        }
        float f17 = f16 + min2;
        if (f17 <= 0.0f) {
            return;
        }
        RectF rectF = this.f2946l;
        rectF.set(f14 - f17, f15 - f17, f14 + f17, f15 + f17);
        float f18 = this.f2955u;
        float f19 = f18 - 90.0f;
        float f20 = this.f2956v - f18;
        Paint paint3 = this.f2940f;
        paint3.setShader(null);
        paint3.clearShadowLayer();
        paint3.setStrokeWidth(this.f2952r);
        Paint.Cap cap3 = Paint.Cap.BUTT;
        paint3.setStrokeCap(cap3);
        Paint.Style style3 = Paint.Style.STROKE;
        paint3.setStyle(style3);
        int i3 = this.f2960z;
        if (i3 != 0) {
            paint3.setColor(i3);
            style = style3;
            cap = cap3;
            paint = paint3;
            canvas.drawArc(rectF, f19, f20, false, paint3);
        } else {
            style = style3;
            cap = cap3;
            paint = paint3;
        }
        float f21 = this.f2957w;
        float f22 = this.f2953s;
        float m1830a = f20 * m1830a((f21 - f22) / (this.f2954t - f22), 0.0f, 1.0f);
        if (Math.abs(m1830a) >= 0.15f) {
            Paint paint4 = paint;
            paint4.setColor(this.f2919A);
            canvas.drawArc(rectF, f19, m1830a, false, paint4);
        }
        boolean z3 = this.f2920B;
        Paint paint5 = this.f2941g;
        if (z3) {
            float signum = Math.signum(this.f2956v - this.f2955u);
            if (signum == 0.0f) {
                signum = 1.0f;
            }
            float m1837h = (f19 + m1830a) - (m1837h() * signum);
            float max = signum >= 0.0f ? Math.max(f19, m1837h) : Math.min(f19, m1837h);
            float min3 = Math.min(20.0f, Math.abs(max - f19));
            if (min3 >= 4.0f) {
                float f23 = signum * min3;
                float f24 = max - f23;
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                f2 = f15;
                int m1831e = m1831e(0.5f, this.f2919A, -1);
                int i4 = this.f2919A;
                int[] iArr = this.f2948n;
                iArr[0] = i4;
                iArr[1] = i4;
                iArr[2] = m1831e;
                float[] fArr2 = this.f2949o;
                fArr2[0] = 0.0f;
                fArr2[1] = 0.22222222f;
                fArr2[2] = (min3 + 80.0f) / 360.0f;
                SweepGradient sweepGradient = new SweepGradient(centerX, centerY, iArr, fArr2);
                Matrix matrix = this.f2947m;
                matrix.reset();
                matrix.preRotate(f24 - (signum * 80.0f), centerX, centerY);
                sweepGradient.setLocalMatrix(matrix);
                style2 = style;
                paint5.setStyle(style2);
                cap2 = cap;
                paint5.setStrokeCap(cap2);
                paint5.setStrokeWidth(this.f2952r);
                paint5.setDither(true);
                paint5.setShader(sweepGradient);
                i = 1;
                canvas.drawArc(rectF, f24, f23, false, paint5);
                paint2 = paint5;
                shader = null;
                paint2.setShader(null);
                paint2.setDither(false);
                if (this.f2920B) {
                    f3 = 1.0f;
                } else {
                    float signum2 = Math.signum(this.f2956v - this.f2955u);
                    if (signum2 == 0.0f) {
                        signum2 = 1.0f;
                    }
                    f3 = 1.0f;
                    if (rectF.width() * 0.5f > 1.0f) {
                        float m1837h2 = m1837h();
                        float f25 = m1830a + f19;
                        if (signum2 >= 0.0f) {
                            min = Math.max(f19, f25 - m1837h2);
                            f4 = f25 - min;
                            if (f4 < 0.5f) {
                                f5 = 0.6f;
                                f4 = f5;
                            }
                            f19 = min;
                        } else {
                            min = Math.min(f19, m1837h2 + f25);
                            f4 = f25 - min;
                            if (Math.abs(f4) < 0.5f) {
                                f5 = -0.6f;
                                f4 = f5;
                            }
                            f19 = min;
                        }
                        paint2.setStyle(style2);
                        paint2.setStrokeCap(cap2);
                        paint2.setShader(shader);
                        paint2.setStrokeWidth(this.f2952r + 10.0f);
                        paint2.setColor(989855743);
                        float f26 = f19;
                        float f27 = f4;
                        Paint paint6 = paint2;
                        canvas.drawArc(rectF, f26, f27, false, paint6);
                        paint6.setStrokeWidth(this.f2952r + 4.0f);
                        paint6.setColor(1442840575);
                        canvas.drawArc(rectF, f26, f27, false, paint6);
                        paint6.setStrokeWidth(this.f2952r);
                        paint6.setColor(-1);
                        i2 = -1;
                        canvas.drawArc(rectF, f26, f27, false, paint6);
                        float f28 = 0.05f;
                        float f29 = 0.01f;
                        float f30 = 1.2f;
                        float f31 = 3.0f;
                        if (this.f2921C <= 0.0f || this.f2925G > i) {
                            float f32 = this.f2952r;
                            float f33 = f32 * 0.5f;
                            float f34 = 0.06f * f32;
                            f6 = (f17 - f33) + f34;
                            f7 = (f33 + f17) - f34;
                            if (f7 > f6 + f3) {
                                this.f2942h.setStrokeWidth(Math.max(1.2f, Math.min(3.0f, f32 * 0.04f)));
                                if (this.f2925G > i) {
                                    while (true) {
                                        int i5 = this.f2925G;
                                        if (i >= i5) {
                                            break;
                                        }
                                        float f35 = this.f2953s;
                                        float f36 = ((i / i5) * (this.f2954t - f35)) + f35;
                                        float f37 = (f6 + f7) * 0.5f;
                                        float m1830a2 = (f7 - f6) * 0.5f * m1830a(f3, 0.05f, f3);
                                        m1833c(canvas, f14, f2, f37 - m1830a2, f37 + m1830a2, f36);
                                        i++;
                                        f30 = f30;
                                        f31 = f31;
                                    }
                                } else {
                                    f8 = 3.0f;
                                    f9 = 1.2f;
                                    float f38 = f7 - f6;
                                    float m1830a3 = m1830a(this.f2924F, 0.08f, 0.45f) * f38;
                                    float f39 = this.f2953s;
                                    float f40 = this.f2921C;
                                    float f41 = this.f2954t - (f40 * 0.001f);
                                    float f42 = f39 + f40;
                                    int i6 = 0;
                                    while (f42 < f41) {
                                        int i7 = i6 + 1;
                                        if (i6 >= 512) {
                                            break;
                                        }
                                        if (this.f2922D > 0.0f && m1834d(f42)) {
                                            float[] fArr3 = this.f2927I;
                                            if (fArr3 != null) {
                                                for (float f43 : fArr3) {
                                                    if (Math.abs(f43 - f42) >= 0.01f) {
                                                    }
                                                }
                                            }
                                            f10 = f42;
                                            float f44 = f2;
                                            m1833c(canvas, f14, f44, f6, f6 + m1830a3, f10);
                                            m1833c(canvas, f14, f44, f7 - m1830a3, f7, f10);
                                            f11 = this.f2921C;
                                            f42 = f10 + f11;
                                            i6 = i7;
                                        }
                                        float f45 = this.f2922D;
                                        float f46 = this.f2923E;
                                        if (f45 > 0.0f && m1834d(f42)) {
                                            f46 = f3;
                                        }
                                        float f47 = (f6 + f7) * 0.5f;
                                        float m1830a4 = f38 * 0.5f * m1830a(f46, 0.05f, f3);
                                        f10 = f42;
                                        m1833c(canvas, f14, f2, f47 - m1830a4, f47 + m1830a4, f42);
                                        f11 = this.f2921C;
                                        f42 = f10 + f11;
                                        i6 = i7;
                                    }
                                    z2 = this.f2926H;
                                    if (z2) {
                                        return;
                                    }
                                    if (z2 && (fArr = this.f2927I) != null && ((bitmapArr = this.f2937S) == null || this.f2938T != this.f2933O || bitmapArr.length != fArr.length)) {
                                        m1835f();
                                        this.f2938T = this.f2933O;
                                        Paint paint7 = this.f2943i;
                                        paint7.setColor(i2);
                                        paint7.setTextSize(this.f2933O);
                                        Paint.FontMetrics fontMetrics = paint7.getFontMetrics();
                                        float f48 = (this.f2936R * f8) + 6.0f;
                                        float f49 = fontMetrics.descent;
                                        float f50 = fontMetrics.ascent;
                                        float f51 = f49 - f50;
                                        float f52 = -f50;
                                        this.f2937S = new Bitmap[this.f2927I.length];
                                        int i8 = 0;
                                        while (true) {
                                            float[] fArr4 = this.f2927I;
                                            if (i8 >= fArr4.length) {
                                                break;
                                            }
                                            float f53 = fArr4[i8];
                                            int round = Math.round(f53);
                                            String valueOf = Math.abs(f53 - ((float) round)) < f28 ? String.valueOf(round) : String.valueOf(f53);
                                            float f54 = f48 * 2.0f;
                                            int max2 = Math.max(2, (int) Math.ceil(paint7.measureText(valueOf) + f54));
                                            Bitmap createBitmap = Bitmap.createBitmap(max2, Math.max(2, (int) Math.ceil(f54 + f51)), Bitmap.Config.ARGB_8888);
                                            new Canvas(createBitmap).drawText(valueOf, max2 * 0.5f, f48 + f52, paint7);
                                            this.f2937S[i8] = createBitmap;
                                            i8++;
                                            f14 = f14;
                                            f28 = 0.05f;
                                        }
                                    }
                                    float f55 = f14;
                                    if (this.f2937S == null || this.f2927I == null) {
                                        return;
                                    }
                                    float max3 = Math.max(8.0f, (((this.f2952r * 0.15f) + f17) - 10.0f) - this.f2932N);
                                    float max4 = Math.max(f3, this.f2938T);
                                    float max5 = Math.max(f9, this.f2936R * 0.55f);
                                    int i9 = 0;
                                    while (true) {
                                        float[] fArr5 = this.f2927I;
                                        int length = fArr5.length;
                                        Paint paint8 = this.f2945k;
                                        if (i9 >= length) {
                                            paint8.setColorFilter(null);
                                            return;
                                        }
                                        float f56 = fArr5[i9];
                                        float f57 = this.f2953s;
                                        if (f56 >= f57 - f29) {
                                            float f58 = this.f2954t;
                                            if (f56 <= f58 + f29) {
                                                Bitmap[] bitmapArr2 = this.f2937S;
                                                if (i9 < bitmapArr2.length && (bitmap = bitmapArr2[i9]) != null) {
                                                    float m1830a5 = m1830a(f56, f57, f58);
                                                    float f59 = this.f2953s;
                                                    float f60 = (m1830a5 - f59) / (this.f2954t - f59);
                                                    float f61 = this.f2955u;
                                                    double radians = Math.toRadians(AbstractC0062j.m149c(this.f2956v, f61, f60, f61));
                                                    f12 = max4;
                                                    float sin = (((float) Math.sin(radians)) * max3) + f55;
                                                    float cos = f2 - (((float) Math.cos(radians)) * max3);
                                                    float abs = Math.abs(f56 - this.f2958x) / Math.max(1.0E-4f, this.f2928J);
                                                    float f62 = this.f2931M;
                                                    if (f56 + f29 >= this.f2929K) {
                                                        f62 *= this.f2930L;
                                                    }
                                                    float f63 = this.f2935Q;
                                                    float m149c = AbstractC0062j.m149c(this.f2933O, f63, f62, f63);
                                                    float m149c2 = AbstractC0062j.m149c(this.f2934P, f63, f62, f63);
                                                    if (abs <= f3) {
                                                        f13 = AbstractC0062j.m149c(m149c2, m149c, abs, m149c);
                                                    } else {
                                                        f13 = f63;
                                                        if (abs < 2.0f) {
                                                            f13 = AbstractC0062j.m149c(f13, m149c2, abs - f3, m149c2);
                                                        }
                                                    }
                                                    float f64 = f13 / f12;
                                                    float abs2 = Math.abs(f56 - this.f2958x) / Math.max(1.0E-4f, this.f2928J);
                                                    int m1831e2 = abs2 <= f3 ? m1831e(abs2, -10556716, -13773633) : abs2 < 2.0f ? m1831e(abs2 - f3, -13773633, -10839404) : -10839404;
                                                    float f65 = (-bitmap.getWidth()) * 0.5f;
                                                    float f66 = (-bitmap.getHeight()) * 0.5f;
                                                    canvas.save();
                                                    canvas.translate(sin, cos);
                                                    canvas.scale(f64, f64);
                                                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                                    paint8.setColorFilter(new PorterDuffColorFilter(-16379886, mode));
                                                    canvas.drawBitmap(bitmap, f65 - max5, f66, paint8);
                                                    canvas.drawBitmap(bitmap, f65 + max5, f66, paint8);
                                                    canvas.drawBitmap(bitmap, f65, f66 - max5, paint8);
                                                    canvas.drawBitmap(bitmap, f65, f66 + max5, paint8);
                                                    paint8.setColorFilter(new PorterDuffColorFilter(m1831e2, mode));
                                                    canvas.drawBitmap(bitmap, f65, f66, paint8);
                                                    canvas.restore();
                                                    i9++;
                                                    max4 = f12;
                                                    f29 = 0.01f;
                                                }
                                            }
                                        }
                                        f12 = max4;
                                        i9++;
                                        max4 = f12;
                                        f29 = 0.01f;
                                    }
                                }
                            }
                        }
                        f8 = f31;
                        f9 = f30;
                        z2 = this.f2926H;
                        if (z2) {
                        }
                    }
                }
                i2 = -1;
                float f282 = 0.05f;
                float f292 = 0.01f;
                float f302 = 1.2f;
                float f312 = 3.0f;
                if (this.f2921C <= 0.0f) {
                }
                float f322 = this.f2952r;
                float f332 = f322 * 0.5f;
                float f342 = 0.06f * f322;
                f6 = (f17 - f332) + f342;
                f7 = (f332 + f17) - f342;
                if (f7 > f6 + f3) {
                }
                f8 = f312;
                f9 = f302;
                z2 = this.f2926H;
                if (z2) {
                }
            }
        }
        paint2 = paint5;
        f2 = f15;
        style2 = style;
        cap2 = cap;
        shader = null;
        i = 1;
        if (this.f2920B) {
        }
        i2 = -1;
        float f2822 = 0.05f;
        float f2922 = 0.01f;
        float f3022 = 1.2f;
        float f3122 = 3.0f;
        if (this.f2921C <= 0.0f) {
        }
        float f3222 = this.f2952r;
        float f3322 = f3222 * 0.5f;
        float f3422 = 0.06f * f3222;
        f6 = (f17 - f3322) + f3422;
        f7 = (f3322 + f17) - f3422;
        if (f7 > f6 + f3) {
        }
        f8 = f3122;
        f9 = f3022;
        z2 = this.f2926H;
        if (z2) {
        }
    }

    public void setScaleDigitInset(float f2) {
        this.f2932N = Math.max(0.0f, f2);
        invalidate();
    }

    public void setScaleInflate(float f2) {
        this.f2931M = m1830a(f2, 0.05f, 2.0f);
        invalidate();
    }

    public void setTickMajorStep(float f2) {
        this.f2922D = Math.max(0.0f, f2);
        invalidate();
    }

    public void setTickSegments(int i) {
        this.f2925G = Math.max(0, i);
        this.f2921C = 0.0f;
        this.f2922D = 0.0f;
        invalidate();
    }

    public void setTickStep(float f2) {
        this.f2921C = Math.max(0.0f, f2);
        this.f2925G = 0;
        invalidate();
    }

    public void setTipStripeEnabled(boolean z2) {
        if (this.f2920B == z2) {
            return;
        }
        this.f2920B = z2;
        invalidate();
    }

    public void setValue(float f2) {
        float m1830a = m1830a(f2, this.f2953s, this.f2954t);
        if (m1830a == this.f2957w) {
            return;
        }
        this.f2957w = m1830a;
        if (!this.f2926H) {
            this.f2958x = m1830a;
        } else if (!this.f2959y) {
            this.f2959y = true;
            postOnAnimation(this.f2939U);
        }
        invalidate();
    }
}
