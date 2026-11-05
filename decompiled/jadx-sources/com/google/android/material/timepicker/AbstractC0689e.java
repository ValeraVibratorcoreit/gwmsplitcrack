package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.altaysoft.t500_split.R;
import java.util.WeakHashMap;
import p001A0.RunnableC0024r;
import p004B0.AbstractC0051a;
import p022K.AbstractC0169Q;
import p045W0.C0357g;
import p045W0.C0358h;
import p045W0.C0360j;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes.dex */
public abstract class AbstractC0689e extends ConstraintLayout {

    /* renamed from: x */
    public final RunnableC0024r f3758x;

    /* renamed from: y */
    public int f3759y;

    /* renamed from: z */
    public final C0357g f3760z;

    public AbstractC0689e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0357g c0357g = new C0357g();
        this.f3760z = c0357g;
        C0358h c0358h = new C0358h(0.5f);
        C0360j m968e = c0357g.f1026f.f1008a.m968e();
        m968e.f1052e = c0358h;
        m968e.f1053f = c0358h;
        m968e.f1054g = c0358h;
        m968e.f1055h = c0358h;
        c0357g.setShapeAppearanceModel(m968e.m963a());
        this.f3760z.m958k(ColorStateList.valueOf(-1));
        C0357g c0357g2 = this.f3760z;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        setBackground(c0357g2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f186u, R.attr.materialClockStyle, 0);
        this.f3759y = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3758x = new RunnableC0024r(14, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0024r runnableC0024r = this.f3758x;
            handler.removeCallbacks(runnableC0024r);
            handler.post(runnableC0024r);
        }
    }

    /* renamed from: l */
    public abstract void mo2142l();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo2142l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0024r runnableC0024r = this.f3758x;
            handler.removeCallbacks(runnableC0024r);
            handler.post(runnableC0024r);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f3760z.m958k(ColorStateList.valueOf(i));
    }
}
