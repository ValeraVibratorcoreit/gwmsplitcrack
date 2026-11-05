package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p001A0.RunnableC0024r;
import p109u0.AbstractC1539g1;

/* loaded from: classes.dex */
public final class HolePunchLayout extends ConstraintLayout {

    /* renamed from: A */
    public final Paint f2741A;

    /* renamed from: B */
    public final Paint f2742B;

    /* renamed from: C */
    public final RectF f2743C;

    /* renamed from: D */
    public final RectF f2744D;

    /* renamed from: E */
    public float f2745E;

    /* renamed from: F */
    public float f2746F;

    /* renamed from: G */
    public float f2747G;

    /* renamed from: H */
    public float f2748H;

    /* renamed from: I */
    public boolean f2749I;

    /* renamed from: J */
    public boolean f2750J;

    /* renamed from: K */
    public boolean f2751K;

    /* renamed from: L */
    public boolean f2752L;

    /* renamed from: x */
    public final Paint f2753x;

    /* renamed from: y */
    public final Paint f2754y;

    /* renamed from: z */
    public final Paint f2755z;

    public HolePunchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f2753x = paint;
        Paint paint2 = new Paint(1);
        this.f2754y = paint2;
        Paint paint3 = new Paint(1);
        this.f2755z = paint3;
        Paint paint4 = new Paint(1);
        this.f2741A = paint4;
        Paint paint5 = new Paint(1);
        this.f2742B = paint5;
        this.f2743C = new RectF();
        this.f2744D = new RectF();
        this.f2750J = true;
        this.f2751K = true;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-15722462);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-867187721);
        paint4.setStyle(style);
        paint4.setColor(-1712785153);
        paint5.setStyle(style);
        paint5.setColor(-1728053248);
        setWillNotDraw(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z2 = this.f2750J;
        RectF rectF = this.f2743C;
        if (z2) {
            float f2 = this.f2745E;
            if (f2 > 0.0f && this.f2749I) {
                RectF rectF2 = this.f2744D;
                if (f2 >= 1.0f) {
                    rectF2.set(rectF);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY();
                    if (f2 <= 0.0f) {
                        rectF2.set(centerX, centerY, centerX, centerY);
                    } else {
                        float width = rectF.width() * 0.5f * f2;
                        float height = rectF.height() * 0.5f * f2;
                        rectF2.set(centerX - width, centerY - height, centerX + width, centerY + height);
                    }
                }
                float min = Math.min(1.0f, this.f2745E) * this.f2746F;
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                super.dispatchDraw(canvas);
                if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
                    canvas.drawRoundRect(rectF2, min, min, this.f2753x);
                }
                canvas.restoreToCount(saveLayer);
                if (rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
                    return;
                }
                float f3 = this.f2745E;
                if (f3 <= 0.001f) {
                    return;
                }
                int round = Math.round(255.0f * f3);
                float f4 = this.f2748H * f3;
                float f5 = ((f3 * 0.65f) + 0.35f) * this.f2747G;
                Paint paint = this.f2742B;
                paint.setStrokeWidth(f5 + f4);
                paint.setAlpha(Math.min(round, 160));
                RectF rectF3 = new RectF(rectF2);
                rectF3.offset(f4, f4);
                canvas.drawRoundRect(rectF3, min, min, paint);
                Paint paint2 = this.f2741A;
                paint2.setStrokeWidth(f5);
                paint2.setAlpha(Math.min(round, 200));
                RectF rectF4 = new RectF(rectF2);
                float f6 = (-f4) * 0.6f;
                rectF4.offset(f6, f6);
                canvas.drawRoundRect(rectF4, min, min, paint2);
                Paint paint3 = this.f2755z;
                paint3.setStrokeWidth(f5);
                paint3.setAlpha(round);
                canvas.drawRoundRect(rectF2, min, min, paint3);
                return;
            }
        }
        if (z2 && this.f2752L && this.f2749I) {
            float f7 = this.f2746F;
            canvas.drawRoundRect(rectF, f7, f7, this.f2754y);
        }
        super.dispatchDraw(canvas);
    }

    public float getRightQnxHoleOpenProgress() {
        return this.f2745E;
    }

    /* renamed from: l */
    public final void m1806l() {
        setLayerType(0, null);
        destroyDrawingCache();
        invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
        post(new RunnableC0024r(27, this));
    }

    /* renamed from: m */
    public final boolean m1807m() {
        return this.f2745E > 0.01f;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        boolean z2 = false;
        if (width <= 0 || height <= 0) {
            this.f2749I = false;
            return;
        }
        Rect m4239u = AbstractC1539g1.m4239u();
        m4239u.right += 30;
        RectF rectF = this.f2743C;
        rectF.set(AbstractC1539g1.m4208b0(m4239u, width, height));
        rectF.left = Math.max(0.0f, rectF.left);
        rectF.top = Math.max(0.0f, rectF.top);
        rectF.right = Math.min(width, rectF.right);
        rectF.bottom = Math.min(height, rectF.bottom);
        float f2 = getResources().getDisplayMetrics().density;
        this.f2746F = 14.0f * f2;
        this.f2747G = Math.max(1.5f, f2 * 1.5f);
        this.f2748H = Math.max(1.0f, f2 * 1.25f);
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            z2 = true;
        }
        this.f2749I = z2;
    }

    public void setClosedHoleCoverAllowed(boolean z2) {
        this.f2751K = z2;
        if (z2 || !this.f2752L) {
            return;
        }
        this.f2752L = false;
        invalidate();
    }

    public void setQnxHoleEnabled(boolean z2) {
        if (this.f2750J == z2) {
            return;
        }
        this.f2750J = z2;
        if (!z2) {
            this.f2752L = false;
            this.f2745E = 0.0f;
            m1806l();
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0021, code lost:
    
        if (r4 > 0.999f) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setRightQnxHoleOpenProgress(float f2) {
        float f3;
        if (!this.f2750J) {
            return;
        }
        if (f2 >= 0.0f) {
            if (f2 <= 1.0f) {
                if (f2 >= 0.001f) {
                }
            }
            f2 = 1.0f;
            f3 = this.f2745E;
            if (f3 != f2) {
                return;
            }
            boolean z2 = f3 > 0.0f;
            this.f2745E = f2;
            if (f2 > 0.0f) {
                this.f2752L = false;
            } else if (z2) {
                this.f2752L = this.f2751K;
                m1806l();
            }
            invalidate();
            return;
        }
        f2 = 0.0f;
        f3 = this.f2745E;
        if (f3 != f2) {
        }
    }
}
