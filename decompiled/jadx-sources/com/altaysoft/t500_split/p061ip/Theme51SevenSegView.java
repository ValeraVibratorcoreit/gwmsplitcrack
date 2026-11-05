package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public final class Theme51SevenSegView extends View {

    /* renamed from: q */
    public static final int[] f2961q = {63, 6, 91, 79, 102, 109, 125, 7, 127, 111};

    /* renamed from: f */
    public final Paint f2962f;

    /* renamed from: g */
    public final Paint f2963g;

    /* renamed from: h */
    public final Paint f2964h;

    /* renamed from: i */
    public final Path f2965i;

    /* renamed from: j */
    public int f2966j;

    /* renamed from: k */
    public int f2967k;

    /* renamed from: l */
    public boolean f2968l;

    /* renamed from: m */
    public int f2969m;

    /* renamed from: n */
    public int f2970n;

    /* renamed from: o */
    public int f2971o;

    /* renamed from: p */
    public final float f2972p;

    public Theme51SevenSegView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f2962f = paint;
        Paint paint2 = new Paint(1);
        this.f2963g = paint2;
        Paint paint3 = new Paint(1);
        this.f2964h = paint3;
        this.f2965i = new Path();
        this.f2966j = 3;
        this.f2968l = true;
        this.f2971o = -10556716;
        setLayerType(1, null);
        this.f2972p = getResources().getDisplayMetrics().density * 5.0f;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint3.setStyle(style);
        m1838a();
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final void m1838a() {
        int i = this.f2971o;
        Paint paint = this.f2962f;
        paint.setColor(i);
        paint.setShadowLayer(this.f2972p, 0.0f, 0.0f, this.f2971o);
        int argb = Color.argb(Math.max(28, Color.alpha(this.f2971o) / 6), Color.red(this.f2971o), Color.green(this.f2971o), Color.blue(this.f2971o));
        Paint paint2 = this.f2963g;
        paint2.setColor(argb);
        paint2.clearShadowLayer();
        int i2 = this.f2971o;
        Paint paint3 = this.f2964h;
        paint3.setColor(i2);
        paint3.setShadowLayer(this.f2972p * 0.7f, 0.0f, 0.0f, this.f2971o);
    }

    /* renamed from: b */
    public final void m1839b(Canvas canvas, float f2, float f3, float f4, float f5, boolean z2) {
        Paint paint = z2 ? this.f2962f : this.f2963g;
        float f6 = 0.45f * f5;
        float f7 = f5 / 2.0f;
        float f8 = f3 + f7;
        Path path = this.f2965i;
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

    /* renamed from: c */
    public final void m1840c(Canvas canvas, float f2, float f3, float f4, float f5, boolean z2) {
        Paint paint = z2 ? this.f2962f : this.f2963g;
        float f6 = 0.45f * f4;
        float f7 = f4 / 2.0f;
        float f8 = f2 + f7;
        Path path = this.f2965i;
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

    /* renamed from: d */
    public final void m1841d(float f2, float f3, float f4, float f5, int i, Canvas canvas) {
        int i2 = (i < 0 || i > 9) ? 0 : f2961q[i];
        float max = Math.max(2.5f, 0.15f * f4);
        float f6 = max * 0.55f;
        float f7 = f2 + f6;
        float f8 = f4 - (f6 * 2.0f);
        m1839b(canvas, f7, f3, f8, max, (i2 & 1) != 0);
        float f9 = (f2 + f4) - max;
        float f10 = f3 + f6;
        float f11 = f5 / 2.0f;
        float f12 = f11 - f6;
        m1840c(canvas, f9, f10, max, f12, (i2 & 2) != 0);
        float f13 = f3 + f11;
        m1840c(canvas, f9, f13, max, f12, (i2 & 4) != 0);
        m1839b(canvas, f7, (f3 + f5) - max, f8, max, (i2 & 8) != 0);
        m1840c(canvas, f2, f13, max, f12, (i2 & 16) != 0);
        m1840c(canvas, f2, f10, max, f12, (i2 & 32) != 0);
        m1839b(canvas, f7, f13 - (max / 2.0f), f8, max, (i2 & 64) != 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        float min = Math.min(width, height) * 0.04f;
        float f2 = height;
        float f3 = min * 2.0f;
        float f4 = f2 - f3;
        float f5 = 0.58f * f4;
        float f6 = 0.18f * f5;
        int i = this.f2967k;
        float f7 = i > 0 ? 0.32f * f5 : 0.0f;
        boolean z2 = false;
        int i2 = this.f2966j + (i > 0 ? 1 : 0);
        int max = Math.max(0, i2 - 1);
        float f8 = i2;
        float f9 = max;
        float f10 = (f6 * f9) + (f5 * f8) + f7;
        float f11 = width;
        float f12 = f11 - f3;
        if (f10 > f12 && f10 > 0.1f) {
            float f13 = f12 / f10;
            f5 *= f13;
            f4 *= f13;
            f6 *= f13;
            f7 *= f13;
            f10 = (f9 * f6) + (f8 * f5) + f7;
        }
        float f14 = f4;
        float f15 = f6;
        float f16 = f10;
        float f17 = f7;
        float f18 = f5;
        float f19 = (f11 - f16) * 0.5f;
        float f20 = (f2 - f14) * 0.5f;
        int i3 = 1;
        for (int i4 = 1; i4 < this.f2966j; i4++) {
            i3 *= 10;
        }
        boolean z3 = !this.f2968l;
        float f21 = f19;
        int i5 = 0;
        while (true) {
            int i6 = this.f2966j;
            if (i5 >= i6) {
                break;
            }
            int i7 = (this.f2969m / i3) % 10;
            if (i3 > 1) {
                i3 /= 10;
            }
            int i8 = i3;
            boolean z4 = (z3 || i7 != 0 || i5 == i6 + (-1)) ? true : z2;
            boolean z5 = z4 ? true : z3;
            int i9 = i5;
            m1841d(f21, f20, f18, f14, z4 ? i7 : -1, canvas);
            f21 += f18;
            if (i9 < this.f2966j - 1) {
                f21 += f15;
            }
            i5 = i9 + 1;
            i3 = i8;
            z3 = z5;
            z2 = false;
        }
        if (this.f2967k > 0) {
            float f22 = f21 + f15;
            canvas.drawCircle((0.5f * f17) + f22, (0.88f * f14) + f20, Math.max(2.0f, 0.09f * f18), this.f2964h);
            m1841d(f17 + f15 + f22, f20, f18, f14, this.f2970n, canvas);
        }
    }

    public void setFixed1(float f2) {
        float max = Math.max(0.0f, f2);
        int i = (int) max;
        int round = Math.round((max - i) * 10.0f);
        if (round >= 10) {
            i++;
            round = 0;
        }
        if (i == this.f2969m && round == this.f2970n) {
            return;
        }
        this.f2969m = i;
        this.f2970n = round;
        invalidate();
    }

    public void setIntValue(int i) {
        int max = Math.max(0, i);
        if (max == this.f2969m && this.f2967k == 0) {
            return;
        }
        this.f2969m = max;
        this.f2970n = 0;
        invalidate();
    }

    public void setOnColor(int i) {
        if (this.f2971o == i) {
            return;
        }
        this.f2971o = i;
        m1838a();
        invalidate();
    }
}
