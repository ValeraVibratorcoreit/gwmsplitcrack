package p109u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: u0.A */
/* loaded from: classes.dex */
public final class C1468A extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ float f7165a;

    /* renamed from: b */
    public final /* synthetic */ float f7166b;

    /* renamed from: c */
    public final /* synthetic */ RunnableC1578v f7167c;

    /* renamed from: d */
    public final /* synthetic */ C1474D f7168d;

    public C1468A(C1474D c1474d, float f2, float f3, RunnableC1578v runnableC1578v) {
        this.f7168d = c1474d;
        this.f7165a = f2;
        this.f7166b = f3;
        this.f7167c = runnableC1578v;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1474D c1474d = this.f7168d;
        c1474d.f7236Y0 = null;
        c1474d.f7230V0 = this.f7165a;
        c1474d.f7232W0 = this.f7166b;
        c1474d.m3577u();
        RunnableC1578v runnableC1578v = this.f7167c;
        if (runnableC1578v != null) {
            runnableC1578v.run();
        }
    }
}
