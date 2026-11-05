package p068f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: f0.k */
/* loaded from: classes.dex */
public final class C0813k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f4105a = false;

    /* renamed from: b */
    public final /* synthetic */ C0814l f4106b;

    public C0813k(C0814l c0814l) {
        this.f4106b = c0814l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4105a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f4105a) {
            this.f4105a = false;
            return;
        }
        C0814l c0814l = this.f4106b;
        if (((Float) c0814l.f4136z.getAnimatedValue()).floatValue() == 0.0f) {
            c0814l.f4109A = 0;
            c0814l.m2313f(0);
        } else {
            c0814l.f4109A = 2;
            c0814l.f4129s.invalidate();
        }
    }
}
