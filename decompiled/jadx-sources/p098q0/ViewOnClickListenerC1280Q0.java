package p098q0;

import android.content.Context;
import android.view.View;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.userthemes.UserThemeSlotsActivity;
import p109u0.AbstractC1569q1;

/* renamed from: q0.Q0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1280Q0 implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f5937f;

    /* renamed from: g */
    public final /* synthetic */ int f5938g;

    /* renamed from: h */
    public final /* synthetic */ Object f5939h;

    public /* synthetic */ ViewOnClickListenerC1280Q0(Object obj, int i, int i2) {
        this.f5937f = i2;
        this.f5939h = obj;
        this.f5938g = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cfgData cfgdata;
        int i;
        int i2 = this.f5938g;
        Object obj = this.f5939h;
        switch (this.f5937f) {
            case 0:
                C1287U0 c1287u0 = (C1287U0) obj;
                c1287u0.m3110h();
                if ((i2 <= 2 || !AbstractC1372y1.m3299e("presets5")) && (i = (cfgdata = c1287u0.f5971b).f2540L1) != i2) {
                    cfgdata.f2540L1 = i2;
                    Context context = c1287u0.f5970a;
                    cfgdata.m1797q(context);
                    if (!AbstractC1256E0.m2988C(context, i, i2)) {
                        AbstractC1256E0.m3014g(context, i, i2);
                        break;
                    } else {
                        AbstractC1256E0.m2993H(context);
                        c1287u0.m3120t();
                        break;
                    }
                }
                break;
            case 1:
                C1324i1 c1324i1 = (C1324i1) obj;
                c1324i1.m3226n();
                c1324i1.m3237z(i2, 0);
                break;
            default:
                int i3 = UserThemeSlotsActivity.f3316L;
                UserThemeSlotsActivity userThemeSlotsActivity = (UserThemeSlotsActivity) obj;
                userThemeSlotsActivity.getClass();
                if (!AbstractC1569q1.m4454f(i2 - 1)) {
                    AbstractC1256E0.m3003R(userThemeSlotsActivity);
                    break;
                } else {
                    userThemeSlotsActivity.m2009v(i2);
                    break;
                }
        }
    }
}
