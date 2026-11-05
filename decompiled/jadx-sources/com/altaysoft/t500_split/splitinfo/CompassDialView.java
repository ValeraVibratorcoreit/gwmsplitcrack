package com.altaysoft.t500_split.splitinfo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class CompassDialView extends View {

    /* renamed from: f */
    public final Paint f3132f;

    /* renamed from: g */
    public final Paint f3133g;

    /* renamed from: h */
    public final Paint f3134h;

    /* renamed from: i */
    public Bitmap f3135i;

    /* renamed from: j */
    public Bitmap f3136j;

    /* renamed from: k */
    public Bitmap f3137k;

    /* renamed from: l */
    public float f3138l;

    /* renamed from: m */
    public boolean f3139m;

    /* renamed from: n */
    public int f3140n;

    /* renamed from: o */
    public float f3141o;

    public CompassDialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3132f = new Paint(3);
        Paint paint = new Paint(1);
        this.f3133g = paint;
        Paint paint2 = new Paint(1);
        this.f3134h = paint2;
        this.f3140n = 330;
        this.f3141o = 1.0f;
        Typeface create = Typeface.create("sans-serif-medium", 1);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(create);
        paint.setStyle(Paint.Style.FILL);
        paint2.set(paint);
        paint2.setColor(-436207616);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        m1954a();
    }

    /* renamed from: a */
    public final void m1954a() {
        float f2 = this.f3140n * this.f3141o * 0.12f;
        float max = Math.max(2.0f, 0.14f * f2);
        this.f3133g.setTextSize(f2);
        Paint paint = this.f3134h;
        paint.setTextSize(f2);
        paint.setStrokeWidth(max);
    }

    /* renamed from: b */
    public final void m1955b(Canvas canvas, Bitmap bitmap, float f2, float f3) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(bitmap, f2 - (bitmap.getWidth() * 0.5f), f3 - (bitmap.getHeight() * 0.5f), this.f3132f);
    }

    /* renamed from: c */
    public final void m1956c(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        this.f3135i = bitmap;
        this.f3136j = bitmap2;
        this.f3137k = bitmap3;
        int max = bitmap != null ? Math.max(0, bitmap.getWidth()) : 0;
        Bitmap bitmap4 = this.f3136j;
        if (bitmap4 != null) {
            max = Math.max(max, bitmap4.getWidth());
        }
        Bitmap bitmap5 = this.f3137k;
        if (bitmap5 != null) {
            max = Math.max(max, bitmap5.getWidth());
        }
        if (max <= 0) {
            max = 330;
        }
        this.f3140n = max;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() * 0.5f;
        float height = getHeight() * 0.5f;
        canvas.save();
        float f2 = this.f3141o;
        canvas.scale(f2, f2, width, height);
        m1955b(canvas, this.f3135i, width, height);
        canvas.save();
        canvas.translate(width, height);
        if (this.f3139m) {
            canvas.rotate(-this.f3138l);
        }
        canvas.translate(-width, -height);
        m1955b(canvas, this.f3136j, width, height);
        canvas.restore();
        m1955b(canvas, this.f3137k, width, height);
        canvas.restore();
        String format = this.f3139m ? String.format("%s  %.0f°", new String[]{"N", "NE", "E", "SE", "S", "SW", "W", "NW"}[((int) Math.floor(((((this.f3138l % 360.0f) + 360.0f) % 360.0f) + 22.5f) / 45.0f)) % 8], Float.valueOf(((this.f3138l % 360.0f) + 360.0f) % 360.0f)) : "—";
        Paint paint = this.f3133g;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f3 = height - ((fontMetrics.ascent + fontMetrics.descent) * 0.5f);
        canvas.drawText(format, width, f3, this.f3134h);
        canvas.drawText(format, width, f3, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.f3140n;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int max = mode == 0 ? i3 : Math.max(0, size - paddingRight);
        int max2 = mode2 == 0 ? i3 : Math.max(0, size2 - paddingBottom);
        if (max <= 0) {
            max = i3;
        }
        if (max2 <= 0) {
            max2 = i3;
        }
        int min = Math.min(i3, Math.min(max, max2));
        if (min < 1) {
            min = i3;
        }
        this.f3141o = i3 > 0 ? min / i3 : 1.0f;
        m1954a();
        setMeasuredDimension(paddingRight + min, min + paddingBottom);
    }

    public void setHeading(float f2) {
        this.f3138l = f2;
        this.f3139m = true;
        invalidate();
    }
}
