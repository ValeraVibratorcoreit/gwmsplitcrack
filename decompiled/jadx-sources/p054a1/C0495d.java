package p054a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: a1.d */
/* loaded from: classes.dex */
public final class C0495d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f1553a;

    /* renamed from: b */
    public final /* synthetic */ C0496e f1554b;

    public /* synthetic */ C0495d(C0496e c0496e, int i) {
        this.f1553a = i;
        this.f1554b = c0496e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1553a) {
            case 1:
                this.f1554b.f1614b.m1229h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1553a) {
            case 0:
                this.f1554b.f1614b.m1229h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
