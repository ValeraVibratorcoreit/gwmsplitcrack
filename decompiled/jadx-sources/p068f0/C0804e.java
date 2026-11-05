package p068f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: f0.e */
/* loaded from: classes.dex */
public final class C0804e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0792W f4054a;

    /* renamed from: b */
    public final /* synthetic */ int f4055b;

    /* renamed from: c */
    public final /* synthetic */ View f4056c;

    /* renamed from: d */
    public final /* synthetic */ int f4057d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f4058e;

    /* renamed from: f */
    public final /* synthetic */ C0811i f4059f;

    public C0804e(C0811i c0811i, AbstractC0792W abstractC0792W, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4059f = c0811i;
        this.f4054a = abstractC0792W;
        this.f4055b = i;
        this.f4056c = view;
        this.f4057d = i2;
        this.f4058e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f4055b;
        View view = this.f4056c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4057d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4058e.setListener(null);
        C0811i c0811i = this.f4059f;
        AbstractC0792W abstractC0792W = this.f4054a;
        c0811i.m2209c(abstractC0792W);
        c0811i.f4101p.remove(abstractC0792W);
        c0811i.m2306i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4059f.getClass();
    }
}
