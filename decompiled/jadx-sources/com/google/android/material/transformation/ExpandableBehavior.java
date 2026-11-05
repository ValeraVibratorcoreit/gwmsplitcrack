package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;
import p117x.AbstractC1636a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC1636a {
    public ExpandableBehavior() {
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: b */
    public abstract void mo2023b(View view);

    @Override // p117x.AbstractC1636a
    /* renamed from: d */
    public final boolean mo2024d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p117x.AbstractC1636a
    /* renamed from: g */
    public final boolean mo215g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (!view.isLaidOut()) {
            ArrayList m1323j = coordinatorLayout.m1323j(view);
            int size = m1323j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo2023b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
