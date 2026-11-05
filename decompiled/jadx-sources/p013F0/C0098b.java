package p013F0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;

/* renamed from: F0.b */
/* loaded from: classes.dex */
public final class C0098b extends AbstractC0088l {

    /* renamed from: c */
    public int f329c;

    /* renamed from: d */
    public int f330d = -1;

    /* renamed from: e */
    public final /* synthetic */ SwipeDismissBehavior f331e;

    public C0098b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f331e = swipeDismissBehavior;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: P */
    public final int mo293P(View view) {
        return view.getWidth();
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: a0 */
    public final void mo298a0(View view, int i) {
        this.f330d = i;
        this.f329c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f331e;
            swipeDismissBehavior.f3359c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f3359c = false;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: b0 */
    public final void mo300b0(int i) {
        this.f331e.getClass();
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: c0 */
    public final void mo302c0(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f331e;
        float f2 = width * swipeDismissBehavior.f3361e;
        float width2 = view.getWidth() * swipeDismissBehavior.f3362f;
        float abs = Math.abs(i - this.f329c);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // p010D1.AbstractC0088l
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo303d0(View view, float f2, float f3) {
        int i;
        this.f330d = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f331e;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.f3360d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f329c;
                    z2 = false;
                } else {
                    i = this.f329c;
                    z2 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f329c;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f329c - width;
        } else {
            int left2 = view.getLeft() - this.f329c;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f3357a.m871o(i, view.getTop())) {
            RunnableC0099c runnableC0099c = new RunnableC0099c(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
            view.postOnAnimation(runnableC0099c);
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: r */
    public final int mo317r(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f331e.f3360d;
        if (i2 == 0) {
            if (z2) {
                width = this.f329c - view.getWidth();
                width2 = this.f329c;
            } else {
                width = this.f329c;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f329c - view.getWidth();
            width2 = view.getWidth() + this.f329c;
        } else if (z2) {
            width = this.f329c;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f329c - view.getWidth();
            width2 = this.f329c;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: s */
    public final int mo318s(View view, int i) {
        return view.getTop();
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: s0 */
    public final boolean mo319s0(View view, int i) {
        int i2 = this.f330d;
        return (i2 == -1 || i2 == i) && this.f331e.mo2027r(view);
    }
}
