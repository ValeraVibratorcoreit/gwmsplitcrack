package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Iterator;
import p109u0.AbstractC1539g1;
import p109u0.C1542h1;
import p109u0.InterfaceC1545i1;

/* loaded from: classes.dex */
public final class Theme42SpeedArcView extends View {

    /* renamed from: A */
    public final ArrayList f2809A;

    /* renamed from: f */
    public final Path f2810f;

    /* renamed from: g */
    public final RectF f2811g;

    /* renamed from: h */
    public final RectF f2812h;

    /* renamed from: i */
    public final Paint f2813i;

    /* renamed from: j */
    public final Paint f2814j;

    /* renamed from: k */
    public final Paint f2815k;

    /* renamed from: l */
    public float f2816l;

    /* renamed from: m */
    public float f2817m;

    /* renamed from: n */
    public int f2818n;

    /* renamed from: o */
    public int f2819o;

    /* renamed from: p */
    public boolean f2820p;

    /* renamed from: q */
    public float f2821q;

    /* renamed from: r */
    public float f2822r;

    /* renamed from: s */
    public float f2823s;

    /* renamed from: t */
    public float f2824t;

    /* renamed from: u */
    public float f2825u;

    /* renamed from: v */
    public float f2826v;

    /* renamed from: w */
    public float f2827w;

    /* renamed from: x */
    public C1542h1 f2828x;

    /* renamed from: y */
    public boolean f2829y;

    /* renamed from: z */
    public boolean f2830z;

    public Theme42SpeedArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2810f = new Path();
        this.f2811g = new RectF();
        this.f2812h = new RectF();
        this.f2813i = new Paint(1);
        this.f2814j = new Paint(1);
        this.f2815k = new Paint(1);
        this.f2825u = -1.0f;
        this.f2826v = -1.0f;
        this.f2809A = new ArrayList();
        if (isInEditMode()) {
            this.f2816l = 125.0f;
            this.f2820p = true;
            this.f2817m = 90.0f;
            this.f2819o = -16711936;
            this.f2825u = 200.0f;
            this.f2826v = 220.0f;
        }
        float f2 = this.f2816l;
        isInEditMode();
        this.f2818n = AbstractC1539g1.m4234p(Math.max(0.0f, Math.min(1.0f, f2 / 220.0f)), -7704536, -2838432);
    }

    /* renamed from: a */
    public final void m1818a(InterfaceC1545i1 interfaceC1545i1) {
        if (interfaceC1545i1 != null) {
            ArrayList arrayList = this.f2809A;
            if (arrayList.contains(interfaceC1545i1)) {
                return;
            }
            arrayList.add(interfaceC1545i1);
            if (this.f2829y) {
                interfaceC1545i1.mo3722a(this.f2828x, this.f2822r, this.f2827w);
            }
        }
    }

    /* renamed from: b */
    public final void m1819b(int i, int i2) {
        this.f2829y = false;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f2822r = getResources().getDimension(R.dimen.theme_42_spd_stroke_band);
        this.f2823s = getResources().getDimension(R.dimen.theme_42_cruise_marker_radius);
        this.f2824t = getResources().getDimension(R.dimen.theme_42_threshold_marker_radius);
        this.f2827w = getResources().getDimension(R.dimen.theme_42_spd_tick_pad);
        float f2 = i;
        float f3 = i2;
        this.f2828x = C1542h1.m4284a(f2, f3, getResources().getDimension(R.dimen.theme_42_top_panel_margin_top) + getResources().getDimension(R.dimen.theme_42_top_panel_height), getResources().getDimension(R.dimen.theme_42_spd_apex_below_top_px), getResources().getDimension(R.dimen.theme_42_spd_lift_px), getResources().getDimension(R.dimen.theme_42_bottom_panel_height), getResources().getDimension(R.dimen.theme_42_arc_vertical_lift_px), this.f2822r, this.f2827w, getResources().getDimension(R.dimen.theme_42_rpm_gap_from_spd), getResources().getDimension(R.dimen.theme_42_qnx_clearance_px), getResources().getDimension(R.dimen.theme_42_spd_radius_shrink_px), this.f2821q);
        this.f2829y = true;
        Iterator it = this.f2809A.iterator();
        while (it.hasNext()) {
            ((InterfaceC1545i1) it.next()).mo3722a(this.f2828x, this.f2822r, this.f2827w);
        }
    }

    /* renamed from: c */
    public final void m1820c(boolean z2, float f2, int i) {
        float max = Math.max(0.0f, Math.min(220.0f, f2));
        if (this.f2820p == z2 && Math.abs(max - this.f2817m) <= 0.05f && this.f2819o == i) {
            return;
        }
        this.f2820p = z2;
        this.f2817m = max;
        this.f2819o = i;
        invalidate();
    }

    public C1542h1 getArcGeometry() {
        if (this.f2829y) {
            return this.f2828x;
        }
        return null;
    }

    public float getBandStrokePx() {
        return this.f2822r;
    }

    public float getQnxHoleProgress() {
        return this.f2821q;
    }

    public float getTickPadPx() {
        return this.f2827w;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1542h1 c1542h1;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        if (!this.f2829y) {
            m1819b(width, height);
        }
        if (!this.f2829y || this.f2828x == null) {
            return;
        }
        if (isInEditMode() && this.f2816l <= 0.0f) {
            this.f2816l = 125.0f;
        }
        if (isInEditMode() && !this.f2820p) {
            this.f2820p = true;
            this.f2817m = 90.0f;
            this.f2819o = -16711936;
        }
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, width, this.f2828x.f8330d + this.f2822r);
        Path path = this.f2810f;
        RectF rectF = this.f2811g;
        RectF rectF2 = this.f2812h;
        C1542h1 c1542h12 = this.f2828x;
        float f2 = c1542h12.f8327a;
        float f3 = this.f2822r;
        Paint paint = this.f2813i;
        AbstractC1539g1.m4244z(canvas, path, rectF, rectF2, f2, c1542h12.f8328b, c1542h12.f8329c, f3, c1542h12.f8332f, c1542h12.f8333g, -12437734, -10531547, true, paint);
        float f4 = this.f2816l;
        if (f4 > 0.0f) {
            float f5 = (f4 / 220.0f) * this.f2828x.f8333g;
            if (AbstractC1539g1.m4190L(this.f2818n)) {
                C1542h1 c1542h13 = this.f2828x;
                AbstractC1539g1.m4188J(canvas, path, rectF, rectF2, c1542h13.f8327a, c1542h13.f8328b, c1542h13.f8329c, this.f2822r, c1542h13.f8332f, f5, this.f2818n, paint);
            } else {
                C1542h1 c1542h14 = this.f2828x;
                AbstractC1539g1.m4244z(canvas, path, rectF, rectF2, c1542h14.f8327a, c1542h14.f8328b, c1542h14.f8329c, this.f2822r, c1542h14.f8332f, f5, -7704536, -2838432, false, paint);
            }
        }
        C1542h1 c1542h15 = this.f2828x;
        if (c1542h15 != null) {
            float f6 = this.f2825u;
            Paint paint2 = this.f2815k;
            if (f6 > 0.0f) {
                AbstractC1539g1.m4179A(canvas, paint2, this.f2824t, c1542h15.f8327a, c1542h15.f8328b, c1542h15.f8329c, c1542h15.f8332f, c1542h15.f8333g, f6, 220.0f, 2009376840);
            }
            float f7 = this.f2826v;
            if (f7 > 0.0f) {
                float f8 = this.f2824t;
                C1542h1 c1542h16 = this.f2828x;
                AbstractC1539g1.m4179A(canvas, paint2, f8, c1542h16.f8327a, c1542h16.f8328b, c1542h16.f8329c, c1542h16.f8332f, c1542h16.f8333g, f7, 220.0f, 2007519312);
            }
        }
        if (this.f2820p) {
            if (this.f2817m > 0.0f && (c1542h1 = this.f2828x) != null) {
                float radians = (float) Math.toRadians(c1542h1.f8332f + ((r1 / 220.0f) * c1542h1.f8333g));
                C1542h1 c1542h17 = this.f2828x;
                double d = radians;
                float cos = (c1542h17.f8329c * ((float) Math.cos(d))) + c1542h17.f8327a;
                C1542h1 c1542h18 = this.f2828x;
                float sin = (c1542h18.f8329c * ((float) Math.sin(d))) + c1542h18.f8328b;
                Paint paint3 = this.f2814j;
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(this.f2819o);
                canvas.drawCircle(cos, sin, this.f2823s, paint3);
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(Math.max(2.0f, this.f2823s * 0.22f));
                paint3.setColor(-872415232);
                canvas.drawCircle(cos, sin, this.f2823s, paint3);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m1819b(i, i2);
    }

    public void setChordDecorNaviActive(boolean z2) {
        if (this.f2830z == z2) {
            return;
        }
        this.f2830z = z2;
        invalidate();
    }

    public void setGeometryListener(InterfaceC1545i1 interfaceC1545i1) {
        this.f2809A.clear();
        if (interfaceC1545i1 != null) {
            m1818a(interfaceC1545i1);
        }
    }

    public void setProgressColor(int i) {
        if (i == this.f2818n) {
            return;
        }
        this.f2818n = i;
        invalidate();
    }

    public void setQnxHoleProgress(float f2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        if (Math.abs(max - this.f2821q) < 0.001f) {
            return;
        }
        this.f2821q = max;
        if (getWidth() > 0 && getHeight() > 0) {
            m1819b(getWidth(), getHeight());
        }
        invalidate();
    }

    public void setSpeed(float f2) {
        float max = Math.max(0.0f, Math.min(220.0f, f2));
        if (Math.abs(max - this.f2816l) < 0.05f) {
            return;
        }
        this.f2816l = max;
        invalidate();
    }
}
