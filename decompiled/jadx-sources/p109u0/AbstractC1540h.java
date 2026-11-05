package p109u0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import p001A0.RunnableC0018l;

/* renamed from: u0.h */
/* loaded from: classes.dex */
public abstract class AbstractC1540h {

    /* renamed from: a */
    public static final int f8257a = Math.round(10.0f);

    /* renamed from: a */
    public static void m4245a(ViewGroup viewGroup, View view, cfgData cfgdata) {
        if (!(viewGroup instanceof FrameLayout) || view == null) {
            return;
        }
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        boolean z2 = true;
        if (cfgdata != null) {
            z2 = true ^ (AbstractC1569q1.m4455g(cfgdata.f2620e1) ? cfgdata.f2557P2 : AbstractC1539g1.m4191M(cfgdata));
        }
        if (!z2) {
            View findViewById = viewGroup.findViewById(R.id.ip_legacy_bottom_cover);
            if (findViewById != null) {
                findViewById.setVisibility(8);
                return;
            }
            return;
        }
        RunnableC0018l runnableC0018l = new RunnableC0018l(viewGroup, 20, view);
        if (view.getHeight() > 0) {
            runnableC0018l.run();
        } else {
            view.post(runnableC0018l);
        }
    }
}
