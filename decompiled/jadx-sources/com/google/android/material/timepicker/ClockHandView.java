package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p007C0.AbstractC0067a;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0294k;
import p121y0.AbstractC1680h;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: f */
    public final ValueAnimator f3740f;

    /* renamed from: g */
    public boolean f3741g;

    /* renamed from: h */
    public final ArrayList f3742h;

    /* renamed from: i */
    public final int f3743i;

    /* renamed from: j */
    public final float f3744j;

    /* renamed from: k */
    public final Paint f3745k;

    /* renamed from: l */
    public final RectF f3746l;

    /* renamed from: m */
    public final int f3747m;

    /* renamed from: n */
    public float f3748n;

    /* renamed from: o */
    public boolean f3749o;

    /* renamed from: p */
    public double f3750p;

    /* renamed from: q */
    public int f3751q;

    /* renamed from: r */
    public int f3752r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f3740f = new ValueAnimator();
        this.f3742h = new ArrayList();
        Paint paint = new Paint();
        this.f3745k = paint;
        this.f3746l = new RectF();
        this.f3752r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f171f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC1680h.m4851M(context, R.attr.motionDurationLong2, 200);
        AbstractC1680h.m4852N(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0067a.f225b);
        this.f3751q = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3743i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f3747m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3744j = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m2145b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int m2144a(int i) {
        return i == 2 ? Math.round(this.f3751q * 0.66f) : this.f3751q;
    }

    /* renamed from: b */
    public final void m2145b(float f2) {
        ValueAnimator valueAnimator = this.f3740f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f3 = f2 % 360.0f;
        this.f3748n = f3;
        this.f3750p = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float m2144a = m2144a(this.f3752r);
        float cos = (((float) Math.cos(this.f3750p)) * m2144a) + width;
        float sin = (m2144a * ((float) Math.sin(this.f3750p))) + height;
        float f4 = this.f3743i;
        this.f3746l.set(cos - f4, sin - f4, cos + f4, sin + f4);
        Iterator it = this.f3742h.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0688d) it.next());
            if (Math.abs(clockFaceView.f3738N - f3) > 0.001f) {
                clockFaceView.f3738N = f3;
                clockFaceView.m2143m();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float m2144a = m2144a(this.f3752r);
        float cos = (((float) Math.cos(this.f3750p)) * m2144a) + f2;
        float f3 = height;
        float sin = (m2144a * ((float) Math.sin(this.f3750p))) + f3;
        Paint paint = this.f3745k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f3743i, paint);
        double sin2 = Math.sin(this.f3750p);
        paint.setStrokeWidth(this.f3747m);
        canvas.drawLine(f2, f3, width + ((int) (Math.cos(this.f3750p) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f2, f3, this.f3744j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (this.f3740f.isRunning()) {
            return;
        }
        m2145b(this.f3748n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.f3749o = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.f3749o;
            if (this.f3741g) {
                this.f3752r = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) m2144a(2)) + AbstractC0294k.m843d(getContext(), 12) ? 2 : 1;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.f3749o;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f2 = i;
        boolean z6 = this.f3748n != f2;
        if (!z2 || !z6) {
            if (z6 || z3) {
                m2145b(f2);
            }
            this.f3749o = z5 | z4;
            return true;
        }
        z4 = true;
        this.f3749o = z5 | z4;
        return true;
    }
}
