package p068f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.f */
/* loaded from: classes.dex */
public final class C0806f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f4066a;

    /* renamed from: b */
    public final /* synthetic */ C0808g f4067b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f4068c;

    /* renamed from: d */
    public final /* synthetic */ View f4069d;

    /* renamed from: e */
    public final /* synthetic */ C0811i f4070e;

    public /* synthetic */ C0806f(C0811i c0811i, C0808g c0808g, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f4066a = i;
        this.f4070e = c0811i;
        this.f4067b = c0808g;
        this.f4068c = viewPropertyAnimator;
        this.f4069d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4066a) {
            case 0:
                this.f4068c.setListener(null);
                View view = this.f4069d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0808g c0808g = this.f4067b;
                AbstractC0792W abstractC0792W = c0808g.f4076a;
                C0811i c0811i = this.f4070e;
                c0811i.m2209c(abstractC0792W);
                c0811i.f4103r.remove(c0808g.f4076a);
                c0811i.m2306i();
                break;
            default:
                this.f4068c.setListener(null);
                View view2 = this.f4069d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0808g c0808g2 = this.f4067b;
                AbstractC0792W abstractC0792W2 = c0808g2.f4077b;
                C0811i c0811i2 = this.f4070e;
                c0811i2.m2209c(abstractC0792W2);
                c0811i2.f4103r.remove(c0808g2.f4077b);
                c0811i2.m2306i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4066a) {
            case 0:
                AbstractC0792W abstractC0792W = this.f4067b.f4076a;
                this.f4070e.getClass();
                break;
            default:
                AbstractC0792W abstractC0792W2 = this.f4067b.f4077b;
                this.f4070e.getClass();
                break;
        }
    }
}
