package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p068f0.AbstractC0781K;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public final class C0668i extends AbstractC0781K {

    /* renamed from: a */
    public final /* synthetic */ C0677r f3493a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f3494b;

    /* renamed from: c */
    public final /* synthetic */ C0670k f3495c;

    public C0668i(C0670k c0670k, C0677r c0677r, MaterialButton materialButton) {
        this.f3495c = c0670k;
        this.f3493a = c0677r;
        this.f3494b = materialButton;
    }

    @Override // p068f0.AbstractC0781K
    /* renamed from: a */
    public final void mo2075a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f3494b.getText());
        }
    }

    @Override // p068f0.AbstractC0781K
    /* renamed from: b */
    public final void mo2076b(RecyclerView recyclerView, int i, int i2) {
        C0670k c0670k = this.f3495c;
        int m1449M0 = i < 0 ? ((LinearLayoutManager) c0670k.f3504g0.getLayoutManager()).m1449M0() : ((LinearLayoutManager) c0670k.f3504g0.getLayoutManager()).m1450N0();
        C0661b c0661b = this.f3493a.f3551c;
        Calendar m2093a = AbstractC0681v.m2093a(c0661b.f3474a.f3535a);
        m2093a.add(2, m1449M0);
        c0670k.f3500c0 = new C0673n(m2093a);
        Calendar m2093a2 = AbstractC0681v.m2093a(c0661b.f3474a.f3535a);
        m2093a2.add(2, m1449M0);
        m2093a2.set(5, 1);
        Calendar m2093a3 = AbstractC0681v.m2093a(m2093a2);
        m2093a3.get(2);
        m2093a3.get(1);
        m2093a3.getMaximum(7);
        m2093a3.getActualMaximum(5);
        m2093a3.getTimeInMillis();
        long timeInMillis = m2093a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = AbstractC0681v.f3555a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f3494b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
