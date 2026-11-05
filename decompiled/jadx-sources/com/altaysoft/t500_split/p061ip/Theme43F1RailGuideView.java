package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.Locale;
import p006C.AbstractC0062j;
import p098q0.AbstractC1258F0;

/* loaded from: classes.dex */
public final class Theme43F1RailGuideView extends View {

    /* renamed from: A */
    public final float f2845A;

    /* renamed from: B */
    public final float f2846B;

    /* renamed from: C */
    public float f2847C;

    /* renamed from: D */
    public final float f2848D;

    /* renamed from: E */
    public final float f2849E;

    /* renamed from: F */
    public final float f2850F;

    /* renamed from: G */
    public final float f2851G;

    /* renamed from: H */
    public final float f2852H;

    /* renamed from: I */
    public final float f2853I;

    /* renamed from: J */
    public final float f2854J;

    /* renamed from: K */
    public final float f2855K;

    /* renamed from: L */
    public final float f2856L;

    /* renamed from: M */
    public final float f2857M;

    /* renamed from: N */
    public final boolean f2858N;

    /* renamed from: O */
    public final float f2859O;

    /* renamed from: P */
    public final float f2860P;

    /* renamed from: Q */
    public final int f2861Q;

    /* renamed from: R */
    public final int f2862R;

    /* renamed from: S */
    public final float f2863S;

    /* renamed from: T */
    public float f2864T;

    /* renamed from: U */
    public final float f2865U;

    /* renamed from: V */
    public final float f2866V;

    /* renamed from: W */
    public final boolean f2867W;

    /* renamed from: a0 */
    public boolean f2868a0;

    /* renamed from: b0 */
    public final int f2869b0;

    /* renamed from: f */
    public final Path f2870f;

    /* renamed from: g */
    public final Path f2871g;

    /* renamed from: h */
    public final Paint f2872h;

    /* renamed from: i */
    public final Paint f2873i;

    /* renamed from: j */
    public final Paint f2874j;

    /* renamed from: k */
    public final Paint f2875k;

    /* renamed from: l */
    public final Paint f2876l;

    /* renamed from: m */
    public final Paint f2877m;

    /* renamed from: n */
    public final Paint f2878n;

    /* renamed from: o */
    public final Paint f2879o;

    /* renamed from: p */
    public final Paint f2880p;

    /* renamed from: q */
    public final Paint f2881q;

    /* renamed from: r */
    public final float f2882r;

    /* renamed from: s */
    public final int f2883s;

    /* renamed from: t */
    public final float f2884t;

    /* renamed from: u */
    public final boolean f2885u;

    /* renamed from: v */
    public String f2886v;

    /* renamed from: w */
    public final float[] f2887w;

    /* renamed from: x */
    public final float[] f2888x;

    /* renamed from: y */
    public final float f2889y;

    /* renamed from: z */
    public final float f2890z;

    public Theme43F1RailGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        Paint paint;
        int i2;
        int i3;
        float f2;
        float f3;
        Paint paint2;
        float f4;
        int i4;
        int i5;
        int i6;
        float f5;
        Paint paint3;
        int i7;
        float f6;
        Paint paint4;
        int i8;
        float f7;
        Paint.Join join;
        this.f2870f = new Path();
        this.f2871g = new Path();
        Paint paint5 = new Paint(1);
        this.f2872h = paint5;
        Paint paint6 = new Paint(1);
        this.f2873i = paint6;
        Paint paint7 = new Paint(1);
        this.f2874j = paint7;
        Paint paint8 = new Paint(1);
        this.f2875k = paint8;
        Paint paint9 = new Paint(1);
        this.f2876l = paint9;
        Paint paint10 = new Paint(1);
        this.f2877m = paint10;
        Paint paint11 = new Paint(1);
        this.f2878n = paint11;
        Paint paint12 = new Paint(1);
        this.f2879o = paint12;
        Paint paint13 = new Paint(1);
        this.f2880p = paint13;
        Paint paint14 = new Paint(1);
        this.f2881q = paint14;
        this.f2882r = 0.0f;
        this.f2883s = -995120;
        this.f2884t = 0.0f;
        this.f2885u = false;
        this.f2886v = null;
        this.f2887w = new float[2];
        this.f2888x = new float[2];
        this.f2889y = 0.02f;
        this.f2890z = 0.18f;
        this.f2845A = 0.98f;
        this.f2846B = 0.0f;
        this.f2847C = 0.0f;
        this.f2848D = 300.0f;
        this.f2849E = 100.0f;
        this.f2850F = 50.0f;
        this.f2851G = 0.0f;
        this.f2852H = 0.0f;
        this.f2853I = 0.0f;
        this.f2854J = 0.0f;
        this.f2855K = 0.0f;
        this.f2856L = 0.0f;
        this.f2857M = 0.0f;
        this.f2858N = true;
        this.f2859O = -1.0f;
        this.f2860P = -1.0f;
        this.f2861Q = 0;
        this.f2862R = 0;
        this.f2863S = 220.0f;
        this.f2864T = 0.0f;
        this.f2865U = 20.0f;
        this.f2866V = 10.0f;
        this.f2867W = true;
        this.f2868a0 = false;
        this.f2869b0 = 0;
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1258F0.f5713a);
            int color = obtainStyledAttributes.getColor(5, -1754827);
            int color2 = obtainStyledAttributes.getColor(15, 1726298421);
            int color3 = obtainStyledAttributes.getColor(35, 1090519039);
            int color4 = obtainStyledAttributes.getColor(32, -1728053248);
            this.f2865U = obtainStyledAttributes.getFloat(33, this.f2865U);
            float f8 = obtainStyledAttributes.getFloat(34, 2.0f);
            this.f2866V = obtainStyledAttributes.getFloat(23, this.f2866V);
            float f9 = obtainStyledAttributes.getFloat(24, 1.0f);
            int color5 = obtainStyledAttributes.getColor(17, -995120);
            float f10 = obtainStyledAttributes.getFloat(21, 18.0f);
            this.f2869b0 = obtainStyledAttributes.getInt(18, this.f2869b0);
            float f11 = obtainStyledAttributes.getFloat(20, 0.0f);
            int color6 = obtainStyledAttributes.getColor(19, -16777216);
            float f12 = obtainStyledAttributes.getFloat(4, 0.0f);
            int color7 = obtainStyledAttributes.getColor(3, -2838729);
            this.f2885u = obtainStyledAttributes.getBoolean(26, this.f2885u);
            int color8 = obtainStyledAttributes.getColor(27, -266724838);
            float f13 = obtainStyledAttributes.getFloat(31, 3.0f);
            this.f2889y = obtainStyledAttributes.getFloat(30, this.f2889y);
            this.f2890z = obtainStyledAttributes.getFloat(8, this.f2890z);
            this.f2845A = obtainStyledAttributes.getFloat(14, this.f2845A);
            this.f2846B = obtainStyledAttributes.getDimension(13, this.f2846B);
            this.f2848D = obtainStyledAttributes.getDimension(6, this.f2848D);
            this.f2849E = obtainStyledAttributes.getDimension(2, this.f2849E);
            this.f2850F = obtainStyledAttributes.getDimension(0, this.f2850F);
            this.f2851G = obtainStyledAttributes.getDimension(25, this.f2851G);
            this.f2852H = obtainStyledAttributes.getDimension(29, this.f2852H);
            this.f2853I = obtainStyledAttributes.getDimension(7, this.f2853I);
            this.f2854J = obtainStyledAttributes.getDimension(28, this.f2854J);
            this.f2855K = obtainStyledAttributes.getDimension(9, this.f2855K);
            this.f2856L = obtainStyledAttributes.getDimension(16, this.f2856L);
            this.f2857M = obtainStyledAttributes.getDimension(12, 0.0f);
            this.f2858N = obtainStyledAttributes.getBoolean(11, true);
            this.f2859O = obtainStyledAttributes.getFloat(37, this.f2859O);
            this.f2860P = obtainStyledAttributes.getFloat(39, this.f2860P);
            this.f2861Q = obtainStyledAttributes.getColor(38, this.f2861Q);
            this.f2862R = obtainStyledAttributes.getColor(36, this.f2862R);
            this.f2863S = obtainStyledAttributes.getFloat(22, this.f2863S);
            this.f2867W = obtainStyledAttributes.getBoolean(10, this.f2867W);
            obtainStyledAttributes.recycle();
            i2 = color2;
            paint2 = paint13;
            f4 = f13;
            i4 = color4;
            i5 = color6;
            i = color7;
            i3 = color8;
            f5 = f8;
            f2 = f11;
            f3 = f12;
            paint4 = paint12;
            i8 = color3;
            f7 = f9;
            paint3 = paint11;
            i7 = color;
            f6 = f10;
            i6 = color5;
            paint = paint14;
        } else {
            i = -2838729;
            paint = paint14;
            i2 = 1726298421;
            i3 = -266724838;
            f2 = 0.0f;
            f3 = 0.0f;
            paint2 = paint13;
            f4 = 3.0f;
            i4 = -1728053248;
            i5 = -16777216;
            i6 = -995120;
            f5 = 2.0f;
            paint3 = paint11;
            i7 = -1754827;
            f6 = 18.0f;
            paint4 = paint12;
            i8 = 1090519039;
            f7 = 1.0f;
        }
        if (this.f2863S <= 0.0f) {
            this.f2863S = 220.0f;
        }
        Paint.Style style = Paint.Style.STROKE;
        paint5.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint5.setStrokeCap(cap);
        Paint.Join join2 = Paint.Join.ROUND;
        paint5.setStrokeJoin(join2);
        paint5.setColor(i7);
        paint5.setStrokeWidth(TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics()));
        Paint.Style style2 = Paint.Style.FILL;
        paint6.setStyle(style2);
        paint6.setColor(i2);
        paint7.setStyle(style2);
        paint7.setColor(i8);
        paint8.setStyle(style2);
        paint9.setStyle(style);
        Paint.Cap cap2 = Paint.Cap.BUTT;
        paint9.setStrokeCap(cap2);
        paint9.setColor(i4);
        paint9.setStrokeWidth(TypedValue.applyDimension(1, f5, getResources().getDisplayMetrics()));
        paint10.setStyle(style);
        paint10.setStrokeCap(cap2);
        paint10.setColor(i4);
        paint10.setStrokeWidth(TypedValue.applyDimension(1, f7, getResources().getDisplayMetrics()));
        float applyDimension = TypedValue.applyDimension(2, f6, getResources().getDisplayMetrics());
        this.f2882r = TypedValue.applyDimension(1, f2, getResources().getDisplayMetrics());
        int i9 = i6;
        this.f2883s = i9;
        Paint paint15 = paint3;
        paint15.setStyle(style2);
        paint15.setColor(i9);
        paint15.setTextSize(applyDimension);
        Paint.Align align = Paint.Align.CENTER;
        paint15.setTextAlign(align);
        if (this.f2882r > 0.0f) {
            paint15.setTypeface(Typeface.create("sans-serif-medium", 1));
            Paint paint16 = paint4;
            paint16.setStyle(style);
            paint16.setColor(i5);
            paint16.setTextSize(applyDimension);
            paint16.setTextAlign(align);
            paint16.setTypeface(paint15.getTypeface());
            paint16.setStrokeWidth(this.f2882r * 2.0f);
            join = join2;
            paint16.setStrokeJoin(join);
            paint16.setStrokeCap(cap);
        } else {
            join = join2;
        }
        this.f2884t = TypedValue.applyDimension(1, f3, getResources().getDisplayMetrics());
        Paint paint17 = paint2;
        paint17.setStyle(style);
        paint17.setColor(i);
        paint17.setStrokeWidth(this.f2884t);
        paint17.setStrokeJoin(join);
        paint17.setStrokeCap(cap);
        Paint paint18 = paint;
        paint18.setStyle(style2);
        paint18.setColor(i3);
        TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public final void m1824a(Canvas canvas, float f2, Paint paint) {
        int i;
        float[] fArr;
        float[] fArr2;
        PathMeasure pathMeasure = new PathMeasure(this.f2870f, false);
        float length = pathMeasure.getLength();
        if (length <= 0.0f) {
            return;
        }
        float f3 = length * f2;
        float strokeWidth = this.f2872h.getStrokeWidth() * 0.5f;
        float f4 = -strokeWidth;
        float f5 = this.f2851G + strokeWidth;
        Path path = this.f2871g;
        path.reset();
        int i2 = 0;
        while (true) {
            fArr = this.f2888x;
            fArr2 = this.f2887w;
            if (i2 > 96) {
                break;
            }
            if (pathMeasure.getPosTan((i2 * f3) / 96.0f, fArr2, fArr)) {
                float f6 = -fArr[1];
                float f7 = fArr[0];
                float f8 = (f6 * f4) + fArr2[0];
                float f9 = (f7 * f4) + fArr2[1];
                if (i2 == 0) {
                    path.moveTo(f8, f9);
                } else {
                    path.lineTo(f8, f9);
                }
            }
            i2++;
        }
        for (i = 96; i >= 0; i--) {
            if (pathMeasure.getPosTan((i * f3) / 96.0f, fArr2, fArr)) {
                path.lineTo(((-fArr[1]) * f5) + fArr2[0], (fArr[0] * f5) + fArr2[1]);
            }
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    /* renamed from: b */
    public final void m1825b(Canvas canvas, String str, float f2, float f3) {
        if (this.f2882r > 0.0f) {
            canvas.drawText(str, f2, f3, this.f2879o);
        }
        canvas.drawText(str, f2, f3, this.f2878n);
    }

    /* renamed from: c */
    public final void m1826c(Canvas canvas, float f2, float f3, float f4, float f5) {
        float[] fArr = this.f2887w;
        float f6 = fArr[0];
        float f7 = fArr[1];
        canvas.drawLine((f4 * f2) + f6, (f4 * f3) + f7, (f2 * f5) + f6, (f5 * f3) + f7, this.f2876l);
    }

    /* renamed from: d */
    public final float m1827d(float f2, float f3) {
        float f4 = this.f2857M;
        return f4 > 0.0f ? (f4 - getLeft()) - getTranslationX() : (((f3 * this.f2845A) + f2) - this.f2846B) - this.f2847C;
    }

    public int getBaseLabelColor() {
        return this.f2883s;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float hypot;
        Path path;
        float f4;
        PathMeasure pathMeasure;
        float f5;
        String valueOf;
        float f6;
        float f7;
        int i;
        int i2;
        float f8;
        int i3;
        PathMeasure pathMeasure2;
        float f9;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float f10;
        float[] fArr4;
        float f11;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        Paint paint = this.f2872h;
        float strokeWidth = paint.getStrokeWidth() * 0.5f;
        float f12 = strokeWidth * 2.0f;
        float f13 = width - f12;
        float f14 = (this.f2889y * f13) + strokeWidth;
        float f15 = height;
        float f16 = f15 - strokeWidth;
        float min = f16 - Math.min(this.f2848D, (f15 - f12) - 1.0f);
        float f17 = f16 - min;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        float f18 = (f17 * this.f2890z) + f14;
        float m1827d = m1827d(strokeWidth, f13);
        float f19 = min - f16;
        float hypot2 = (float) Math.hypot(f18 - f14, f19);
        if (hypot2 < 0.001f) {
            hypot2 = 0.001f;
        }
        float abs = Math.abs(f19 / hypot2);
        if (abs < 0.001f) {
            abs = 0.001f;
        }
        float f20 = this.f2852H;
        float f21 = (f20 / abs) + f14;
        float f22 = min + f20;
        float f23 = f16 - f22;
        if (f23 < 1.0f) {
            f23 = 1.0f;
        }
        float f24 = (f23 * this.f2890z) + f21 + this.f2853I;
        float f25 = f21 + this.f2854J;
        if (this.f2855K > 0.001f) {
            float f26 = f24 - f25;
            float f27 = f22 - f16;
            f2 = f16;
            float hypot3 = (float) Math.hypot(f26, f27);
            if (hypot3 > 1.0f) {
                float min2 = Math.min(this.f2855K, hypot3 - 1.0f);
                f25 += (f26 / hypot3) * min2;
                f3 = ((f27 / hypot3) * min2) + f2;
                float f28 = this.f2849E;
                Path path2 = this.f2870f;
                float f29 = f24 - f25;
                float f30 = f22 - f3;
                hypot = (float) Math.hypot(f29, f30);
                if (hypot < 0.001f) {
                    hypot = 0.001f;
                }
                float f31 = f29 / hypot;
                float f32 = f30 / hypot;
                float f33 = this.f2850F + f28;
                float f34 = f28 + f24 + this.f2856L;
                path2.reset();
                path2.moveTo(f25, f3);
                path2.lineTo(f24 - (f31 * f33), f22 - (f32 * f33));
                path2.quadTo(f24, f22, f34, f22);
                path2.lineTo(m1827d, f22);
                if (this.f2851G <= 0.001f) {
                    Canvas canvas2 = canvas;
                    m1824a(canvas2, 1.0f, this.f2874j);
                    float f35 = this.f2859O;
                    int i4 = 0;
                    if (f35 >= 0.0f) {
                        float f36 = this.f2860P;
                        if (f36 > f35 && (i = this.f2861Q) != 0 && (i2 = this.f2862R) != 0) {
                            float f37 = this.f2863S;
                            if (f37 > 0.0f) {
                                float max = Math.max(0.0f, Math.min(f35, f37));
                                float max2 = Math.max(0.0f, Math.min(f36, this.f2863S));
                                if (max2 > max) {
                                    PathMeasure pathMeasure3 = new PathMeasure(path2, false);
                                    float length = pathMeasure3.getLength();
                                    if (length > 0.0f) {
                                        float f38 = this.f2863S;
                                        float f39 = (max / f38) * length;
                                        float f40 = ((max2 / f38) * length) - f39;
                                        if (f40 >= 0.5f) {
                                            float strokeWidth2 = paint.getStrokeWidth() * 0.5f;
                                            float f41 = -strokeWidth2;
                                            float f42 = this.f2851G + strokeWidth2;
                                            float[] fArr5 = new float[2];
                                            float[] fArr6 = new float[2];
                                            float[] fArr7 = new float[2];
                                            float[] fArr8 = new float[2];
                                            while (i4 < 56) {
                                                float f43 = i4 / 56.0f;
                                                int i5 = i4 + 1;
                                                Path path3 = path2;
                                                float f44 = i5 / 56.0f;
                                                float f45 = (f40 * f43) + f39;
                                                float f46 = f40;
                                                float f47 = (f40 * f44) + f39;
                                                if (pathMeasure3.getPosTan(f45, fArr5, fArr6) && pathMeasure3.getPosTan(f47, fArr7, fArr8)) {
                                                    float f48 = -fArr6[1];
                                                    float f49 = fArr6[0];
                                                    f8 = f39;
                                                    float f50 = -fArr8[1];
                                                    float f51 = fArr8[0];
                                                    float f52 = fArr5[0];
                                                    pathMeasure2 = pathMeasure3;
                                                    float f53 = (f41 * f48) + f52;
                                                    float f54 = fArr5[1];
                                                    float f55 = (f41 * f49) + f54;
                                                    float f56 = (f48 * f42) + f52;
                                                    fArr2 = fArr8;
                                                    float f57 = (f49 * f42) + f54;
                                                    float f58 = fArr7[0];
                                                    fArr3 = fArr6;
                                                    float f59 = (f41 * f50) + f58;
                                                    float f60 = fArr7[1];
                                                    f9 = f41;
                                                    float f61 = (f41 * f51) + f60;
                                                    float f62 = (f50 * f42) + f58;
                                                    fArr = fArr7;
                                                    float f63 = (f51 * f42) + f60;
                                                    float f64 = (f43 + f44) * 0.5f;
                                                    Paint paint2 = this.f2875k;
                                                    if (f64 <= 0.0f) {
                                                        i3 = i;
                                                    } else if (f64 >= 1.0f) {
                                                        i3 = i;
                                                        i = i2;
                                                    } else {
                                                        f10 = f42;
                                                        fArr4 = fArr5;
                                                        f11 = f61;
                                                        i3 = i;
                                                        i = Color.argb(AbstractC0062j.m150d(Color.alpha(i2) - Color.alpha(i), f64, Color.alpha(i)), AbstractC0062j.m150d(Color.red(i2) - Color.red(i), f64, Color.red(i)), AbstractC0062j.m150d(Color.green(i2) - Color.green(i), f64, Color.green(i)), AbstractC0062j.m150d(Color.blue(i2) - Color.blue(i), f64, Color.blue(i)));
                                                        paint2.setColor(i);
                                                        Path path4 = this.f2871g;
                                                        path4.reset();
                                                        path4.moveTo(f53, f55);
                                                        path4.lineTo(f56, f57);
                                                        path4.lineTo(f62, f63);
                                                        path4.lineTo(f59, f11);
                                                        path4.close();
                                                        canvas2 = canvas;
                                                        canvas2.drawPath(path4, paint2);
                                                    }
                                                    f11 = f61;
                                                    f10 = f42;
                                                    fArr4 = fArr5;
                                                    paint2.setColor(i);
                                                    Path path42 = this.f2871g;
                                                    path42.reset();
                                                    path42.moveTo(f53, f55);
                                                    path42.lineTo(f56, f57);
                                                    path42.lineTo(f62, f63);
                                                    path42.lineTo(f59, f11);
                                                    path42.close();
                                                    canvas2 = canvas;
                                                    canvas2.drawPath(path42, paint2);
                                                } else {
                                                    f8 = f39;
                                                    i3 = i;
                                                    pathMeasure2 = pathMeasure3;
                                                    f9 = f41;
                                                    fArr = fArr7;
                                                    fArr2 = fArr8;
                                                    fArr3 = fArr6;
                                                    f10 = f42;
                                                    fArr4 = fArr5;
                                                }
                                                f39 = f8;
                                                path2 = path3;
                                                i4 = i5;
                                                f40 = f46;
                                                f42 = f10;
                                                fArr8 = fArr2;
                                                fArr7 = fArr;
                                                pathMeasure3 = pathMeasure2;
                                                fArr6 = fArr3;
                                                f41 = f9;
                                                fArr5 = fArr4;
                                                i = i3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Path path5 = path2;
                    float f65 = this.f2864T;
                    if (f65 > 0.001f) {
                        m1824a(canvas2, f65, this.f2873i);
                    }
                    float f66 = this.f2884t;
                    Paint paint3 = this.f2880p;
                    if (f66 > 0.0f) {
                        m1824a(canvas2, 1.0f, paint3);
                    }
                    float f67 = this.f2866V;
                    float[] fArr9 = this.f2888x;
                    float[] fArr10 = this.f2887w;
                    if (f67 <= 0.0f) {
                        path = path5;
                    } else {
                        path = path5;
                        PathMeasure pathMeasure4 = new PathMeasure(path, false);
                        float length2 = pathMeasure4.getLength();
                        if (length2 > 0.0f) {
                            float strokeWidth3 = paint.getStrokeWidth() * 0.5f;
                            float f68 = this.f2851G;
                            float f69 = (strokeWidth3 * 2.0f) + f68;
                            float f70 = f68 * 0.5f;
                            float f71 = f69 * 0.5f * 0.5f;
                            float f72 = f70 - f71;
                            float f73 = f70 + f71;
                            float f74 = this.f2866V;
                            while (true) {
                                float f75 = this.f2863S;
                                if (f74 >= f75 + 0.001f) {
                                    break;
                                }
                                float f76 = this.f2866V;
                                if (this.f2867W) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = 0.0f;
                                    if (f76 > 0.0f && f74 + 0.001f >= f75) {
                                        f74 += this.f2866V;
                                    }
                                }
                                float f77 = this.f2865U;
                                if (f77 > f4) {
                                    if (Math.abs((f74 / f77) - Math.round(r0)) < 0.001f) {
                                        f74 += this.f2866V;
                                    }
                                }
                                if (pathMeasure4.getPosTan((f74 / this.f2863S) * length2, fArr10, fArr9)) {
                                    float f78 = -fArr9[1];
                                    float f79 = fArr9[0];
                                    float f80 = fArr10[0];
                                    float f81 = fArr10[1];
                                    canvas.drawLine((f72 * f78) + f80, (f72 * f79) + f81, f80 + (f78 * f73), f81 + (f79 * f73), this.f2877m);
                                }
                                f74 += this.f2866V;
                            }
                        }
                    }
                    float f82 = this.f2865U;
                    Paint paint4 = this.f2878n;
                    if (f82 > 0.0f) {
                        PathMeasure pathMeasure5 = new PathMeasure(path, false);
                        float length3 = pathMeasure5.getLength();
                        if (length3 > 0.0f) {
                            float strokeWidth4 = paint.getStrokeWidth() * 0.5f;
                            float f83 = -strokeWidth4;
                            float f84 = this.f2851G;
                            float f85 = f84 + strokeWidth4;
                            float f86 = f84 * 0.5f;
                            float textSize = this.f2858N ? (paint4.getTextSize() * 0.72f) + this.f2882r : 0.0f;
                            float f87 = 0.0f;
                            while (true) {
                                float f88 = this.f2863S;
                                if (f87 > f88 + 0.001f) {
                                    break;
                                }
                                float f89 = this.f2865U;
                                if ((this.f2867W || f89 <= 0.0f || f87 + 0.001f < f88) && pathMeasure5.getPosTan((f87 / f88) * length3, fArr10, fArr9)) {
                                    float f90 = -fArr9[1];
                                    float f91 = fArr9[0];
                                    if (!this.f2858N || f87 <= 0.001f || textSize <= 0.0f) {
                                        f6 = f83;
                                        m1826c(canvas, f90, f91, f6, f85);
                                    } else {
                                        float f92 = f86 - textSize;
                                        float f93 = f86 + textSize;
                                        if (f92 > f83) {
                                            f7 = f90;
                                            f6 = f83;
                                            m1826c(canvas, f90, f91, f83, f92);
                                        } else {
                                            f7 = f90;
                                            f6 = f83;
                                        }
                                        if (f93 < f85) {
                                            m1826c(canvas, f7, f91, f93, f85);
                                        }
                                    }
                                } else {
                                    f6 = f83;
                                }
                                f87 += this.f2865U;
                                f83 = f6;
                            }
                        }
                    }
                    float f94 = 0.35f;
                    if (this.f2858N && this.f2865U > 0.0f) {
                        PathMeasure pathMeasure6 = new PathMeasure(path, false);
                        float length4 = pathMeasure6.getLength();
                        if (length4 > 0.0f) {
                            float f95 = this.f2851G * 0.5f;
                            float textSize2 = paint4.getTextSize();
                            paint4.setTextAlign(Paint.Align.CENTER);
                            float f96 = this.f2865U;
                            while (true) {
                                float f97 = this.f2863S;
                                if (f96 > f97 + 0.001f) {
                                    break;
                                }
                                if (pathMeasure6.getPosTan((f96 / f97) * length4, fArr10, fArr9)) {
                                    float f98 = -fArr9[1];
                                    float f99 = fArr9[0];
                                    float f100 = (f98 * f95) + fArr10[0];
                                    float f101 = (textSize2 * f94) + (f99 * f95) + fArr10[1];
                                    if (this.f2869b0 > 0) {
                                        Locale locale = Locale.US;
                                        pathMeasure = pathMeasure6;
                                        StringBuilder sb = new StringBuilder("%.");
                                        f5 = f95;
                                        sb.append(this.f2869b0);
                                        sb.append("f");
                                        valueOf = String.format(locale, sb.toString(), Float.valueOf(f96));
                                    } else {
                                        pathMeasure = pathMeasure6;
                                        f5 = f95;
                                        valueOf = String.valueOf(Math.round(f96));
                                    }
                                    if (this.f2868a0) {
                                        canvas.save();
                                        canvas2.scale(-1.0f, 1.0f, f100, f101);
                                        m1825b(canvas2, valueOf, f100, f101);
                                        canvas.restore();
                                    } else {
                                        m1825b(canvas2, valueOf, f100, f101);
                                    }
                                } else {
                                    pathMeasure = pathMeasure6;
                                    f5 = f95;
                                }
                                f96 += this.f2865U;
                                pathMeasure6 = pathMeasure;
                                f95 = f5;
                                f94 = 0.35f;
                            }
                        }
                    }
                    if (this.f2885u) {
                        PathMeasure pathMeasure7 = new PathMeasure(path, false);
                        float length5 = pathMeasure7.getLength();
                        if (length5 > 0.0f && pathMeasure7.getPosTan(length5 * this.f2864T, fArr10, fArr9)) {
                            float f102 = -fArr9[1];
                            float f103 = fArr9[0];
                            float f104 = this.f2851G * 0.5f;
                            float strokeWidth5 = paint.getStrokeWidth() * 0.5f;
                            float f105 = (f102 * f104) + fArr10[0];
                            float f106 = (f103 * f104) + fArr10[1];
                            float f107 = f104 + strokeWidth5;
                            canvas2.drawCircle(f105, f106, f107, this.f2881q);
                            float f108 = this.f2884t;
                            if (f108 > 0.0f) {
                                canvas2.drawCircle(f105, f106, f107 - (f108 * 0.5f), paint3);
                            }
                            String str = this.f2886v;
                            if (str == null) {
                                if (this.f2869b0 > 0) {
                                    str = String.format(Locale.US, "%." + this.f2869b0 + "f", Float.valueOf(this.f2864T * this.f2863S));
                                } else {
                                    str = String.valueOf(Math.round(this.f2864T * this.f2863S));
                                }
                            }
                            float textSize3 = (paint4.getTextSize() * 0.35f) + f106;
                            if (!this.f2868a0) {
                                m1825b(canvas2, str, f105, textSize3);
                                return;
                            }
                            canvas.save();
                            canvas2.scale(-1.0f, 1.0f, f105, textSize3);
                            m1825b(canvas2, str, f105, textSize3);
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            f2 = f16;
        }
        f3 = f2;
        float f282 = this.f2849E;
        Path path22 = this.f2870f;
        float f292 = f24 - f25;
        float f302 = f22 - f3;
        hypot = (float) Math.hypot(f292, f302);
        if (hypot < 0.001f) {
        }
        float f312 = f292 / hypot;
        float f322 = f302 / hypot;
        float f332 = this.f2850F + f282;
        float f342 = f282 + f24 + this.f2856L;
        path22.reset();
        path22.moveTo(f25, f3);
        path22.lineTo(f24 - (f312 * f332), f22 - (f322 * f332));
        path22.quadTo(f24, f22, f342, f22);
        path22.lineTo(m1827d, f22);
        if (this.f2851G <= 0.001f) {
        }
    }

    public void setFillColor(int i) {
        Paint paint = this.f2873i;
        if (paint.getColor() == i) {
            return;
        }
        paint.setColor(i);
        invalidate();
    }

    public void setHorizontalEndX(float f2) {
        int width = getWidth();
        if (width <= 0) {
            return;
        }
        float strokeWidth = this.f2872h.getStrokeWidth() * 0.5f;
        float f3 = ((((width - (2.0f * strokeWidth)) * this.f2845A) + strokeWidth) - this.f2846B) - f2;
        if (Math.abs(f3 - this.f2847C) < 0.5f) {
            return;
        }
        this.f2847C = f3;
        invalidate();
    }

    public void setLabelColor(int i) {
        Paint paint = this.f2878n;
        if (paint.getColor() == i) {
            return;
        }
        paint.setColor(i);
        invalidate();
    }

    public void setLabelsMirrorCompensated(boolean z2) {
        if (this.f2868a0 != z2) {
            this.f2868a0 = z2;
            invalidate();
        }
    }

    public void setPuckText(String str) {
        if (str == null && this.f2886v == null) {
            return;
        }
        if (str == null || !str.equals(this.f2886v)) {
            this.f2886v = str;
            if (this.f2885u) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000e, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setValue(float f2) {
        float f3 = f2 / this.f2863S;
        float f4 = f3 >= 0.0f ? 1.0f : 0.0f;
        f3 = f4;
        if (Math.abs(f3 - this.f2864T) > 5.0E-4f) {
            this.f2864T = f3;
            invalidate();
        }
    }
}
