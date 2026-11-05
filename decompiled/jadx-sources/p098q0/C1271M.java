package p098q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p109u0.C1518Z0;

/* renamed from: q0.M */
/* loaded from: classes.dex */
public final class C1271M extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f5785a;

    /* renamed from: b */
    public final /* synthetic */ float f5786b;

    /* renamed from: c */
    public final /* synthetic */ Object f5787c;

    public /* synthetic */ C1271M(Object obj, float f2, int i) {
        this.f5785a = i;
        this.f5787c = obj;
        this.f5786b = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5785a) {
            case 0:
                ((C1275O) this.f5787c).f5832Q0 = null;
                break;
            default:
                ((C1518Z0) this.f5787c).f8013Z = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5785a) {
            case 0:
                C1275O c1275o = (C1275O) this.f5787c;
                c1275o.f5832Q0 = null;
                c1275o.m3067U(this.f5786b);
                break;
            default:
                C1518Z0 c1518z0 = (C1518Z0) this.f5787c;
                c1518z0.f8013Z = null;
                c1518z0.m4103N(this.f5786b);
                break;
        }
    }
}
