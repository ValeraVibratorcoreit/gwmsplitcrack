package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p068f0.AbstractC0775E;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C0667h extends AbstractC0775E {

    /* renamed from: a */
    public final /* synthetic */ C0670k f3492a;

    public C0667h(C0670k c0670k) {
        this.f3492a = c0670k;
        AbstractC0681v.m2095c(null);
        AbstractC0681v.m2095c(null);
    }

    @Override // p068f0.AbstractC0775E
    /* renamed from: a */
    public final void mo2074a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C0683x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f3492a.getClass();
            throw null;
        }
    }
}
