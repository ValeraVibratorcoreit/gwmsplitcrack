package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.Locale;
import p045W0.C0355e;
import p068f0.AbstractC0792W;
import p068f0.AbstractC0828z;

/* renamed from: com.google.android.material.datepicker.x */
/* loaded from: classes.dex */
public final class C0683x extends AbstractC0828z {

    /* renamed from: c */
    public final C0670k f3557c;

    public C0683x(C0670k c0670k) {
        this.f3557c = c0670k;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: a */
    public final int mo2089a() {
        return this.f3557c.f3499b0.f3479f;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: d */
    public final void mo2091d(AbstractC0792W abstractC0792W, int i) {
        C0670k c0670k = this.f3557c;
        int i2 = c0670k.f3499b0.f3474a.f3537c + i;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((C0682w) abstractC0792W).f3556t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0681v.m2094b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0662c c0662c = c0670k.f3502e0;
        if (AbstractC0681v.m2094b().get(1) == i2) {
            C0355e c0355e = c0662c.f3482b;
        } else {
            C0355e c0355e2 = c0662c.f3481a;
        }
        throw null;
    }

    @Override // p068f0.AbstractC0828z
    /* renamed from: e */
    public final AbstractC0792W mo2092e(ViewGroup viewGroup) {
        return new C0682w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
