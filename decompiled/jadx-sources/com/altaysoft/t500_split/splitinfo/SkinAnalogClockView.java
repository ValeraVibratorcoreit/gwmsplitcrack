package com.altaysoft.t500_split.splitinfo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.altaysoft.t500_split.splitinfo.SkinAnalogClockView;
import java.util.Calendar;
import java.util.function.Consumer;
import p003B.C0037d;
import p006C.AbstractC0062j;
import p098q0.AbstractC1354s1;
import p118x0.RunnableC1658n;

/* loaded from: classes.dex */
public final class SkinAnalogClockView extends View {

    /* renamed from: f */
    public final Paint f3222f;

    /* renamed from: g */
    public final Matrix f3223g;

    /* renamed from: h */
    public final RectF f3224h;

    /* renamed from: i */
    public final Calendar f3225i;

    /* renamed from: j */
    public final Handler f3226j;

    /* renamed from: k */
    public int f3227k;

    /* renamed from: l */
    public int f3228l;

    /* renamed from: m */
    public Bitmap f3229m;

    /* renamed from: n */
    public Bitmap f3230n;

    /* renamed from: o */
    public Bitmap f3231o;

    /* renamed from: p */
    public Bitmap f3232p;

    /* renamed from: q */
    public boolean f3233q;

    /* renamed from: r */
    public final RunnableC1658n f3234r;

    public SkinAnalogClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3222f = new Paint(3);
        this.f3223g = new Matrix();
        this.f3224h = new RectF();
        this.f3225i = Calendar.getInstance();
        this.f3226j = new Handler(Looper.getMainLooper());
        this.f3227k = 0;
        this.f3234r = new RunnableC1658n(0, this);
    }

    /* renamed from: d */
    public static boolean m1971d(int i) {
        return (i == 4 || i == 5 || i == 6) ? false : true;
    }

    /* renamed from: a */
    public final void m1972a(Canvas canvas, Bitmap bitmap, float f2, float f3, float f4, float f5) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        float width = f4 / bitmap.getWidth();
        Matrix matrix = this.f3223g;
        matrix.reset();
        matrix.postTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
        matrix.postRotate(f5);
        matrix.postScale(width, width);
        matrix.postTranslate(f2, f3);
        canvas.drawBitmap(bitmap, matrix, this.f3222f);
    }

    /* renamed from: b */
    public final void m1973b(String str, int i, Consumer consumer) {
        AbstractC1354s1.m3252a(getContext().getApplicationContext(), str, new C0037d(this, i, consumer), this.f3226j, 0);
    }

    /* renamed from: c */
    public final void m1974c() {
        String str;
        this.f3229m = null;
        this.f3230n = null;
        this.f3231o = null;
        this.f3232p = null;
        int i = this.f3228l + 1;
        this.f3228l = i;
        int i2 = this.f3227k;
        String str2 = "clock_gm";
        switch (i2) {
            case 1:
                str = "clock_gm";
                break;
            case 2:
                str = "clock_g";
                break;
            case 3:
                str = "clock_orange";
                break;
            case 4:
                str = "clock_silver";
                break;
            case 5:
                str = "clock_tank_white";
                break;
            case 6:
                str = "clock_tank_black";
                break;
            default:
                str = "clock_ng";
                break;
        }
        if (i2 != 5 && i2 != 6) {
            switch (i2) {
                case 1:
                    break;
                case 2:
                    str2 = "clock_g";
                    break;
                case 3:
                    str2 = "clock_orange";
                    break;
                case 4:
                    str2 = "clock_silver";
                    break;
                case 5:
                    str2 = "clock_tank_white";
                    break;
                case 6:
                    str2 = "clock_tank_black";
                    break;
                default:
                    str2 = "clock_ng";
                    break;
            }
        } else {
            str2 = "clock_tank";
        }
        boolean m1971d = m1971d(i2);
        final int i3 = 0;
        m1973b(AbstractC0062j.m161o("themes/clock/", str, "_face.bin"), i, new Consumer(this) { // from class: x0.m

            /* renamed from: b */
            public final /* synthetic */ SkinAnalogClockView f9458b;

            {
                this.f9458b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i3) {
                    case 0:
                        SkinAnalogClockView skinAnalogClockView = this.f9458b;
                        skinAnalogClockView.f3229m = bitmap;
                        skinAnalogClockView.invalidate();
                        break;
                    case 1:
                        SkinAnalogClockView skinAnalogClockView2 = this.f9458b;
                        skinAnalogClockView2.f3230n = bitmap;
                        skinAnalogClockView2.invalidate();
                        break;
                    case 2:
                        SkinAnalogClockView skinAnalogClockView3 = this.f9458b;
                        skinAnalogClockView3.f3231o = bitmap;
                        skinAnalogClockView3.invalidate();
                        break;
                    default:
                        SkinAnalogClockView skinAnalogClockView4 = this.f9458b;
                        skinAnalogClockView4.f3232p = bitmap;
                        skinAnalogClockView4.invalidate();
                        break;
                }
            }
        });
        final int i4 = 1;
        m1973b("themes/clock/" + str2 + "_arrow_h.bin", i, new Consumer(this) { // from class: x0.m

            /* renamed from: b */
            public final /* synthetic */ SkinAnalogClockView f9458b;

            {
                this.f9458b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i4) {
                    case 0:
                        SkinAnalogClockView skinAnalogClockView = this.f9458b;
                        skinAnalogClockView.f3229m = bitmap;
                        skinAnalogClockView.invalidate();
                        break;
                    case 1:
                        SkinAnalogClockView skinAnalogClockView2 = this.f9458b;
                        skinAnalogClockView2.f3230n = bitmap;
                        skinAnalogClockView2.invalidate();
                        break;
                    case 2:
                        SkinAnalogClockView skinAnalogClockView3 = this.f9458b;
                        skinAnalogClockView3.f3231o = bitmap;
                        skinAnalogClockView3.invalidate();
                        break;
                    default:
                        SkinAnalogClockView skinAnalogClockView4 = this.f9458b;
                        skinAnalogClockView4.f3232p = bitmap;
                        skinAnalogClockView4.invalidate();
                        break;
                }
            }
        });
        final int i5 = 2;
        m1973b("themes/clock/" + str2 + "_arrow_m.bin", i, new Consumer(this) { // from class: x0.m

            /* renamed from: b */
            public final /* synthetic */ SkinAnalogClockView f9458b;

            {
                this.f9458b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                switch (i5) {
                    case 0:
                        SkinAnalogClockView skinAnalogClockView = this.f9458b;
                        skinAnalogClockView.f3229m = bitmap;
                        skinAnalogClockView.invalidate();
                        break;
                    case 1:
                        SkinAnalogClockView skinAnalogClockView2 = this.f9458b;
                        skinAnalogClockView2.f3230n = bitmap;
                        skinAnalogClockView2.invalidate();
                        break;
                    case 2:
                        SkinAnalogClockView skinAnalogClockView3 = this.f9458b;
                        skinAnalogClockView3.f3231o = bitmap;
                        skinAnalogClockView3.invalidate();
                        break;
                    default:
                        SkinAnalogClockView skinAnalogClockView4 = this.f9458b;
                        skinAnalogClockView4.f3232p = bitmap;
                        skinAnalogClockView4.invalidate();
                        break;
                }
            }
        });
        if (m1971d) {
            final int i6 = 3;
            m1973b(AbstractC0062j.m161o("themes/clock/", str, "_arrow_s.bin"), i, new Consumer(this) { // from class: x0.m

                /* renamed from: b */
                public final /* synthetic */ SkinAnalogClockView f9458b;

                {
                    this.f9458b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    switch (i6) {
                        case 0:
                            SkinAnalogClockView skinAnalogClockView = this.f9458b;
                            skinAnalogClockView.f3229m = bitmap;
                            skinAnalogClockView.invalidate();
                            break;
                        case 1:
                            SkinAnalogClockView skinAnalogClockView2 = this.f9458b;
                            skinAnalogClockView2.f3230n = bitmap;
                            skinAnalogClockView2.invalidate();
                            break;
                        case 2:
                            SkinAnalogClockView skinAnalogClockView3 = this.f9458b;
                            skinAnalogClockView3.f3231o = bitmap;
                            skinAnalogClockView3.invalidate();
                            break;
                        default:
                            SkinAnalogClockView skinAnalogClockView4 = this.f9458b;
                            skinAnalogClockView4.f3232p = bitmap;
                            skinAnalogClockView4.invalidate();
                            break;
                    }
                }
            });
        }
    }

    public int getSkin() {
        return this.f3227k;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            setRunning(true);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        setRunning(false);
        this.f3229m = null;
        this.f3230n = null;
        this.f3231o = null;
        this.f3232p = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f3229m;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        float min = Math.min(getWidth(), getHeight());
        float width = (getWidth() - min) / 2.0f;
        float height = (getHeight() - min) / 2.0f;
        float f2 = min / 2.0f;
        float f3 = width + f2;
        float f4 = height + f2;
        RectF rectF = this.f3224h;
        rectF.set(width, height, width + min, height + min);
        canvas.drawBitmap(this.f3229m, (Rect) null, rectF, this.f3222f);
        long currentTimeMillis = System.currentTimeMillis();
        this.f3225i.setTimeInMillis(currentTimeMillis);
        float f5 = (r3.get(14) / 1000.0f) + r3.get(13);
        m1972a(canvas, this.f3230n, f3, f4, min, (((r3.get(13) / 3600.0f) + ((r3.get(12) / 60.0f) + r3.get(10))) / 12.0f) * 360.0f);
        m1972a(canvas, this.f3231o, f3, f4, min, (((r3.get(14) / 60000.0f) + ((r3.get(13) / 60.0f) + r3.get(12))) / 60.0f) * 360.0f);
        if (m1971d(this.f3227k)) {
            m1972a(canvas, this.f3232p, f3, f4, min, (f5 / 60.0f) * 360.0f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int m1951c = AnalogClockView.m1951c(i, i2, Math.round(540.0f * getResources().getDisplayMetrics().density));
        setMeasuredDimension(m1951c, m1951c);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        setRunning(i == 0 && isAttachedToWindow());
    }

    public void setRunning(boolean z2) {
        if (this.f3233q == z2) {
            return;
        }
        this.f3233q = z2;
        RunnableC1658n runnableC1658n = this.f3234r;
        removeCallbacks(runnableC1658n);
        if (this.f3233q) {
            int i = this.f3227k;
            if (this.f3229m == null || this.f3230n == null || this.f3231o == null || (m1971d(i) && this.f3232p == null)) {
                m1974c();
            }
            post(runnableC1658n);
        }
    }

    public void setSkin(int i) {
        int i2 = ((i % 7) + 7) % 7;
        if (this.f3227k != i2 || this.f3229m == null || this.f3230n == null || this.f3231o == null || (m1971d(i2) && this.f3232p == null)) {
            this.f3227k = i2;
            m1974c();
            invalidate();
        }
    }
}
