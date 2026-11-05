package com.altaysoft.t500_split.p061ip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.altaysoft.t500_split.R;
import p109u0.AbstractC1539g1;
import p109u0.C1484I;
import p109u0.C1542h1;

/* loaded from: classes.dex */
public final class Theme42RpmArcView extends View {

    /* renamed from: x */
    public static final /* synthetic */ int f2782x = 0;

    /* renamed from: f */
    public final Path f2783f;

    /* renamed from: g */
    public final RectF f2784g;

    /* renamed from: h */
    public final RectF f2785h;

    /* renamed from: i */
    public final Paint f2786i;

    /* renamed from: j */
    public final Paint f2787j;

    /* renamed from: k */
    public Theme42SpeedArcView f2788k;

    /* renamed from: l */
    public final C1484I f2789l;

    /* renamed from: m */
    public float f2790m;

    /* renamed from: n */
    public int f2791n;

    /* renamed from: o */
    public float f2792o;

    /* renamed from: p */
    public float f2793p;

    /* renamed from: q */
    public float f2794q;

    /* renamed from: r */
    public float f2795r;

    /* renamed from: s */
    public float f2796s;

    /* renamed from: t */
    public float f2797t;

    /* renamed from: u */
    public float f2798u;

    /* renamed from: v */
    public C1542h1 f2799v;

    /* renamed from: w */
    public boolean f2800w;

    public Theme42RpmArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2783f = new Path();
        this.f2784g = new RectF();
        this.f2785h = new RectF();
        this.f2786i = new Paint(1);
        this.f2787j = new Paint(1);
        this.f2789l = new C1484I(1, this);
        this.f2797t = -1.0f;
        this.f2798u = -1.0f;
        setWillNotDraw(false);
        if (isInEditMode()) {
            this.f2790m = 4.5f;
            this.f2797t = 7.0f;
            this.f2798u = 8.0f;
        }
        float f2 = this.f2790m;
        isInEditMode();
        this.f2791n = AbstractC1539g1.m4234p(Math.max(0.0f, Math.min(1.0f, f2 / 8.0f)), -9406336, -4669240);
    }

    /* renamed from: a */
    public final void m1815a(C1542h1 c1542h1, float f2, float f3) {
        this.f2799v = c1542h1;
        this.f2792o = f2;
        this.f2795r = f3;
        this.f2793p = getResources().getDimension(R.dimen.theme_42_rpm_gap_from_spd);
        this.f2794q = getResources().getDimension(R.dimen.theme_42_side_arc_cy_drop_px);
        this.f2796s = getResources().getDimension(R.dimen.theme_42_threshold_marker_radius);
        this.f2800w = c1542h1 != null;
        invalidate();
    }

    /* renamed from: b */
    public final void m1816b(Canvas canvas, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        if (f7 <= f6 + 0.001f) {
            return;
        }
        AbstractC1539g1.m4244z(canvas, this.f2783f, this.f2784g, this.f2785h, this.f2799v.f8327a, f3, f2, this.f2792o, ((f6 / 8.0f) * f5) + f4, ((f7 - f6) / 8.0f) * f5, i, i2, true, this.f2786i);
    }

    /* renamed from: c */
    public final void m1817c(int i, int i2) {
        C1542h1 arcGeometry;
        View rootView;
        Theme42SpeedArcView theme42SpeedArcView;
        if (!this.f2800w || this.f2799v == null) {
            if (this.f2788k == null && (rootView = getRootView()) != null && (theme42SpeedArcView = (Theme42SpeedArcView) rootView.findViewById(R.id.theme_42_spd)) != null) {
                Theme42SpeedArcView theme42SpeedArcView2 = this.f2788k;
                C1484I c1484i = this.f2789l;
                if (theme42SpeedArcView2 != null) {
                    theme42SpeedArcView2.f2809A.remove(c1484i);
                }
                this.f2788k = theme42SpeedArcView;
                theme42SpeedArcView.m1818a(c1484i);
            }
            Theme42SpeedArcView theme42SpeedArcView3 = this.f2788k;
            if (theme42SpeedArcView3 != null && (arcGeometry = theme42SpeedArcView3.getArcGeometry()) != null) {
                m1815a(arcGeometry, this.f2788k.getBandStrokePx(), this.f2788k.getTickPadPx());
                return;
            }
            if (i <= 0 || i2 <= 0) {
                return;
            }
            this.f2792o = getResources().getDimension(R.dimen.theme_42_spd_stroke_band);
            this.f2795r = getResources().getDimension(R.dimen.theme_42_spd_tick_pad);
            this.f2793p = getResources().getDimension(R.dimen.theme_42_rpm_gap_from_spd);
            this.f2794q = getResources().getDimension(R.dimen.theme_42_side_arc_cy_drop_px);
            this.f2796s = getResources().getDimension(R.dimen.theme_42_threshold_marker_radius);
            float dimension = getResources().getDimension(R.dimen.theme_42_top_panel_margin_top);
            float dimension2 = getResources().getDimension(R.dimen.theme_42_top_panel_height);
            float dimension3 = getResources().getDimension(R.dimen.theme_42_spd_apex_below_top_px);
            float dimension4 = getResources().getDimension(R.dimen.theme_42_spd_lift_px);
            float dimension5 = getResources().getDimension(R.dimen.theme_42_bottom_panel_height);
            float dimension6 = getResources().getDimension(R.dimen.theme_42_arc_vertical_lift_px);
            float dimension7 = getResources().getDimension(R.dimen.theme_42_qnx_clearance_px);
            float dimension8 = getResources().getDimension(R.dimen.theme_42_spd_radius_shrink_px);
            float f2 = dimension + dimension2;
            Theme42SpeedArcView theme42SpeedArcView4 = this.f2788k;
            this.f2799v = C1542h1.m4284a(i, i2, f2, dimension3, dimension4, dimension5, dimension6, this.f2792o, this.f2795r, this.f2793p, dimension7, dimension8, theme42SpeedArcView4 != null ? theme42SpeedArcView4.getQnxHoleProgress() : 0.0f);
            this.f2800w = true;
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        View rootView;
        Theme42SpeedArcView theme42SpeedArcView;
        super.onAttachedToWindow();
        if (this.f2788k != null || (rootView = getRootView()) == null || (theme42SpeedArcView = (Theme42SpeedArcView) rootView.findViewById(R.id.theme_42_spd)) == null) {
            return;
        }
        Theme42SpeedArcView theme42SpeedArcView2 = this.f2788k;
        C1484I c1484i = this.f2789l;
        if (theme42SpeedArcView2 != null) {
            theme42SpeedArcView2.f2809A.remove(c1484i);
        }
        this.f2788k = theme42SpeedArcView;
        theme42SpeedArcView.m1818a(c1484i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float f4;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        m1817c(width, height);
        if (!this.f2800w || this.f2799v == null) {
            return;
        }
        if (isInEditMode() && this.f2790m <= 0.0f) {
            this.f2790m = 4.5f;
        }
        C1542h1 c1542h1 = this.f2799v;
        float f5 = c1542h1.f8329c + this.f2792o + this.f2793p;
        float f6 = this.f2794q;
        float f7 = c1542h1.f8328b;
        float f8 = f7 + f6;
        float f9 = f7 + f6;
        float f10 = c1542h1.f8331e;
        float f11 = c1542h1.f8327a;
        float degrees = (float) Math.toDegrees(Math.atan2(c1542h1.f8330d - f9, (f11 - f10) - f11));
        float f12 = this.f2799v.f8333g;
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, width, this.f2799v.f8330d + this.f2792o);
        m1816b(canvas, f5, f8, degrees, f12, 0.0f, 6.0f, -13091516, -11512228);
        m1816b(canvas, f5, f8, degrees, f12, 6.0f, 8.0f, -11659240, -10345436);
        float f13 = this.f2790m;
        if (f13 > 0.0f) {
            float f14 = (f13 / 8.0f) * f12;
            boolean m4190L = AbstractC1539g1.m4190L(this.f2791n);
            Paint paint = this.f2786i;
            RectF rectF = this.f2785h;
            RectF rectF2 = this.f2784g;
            Path path = this.f2783f;
            if (m4190L) {
                f2 = f12;
                f3 = degrees;
                f4 = 0.0f;
                AbstractC1539g1.m4188J(canvas, path, rectF2, rectF, this.f2799v.f8327a, f8, f5, this.f2792o, f3, f14, this.f2791n, paint);
            } else {
                f2 = f12;
                f3 = degrees;
                f4 = 0.0f;
                AbstractC1539g1.m4244z(canvas, path, rectF2, rectF, this.f2799v.f8327a, f8, f5, this.f2792o, f3, f14, -9406336, -4669240, false, paint);
            }
        } else {
            f2 = f12;
            f3 = degrees;
            f4 = 0.0f;
        }
        float f15 = this.f2797t;
        Paint paint2 = this.f2787j;
        if (f15 > f4) {
            AbstractC1539g1.m4179A(canvas, paint2, this.f2796s, this.f2799v.f8327a, f8, f5, f3, f2, f15, 8.0f, 2009376840);
        }
        float f16 = this.f2798u;
        if (f16 > f4) {
            AbstractC1539g1.m4179A(canvas, paint2, this.f2796s, this.f2799v.f8327a, f8, f5, f3, f2, f16, 8.0f, 2007519312);
        }
        canvas.restore();
        Theme42SpeedArcView theme42SpeedArcView = this.f2788k;
        boolean z2 = theme42SpeedArcView != null && theme42SpeedArcView.f2830z;
        C1542h1 c1542h12 = this.f2799v;
        float f17 = this.f2792o;
        float f18 = this.f2793p;
        float f19 = this.f2794q;
        if (c1542h12 == null) {
            return;
        }
        float f20 = 0.5f * f17;
        float f21 = c1542h12.f8329c;
        float f22 = f21 + f17 + f18;
        float f23 = c1542h12.f8328b + f19;
        float f24 = c1542h12.f8331e;
        float f25 = c1542h12.f8327a;
        float f26 = c1542h12.f8330d;
        float radians = (float) Math.toRadians((float) Math.toDegrees(Math.atan2(f26 - f23, (f25 - f24) - f25)));
        float radians2 = (float) Math.toRadians(c1542h12.f8332f + c1542h12.f8333g);
        float f27 = f22 + f20;
        double d = radians;
        float cos = (((float) Math.cos(d)) * f27) + f25;
        double d2 = radians2;
        float cos2 = (f27 * ((float) Math.cos(d2))) + f25;
        float f28 = f21 + f20;
        float cos3 = (((float) Math.cos(d)) * f28) + f25;
        float cos4 = (f28 * ((float) Math.cos(d2))) + f25;
        float f29 = cos2 - cos;
        if (f29 < 40.0f) {
            return;
        }
        if (!z2) {
            AbstractC1539g1.m4181C(canvas, cos3, f26, f17, true);
            AbstractC1539g1.m4181C(canvas, cos4, f26, f17, false);
            AbstractC1539g1.m4181C(canvas, cos, f26, f17, true);
            AbstractC1539g1.m4181C(canvas, cos2, f26, f17, false);
            return;
        }
        AbstractC1539g1.m4187I(canvas, cos, cos2, 2.0f + f26, true);
        float f30 = 0.05f * f29;
        AbstractC1539g1.m4183E(cos + f30, cos2 - f30, f26 + 9.0f, 1.5f, -2005895040, canvas);
        float f31 = f29 * 0.11f;
        AbstractC1539g1.m4183E(cos + f31, cos2 - f31, 15.0f + f26, 1.0f, 1430927400, canvas);
        AbstractC1539g1.m4182D(canvas, cos3 + f20, f26);
        AbstractC1539g1.m4182D(canvas, cos4 - f20, f26);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f2800w = false;
        m1817c(i, i2);
    }

    public void setProgressColor(int i) {
        if (i == this.f2791n) {
            return;
        }
        this.f2791n = i;
        invalidate();
    }

    public void setRpm(float f2) {
        float round = Math.round(Math.max(0.0f, Math.min(8.0f, f2)) * 10.0f) / 10.0f;
        if (Math.abs(round - this.f2790m) < 0.05f) {
            return;
        }
        this.f2790m = round;
        invalidate();
    }
}
