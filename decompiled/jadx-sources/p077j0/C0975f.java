package p077j0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import p069f1.C0833e;
import p121y0.AbstractC1680h;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C0975f extends AbstractC0982m {

    /* renamed from: A */
    public static final String[] f4669A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B */
    public static final C0971b f4670B = new C0971b(PointF.class, "topLeft", 0);

    /* renamed from: C */
    public static final C0971b f4671C = new C0971b(PointF.class, "bottomRight", 1);

    /* renamed from: D */
    public static final C0971b f4672D = new C0971b(PointF.class, "bottomRight", 2);

    /* renamed from: E */
    public static final C0971b f4673E = new C0971b(PointF.class, "topLeft", 3);

    /* renamed from: F */
    public static final C0971b f4674F = new C0971b(PointF.class, "position", 4);

    /* renamed from: I */
    public static void m2539I(C0989t c0989t) {
        View view = c0989t.f4726b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = c0989t.f4725a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", c0989t.f4726b.getParent());
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: d */
    public final void mo2530d(C0989t c0989t) {
        m2539I(c0989t);
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: g */
    public final void mo2532g(C0989t c0989t) {
        m2539I(c0989t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p077j0.AbstractC0982m
    /* renamed from: k */
    public final Animator mo2540k(FrameLayout frameLayout, C0989t c0989t, C0989t c0989t2) {
        int i;
        ObjectAnimator m2548a;
        if (c0989t == null || c0989t2 == null) {
            return null;
        }
        HashMap hashMap = c0989t.f4725a;
        HashMap hashMap2 = c0989t2.f4725a;
        ViewGroup viewGroup = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup2 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup == null || viewGroup2 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        View view = c0989t2.f4726b;
        AbstractC0991v.m2568a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.f4715v.getClass();
                m2548a = AbstractC0978i.m2548a(view, f4674F, C0833e.m2361c(i2, i4, i3, i5));
            } else {
                C0974e c0974e = new C0974e(view);
                this.f4715v.getClass();
                ObjectAnimator m2548a2 = AbstractC0978i.m2548a(c0974e, f4670B, C0833e.m2361c(i2, i4, i3, i5));
                this.f4715v.getClass();
                ObjectAnimator m2548a3 = AbstractC0978i.m2548a(c0974e, f4671C, C0833e.m2361c(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(m2548a2, m2548a3);
                animatorSet.addListener(new C0972c(c0974e));
                m2548a = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.f4715v.getClass();
            m2548a = AbstractC0978i.m2548a(view, f4672D, C0833e.m2361c(i6, i8, i7, i9));
        } else {
            this.f4715v.getClass();
            m2548a = AbstractC0978i.m2548a(view, f4673E, C0833e.m2361c(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            AbstractC1680h.m4861W(viewGroup3, true);
            m2559o().m2553a(new C0973d(viewGroup3));
        }
        return m2548a;
    }

    @Override // p077j0.AbstractC0982m
    /* renamed from: q */
    public final String[] mo2541q() {
        return f4669A;
    }
}
