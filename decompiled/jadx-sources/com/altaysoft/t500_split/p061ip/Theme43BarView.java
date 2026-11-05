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
public final class Theme43BarView extends View {

    /* renamed from: f */
    public final Paint f2831f;

    /* renamed from: g */
    public final RectF f2832g;

    /* renamed from: h */
    public int f2833h;

    /* renamed from: i */
    public int f2834i;

    /* renamed from: j */
    public int f2835j;

    /* renamed from: k */
    public int f2836k;

    /* renamed from: l */
    public int f2837l;

    /* renamed from: m */
    public int f2838m;

    /* renamed from: n */
    public int f2839n;

    /* renamed from: o */
    public int f2840o;

    /* renamed from: p */
    public boolean f2841p;

    /* renamed from: q */
    public boolean f2842q;

    /* renamed from: r */
    public boolean f2843r;

    /* renamed from: s */
    public float f2844s;

    public Theme43BarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2831f = new Paint(1);
        this.f2832g = new RectF();
        this.f2834i = 100;
        this.f2835j = -18328;
        this.f2844s = Float.MAX_VALUE;
        setWillNotDraw(false);
        if (isInEditMode()) {
            this.f2833h = 55;
        }
    }

    /* renamed from: a */
    public final void m1821a() {
        m1822b();
        if (this.f2841p) {
            return;
        }
        int id = getId();
        if (id == R.id.theme_43_coolant_bar) {
            m1823c(-15054728, -8726273);
        } else if (id != R.id.theme_43_inst_fuel_bar) {
            m1823c(-9816040, -18328);
        } else {
            m1823c(-13998016, -7284568);
            this.f2844s = getResources().getDisplayMetrics().density * 3.0f;
        }
    }

    /* renamed from: b */
    public final void m1822b() {
        int id = getId();
        if (id == R.id.overlay_inst_fuel_bar || id == R.id.overlay_avg_fuel_bar) {
            this.f2843r = true;
            if (this.f2844s == Float.MAX_VALUE) {
                this.f2844s = getResources().getDimension(R.dimen.overlay_inst_fuel_bar_frame_stroke_max);
            }
        }
    }

    /* renamed from: c */
    public final void m1823c(int i, int i2) {
        this.f2836k = i;
        this.f2837l = i2;
        this.f2841p = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1821a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        m1822b();
        m1821a();
        RectF rectF = this.f2832g;
        float f2 = width;
        rectF.set(0.0f, 0.0f, f2, height);
        float f3 = (this.f2833h / this.f2834i) * f2;
        boolean z2 = this.f2842q;
        Paint paint = this.f2831f;
        if (z2 || this.f2843r) {
            AbstractC1539g1.m4185G(canvas, rectF, f3, this.f2836k, this.f2837l, this.f2835j, this.f2844s, this.f2838m, this.f2839n, this.f2840o, this.f2843r, paint);
        } else {
            AbstractC1539g1.m4185G(canvas, rectF, f3, this.f2836k, this.f2837l, this.f2835j, this.f2844s, -14016496, -12438764, -9546720, false, paint);
        }
    }

    public void setBarProgressColor(int i) {
        if (i == this.f2835j) {
            return;
        }
        this.f2835j = i;
        invalidate();
    }

    public void setMax(int i) {
        this.f2834i = Math.max(1, i);
        invalidate();
    }

    public void setMaxFrameStroke(float f2) {
        if (f2 <= 0.0f) {
            this.f2844s = Float.MAX_VALUE;
        } else {
            this.f2844s = f2;
        }
        invalidate();
    }

    public void setOverlayBarStyle(boolean z2) {
        this.f2843r = z2;
        invalidate();
    }

    public void setProgress(int i) {
        int max = Math.max(0, Math.min(this.f2834i, i));
        if (max == this.f2833h) {
            return;
        }
        this.f2833h = max;
        invalidate();
    }
}
