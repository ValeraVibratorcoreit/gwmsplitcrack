package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p004B0.AbstractC0051a;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p111v.C1597i;
import p111v.C1598j;
import p111v.C1602n;
import p123z.AbstractC1695c;

/* loaded from: classes.dex */
class ClockFaceView extends AbstractC0689e implements InterfaceC0688d {

    /* renamed from: A */
    public final ClockHandView f3725A;

    /* renamed from: B */
    public final Rect f3726B;

    /* renamed from: C */
    public final RectF f3727C;

    /* renamed from: D */
    public final Rect f3728D;

    /* renamed from: E */
    public final SparseArray f3729E;

    /* renamed from: F */
    public final C0687c f3730F;

    /* renamed from: G */
    public final int[] f3731G;

    /* renamed from: H */
    public final float[] f3732H;

    /* renamed from: I */
    public final int f3733I;

    /* renamed from: J */
    public final int f3734J;

    /* renamed from: K */
    public final int f3735K;

    /* renamed from: L */
    public final int f3736L;

    /* renamed from: M */
    public final String[] f3737M;

    /* renamed from: N */
    public float f3738N;

    /* renamed from: O */
    public final ColorStateList f3739O;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3726B = new Rect();
        this.f3727C = new RectF();
        this.f3728D = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f3729E = sparseArray;
        this.f3732H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f170e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m255B = AbstractC0088l.m255B(context, obtainStyledAttributes, 1);
        this.f3739O = m255B;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3725A = clockHandView;
        this.f3733I = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = m255B.getColorForState(new int[]{android.R.attr.state_selected}, m255B.getDefaultColor());
        this.f3731G = new int[]{colorForState, colorForState, m255B.getDefaultColor()};
        clockHandView.f3742h.add(this);
        int defaultColor = AbstractC1695c.m4959b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m255B2 = AbstractC0088l.m255B(context, obtainStyledAttributes, 0);
        setBackgroundColor(m255B2 != null ? m255B2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0686b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f3730F = new C0687c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f3737M = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i = 0; i < Math.max(this.f3737M.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f3737M.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f3737M[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z2 = i2 > 1 ? true : z2;
                AbstractC0169Q.m505j(textView, this.f3730F);
                textView.setTextColor(this.f3739O);
            }
        }
        ClockHandView clockHandView2 = this.f3725A;
        if (clockHandView2.f3741g && !z2) {
            clockHandView2.f3752r = 1;
        }
        clockHandView2.f3741g = z2;
        clockHandView2.invalidate();
        this.f3734J = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f3735K = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f3736L = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC0689e
    /* renamed from: l */
    public final void mo2142l() {
        C1602n c1602n = new C1602n();
        c1602n.m4767b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f3759y * 0.66f) : this.f3759y;
            Iterator it = list.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = c1602n.f9207c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C1597i());
                }
                C1598j c1598j = ((C1597i) hashMap2.get(Integer.valueOf(id))).f9103d;
                c1598j.f9173z = R.id.circle_center;
                c1598j.f9107A = round;
                c1598j.f9108B = f2;
                f2 += 360.0f / list.size();
            }
        }
        c1602n.m4766a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f3729E;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* renamed from: m */
    public final void m2143m() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f3725A.f3746l;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f3729E;
            int size = sparseArray.size();
            rectF = this.f3727C;
            rect = this.f3726B;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f2) {
                    textView = textView2;
                    f2 = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f3728D);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f3731G, this.f3732H, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f3737M.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        m2143m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f3736L / Math.max(Math.max(this.f3734J / displayMetrics.heightPixels, this.f3735K / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
