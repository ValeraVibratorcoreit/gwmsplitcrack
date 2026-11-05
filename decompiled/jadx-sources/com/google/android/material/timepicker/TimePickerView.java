package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.altaysoft.t500_split.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: y */
    public static final /* synthetic */ int f3753y = 0;

    /* renamed from: x */
    public final Chip f3754x;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0691g viewOnClickListenerC0691g = new ViewOnClickListenerC0691g(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f3439h.add(new C0690f(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f3754x = chip2;
        ViewOnTouchListenerC0693i viewOnTouchListenerC0693i = new ViewOnTouchListenerC0693i(new GestureDetector(getContext(), new C0692h(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0693i);
        chip2.setOnTouchListener(viewOnTouchListenerC0693i);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0691g);
        chip2.setOnClickListener(viewOnClickListenerC0691g);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f3754x.sendAccessibilityEvent(8);
        }
    }
}
