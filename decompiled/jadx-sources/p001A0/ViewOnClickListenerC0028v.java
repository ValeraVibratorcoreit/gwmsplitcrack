package p001A0;

import android.os.Handler;
import android.view.View;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import java.io.File;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;
import p121y0.AbstractC1680h;

/* renamed from: A0.v */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0028v implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f94f;

    /* renamed from: g */
    public final /* synthetic */ VoiceSettingsActivity f95g;

    /* renamed from: h */
    public final /* synthetic */ DialogInterfaceC0867f f96h;

    /* renamed from: i */
    public final /* synthetic */ View f97i;

    /* renamed from: j */
    public final /* synthetic */ File f98j;

    public /* synthetic */ ViewOnClickListenerC0028v(VoiceSettingsActivity voiceSettingsActivity, DialogInterfaceC0867f dialogInterfaceC0867f, View view, File file, int i) {
        this.f94f = i;
        this.f95g = voiceSettingsActivity;
        this.f96h = dialogInterfaceC0867f;
        this.f97i = view;
        this.f98j = file;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final File file = this.f98j;
        final int i = 0;
        final int i2 = 1;
        View view2 = this.f97i;
        DialogInterfaceC0867f dialogInterfaceC0867f = this.f96h;
        final VoiceSettingsActivity voiceSettingsActivity = this.f95g;
        switch (this.f94f) {
            case 0:
                int i3 = VoiceSettingsActivity.f3324M;
                voiceSettingsActivity.getClass();
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, view2, null);
                voiceSettingsActivity.f3326F.setText(R.string.voice_status_copying);
                new Thread(new Runnable() { // from class: A0.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        VoiceSettingsActivity voiceSettingsActivity2 = voiceSettingsActivity;
                        File file2 = file;
                        switch (i2) {
                            case 0:
                                int i4 = VoiceSettingsActivity.f3324M;
                                voiceSettingsActivity2.getClass();
                                AbstractC1680h.m4871l(file2);
                                voiceSettingsActivity2.f3330J.post(new RunnableC0029w(voiceSettingsActivity2, true ^ file2.exists(), 0));
                                break;
                            default:
                                Handler handler = voiceSettingsActivity2.f3330J;
                                try {
                                    handler.post(new RunnableC0010d(voiceSettingsActivity2, AbstractC1680h.m4879u(file2, voiceSettingsActivity2), 1));
                                    break;
                                } catch (Exception e2) {
                                    handler.post(new RunnableC0030x(voiceSettingsActivity2, e2.getMessage() != null ? e2.getMessage() : String.valueOf(e2), 0));
                                }
                        }
                    }
                }, "voice-install").start();
                break;
            default:
                int i4 = VoiceSettingsActivity.f3324M;
                voiceSettingsActivity.getClass();
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, view2, null);
                voiceSettingsActivity.f3326F.setText(R.string.voice_status_deleting);
                C0021o m28d = C0021o.m28d();
                m28d.getClass();
                m28d.f67g = voiceSettingsActivity.getApplicationContext();
                m28d.f61a.removeCallbacks(m28d.f66f);
                m28d.m35i();
                m28d.m33g();
                m28d.f78r = 1;
                AbstractC0023q.m38a(1);
                C0006C m10c = C0006C.m10c(m28d.f67g);
                m10c.f10b.post(new RunnableC0004A(m10c, 0));
                new Thread(new Runnable() { // from class: A0.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        VoiceSettingsActivity voiceSettingsActivity2 = voiceSettingsActivity;
                        File file2 = file;
                        switch (i) {
                            case 0:
                                int i42 = VoiceSettingsActivity.f3324M;
                                voiceSettingsActivity2.getClass();
                                AbstractC1680h.m4871l(file2);
                                voiceSettingsActivity2.f3330J.post(new RunnableC0029w(voiceSettingsActivity2, true ^ file2.exists(), 0));
                                break;
                            default:
                                Handler handler = voiceSettingsActivity2.f3330J;
                                try {
                                    handler.post(new RunnableC0010d(voiceSettingsActivity2, AbstractC1680h.m4879u(file2, voiceSettingsActivity2), 1));
                                    break;
                                } catch (Exception e2) {
                                    handler.post(new RunnableC0030x(voiceSettingsActivity2, e2.getMessage() != null ? e2.getMessage() : String.valueOf(e2), 0));
                                }
                        }
                    }
                }, "voice-delete").start();
                break;
        }
    }
}
