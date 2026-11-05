package p098q0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: q0.w0 */
/* loaded from: classes.dex */
public final class C1365w0 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC1368x0.m3267a(context, intent.getStringExtra("state"));
    }
}
