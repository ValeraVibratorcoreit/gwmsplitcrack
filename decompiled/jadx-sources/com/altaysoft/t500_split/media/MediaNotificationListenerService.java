package com.altaysoft.t500_split.media;

import android.service.notification.NotificationListenerService;

/* loaded from: classes.dex */
public class MediaNotificationListenerService extends NotificationListenerService {

    /* renamed from: f */
    public static volatile MediaNotificationListenerService f2983f;

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        super.onListenerConnected();
        f2983f = this;
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerDisconnected() {
        f2983f = null;
        super.onListenerDisconnected();
    }
}
