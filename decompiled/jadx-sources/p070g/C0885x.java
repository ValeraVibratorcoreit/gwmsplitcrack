package p070g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p010D1.AbstractC0088l;
import p076j.C0954c;

/* renamed from: g.x */
/* loaded from: classes.dex */
public final class C0885x extends ContentFrameLayout {

    /* renamed from: n */
    public final /* synthetic */ LayoutInflaterFactory2C0887z f4396n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0885x(LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z, C0954c c0954c) {
        super(c0954c, null);
        this.f4396n = layoutInflaterFactory2C0887z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4396n.m2454t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = this.f4396n;
                layoutInflaterFactory2C0887z.m2453r(layoutInflaterFactory2C0887z.m2459y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC0088l.m257D(getContext(), i));
    }
}
