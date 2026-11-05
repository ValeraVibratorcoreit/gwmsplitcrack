package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;
import p022K.C0153A;
import p068f0.AbstractC0792W;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public final class C0676q extends AbstractC0792W {

    /* renamed from: t */
    public final TextView f3549t;

    /* renamed from: u */
    public final MaterialCalendarGridView f3550u;

    public C0676q(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f3549t = textView;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        new C0153A(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m416d(textView, Boolean.TRUE);
        this.f3550u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
