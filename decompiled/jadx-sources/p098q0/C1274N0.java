package p098q0;

import android.animation.ValueAnimator;

/* renamed from: q0.N0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1274N0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f5793a;

    /* renamed from: b */
    public final /* synthetic */ C1287U0 f5794b;

    /* renamed from: c */
    public final /* synthetic */ int f5795c;

    public /* synthetic */ C1274N0(C1287U0 c1287u0, int i, int i2) {
        this.f5793a = i2;
        this.f5794b = c1287u0;
        this.f5795c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5793a) {
            case 0:
                C1287U0 c1287u0 = this.f5794b;
                if (this.f5795c == c1287u0.f5965F) {
                    c1287u0.m3113k(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
                }
                break;
            default:
                C1287U0 c1287u02 = this.f5794b;
                if (this.f5795c == c1287u02.f5989t) {
                    c1287u02.m3112j(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
                }
                break;
        }
    }
}
