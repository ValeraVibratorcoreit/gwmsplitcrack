package com.altaysoft.t500_split;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import p001A0.RunnableC0017k;

/* loaded from: classes.dex */
public final class EditPpBridgeReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f2271a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.altaysoft.t500_split.action.EDIT_PP_PAUSE".equals(action) || "com.altaysoft.t500_split.action.EDIT_PP_RESUME".equals(action)) {
            int intExtra = intent.getIntExtra("user_theme_slot", -1);
            new Handler(Looper.getMainLooper()).post(new RunnableC0017k(context.getApplicationContext(), intExtra, action));
        }
    }
}
