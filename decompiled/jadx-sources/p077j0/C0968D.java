package p077j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.altaysoft.t500_split.R;

/* renamed from: j0.D */
/* loaded from: classes.dex */
public final class C0968D extends AnimatorListenerAdapter implements InterfaceC0980k {

    /* renamed from: a */
    public final FrameLayout f4643a;

    /* renamed from: b */
    public final View f4644b;

    /* renamed from: c */
    public final View f4645c;

    /* renamed from: d */
    public boolean f4646d = true;

    /* renamed from: e */
    public final /* synthetic */ C0977h f4647e;

    public C0968D(C0977h c0977h, FrameLayout frameLayout, View view, View view2) {
        this.f4647e = c0977h;
        this.f4643a = frameLayout;
        this.f4644b = view;
        this.f4645c = view2;
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: a */
    public final void mo2514a(AbstractC0982m abstractC0982m) {
        if (this.f4646d) {
            m2520g();
        }
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: b */
    public final void mo2515b(AbstractC0982m abstractC0982m) {
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: d */
    public final void mo2516d() {
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: e */
    public final void mo2517e(AbstractC0982m abstractC0982m) {
        abstractC0982m.mo2536x(this);
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: f */
    public final void mo2518f() {
    }

    /* renamed from: g */
    public final void m2520g() {
        this.f4645c.setTag(R.id.save_overlay_view, null);
        this.f4643a.getOverlay().remove(this.f4644b);
        this.f4646d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2520g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f4643a.getOverlay().remove(this.f4644b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f4644b;
        if (view.getParent() == null) {
            this.f4643a.getOverlay().add(view);
        } else {
            this.f4647e.mo2529c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f4645c;
            View view2 = this.f4644b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f4643a.getOverlay().add(view2);
            this.f4646d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        m2520g();
    }
}
