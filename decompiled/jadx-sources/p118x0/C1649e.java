package p118x0;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.altaysoft.t500_split.R;
import p006C.AbstractC0062j;

/* renamed from: x0.e */
/* loaded from: classes.dex */
public final class C1649e extends FrameLayout {

    /* renamed from: y */
    public static final int[] f9362y = {R.drawable.oem_card_time_num_0, R.drawable.oem_card_time_num_1, R.drawable.oem_card_time_num_2, R.drawable.oem_card_time_num_3, R.drawable.oem_card_time_num_4, R.drawable.oem_card_time_num_5, R.drawable.oem_card_time_num_6, R.drawable.oem_card_time_num_7, R.drawable.oem_card_time_num_8, R.drawable.oem_card_time_num_9};

    /* renamed from: z */
    public static final int[] f9363z = {R.drawable.oem_digit_num_0, R.drawable.oem_digit_num_1, R.drawable.oem_digit_num_2, R.drawable.oem_digit_num_3, R.drawable.oem_digit_num_4, R.drawable.oem_digit_num_5, R.drawable.oem_digit_num_6, R.drawable.oem_digit_num_7, R.drawable.oem_digit_num_8, R.drawable.oem_digit_num_9};

    /* renamed from: f */
    public final Camera f9364f;

    /* renamed from: g */
    public final Matrix f9365g;

    /* renamed from: h */
    public final RectF f9366h;

    /* renamed from: i */
    public final RectF f9367i;

    /* renamed from: j */
    public final Path f9368j;

    /* renamed from: k */
    public final Path f9369k;

    /* renamed from: l */
    public final float[] f9370l;

    /* renamed from: m */
    public final float[] f9371m;

    /* renamed from: n */
    public final Paint f9372n;

    /* renamed from: o */
    public final Paint f9373o;

    /* renamed from: p */
    public final Paint f9374p;

    /* renamed from: q */
    public final Scroller f9375q;

    /* renamed from: r */
    public final View f9376r;

    /* renamed from: s */
    public final View f9377s;

    /* renamed from: t */
    public final View f9378t;

    /* renamed from: u */
    public int f9379u;

    /* renamed from: v */
    public int f9380v;

    /* renamed from: w */
    public float f9381w;

    /* renamed from: x */
    public EnumC1648d f9382x;

    public C1649e(Context context) {
        super(context, null, 0);
        this.f9364f = new Camera();
        this.f9365g = new Matrix();
        this.f9366h = new RectF();
        this.f9367i = new RectF();
        this.f9368j = new Path();
        this.f9369k = new Path();
        this.f9370l = new float[]{30.0f, 30.0f, 30.0f, 30.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f9371m = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 30.0f, 30.0f, 30.0f, 30.0f};
        Paint paint = new Paint(1);
        this.f9372n = paint;
        Paint paint2 = new Paint(1);
        this.f9373o = paint2;
        Paint paint3 = new Paint(1);
        this.f9374p = paint3;
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        this.f9379u = 60;
        this.f9380v = -1;
        this.f9381w = -1.0f;
        this.f9382x = EnumC1648d.f9359a;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f9375q = new Scroller(getContext(), decelerateInterpolator);
        paint.setColor(-16777216);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(-16777216);
        paint2.setStyle(style);
        paint3.setColor(-1);
        paint3.setStyle(style);
        this.f9376r = m4791c();
        this.f9377s = m4791c();
        this.f9378t = m4791c();
        addView(this.f9376r);
        addView(this.f9377s);
        addView(this.f9378t);
        this.f9376r.setVisibility(8);
        this.f9378t.setVisibility(8);
        m4789a();
    }

    private float getDegreesFlipped() {
        float f2 = this.f9381w % 180.0f;
        if (f2 < 0.0f) {
            f2 += 180.0f;
        }
        return (f2 / 180.0f) * 180.0f;
    }

    private void setFlipDistance(float f2) {
        if (f2 == this.f9381w) {
            invalidate();
            return;
        }
        float f3 = this.f9379u * 180;
        float f4 = f2 % f3;
        if (f4 < 0.0f) {
            f4 += f3;
        }
        this.f9381w = f4;
        int round = Math.round(f4 / 180.0f) % this.f9379u;
        if (this.f9380v != round) {
            this.f9380v = round;
            m4793e();
        }
        invalidate();
    }

    /* renamed from: a */
    public final void m4789a() {
        EnumC1648d enumC1648d = this.f9382x;
        EnumC1648d enumC1648d2 = EnumC1648d.f9360b;
        int i = enumC1648d == enumC1648d2 ? R.drawable.oem_digit_clock_frame : R.drawable.oem_card_time_tile;
        int i2 = enumC1648d == enumC1648d2 ? 8 : 0;
        View[] viewArr = {this.f9376r, this.f9377s, this.f9378t};
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.oem_tile_bg);
                if (imageView != null) {
                    imageView.setImageResource(i);
                }
                View findViewWithTag = view.findViewWithTag("digit_line");
                if (findViewWithTag != null) {
                    findViewWithTag.setVisibility(i2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m4790b(View view, int i) {
        int i2 = this.f9379u;
        int i3 = ((i % i2) + i2) % i2;
        int[] iArr = this.f9382x == EnumC1648d.f9360b ? f9363z : f9362y;
        ImageView imageView = (ImageView) view.findViewById(R.id.oem_digit_hi);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.oem_digit_lo);
        if (imageView != null) {
            imageView.setImageResource(iArr[i3 < 10 ? 0 : i3 / 10]);
        }
        if (imageView2 != null) {
            imageView2.setImageResource(iArr[i3 % 10]);
        }
    }

    /* renamed from: c */
    public final View m4791c() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.oem_digit_number_page, (ViewGroup) this, false);
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return inflate;
    }

    /* renamed from: d */
    public final void m4792d(int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        boolean z2 = this.f9382x == EnumC1648d.f9360b;
        float f2 = z2 ? 1.7f : 1.0f;
        float f3 = i;
        int m168v = AbstractC0062j.m168v(f3, z2 ? 0.48658317f : 0.4893617f, f2);
        float f4 = i2;
        int m168v2 = AbstractC0062j.m168v(f4, z2 ? 0.2773893f : 0.4225352f, f2);
        int min = Math.min(m168v, Math.max(1, i - 8));
        int min2 = Math.min(m168v2, Math.max(1, i2 - 8));
        int max = z2 ? Math.max(1, Math.round(0.053667262f * f3 * f2)) : 0;
        if (z2 && min + max > i) {
            max = Math.max(0, i - min);
        }
        int round = Math.round(f3 * (z2 ? 1.0f : 0.90425533f));
        int max2 = Math.max(1, Math.round((1.0f / (z2 ? 429.0f : 142.0f)) * f4));
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            View findViewWithTag = childAt.findViewWithTag("digit_row");
            if (findViewWithTag != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) findViewWithTag.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new FrameLayout.LayoutParams(min, min2);
                }
                layoutParams2.width = min;
                layoutParams2.height = min2;
                layoutParams2.gravity = 17;
                findViewWithTag.setLayoutParams(layoutParams2);
                View findViewWithTag2 = findViewWithTag.findViewWithTag("digit_gap");
                if (findViewWithTag2 != null && (layoutParams = (LinearLayout.LayoutParams) findViewWithTag2.getLayoutParams()) != null) {
                    layoutParams.width = max;
                    findViewWithTag2.setLayoutParams(layoutParams);
                    findViewWithTag2.setVisibility(max > 0 ? 0 : 8);
                }
            }
            View findViewWithTag3 = childAt.findViewWithTag("digit_line");
            if (findViewWithTag3 != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) findViewWithTag3.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new FrameLayout.LayoutParams(round, max2);
                }
                layoutParams3.width = round;
                layoutParams3.height = max2;
                layoutParams3.gravity = 17;
                findViewWithTag3.setLayoutParams(layoutParams3);
                findViewWithTag3.setVisibility(z2 ? 8 : 0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.f9375q.isFinished() && this.f9375q.computeScrollOffset()) {
            setFlipDistance(this.f9375q.getCurrY());
        }
        if (this.f9375q.isFinished()) {
            this.f9375q.abortAnimation();
            View view = this.f9377s;
            View view2 = this.f9376r;
            if (view2 != view) {
                view2.setVisibility(8);
            }
            View view3 = this.f9377s;
            if (view3 != view) {
                view3.setVisibility(8);
            }
            View view4 = this.f9378t;
            if (view4 != view) {
                view4.setVisibility(8);
            }
            view.setVisibility(0);
            m4794f(this.f9377s);
            drawChild(canvas, this.f9377s, 0L);
            return;
        }
        if (this.f9376r.getVisibility() != 0 && this.f9380v > 0) {
            this.f9376r.setVisibility(0);
        }
        this.f9377s.setVisibility(0);
        if (this.f9378t.getVisibility() != 0 && this.f9380v < this.f9379u - 1) {
            this.f9378t.setVisibility(0);
        }
        canvas.save();
        Path path = this.f9368j;
        canvas.clipPath(path);
        View view5 = getDegreesFlipped() > 90.0f ? this.f9376r : this.f9377s;
        if (view5.getVisibility() == 0 || view5 == this.f9377s || view5 == this.f9376r) {
            view5.setVisibility(0);
            m4794f(view5);
            drawChild(canvas, view5, 0L);
        }
        canvas.restore();
        canvas.save();
        canvas.clipPath(this.f9369k);
        View view6 = getDegreesFlipped() > 90.0f ? this.f9377s : this.f9378t;
        if (view6 != null) {
            view6.setVisibility(0);
            m4794f(view6);
            drawChild(canvas, view6, 0L);
        }
        canvas.restore();
        canvas.save();
        Camera camera = this.f9364f;
        camera.save();
        float degreesFlipped = getDegreesFlipped();
        RectF rectF = this.f9367i;
        if (degreesFlipped > 90.0f) {
            canvas.clipPath(path);
            camera.rotateX(degreesFlipped - 180.0f);
        } else {
            canvas.clipRect(rectF);
            camera.rotateX(degreesFlipped);
        }
        Matrix matrix = this.f9365g;
        camera.getMatrix(matrix);
        matrix.preScale(0.25f, 0.25f);
        matrix.postScale(4.0f, 4.0f);
        matrix.preTranslate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        matrix.postTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.concat(matrix);
        m4794f(this.f9377s);
        drawChild(canvas, this.f9377s, 0L);
        if (degreesFlipped < 90.0f) {
            Paint paint = this.f9374p;
            paint.setAlpha((int) ((degreesFlipped / 90.0f) * 100.0f));
            canvas.drawRoundRect(rectF, 20.0f, 20.0f, paint);
        } else {
            Paint paint2 = this.f9373o;
            paint2.setAlpha((int) ((Math.abs(degreesFlipped - 180.0f) / 90.0f) * 130.0f));
            canvas.drawRoundRect(this.f9366h, 20.0f, 20.0f, paint2);
        }
        camera.restore();
        canvas.restore();
        invalidate();
    }

    /* renamed from: e */
    public final void m4793e() {
        int i = this.f9380v;
        m4790b(this.f9377s, i);
        if (i > 0) {
            m4790b(this.f9376r, i - 1);
            this.f9376r.setVisibility(0);
        } else {
            this.f9376r.setVisibility(8);
        }
        if (i < this.f9379u - 1) {
            m4790b(this.f9378t, i + 1);
            this.f9378t.setVisibility(0);
        } else {
            this.f9378t.setVisibility(8);
        }
        this.f9377s.setVisibility(0);
    }

    /* renamed from: f */
    public final void m4794f(View view) {
        if (isHardwareAccelerated() && view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    /* renamed from: g */
    public final void m4795g(int i, boolean z2) {
        int i2 = this.f9379u;
        int i3 = ((i % i2) + i2) % i2;
        if (!z2) {
            setFlipDistance(i3 * 180);
            return;
        }
        if (i3 == this.f9380v) {
            return;
        }
        int i4 = (int) this.f9381w;
        if (i4 < 0) {
            setFlipDistance(i3 * 180);
            return;
        }
        int i5 = i3 * 180;
        int i6 = i5 - i4;
        if (Math.abs(i6) > 180) {
            setFlipDistance(i5);
        } else {
            this.f9375q.startScroll(0, i4, 0, i6 < 0 ? 180 : i6, 500);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight();
        float width = getWidth();
        float f2 = width * 0.04255319f;
        float f3 = height * 0.07042254f;
        canvas.drawRoundRect(f2, (0.08450704f * height) + (height / 2.0f), width - f2, height - (0.04225352f * height), f3, f3, this.f9372n);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (z2) {
            m4792d(i5, i6);
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            childAt.layout(0, 0, i5, i6);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        EnumC1648d enumC1648d = this.f9382x;
        EnumC1648d enumC1648d2 = EnumC1648d.f9360b;
        float f2 = enumC1648d == enumC1648d2 ? 429.0f : 142.0f;
        setPadding(0, 0, 0, 0);
        float f3 = i2;
        this.f9372n.setMaskFilter(new BlurMaskFilter(Math.max(2.0f, (8.0f / f2) * f3), BlurMaskFilter.Blur.NORMAL));
        float max = Math.max(4.0f, ((this.f9382x == enumC1648d2 ? 30.0f : 16.0f) / f2) * f3);
        float[] fArr = this.f9370l;
        fArr[3] = max;
        fArr[2] = max;
        fArr[1] = max;
        fArr[0] = max;
        float[] fArr2 = this.f9371m;
        fArr2[7] = max;
        fArr2[6] = max;
        fArr2[5] = max;
        fArr2[4] = max;
        m4792d(i, i2);
        float f4 = i;
        float f5 = f3 / 2.0f;
        this.f9366h.set(0.0f, 0.0f, f4, f5);
        this.f9367i.set(0.0f, f5, f4, f3);
        Path path = this.f9368j;
        path.reset();
        Path path2 = this.f9369k;
        path2.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(0.0f, 0.0f, f4, f5, this.f9370l, direction);
        path2.addRoundRect(0.0f, f5, f4, f3, this.f9371m, direction);
    }

    public void setPack(EnumC1648d enumC1648d) {
        if (enumC1648d == null) {
            enumC1648d = EnumC1648d.f9359a;
        }
        if (this.f9382x == enumC1648d) {
            return;
        }
        this.f9382x = enumC1648d;
        m4789a();
        if (getWidth() > 0) {
            m4792d(getWidth(), getHeight());
        }
        if (this.f9380v >= 0) {
            m4793e();
        }
        invalidate();
    }

    public void setPageCount(int i) {
        if (i < 1) {
            i = 1;
        }
        if (this.f9379u == i) {
            return;
        }
        this.f9379u = i;
        this.f9380v = -1;
        this.f9381w = -1.0f;
    }
}
