package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
public final class C0674o extends BaseAdapter {

    /* renamed from: d */
    public static final int f3542d = AbstractC0681v.m2095c(null).getMaximum(4);

    /* renamed from: e */
    public static final int f3543e = (AbstractC0681v.m2095c(null).getMaximum(7) + AbstractC0681v.m2095c(null).getMaximum(5)) - 1;

    /* renamed from: a */
    public final C0673n f3544a;

    /* renamed from: b */
    public C0662c f3545b;

    /* renamed from: c */
    public final C0661b f3546c;

    public C0674o(C0673n c0673n, C0661b c0661b) {
        this.f3544a = c0673n;
        this.f3546c = c0661b;
        throw null;
    }

    /* renamed from: a */
    public final int m2086a() {
        int i = this.f3546c.f3478e;
        C0673n c0673n = this.f3544a;
        Calendar calendar = c0673n.f3535a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + c0673n.f3538d : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m2086a() || i > m2088c()) {
            return null;
        }
        int m2086a = (i - m2086a()) + 1;
        Calendar m2093a = AbstractC0681v.m2093a(this.f3544a.f3535a);
        m2093a.set(5, m2086a);
        return Long.valueOf(m2093a.getTimeInMillis());
    }

    /* renamed from: c */
    public final int m2088c() {
        return (m2086a() + this.f3544a.f3539e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f3543e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f3544a.f3538d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f3545b == null) {
            this.f3545b = new C0662c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int m2086a = i - m2086a();
        if (m2086a >= 0) {
            C0673n c0673n = this.f3544a;
            if (m2086a < c0673n.f3539e) {
                textView.setTag(c0673n);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(m2086a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                AbstractC0681v.m2094b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            AbstractC0681v.m2094b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
