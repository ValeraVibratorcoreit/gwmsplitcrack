package com.altaysoft.t500_split.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.altaysoft.t500_split.splitinfo.OemDigitClockView;
import p046X.AbstractC0408g;

/* renamed from: com.altaysoft.t500_split.media.a */
/* loaded from: classes.dex */
public final class C0633a extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f2984a;

    /* renamed from: b */
    public final /* synthetic */ Object f2985b;

    public /* synthetic */ C0633a(int i, Object obj) {
        this.f2984a = i;
        this.f2985b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String extraCallsInfo;
        Object obj = this.f2985b;
        switch (this.f2984a) {
            case 0:
                if (intent != null) {
                    extraCallsInfo = CallState.extraCallsInfo(intent);
                    ((CallState) obj).applyCallsInfo(extraCallsInfo);
                    break;
                }
                break;
            case 1:
                ((AbstractC0408g) obj).mo1090i();
                break;
            default:
                String action = intent.getAction();
                if ("android.intent.action.TIME_TICK".equals(action) || "android.intent.action.TIME_SET".equals(action) || "android.intent.action.TIMEZONE_CHANGED".equals(action)) {
                    int i = OemDigitClockView.f3204w;
                    ((OemDigitClockView) obj).m1970c(true);
                    break;
                }
                break;
        }
    }
}
