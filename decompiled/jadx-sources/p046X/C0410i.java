package p046X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p006C.AbstractC0062j;
import p107t1.AbstractC1461d;

/* renamed from: X.i */
/* loaded from: classes.dex */
public final class C0410i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0412k f1285a;

    /* renamed from: b */
    public final /* synthetic */ View f1286b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1287c;

    /* renamed from: d */
    public final /* synthetic */ C0401b0 f1288d;

    /* renamed from: e */
    public final /* synthetic */ C0407f f1289e;

    public C0410i(C0412k c0412k, View view, boolean z2, C0401b0 c0401b0, C0407f c0407f) {
        this.f1285a = c0412k;
        this.f1286b = view;
        this.f1287c = z2;
        this.f1288d = c0401b0;
        this.f1289e = c0407f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC1461d.m3494e("anim", animator);
        ViewGroup viewGroup = this.f1285a.f1294a;
        View view = this.f1286b;
        viewGroup.endViewTransition(view);
        C0401b0 c0401b0 = this.f1288d;
        if (this.f1287c) {
            int i = c0401b0.f1263a;
            AbstractC1461d.m3493d("viewToAnimate", view);
            AbstractC0062j.m147a(view, i);
        }
        this.f1289e.m1085d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + c0401b0 + " has ended.");
        }
    }
}
