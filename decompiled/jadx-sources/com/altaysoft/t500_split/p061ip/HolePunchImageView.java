package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import p082l.C1151y;
import p109u0.C1537g;

/* loaded from: classes.dex */
public final class HolePunchImageView extends C1151y {

    /* renamed from: f */
    public final Paint f2730f;

    /* renamed from: g */
    public final Paint f2731g;

    /* renamed from: h */
    public final Paint f2732h;

    /* renamed from: i */
    public final RectF f2733i;

    /* renamed from: j */
    public float f2734j;

    /* renamed from: k */
    public float f2735k;

    /* renamed from: l */
    public boolean f2736l;

    /* renamed from: m */
    public int f2737m;

    /* renamed from: n */
    public int f2738n;

    /* renamed from: o */
    public int f2739o;

    /* renamed from: p */
    public boolean f2740p;

    public HolePunchImageView(C1537g c1537g) {
        super(c1537g);
        this.f2730f = new Paint(1);
        this.f2731g = new Paint(1);
        this.f2732h = new Paint(1);
        this.f2733i = new RectF();
        this.f2737m = 0;
        m1804e();
    }

    /* renamed from: b */
    public final void m1802b() {
        if (this.f2736l) {
            this.f2736l = false;
            setLayerType(0, null);
            invalidate();
        }
    }

    /* renamed from: d */
    public final void m1803d(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i = this.f2737m;
        Paint paint = this.f2732h;
        if (i == 2) {
            paint.setShader(this.f2740p ? new LinearGradient(0.0f, 0.0f, width, 0.0f, this.f2738n, this.f2739o, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, height, this.f2738n, this.f2739o, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, width, height, paint);
            paint.setShader(null);
        } else {
            paint.setShader(null);
            paint.setColor(this.f2738n);
            canvas.drawRect(0.0f, 0.0f, width, height, paint);
        }
    }

    /* renamed from: e */
    public final void m1804e() {
        this.f2730f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f2731g.setStyle(Paint.Style.STROKE);
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f2732h;
        paint.setStyle(style);
        paint.setAntiAlias(true);
    }

    /* renamed from: f */
    public final void m1805f(RectF rectF, float f2, float f3) {
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            m1802b();
            return;
        }
        this.f2733i.set(rectF);
        this.f2734j = f2;
        this.f2735k = f3;
        Paint paint = this.f2731g;
        paint.setColor(-2008038409);
        paint.setStrokeWidth(f3);
        if (!this.f2736l) {
            this.f2736l = true;
            setLayerType(1, null);
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.f2737m;
        Paint paint = this.f2731g;
        Paint paint2 = this.f2730f;
        RectF rectF = this.f2733i;
        if (i == 0) {
            if (!this.f2736l) {
                super.onDraw(canvas);
                return;
            }
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            float f2 = this.f2734j;
            canvas.drawRoundRect(rectF, f2, f2, paint2);
            canvas.restoreToCount(saveLayer);
            if (this.f2735k > 0.0f) {
                float f3 = this.f2734j;
                canvas.drawRoundRect(rectF, f3, f3, paint);
                return;
            }
            return;
        }
        if (!this.f2736l) {
            m1803d(canvas);
            return;
        }
        int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        m1803d(canvas);
        float f4 = this.f2734j;
        canvas.drawRoundRect(rectF, f4, f4, paint2);
        canvas.restoreToCount(saveLayer2);
        if (this.f2735k > 0.0f) {
            float f5 = this.f2734j;
            canvas.drawRoundRect(rectF, f5, f5, paint);
        }
    }

    @Override // p082l.C1151y, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f2737m = 0;
        super.setImageBitmap(bitmap);
    }

    public void setSolidFill(int i) {
        this.f2737m = 1;
        this.f2738n = i;
        setImageDrawable(null);
        invalidate();
    }

    public HolePunchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2730f = new Paint(1);
        this.f2731g = new Paint(1);
        this.f2732h = new Paint(1);
        this.f2733i = new RectF();
        this.f2737m = 0;
        m1804e();
    }
}
