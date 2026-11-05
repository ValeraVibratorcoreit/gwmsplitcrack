package p103s0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import p016H.C0117i;
import p046X.DialogInterfaceOnCancelListenerC0417p;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;
import p098q0.C1337n;
import p098q0.C1344p0;
import p098q0.RunnableC1338n0;
import p098q0.ViewOnClickListenerC1346q;

/* renamed from: s0.b */
/* loaded from: classes.dex */
public class C1414b extends DialogInterfaceOnCancelListenerC0417p {

    /* renamed from: n0 */
    public ProgressBar f6782n0;

    /* renamed from: o0 */
    public TextView f6783o0;

    /* renamed from: p0 */
    public View f6784p0;

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, p046X.AbstractComponentCallbacksC0423v
    /* renamed from: F */
    public final void mo1106F() {
        super.mo1106F();
        View view = this.f6784p0;
        if (view != null) {
            AbstractC1256E0.m3008a(view);
        }
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p
    /* renamed from: O */
    public final Dialog mo1110O() {
        LayoutInflater layoutInflater = this.f1347O;
        if (layoutInflater == null) {
            layoutInflater = mo1104B(null);
            this.f1347O = layoutInflater;
        }
        View inflate = layoutInflater.inflate(R.layout.progress_dialog, (ViewGroup) null);
        this.f6784p0 = inflate;
        this.f6782n0 = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.f6783o0 = (TextView) this.f6784p0.findViewById(R.id.downloading_text);
        ((TextView) this.f6784p0.findViewById(R.id.header)).setText(m1130m(R.string.update_download));
        C0117i c0117i = new C0117i(m1119K(), R.style.T500Split_Dialog);
        ((C0863b) c0117i.f369g).f4328i = this.f6784p0;
        DialogInterfaceC0867f m365a = c0117i.m365a();
        m365a.setCancelable(false);
        m365a.setCanceledOnTouchOutside(false);
        AbstractC1256E0.m3022o(m365a);
        this.f6784p0.findViewById(R.id.btnProgressCancel).setOnClickListener(new ViewOnClickListenerC1346q(this, 1, m365a));
        this.f6782n0.setMax(100);
        m365a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: s0.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C1414b c1414b = C1414b.this;
                c1414b.getClass();
                C1344p0.f6319i.f6323d.m1400i(c1414b);
                C1344p0.f6319i.f6323d.m1396e(c1414b, new C1337n(4, c1414b));
                Integer num = (Integer) C1344p0.f6319i.f6323d.m1395d();
                if (num != null) {
                    c1414b.f6782n0.setProgress(num.intValue());
                    c1414b.f6783o0.setText(String.format(c1414b.m1130m(R.string.downloading_text_s), num, "%"));
                }
                C1344p0 c1344p0 = C1344p0.f6319i;
                synchronized (c1344p0) {
                    if (!c1344p0.f6325f && c1344p0.f6320a != null) {
                        c1344p0.f6325f = true;
                        c1344p0.f6323d.m1398g(0);
                        new Thread(new RunnableC1338n0(c1344p0, 1)).start();
                    }
                }
            }
        });
        View view = this.f6784p0;
        view.setAlpha(0.0f);
        view.setScaleX(0.72f);
        view.setScaleY(0.72f);
        return m365a;
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C1344p0.f6319i.f6323d.m1400i(this);
        super.onDismiss(dialogInterface);
    }
}
