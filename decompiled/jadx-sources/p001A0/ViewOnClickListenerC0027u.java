package p001A0;

import android.view.View;
import com.altaysoft.t500_split.reminders.RemindersActivity;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;

/* renamed from: A0.u */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0027u implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f91f;

    /* renamed from: g */
    public final /* synthetic */ DialogInterfaceC0867f f92g;

    /* renamed from: h */
    public final /* synthetic */ View f93h;

    public /* synthetic */ ViewOnClickListenerC0027u(DialogInterfaceC0867f dialogInterfaceC0867f, View view, int i) {
        this.f91f = i;
        this.f92g = dialogInterfaceC0867f;
        this.f93h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f93h;
        DialogInterfaceC0867f dialogInterfaceC0867f = this.f92g;
        switch (this.f91f) {
            case 0:
                int i = VoiceSettingsActivity.f3324M;
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, view2, null);
                break;
            case 1:
                int i2 = VoiceSettingsActivity.f3324M;
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, view2, null);
                break;
            case 2:
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, view2, null);
                break;
            case 3:
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, view2, null);
                break;
            case 4:
                int i3 = RemindersActivity.f3106I;
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, view2, null);
                break;
            default:
                AbstractC1256E0.m3027t(dialogInterfaceC0867f, view2, null);
                break;
        }
    }
}
