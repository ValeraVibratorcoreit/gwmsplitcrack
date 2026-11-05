package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.altaysoft.t500_split.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p007C0.AbstractC0067a;
import p013F0.C0097a;
import p117x.AbstractC1636a;
import p121y0.AbstractC1680h;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC1636a {

    /* renamed from: b */
    public int f3350b;

    /* renamed from: c */
    public int f3351c;

    /* renamed from: d */
    public TimeInterpolator f3352d;

    /* renamed from: e */
    public TimeInterpolator f3353e;

    /* renamed from: h */
    public ViewPropertyAnimator f3356h;

    /* renamed from: a */
    public final LinkedHashSet f3349a = new LinkedHashSet();

    /* renamed from: f */
    public int f3354f = 0;

    /* renamed from: g */
    public int f3355g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: g */
    public boolean mo215g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f3354f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f3350b = AbstractC1680h.m4851M(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3351c = AbstractC1680h.m4851M(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3352d = AbstractC1680h.m4852N(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0067a.f227d);
        this.f3353e = AbstractC1680h.m4852N(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0067a.f226c);
        return false;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: k */
    public final void mo2016k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f3349a;
        if (i > 0) {
            if (this.f3355g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f3356h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f3355g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f3356h = view.animate().translationY(this.f3354f).setInterpolator(this.f3353e).setDuration(this.f3351c).setListener(new C0097a(0, this));
            return;
        }
        if (i >= 0 || this.f3355g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f3356h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f3355g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f3356h = view.animate().translationY(0).setInterpolator(this.f3352d).setDuration(this.f3350b).setListener(new C0097a(0, this));
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: o */
    public boolean mo2019o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
