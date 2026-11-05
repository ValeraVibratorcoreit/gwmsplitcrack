package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C0664e extends BaseAdapter {

    /* renamed from: a */
    public final Calendar f3484a;

    /* renamed from: b */
    public final int f3485b;

    /* renamed from: c */
    public final int f3486c;

    public C0664e() {
        Calendar m2095c = AbstractC0681v.m2095c(null);
        this.f3484a = m2095c;
        this.f3485b = m2095c.getMaximum(7);
        this.f3486c = m2095c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3485b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f3485b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f3486c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f3486c;
        int i3 = this.f3485b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f3484a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0664e(int i) {
        Calendar m2095c = AbstractC0681v.m2095c(null);
        this.f3484a = m2095c;
        this.f3485b = m2095c.getMaximum(7);
        this.f3486c = i;
    }
}
