package p077j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p121y0.AbstractC1680h;

/* renamed from: j0.C */
/* loaded from: classes.dex */
public final class C0967C extends AnimatorListenerAdapter implements InterfaceC0980k {

    /* renamed from: a */
    public final View f4637a;

    /* renamed from: b */
    public final int f4638b;

    /* renamed from: c */
    public final ViewGroup f4639c;

    /* renamed from: e */
    public boolean f4641e;

    /* renamed from: f */
    public boolean f4642f = false;

    /* renamed from: d */
    public final boolean f4640d = true;

    public C0967C(View view, int i) {
        this.f4637a = view;
        this.f4638b = i;
        this.f4639c = (ViewGroup) view.getParent();
        m2519g(true);
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
    /* renamed from: d */
    public final void mo2516d() {
        m2519g(false);
        if (this.f4642f) {
            return;
        }
        AbstractC0991v.m2569b(this.f4637a, this.f4638b);
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: e */
    public final void mo2517e(AbstractC0982m abstractC0982m) {
        abstractC0982m.mo2536x(this);
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: f */
    public final void mo2518f() {
        m2519g(true);
        if (this.f4642f) {
            return;
        }
        AbstractC0991v.m2569b(this.f4637a, 0);
    }

    /* renamed from: g */
    public final void m2519g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f4640d || this.f4641e == z2 || (viewGroup = this.f4639c) == null) {
            return;
        }
        this.f4641e = z2;
        AbstractC1680h.m4861W(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4642f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f4642f) {
            AbstractC0991v.m2569b(this.f4637a, this.f4638b);
            ViewGroup viewGroup = this.f4639c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2519g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            AbstractC0991v.m2569b(this.f4637a, 0);
            ViewGroup viewGroup = this.f4639c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f4642f) {
            AbstractC0991v.m2569b(this.f4637a, this.f4638b);
            ViewGroup viewGroup = this.f4639c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2519g(false);
    }
}
