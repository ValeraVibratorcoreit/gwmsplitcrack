package p051Z0;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: Z0.d */
/* loaded from: classes.dex */
public final class C0446d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f1421a;

    /* renamed from: b */
    public final /* synthetic */ View f1422b;

    /* renamed from: c */
    public final /* synthetic */ C0447e f1423c;

    public C0446d(C0447e c0447e, View view, View view2) {
        this.f1423c = c0447e;
        this.f1421a = view;
        this.f1422b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1423c.m1149c(this.f1421a, this.f1422b, valueAnimator.getAnimatedFraction());
    }
}
