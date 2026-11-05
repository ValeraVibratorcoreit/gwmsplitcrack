package p068f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.d */
/* loaded from: classes.dex */
public final class C0802d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f4039a = 1;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0792W f4040b;

    /* renamed from: c */
    public final /* synthetic */ View f4041c;

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f4042d;

    /* renamed from: e */
    public final /* synthetic */ C0811i f4043e;

    public C0802d(C0811i c0811i, AbstractC0792W abstractC0792W, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4043e = c0811i;
        this.f4040b = abstractC0792W;
        this.f4042d = viewPropertyAnimator;
        this.f4041c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4039a) {
            case 1:
                this.f4041c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4039a) {
            case 0:
                this.f4042d.setListener(null);
                this.f4041c.setAlpha(1.0f);
                C0811i c0811i = this.f4043e;
                AbstractC0792W abstractC0792W = this.f4040b;
                c0811i.m2209c(abstractC0792W);
                c0811i.f4102q.remove(abstractC0792W);
                c0811i.m2306i();
                break;
            default:
                this.f4042d.setListener(null);
                C0811i c0811i2 = this.f4043e;
                AbstractC0792W abstractC0792W2 = this.f4040b;
                c0811i2.m2209c(abstractC0792W2);
                c0811i2.f4100o.remove(abstractC0792W2);
                c0811i2.m2306i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4039a) {
            case 0:
                this.f4043e.getClass();
                break;
            default:
                this.f4043e.getClass();
                break;
        }
    }

    public C0802d(C0811i c0811i, AbstractC0792W abstractC0792W, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4043e = c0811i;
        this.f4040b = abstractC0792W;
        this.f4041c = view;
        this.f4042d = viewPropertyAnimator;
    }
}
