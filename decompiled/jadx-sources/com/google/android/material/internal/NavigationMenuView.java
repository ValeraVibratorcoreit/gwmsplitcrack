package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p079k.InterfaceC1001A;
import p079k.MenuC1018m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC1001A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // p079k.InterfaceC1001A
    /* renamed from: c */
    public final void mo1263c(MenuC1018m menuC1018m) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
