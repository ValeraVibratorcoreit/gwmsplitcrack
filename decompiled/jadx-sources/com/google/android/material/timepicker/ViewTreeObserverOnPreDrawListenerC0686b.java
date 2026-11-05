package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0686b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f */
    public final /* synthetic */ ClockFaceView f3756f;

    public ViewTreeObserverOnPreDrawListenerC0686b(ClockFaceView clockFaceView) {
        this.f3756f = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3756f;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f3725A.f3743i) - clockFaceView.f3733I;
        if (height != clockFaceView.f3759y) {
            clockFaceView.f3759y = height;
            clockFaceView.mo2142l();
            int i = clockFaceView.f3759y;
            ClockHandView clockHandView = clockFaceView.f3725A;
            clockHandView.f3751q = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
