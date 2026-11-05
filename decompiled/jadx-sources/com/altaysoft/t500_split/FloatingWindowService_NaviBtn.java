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
import com.google.android.material.datepicker.ViewOnClickListenerC0669j;
import p098q0.ViewOnTouchListenerC1257F;

/* loaded from: classes.dex */
public class FloatingWindowService_NaviBtn extends Service {

    /* renamed from: f */
    public final cfgData f2275f = cfgData.m1784i();

    /* renamed from: g */
    public WindowManager f2276g;

    /* renamed from: h */
    public View f2277h;

    /* renamed from: i */
    public Button f2278i;

    /* renamed from: j */
    public SharedPreferences f2279j;

    /* renamed from: k */
    public WindowManager.LayoutParams f2280k;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f2279j = getSharedPreferences("T500_SPLIT_AS", 0);
        this.f2276g = (WindowManager) getSystemService("window");
        this.f2277h = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.floating_window_navi_btn, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2038, 8, -3);
        this.f2280k = layoutParams;
        layoutParams.gravity = 8388659;
        layoutParams.width = 64;
        layoutParams.height = 64;
        layoutParams.x = this.f2279j.getInt("navi_button_pos_x", 90);
        this.f2280k.y = this.f2279j.getInt("navi_button_pos_y", 1100);
        this.f2276g.addView(this.f2277h, this.f2280k);
        this.f2278i = (Button) this.f2277h.findViewById(R.id.floating_button_navi);
        View view = this.f2277h;
        if (view != null) {
            view.setForeground(getDrawable(this.f2275f.f2553O2 ? R.drawable.mpng_speed_a : R.drawable.mpng_speed));
        }
        this.f2278i.setOnClickListener(new ViewOnClickListenerC0669j(4, this));
        this.f2277h.setOnTouchListener(new ViewOnTouchListenerC1257F(this));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        View view = this.f2277h;
        if (view != null) {
            this.f2276g.removeView(view);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        View view = this.f2277h;
        if (view == null) {
            return 1;
        }
        view.setForeground(getDrawable(this.f2275f.f2553O2 ? R.drawable.mpng_speed_a : R.drawable.mpng_speed));
        return 1;
    }
}
