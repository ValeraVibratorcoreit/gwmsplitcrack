package p022K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p006C.C0058f;

/* renamed from: K.a0 */
/* loaded from: classes.dex */
public final class C0179a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0195i0 f485a;

    /* renamed from: b */
    public final /* synthetic */ C0221v0 f486b;

    /* renamed from: c */
    public final /* synthetic */ C0221v0 f487c;

    /* renamed from: d */
    public final /* synthetic */ int f488d;

    /* renamed from: e */
    public final /* synthetic */ View f489e;

    public C0179a0(C0195i0 c0195i0, C0221v0 c0221v0, C0221v0 c0221v02, int i, View view) {
        this.f485a = c0195i0;
        this.f486b = c0221v0;
        this.f487c = c0221v02;
        this.f488d = i;
        this.f489e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        C0195i0 c0195i0;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0195i0 c0195i02 = this.f485a;
        c0195i02.f526a.mo583d(animatedFraction);
        float mo581b = c0195i02.f526a.mo581b();
        PathInterpolator pathInterpolator = C0185d0.f504e;
        int i = Build.VERSION.SDK_INT;
        C0221v0 c0221v0 = this.f486b;
        AbstractC0205n0 c0203m0 = i >= 30 ? new C0203m0(c0221v0) : i >= 29 ? new C0201l0(c0221v0) : new C0199k0(c0221v0);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.f488d & i2;
            C0217t0 c0217t0 = c0221v0.f573a;
            if (i3 == 0) {
                c0203m0.mo641c(i2, c0217t0.mo654f(i2));
                f2 = mo581b;
                c0195i0 = c0195i02;
            } else {
                C0058f mo654f = c0217t0.mo654f(i2);
                C0058f mo654f2 = this.f487c.f573a.mo654f(i2);
                int i4 = (int) (((mo654f.f203a - mo654f2.f203a) * r10) + 0.5d);
                int i5 = (int) (((mo654f.f204b - mo654f2.f204b) * r10) + 0.5d);
                f2 = mo581b;
                int i6 = (int) (((mo654f.f205c - mo654f2.f205c) * r10) + 0.5d);
                float f3 = (mo654f.f206d - mo654f2.f206d) * (1.0f - mo581b);
                c0195i0 = c0195i02;
                c0203m0.mo641c(i2, C0221v0.m679e(mo654f, i4, i5, i6, (int) (f3 + 0.5d)));
            }
            i2 <<= 1;
            mo581b = f2;
            c0195i02 = c0195i0;
        }
        C0185d0.m545g(this.f489e, c0203m0.mo614b(), Collections.singletonList(c0195i02));
    }
}
