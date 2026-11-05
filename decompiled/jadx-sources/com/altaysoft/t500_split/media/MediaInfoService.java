package com.altaysoft.t500_split.media;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.lifecycle.C0560y;
import com.altaysoft.t500_split.radio.C0658d;
import com.altaysoft.t500_split.radio.RadioState;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import p001A0.RunnableC0020n;
import p001A0.RunnableC0024r;
import p006C.AbstractC0062j;

/* loaded from: classes.dex */
public class MediaInfoService extends Service {

    /* renamed from: o */
    public static volatile MediaInfoService f2973o;

    /* renamed from: f */
    public HandlerThread f2974f;

    /* renamed from: g */
    public Handler f2975g;

    /* renamed from: h */
    public volatile boolean f2976h;

    /* renamed from: i */
    public String f2977i;

    /* renamed from: j */
    public Bitmap f2978j;

    /* renamed from: k */
    public Bitmap f2979k;

    /* renamed from: l */
    public C0636d f2980l;

    /* renamed from: m */
    public final RunnableC0024r f2981m = new RunnableC0024r(12, this);

    /* renamed from: n */
    public final RunnableC0020n f2982n = new RunnableC0020n(9, this);

    /* renamed from: c */
    public static void m1845c() {
        Handler handler;
        MediaInfoService mediaInfoService = f2973o;
        if (mediaInfoService == null || !mediaInfoService.f2976h || (handler = mediaInfoService.f2975g) == null) {
            return;
        }
        handler.post(mediaInfoService.f2981m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0261, code lost:
    
        if (r11 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0141, code lost:
    
        if (r13 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fd, code lost:
    
        if (r0 != null) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1846a() {
        String str;
        String str2;
        String str3;
        String str4;
        long position;
        String str5;
        Bitmap m1857f;
        Bitmap bitmap;
        Bitmap bitmap2;
        C0636d mediaInfo;
        if (CallState.getInstance().active() && (mediaInfo = CallState.getInstance().toMediaInfo()) != null) {
            this.f2977i = AbstractC0638f.m1871t(289);
            this.f2978j = mediaInfo.f2999e;
            C0639g.m1872x().m1873B(mediaInfo);
            return;
        }
        C0658d current = RadioState.getInstance().current();
        if (current != null && current.f3093a && current.m1943c()) {
            C0639g.m1872x().m1873B(current.m1946f(this, RadioState.getInstance().art()));
            return;
        }
        try {
            List m1855d = AbstractC0638f.m1855d(this);
            String str6 = AbstractC0638f.f3008b;
            MediaController m1853b = (str6 == null || str6.isEmpty()) ? null : AbstractC0638f.m1853b(m1855d, str6);
            if (m1853b == null || !AbstractC0638f.m1859h(m1853b) || AbstractC0638f.m1861j(m1853b)) {
                m1853b = AbstractC0638f.m1852a(m1855d);
            }
            if (m1853b == null || !AbstractC0638f.m1859h(m1853b) || AbstractC0638f.m1861j(m1853b)) {
                m1847b();
                return;
            }
            String packageName = m1853b.getPackageName();
            MediaMetadata metadata = m1853b.getMetadata();
            if (metadata == null) {
                str = null;
            } else {
                String string = metadata.getString("android.media.metadata.TITLE");
                if (!AbstractC0638f.m1860i(string)) {
                    string = metadata.getString("android.media.metadata.DISPLAY_TITLE");
                }
                if (!AbstractC0638f.m1860i(string)) {
                    string = null;
                }
                str = string;
            }
            MediaMetadata metadata2 = m1853b.getMetadata();
            if (metadata2 == null) {
                str2 = null;
            } else {
                String string2 = metadata2.getString("android.media.metadata.ARTIST");
                if (!AbstractC0638f.m1860i(string2)) {
                    string2 = metadata2.getString("android.media.metadata.DISPLAY_SUBTITLE");
                }
                if (!AbstractC0638f.m1860i(string2)) {
                    string2 = null;
                }
                str2 = string2;
            }
            MediaMetadata metadata3 = m1853b.getMetadata();
            if (metadata3 == null) {
                str3 = null;
            } else {
                String string3 = metadata3.getString("android.media.metadata.ALBUM");
                if (!AbstractC0638f.m1860i(string3)) {
                    string3 = null;
                }
                str3 = string3;
            }
            MediaMetadata metadata4 = m1853b.getMetadata();
            if (metadata4 == null) {
                str4 = null;
            } else {
                String string4 = metadata4.getString("android.media.metadata.MEDIA_ID");
                if (!AbstractC0638f.m1860i(string4)) {
                    string4 = null;
                }
                str4 = string4;
            }
            PlaybackState playbackState = m1853b.getPlaybackState();
            boolean z2 = playbackState != null && playbackState.getState() == 3;
            PlaybackState playbackState2 = m1853b.getPlaybackState();
            long j2 = 0;
            if (playbackState2 == null) {
                str5 = packageName;
            } else {
                position = playbackState2.getPosition();
                if (playbackState2.getState() == 3) {
                    str5 = packageName;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - playbackState2.getLastPositionUpdateTime();
                    if (elapsedRealtime > 0) {
                        position += (long) (playbackState2.getPlaybackSpeed() * elapsedRealtime);
                    }
                } else {
                    str5 = packageName;
                }
            }
            position = 0;
            MediaMetadata metadata5 = m1853b.getMetadata();
            if (metadata5 != null) {
                long j3 = metadata5.getLong("android.media.metadata.DURATION");
                if (j3 > 0) {
                    j2 = j3;
                }
            }
            long j4 = j2;
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append("|");
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            String m162p = AbstractC0062j.m162p(sb, "|", str3);
            if (!m162p.equals(this.f2977i) || (m1857f = this.f2978j) == null) {
                m1857f = AbstractC0638f.m1857f(m1853b);
                if (m1857f == null) {
                    String m1856e = AbstractC0638f.m1856e(m1853b);
                    if (m1856e != null) {
                        if (!TextUtils.isEmpty(m1856e)) {
                            try {
                                Uri parse = Uri.parse(m1856e);
                                String scheme = parse.getScheme();
                                if (!"content".equals(scheme) && !"file".equals(scheme)) {
                                    if ("http".equals(scheme) || "https".equals(scheme)) {
                                        URLConnection openConnection = new URL(m1856e).openConnection();
                                        openConnection.setConnectTimeout(5000);
                                        openConnection.setReadTimeout(5000);
                                        InputStream inputStream = openConnection.getInputStream();
                                        try {
                                            m1857f = BitmapFactory.decodeStream(inputStream);
                                            inputStream.close();
                                        } catch (Throwable th) {
                                            inputStream.close();
                                            throw th;
                                        }
                                    }
                                }
                                InputStream openInputStream = getContentResolver().openInputStream(parse);
                                if (openInputStream != null) {
                                    try {
                                        m1857f = BitmapFactory.decodeStream(openInputStream);
                                        openInputStream.close();
                                    } catch (Throwable th2) {
                                        openInputStream.close();
                                        throw th2;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        m1857f = null;
                    }
                    MediaNotificationListenerService mediaNotificationListenerService = MediaNotificationListenerService.f2983f;
                    if (mediaNotificationListenerService != null && str5 != null) {
                        try {
                            StatusBarNotification[] activeNotifications = mediaNotificationListenerService.getActiveNotifications();
                            if (activeNotifications != null) {
                                for (StatusBarNotification statusBarNotification : activeNotifications) {
                                    if (str5.equals(statusBarNotification.getPackageName())) {
                                        Notification notification = statusBarNotification.getNotification();
                                        if (notification != null) {
                                            Bundle bundle = notification.extras;
                                            if (bundle == null || ((bitmap2 = (Bitmap) bundle.getParcelable("android.picture")) == null && (bitmap2 = (Bitmap) notification.extras.getParcelable("android.largeIcon")) == null)) {
                                                Icon largeIcon = notification.getLargeIcon();
                                                if (largeIcon != null) {
                                                    Drawable loadDrawable = largeIcon.loadDrawable(this);
                                                    if (loadDrawable instanceof BitmapDrawable) {
                                                        bitmap2 = ((BitmapDrawable) loadDrawable).getBitmap();
                                                        if (bitmap2 == null) {
                                                            bitmap2 = notification.largeIcon;
                                                        }
                                                    }
                                                }
                                                bitmap2 = null;
                                                if (bitmap2 == null) {
                                                }
                                            }
                                            if (bitmap2 == null) {
                                                bitmap = bitmap2;
                                                break;
                                            }
                                        }
                                        bitmap2 = null;
                                        if (bitmap2 == null) {
                                        }
                                    }
                                }
                            }
                        } catch (SecurityException unused2) {
                        }
                    }
                    bitmap = null;
                    m1857f = bitmap;
                }
                this.f2978j = m1857f;
                this.f2977i = m162p;
            }
            Bitmap bitmap3 = m1857f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                this.f2979k = bitmap3;
            }
            C0636d c0636d = new C0636d(str5, str, str2, str3, bitmap3, z2, position, j4, str4);
            if (c0636d.m1851a()) {
                this.f2980l = c0636d;
            }
            C0639g.m1872x().m1873B(c0636d);
        } catch (SecurityException unused3) {
            m1847b();
        }
    }

    /* renamed from: b */
    public final void m1847b() {
        if (this.f2977i == null && this.f2978j == null && !C0639g.m1872x().m1880u().m1851a()) {
            return;
        }
        this.f2977i = null;
        this.f2978j = null;
        C0639g m1872x = C0639g.m1872x();
        ((C0560y) m1872x.f3011g).m1398g(C0636d.f2994j);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f2973o = this;
        CallState.getInstance().start(this);
        RadioState.getInstance().start(this);
        HandlerThread handlerThread = new HandlerThread("MediaInfoPoll");
        this.f2974f = handlerThread;
        handlerThread.start();
        this.f2975g = new Handler(this.f2974f.getLooper());
        this.f2976h = true;
        this.f2975g.post(this.f2982n);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f2976h = false;
        f2973o = null;
        CallState.getInstance().stop();
        RadioState.getInstance().stop();
        Handler handler = this.f2975g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.f2974f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f2977i = null;
        this.f2978j = null;
        this.f2979k = null;
        this.f2980l = null;
        C0639g m1872x = C0639g.m1872x();
        ((C0560y) m1872x.f3011g).m1398g(C0636d.f2994j);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
