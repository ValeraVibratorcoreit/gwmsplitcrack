package p118x0;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.altaysoft.t500_split.splitinfo.WeatherFullscreenActivity;

/* renamed from: x0.A */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC1643A implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = WeatherFullscreenActivity.f3250V;
        ViewParent parent = view.getParent();
        if (parent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 2) {
                parent.requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 1 || actionMasked == 3) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
        return false;
    }
}
