package p098q0;

import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.altaysoft.t500_split.FloatingWindowService_NaviBtn;

/* renamed from: q0.F */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1257F implements View.OnTouchListener {

    /* renamed from: f */
    public int f5708f;

    /* renamed from: g */
    public int f5709g;

    /* renamed from: h */
    public float f5710h;

    /* renamed from: i */
    public float f5711i;

    /* renamed from: j */
    public final /* synthetic */ FloatingWindowService_NaviBtn f5712j;

    public ViewOnTouchListenerC1257F(FloatingWindowService_NaviBtn floatingWindowService_NaviBtn) {
        this.f5712j = floatingWindowService_NaviBtn;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        FloatingWindowService_NaviBtn floatingWindowService_NaviBtn = this.f5712j;
        if (action == 0) {
            WindowManager.LayoutParams layoutParams = floatingWindowService_NaviBtn.f2280k;
            this.f5708f = layoutParams.x;
            this.f5709g = layoutParams.y;
            this.f5710h = motionEvent.getRawX();
            this.f5711i = motionEvent.getRawY();
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            floatingWindowService_NaviBtn.f2280k.x = this.f5708f + ((int) (motionEvent.getRawX() - this.f5710h));
            floatingWindowService_NaviBtn.f2280k.y = this.f5709g + ((int) (motionEvent.getRawY() - this.f5711i));
            floatingWindowService_NaviBtn.f2276g.updateViewLayout(floatingWindowService_NaviBtn.f2277h, floatingWindowService_NaviBtn.f2280k);
            return true;
        }
        WindowManager.LayoutParams layoutParams2 = floatingWindowService_NaviBtn.f2280k;
        int i = layoutParams2.x;
        int i2 = layoutParams2.y;
        SharedPreferences.Editor edit = floatingWindowService_NaviBtn.f2279j.edit();
        edit.putInt("navi_button_pos_x", i);
        edit.putInt("navi_button_pos_y", i2);
        edit.apply();
        return true;
    }
}
