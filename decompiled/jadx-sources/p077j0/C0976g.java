package p077j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.altaysoft.t500_split.R;

/* renamed from: j0.g */
/* loaded from: classes.dex */
public final class C0976g extends AnimatorListenerAdapter implements InterfaceC0980k {

    /* renamed from: a */
    public final View f4675a;

    /* renamed from: b */
    public boolean f4676b = false;

    public C0976g(View view) {
        this.f4675a = view;
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: a */
    public final void mo2514a(AbstractC0982m abstractC0982m) {
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: b */
    public final void mo2515b(AbstractC0982m abstractC0982m) {
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: c */
    public final void mo2542c(AbstractC0982m abstractC0982m) {
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: d */
    public final void mo2516d() {
        View view = this.f4675a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0991v.f4728a.mo2513v(view) : 0.0f));
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: e */
    public final void mo2517e(AbstractC0982m abstractC0982m) {
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: f */
    public final void mo2518f() {
        this.f4675a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0991v.f4728a.mo2512Z(this.f4675a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f4675a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f4676b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f4676b;
        View view = this.f4675a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0965A c0965a = AbstractC0991v.f4728a;
        c0965a.mo2512Z(view, 1.0f);
        c0965a.getClass();
    }
}
