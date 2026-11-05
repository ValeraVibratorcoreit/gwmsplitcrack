package p098q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: q0.R0 */
/* loaded from: classes.dex */
public final class C1281R0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f5940a;

    /* renamed from: b */
    public final /* synthetic */ ValueAnimator f5941b;

    /* renamed from: c */
    public final /* synthetic */ int f5942c;

    /* renamed from: d */
    public final /* synthetic */ C1287U0 f5943d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f5944e;

    public /* synthetic */ C1281R0(C1287U0 c1287u0, ValueAnimator valueAnimator, int i, Runnable runnable, int i2) {
        this.f5940a = i2;
        this.f5943d = c1287u0;
        this.f5941b = valueAnimator;
        this.f5942c = i;
        this.f5944e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RunnableC1272M0 runnableC1272M0;
        Runnable runnable;
        switch (this.f5940a) {
            case 0:
                C1287U0 c1287u0 = this.f5943d;
                if (c1287u0.f5985p == this.f5941b) {
                    c1287u0.f5985p = null;
                }
                if (this.f5942c == c1287u0.f5989t && (runnableC1272M0 = (RunnableC1272M0) this.f5944e) != null) {
                    runnableC1272M0.run();
                    break;
                }
                break;
            default:
                C1287U0 c1287u02 = this.f5943d;
                if (c1287u02.f5962C == this.f5941b) {
                    c1287u02.f5962C = null;
                }
                if (this.f5942c == c1287u02.f5965F && (runnable = this.f5944e) != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
