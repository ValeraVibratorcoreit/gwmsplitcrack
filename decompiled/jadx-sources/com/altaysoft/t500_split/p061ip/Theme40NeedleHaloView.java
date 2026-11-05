package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.sun.jna.Function;
import p001A0.RunnableC0020n;
import p006C.AbstractC0062j;
import p109u0.C1533e1;
import p109u0.C1536f1;

/* loaded from: classes.dex */
public final class Theme40NeedleHaloView extends View {

    /* renamed from: f */
    public int f2765f;

    /* renamed from: g */
    public int f2766g;

    /* renamed from: h */
    public float f2767h;

    /* renamed from: i */
    public View f2768i;

    /* renamed from: j */
    public final Paint f2769j;

    /* renamed from: k */
    public final float[] f2770k;

    /* renamed from: l */
    public final float[] f2771l;

    /* renamed from: m */
    public final float[] f2772m;

    /* renamed from: n */
    public final Path f2773n;

    /* renamed from: o */
    public final Path f2774o;

    /* renamed from: p */
    public final Path f2775p;

    /* renamed from: q */
    public final RectF f2776q;

    /* renamed from: r */
    public float f2777r;

    /* renamed from: s */
    public float f2778s;

    /* renamed from: t */
    public boolean f2779t;

    /* renamed from: u */
    public boolean f2780u;

    /* renamed from: v */
    public final RunnableC0020n f2781v;

    /* renamed from: w */
    public static final float[] f2761w = {0.1f, 0.24f, 0.38f, 0.52f, 0.66f, 0.8f, 0.93f};

    /* renamed from: x */
    public static final float[] f2762x = {0.16f, 0.21f, 0.26f, 0.32f, 0.37f, 0.41f, 0.44f};

    /* renamed from: y */
    public static final float[] f2763y = {0.0f, 0.014f, -0.016f, 0.01f, -0.013f, 0.011f, -0.008f};

    /* renamed from: z */
    public static final int[] f2764z = {26, 30, 34, 38, 40, 42, 36};

    /* renamed from: A */
    public static final float[] f2756A = {0.2f, 0.5f, 0.8f};

    /* renamed from: B */
    public static final float[] f2757B = {0.26f, 0.32f, 0.36f};

    /* renamed from: C */
    public static final int[] f2758C = {8, 11, 13};

    /* renamed from: D */
    public static final float[] f2759D = {0.0f, 0.38f, 0.72f, 1.0f};

    /* renamed from: E */
    public static final C1536f1 f2760E = new C1536f1();

    public Theme40NeedleHaloView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2765f = -16730881;
        Paint paint = new Paint(1);
        this.f2769j = paint;
        this.f2770k = new float[7];
        this.f2771l = new float[7];
        this.f2772m = new float[7];
        this.f2773n = new Path();
        this.f2774o = new Path();
        this.f2775p = new Path();
        this.f2776q = new RectF();
        this.f2781v = new RunnableC0020n(23, this);
        setWillNotDraw(false);
        setClickable(false);
        setFocusable(false);
        setLayerType(0, null);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        C1536f1 c1536f1 = f2760E;
        c1536f1.f8206e.setStyle(style);
        c1536f1.f8207f.setStyle(style);
        c1536f1.f8205d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        setOutlineProvider(new C1533e1());
    }

    /* renamed from: a */
    public static void m1808a() {
        C1536f1 c1536f1 = f2760E;
        if (!c1536f1.f8226y || c1536f1.f8224w >= 32) {
            return;
        }
        int i = c1536f1.f8219r;
        int i2 = c1536f1.f8220s;
        if (i <= 1 || i2 <= 1) {
            return;
        }
        if (c1536f1.f8221t == 0) {
            float min = Math.min(1.0f, 384.0f / Math.max(i, i2));
            c1536f1.f8221t = AbstractC0062j.m152f(i, min, 1);
            c1536f1.f8222u = AbstractC0062j.m152f(i2, min, 1);
        }
        int i3 = c1536f1.f8224w;
        Bitmap[] bitmapArr = c1536f1.f8202a;
        Bitmap bitmap = bitmapArr[i3];
        if (bitmap != null && bitmap.getWidth() == c1536f1.f8221t && bitmap.getHeight() == c1536f1.f8222u) {
            bitmap.eraseColor(0);
        } else {
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmap = Bitmap.createBitmap(c1536f1.f8221t, c1536f1.f8222u, Bitmap.Config.ARGB_8888);
            bitmapArr[i3] = bitmap;
        }
        Canvas canvas = c1536f1.f8203b;
        canvas.setBitmap(bitmap);
        float f2 = c1536f1.f8221t / i;
        canvas.save();
        canvas.scale(f2, f2);
        Path path = c1536f1.f8208g;
        canvas.clipPath(path);
        canvas.clipPath(c1536f1.f8209h);
        if (c1536f1.f8199B > 1.0f) {
            canvas.clipOutPath(c1536f1.f8210i);
        }
        canvas.drawPath(path, c1536f1.f8207f);
        float f3 = (i3 / 31.0f) * 6.544985f;
        for (int i4 = 0; i4 < c1536f1.f8216o; i4++) {
            float f4 = c1536f1.f8214m[i4];
            float sin = ((float) Math.sin((0.48f * f3) + f4)) * 0.22f;
            float f5 = c1536f1.f8211j[i4];
            float f6 = c1536f1.f8212k[i4];
            m1810c(canvas, c1536f1.f8206e, c1536f1.f8217p + (f5 - (f6 * sin)), c1536f1.f8218q + (f5 * sin) + f6, c1536f1.f8213l[i4] * ((((((float) Math.sin((f4 * 0.7f) + (0.72f * f3))) * 0.5f) + 0.5f) * 0.14f) + 0.88f), 16);
        }
        canvas.restore();
        canvas.setBitmap(null);
        c1536f1.f8224w++;
    }

    /* renamed from: b */
    public static void m1809b() {
        C1536f1 c1536f1 = f2760E;
        c1536f1.f8203b.setBitmap(null);
        for (int i = 0; i < 32; i++) {
            Bitmap bitmap = c1536f1.f8202a[i];
            if (bitmap != null) {
                bitmap.recycle();
                c1536f1.f8202a[i] = null;
            }
        }
        c1536f1.f8224w = 0;
        c1536f1.f8227z = 0L;
        c1536f1.f8198A = 0L;
        c1536f1.f8221t = 0;
        c1536f1.f8222u = 0;
    }

    /* renamed from: c */
    public static void m1810c(Canvas canvas, Paint paint, float f2, float f3, float f4, int i) {
        if (i <= 0 || f4 < 1.0f) {
            return;
        }
        float f5 = f4 / 32.0f;
        paint.setAlpha(Math.min(Function.USE_VARARGS, i));
        canvas.save();
        canvas.translate(f2, f3);
        canvas.scale(f5, f5);
        canvas.drawCircle(0.0f, 0.0f, 32.0f, paint);
        canvas.restore();
    }

    /* renamed from: g */
    public static int m1811g(int i, int i2) {
        return (i & 16777215) | ((i2 & Function.USE_VARARGS) << 24);
    }

    /* renamed from: d */
    public final void m1812d() {
        if (this.f2768i == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width <= 1 || height <= 1) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f2768i.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float min = (Math.min(width, height) * 0.5f * 0.96f * 0.68f) + 9.0f;
            int round = Math.round((width * 0.5f) - ((float) Math.sqrt(Math.max(0.0f, (r5 * r5) - (min * min))))) + 5;
            float f2 = height;
            int round2 = Math.round(f2 - (((((Math.min(width, height) * 0.5f) * 0.96f) * 0.68f) + (f2 * 0.5f)) + 9.0f));
            if (marginLayoutParams.getMarginStart() == round && marginLayoutParams.getMarginEnd() == round && marginLayoutParams.bottomMargin == round2) {
                return;
            }
            marginLayoutParams.setMarginStart(round);
            marginLayoutParams.setMarginEnd(round);
            marginLayoutParams.bottomMargin = round2;
            this.f2768i.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: e */
    public final void m1813e() {
        if (this.f2779t) {
            int[] iArr = {m1811g(this.f2765f, Function.USE_VARARGS), m1811g(this.f2765f, 200), m1811g(this.f2765f, 100), 0};
            Paint paint = this.f2769j;
            float[] fArr = f2759D;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new RadialGradient(0.0f, 0.0f, 32.0f, iArr, fArr, tileMode));
            C1536f1 c1536f1 = f2760E;
            c1536f1.f8206e.setShader(new RadialGradient(0.0f, 0.0f, 32.0f, iArr, fArr, tileMode));
            c1536f1.f8207f.setColor(m1811g(this.f2765f, 10));
            c1536f1.f8223v = this.f2765f;
        }
    }

    /* renamed from: f */
    public final void m1814f() {
        boolean z2 = this.f2779t;
        RunnableC0020n runnableC0020n = this.f2781v;
        if (!z2 || this.f2766g == 2 || !isAttachedToWindow() || getVisibility() != 0) {
            removeCallbacks(runnableC0020n);
            this.f2780u = false;
        } else {
            if (this.f2780u) {
                return;
            }
            this.f2780u = true;
            postDelayed(runnableC0020n, f2760E.f8224w < 32 ? 330L : 80L);
        }
    }

    @Override // android.view.View
    public float getRotation() {
        return 0.0f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f2760E.f8225x++;
        m1814f();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2781v);
        this.f2780u = false;
        C1536f1 c1536f1 = f2760E;
        int i = c1536f1.f8225x - 1;
        c1536f1.f8225x = i;
        if (i <= 0) {
            c1536f1.f8225x = 0;
            m1809b();
            c1536f1.f8226y = false;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path;
        if (this.f2779t) {
            C1536f1 c1536f1 = f2760E;
            if (c1536f1.f8224w == 0 && this.f2766g != 2) {
                while (c1536f1.f8224w < 32) {
                    m1808a();
                }
                c1536f1.f8198A = SystemClock.uptimeMillis();
            }
            canvas.save();
            canvas.clipPath(this.f2773n);
            canvas.clipPath(this.f2774o);
            if (this.f2766g != 2) {
                int width = getWidth();
                int height = getHeight();
                int i = c1536f1.f8224w;
                Rect rect = c1536f1.f8215n;
                rect.set(0, 0, width, height);
                canvas.save();
                float f2 = c1536f1.f8199B;
                Path path2 = c1536f1.f8210i;
                if (f2 > 1.0f) {
                    canvas.clipOutPath(path2);
                }
                Paint paint = c1536f1.f8205d;
                Bitmap[] bitmapArr = c1536f1.f8202a;
                Paint paint2 = c1536f1.f8204c;
                if (i == 1 || (i > 0 && i < 32)) {
                    path = path2;
                    paint2.setAlpha(Function.USE_VARARGS);
                    canvas.drawBitmap(bitmapArr[0], (Rect) null, rect, paint2);
                } else {
                    path = path2;
                    if (i >= 32) {
                        long j2 = c1536f1.f8198A;
                        if (j2 == 0) {
                            j2 = SystemClock.uptimeMillis();
                        }
                        float uptimeMillis = ((SystemClock.uptimeMillis() - j2) / 7000.0f) % 2.0f;
                        if (uptimeMillis > 1.0f) {
                            uptimeMillis = 2.0f - uptimeMillis;
                        }
                        int i2 = i - 1;
                        float f3 = uptimeMillis * i2;
                        int i3 = (int) f3;
                        if (i3 >= i2) {
                            paint2.setAlpha(Function.USE_VARARGS);
                            canvas.drawBitmap(bitmapArr[i2], (Rect) null, rect, paint2);
                        } else {
                            float f4 = f3 - i3;
                            int round = Math.round((1.0f - f4) * 255.0f);
                            int round2 = Math.round(f4 * 255.0f);
                            if (round2 <= 2) {
                                paint2.setAlpha(Function.USE_VARARGS);
                                canvas.drawBitmap(bitmapArr[i3], (Rect) null, rect, paint2);
                            } else if (round <= 2) {
                                paint2.setAlpha(Function.USE_VARARGS);
                                canvas.drawBitmap(bitmapArr[i3 + 1], (Rect) null, rect, paint2);
                            } else {
                                paint2.setAlpha(round);
                                canvas.drawBitmap(bitmapArr[i3], (Rect) null, rect, paint2);
                                paint.setAlpha(round2);
                                canvas.drawBitmap(bitmapArr[i3 + 1], (Rect) null, rect, paint);
                            }
                        }
                    }
                }
                paint2.setAlpha(Function.USE_VARARGS);
                paint.setAlpha(Function.USE_VARARGS);
                canvas.restore();
                if (c1536f1.f8199B > 1.0f) {
                    canvas.drawPath(path, c1536f1.f8207f);
                    Paint paint3 = c1536f1.f8206e;
                    m1810c(canvas, paint3, c1536f1.f8217p, c1536f1.f8218q, c1536f1.f8199B, 16);
                    float f5 = c1536f1.f8200C;
                    float f6 = c1536f1.f8201D;
                    if (f5 >= 1.0f && f6 >= 1.0f) {
                        for (int i4 = 0; i4 < 6; i4++) {
                            double radians = Math.toRadians((i4 / 6.0f) * 360.0d);
                            m1810c(canvas, paint3, c1536f1.f8217p + (((float) Math.cos(radians)) * f5), c1536f1.f8218q + (((float) Math.sin(radians)) * f5), f6, 16);
                        }
                    }
                }
            }
            if (this.f2766g != 1) {
                canvas.save();
                canvas.clipPath(this.f2775p);
                canvas.rotate(this.f2767h, this.f2777r, this.f2778s);
                float uptimeMillis2 = SystemClock.uptimeMillis() * 0.001f;
                for (int i5 = 0; i5 < 7; i5++) {
                    float sin = (((float) Math.sin((i5 * 0.9f) + (1.05f * uptimeMillis2))) * 0.12f) + 0.88f;
                    m1810c(canvas, this.f2769j, this.f2770k[i5], this.f2771l[i5], this.f2772m[i5] * ((sin * 0.08f) + 0.94f), Math.round(f2764z[i5] * sin));
                }
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = 0;
        this.f2779t = false;
        if (i <= 1 || i2 <= 1) {
            return;
        }
        float f2 = i;
        float f3 = f2 * 0.5f;
        this.f2777r = f3;
        float f4 = i2 * 0.5f;
        this.f2778s = f4;
        float min = Math.min(i, i2) * 0.5f;
        float f5 = min * 0.96f;
        float f6 = min * 0.33f;
        float max = Math.max(1.0f, (0.98f * f5) - f6);
        Path path = this.f2773n;
        path.reset();
        float f7 = this.f2777r;
        float f8 = this.f2778s;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f7, f8, f5, direction);
        float f9 = f5 * 0.68f;
        float f10 = this.f2778s + f9 + 9.0f;
        Path path2 = this.f2774o;
        path2.reset();
        path2.addRect(0.0f, 0.0f, f2, f10, direction);
        RectF rectF = this.f2776q;
        float f11 = this.f2777r;
        float f12 = this.f2778s;
        rectF.set(f11 - f5, f12 - f5, f11 + f5, f12 + f5);
        Path path3 = this.f2775p;
        path3.reset();
        path3.moveTo(this.f2777r, this.f2778s);
        path3.arcTo(rectF, 135.0f, 271.0f);
        path3.close();
        for (int i6 = 0; i6 < 7; i6++) {
            float f13 = (f2761w[i6] * max) + f6;
            this.f2770k[i6] = (f2763y[i6] * f5) + this.f2777r;
            this.f2771l[i6] = this.f2778s - f13;
            this.f2772m[i6] = f2762x[i6] * f5;
        }
        C1536f1 c1536f1 = f2760E;
        if (!c1536f1.f8226y || c1536f1.f8219r != i || c1536f1.f8220s != i2) {
            m1809b();
            c1536f1.f8217p = f3;
            c1536f1.f8218q = f4;
            c1536f1.f8219r = i;
            c1536f1.f8220s = i2;
            c1536f1.f8199B = 0.92f * f6;
            c1536f1.f8200C = 0.48f * f6;
            float[] fArr = f2757B;
            c1536f1.f8201D = fArr[0] * f5;
            Path path4 = c1536f1.f8208g;
            path4.reset();
            float f14 = c1536f1.f8217p;
            float f15 = c1536f1.f8218q;
            Path.Direction direction2 = Path.Direction.CW;
            path4.addCircle(f14, f15, f5, direction2);
            Path path5 = c1536f1.f8209h;
            path5.reset();
            path5.addRect(0.0f, 0.0f, f2, c1536f1.f8218q + f9 + 9.0f, direction2);
            Path path6 = c1536f1.f8210i;
            path6.reset();
            path6.addCircle(c1536f1.f8217p, c1536f1.f8218q, c1536f1.f8199B, direction2);
            c1536f1.f8216o = 0;
            float f16 = f9 + 9.0f;
            int i7 = 0;
            while (i7 < 3) {
                int i8 = f2758C[i7];
                float f17 = (f2756A[i7] * max) + f6;
                float f18 = fArr[i7] * f5;
                for (int i9 = i5; i9 < i8 && c1536f1.f8216o < 48; i9++) {
                    float f19 = (i9 + ((i7 & 1) == 1 ? 0.5f : 0.0f)) / i8;
                    if (f19 >= 1.0f) {
                        f19 -= 1.0f;
                    }
                    double radians = Math.toRadians(f19 * 360.0d);
                    float sin = ((float) Math.sin(radians)) * f17;
                    if (sin <= f16) {
                        int i10 = c1536f1.f8216o;
                        c1536f1.f8216o = i10 + 1;
                        c1536f1.f8211j[i10] = ((float) Math.cos(radians)) * f17;
                        c1536f1.f8212k[i10] = sin;
                        c1536f1.f8213l[i10] = f18;
                        c1536f1.f8214m[i10] = i10 * 1.6180339f;
                    }
                }
                i7++;
                i5 = 0;
            }
            c1536f1.f8226y = true;
        }
        this.f2779t = true;
        m1813e();
        m1812d();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m1814f();
    }

    public void setCropEdge(View view) {
        this.f2768i = view;
        if (this.f2779t) {
            m1812d();
        }
    }

    public void setDrawMode(int i) {
        this.f2766g = i;
        if (i != 2) {
            m1814f();
        } else {
            removeCallbacks(this.f2781v);
            this.f2780u = false;
        }
    }

    public void setFillColor(int i) {
        int i2 = i | (-16777216);
        if (this.f2765f == i2) {
            return;
        }
        this.f2765f = i2;
        int i3 = this.f2766g;
        C1536f1 c1536f1 = f2760E;
        boolean z2 = (i3 == 2 || c1536f1.f8223v == i2) ? false : true;
        if (z2) {
            m1809b();
        }
        if (this.f2779t) {
            m1813e();
            if (z2 && c1536f1.f8226y) {
                while (c1536f1.f8224w < 32) {
                    m1808a();
                }
                c1536f1.f8198A = SystemClock.uptimeMillis();
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void setRotation(float f2) {
        if (this.f2766g == 1 || this.f2767h == f2) {
            return;
        }
        this.f2767h = f2;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m1814f();
    }
}
