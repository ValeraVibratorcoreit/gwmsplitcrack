package com.google.android.material.datepicker;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.altaysoft.t500_split.FloatingWindowService_NaviBtn;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import p070g.C0866e;
import p076j.AbstractC0952a;
import p079k.C1020o;
import p082l.C1087T0;
import p098q0.AbstractC1372y1;
import p109u0.AbstractC1539g1;

/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0669j implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f3496f;

    /* renamed from: g */
    public final /* synthetic */ Object f3497g;

    public /* synthetic */ ViewOnClickListenerC0669j(int i, Object obj) {
        this.f3496f = i;
        this.f3497g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3496f) {
            case 0:
                C0670k c0670k = (C0670k) this.f3497g;
                int i = c0670k.f3501d0;
                if (i != 2) {
                    if (i == 1) {
                        c0670k.m2078P(2);
                        break;
                    }
                } else {
                    c0670k.m2078P(1);
                    break;
                }
                break;
            case 1:
                C0866e c0866e = (C0866e) this.f3497g;
                Button button = c0866e.f4339h;
                c0866e.f4355x.obtainMessage(1, c0866e.f4333b).sendToTarget();
                break;
            case 2:
                ((AbstractC0952a) this.f3497g).mo2376a();
                break;
            case 3:
                C1087T0 c1087t0 = ((Toolbar) this.f3497g).f1821Q;
                C1020o c1020o = c1087t0 == null ? null : c1087t0.f5104g;
                if (c1020o != null) {
                    c1020o.collapseActionView();
                    break;
                }
                break;
            default:
                FloatingWindowService_NaviBtn floatingWindowService_NaviBtn = (FloatingWindowService_NaviBtn) this.f3497g;
                floatingWindowService_NaviBtn.f2277h.setForeground(floatingWindowService_NaviBtn.getDrawable(R.drawable.mpng_hour));
                AbstractC1372y1.m3296b();
                cfgData cfgdata = floatingWindowService_NaviBtn.f2275f;
                boolean z2 = cfgdata.f2553O2;
                cfgdata.f2553O2 = !z2;
                if (!z2 && AbstractC1539g1.m4193O(cfgdata.f2620e1)) {
                    floatingWindowService_NaviBtn.f2275f.f2635h1 = 0;
                }
                floatingWindowService_NaviBtn.f2275f.m1795o(floatingWindowService_NaviBtn.getApplication());
                AbstractC1372y1.m3300f();
                floatingWindowService_NaviBtn.getClass();
                try {
                    ActivityOptions makeBasic = ActivityOptions.makeBasic();
                    Intent intent = new Intent(floatingWindowService_NaviBtn, (Class<?>) MainActivity.class);
                    intent.addFlags(402722816);
                    Rect rect = new Rect(0, 0, 1920, 1080);
                    intent.putExtra("caller", "ip_rest");
                    floatingWindowService_NaviBtn.startActivity(intent, makeBasic.setLaunchBounds(rect).toBundle());
                    break;
                } catch (Exception e2) {
                    Toast.makeText(floatingWindowService_NaviBtn, "ERROR3" + e2, 1).show();
                }
        }
    }
}
