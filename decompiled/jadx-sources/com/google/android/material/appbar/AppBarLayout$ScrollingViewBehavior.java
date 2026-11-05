package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p009D0.AbstractC0075a;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p117x.AbstractC1636a;
import p117x.C1639d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0075a {

    /* renamed from: b */
    public final int f3342b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* renamed from: s */
    public static void m2022s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: b */
    public final void mo2023b(View view) {
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: d */
    public boolean mo2024d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1636a abstractC1636a = ((C1639d) view2.getLayoutParams()).f9306a;
        if (abstractC1636a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC1636a).getClass();
            int i = this.f3342b;
            int m278q = bottom - (i == 0 ? 0 : AbstractC0088l.m278q((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            view.offsetTopAndBottom(m278q);
        }
        return false;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: h */
    public final boolean mo2014h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m2022s(coordinatorLayout.m1323j(view));
        return false;
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: l */
    public final void mo2025l(CoordinatorLayout coordinatorLayout, View view) {
        m2022s(coordinatorLayout.m1323j(view));
    }

    @Override // p009D0.AbstractC0075a
    /* renamed from: r */
    public final void mo216r(CoordinatorLayout coordinatorLayout, View view, int i) {
        m2022s(coordinatorLayout.m1323j(view));
        coordinatorLayout.m1328q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f187v);
        this.f3342b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
