package com.altaysoft.t500_split;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import p098q0.ViewOnClickListenerC1252D;
import p098q0.ViewOnTouchListenerC1255E;

/* loaded from: classes.dex */
public class FloatingWindowService_BackBtn extends Service {

    /* renamed from: f */
    public WindowManager f2272f;

    /* renamed from: g */
    public View f2273g;

    /* renamed from: h */
    public SharedPreferences f2274h;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f2274h = getSharedPreferences("T500_SPLIT_AS", 0);
        this.f2272f = (WindowManager) getSystemService("window");
        this.f2273g = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.floating_window_back_btn, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2038, 8, -3);
        layoutParams.gravity = 8388659;
        layoutParams.width = 64;
        layoutParams.height = 64;
        layoutParams.x = this.f2274h.getInt("back_button_pos_x", 5);
        layoutParams.y = this.f2274h.getInt("back_button_pos_y", 1100);
        this.f2272f.addView(this.f2273g, layoutParams);
        ((Button) this.f2273g.findViewById(R.id.floating_button)).setOnClickListener(new ViewOnClickListenerC1252D(0));
        this.f2273g.setOnTouchListener(new ViewOnTouchListenerC1255E(this, layoutParams, 0));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        View view = this.f2273g;
        if (view != null) {
            this.f2272f.removeView(view);
        }
    }
}
