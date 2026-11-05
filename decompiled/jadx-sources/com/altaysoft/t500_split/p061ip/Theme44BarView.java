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
public final class Theme44BarView extends View {

    /* renamed from: f */
    public final Paint f2891f;

    /* renamed from: g */
    public final RectF f2892g;

    /* renamed from: h */
    public int f2893h;

    /* renamed from: i */
    public int f2894i;

    /* renamed from: j */
    public int f2895j;

    /* renamed from: k */
    public int f2896k;

    /* renamed from: l */
    public int f2897l;

    /* renamed from: m */
    public int f2898m;

    /* renamed from: n */
    public int f2899n;

    /* renamed from: o */
    public int f2900o;

    /* renamed from: p */
    public boolean f2901p;

    /* renamed from: q */
    public boolean f2902q;

    /* renamed from: r */
    public boolean f2903r;

    /* renamed from: s */
    public float f2904s;

    public Theme44BarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2891f = new Paint(1);
        this.f2892g = new RectF();
        this.f2894i = 100;
        this.f2895j = -3092272;
        this.f2904s = Float.MAX_VALUE;
        setWillNotDraw(false);
        if (isInEditMode()) {
            this.f2893h = 55;
        }
    }

    /* renamed from: a */
    public final void m1828a() {
        int id = getId();
        if (id == R.id.overlay_inst_fuel_bar || id == R.id.overlay_avg_fuel_bar) {
            this.f2903r = true;
            if (this.f2904s == Float.MAX_VALUE) {
                this.f2904s = getResources().getDimension(R.dimen.overlay_inst_fuel_bar_frame_stroke_max);
            }
        }
        if (this.f2901p && this.f2902q) {
            return;
        }
        int id2 = getId();
        if (id2 == R.id.theme_44_coolant_bar || id2 == R.id.theme_46_coolant_bar) {
            if (!this.f2901p) {
                this.f2896k = -15460320;
                this.f2897l = -4667176;
                this.f2901p = true;
                invalidate();
            }
            if (this.f2902q) {
                return;
            }
            this.f2898m = -15723496;
            this.f2899n = -14670808;
            this.f2900o = -12564400;
            this.f2902q = true;
            invalidate();
            return;
        }
        if (id2 != R.id.theme_44_inst_fuel_bar) {
            if (!this.f2901p) {
                this.f2896k = -15461356;
                this.f2897l = -3092272;
                this.f2901p = true;
                invalidate();
            }
            if (this.f2902q) {
                return;
            }
            this.f2898m = -15461356;
            this.f2899n = -14408668;
            this.f2900o = -12040120;
            this.f2902q = true;
            invalidate();
            return;
        }
        if (!this.f2901p) {
            this.f2896k = -14803426;
            this.f2897l = -6776680;
            this.f2901p = true;
            invalidate();
            this.f2904s = getResources().getDisplayMetrics().density * 3.0f;
        }
        if (this.f2902q) {
            return;
        }
        this.f2898m = -15592942;
        this.f2899n = -14540254;
        this.f2900o = -12040120;
        this.f2902q = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1828a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        m1828a();
        RectF rectF = this.f2892g;
        float f2 = width;
        rectF.set(0.0f, 0.0f, f2, height);
        AbstractC1539g1.m4185G(canvas, rectF, (this.f2893h / this.f2894i) * f2, this.f2896k, AbstractC1539g1.m4190L(this.f2895j) ? this.f2897l : this.f2895j, this.f2895j, this.f2904s, this.f2898m, this.f2899n, this.f2900o, this.f2903r, this.f2891f);
    }

    public void setBarProgressColor(int i) {
        if (i == this.f2895j) {
            return;
        }
        this.f2895j = i;
        invalidate();
    }

    public void setMax(int i) {
        this.f2894i = Math.max(1, i);
        invalidate();
    }

    public void setMaxFrameStroke(float f2) {
        if (f2 <= 0.0f) {
            this.f2904s = Float.MAX_VALUE;
        } else {
            this.f2904s = f2;
        }
        invalidate();
    }

    public void setOverlayBarStyle(boolean z2) {
        this.f2903r = z2;
        invalidate();
    }

    public void setProgress(int i) {
        int max = Math.max(0, Math.min(this.f2894i, i));
        if (max == this.f2893h) {
            return;
        }
        this.f2893h = max;
        invalidate();
    }
}
