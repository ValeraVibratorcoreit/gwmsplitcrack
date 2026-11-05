package p001A0;

import android.widget.CompoundButton;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;

/* renamed from: A0.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C0025s implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f86a;

    /* renamed from: b */
    public final /* synthetic */ VoiceSettingsActivity f87b;

    public /* synthetic */ C0025s(VoiceSettingsActivity voiceSettingsActivity, int i) {
        this.f86a = i;
        this.f87b = voiceSettingsActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        VoiceSettingsActivity voiceSettingsActivity = this.f87b;
        switch (this.f86a) {
            case 0:
                int i = VoiceSettingsActivity.f3324M;
                voiceSettingsActivity.getClass();
                Object tag = compoundButton.getTag(R.id.voiceCmdList);
                if (tag instanceof EnumC0007a) {
                    EnumC0007a enumC0007a = (EnumC0007a) tag;
                    enumC0007a.getClass();
                    cfgData m1784i = cfgData.m1784i();
                    int i2 = enumC0007a.f20a;
                    if (z2) {
                        m1784i.f2555P0 = (1 << i2) | m1784i.f2555P0;
                    } else {
                        m1784i.f2555P0 = (~(1 << i2)) & m1784i.f2555P0;
                    }
                    cfgData.m1784i().m1795o(voiceSettingsActivity);
                    break;
                }
                break;
            default:
                int i3 = VoiceSettingsActivity.f3324M;
                voiceSettingsActivity.getClass();
                Object tag2 = compoundButton.getTag(R.id.voiceCmdList);
                if (tag2 instanceof EnumC0007a) {
                    EnumC0007a enumC0007a2 = (EnumC0007a) tag2;
                    enumC0007a2.getClass();
                    cfgData m1784i2 = cfgData.m1784i();
                    int i4 = enumC0007a2.f20a;
                    if (z2) {
                        m1784i2.f2555P0 = (1 << i4) | m1784i2.f2555P0;
                    } else {
                        m1784i2.f2555P0 = (~(1 << i4)) & m1784i2.f2555P0;
                    }
                    cfgData.m1784i().m1795o(voiceSettingsActivity);
                    break;
                }
                break;
        }
    }
}
