package com.altaysoft.t500_split;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p098q0.AbstractC1368x0;

/* loaded from: classes.dex */
public class CallReciever extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC1368x0.m3267a(context, intent.getStringExtra("state"));
    }
}
