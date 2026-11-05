package p101r0;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.altaysoft.t500_split.AutoBrightnessSettingsActivity;
import com.altaysoft.t500_split.AutoPresetSettingsActivity;
import com.altaysoft.t500_split.DriveModeSettingsActivity;
import com.altaysoft.t500_split.IpMessagesSettingsActivity;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.SplitBallSettingsActivity;
import com.altaysoft.t500_split.SplitInfoSettingsActivity;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p000A.AbstractC0001b;
import p001A0.C0009c;
import p046X.AbstractComponentCallbacksC0423v;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p106t0.EnumC1457c;

/* renamed from: r0.q */
/* loaded from: classes.dex */
public class C1395q extends AbstractComponentCallbacksC0423v {

    /* renamed from: Z */
    public Switch f6513Z;

    /* renamed from: a0 */
    public Switch f6514a0;

    /* renamed from: b0 */
    public Switch f6515b0;

    /* renamed from: c0 */
    public TextView f6516c0;

    /* renamed from: d0 */
    public TextView f6517d0;

    /* renamed from: e0 */
    public TextView f6518e0;

    /* renamed from: f0 */
    public EditText f6519f0;

    /* renamed from: g0 */
    public EditText f6520g0;

    /* renamed from: h0 */
    public EditText f6521h0;

    /* renamed from: i0 */
    public EditText f6522i0;

    /* renamed from: j0 */
    public EditText f6523j0;

    /* renamed from: k0 */
    public EditText f6524k0;

    /* renamed from: l0 */
    public EditText f6525l0;

    /* renamed from: m0 */
    public EditText f6526m0;

    /* renamed from: n0 */
    public View f6527n0;

    /* renamed from: o0 */
    public View f6528o0;

    /* renamed from: p0 */
    public View f6529p0;

    /* renamed from: q0 */
    public View f6530q0;

    /* renamed from: r0 */
    public View f6531r0;

    /* renamed from: s0 */
    public View f6532s0;

    /* renamed from: t0 */
    public View f6533t0;

    /* renamed from: u0 */
    public View f6534u0;

    /* renamed from: Q */
    public static String m3330Q(int i) {
        Locale locale = Locale.ENGLISH;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: R */
    public static void m3331R(View view, boolean z2) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setAlpha(1.0f);
            textView.setTextColor(AbstractC0001b.m3a(textView.getContext(), z2 ? R.color.perm_granted : R.color.config_text_color));
        }
    }

    /* renamed from: S */
    public static int m3332S(EditText editText) {
        try {
            return Integer.parseInt(editText.getText().toString().trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: C */
    public final void mo1116C() {
        this.f1340H = true;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: D */
    public final void mo1117D() {
        boolean z2 = true;
        this.f1340H = true;
        if (this.f6519f0 != null) {
            m3333O();
        }
        m3331R(this.f6527n0, CFG4.f2728F.f2666n2);
        if (this.f6528o0 != null) {
            boolean m3299e = AbstractC1372y1.m3299e("auto_brightness");
            AbstractC1256E0.m3016i(this.f6528o0, m3299e);
            if (!m3299e) {
                m3331R(this.f6528o0, CFG4.f2728F.f2671o2);
            }
        }
        if (this.f6529p0 != null) {
            boolean m3299e2 = AbstractC1372y1.m3299e("auto_brightness");
            AbstractC1256E0.m3016i(this.f6529p0, m3299e2);
            if (!m3299e2) {
                m3331R(this.f6529p0, CFG4.f2728F.f2691s2);
            }
        }
        m3336U();
        m3335T();
        if (this.f6532s0 != null) {
            boolean m3299e3 = AbstractC1372y1.m3299e("voice_ctrl");
            AbstractC1256E0.m3016i(this.f6532s0, m3299e3);
            if (!m3299e3) {
                m3331R(this.f6532s0, CFG4.f2728F.f2551O0);
            }
        }
        if (this.f6533t0 != null) {
            m3331R(this.f6533t0, cfgData.m1783d(CFG4.f2728F.f2517F2) != 0);
        }
        View view = this.f6534u0;
        if (view == null) {
            return;
        }
        cfgData cfgdata = CFG4.f2728F;
        if (!cfgdata.f2521G2 && !cfgdata.f2525H2 && !cfgdata.f2529I2) {
            z2 = false;
        }
        m3331R(view, z2);
    }

    /* renamed from: O */
    public final void m3333O() {
        EditText editText = this.f6519f0;
        cfgData cfgdata = CFG4.f2728F;
        editText.setText(m3330Q(cfgdata.f2596Z1));
        this.f6520g0.setText(m3330Q(cfgdata.f2601a2));
        this.f6521h0.setText(m3330Q(cfgdata.f2606b2));
        this.f6522i0.setText(m3330Q(cfgdata.f2611c2));
        this.f6523j0.setText(m3330Q(cfgdata.f2616d2));
        this.f6524k0.setText(m3330Q(cfgdata.f2621e2));
        this.f6525l0.setText(m3330Q(cfgdata.f2626f2));
        this.f6526m0.setText(m3330Q(cfgdata.f2631g2));
    }

    /* renamed from: P */
    public final void m3334P(final EditText editText, final InterfaceC1394p interfaceC1394p) {
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: r0.o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                C1395q c1395q = C1395q.this;
                c1395q.getClass();
                if (z2) {
                    return;
                }
                EditText editText2 = editText;
                int m3332S = C1395q.m3332S(editText2);
                interfaceC1394p.mo17b(m3332S);
                editText2.setText(C1395q.m3330Q(m3332S));
                CFG4.f2728F.m1795o(c1395q.m1124g());
            }
        });
    }

    /* renamed from: T */
    public final void m3335T() {
        EnumC1457c enumC1457c;
        if (this.f6531r0 == null) {
            return;
        }
        boolean z2 = AbstractC1372y1.m3299e("drive_mode") || (enumC1457c = CFG4.f2728F.f2543M0) == null || !enumC1457c.f7154m;
        AbstractC1256E0.m3016i(this.f6531r0, z2);
        if (z2) {
            return;
        }
        m3331R(this.f6531r0, CFG4.f2728F.f2567S0);
    }

    /* renamed from: U */
    public final void m3336U() {
        if (this.f6530q0 == null) {
            return;
        }
        boolean m3299e = AbstractC1372y1.m3299e("ip_message");
        AbstractC1256E0.m3016i(this.f6530q0, m3299e);
        cfgData cfgdata = CFG4.f2728F;
        boolean z2 = cfgdata.f2497B2 || cfgdata.f2502C2 || cfgdata.f2507D2;
        if (m3299e) {
            return;
        }
        m3331R(this.f6530q0, z2);
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
        View inflate = layoutInflater.inflate(R.layout.fragment_settings_advanced2, viewGroup, false);
        this.f6513Z = (Switch) inflate.findViewById(R.id.CB_FW1791);
        this.f6514a0 = (Switch) inflate.findViewById(R.id.CB_noUpdateCheck);
        this.f6515b0 = (Switch) inflate.findViewById(R.id.CB_disableAP);
        Switch r9 = this.f6513Z;
        cfgData cfgdata = CFG4.f2728F;
        r9.setChecked(cfgdata.f2547N0);
        final int i = 0;
        this.f6513Z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.k

            /* renamed from: b */
            public final /* synthetic */ C1395q f6504b;

            {
                this.f6504b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i) {
                    case 0:
                        C1395q c1395q = this.f6504b;
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2547N0 = z2;
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        C1395q c1395q2 = this.f6504b;
                        c1395q2.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2559Q0 = z2;
                        if (z2) {
                            carData cardata = carData.getInstance();
                            cardata.f2468q.m1398g(Boolean.FALSE);
                        }
                        cfgdata3.m1795o(c1395q2.m1124g());
                        break;
                    default:
                        C1395q c1395q3 = this.f6504b;
                        c1395q3.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2563R0 = z2;
                        cfgdata4.m1795o(c1395q3.m1124g());
                        break;
                }
            }
        });
        this.f6514a0.setChecked(cfgdata.f2559Q0);
        this.f6514a0.setSingleLine(false);
        this.f6514a0.setHorizontallyScrolling(false);
        final int i2 = 1;
        this.f6514a0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.k

            /* renamed from: b */
            public final /* synthetic */ C1395q f6504b;

            {
                this.f6504b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i2) {
                    case 0:
                        C1395q c1395q = this.f6504b;
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2547N0 = z2;
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        C1395q c1395q2 = this.f6504b;
                        c1395q2.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2559Q0 = z2;
                        if (z2) {
                            carData cardata = carData.getInstance();
                            cardata.f2468q.m1398g(Boolean.FALSE);
                        }
                        cfgdata3.m1795o(c1395q2.m1124g());
                        break;
                    default:
                        C1395q c1395q3 = this.f6504b;
                        c1395q3.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2563R0 = z2;
                        cfgdata4.m1795o(c1395q3.m1124g());
                        break;
                }
            }
        });
        final int i3 = 2;
        AbstractC1256E0.m3023p(this.f6515b0, "disable_ap", cfgdata.f2563R0, new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.k

            /* renamed from: b */
            public final /* synthetic */ C1395q f6504b;

            {
                this.f6504b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i3) {
                    case 0:
                        C1395q c1395q = this.f6504b;
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2547N0 = z2;
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        C1395q c1395q2 = this.f6504b;
                        c1395q2.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2559Q0 = z2;
                        if (z2) {
                            carData cardata = carData.getInstance();
                            cardata.f2468q.m1398g(Boolean.FALSE);
                        }
                        cfgdata3.m1795o(c1395q2.m1124g());
                        break;
                    default:
                        C1395q c1395q3 = this.f6504b;
                        c1395q3.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2563R0 = z2;
                        cfgdata4.m1795o(c1395q3.m1124g());
                        break;
                }
            }
        });
        this.f6516c0 = (TextView) inflate.findViewById(R.id.id_speed_limit);
        this.f6517d0 = (TextView) inflate.findViewById(R.id.id_rpm_limit);
        this.f6518e0 = (TextView) inflate.findViewById(R.id.id_tire_pressure);
        TextView textView = this.f6516c0;
        Locale locale = Locale.ENGLISH;
        textView.setText(String.format(locale, "%.0f", Float.valueOf(cfgdata.f2568S1)).replace(",", "."));
        this.f6517d0.setText(String.format(locale, "%.1f", Float.valueOf(cfgdata.f2576U1)).replace(",", "."));
        this.f6518e0.setText(String.format(locale, "%.2f", Float.valueOf(cfgdata.f2580V1)).replace(",", "."));
        final int i4 = 1;
        this.f6516c0.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: r0.l

            /* renamed from: b */
            public final /* synthetic */ C1395q f6506b;

            {
                this.f6506b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                switch (i4) {
                    case 0:
                        C1395q c1395q = this.f6506b;
                        c1395q.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2580V1 = Float.parseFloat(c1395q.f6518e0.getText().toString());
                            } catch (NumberFormatException unused) {
                                Toast.makeText(c1395q.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 1:
                        C1395q c1395q2 = this.f6506b;
                        c1395q2.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2568S1 = Float.parseFloat(c1395q2.f6516c0.getText().toString());
                            } catch (NumberFormatException unused2) {
                                Toast.makeText(c1395q2.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q2.m1124g());
                            break;
                        }
                        break;
                    default:
                        C1395q c1395q3 = this.f6506b;
                        c1395q3.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2576U1 = Float.parseFloat(c1395q3.f6517d0.getText().toString());
                            } catch (NumberFormatException unused3) {
                                Toast.makeText(c1395q3.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q3.m1124g());
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 2;
        this.f6517d0.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: r0.l

            /* renamed from: b */
            public final /* synthetic */ C1395q f6506b;

            {
                this.f6506b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                switch (i5) {
                    case 0:
                        C1395q c1395q = this.f6506b;
                        c1395q.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2580V1 = Float.parseFloat(c1395q.f6518e0.getText().toString());
                            } catch (NumberFormatException unused) {
                                Toast.makeText(c1395q.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 1:
                        C1395q c1395q2 = this.f6506b;
                        c1395q2.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2568S1 = Float.parseFloat(c1395q2.f6516c0.getText().toString());
                            } catch (NumberFormatException unused2) {
                                Toast.makeText(c1395q2.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q2.m1124g());
                            break;
                        }
                        break;
                    default:
                        C1395q c1395q3 = this.f6506b;
                        c1395q3.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2576U1 = Float.parseFloat(c1395q3.f6517d0.getText().toString());
                            } catch (NumberFormatException unused3) {
                                Toast.makeText(c1395q3.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q3.m1124g());
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 0;
        this.f6518e0.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: r0.l

            /* renamed from: b */
            public final /* synthetic */ C1395q f6506b;

            {
                this.f6506b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                switch (i6) {
                    case 0:
                        C1395q c1395q = this.f6506b;
                        c1395q.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2580V1 = Float.parseFloat(c1395q.f6518e0.getText().toString());
                            } catch (NumberFormatException unused) {
                                Toast.makeText(c1395q.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 1:
                        C1395q c1395q2 = this.f6506b;
                        c1395q2.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2568S1 = Float.parseFloat(c1395q2.f6516c0.getText().toString());
                            } catch (NumberFormatException unused2) {
                                Toast.makeText(c1395q2.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q2.m1124g());
                            break;
                        }
                        break;
                    default:
                        C1395q c1395q3 = this.f6506b;
                        c1395q3.getClass();
                        if (!z2) {
                            try {
                                CFG4.f2728F.f2576U1 = Float.parseFloat(c1395q3.f6517d0.getText().toString());
                            } catch (NumberFormatException unused3) {
                                Toast.makeText(c1395q3.m1124g(), "Неправильный формат ввода", 1).show();
                            }
                            CFG4.f2728F.m1795o(c1395q3.m1124g());
                            break;
                        }
                        break;
                }
            }
        });
        this.f6519f0 = (EditText) inflate.findViewById(R.id.yn_corr_pp_left);
        this.f6520g0 = (EditText) inflate.findViewById(R.id.yn_corr_pp_right);
        this.f6521h0 = (EditText) inflate.findViewById(R.id.yn_corr_pp_top);
        this.f6522i0 = (EditText) inflate.findViewById(R.id.yn_corr_pp_bottom);
        this.f6523j0 = (EditText) inflate.findViewById(R.id.yn_corr_hu_left);
        this.f6524k0 = (EditText) inflate.findViewById(R.id.yn_corr_hu_right);
        this.f6525l0 = (EditText) inflate.findViewById(R.id.yn_corr_hu_top);
        this.f6526m0 = (EditText) inflate.findViewById(R.id.yn_corr_hu_bottom);
        inflate.findViewById(R.id.btn_yn_corr_defaults).setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i6) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        this.f6532s0 = inflate.findViewById(R.id.btn_voice_control);
        this.f6531r0 = inflate.findViewById(R.id.btn_drive_modes);
        final int i7 = 1;
        this.f6532s0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i7) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        final int i8 = 2;
        this.f6531r0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i8) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById = inflate.findViewById(R.id.btn_ym_settings);
        this.f6527n0 = findViewById;
        final int i9 = 3;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i9) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById2 = inflate.findViewById(R.id.btn_auto_brightness);
        this.f6528o0 = findViewById2;
        final int i10 = 4;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i10) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById3 = inflate.findViewById(R.id.btn_auto_preset);
        this.f6529p0 = findViewById3;
        final int i11 = 5;
        findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i11) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById4 = inflate.findViewById(R.id.btn_ip_messages);
        this.f6530q0 = findViewById4;
        final int i12 = 6;
        findViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i12) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById5 = inflate.findViewById(R.id.btn_split_info);
        this.f6533t0 = findViewById5;
        final int i13 = 7;
        findViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i13) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById6 = inflate.findViewById(R.id.btn_split_ball);
        this.f6534u0 = findViewById6;
        final int i14 = 8;
        findViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: r0.m

            /* renamed from: g */
            public final /* synthetic */ C1395q f6508g;

            {
                this.f6508g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1395q c1395q = this.f6508g;
                switch (i14) {
                    case 0:
                        c1395q.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2596Z1 = 30;
                        cfgdata2.f2601a2 = 30;
                        cfgdata2.f2606b2 = 0;
                        cfgdata2.f2611c2 = 30;
                        cfgdata2.f2616d2 = 30;
                        cfgdata2.f2621e2 = 30;
                        cfgdata2.f2626f2 = 0;
                        cfgdata2.f2631g2 = 30;
                        c1395q.m3333O();
                        cfgdata2.m1795o(c1395q.m1124g());
                        break;
                    case 1:
                        c1395q.getClass();
                        if (!AbstractC1372y1.m3299e("voice_ctrl")) {
                            AbstractActivityC0870i m1124g = c1395q.m1124g();
                            Intent intent = new Intent(c1395q.m1124g(), (Class<?>) VoiceSettingsActivity.class);
                            AtomicBoolean atomicBoolean = MainActivity.f2306M;
                            if (m1124g != null) {
                                m1124g.startActivity(intent);
                                break;
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1395q.m1124g());
                            break;
                        }
                        break;
                    case 2:
                        c1395q.getClass();
                        EnumC1457c enumC1457c = CFG4.f2728F.f2543M0;
                        if (enumC1457c != null && enumC1457c.f7154m) {
                            if (!AbstractC1372y1.m3299e("drive_mode")) {
                                AbstractActivityC0870i m1124g2 = c1395q.m1124g();
                                Intent intent2 = new Intent(c1395q.m1124g(), (Class<?>) DriveModeSettingsActivity.class);
                                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                if (m1124g2 != null) {
                                    m1124g2.startActivity(intent2);
                                    break;
                                }
                            } else {
                                AbstractC1256E0.m3003R(c1395q.m1124g());
                                break;
                            }
                        } else {
                            AbstractC1372y1.m3288S(c1395q.m1124g(), c1395q.m1130m(R.string.Message), c1395q.m1130m(R.string.msgDriveModeCarUnsupported), null);
                            break;
                        }
                        break;
                    case 3:
                        AbstractActivityC0870i m1124g3 = c1395q.m1124g();
                        if (m1124g3 != null && !m1124g3.isFinishing()) {
                            Intent intent3 = new Intent(m1124g3, (Class<?>) YmSettingsActivity.class);
                            AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                            m1124g3.startActivity(intent3);
                            break;
                        }
                        break;
                    case 4:
                        AbstractActivityC0870i m1124g4 = c1395q.m1124g();
                        if (m1124g4 != null && !m1124g4.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent4 = new Intent(m1124g4, (Class<?>) AutoBrightnessSettingsActivity.class);
                                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                                m1124g4.startActivity(intent4);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g4);
                                break;
                            }
                        }
                        break;
                    case 5:
                        AbstractActivityC0870i m1124g5 = c1395q.m1124g();
                        if (m1124g5 != null && !m1124g5.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("auto_brightness")) {
                                Intent intent5 = new Intent(m1124g5, (Class<?>) AutoPresetSettingsActivity.class);
                                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                                m1124g5.startActivity(intent5);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g5);
                                break;
                            }
                        }
                        break;
                    case 6:
                        AbstractActivityC0870i m1124g6 = c1395q.m1124g();
                        if (m1124g6 != null && !m1124g6.isFinishing()) {
                            if (!AbstractC1372y1.m3299e("ip_message")) {
                                Intent intent6 = new Intent(m1124g6, (Class<?>) IpMessagesSettingsActivity.class);
                                AtomicBoolean atomicBoolean6 = MainActivity.f2306M;
                                m1124g6.startActivity(intent6);
                                break;
                            } else {
                                AbstractC1256E0.m3003R(m1124g6);
                                break;
                            }
                        }
                        break;
                    case 7:
                        AbstractActivityC0870i m1124g7 = c1395q.m1124g();
                        if (m1124g7 != null && !m1124g7.isFinishing()) {
                            Intent intent7 = new Intent(m1124g7, (Class<?>) SplitInfoSettingsActivity.class);
                            AtomicBoolean atomicBoolean7 = MainActivity.f2306M;
                            m1124g7.startActivity(intent7);
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0870i m1124g8 = c1395q.m1124g();
                        if (m1124g8 != null && !m1124g8.isFinishing()) {
                            Intent intent8 = new Intent(m1124g8, (Class<?>) SplitBallSettingsActivity.class);
                            AtomicBoolean atomicBoolean8 = MainActivity.f2306M;
                            m1124g8.startActivity(intent8);
                            break;
                        }
                        break;
                }
            }
        });
        m3333O();
        m3334P(this.f6519f0, new C0009c(29));
        m3334P(this.f6520g0, new C1392n(0));
        m3334P(this.f6521h0, new C1392n(1));
        m3334P(this.f6522i0, new C1392n(2));
        m3334P(this.f6523j0, new C1392n(3));
        m3334P(this.f6524k0, new C1392n(4));
        m3334P(this.f6525l0, new C1392n(5));
        m3334P(this.f6526m0, new C1392n(6));
        AbstractC1256E0.m3021n(inflate);
        m3331R(this.f6527n0, CFG4.f2728F.f2666n2);
        if (this.f6528o0 != null) {
            boolean m3299e = AbstractC1372y1.m3299e("auto_brightness");
            AbstractC1256E0.m3016i(this.f6528o0, m3299e);
            if (!m3299e) {
                m3331R(this.f6528o0, CFG4.f2728F.f2671o2);
            }
        }
        if (this.f6529p0 != null) {
            boolean m3299e2 = AbstractC1372y1.m3299e("auto_brightness");
            AbstractC1256E0.m3016i(this.f6529p0, m3299e2);
            if (!m3299e2) {
                m3331R(this.f6529p0, CFG4.f2728F.f2691s2);
            }
        }
        m3336U();
        m3335T();
        if (this.f6532s0 != null) {
            boolean m3299e3 = AbstractC1372y1.m3299e("voice_ctrl");
            AbstractC1256E0.m3016i(this.f6532s0, m3299e3);
            if (!m3299e3) {
                m3331R(this.f6532s0, CFG4.f2728F.f2551O0);
            }
        }
        if (this.f6533t0 != null) {
            m3331R(this.f6533t0, cfgData.m1783d(CFG4.f2728F.f2517F2) != 0);
        }
        View view = this.f6534u0;
        if (view != null) {
            cfgData cfgdata2 = CFG4.f2728F;
            m3331R(view, cfgdata2.f2521G2 || cfgdata2.f2525H2 || cfgdata2.f2529I2);
        }
        return inflate;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: y */
    public final void mo1139y() {
        EditText editText = this.f6519f0;
        if (editText != null) {
            cfgData cfgdata = CFG4.f2728F;
            cfgdata.f2596Z1 = m3332S(editText);
            cfgdata.f2601a2 = m3332S(this.f6520g0);
            cfgdata.f2606b2 = m3332S(this.f6521h0);
            cfgdata.f2611c2 = m3332S(this.f6522i0);
            cfgdata.f2616d2 = m3332S(this.f6523j0);
            cfgdata.f2621e2 = m3332S(this.f6524k0);
            cfgdata.f2626f2 = m3332S(this.f6525l0);
            cfgdata.f2631g2 = m3332S(this.f6526m0);
        }
        this.f1340H = true;
        try {
            cfgData cfgdata2 = CFG4.f2728F;
            cfgdata2.f2580V1 = Float.parseFloat(this.f6518e0.getText().toString());
            cfgdata2.f2568S1 = Float.parseFloat(this.f6516c0.getText().toString());
            cfgdata2.f2576U1 = Float.parseFloat(this.f6517d0.getText().toString());
        } catch (NumberFormatException unused) {
            Toast.makeText(m1124g(), "Неправильный формат ввода", 1).show();
        }
        CFG4.f2728F.m1795o(m1124g());
    }
}
