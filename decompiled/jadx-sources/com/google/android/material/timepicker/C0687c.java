package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.altaysoft.t500_split.R;
import p022K.C0180b;
import p024L.C0235e;
import p024L.C0239i;
import p024L.C0240j;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public final class C0687c extends C0180b {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f3757d;

    public C0687c(ClockFaceView clockFaceView) {
        this.f3757d = clockFaceView;
    }

    @Override // p022K.C0180b
    /* renamed from: d */
    public final void mo400d(View view, C0240j c0240j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f491a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f3757d.f3729E.get(intValue - 1));
        }
        c0240j.m735h(C0239i.m727a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        c0240j.m730b(C0235e.f614e);
    }

    @Override // p022K.C0180b
    /* renamed from: g */
    public final boolean mo531g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo531g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f3757d;
        view.getHitRect(clockFaceView.f3726B);
        float centerX = clockFaceView.f3726B.centerX();
        float centerY = clockFaceView.f3726B.centerY();
        clockFaceView.f3725A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f3725A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
