package p098q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* renamed from: q0.g1 */
/* loaded from: classes.dex */
public final class C1318g1 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f6124a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f6125b;

    /* renamed from: c */
    public final /* synthetic */ C1324i1 f6126c;

    public C1318g1(C1324i1 c1324i1, int i, FrameLayout frameLayout) {
        this.f6126c = c1324i1;
        this.f6124a = i;
        this.f6125b = frameLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1324i1 c1324i1 = this.f6126c;
        if (this.f6124a != c1324i1.f6231l) {
            return;
        }
        FrameLayout frameLayout = this.f6125b;
        frameLayout.setVisibility(4);
        frameLayout.setAlpha(1.0f);
        frameLayout.setScaleX(1.0f);
        frameLayout.setScaleY(1.0f);
        c1324i1.f6229k = null;
    }
}
