package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p068f0.C0789T;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public final class C0666g extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ int f3490E;

    /* renamed from: F */
    public final /* synthetic */ C0670k f3491F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0666g(C0670k c0670k, int i, int i2) {
        super(i);
        this.f3491F = c0670k;
        this.f3490E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: C0 */
    public final void mo1439C0(C0789T c0789t, int[] iArr) {
        int i = this.f3490E;
        C0670k c0670k = this.f3491F;
        if (i == 0) {
            iArr[0] = c0670k.f3504g0.getWidth();
            iArr[1] = c0670k.f3504g0.getWidth();
        } else {
            iArr[0] = c0670k.f3504g0.getHeight();
            iArr[1] = c0670k.f3504g0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p068f0.AbstractC0778H
    /* renamed from: z0 */
    public final void mo1481z0(RecyclerView recyclerView, int i) {
        C0679t c0679t = new C0679t(recyclerView.getContext());
        c0679t.f4187a = i;
        m2225A0(c0679t);
    }
}
