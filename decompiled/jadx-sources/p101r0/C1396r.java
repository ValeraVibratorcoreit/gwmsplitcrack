package p101r0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import java.util.Locale;
import p046X.AbstractComponentCallbacksC0423v;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;

/* renamed from: r0.r */
/* loaded from: classes.dex */
public class C1396r extends AbstractComponentCallbacksC0423v {

    /* renamed from: Z */
    public TextView f6535Z;

    /* renamed from: a0 */
    public Switch f6536a0;

    /* renamed from: b0 */
    public Switch f6537b0;

    /* renamed from: c0 */
    public Switch f6538c0;

    /* renamed from: d0 */
    public Button f6539d0;

    /* renamed from: e0 */
    public Button f6540e0;

    /* renamed from: f0 */
    public EditText f6541f0;

    /* renamed from: g0 */
    public EditText f6542g0;

    /* renamed from: h0 */
    public TextView f6543h0;

    /* renamed from: i0 */
    public Switch f6544i0;

    /* renamed from: j0 */
    public Button f6545j0;

    /* renamed from: k0 */
    public Button f6546k0;

    /* renamed from: l0 */
    public TextView f6547l0;

    /* renamed from: Q */
    public static String m3337Q(float f2) {
        if (Float.isNaN(f2) || Float.isInfinite(f2) || f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return String.format(Locale.ENGLISH, "%.3f", Float.valueOf(f2));
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: C */
    public final void mo1116C() {
        try {
            CFG4.f2728F.f2702u3 = Float.parseFloat(this.f6535Z.getText().toString());
        } catch (NumberFormatException unused) {
            Toast.makeText(m1124g(), "Неправильный формат ввода Коэфф скорости", 1).show();
        }
        m3339P();
        m3338O();
        CFG4.f2728F.m1795o(m1124g());
        this.f1340H = true;
    }

    /* renamed from: O */
    public final void m3338O() {
        EditText editText = this.f6542g0;
        if (editText == null) {
            return;
        }
        try {
            float parseFloat = Float.parseFloat(editText.getText().toString().trim().replace(',', '.'));
            if (!Float.isNaN(parseFloat) && !Float.isInfinite(parseFloat) && parseFloat > 0.0f) {
                CFG4.f2728F.f2719y0 = parseFloat;
                return;
            }
            m3340R();
        } catch (NumberFormatException unused) {
            m3340R();
        }
    }

    /* renamed from: P */
    public final void m3339P() {
        EditText editText = this.f6541f0;
        if (editText == null) {
            return;
        }
        try {
            float parseFloat = Float.parseFloat(editText.getText().toString().trim().replace(',', '.'));
            if (!Float.isNaN(parseFloat) && !Float.isInfinite(parseFloat) && parseFloat > 0.0f) {
                CFG4.f2728F.f2714x0 = parseFloat;
                return;
            }
            Toast.makeText(m1124g(), R.string.tank_capacity_bad, 1).show();
        } catch (NumberFormatException unused) {
            Toast.makeText(m1124g(), R.string.tank_capacity_bad, 1).show();
        }
    }

    /* renamed from: R */
    public final void m3340R() {
        if (m1124g() != null) {
            Toast.makeText(m1124g(), R.string.k_remain_odo_bad, 1).show();
        }
        this.f6542g0.setText(m3337Q(CFG4.f2728F.f2719y0));
    }

    /* renamed from: S */
    public final void m3341S() {
        boolean z2 = CFG4.f2728F.f2709w0;
        int i = z2 ? 0 : 4;
        TextView textView = this.f6543h0;
        if (textView != null) {
            textView.setVisibility(i);
        }
        EditText editText = this.f6542g0;
        if (editText != null) {
            editText.setVisibility(i);
            this.f6542g0.setEnabled(z2);
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: w */
    public final void mo1114w(Bundle bundle) {
        super.mo1114w(bundle);
        Bundle bundle2 = this.f1362k;
        if (bundle2 != null) {
            bundle2.getString("param1");
            this.f1362k.getString("param2");
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: x */
    public final View mo1138x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_settings_advanced, viewGroup, false);
        this.f6537b0 = (Switch) inflate.findViewById(R.id.CB_tb_ctrl);
        this.f6538c0 = (Switch) inflate.findViewById(R.id.CB_tb_mode);
        this.f6536a0 = (Switch) inflate.findViewById(R.id.CB_RHD);
        this.f6535Z = (TextView) inflate.findViewById(R.id.id_k_speed);
        this.f6545j0 = (Button) inflate.findViewById(R.id.btnTBoxReboot);
        this.f6546k0 = (Button) inflate.findViewById(R.id.btnCheckUpdate);
        this.f6539d0 = (Button) inflate.findViewById(R.id.btnModelM);
        this.f6540e0 = (Button) inflate.findViewById(R.id.btnModelP);
        this.f6547l0 = (TextView) inflate.findViewById(R.id.modelName);
        this.f6544i0 = (Switch) inflate.findViewById(R.id.CB_custom_tank);
        this.f6541f0 = (EditText) inflate.findViewById(R.id.tank_capacity_txt);
        this.f6542g0 = (EditText) inflate.findViewById(R.id.k_remain_odo_txt);
        this.f6543h0 = (TextView) inflate.findViewById(R.id.k_remain_odo_lab);
        final int i = 0;
        this.f6539d0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.g

            /* renamed from: g */
            public final /* synthetic */ C1396r f6497g;

            {
                this.f6497g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        C1396r c1396r = this.f6497g;
                        c1396r.getClass();
                        AbstractC1372y1.m3298d(-1);
                        TextView textView = c1396r.f6547l0;
                        cfgData cfgdata = CFG4.f2728F;
                        textView.setText(cfgdata.f2543M0.f7146e);
                        cfgdata.m1795o(c1396r.m1124g());
                        break;
                    default:
                        C1396r c1396r2 = this.f6497g;
                        c1396r2.getClass();
                        AbstractC1372y1.m3298d(1);
                        TextView textView2 = c1396r2.f6547l0;
                        cfgData cfgdata2 = CFG4.f2728F;
                        textView2.setText(cfgdata2.f2543M0.f7146e);
                        cfgdata2.m1795o(c1396r2.m1124g());
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f6540e0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.g

            /* renamed from: g */
            public final /* synthetic */ C1396r f6497g;

            {
                this.f6497g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C1396r c1396r = this.f6497g;
                        c1396r.getClass();
                        AbstractC1372y1.m3298d(-1);
                        TextView textView = c1396r.f6547l0;
                        cfgData cfgdata = CFG4.f2728F;
                        textView.setText(cfgdata.f2543M0.f7146e);
                        cfgdata.m1795o(c1396r.m1124g());
                        break;
                    default:
                        C1396r c1396r2 = this.f6497g;
                        c1396r2.getClass();
                        AbstractC1372y1.m3298d(1);
                        TextView textView2 = c1396r2.f6547l0;
                        cfgData cfgdata2 = CFG4.f2728F;
                        textView2.setText(cfgdata2.f2543M0.f7146e);
                        cfgdata2.m1795o(c1396r2.m1124g());
                        break;
                }
            }
        });
        TextView textView = this.f6547l0;
        cfgData cfgdata = CFG4.f2728F;
        textView.setText(cfgdata.f2543M0.f7146e);
        TextView textView2 = this.f6535Z;
        Locale locale = Locale.ENGLISH;
        textView2.setText(String.format(locale, "%.3f", Float.valueOf(cfgdata.f2702u3)).replace(",", "."));
        this.f6536a0.setChecked(cfgdata.f2704v0);
        this.f6544i0.setChecked(cfgdata.f2709w0);
        EditText editText = this.f6541f0;
        float f2 = cfgdata.f2714x0;
        if (Float.isNaN(f2) || Float.isInfinite(f2) || f2 <= 0.0f) {
            f2 = 80.0f;
        }
        editText.setText(Math.abs(f2 - ((float) Math.round(f2))) < 0.05f ? String.format(locale, "%.0f", Float.valueOf(f2)) : String.format(locale, "%.1f", Float.valueOf(f2)));
        this.f6542g0.setText(m3337Q(cfgdata.f2719y0));
        m3341S();
        this.f6538c0.setChecked(cfgdata.f2588X1);
        this.f6538c0.setVisibility(cfgdata.f2584W1 ? 0 : 4);
        final int i3 = 0;
        this.f6536a0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.h

            /* renamed from: b */
            public final /* synthetic */ C1396r f6499b;

            {
                this.f6499b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i3) {
                    case 0:
                        C1396r c1396r = this.f6499b;
                        c1396r.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2704v0 = z2;
                        cfgdata2.m1795o(c1396r.m1124g());
                        break;
                    case 1:
                        C1396r c1396r2 = this.f6499b;
                        c1396r2.m3339P();
                        c1396r2.m3338O();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2709w0 = z2;
                        c1396r2.m3341S();
                        cfgdata3.m1795o(c1396r2.m1124g());
                        break;
                    case 2:
                        C1396r c1396r3 = this.f6499b;
                        c1396r3.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2584W1 = z2;
                        cfgdata4.m1795o(c1396r3.m1124g());
                        c1396r3.f6538c0.setVisibility(z2 ? 0 : 4);
                        break;
                    default:
                        C1396r c1396r4 = this.f6499b;
                        c1396r4.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2588X1 = z2;
                        cfgdata5.m1795o(c1396r4.m1124g());
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f6544i0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.h

            /* renamed from: b */
            public final /* synthetic */ C1396r f6499b;

            {
                this.f6499b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i4) {
                    case 0:
                        C1396r c1396r = this.f6499b;
                        c1396r.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2704v0 = z2;
                        cfgdata2.m1795o(c1396r.m1124g());
                        break;
                    case 1:
                        C1396r c1396r2 = this.f6499b;
                        c1396r2.m3339P();
                        c1396r2.m3338O();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2709w0 = z2;
                        c1396r2.m3341S();
                        cfgdata3.m1795o(c1396r2.m1124g());
                        break;
                    case 2:
                        C1396r c1396r3 = this.f6499b;
                        c1396r3.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2584W1 = z2;
                        cfgdata4.m1795o(c1396r3.m1124g());
                        c1396r3.f6538c0.setVisibility(z2 ? 0 : 4);
                        break;
                    default:
                        C1396r c1396r4 = this.f6499b;
                        c1396r4.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2588X1 = z2;
                        cfgdata5.m1795o(c1396r4.m1124g());
                        break;
                }
            }
        });
        final int i5 = 0;
        this.f6541f0.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: r0.i

            /* renamed from: b */
            public final /* synthetic */ C1396r f6501b;

            {
                this.f6501b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                switch (i5) {
                    case 0:
                        C1396r c1396r = this.f6501b;
                        if (!z2) {
                            c1396r.m3339P();
                            CFG4.f2728F.m1795o(c1396r.m1124g());
                            break;
                        } else {
                            c1396r.getClass();
                            break;
                        }
                    default:
                        C1396r c1396r2 = this.f6501b;
                        if (!z2) {
                            c1396r2.m3338O();
                            CFG4.f2728F.m1795o(c1396r2.m1124g());
                            break;
                        } else {
                            c1396r2.getClass();
                            break;
                        }
                }
            }
        });
        final int i6 = 1;
        this.f6542g0.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: r0.i

            /* renamed from: b */
            public final /* synthetic */ C1396r f6501b;

            {
                this.f6501b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                switch (i6) {
                    case 0:
                        C1396r c1396r = this.f6501b;
                        if (!z2) {
                            c1396r.m3339P();
                            CFG4.f2728F.m1795o(c1396r.m1124g());
                            break;
                        } else {
                            c1396r.getClass();
                            break;
                        }
                    default:
                        C1396r c1396r2 = this.f6501b;
                        if (!z2) {
                            c1396r2.m3338O();
                            CFG4.f2728F.m1795o(c1396r2.m1124g());
                            break;
                        } else {
                            c1396r2.getClass();
                            break;
                        }
                }
            }
        });
        if (cfgdata.f2660m1) {
            this.f6537b0.setChecked(false);
            this.f6537b0.setEnabled(false);
        } else {
            final int i7 = 2;
            AbstractC1256E0.m3023p(this.f6537b0, "tbox_ctrl", cfgdata.f2584W1, new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.h

                /* renamed from: b */
                public final /* synthetic */ C1396r f6499b;

                {
                    this.f6499b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    switch (i7) {
                        case 0:
                            C1396r c1396r = this.f6499b;
                            c1396r.getClass();
                            cfgData cfgdata2 = CFG4.f2728F;
                            cfgdata2.f2704v0 = z2;
                            cfgdata2.m1795o(c1396r.m1124g());
                            break;
                        case 1:
                            C1396r c1396r2 = this.f6499b;
                            c1396r2.m3339P();
                            c1396r2.m3338O();
                            cfgData cfgdata3 = CFG4.f2728F;
                            cfgdata3.f2709w0 = z2;
                            c1396r2.m3341S();
                            cfgdata3.m1795o(c1396r2.m1124g());
                            break;
                        case 2:
                            C1396r c1396r3 = this.f6499b;
                            c1396r3.getClass();
                            cfgData cfgdata4 = CFG4.f2728F;
                            cfgdata4.f2584W1 = z2;
                            cfgdata4.m1795o(c1396r3.m1124g());
                            c1396r3.f6538c0.setVisibility(z2 ? 0 : 4);
                            break;
                        default:
                            C1396r c1396r4 = this.f6499b;
                            c1396r4.getClass();
                            cfgData cfgdata5 = CFG4.f2728F;
                            cfgdata5.f2588X1 = z2;
                            cfgdata5.m1795o(c1396r4.m1124g());
                            break;
                    }
                }
            });
        }
        final int i8 = 3;
        this.f6538c0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.h

            /* renamed from: b */
            public final /* synthetic */ C1396r f6499b;

            {
                this.f6499b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i8) {
                    case 0:
                        C1396r c1396r = this.f6499b;
                        c1396r.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2704v0 = z2;
                        cfgdata2.m1795o(c1396r.m1124g());
                        break;
                    case 1:
                        C1396r c1396r2 = this.f6499b;
                        c1396r2.m3339P();
                        c1396r2.m3338O();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2709w0 = z2;
                        c1396r2.m3341S();
                        cfgdata3.m1795o(c1396r2.m1124g());
                        break;
                    case 2:
                        C1396r c1396r3 = this.f6499b;
                        c1396r3.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2584W1 = z2;
                        cfgdata4.m1795o(c1396r3.m1124g());
                        c1396r3.f6538c0.setVisibility(z2 ? 0 : 4);
                        break;
                    default:
                        C1396r c1396r4 = this.f6499b;
                        c1396r4.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2588X1 = z2;
                        cfgdata5.m1795o(c1396r4.m1124g());
                        break;
                }
            }
        });
        this.f6535Z.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1388j(this));
        if (cfgdata.f2559Q0) {
            this.f6546k0.setVisibility(4);
        }
        if (cfgdata.f2508D3 == 12) {
            this.f6537b0.setVisibility(4);
            this.f6538c0.setVisibility(4);
            this.f6545j0.setVisibility(4);
        }
        AbstractC1256E0.m3021n(inflate);
        return inflate;
    }
}
