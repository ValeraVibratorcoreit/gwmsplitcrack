package p109u0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: u0.a1 */
/* loaded from: classes.dex */
public final class C1521a1 extends Drawable {

    /* renamed from: a */
    public final Paint f8126a;

    /* renamed from: b */
    public final Paint f8127b;

    /* renamed from: c */
    public final RectF f8128c;

    /* renamed from: d */
    public final RectF f8129d;

    /* renamed from: e */
    public final RectF f8130e;

    /* renamed from: f */
    public float f8131f;

    /* renamed from: g */
    public float f8132g;

    /* renamed from: h */
    public boolean f8133h;

    public C1521a1() {
        Paint paint = new Paint(1);
        this.f8126a = paint;
        Paint paint2 = new Paint(1);
        this.f8127b = paint2;
        this.f8128c = new RectF();
        this.f8129d = new RectF();
        this.f8130e = new RectF();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-2011064589);
        paint2.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final void m4155a(RectF rectF, float f2, float f3, int i, float f4, float f5) {
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            this.f8133h = false;
            return;
        }
        this.f8128c.set(rectF);
        this.f8131f = f2;
        this.f8132g = f3;
        Paint paint = this.f8127b;
        paint.setColor(i);
        paint.setStrokeWidth(f3);
        this.f8126a.setColor(-16777216);
        float f6 = rectF.top - f5;
        float f7 = f6 + 90.0f;
        RectF rectF2 = this.f8129d;
        float f8 = rectF.left - f4;
        rectF2.set(f8, f6, f8 + 90.0f, f7);
        RectF rectF3 = this.f8130e;
        float f9 = rectF.right + f4;
        rectF3.set(f9 - 90.0f, f6, f9, f7);
        this.f8133h = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f8133h) {
            RectF rectF = this.f8129d;
            float min = Math.min(rectF.width(), rectF.height()) * 0.5f;
            Paint paint = this.f8126a;
            canvas.drawRoundRect(rectF, min, min, paint);
            RectF rectF2 = this.f8130e;
            float min2 = Math.min(rectF2.width(), rectF2.height()) * 0.5f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            float f2 = this.f8131f;
            if (f2 <= 0.0f || this.f8132g <= 0.0f) {
                return;
            }
            canvas.drawRoundRect(this.f8128c, f2, f2, this.f8127b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8126a.setAlpha(i);
        this.f8127b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8126a.setColorFilter(colorFilter);
        this.f8127b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
