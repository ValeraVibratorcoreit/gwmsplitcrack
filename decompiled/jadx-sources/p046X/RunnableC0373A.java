package p046X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p022K.ViewTreeObserverOnPreDrawListenerC0216t;

/* renamed from: X.A */
/* loaded from: classes.dex */
public final class RunnableC0373A extends AnimationSet implements Runnable {

    /* renamed from: a */
    public final ViewGroup f1110a;

    /* renamed from: b */
    public final View f1111b;

    /* renamed from: c */
    public boolean f1112c;

    /* renamed from: d */
    public boolean f1113d;

    /* renamed from: e */
    public boolean f1114e;

    public RunnableC0373A(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1114e = true;
        this.f1110a = viewGroup;
        this.f1111b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1114e = true;
        if (this.f1112c) {
            return !this.f1113d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1112c = true;
            ViewTreeObserverOnPreDrawListenerC0216t.m674a(this.f1110a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1112c;
        ViewGroup viewGroup = this.f1110a;
        if (z2 || !this.f1114e) {
            viewGroup.endViewTransition(this.f1111b);
            this.f1113d = true;
        } else {
            this.f1114e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1114e = true;
        if (this.f1112c) {
            return !this.f1113d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1112c = true;
            ViewTreeObserverOnPreDrawListenerC0216t.m674a(this.f1110a, this);
        }
        return true;
    }
}
