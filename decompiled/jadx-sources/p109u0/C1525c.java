package p109u0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: u0.c */
/* loaded from: classes.dex */
public final class C1525c extends Drawable {

    /* renamed from: a */
    public final Paint f8157a;

    /* renamed from: b */
    public final Paint f8158b;

    /* renamed from: c */
    public final Paint f8159c;

    /* renamed from: d */
    public final Paint f8160d;

    /* renamed from: e */
    public final ArrayList f8161e;

    /* renamed from: f */
    public final ArrayList f8162f;

    /* renamed from: g */
    public final ArrayList f8163g;

    /* renamed from: h */
    public final ArrayList f8164h;

    /* renamed from: i */
    public final RectF f8165i;

    /* renamed from: j */
    public final RectF f8166j;

    /* renamed from: k */
    public Drawable f8167k;

    public C1525c(int i) {
        Paint paint = new Paint(1);
        this.f8157a = paint;
        Paint paint2 = new Paint(1);
        this.f8158b = paint2;
        Paint paint3 = new Paint(1);
        this.f8159c = paint3;
        Paint paint4 = new Paint(1);
        this.f8160d = paint4;
        this.f8161e = new ArrayList();
        this.f8162f = new ArrayList();
        this.f8163g = new ArrayList();
        this.f8164h = new ArrayList();
        this.f8165i = new RectF();
        this.f8166j = new RectF();
        new RectF();
        new Path();
        paint.setColor(i);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-2008038409);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(-16777216);
    }

    /* renamed from: a */
    public final void m4159a(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (f4 <= f2 || f5 <= f3) {
            return;
        }
        this.f8161e.add(new C1519a(f2, f3, f4, f5, f6, f7));
        invalidateSelf();
    }

    /* renamed from: b */
    public final void m4160b() {
        this.f8161e.clear();
        this.f8163g.clear();
        this.f8164h.clear();
        this.f8162f.clear();
        invalidateSelf();
    }

    /* renamed from: c */
    public final boolean m4161c() {
        return this.f8167k != null;
    }

    /* renamed from: d */
    public final void m4162d(int i) {
        this.f8167k = null;
        this.f8157a.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        RectF rectF;
        Paint paint2;
        RectF rectF2 = this.f8165i;
        rectF2.set(getBounds());
        int saveLayer = canvas.saveLayer(rectF2, null);
        if (this.f8167k != null) {
            int round = Math.round(rectF2.width());
            int round2 = Math.round(rectF2.height());
            if (round > 0 && round2 > 0) {
                int intrinsicWidth = this.f8167k.getIntrinsicWidth();
                int intrinsicHeight = this.f8167k.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    this.f8167k.setBounds(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
                    this.f8167k.draw(canvas);
                } else {
                    float f2 = intrinsicWidth;
                    float f3 = intrinsicHeight;
                    float max = Math.max(round / f2, round2 / f3);
                    int round3 = Math.round(f2 * max);
                    int round4 = Math.round(f3 * max);
                    int round5 = Math.round(((round - round3) / 2.0f) + rectF2.left);
                    int round6 = Math.round(((round2 - round4) / 2.0f) + rectF2.top);
                    this.f8167k.setBounds(round5, round6, round3 + round5, round4 + round6);
                    this.f8167k.draw(canvas);
                }
            }
        } else {
            canvas.drawRect(rectF2, this.f8157a);
        }
        ArrayList arrayList = this.f8161e;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            paint = this.f8158b;
            if (!hasNext) {
                break;
            }
            C1519a c1519a = (C1519a) it.next();
            RectF rectF3 = c1519a.f8044a;
            float f4 = c1519a.f8045b;
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        ArrayList arrayList2 = this.f8163g;
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList3 = this.f8164h;
        Iterator it3 = arrayList3.iterator();
        while (true) {
            boolean hasNext2 = it3.hasNext();
            rectF = this.f8166j;
            if (!hasNext2) {
                break;
            }
            C1522b c1522b = (C1522b) it3.next();
            float f5 = c1522b.f8134a;
            float f6 = c1522b.f8136c;
            float f7 = c1522b.f8135b;
            rectF.set(f5 - f6, f7 - f6, f5 + f6, f7 + f6);
            canvas.drawArc(rectF, 180.0f, 180.0f, true, paint);
        }
        canvas.restoreToCount(saveLayer);
        ArrayList arrayList4 = this.f8162f;
        if (!arrayList4.isEmpty()) {
            int save = canvas.save();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                RectF rectF4 = (RectF) it4.next();
                float min = Math.min(rectF4.width(), rectF4.height()) * 0.5f;
                canvas.drawRoundRect(rectF4, min, min, this.f8160d);
            }
            canvas.restoreToCount(save);
        }
        Iterator it5 = arrayList.iterator();
        while (true) {
            boolean hasNext3 = it5.hasNext();
            paint2 = this.f8159c;
            if (!hasNext3) {
                break;
            }
            C1519a c1519a2 = (C1519a) it5.next();
            RectF rectF5 = c1519a2.f8044a;
            float f8 = c1519a2.f8045b;
            if (f8 > 0.0f) {
                float f9 = c1519a2.f8046c;
                if (f9 > 0.0f) {
                    paint2.setStrokeWidth(f9);
                    canvas.drawRoundRect(rectF5, f8, f8, paint2);
                }
            }
        }
        Iterator it6 = arrayList2.iterator();
        if (it6.hasNext()) {
            it6.next().getClass();
            throw new ClassCastException();
        }
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            C1522b c1522b2 = (C1522b) it7.next();
            float f10 = c1522b2.f8134a;
            float f11 = c1522b2.f8136c;
            float f12 = c1522b2.f8135b;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            if (c1522b2.f8137d > 0.0f) {
                float f13 = c1522b2.f8138e;
                if (f13 > 0.0f) {
                    paint2.setStrokeWidth(f13);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m4163e(Drawable drawable) {
        this.f8167k = drawable != null ? drawable.mutate() : null;
        invalidateSelf();
    }

    /* renamed from: f */
    public final void m4164f(int i) {
        this.f8159c.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8157a.setAlpha(i);
        this.f8159c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8157a.setColorFilter(colorFilter);
        this.f8159c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
