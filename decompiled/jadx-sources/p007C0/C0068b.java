package p007C0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p091o.C1201k;

/* renamed from: C0.b */
/* loaded from: classes.dex */
public final class C0068b {

    /* renamed from: a */
    public final C1201k f228a = new C1201k();

    /* renamed from: b */
    public final C1201k f229b = new C1201k();

    /* renamed from: a */
    public static C0068b m196a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m197b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m197b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e2);
            return null;
        }
    }

    /* renamed from: b */
    public static C0068b m197b(ArrayList arrayList) {
        C0068b c0068b = new C0068b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0068b.f229b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0067a.f225b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0067a.f226c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0067a.f227d;
            }
            C0069c c0069c = new C0069c();
            c0069c.f233d = 0;
            c0069c.f234e = 1;
            c0069c.f230a = startDelay;
            c0069c.f231b = duration;
            c0069c.f232c = interpolator;
            c0069c.f233d = objectAnimator.getRepeatCount();
            c0069c.f234e = objectAnimator.getRepeatMode();
            c0068b.f228a.put(propertyName, c0069c);
        }
        return c0068b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0068b) {
            return this.f228a.equals(((C0068b) obj).f228a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f228a.hashCode();
    }

    public final String toString() {
        return "\n" + C0068b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f228a + "}\n";
    }
}
