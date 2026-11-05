package com.altaysoft.t500_split.radio;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.json.JSONObject;

/* renamed from: com.altaysoft.t500_split.radio.a */
/* loaded from: classes.dex */
public final class ServiceConnectionC0655a implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C0657c f3085a;

    public ServiceConnectionC0655a(C0657c c0657c) {
        this.f3085a = c0657c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0657c c0657c = this.f3085a;
        c0657c.f3087b = iBinder;
        String str = c0657c.f3089d;
        if (str != null) {
            JSONObject jSONObject = c0657c.f3090e;
            c0657c.f3089d = null;
            c0657c.f3090e = null;
            c0657c.m1937b(jSONObject, str);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3085a.f3087b = null;
    }
}
