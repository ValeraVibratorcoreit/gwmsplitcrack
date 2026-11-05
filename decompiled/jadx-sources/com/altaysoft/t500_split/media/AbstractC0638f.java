package com.altaysoft.t500_split.media;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.cfgData;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.altaysoft.t500_split.media.f */
/* loaded from: classes.dex */
public abstract class AbstractC0638f {

    /* renamed from: a */
    public static final String[] f3007a = {"com.android.bluetooth", "com.gdc.carplay", "com.gwm.app.aap", "com.gwm.app.media.server.bluetooth", "ru.auto.music", "ru.yandex.music", "yandex.auto.music"};

    /* renamed from: b */
    public static volatile String f3008b;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r5 != 8) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[EDGE_INSN: B:36:0x006c->B:30:0x006c BREAK  A[LOOP:1: B:24:0x0053->B:27:0x0069], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaController m1852a(List list) {
        int i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        int i2 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        MediaController mediaController = null;
        while (it.hasNext()) {
            MediaController mediaController2 = (MediaController) it.next();
            String packageName = mediaController2.getPackageName();
            PlaybackState playbackState = mediaController2.getPlaybackState();
            int i3 = 0;
            if (playbackState != null) {
                int state = playbackState.getState();
                if (state == 2) {
                    i = 60;
                } else if (state != 3) {
                    if (state != 6) {
                        if (state == 7) {
                            i = -100;
                        }
                    }
                    i = 40;
                } else {
                    i = 100;
                }
                if (m1859h(mediaController2)) {
                    i += 50;
                }
                while (true) {
                    if (i3 >= 7) {
                        break;
                    }
                    if (f3007a[i3].equals(packageName)) {
                        i += 15 - Math.min(i3, 14);
                        break;
                    }
                    i3++;
                }
                if (i <= i2) {
                    mediaController = mediaController2;
                    i2 = i;
                }
            }
            i = 0;
            if (m1859h(mediaController2)) {
            }
            while (true) {
                if (i3 >= 7) {
                }
                i3++;
            }
            if (i <= i2) {
            }
        }
        if (i2 > 0) {
            return mediaController;
        }
        return null;
    }

    /* renamed from: b */
    public static MediaController m1853b(List list, String str) {
        if (list != null && str != null && !str.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaController mediaController = (MediaController) it.next();
                if (mediaController != null && str.equals(mediaController.getPackageName()) && !m1861j(mediaController)) {
                    return mediaController;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static MediaController m1854c(Context context) {
        MediaController m1853b;
        try {
            List m1855d = m1855d(context);
            String str = f3008b;
            return (str == null || str.isEmpty() || (m1853b = m1853b(m1855d, str)) == null) ? m1852a(m1855d) : m1853b;
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static List m1855d(Context context) {
        MediaSessionManager mediaSessionManager = (MediaSessionManager) context.getSystemService(MediaSessionManager.class);
        if (mediaSessionManager == null) {
            return null;
        }
        return mediaSessionManager.getActiveSessions(new ComponentName(context, (Class<?>) MediaNotificationListenerService.class));
    }

    /* renamed from: e */
    public static String m1856e(MediaController mediaController) {
        Uri iconUri;
        MediaMetadata metadata = mediaController.getMetadata();
        if (metadata == null) {
            return null;
        }
        String string = metadata.getString("android.media.metadata.ALBUM_ART_URI");
        if (TextUtils.isEmpty(string)) {
            string = metadata.getString("android.media.metadata.ART_URI");
        }
        if (TextUtils.isEmpty(string)) {
            string = metadata.getString("android.media.metadata.DISPLAY_ICON_URI");
        }
        if (TextUtils.isEmpty(string) && metadata.getDescription() != null && (iconUri = metadata.getDescription().getIconUri()) != null) {
            string = iconUri.toString();
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* renamed from: f */
    public static Bitmap m1857f(MediaController mediaController) {
        MediaMetadata metadata = mediaController.getMetadata();
        if (metadata == null) {
            return null;
        }
        String[] strArr = {"android.media.metadata.ALBUM_ART", "android.media.metadata.ART", "android.media.metadata.DISPLAY_ICON"};
        for (int i = 0; i < 3; i++) {
            Bitmap bitmap = metadata.getBitmap(strArr[i]);
            if (bitmap != null) {
                return bitmap;
            }
        }
        MediaDescription description = metadata.getDescription();
        if (description == null || description.getIconBitmap() == null) {
            return null;
        }
        return description.getIconBitmap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1858g(Context context) {
        String m1870s;
        cfgData m1784i = cfgData.m1784i();
        if (m1784i.f2651k2) {
            m1870s = m1870s(m1784i.f2544M1);
            if (m1864m(m1870s)) {
                boolean z2 = false;
                try {
                    String string = Settings.System.getString(context.getContentResolver(), "com.audio.focus.change");
                    if (string != null && !string.isEmpty()) {
                        String[] split = string.split(":");
                        String lowerCase = split.length > 0 ? split[0].toLowerCase() : "";
                        String lowerCase2 = split.length > 2 ? split[2].toLowerCase() : "";
                        if (!lowerCase.isEmpty() && !m1864m(lowerCase)) {
                            z2 = lowerCase2.contains("gain");
                        }
                    }
                } catch (Exception unused) {
                }
                if (m1863l(context, m1870s)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0637e(context.getApplicationContext(), 0, m1870s), 500L);
                    return;
                }
                return;
            }
            return;
        }
        return;
        if (m1863l(context, m1870s)) {
        }
    }

    /* renamed from: h */
    public static boolean m1859h(MediaController mediaController) {
        MediaMetadata metadata = mediaController.getMetadata();
        if (metadata == null) {
            return false;
        }
        return m1860i(metadata.getString("android.media.metadata.TITLE")) || m1860i(metadata.getString("android.media.metadata.DISPLAY_TITLE")) || m1860i(metadata.getString("android.media.metadata.ARTIST")) || m1860i(metadata.getString("android.media.metadata.DISPLAY_SUBTITLE")) || m1860i(metadata.getString("android.media.metadata.ALBUM")) || m1857f(mediaController) != null || m1856e(mediaController) != null;
    }

    /* renamed from: i */
    public static boolean m1860i(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* renamed from: j */
    public static boolean m1861j(MediaController mediaController) {
        PlaybackState playbackState = mediaController.getPlaybackState();
        return playbackState != null && playbackState.getState() == 7;
    }

    /* renamed from: k */
    public static boolean m1862k(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return "yandex.auto.music".equals(str.toLowerCase(Locale.US));
    }

    /* renamed from: l */
    public static boolean m1863l(Context context, String str) {
        if (str == null || str.trim().isEmpty() || "---".equals(str)) {
            return false;
        }
        try {
            List<MediaController> m1855d = m1855d(context);
            if (m1855d == null) {
                return false;
            }
            for (MediaController mediaController : m1855d) {
                if (mediaController != null && str.equals(mediaController.getPackageName())) {
                    PlaybackState playbackState = mediaController.getPlaybackState();
                    if (playbackState == null) {
                        return false;
                    }
                    int state = playbackState.getState();
                    return state == 3 || state == 6;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m1864m(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("yandex") || lowerCase.equals("ru.auto.music");
    }

    /* renamed from: n */
    public static ArrayList m1865n(Context context) {
        List<MediaController> m1855d;
        String packageName;
        ArrayList arrayList = new ArrayList();
        try {
            m1855d = m1855d(context);
        } catch (SecurityException unused) {
        }
        if (m1855d == null) {
            return arrayList;
        }
        for (MediaController mediaController : m1855d) {
            if (mediaController != null && !m1861j(mediaController) && (packageName = mediaController.getPackageName()) != null && !packageName.isEmpty() && !arrayList.contains(packageName)) {
                arrayList.add(packageName);
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public static int m1866o(MediaController mediaController) {
        int i = 0;
        if (mediaController == null) {
            return 0;
        }
        if (!m1862k(mediaController.getPackageName())) {
            return AbstractC0648p.m1913f(mediaController.getQueueTitle());
        }
        MediaMetadata metadata = mediaController.getMetadata();
        if (metadata == null) {
            return 0;
        }
        String string = metadata.getString("android.media.metadata.MEDIA_ID");
        if (string != null && !string.isEmpty()) {
            String lowerCase = string.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("onyourwave") || lowerCase.contains("catalog_station_tagonyourwave")) {
                i = 1;
            } else if (lowerCase.contains("playlist_kind3")) {
                i = 2;
            }
        }
        return i != 0 ? i : AbstractC0648p.m1913f(metadata.getString("android.media.metadata.ALBUM"));
    }

    /* renamed from: p */
    public static void m1867p(Context context, String str) {
        cfgData m1784i = cfgData.m1784i();
        String[] strArr = AbstractC0648p.f3051a;
        if ((m1784i != null && m1784i.f2666n2) && str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m1917j = AbstractC0648p.m1917j();
            if (m1917j == null) {
                m1917j = AbstractC0648p.m1916i(context, cfgData.m1784i());
            }
            if (m1862k(m1917j)) {
                if (AbstractC0648p.m1911d(context) == 2) {
                    AbstractC0648p.m1912e(2);
                    m1868q(context, m1917j);
                    AbstractC0635c.m1849b(context, m1917j);
                    return;
                } else {
                    if (NativeLib.nativePropMediaCue(context, m1917j, 2, trim)) {
                        AbstractC0648p.m1912e(2);
                        return;
                    }
                    return;
                }
            }
            if (context != null && AbstractC0648p.m1919l(context.getApplicationContext(), cfgData.m1784i()) != null && AbstractC0648p.m1911d(context) == 2) {
                AbstractC0648p.m1912e(2);
                String m1917j2 = AbstractC0648p.m1917j();
                if (m1917j2 != null) {
                    m1868q(context, m1917j2);
                    return;
                }
                return;
            }
            if (AbstractC0648p.m1918k(context, "yandexmusic://users/" + Uri.encode(trim) + "/playlists/3?play=true", true, 2)) {
                AbstractC0648p.m1912e(2);
            }
        }
    }

    /* renamed from: q */
    public static void m1868q(Context context, String str) {
        if (str == null || str.trim().isEmpty() || "---".equals(str)) {
            return;
        }
        try {
            List<MediaController> m1855d = m1855d(context);
            if (m1855d == null) {
                return;
            }
            for (MediaController mediaController : m1855d) {
                if (mediaController != null && str.equals(mediaController.getPackageName())) {
                    mediaController.getTransportControls().play();
                    return;
                }
            }
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: r */
    public static void m1869r(Context context) {
        cfgData m1784i = cfgData.m1784i();
        String[] strArr = AbstractC0648p.f3051a;
        if (m1784i != null && m1784i.f2666n2) {
            String m1917j = AbstractC0648p.m1917j();
            if (m1917j == null) {
                m1917j = AbstractC0648p.m1916i(context, cfgData.m1784i());
            }
            if (m1862k(m1917j)) {
                if (AbstractC0648p.m1911d(context) == 1) {
                    AbstractC0648p.m1912e(1);
                    m1868q(context, m1917j);
                    AbstractC0635c.m1849b(context, m1917j);
                    return;
                } else {
                    if (NativeLib.nativePropMediaCue(context, m1917j, 1, null)) {
                        AbstractC0648p.m1912e(1);
                        return;
                    }
                    return;
                }
            }
            if (context == null || AbstractC0648p.m1919l(context.getApplicationContext(), cfgData.m1784i()) == null || AbstractC0648p.m1911d(context) != 1) {
                if (AbstractC0648p.m1918k(context, "yandexmusic://radio/user/onyourwave?play=true", false, 1)) {
                    AbstractC0648p.m1912e(1);
                }
            } else {
                AbstractC0648p.m1912e(1);
                String m1917j2 = AbstractC0648p.m1917j();
                if (m1917j2 != null) {
                    m1868q(context, m1917j2);
                }
            }
        }
    }

    /* renamed from: s */
    public static String m1870s(String str) {
        return "yandex.auto.uma".equals(str) ? "yandex.auto.music" : str;
    }

    /* renamed from: t */
    public static String m1871t(int i) {
        String javaStringByIndex = NativeLib.getJavaStringByIndex(i);
        return javaStringByIndex != null ? javaStringByIndex : "";
    }
}
