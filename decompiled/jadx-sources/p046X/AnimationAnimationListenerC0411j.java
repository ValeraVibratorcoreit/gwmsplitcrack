package p046X;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import p001A0.RunnableC0005B;
import p107t1.AbstractC1461d;

/* renamed from: X.j */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0411j implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C0401b0 f1290a;

    /* renamed from: b */
    public final /* synthetic */ C0412k f1291b;

    /* renamed from: c */
    public final /* synthetic */ View f1292c;

    /* renamed from: d */
    public final /* synthetic */ C0407f f1293d;

    public AnimationAnimationListenerC0411j(C0407f c0407f, C0412k c0412k, C0401b0 c0401b0, View view) {
        this.f1290a = c0401b0;
        this.f1291b = c0412k;
        this.f1292c = view;
        this.f1293d = c0407f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC1461d.m3494e("animation", animation);
        C0412k c0412k = this.f1291b;
        c0412k.f1294a.post(new RunnableC0005B(c0412k, this.f1292c, this.f1293d, 3));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1290a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC1461d.m3494e("animation", animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC1461d.m3494e("animation", animation);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1290a + " has reached onAnimationStart.");
        }
    }
}
