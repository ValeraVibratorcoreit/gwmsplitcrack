package com.altaysoft.t500_split;

import android.app.ActivityOptions;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class BootCompletedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED") && context.getSharedPreferences("T500_SPLIT_AS", 0).getBoolean("astart", false)) {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.addFlags(402657280);
            intent2.putExtra("caller", "service");
            context.startActivity(intent2, makeBasic.toBundle());
        }
    }
}
