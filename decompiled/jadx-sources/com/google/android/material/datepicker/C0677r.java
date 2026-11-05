package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import java.util.Calendar;
import p068f0.AbstractC0792W;
import p068f0.AbstractC0828z;
import p068f0.C0779I;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C0677r extends AbstractC0828z {

    /* renamed from: c */
    public final C0661b f3551c;

    /* renamed from: d */
    public final C0639g f3552d;

    /* renamed from: e */
    public final int f3553e;

    public C0677r(ContextThemeWrapper contextThemeWrapper, C0661b c0661b, C0639g c0639g) {
        C0673n c0673n = c0661b.f3474a;
        C0673n c0673n2 = c0661b.f3477d;
        if (c0673n.f3535a.compareTo(c0673n2.f3535a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0673n2.f3535a.compareTo(c0661b.f3475b.f3535a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f3553e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0674o.f3542d) + (C0671l.m2080R(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f3551c = c0661b;
        this.f3552d = c0639g;
        if (this.f4209a.m2206a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f4210b = true;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: a */
    public final int mo2089a() {
        return this.f3551c.f3480g;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: b */
    public final long mo2090b(int i) {
        Calendar m2093a = AbstractC0681v.m2093a(this.f3551c.f3474a.f3535a);
        m2093a.add(2, i);
        m2093a.set(5, 1);
        Calendar m2093a2 = AbstractC0681v.m2093a(m2093a);
        m2093a2.get(2);
        m2093a2.get(1);
        m2093a2.getMaximum(7);
        m2093a2.getActualMaximum(5);
        m2093a2.getTimeInMillis();
        return m2093a2.getTimeInMillis();
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: d */
    public final void mo2091d(AbstractC0792W abstractC0792W, int i) {
        C0676q c0676q = (C0676q) abstractC0792W;
        C0661b c0661b = this.f3551c;
        Calendar m2093a = AbstractC0681v.m2093a(c0661b.f3474a.f3535a);
        m2093a.add(2, i);
        C0673n c0673n = new C0673n(m2093a);
        c0676q.f3549t.setText(c0673n.m2084c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0676q.f3550u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m2073a() == null || !c0673n.equals(materialCalendarGridView.m2073a().f3544a)) {
            new C0674o(c0673n, c0661b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m2073a().getClass();
        throw null;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: e */
    public final AbstractC0792W mo2092e(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0671l.m2080R(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0676q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0779I(-1, this.f3553e));
        return new C0676q(linearLayout, true);
    }
}
