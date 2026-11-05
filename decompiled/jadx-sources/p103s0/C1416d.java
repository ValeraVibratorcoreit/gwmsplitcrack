package p103s0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.R;
import p001A0.RunnableC0005B;
import p001A0.RunnableC0024r;
import p016H.C0117i;
import p046X.C0387O;
import p046X.C0398a;
import p046X.DialogInterfaceOnCancelListenerC0417p;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;
import p098q0.C1344p0;

/* renamed from: s0.d */
/* loaded from: classes.dex */
public class C1416d extends DialogInterfaceOnCancelListenerC0417p {

    /* renamed from: n0 */
    public TextView f6787n0;

    /* renamed from: o0 */
    public TextView f6788o0;

    /* renamed from: p0 */
    public ScrollView f6789p0;

    /* renamed from: q0 */
    public TextView f6790q0;

    /* renamed from: r0 */
    public AppCompatButton f6791r0;

    /* renamed from: s0 */
    public AppCompatButton f6792s0;

    /* renamed from: t0 */
    public View f6793t0;

    /* renamed from: u0 */
    public DialogInterfaceC0867f f6794u0;

    /* renamed from: v0 */
    public boolean f6795v0 = false;

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, p046X.AbstractComponentCallbacksC0423v
    /* renamed from: F */
    public final void mo1106F() {
        View view;
        ScrollView scrollView;
        super.mo1106F();
        DialogInterfaceC0867f dialogInterfaceC0867f = this.f6794u0;
        if (dialogInterfaceC0867f != null && dialogInterfaceC0867f.getWindow() != null) {
            this.f6794u0.getWindow().setLayout((int) (m1129l().getDisplayMetrics().widthPixels * 0.58f), -2);
            DialogInterfaceC0867f dialogInterfaceC0867f2 = this.f6794u0;
            if (dialogInterfaceC0867f2 != null && (view = this.f6793t0) != null && (scrollView = this.f6789p0) != null) {
                view.post(new RunnableC0005B(dialogInterfaceC0867f2, view, scrollView, 5));
            }
        }
        m3426P();
        View view2 = this.f6793t0;
        if (view2 != null) {
            AbstractC1256E0.m3008a(view2);
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
        View inflate = layoutInflater.inflate(R.layout.update_dialog, (ViewGroup) null);
        this.f6793t0 = inflate;
        this.f6790q0 = (TextView) inflate.findViewById(R.id.tv_whatsNew);
        this.f6788o0 = (TextView) this.f6793t0.findViewById(R.id.tv_whatsNew_label);
        this.f6789p0 = (ScrollView) this.f6793t0.findViewById(R.id.scroll_whatsNew);
        this.f6787n0 = (TextView) this.f6793t0.findViewById(R.id.header);
        this.f6791r0 = (AppCompatButton) this.f6793t0.findViewById(R.id.btnUpdateCancel);
        this.f6792s0 = (AppCompatButton) this.f6793t0.findViewById(R.id.btnUpdateDownload);
        C0117i c0117i = new C0117i(m1119K(), R.style.T500Split_Dialog);
        ((C0863b) c0117i.f369g).f4328i = this.f6793t0;
        DialogInterfaceC0867f m365a = c0117i.m365a();
        this.f6794u0 = m365a;
        m365a.setCancelable(false);
        AbstractC1256E0.m3022o(this.f6794u0);
        final int i = 0;
        this.f6791r0.setOnClickListener(new View.OnClickListener(this) { // from class: s0.c

            /* renamed from: g */
            public final /* synthetic */ C1416d f6786g;

            {
                this.f6786g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        C1416d c1416d = this.f6786g;
                        AbstractC1256E0.m3027t(c1416d.f6794u0, c1416d.f6793t0, null);
                        break;
                    default:
                        C1416d c1416d2 = this.f6786g;
                        C0387O m2405l = c1416d2.m1118J().m2405l();
                        if (m2405l.m989C("update_progress") == null) {
                            C1414b c1414b = new C1414b();
                            c1414b.f1315k0 = false;
                            c1414b.f1316l0 = true;
                            C0398a c0398a = new C0398a(m2405l);
                            c0398a.f1242o = true;
                            c0398a.m1075e(0, c1414b, "update_progress", 1);
                            c0398a.m1074d(false);
                        }
                        AbstractC1256E0.m3027t(c1416d2.f6794u0, c1416d2.f6793t0, null);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f6792s0.setOnClickListener(new View.OnClickListener(this) { // from class: s0.c

            /* renamed from: g */
            public final /* synthetic */ C1416d f6786g;

            {
                this.f6786g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C1416d c1416d = this.f6786g;
                        AbstractC1256E0.m3027t(c1416d.f6794u0, c1416d.f6793t0, null);
                        break;
                    default:
                        C1416d c1416d2 = this.f6786g;
                        C0387O m2405l = c1416d2.m1118J().m2405l();
                        if (m2405l.m989C("update_progress") == null) {
                            C1414b c1414b = new C1414b();
                            c1414b.f1315k0 = false;
                            c1414b.f1316l0 = true;
                            C0398a c0398a = new C0398a(m2405l);
                            c0398a.f1242o = true;
                            c0398a.m1075e(0, c1414b, "update_progress", 1);
                            c0398a.m1074d(false);
                        }
                        AbstractC1256E0.m3027t(c1416d2.f6794u0, c1416d2.f6793t0, null);
                        break;
                }
            }
        });
        this.f6787n0.setText(m1130m(R.string.update_check1) + "\n" + m1130m(R.string.update_check2));
        this.f6790q0.setText("");
        this.f6795v0 = false;
        m3426P();
        C1344p0.f6319i.m3241a(new RunnableC0024r(26, this));
        View view = this.f6793t0;
        view.setAlpha(0.0f);
        view.setScaleX(0.72f);
        view.setScaleY(0.72f);
        return this.f6794u0;
    }

    /* renamed from: P */
    public final void m3426P() {
        AppCompatButton appCompatButton = this.f6792s0;
        if (appCompatButton != null) {
            appCompatButton.setVisibility(this.f6795v0 ? 0 : 8);
        }
        int i = this.f6795v0 ? 0 : 8;
        TextView textView = this.f6788o0;
        if (textView != null) {
            textView.setVisibility(i);
        }
        TextView textView2 = this.f6790q0;
        if (textView2 != null) {
            textView2.setVisibility(i);
        }
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }
}
