package p001A0;

import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;

/* renamed from: A0.x */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0030x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f102a;

    /* renamed from: b */
    public final /* synthetic */ VoiceSettingsActivity f103b;

    /* renamed from: c */
    public final /* synthetic */ String f104c;

    public /* synthetic */ RunnableC0030x(VoiceSettingsActivity voiceSettingsActivity, String str, int i) {
        this.f102a = i;
        this.f103b = voiceSettingsActivity;
        this.f104c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f104c;
        VoiceSettingsActivity voiceSettingsActivity = this.f103b;
        switch (this.f102a) {
            case 0:
                int i = VoiceSettingsActivity.f3324M;
                if (!voiceSettingsActivity.isFinishing()) {
                    voiceSettingsActivity.m2012v(voiceSettingsActivity.getString(R.string.voice_dlg_error, str));
                    voiceSettingsActivity.m2011u();
                    break;
                }
                break;
            default:
                int i2 = VoiceSettingsActivity.f3324M;
                if (!voiceSettingsActivity.isFinishing()) {
                    voiceSettingsActivity.m2012v(voiceSettingsActivity.getString(R.string.voice_dlg_search_error, str));
                    voiceSettingsActivity.m2011u();
                    break;
                }
                break;
        }
    }
}
