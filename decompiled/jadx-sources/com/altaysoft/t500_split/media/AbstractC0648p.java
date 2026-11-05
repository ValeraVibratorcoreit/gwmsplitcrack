package com.altaysoft.t500_split.media;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.altaysoft.t500_split.cfgData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import p038T.RunnableC0318l;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;

/* renamed from: com.altaysoft.t500_split.media.p */
/* loaded from: classes.dex */
public abstract class AbstractC0648p {

    /* renamed from: d */
    public static long f3054d;

    /* renamed from: e */
    public static boolean f3055e;

    /* renamed from: g */
    public static String f3057g;

    /* renamed from: h */
    public static Context f3058h;

    /* renamed from: i */
    public static String f3059i;

    /* renamed from: j */
    public static int f3060j;

    /* renamed from: l */
    public static long f3062l;

    /* renamed from: m */
    public static long f3063m;

    /* renamed from: n */
    public static RunnableC0647o f3064n;

    /* renamed from: o */
    public static long f3065o;

    /* renamed from: a */
    public static final String[] f3051a = {"ru.yandex.music", "ru.auto.music", "yandex.auto.music"};

    /* renamed from: b */
    public static final Handler f3052b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public static int f3053c = 0;

    /* renamed from: f */
    public static int f3056f = 0;

    /* renamed from: k */
    public static int f3061k = 0;

    /* renamed from: p */
    public static final RunnableC0318l f3066p = new RunnableC0318l(2);

    /* renamed from: a */
    public static ActivityOptions m1908a(cfgData cfgdata, String str, int i, boolean z2) {
        Rect rect;
        int i2;
        Rect rect2;
        String str2;
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        makeBasic.setLaunchDisplayId(i);
        if (cfgdata == null || cfgdata.f2498B3 <= cfgdata.f2727z3 || cfgdata.f2503C3 <= cfgdata.f2493A3) {
            if (cfgdata == null) {
                rect = new Rect(120, 60, 960, 660);
            } else {
                int i3 = cfgdata.f2510E0;
                int i4 = cfgdata.f2515F0;
                int i5 = cfgdata.f2500C0;
                int i6 = cfgdata.f2505D0;
                if (AbstractC1256E0.m3004S(cfgdata)) {
                    int i7 = 1;
                    int i8 = 0;
                    if (AbstractC1256E0.m3004S(cfgdata) && !cfgdata.f2622e3) {
                        if (AbstractC1256E0.m3004S(cfgdata)) {
                            i2 = ((AbstractC1256E0.m3004S(cfgdata) && cfgdata.f2627f3) ? 2 : 1) * 600;
                        } else {
                            i2 = 0;
                        }
                        i3 += i2;
                    }
                    if (AbstractC1256E0.m3004S(cfgdata) && cfgdata.f2622e3) {
                        if (AbstractC1256E0.m3004S(cfgdata)) {
                            if (AbstractC1256E0.m3004S(cfgdata) && cfgdata.f2627f3) {
                                i7 = 2;
                            }
                            i8 = i7 * 600;
                        }
                        i4 -= i8;
                    }
                }
                if (cfgdata.f2553O2 || cfgdata.f2549N2) {
                    rect = new Rect(i3, i5, i4, i6);
                } else {
                    int i9 = cfgdata.f2556P1;
                    if (i9 <= i3 + 50 || i9 >= i4 - 50) {
                        i9 = ((i4 - i3) / 2) + i3;
                    }
                    rect = cfgdata.f2687r3 ? new Rect(i9, i5, i4, i6) : new Rect(i3, i5, i9, i6);
                }
            }
            if (str != null) {
                AbstractC1256E0.m3025r(cfgdata, str, rect, i);
            }
            rect2 = rect;
        } else {
            rect2 = new Rect(cfgdata.f2727z3, cfgdata.f2493A3, cfgdata.f2498B3, cfgdata.f2503C3);
        }
        if (z2) {
            int max = Math.max(rect2.width(), 200);
            int max2 = Math.max(rect2.height(), 200);
            int i10 = rect2.left;
            rect2 = new Rect(i10, 1081, max + i10, max2 + 1081);
        }
        if (rect2.width() > 0 && rect2.height() > 0) {
            makeBasic.setLaunchBounds(rect2);
        }
        if (cfgdata != null && (str2 = cfgdata.f2668o) != null && !str2.isEmpty()) {
            try {
                ActivityOptions.class.getMethod(cfgdata.f2668o, Integer.TYPE).invoke(makeBasic, 6);
            } catch (Exception unused) {
            }
        }
        return makeBasic;
    }

    /* renamed from: b */
    public static void m1909b() {
        RunnableC0647o runnableC0647o = f3064n;
        if (runnableC0647o == null) {
            return;
        }
        f3052b.removeCallbacks(runnableC0647o);
        f3064n = null;
    }

    /* renamed from: c */
    public static boolean m1910c(String str) {
        if (str == null || str.isEmpty() || "yandex.auto.uma".equals(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if ("ru.yandex.music".equals(lowerCase) || "ru.auto.music".equals(lowerCase) || "yandex.auto.music".equals(lowerCase)) {
            return true;
        }
        return lowerCase.contains("yandex");
    }

    /* renamed from: d */
    public static int m1911d(Context context) {
        String m1917j = m1917j();
        MediaController mediaController = null;
        if (m1917j == null) {
            f3056f = 0;
            f3057g = null;
            return 0;
        }
        if (context != null && !m1917j.isEmpty()) {
            try {
                mediaController = AbstractC0638f.m1853b(AbstractC0638f.m1855d(context), m1917j);
            } catch (SecurityException | Exception unused) {
            }
        }
        String str = f3057g;
        if (str == null || !str.equals(m1917j)) {
            f3056f = 0;
            f3057g = m1917j;
        }
        if (mediaController == null) {
            return f3056f;
        }
        int m1866o = AbstractC0638f.m1866o(mediaController);
        if (m1866o != 0) {
            f3056f = m1866o;
            return m1866o;
        }
        if (AbstractC0638f.m1862k(m1917j)) {
            return f3056f;
        }
        CharSequence queueTitle = mediaController.getQueueTitle();
        if (queueTitle == null || queueTitle.toString().trim().length() <= 0) {
            return f3056f;
        }
        f3056f = 0;
        return 0;
    }

    /* renamed from: e */
    public static void m1912e(int i) {
        f3053c = i;
        f3054d = SystemClock.elapsedRealtime() + 8000;
        if (i == 1 || i == 2) {
            f3056f = i;
        }
    }

    /* renamed from: f */
    public static int m1913f(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        String lowerCase = charSequence.toString().toLowerCase(Locale.ROOT);
        if (lowerCase.isEmpty()) {
            return 0;
        }
        if (lowerCase.contains("волн") || lowerCase.contains("wave") || lowerCase.contains("vibe") || lowerCase.contains("onyourwave")) {
            return 1;
        }
        return (lowerCase.contains("нрав") || lowerCase.contains("liked") || lowerCase.contains("likes") || lowerCase.contains("любим")) ? 2 : 0;
    }

    /* renamed from: g */
    public static Intent m1914g(Context context) {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("com.yandex.passport");
        if (context != null) {
            try {
                AuthenticatorDescription[] authenticatorTypes = AccountManager.get(context).getAuthenticatorTypes();
                if (authenticatorTypes != null) {
                    for (AuthenticatorDescription authenticatorDescription : authenticatorTypes) {
                        if (authenticatorDescription != null && (str = authenticatorDescription.type) != null) {
                            if (str != null && str.toLowerCase(Locale.US).contains("yandex")) {
                                linkedHashSet.add(authenticatorDescription.type);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return AccountManager.newChooseAccountIntent(null, null, (String[]) linkedHashSet.toArray(new String[0]), null, null, null, null);
    }

    /* renamed from: h */
    public static boolean m1915h(Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: i */
    public static String m1916i(Context context, cfgData cfgdata) {
        if (cfgdata != null && m1910c(cfgdata.f2544M1) && m1915h(context, cfgdata.f2544M1)) {
            return cfgdata.f2544M1;
        }
        String m1870s = AbstractC0638f.m1870s(cfgdata != null ? cfgdata.f2544M1 : null);
        if (m1910c(m1870s) && m1915h(context, m1870s)) {
            return m1870s;
        }
        String str = AbstractC0638f.f3008b;
        if (m1910c(str) && m1915h(context, str)) {
            return str;
        }
        String[] strArr = f3051a;
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (m1915h(context, str2)) {
                return str2;
            }
        }
        try {
            List<MediaController> m1855d = AbstractC0638f.m1855d(context);
            if (m1855d != null) {
                for (MediaController mediaController : m1855d) {
                    if (mediaController != null) {
                        String packageName = mediaController.getPackageName();
                        if (m1910c(packageName)) {
                            return packageName;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (cfgdata == null || !m1910c(cfgdata.f2544M1)) {
            return null;
        }
        return cfgdata.f2544M1;
    }

    /* renamed from: j */
    public static String m1917j() {
        String str = AbstractC0638f.f3008b;
        if (m1910c(str)) {
            return AbstractC0638f.m1870s(str);
        }
        cfgData m1784i = cfgData.m1784i();
        if (m1784i == null) {
            return null;
        }
        String m1870s = AbstractC0638f.m1870s(m1784i.f2544M1);
        if (m1910c(m1870s)) {
            return m1870s;
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m1918k(Context context, String str, boolean z2, int i) {
        int i2;
        if (context != null && str != null) {
            Context applicationContext = context.getApplicationContext();
            cfgData m1784i = cfgData.m1784i();
            String m1919l = m1919l(applicationContext, m1784i);
            String m1916i = m1919l != null ? m1919l : m1916i(applicationContext, m1784i);
            int i3 = (m1784i == null || m1916i == null || !m1916i.equals(m1784i.f2544M1) || (i2 = m1784i.f2717x3) < 0) ? 0 : i2;
            boolean z3 = m1919l != null;
            int m3313s = m1916i != null ? AbstractC1372y1.m3313s(i3, m1916i) : -1;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268505088);
            if (m1916i != null) {
                intent.setPackage(m1916i);
            }
            if (z3) {
                intent.addFlags(604110848);
            } else {
                intent.addFlags(134217728);
            }
            try {
                context.startActivity(intent, m1908a(m1784i, m1916i, i3, !z3).toBundle());
                Handler handler = f3052b;
                if (!z3 && m1916i != null) {
                    m1909b();
                    if (i == 1 || i == 2) {
                        RunnableC0647o runnableC0647o = new RunnableC0647o(applicationContext, m1916i, i, str, i3);
                        f3064n = runnableC0647o;
                        handler.postDelayed(runnableC0647o, 650L);
                    }
                    RunnableC0318l runnableC0318l = f3066p;
                    handler.removeCallbacks(runnableC0318l);
                    f3058h = applicationContext;
                    f3059i = m1916i;
                    f3060j = i3;
                    f3061k = i;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    f3062l = elapsedRealtime + 800;
                    f3063m = elapsedRealtime + 4000;
                    handler.postDelayed(runnableC0318l, 800L);
                } else if (z3 && z2 && m1916i != null) {
                    m1909b();
                    if (m3313s > 0) {
                        RunnableC0646n runnableC0646n = new RunnableC0646n(m1916i, i3, m3313s, 0);
                        handler.postDelayed(runnableC0646n, 500L);
                        handler.postDelayed(runnableC0646n, 1400L);
                    }
                }
                return true;
            } catch (ActivityNotFoundException | Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: l */
    public static String m1919l(Context context, cfgData cfgdata) {
        int i;
        String m3314t = AbstractC1372y1.m3314t(0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (cfgdata != null && m1910c(cfgdata.f2544M1)) {
            linkedHashSet.add(cfgdata.f2544M1);
        }
        String str = AbstractC0638f.f3008b;
        if (m1910c(str)) {
            linkedHashSet.add(str);
        }
        String[] strArr = f3051a;
        for (int i2 = 0; i2 < 3; i2++) {
            linkedHashSet.add(strArr[i2]);
        }
        try {
            List<MediaController> m1855d = AbstractC0638f.m1855d(context);
            if (m1855d != null) {
                for (MediaController mediaController : m1855d) {
                    if (mediaController != null) {
                        String packageName = mediaController.getPackageName();
                        if (m1910c(packageName)) {
                            linkedHashSet.add(packageName);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        Iterator it = new ArrayList(linkedHashSet).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 != null && !str2.isEmpty() && m3314t != null && m3314t.contains(str2)) {
                return str2;
            }
        }
        if (cfgdata == null || !m1910c(cfgdata.f2544M1)) {
            return null;
        }
        String str3 = cfgdata.f2544M1;
        try {
            Class<?> cls = Class.forName("android.app.ActivityManager");
            Object invoke = cls.getMethod("getService", null).invoke(cls, null);
            i = ((Integer) invoke.getClass().getMethod("getActivityState", String.class).invoke(invoke, str3)).intValue();
        } catch (Exception unused2) {
            i = -1;
        }
        if (i == 3) {
            return cfgdata.f2544M1;
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m1920m(cfgData cfgdata, String str) {
        if (!(cfgdata != null && cfgdata.f2666n2) || !m1910c(str)) {
            return false;
        }
        int i = cfgdata.f2661m2;
        if (i != 1 && i != 2) {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        String str2 = cfgdata.f2656l2;
        return !TextUtils.isEmpty(str2 == null ? "" : str2.trim());
    }
}
