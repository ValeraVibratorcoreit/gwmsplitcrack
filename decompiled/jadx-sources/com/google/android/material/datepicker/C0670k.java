package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.altaysoft.t500_split.media.C0639g;
import com.google.android.material.button.MaterialButton;
import p016H.RunnableC0109a;
import p019I0.C0141e;
import p022K.AbstractC0169Q;
import p033Q.C0274h;
import p068f0.C0826x;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C0670k<S> extends AbstractC0678s {

    /* renamed from: a0 */
    public int f3498a0;

    /* renamed from: b0 */
    public C0661b f3499b0;

    /* renamed from: c0 */
    public C0673n f3500c0;

    /* renamed from: d0 */
    public int f3501d0;

    /* renamed from: e0 */
    public C0662c f3502e0;

    /* renamed from: f0 */
    public RecyclerView f3503f0;

    /* renamed from: g0 */
    public RecyclerView f3504g0;

    /* renamed from: h0 */
    public View f3505h0;

    /* renamed from: i0 */
    public View f3506i0;

    /* renamed from: j0 */
    public View f3507j0;

    /* renamed from: k0 */
    public View f3508k0;

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: E */
    public final void mo1105E(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3498a0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3499b0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3500c0);
    }

    /* renamed from: O */
    public final void m2077O(C0673n c0673n) {
        C0677r c0677r = (C0677r) this.f3504g0.getAdapter();
        int m2085d = c0677r.f3551c.f3474a.m2085d(c0673n);
        int m2085d2 = m2085d - c0677r.f3551c.f3474a.m2085d(this.f3500c0);
        boolean z2 = Math.abs(m2085d2) > 3;
        boolean z3 = m2085d2 > 0;
        this.f3500c0 = c0673n;
        if (z2 && z3) {
            this.f3504g0.m1512Z(m2085d - 3);
            this.f3504g0.post(new RunnableC0109a(this, m2085d, 2));
        } else if (!z2) {
            this.f3504g0.post(new RunnableC0109a(this, m2085d, 2));
        } else {
            this.f3504g0.m1512Z(m2085d + 3);
            this.f3504g0.post(new RunnableC0109a(this, m2085d, 2));
        }
    }

    /* renamed from: P */
    public final void m2078P(int i) {
        this.f3501d0 = i;
        if (i == 2) {
            this.f3503f0.getLayoutManager().mo1478p0(this.f3500c0.f3537c - ((C0683x) this.f3503f0.getAdapter()).f3557c.f3499b0.f3474a.f3537c);
            this.f3507j0.setVisibility(0);
            this.f3508k0.setVisibility(8);
            this.f3505h0.setVisibility(8);
            this.f3506i0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f3507j0.setVisibility(8);
            this.f3508k0.setVisibility(0);
            this.f3505h0.setVisibility(0);
            this.f3506i0.setVisibility(0);
            m2077O(this.f3500c0);
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: w */
    public final void mo1114w(Bundle bundle) {
        super.mo1114w(bundle);
        if (bundle == null) {
            bundle = this.f1362k;
        }
        this.f3498a0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3499b0 = (C0661b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3500c0 = (C0673n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: x */
    public final View mo1138x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1126i(), this.f3498a0);
        this.f3502e0 = new C0662c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0673n c0673n = this.f3499b0.f3474a;
        if (C0671l.m2080R(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.altaysoft.t500_split.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.altaysoft.t500_split.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = m1119K().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C0674o.f3542d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.altaysoft.t500_split.R.id.mtrl_calendar_days_of_week);
        AbstractC0169Q.m505j(gridView, new C0274h(1));
        int i4 = this.f3499b0.f3478e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0664e(i4) : new C0664e()));
        gridView.setNumColumns(c0673n.f3538d);
        gridView.setEnabled(false);
        this.f3504g0 = (RecyclerView) inflate.findViewById(com.altaysoft.t500_split.R.id.mtrl_calendar_months);
        this.f3504g0.setLayoutManager(new C0666g(this, i2, i2));
        this.f3504g0.setTag("MONTHS_VIEW_GROUP_TAG");
        C0677r c0677r = new C0677r(contextThemeWrapper, this.f3499b0, new C0639g(19, this));
        this.f3504g0.setAdapter(c0677r);
        int integer = contextThemeWrapper.getResources().getInteger(com.altaysoft.t500_split.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.altaysoft.t500_split.R.id.mtrl_calendar_year_selector_frame);
        this.f3503f0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f3503f0.setLayoutManager(new GridLayoutManager(integer));
            this.f3503f0.setAdapter(new C0683x(this));
            this.f3503f0.m1519g(new C0667h(this));
        }
        if (inflate.findViewById(com.altaysoft.t500_split.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.altaysoft.t500_split.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC0169Q.m505j(materialButton, new C0141e(3, this));
            View findViewById = inflate.findViewById(com.altaysoft.t500_split.R.id.month_navigation_previous);
            this.f3505h0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.altaysoft.t500_split.R.id.month_navigation_next);
            this.f3506i0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f3507j0 = inflate.findViewById(com.altaysoft.t500_split.R.id.mtrl_calendar_year_selector_frame);
            this.f3508k0 = inflate.findViewById(com.altaysoft.t500_split.R.id.mtrl_calendar_day_selector_frame);
            m2078P(1);
            materialButton.setText(this.f3500c0.m2084c());
            this.f3504g0.m1520h(new C0668i(this, c0677r, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0669j(0, this));
            this.f3506i0.setOnClickListener(new ViewOnClickListenerC0665f(this, c0677r, 1));
            this.f3505h0.setOnClickListener(new ViewOnClickListenerC0665f(this, c0677r, 0));
        }
        if (!C0671l.m2080R(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C0826x().m2331a(this.f3504g0);
        }
        this.f3504g0.m1512Z(c0677r.f3551c.f3474a.m2085d(this.f3500c0));
        AbstractC0169Q.m505j(this.f3504g0, new C0274h(2));
        return inflate;
    }
}
