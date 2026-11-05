package p001A0;

import android.widget.CompoundButton;
import com.altaysoft.t500_split.AutoBrightnessSettingsActivity;
import com.altaysoft.t500_split.AutoPresetSettingsActivity;
import com.altaysoft.t500_split.DriveModeSettingsActivity;
import com.altaysoft.t500_split.IpMessagesSettingsActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.SplitBallSettingsActivity;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1319h;
import p098q0.AbstractC1372y1;
import p098q0.C1249C;
import p121y0.AbstractC1680h;
import p123z.AbstractC1695c;

/* renamed from: A0.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C0031y implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f105a;

    /* renamed from: b */
    public final /* synthetic */ Object f106b;

    /* renamed from: c */
    public final /* synthetic */ Object f107c;

    public /* synthetic */ C0031y(Object obj, int i, Object obj2) {
        this.f105a = i;
        this.f107c = obj;
        this.f106b = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        Object obj = this.f106b;
        Object obj2 = this.f107c;
        switch (this.f105a) {
            case 0:
                int i = VoiceSettingsActivity.f3324M;
                VoiceSettingsActivity voiceSettingsActivity = (VoiceSettingsActivity) obj2;
                voiceSettingsActivity.getClass();
                if (z2 && !AbstractC1680h.m4881w(voiceSettingsActivity)) {
                    voiceSettingsActivity.f3325E.setChecked(false);
                    voiceSettingsActivity.m2012v(voiceSettingsActivity.getString(R.string.voice_dlg_install_first));
                    break;
                } else {
                    if (z2) {
                        if (!(AbstractC1695c.m4958a(voiceSettingsActivity, "android.permission.RECORD_AUDIO") == 0)) {
                            voiceSettingsActivity.f3325E.setChecked(false);
                            AbstractC1695c.m4965h(voiceSettingsActivity, new String[]{"android.permission.RECORD_AUDIO"}, 2101);
                            break;
                        }
                    }
                    cfgData cfgdata = (cfgData) obj;
                    cfgdata.f2551O0 = z2;
                    cfgdata.m1795o(voiceSettingsActivity);
                    C0021o.m28d().m36j(voiceSettingsActivity);
                    voiceSettingsActivity.m2011u();
                    break;
                }
                break;
            case 1:
                int i2 = AutoBrightnessSettingsActivity.f2262E;
                AutoBrightnessSettingsActivity autoBrightnessSettingsActivity = (AutoBrightnessSettingsActivity) obj2;
                autoBrightnessSettingsActivity.getClass();
                ((cfgData) obj).f2686r2 = z2;
                cfgData.m1784i().m1795o(autoBrightnessSettingsActivity);
                AbstractC1319h.m3189e(autoBrightnessSettingsActivity);
                break;
            case 2:
                int i3 = AutoPresetSettingsActivity.f2263F;
                AutoPresetSettingsActivity autoPresetSettingsActivity = (AutoPresetSettingsActivity) obj2;
                autoPresetSettingsActivity.getClass();
                ((cfgData) obj).f2696t2 = z2;
                autoPresetSettingsActivity.m1648v();
                break;
            case 3:
                int[] iArr = DriveModeSettingsActivity.f2270E;
                DriveModeSettingsActivity driveModeSettingsActivity = (DriveModeSettingsActivity) obj2;
                driveModeSettingsActivity.getClass();
                cfgData cfgdata2 = (cfgData) obj;
                cfgdata2.f2567S0 = z2;
                cfgdata2.m1795o(driveModeSettingsActivity);
                driveModeSettingsActivity.m1662u(z2);
                break;
            case 4:
                int[] iArr2 = DriveModeSettingsActivity.f2270E;
                DriveModeSettingsActivity driveModeSettingsActivity2 = (DriveModeSettingsActivity) obj2;
                driveModeSettingsActivity2.getClass();
                ((C1249C) obj).m2961a(z2);
                cfgData.m1784i().m1795o(driveModeSettingsActivity2);
                break;
            case 5:
                int i4 = IpMessagesSettingsActivity.f2303E;
                IpMessagesSettingsActivity ipMessagesSettingsActivity = (IpMessagesSettingsActivity) obj2;
                ipMessagesSettingsActivity.getClass();
                ((C1249C) obj).m2961a(z2);
                cfgData.m1784i().m1795o(ipMessagesSettingsActivity);
                AbstractC1294Y.m3149a(ipMessagesSettingsActivity);
                break;
            case 6:
                if (!AbstractC1372y1.m3299e((String) obj2)) {
                    ((CompoundButton.OnCheckedChangeListener) obj).onCheckedChanged(compoundButton, z2);
                    break;
                } else {
                    compoundButton.setChecked(false);
                    AbstractC1256E0.m3003R(compoundButton.getContext());
                    break;
                }
            default:
                int i5 = SplitBallSettingsActivity.f2341E;
                SplitBallSettingsActivity splitBallSettingsActivity = (SplitBallSettingsActivity) obj2;
                splitBallSettingsActivity.getClass();
                ((C1249C) obj).m2961a(z2);
                cfgData.m1784i().m1795o(splitBallSettingsActivity);
                break;
        }
    }
}
