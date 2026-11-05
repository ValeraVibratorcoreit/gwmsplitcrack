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
public final class Theme45BarView extends View {

    /* renamed from: f */
    public final Paint f2905f;

    /* renamed from: g */
    public final RectF f2906g;

    /* renamed from: h */
    public int f2907h;

    /* renamed from: i */
    public int f2908i;

    /* renamed from: j */
    public int f2909j;

    /* renamed from: k */
    public int f2910k;

    /* renamed from: l */
    public int f2911l;

    /* renamed from: m */
    public int f2912m;

    /* renamed from: n */
    public int f2913n;

    /* renamed from: o */
    public int f2914o;

    /* renamed from: p */
    public boolean f2915p;

    /* renamed from: q */
    public boolean f2916q;

    /* renamed from: r */
    public boolean f2917r;

    /* renamed from: s */
    public float f2918s;

    public Theme45BarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2905f = new Paint(1);
        this.f2906g = new RectF();
        this.f2908i = 100;
        this.f2909j = -3092272;
        this.f2918s = Float.MAX_VALUE;
        setWillNotDraw(false);
        if (isInEditMode()) {
            this.f2907h = 55;
        }
    }

    /* renamed from: a */
    public final void m1829a() {
        int id = getId();
        if (id == R.id.overlay_inst_fuel_bar || id == R.id.overlay_avg_fuel_bar) {
            this.f2917r = true;
            if (this.f2918s == Float.MAX_VALUE) {
                this.f2918s = getResources().getDimension(R.dimen.overlay_inst_fuel_bar_frame_stroke_max);
            }
        }
        if (this.f2915p && this.f2916q) {
            return;
        }
        int id2 = getId();
        if (id2 == R.id.theme_45_coolant_bar) {
            if (!this.f2915p) {
                this.f2910k = -15460320;
                this.f2911l = -4667176;
                this.f2915p = true;
                invalidate();
            }
            if (this.f2916q) {
                return;
            }
            this.f2912m = -15723496;
            this.f2913n = -14670808;
            this.f2914o = -12564400;
            this.f2916q = true;
            invalidate();
            return;
        }
        if (id2 != R.id.theme_45_inst_fuel_bar) {
            if (!this.f2915p) {
                this.f2910k = -15461356;
                this.f2911l = -3092272;
                this.f2915p = true;
                invalidate();
            }
            if (this.f2916q) {
                return;
            }
            this.f2912m = -15461356;
            this.f2913n = -14408668;
            this.f2914o = -12040120;
            this.f2916q = true;
            invalidate();
            return;
        }
        if (!this.f2915p) {
            this.f2910k = -14803426;
            this.f2911l = -6776680;
            this.f2915p = true;
            invalidate();
            this.f2918s = getResources().getDisplayMetrics().density * 3.0f;
        }
        if (this.f2916q) {
            return;
        }
        this.f2912m = -15592942;
        this.f2913n = -14540254;
        this.f2914o = -12040120;
        this.f2916q = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1829a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        m1829a();
        RectF rectF = this.f2906g;
        float f2 = width;
        rectF.set(0.0f, 0.0f, f2, height);
        AbstractC1539g1.m4185G(canvas, rectF, (this.f2907h / this.f2908i) * f2, this.f2910k, AbstractC1539g1.m4190L(this.f2909j) ? this.f2911l : this.f2909j, this.f2909j, this.f2918s, this.f2912m, this.f2913n, this.f2914o, this.f2917r, this.f2905f);
    }

    public void setBarProgressColor(int i) {
        if (i == this.f2909j) {
            return;
        }
        this.f2909j = i;
        invalidate();
    }

    public void setMax(int i) {
        this.f2908i = Math.max(1, i);
        invalidate();
    }

    public void setMaxFrameStroke(float f2) {
        if (f2 <= 0.0f) {
            this.f2918s = Float.MAX_VALUE;
        } else {
            this.f2918s = f2;
        }
        invalidate();
    }

    public void setOverlayBarStyle(boolean z2) {
        this.f2917r = z2;
        invalidate();
    }

    public void setProgress(int i) {
        int max = Math.max(0, Math.min(this.f2908i, i));
        if (max == this.f2907h) {
            return;
        }
        this.f2907h = max;
        invalidate();
    }
}
