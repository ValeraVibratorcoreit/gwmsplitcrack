package p098q0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import p001A0.RunnableC0010d;
import p111v.C1592d;

/* renamed from: q0.u0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1359u0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6375a = 0;

    /* renamed from: b */
    public final /* synthetic */ View f6376b;

    /* renamed from: c */
    public final /* synthetic */ float f6377c;

    /* renamed from: d */
    public final /* synthetic */ Object f6378d;

    public /* synthetic */ RunnableC1359u0(RunnableC0010d runnableC0010d, View view, float f2) {
        this.f6378d = runnableC0010d;
        this.f6376b = view;
        this.f6377c = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6375a) {
            case 0:
                ((RunnableC0010d) this.f6378d).run();
                float f2 = this.f6377c;
                View view = this.f6376b;
                view.setTranslationY(f2);
                view.setAlpha(0.35f);
                view.animate().translationY(0.0f).alpha(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                View view2 = this.f6376b;
                if (view2.getLayoutParams() instanceof C1592d) {
                    float height = (r1.getHeight() * 0.5f) + ((View) this.f6378d).getY();
                    C1592d c1592d = (C1592d) view2.getLayoutParams();
                    int round = Math.round(this.f6377c - height);
                    if (((ViewGroup.MarginLayoutParams) c1592d).topMargin != round) {
                        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = round;
                        view2.setLayoutParams(c1592d);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC1359u0(View view, View view2, float f2) {
        this.f6376b = view;
        this.f6378d = view2;
        this.f6377c = f2;
    }
}
