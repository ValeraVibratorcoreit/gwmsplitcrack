package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.altaysoft.t500_split.R;
import p109u0.AbstractC1539g1;

/* loaded from: classes.dex */
public final class Theme42SegmentedBarView extends View {

    /* renamed from: f */
    public final Paint f2801f;

    /* renamed from: g */
    public final RectF f2802g;

    /* renamed from: h */
    public int f2803h;

    /* renamed from: i */
    public int f2804i;

    /* renamed from: j */
    public int f2805j;

    /* renamed from: k */
    public int f2806k;

    /* renamed from: l */
    public int f2807l;

    /* renamed from: m */
    public boolean f2808m;

    public Theme42SegmentedBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2801f = new Paint(1);
        this.f2802g = new RectF();
        this.f2804i = 100;
        this.f2805j = -2838432;
        setWillNotDraw(false);
        if (isInEditMode()) {
            this.f2803h = 55;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2808m) {
            return;
        }
        if (getId() == R.id.theme_42_coolant_bar) {
            this.f2806k = -9406336;
            this.f2807l = -4669240;
            this.f2808m = true;
            invalidate();
            return;
        }
        this.f2806k = -7704536;
        this.f2807l = -2838432;
        this.f2808m = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        if (!this.f2808m) {
            if (getId() == R.id.theme_42_coolant_bar) {
                this.f2806k = -9406336;
                this.f2807l = -4669240;
                this.f2808m = true;
                invalidate();
            } else {
                this.f2806k = -7704536;
                this.f2807l = -2838432;
                this.f2808m = true;
                invalidate();
            }
        }
        RectF rectF = this.f2802g;
        float f2 = width;
        rectF.set(0.0f, 0.0f, f2, height);
        AbstractC1539g1.m4185G(canvas, rectF, (this.f2803h / this.f2804i) * f2, this.f2806k, this.f2807l, this.f2805j, Float.MAX_VALUE, -14016496, -12438764, -9546720, false, this.f2801f);
    }

    public void setBarProgressColor(int i) {
        if (i == this.f2805j) {
            return;
        }
        this.f2805j = i;
        invalidate();
    }

    public void setMax(int i) {
        this.f2804i = Math.max(1, i);
        invalidate();
    }

    public void setProgress(int i) {
        int max = Math.max(0, Math.min(this.f2804i, i));
        if (max == this.f2803h) {
            return;
        }
        this.f2803h = max;
        invalidate();
    }
}
