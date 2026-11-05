package p109u0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: u0.d */
/* loaded from: classes.dex */
public final class C1528d extends Drawable {

    /* renamed from: a */
    public final Paint f8173a;

    /* renamed from: b */
    public final Path f8174b;

    /* renamed from: c */
    public final Path f8175c;

    /* renamed from: d */
    public final RectF f8176d;

    /* renamed from: e */
    public float f8177e;

    public C1528d(int i) {
        Paint paint = new Paint(1);
        this.f8173a = paint;
        this.f8174b = new Path();
        this.f8175c = new Path();
        this.f8176d = new RectF();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public final void m4166a(Rect rect) {
        Path path = this.f8174b;
        path.reset();
        Path path2 = this.f8175c;
        path2.reset();
        float width = rect.width();
        float height = rect.height();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float min = Math.min(this.f8177e, Math.min(0.5f * width, height));
        Path.Direction direction = Path.Direction.CW;
        path.addRect(0.0f, 0.0f, width, height, direction);
        RectF rectF = this.f8176d;
        rectF.set(0.0f, (-Math.max(height, 1.0f)) * 20.0f, width, min);
        path2.addRoundRect(rectF, min, min, direction);
        path.op(path2, Path.Op.DIFFERENCE);
    }

    /* renamed from: b */
    public final void m4167b(float f2) {
        if (Math.abs(this.f8177e - f2) < 0.1f) {
            return;
        }
        this.f8177e = Math.max(0.0f, f2);
        m4166a(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Path path = this.f8174b;
        if (path.isEmpty()) {
            m4166a(bounds);
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawPath(path, this.f8173a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4166a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8173a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8173a.setColorFilter(colorFilter);
    }
}
