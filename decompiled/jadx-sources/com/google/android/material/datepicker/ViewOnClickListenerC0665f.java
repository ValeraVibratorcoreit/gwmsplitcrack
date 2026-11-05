package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0665f implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f3487f;

    /* renamed from: g */
    public final /* synthetic */ C0677r f3488g;

    /* renamed from: h */
    public final /* synthetic */ C0670k f3489h;

    public /* synthetic */ ViewOnClickListenerC0665f(C0670k c0670k, C0677r c0677r, int i) {
        this.f3487f = i;
        this.f3489h = c0670k;
        this.f3488g = c0677r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3487f) {
            case 0:
                C0670k c0670k = this.f3489h;
                int m1450N0 = ((LinearLayoutManager) c0670k.f3504g0.getLayoutManager()).m1450N0() - 1;
                if (m1450N0 >= 0) {
                    Calendar m2093a = AbstractC0681v.m2093a(this.f3488g.f3551c.f3474a.f3535a);
                    m2093a.add(2, m1450N0);
                    c0670k.m2077O(new C0673n(m2093a));
                    break;
                }
                break;
            default:
                C0670k c0670k2 = this.f3489h;
                int m1449M0 = ((LinearLayoutManager) c0670k2.f3504g0.getLayoutManager()).m1449M0() + 1;
                if (m1449M0 < c0670k2.f3504g0.getAdapter().mo2089a()) {
                    Calendar m2093a2 = AbstractC0681v.m2093a(this.f3488g.f3551c.f3474a.f3535a);
                    m2093a2.add(2, m1449M0);
                    c0670k2.m2077O(new C0673n(m2093a2));
                    break;
                }
                break;
        }
    }
}
