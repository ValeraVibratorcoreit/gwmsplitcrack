package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.material.timepicker.h */
/* loaded from: classes.dex */
public final class C0692h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerView f3763a;

    public C0692h(TimePickerView timePickerView) {
        this.f3763a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.f3753y;
        this.f3763a.getClass();
        return false;
    }
}
