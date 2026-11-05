package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public final class C0675p implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public final /* synthetic */ MaterialCalendarGridView f3547f;

    /* renamed from: g */
    public final /* synthetic */ C0677r f3548g;

    public C0675p(C0677r c0677r, MaterialCalendarGridView materialCalendarGridView) {
        this.f3548g = c0677r;
        this.f3547f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f3547f;
        C0674o m2073a = materialCalendarGridView.m2073a();
        if (i < m2073a.m2086a() || i > m2073a.m2088c()) {
            return;
        }
        if (materialCalendarGridView.m2073a().getItem(i).longValue() >= ((C0670k) this.f3548g.f3552d.f3011g).f3499b0.f3476c.f3483a) {
            throw null;
        }
    }
}
