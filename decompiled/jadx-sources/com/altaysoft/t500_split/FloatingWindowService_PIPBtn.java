package com.altaysoft.t500_split;

import android.app.Service;
import android.content.Intent;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import p098q0.ViewOnClickListenerC1252D;
import p098q0.ViewOnTouchListenerC1255E;

/* loaded from: classes.dex */
public class FloatingWindowService_PIPBtn extends Service {

    /* renamed from: f */
    public WindowManager f2281f;

    /* renamed from: g */
    public View f2282g;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        Rect rect;
        super.onCreate();
        this.f2281f = (WindowManager) getSystemService("window");
        this.f2282g = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.floating_window_pip_btn, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2038, 8, -3);
        layoutParams.gravity = 8388659;
        layoutParams.width = 64;
        layoutParams.height = 64;
        layoutParams.x = 5;
        layoutParams.y = 1100;
        MyAccessibilityService myAccessibilityService = MyAccessibilityService.f2328m;
        if (myAccessibilityService != null && (rect = myAccessibilityService.f2331h) != null) {
            layoutParams.x = rect.right - 192;
            layoutParams.y = rect.bottom - 124;
        }
        this.f2281f.addView(this.f2282g, layoutParams);
        ((Button) this.f2282g.findViewById(R.id.floating_button)).setOnClickListener(new ViewOnClickListenerC1252D(1));
        this.f2282g.setOnTouchListener(new ViewOnTouchListenerC1255E(this, layoutParams, 1));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        View view = this.f2282g;
        if (view != null) {
            this.f2281f.removeView(view);
        }
    }
}
