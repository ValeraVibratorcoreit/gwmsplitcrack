package p028N0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: N0.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0258a implements View.OnTouchListener {

    /* renamed from: f */
    public final Dialog f698f;

    /* renamed from: g */
    public final int f699g;

    /* renamed from: h */
    public final int f700h;

    public ViewOnTouchListenerC0258a(Dialog dialog, Rect rect) {
        this.f698f = dialog;
        this.f699g = rect.left;
        this.f700h = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f699g;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f700h, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.f698f.onTouchEvent(obtain);
    }
}
