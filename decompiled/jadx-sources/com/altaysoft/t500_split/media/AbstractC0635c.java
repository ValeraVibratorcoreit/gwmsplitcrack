package com.altaysoft.t500_split.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import p038T.RunnableC0318l;

/* renamed from: com.altaysoft.t500_split.media.c */
/* loaded from: classes.dex */
public abstract class AbstractC0635c {

    /* renamed from: b */
    public static MediaBrowser f2990b;

    /* renamed from: c */
    public static String f2991c;

    /* renamed from: d */
    public static boolean f2992d;

    /* renamed from: a */
    public static final Handler f2989a = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public static final RunnableC0318l f2993e = new RunnableC0318l(1);

    /* renamed from: a */
    public static void m1848a() {
        f2989a.removeCallbacks(f2993e);
        MediaBrowser mediaBrowser = f2990b;
        f2990b = null;
        f2991c = null;
        if (mediaBrowser == null) {
            return;
        }
        try {
            mediaBrowser.disconnect();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m1849b(Context context, String str) {
        ServiceInfo serviceInfo;
        if (str == null || str.trim().isEmpty() || "---".equals(str)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        f2992d = true;
        if (f2990b != null && str.equals(f2991c)) {
            if (f2990b.isConnected()) {
                m1850c(applicationContext);
                Handler handler = f2989a;
                RunnableC0318l runnableC0318l = f2993e;
                handler.removeCallbacks(runnableC0318l);
                handler.postDelayed(runnableC0318l, AbstractC0638f.m1862k(str) ? 15000L : 3000L);
                return;
            }
            return;
        }
        m1848a();
        Intent intent = new Intent("android.media.browse.MediaBrowserService");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentServices = applicationContext.getPackageManager().queryIntentServices(intent, 0);
        ComponentName componentName = (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) ? null : new ComponentName(serviceInfo.packageName, serviceInfo.name);
        if (componentName == null) {
            f2992d = false;
            return;
        }
        f2991c = str;
        MediaBrowser[] mediaBrowserArr = new MediaBrowser[1];
        try {
            MediaBrowser mediaBrowser = new MediaBrowser(applicationContext, componentName, new C0634b(mediaBrowserArr, applicationContext, str), null);
            mediaBrowserArr[0] = mediaBrowser;
            f2990b = mediaBrowser;
            mediaBrowser.connect();
        } catch (Exception unused) {
            f2990b = null;
            f2991c = null;
            f2992d = false;
        }
    }

    /* renamed from: c */
    public static void m1850c(Context context) {
        MediaBrowser mediaBrowser = f2990b;
        if (mediaBrowser == null || !mediaBrowser.isConnected()) {
            return;
        }
        try {
            MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
            if (sessionToken != null) {
                new MediaController(context, sessionToken).getTransportControls().play();
            }
        } catch (Exception unused) {
        }
    }
}
