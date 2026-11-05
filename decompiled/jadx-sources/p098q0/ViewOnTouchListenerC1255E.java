package p098q0;

import android.app.Service;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.altaysoft.t500_split.FloatingWindowService_BackBtn;
import com.altaysoft.t500_split.FloatingWindowService_PIPBtn;

/* renamed from: q0.E */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1255E implements View.OnTouchListener {

    /* renamed from: f */
    public final /* synthetic */ int f5677f;

    /* renamed from: g */
    public int f5678g;

    /* renamed from: h */
    public int f5679h;

    /* renamed from: i */
    public float f5680i;

    /* renamed from: j */
    public float f5681j;

    /* renamed from: k */
    public final /* synthetic */ WindowManager.LayoutParams f5682k;

    /* renamed from: l */
    public final /* synthetic */ Service f5683l;

    public /* synthetic */ ViewOnTouchListenerC1255E(Service service, WindowManager.LayoutParams layoutParams, int i) {
        this.f5677f = i;
        this.f5683l = service;
        this.f5682k = layoutParams;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f5677f) {
            case 0:
                int action = motionEvent.getAction();
                WindowManager.LayoutParams layoutParams = this.f5682k;
                if (action == 0) {
                    this.f5678g = layoutParams.x;
                    this.f5679h = layoutParams.y;
                    this.f5680i = motionEvent.getRawX();
                    this.f5681j = motionEvent.getRawY();
                    break;
                } else {
                    FloatingWindowService_BackBtn floatingWindowService_BackBtn = (FloatingWindowService_BackBtn) this.f5683l;
                    if (action == 1) {
                        int i = layoutParams.x;
                        int i2 = layoutParams.y;
                        SharedPreferences.Editor edit = floatingWindowService_BackBtn.f2274h.edit();
                        edit.putInt("back_button_pos_x", i);
                        edit.putInt("back_button_pos_y", i2);
                        edit.apply();
                        break;
                    } else if (action == 2) {
                        layoutParams.x = this.f5678g + ((int) (motionEvent.getRawX() - this.f5680i));
                        layoutParams.y = this.f5679h + ((int) (motionEvent.getRawY() - this.f5681j));
                        floatingWindowService_BackBtn.f2272f.updateViewLayout(floatingWindowService_BackBtn.f2273g, layoutParams);
                        break;
                    }
                }
                break;
            default:
                int action2 = motionEvent.getAction();
                WindowManager.LayoutParams layoutParams2 = this.f5682k;
                if (action2 == 0) {
                    this.f5678g = layoutParams2.x;
                    this.f5679h = layoutParams2.y;
                    this.f5680i = motionEvent.getRawX();
                    this.f5681j = motionEvent.getRawY();
                    break;
                } else if (action2 != 1) {
                    if (action2 == 2) {
                        layoutParams2.x = this.f5678g + ((int) (motionEvent.getRawX() - this.f5680i));
                        layoutParams2.y = this.f5679h + ((int) (motionEvent.getRawY() - this.f5681j));
                        FloatingWindowService_PIPBtn floatingWindowService_PIPBtn = (FloatingWindowService_PIPBtn) this.f5683l;
                        floatingWindowService_PIPBtn.f2281f.updateViewLayout(floatingWindowService_PIPBtn.f2282g, layoutParams2);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
