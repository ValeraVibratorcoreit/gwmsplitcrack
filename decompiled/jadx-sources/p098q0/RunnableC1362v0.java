package p098q0;

import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.altaysoft.t500_split.Pay;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import p001A0.RunnableC0020n;

/* renamed from: q0.v0 */
/* loaded from: classes.dex */
public final class RunnableC1362v0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6399a;

    /* renamed from: b */
    public final /* synthetic */ Pay f6400b;

    /* renamed from: c */
    public final /* synthetic */ Pay f6401c;

    /* renamed from: d */
    public final /* synthetic */ Pay f6402d;

    public RunnableC1362v0(Pay pay, int i, Pay pay2, Pay pay3) {
        this.f6402d = pay;
        this.f6399a = i;
        this.f6400b = pay2;
        this.f6401c = pay3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pay pay = this.f6400b;
        Pay pay2 = this.f6402d;
        int i = this.f6399a;
        if (i == 99) {
            AbstractC1372y1.m3288S(pay, pay2.getString(R.string.error_message_title), pay2.getString(R.string.activation_generic_error), null);
        }
        switch (i) {
            case 1:
                AbstractC1372y1.m3288S(pay, pay2.getString(R.string.error_message_title), pay2.getString(R.string.activation_code_wrong), null);
                break;
            case 2:
                AbstractC1372y1.m3288S(pay, pay2.getString(R.string.error_message_title), pay2.getString(R.string.activation_crook), null);
                break;
            case 3:
                AbstractC1372y1.m3288S(pay, pay2.getString(R.string.error_message_title), pay2.getString(R.string.activation_failed), null);
                break;
            case 4:
                AbstractC1372y1.m3288S(pay, pay2.getString(R.string.error_message_title), pay2.getString(R.string.activation_you_have_asiaforce), null);
                break;
            case 5:
                AbstractC1372y1.m3288S(pay, pay2.getString(R.string.error_message_title), pay2.getString(R.string.activation_full_version), null);
                break;
            case 6:
                carData cardata = AbstractC1372y1.f6431a;
                Pay pay3 = this.f6401c;
                InputMethodManager inputMethodManager = (InputMethodManager) pay3.getSystemService("input_method");
                View currentFocus = pay3.getCurrentFocus();
                if (currentFocus == null) {
                    currentFocus = new View(pay3);
                }
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                AbstractC1372y1.m3288S(pay, pay2.getString(R.string.Message), pay2.getString(R.string.activation_thankyou), null);
                cfgData cfgdata = pay2.f2339F;
                cfgdata.f2610c1 = 2;
                cfgdata.f2513E3 = 3;
                cfgdata.f2665n1 = 0L;
                cfgdata.f2670o1 = 0L;
                cfgdata.m1795o(pay);
                new Handler().postDelayed(new RunnableC0020n(19, this), 2000L);
                break;
        }
    }
}
