package p112v0;

import android.app.Dialog;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import p010D1.AbstractC0088l;
import p098q0.RunnableC1320h0;
import p098q0.ViewOnClickListenerC1326j0;

/* renamed from: v0.c */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1610c implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f9231f;

    /* renamed from: g */
    public final /* synthetic */ MainActivity f9232g;

    public /* synthetic */ ViewOnClickListenerC1610c(MainActivity mainActivity, int i) {
        this.f9231f = i;
        this.f9232g = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9231f) {
            case 0:
                MainActivity mainActivity = this.f9232g;
                if (!AbstractC0088l.m266d(mainActivity)) {
                    AbstractC1612e.m4771c(mainActivity);
                    break;
                } else {
                    Handler handler = AbstractC1612e.f9244h;
                    handler.removeCallbacks(AbstractC1612e.f9245i);
                    RunnableC1320h0 runnableC1320h0 = AbstractC1612e.f9239c;
                    AbstractC1612e.f9239c = null;
                    AbstractC1612e.f9238b = null;
                    int i = 0;
                    AbstractC1612e.f9241e = false;
                    AbstractC1612e.f9242f = null;
                    AbstractC1612e.f9243g = 0;
                    AbstractC1612e.m4769a();
                    if (runnableC1320h0 != null) {
                        handler.post(new RunnableC1611d(mainActivity, runnableC1320h0, i, 0));
                        break;
                    }
                }
                break;
            default:
                Object tag = view.getTag();
                if (tag instanceof EnumC1609b) {
                    EnumC1609b enumC1609b = (EnumC1609b) tag;
                    EnumC1609b enumC1609b2 = EnumC1609b.PHONE;
                    MainActivity mainActivity2 = this.f9232g;
                    if (enumC1609b == enumC1609b2 || enumC1609b == EnumC1609b.STORAGE || enumC1609b == EnumC1609b.LOCATION) {
                        cfgData m1784i = cfgData.m1784i();
                        String str = m1784i.f2650k1;
                        if (str == null || str.isEmpty()) {
                            AbstractC0088l.m283y(mainActivity2);
                        }
                        if (AbstractC0088l.m282u0(m1784i)) {
                            View inflate = LayoutInflater.from(mainActivity2).inflate(R.layout.dialog_perm_phone_storage_guide, (ViewGroup) null);
                            Dialog dialog = new Dialog(mainActivity2, R.style.T500Split_Dialog);
                            dialog.setContentView(inflate);
                            dialog.setCancelable(true);
                            dialog.setCanceledOnTouchOutside(false);
                            ((AppCompatButton) inflate.findViewById(R.id.btn_perm_guide_open)).setOnClickListener(new ViewOnClickListenerC1326j0(dialog, mainActivity2, enumC1609b));
                            try {
                                dialog.show();
                                break;
                            } catch (Exception unused) {
                                AbstractC1612e.m4770b(mainActivity2, enumC1609b);
                                return;
                            }
                        }
                    }
                    AbstractC1612e.m4770b(mainActivity2, enumC1609b);
                    break;
                }
                break;
        }
    }
}
