package com.altaysoft.t500_split.splitinfo;

import android.content.Context;
import android.content.IntentFilter;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0633a;
import java.util.Calendar;
import p006C.AbstractC0062j;
import p118x0.C1649e;
import p118x0.EnumC1648d;

/* loaded from: classes.dex */
public final class OemDigitClockView extends FrameLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f3204w = 0;

    /* renamed from: f */
    public final C1649e f3205f;

    /* renamed from: g */
    public final C1649e f3206g;

    /* renamed from: h */
    public final ImageView f3207h;

    /* renamed from: i */
    public int f3208i;

    /* renamed from: j */
    public int f3209j;

    /* renamed from: k */
    public int f3210k;

    /* renamed from: l */
    public int f3211l;

    /* renamed from: m */
    public int f3212m;

    /* renamed from: n */
    public int f3213n;

    /* renamed from: o */
    public int f3214o;

    /* renamed from: p */
    public int f3215p;

    /* renamed from: q */
    public boolean f3216q;

    /* renamed from: r */
    public boolean f3217r;

    /* renamed from: s */
    public boolean f3218s;

    /* renamed from: t */
    public int f3219t;

    /* renamed from: u */
    public int f3220u;

    /* renamed from: v */
    public final C0633a f3221v;

    public OemDigitClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3208i = 0;
        this.f3218s = true;
        this.f3219t = -1;
        this.f3220u = -1;
        this.f3221v = new C0633a(2, this);
        setClipChildren(false);
        setClipToPadding(false);
        setBackground(null);
        C1649e c1649e = new C1649e(context);
        this.f3205f = c1649e;
        ImageView imageView = new ImageView(context);
        this.f3207h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        C1649e c1649e2 = new C1649e(context);
        this.f3206g = c1649e2;
        addView(c1649e);
        addView(imageView);
        addView(c1649e2);
        m1968a();
    }

    /* renamed from: a */
    public final void m1968a() {
        boolean z2 = this.f3208i == 1;
        EnumC1648d enumC1648d = z2 ? EnumC1648d.f9360b : EnumC1648d.f9359a;
        this.f3205f.setPack(enumC1648d);
        this.f3206g.setPack(enumC1648d);
        this.f3207h.setImageResource(z2 ? R.drawable.oem_digit_deliver : R.drawable.oem_card_time_colon);
    }

    /* renamed from: b */
    public final void m1969b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_TICK");
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            getContext().registerReceiver(this.f3221v, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void m1970c(boolean z2) {
        boolean is24HourFormat = DateFormat.is24HourFormat(getContext());
        this.f3218s = is24HourFormat;
        int i = is24HourFormat ? 24 : 13;
        C1649e c1649e = this.f3205f;
        c1649e.setPageCount(i);
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        if (!this.f3218s && (i2 = calendar.get(10)) == 0) {
            i2 = 12;
        }
        int i4 = this.f3219t;
        C1649e c1649e2 = this.f3206g;
        if (i4 < 0) {
            c1649e.m4795g(i2, false);
            c1649e2.m4795g(i3, false);
        } else {
            if (i2 != i4) {
                c1649e.m4795g(i2, z2);
            }
            if (i3 != this.f3220u) {
                c1649e2.m4795g(i3, z2);
            }
        }
        this.f3219t = i2;
        this.f3220u = i3;
    }

    public int getVariant() {
        return this.f3208i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3216q = true;
        boolean is24HourFormat = DateFormat.is24HourFormat(getContext());
        this.f3218s = is24HourFormat;
        this.f3205f.setPageCount(is24HourFormat ? 24 : 13);
        this.f3206g.setPageCount(60);
        if (getVisibility() == 0) {
            this.f3217r = true;
            m1969b();
            m1970c(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            getContext().unregisterReceiver(this.f3221v);
        } catch (Exception unused) {
        }
        this.f3216q = false;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int min = Math.min(this.f3213n, Math.max(0, i6 - this.f3210k));
        int i7 = this.f3214o;
        this.f3205f.layout(i7, min, this.f3209j + i7, this.f3210k + min);
        int i8 = i5 - this.f3214o;
        int i9 = this.f3209j;
        int i10 = i8 - i9;
        int i11 = this.f3210k + min;
        this.f3206g.layout(i10, min, i9 + i10, i11);
        int i12 = this.f3211l;
        int i13 = (i5 - i12) / 2;
        int i14 = this.f3210k;
        int i15 = this.f3212m;
        int i16 = ((i14 - i15) / 2) + min;
        int i17 = this.f3215p;
        if (i17 > 0 && i17 + i15 <= i6) {
            i16 = i17;
        }
        this.f3207h.layout(i13, i16, i12 + i13, i15 + i16);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int round = mode == 0 ? Math.round(400.0f * getResources().getDisplayMetrics().density) : Math.max(1, size);
        int round2 = mode2 == 0 ? Math.round(540.0f * getResources().getDisplayMetrics().density) : Math.max(1, size2);
        if (mode == Integer.MIN_VALUE && size > 0) {
            round = size;
        }
        if (mode2 == Integer.MIN_VALUE && size2 > 0) {
            round2 = size2;
        }
        if (mode != 1073741824) {
            size = round;
        }
        if (mode2 != 1073741824) {
            size2 = round2;
        }
        boolean z2 = this.f3208i == 1;
        float f2 = z2 ? 1200.0f : 520.0f;
        float f3 = z2 ? 559.0f : 188.0f;
        float f4 = z2 ? 429.0f : 142.0f;
        float f5 = z2 ? 30.0f : 10.0f;
        float f6 = z2 ? 95.0f : 30.0f;
        float f7 = z2 ? 40.0f : 45.0f;
        float f8 = z2 ? 0.0f : 128.0f;
        float f9 = z2 ? 0.0f : 182.0f;
        float f10 = size;
        float f11 = (f10 / f2) * (z2 ? 1.5f : 1.6500001f);
        float f12 = ((2.0f * f7) + (f3 * 2.0f) + f5) * f11;
        if (f12 > f10 && f12 > 0.0f) {
            f11 *= f10 / f12;
        }
        float f13 = z2 ? (size2 * 0.28f) + (f4 * f11) : (f8 + f4) * f11;
        float f14 = size2;
        if (f13 > f14 && f13 > 0.0f) {
            f11 *= f14 / f13;
        }
        this.f3209j = AbstractC0062j.m152f(f3, f11, 1);
        this.f3210k = AbstractC0062j.m152f(f4, f11, 1);
        this.f3211l = AbstractC0062j.m152f(f5, f11, 1);
        this.f3212m = AbstractC0062j.m152f(f6, f11, 1);
        if (z2) {
            int round3 = Math.round(f14 * 0.28f);
            this.f3213n = round3;
            int i3 = this.f3210k;
            if (round3 + i3 > size2) {
                this.f3213n = Math.max(0, size2 - i3);
            }
            this.f3215p = ((this.f3210k - this.f3212m) / 2) + this.f3213n;
        } else {
            this.f3213n = Math.round(f8 * f11);
            this.f3215p = Math.round(f9 * f11);
        }
        int round4 = Math.round(f7 * f11);
        this.f3214o = round4;
        int i4 = (this.f3209j * 2) + this.f3211l;
        if ((round4 * 2) + i4 > size) {
            this.f3214o = Math.max(0, (size - i4) / 2);
        }
        setMeasuredDimension(size, size2);
        this.f3205f.measure(View.MeasureSpec.makeMeasureSpec(this.f3209j, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3210k, 1073741824));
        this.f3206g.measure(View.MeasureSpec.makeMeasureSpec(this.f3209j, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3210k, 1073741824));
        this.f3207h.measure(View.MeasureSpec.makeMeasureSpec(this.f3211l, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3212m, 1073741824));
    }

    public void setRunning(boolean z2) {
        if (this.f3217r == z2) {
            return;
        }
        this.f3217r = z2;
        if (this.f3216q) {
            if (z2) {
                m1969b();
                m1970c(false);
            } else {
                try {
                    getContext().unregisterReceiver(this.f3221v);
                } catch (Exception unused) {
                }
            }
        }
    }

    public void setVariant(int i) {
        int i2 = i != 1 ? 0 : 1;
        if (this.f3208i == i2) {
            return;
        }
        this.f3208i = i2;
        m1968a();
        requestLayout();
        invalidate();
    }
}
