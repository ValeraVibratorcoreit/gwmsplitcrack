package p017H0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import p045W0.C0356f;
import p045W0.C0357g;
import p068f0.C0814l;

/* renamed from: H0.c */
/* loaded from: classes.dex */
public final class C0124c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f384a;

    /* renamed from: b */
    public final /* synthetic */ Object f385b;

    public /* synthetic */ C0124c(int i, Object obj) {
        this.f384a = i;
        this.f385b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f384a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0357g c0357g = ((BottomSheetBehavior) this.f385b).f3402i;
                if (c0357g != null) {
                    C0356f c0356f = c0357g.f1026f;
                    if (c0356f.f1016i != floatValue) {
                        c0356f.f1016i = floatValue;
                        c0357g.f1030j = true;
                        c0357g.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                ((TabLayout) this.f385b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 2:
                ((TextInputLayout) this.f385b).f3647A0.m833k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0814l c0814l = (C0814l) this.f385b;
                c0814l.f4113c.setAlpha(floatValue2);
                c0814l.f4114d.setAlpha(floatValue2);
                c0814l.f4129s.invalidate();
                break;
        }
    }
}
