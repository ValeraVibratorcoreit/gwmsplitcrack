package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.altaysoft.t500_split.R;
import p004B0.AbstractC0051a;
import p010D1.AbstractC0088l;
import p045W0.C0355e;
import p121y0.AbstractC1687o;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C0662c {

    /* renamed from: a */
    public final C0355e f3481a;

    /* renamed from: b */
    public final C0355e f3482b;

    public C0662c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1687o.m4924S(context, R.attr.materialCalendarStyle, C0670k.class.getCanonicalName()).data, AbstractC0051a.f178m);
        C0355e.m942b(context, obtainStyledAttributes.getResourceId(4, 0));
        C0355e.m942b(context, obtainStyledAttributes.getResourceId(2, 0));
        C0355e.m942b(context, obtainStyledAttributes.getResourceId(3, 0));
        C0355e.m942b(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList m255B = AbstractC0088l.m255B(context, obtainStyledAttributes, 7);
        this.f3481a = C0355e.m942b(context, obtainStyledAttributes.getResourceId(9, 0));
        C0355e.m942b(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f3482b = C0355e.m942b(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(m255B.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
