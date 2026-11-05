package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p004B0.AbstractC0051a;
import p117x.AbstractC1636a;
import p117x.C1639d;

/* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* loaded from: classes.dex */
public class C0684xe6e79f6<T> extends AbstractC1636a {
    public C0684xe6e79f6() {
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: a */
    public final /* synthetic */ boolean mo2096a(View view) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: c */
    public final void mo2039c(C1639d c1639d) {
        if (c1639d.f9313h == 0) {
            c1639d.f9313h = 80;
        }
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: d */
    public final boolean mo2024d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: g */
    public final boolean mo215g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public C0684xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f172g);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
