package p098q0;

import android.view.View;
import com.altaysoft.t500_split.MyAccessibilityService;

/* renamed from: q0.D */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1252D implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f5588f;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.f5588f) {
            case 0:
                MyAccessibilityService myAccessibilityService = MyAccessibilityService.f2328m;
                if (myAccessibilityService != null && myAccessibilityService.f2333j) {
                    try {
                        myAccessibilityService.performGlobalAction(1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                MyAccessibilityService myAccessibilityService2 = MyAccessibilityService.f2328m;
                if (myAccessibilityService2 != null && (str = myAccessibilityService2.f2330g) != null) {
                    AbstractC1372y1.m3284O(0, str);
                    break;
                }
                break;
        }
    }
}
