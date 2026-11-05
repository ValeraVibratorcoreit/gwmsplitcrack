package p098q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: q0.C0 */
/* loaded from: classes.dex */
public final class C1250C0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f5583a;

    /* renamed from: b */
    public final /* synthetic */ int f5584b;

    /* renamed from: c */
    public final /* synthetic */ C1253D0 f5585c;

    public C1250C0(C1253D0 c1253d0, int i, int i2) {
        this.f5585c = c1253d0;
        this.f5583a = i;
        this.f5584b = i2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5585c.f5647l0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1253D0 c1253d0 = this.f5585c;
        c1253d0.f5647l0 = null;
        c1253d0.m2976o(this.f5583a, this.f5584b);
    }
}
