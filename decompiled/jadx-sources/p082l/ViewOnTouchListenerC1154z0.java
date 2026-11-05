package p082l;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: l.z0 */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1154z0 implements View.OnTouchListener {

    /* renamed from: f */
    public final /* synthetic */ C1050A0 f5295f;

    public ViewOnTouchListenerC1154z0(C1050A0 c1050a0) {
        this.f5295f = c1050a0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1049A c1049a;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        C1050A0 c1050a0 = this.f5295f;
        if (action == 0 && (c1049a = c1050a0.f4999E) != null && c1049a.isShowing() && x2 >= 0 && x2 < c1050a0.f4999E.getWidth() && y2 >= 0 && y2 < c1050a0.f4999E.getHeight()) {
            c1050a0.f4995A.postDelayed(c1050a0.f5017w, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c1050a0.f4995A.removeCallbacks(c1050a0.f5017w);
        return false;
    }
}
