package p098q0;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import java.util.Calendar;
import java.util.TimeZone;
import p001A0.AbstractC0015i;
import p001A0.RunnableC0022p;

/* renamed from: q0.h */
/* loaded from: classes.dex */
public abstract class AbstractC1319h {

    /* renamed from: b */
    public static boolean f6128b = false;

    /* renamed from: c */
    public static int f6129c = 0;

    /* renamed from: d */
    public static int f6130d = 0;

    /* renamed from: e */
    public static int f6131e = -1;

    /* renamed from: f */
    public static int f6132f = -1;

    /* renamed from: g */
    public static int f6133g = 0;

    /* renamed from: h */
    public static boolean f6134h = true;

    /* renamed from: i */
    public static Context f6135i;

    /* renamed from: j */
    public static long f6136j;

    /* renamed from: a */
    public static final Object f6127a = new Object();

    /* renamed from: k */
    public static final Handler f6137k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    public static final RunnableC0022p f6138l = new RunnableC0022p(1);

    /* renamed from: m */
    public static final RunnableC0022p f6139m = new RunnableC0022p(2);

    /* renamed from: n */
    public static final RunnableC0022p f6140n = new RunnableC0022p(2);

    /* renamed from: o */
    public static final RunnableC0022p f6141o = new RunnableC0022p(3);

    /* JADX WARN: Removed duplicated region for block: B:89:0x017a A[Catch: all -> 0x0187, TryCatch #0 {all -> 0x0187, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000d, B:10:0x0018, B:12:0x0026, B:13:0x002c, B:15:0x0045, B:17:0x004d, B:20:0x0056, B:22:0x005c, B:30:0x0184, B:31:0x019d, B:33:0x01a1, B:37:0x01b7, B:39:0x01bd, B:41:0x01c1, B:44:0x01c7, B:47:0x01c9, B:48:0x01cd, B:56:0x01a7, B:66:0x0078, B:68:0x0084, B:69:0x008e, B:81:0x00b5, B:85:0x00c9, B:89:0x017a, B:90:0x00dc, B:93:0x00f6, B:94:0x0108, B:98:0x0120, B:99:0x0132, B:103:0x0149, B:104:0x015c, B:113:0x008a, B:114:0x008c, B:116:0x0061, B:117:0x0064, B:119:0x018c, B:122:0x0194, B:123:0x0198, B:129:0x01f6, B:130:0x020c), top: B:3:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3185a(boolean z2) {
        int i;
        int i2;
        int i3;
        int m3006U;
        synchronized (f6127a) {
            try {
                cfgData m1784i = cfgData.m1784i();
                if (m1784i == null || !m1784i.f2671o2 || AbstractC1372y1.m3299e("auto_brightness")) {
                    f6130d = 0;
                    f6131e = -1;
                    Handler handler = f6137k;
                    handler.removeCallbacks(f6139m);
                    handler.removeCallbacks(f6140n);
                    handler.removeCallbacks(f6141o);
                    return;
                }
                Integer num = (Integer) carData.getInstance().f2396J0.m1395d();
                int intValue = num != null ? num.intValue() : 0;
                boolean m3271B = AbstractC1372y1.m3271B();
                int m1781b = cfgData.m1781b(m1784i.f2676p2, 9);
                int m1781b2 = cfgData.m1781b(m1784i.f2681q2, 3);
                if (m1784i.f2686r2) {
                    boolean z3 = m1784i.f2721y2 > 0 && m1784i.f2726z2 > 0;
                    int i4 = m1781b + m1781b2;
                    int i5 = i4 & 1;
                    int i6 = i5 == 0 ? i4 / 2 : m1781b2 < m1781b ? i4 / 2 : (i4 / 2) + 1;
                    if (z3) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int i7 = intValue;
                        long j2 = m1784i.f2721y2;
                        long j3 = m1784i.f2726z2;
                        int i8 = i5 == 0 ? i4 / 2 : m1781b2 < m1781b ? i4 / 2 : (i4 / 2) + 1;
                        long j4 = j2 - 1800000;
                        long j5 = j2 + 1800000;
                        long j6 = j3 - 1800000;
                        long j7 = j3 + 1800000;
                        boolean z4 = currentTimeMillis >= j4 && currentTimeMillis <= j5;
                        boolean z5 = currentTimeMillis >= j6 && currentTimeMillis <= j7;
                        if (z4 && z5) {
                            m3006U = Math.abs(currentTimeMillis - j2) <= Math.abs(currentTimeMillis - j3) ? currentTimeMillis <= j2 ? AbstractC1256E0.m3006U(m1781b2, ((i8 - m1781b2) * AbstractC1256E0.m2987B(currentTimeMillis, j4, j2)) + m1781b2) : AbstractC1256E0.m3006U(m1781b2, ((m1781b - i8) * AbstractC1256E0.m2987B(currentTimeMillis, j2, j5)) + i8) : currentTimeMillis <= j3 ? AbstractC1256E0.m3006U(m1781b2, ((i8 - m1781b) * AbstractC1256E0.m2987B(currentTimeMillis, j6, j3)) + m1781b) : AbstractC1256E0.m3006U(m1781b2, ((m1781b2 - i8) * AbstractC1256E0.m2987B(currentTimeMillis, j3, j7)) + i8);
                        } else if (z4) {
                            m3006U = currentTimeMillis <= j2 ? AbstractC1256E0.m3006U(m1781b2, ((i8 - m1781b2) * AbstractC1256E0.m2987B(currentTimeMillis, j4, j2)) + m1781b2) : AbstractC1256E0.m3006U(m1781b2, ((m1781b - i8) * AbstractC1256E0.m2987B(currentTimeMillis, j2, j5)) + i8);
                        } else if (z5) {
                            m3006U = currentTimeMillis <= j3 ? AbstractC1256E0.m3006U(m1781b2, ((i8 - m1781b) * AbstractC1256E0.m2987B(currentTimeMillis, j6, j3)) + m1781b) : AbstractC1256E0.m3006U(m1781b2, ((m1781b2 - i8) * AbstractC1256E0.m2987B(currentTimeMillis, j3, j7)) + i8);
                        } else {
                            if (currentTimeMillis < j4 || currentTimeMillis > j7) {
                                m1781b = m1781b2;
                            }
                            i = i7;
                            if (i == 2) {
                                m1781b = Math.min(i6, m1781b);
                            }
                        }
                        m1781b = m3006U;
                        i = i7;
                        if (i == 2) {
                        }
                    } else if (intValue == 2) {
                        i = intValue;
                        m1781b = i6;
                    } else if (intValue == 1) {
                        i = intValue;
                    } else {
                        i = intValue;
                        m1781b = m1781b2;
                    }
                    if (i != 1 && i != 2) {
                        i2 = f6129c;
                    }
                    i2 = i;
                } else {
                    i = intValue;
                    i2 = f6129c;
                    if (i2 != 1 && i2 != 2) {
                        f6132f = i;
                        f6134h = m3271B;
                        return;
                    } else if (i2 == 2) {
                        m1781b = m1781b2;
                    }
                }
                boolean z6 = m1784i.f2686r2 && ((f6134h && !m3271B) || !(((i3 = f6132f) != 1 && i3 != 2) || i == 1 || i == 2));
                f6132f = i;
                f6134h = m3271B;
                if (z2 || i2 != f6130d || m1781b != f6131e || z6) {
                    f6130d = i2;
                    f6131e = m1781b;
                    m3188d(m1781b);
                    Handler handler2 = f6137k;
                    RunnableC0022p runnableC0022p = f6139m;
                    handler2.removeCallbacks(runnableC0022p);
                    RunnableC0022p runnableC0022p2 = f6140n;
                    handler2.removeCallbacks(runnableC0022p2);
                    if (z6) {
                        handler2.postDelayed(runnableC0022p, 500L);
                        handler2.postDelayed(runnableC0022p2, 2000L);
                    }
                    if (z2) {
                        return;
                    }
                    RunnableC0022p runnableC0022p3 = f6141o;
                    handler2.removeCallbacks(runnableC0022p3);
                    handler2.postDelayed(runnableC0022p3, 5000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static void m3186b(boolean z2) {
        synchronized (f6127a) {
            try {
                Context context = f6135i;
                cfgData m1784i = cfgData.m1784i();
                if (context != null && m1784i != null && m1784i.f2691s2 && !AbstractC1372y1.m3299e("auto_brightness")) {
                    int i = f6129c;
                    if (i == 1 || i == 2) {
                        if (z2 || f6133g != i) {
                            int m1782c = cfgData.m1782c(m1784i.f2701u2, 1);
                            int m1782c2 = cfgData.m1782c(m1784i.f2706v2, 2);
                            if (i == 2) {
                                m1782c = m1782c2;
                            }
                            if (m1784i.f2540L1 == m1782c) {
                                f6133g = i;
                                return;
                            }
                            if (m1784i.f2696t2) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (i == 2) {
                                    long j2 = m1784i.f2721y2;
                                    long j3 = m1784i.f2726z2;
                                    if (j2 > 0) {
                                        if (j3 > 0) {
                                            if (currentTimeMillis < j3 - 1800000) {
                                                if (currentTimeMillis < j2 - 1800000) {
                                                }
                                                return;
                                            }
                                        }
                                    }
                                } else {
                                    long j4 = m1784i.f2721y2;
                                    long j5 = m1784i.f2726z2;
                                    if (j4 > 0) {
                                        if (j5 > 0) {
                                            if (currentTimeMillis >= j4 - 1800000 && currentTimeMillis < j5 - 1800000) {
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                            f6133g = i;
                            AbstractC0015i.m26f(context, m1782c);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3187c() {
        Context context;
        cfgData m1784i;
        Location location;
        float latitude;
        float longitude;
        LocationManager locationManager;
        C1333l1 c1333l1;
        synchronized (f6127a) {
            context = f6135i;
        }
        if (context == null || (m1784i = cfgData.m1784i()) == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        float f2 = m1784i.f2711w2;
        float f3 = m1784i.f2716x2;
        boolean m3007V = AbstractC1256E0.m3007V(f2, f3);
        if (!m3007V || currentTimeMillis - f6136j >= 3600000) {
            f6136j = currentTimeMillis;
            try {
                locationManager = (LocationManager) context.getSystemService("location");
            } catch (Exception unused) {
            }
            if (locationManager != null) {
                String[] strArr = {"gps", "network", "passive"};
                location = null;
                for (int i = 0; i < 3; i++) {
                    try {
                        Location lastKnownLocation = locationManager.getLastKnownLocation(strArr[i]);
                        if (lastKnownLocation != null && (location == null || lastKnownLocation.getTime() > location.getTime())) {
                            location = lastKnownLocation;
                        }
                    } catch (SecurityException unused2) {
                    }
                }
                if (location != null && AbstractC1256E0.m3007V(location.getLatitude(), location.getLongitude())) {
                    latitude = (float) location.getLatitude();
                    longitude = (float) location.getLongitude();
                    if (m3007V || Math.abs(latitude - f2) > 0.01f || Math.abs(longitude - f3) > 0.01f) {
                        f2 = latitude;
                        f3 = longitude;
                        m3007V = true;
                    }
                }
            }
            location = null;
            if (location != null) {
                latitude = (float) location.getLatitude();
                longitude = (float) location.getLongitude();
                if (m3007V) {
                }
                f2 = latitude;
                f3 = longitude;
                m3007V = true;
            }
        }
        if (!m3007V) {
            return;
        }
        TimeZone timeZone = TimeZone.getDefault();
        long j2 = m1784i.f2721y2;
        long j3 = 0;
        boolean z2 = j2 > 0 && AbstractC1256E0.m2997L(j2, currentTimeMillis, timeZone);
        boolean z3 = Math.abs(m1784i.f2711w2 - f2) <= 0.01f && Math.abs(m1784i.f2716x2 - f3) <= 0.01f;
        if (z2 && z3 && m1784i.f2726z2 > 0) {
            return;
        }
        double d = f2;
        double d2 = f3;
        if (AbstractC1256E0.m3007V(d, d2) && timeZone != null) {
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTimeInMillis(currentTimeMillis);
            long j4 = 0;
            long j5 = 0;
            int i2 = -1;
            int i3 = 1;
            while (i2 <= i3) {
                Calendar calendar2 = (Calendar) calendar.clone();
                calendar2.add(6, i2);
                double d3 = d;
                Long m3029v = AbstractC1256E0.m3029v(d3, d2, calendar2, true);
                Long m3029v2 = AbstractC1256E0.m3029v(d3, d2, calendar2, false);
                if (m3029v != null && AbstractC1256E0.m2997L(m3029v.longValue(), currentTimeMillis, timeZone)) {
                    j4 = m3029v.longValue();
                }
                if (m3029v2 != null && AbstractC1256E0.m2997L(m3029v2.longValue(), currentTimeMillis, timeZone)) {
                    j5 = m3029v2.longValue();
                }
                i2++;
                d = d3;
                i3 = 1;
                j3 = 0;
            }
            long j6 = j3;
            long j7 = j4;
            if (j7 > j6) {
                long j8 = j5;
                if (j8 > j6) {
                    c1333l1 = new C1333l1(j7, j8);
                    if (c1333l1 != null) {
                        return;
                    }
                    m1784i.f2711w2 = f2;
                    m1784i.f2716x2 = f3;
                    m1784i.f2721y2 = c1333l1.f6289a;
                    m1784i.f2726z2 = c1333l1.f6290b;
                    m1784i.f2492A2 = currentTimeMillis;
                    SharedPreferences.Editor edit = context.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                    edit.putFloat("autoBrightnessLat", m1784i.f2711w2);
                    edit.putFloat("autoBrightnessLon", m1784i.f2716x2);
                    edit.putLong("autoBrightnessSunriseMs", m1784i.f2721y2);
                    edit.putLong("autoBrightnessSunsetMs", m1784i.f2726z2);
                    edit.putLong("autoBrightnessSunAt", m1784i.f2492A2);
                    edit.apply();
                    return;
                }
            }
        }
        c1333l1 = null;
        if (c1333l1 != null) {
        }
    }

    /* renamed from: d */
    public static void m3188d(final int i) {
        final int i2;
        synchronized (f6127a) {
            i2 = f6130d;
        }
        new Thread(new Runnable() { // from class: q0.g
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2;
                int i3 = i;
                int i4 = i2;
                try {
                    z2 = NativeLib.nativePropBackgroundLightLvl(i3);
                } catch (Throwable unused) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
                synchronized (AbstractC1319h.f6127a) {
                    try {
                        if (AbstractC1319h.f6131e == i3 && AbstractC1319h.f6130d == i4) {
                            AbstractC1319h.f6131e = -1;
                            AbstractC1319h.f6130d = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, "split-autolight").start();
    }

    /* renamed from: e */
    public static void m3189e(Context context) {
        boolean z2;
        synchronized (f6127a) {
            if (context != null) {
                try {
                    f6135i = context.getApplicationContext();
                } catch (Throwable th) {
                    throw th;
                }
            }
            z2 = f6128b;
            f6128b = true;
            Integer num = (Integer) carData.getInstance().f2396J0.m1395d();
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 1 || intValue == 2) {
                f6129c = intValue;
            }
        }
        if (!z2) {
            final int i = 0;
            carData.getInstance().f2396J0.m1397f(new InterfaceC0561z() { // from class: q0.f
                @Override // androidx.lifecycle.InterfaceC0561z
                /* renamed from: a */
                public final void mo1100a(Object obj) {
                    Integer num2 = (Integer) obj;
                    switch (i) {
                        case 0:
                            int intValue2 = num2 == null ? 0 : num2.intValue();
                            if (intValue2 == 1 || intValue2 == 2) {
                                synchronized (AbstractC1319h.f6127a) {
                                    AbstractC1319h.f6129c = intValue2;
                                }
                            }
                            AbstractC1319h.m3185a(false);
                            AbstractC1319h.m3186b(false);
                            return;
                        default:
                            AbstractC1319h.m3185a(false);
                            return;
                    }
                }
            });
            final int i2 = 1;
            carData.getInstance().f2425Y.m1397f(new InterfaceC0561z() { // from class: q0.f
                @Override // androidx.lifecycle.InterfaceC0561z
                /* renamed from: a */
                public final void mo1100a(Object obj) {
                    Integer num2 = (Integer) obj;
                    switch (i2) {
                        case 0:
                            int intValue2 = num2 == null ? 0 : num2.intValue();
                            if (intValue2 == 1 || intValue2 == 2) {
                                synchronized (AbstractC1319h.f6127a) {
                                    AbstractC1319h.f6129c = intValue2;
                                }
                            }
                            AbstractC1319h.m3185a(false);
                            AbstractC1319h.m3186b(false);
                            return;
                        default:
                            AbstractC1319h.m3185a(false);
                            return;
                    }
                }
            });
        }
        m3187c();
        m3185a(true);
        m3186b(false);
        Handler handler = f6137k;
        RunnableC0022p runnableC0022p = f6138l;
        handler.removeCallbacks(runnableC0022p);
        handler.postDelayed(runnableC0022p, 60000L);
    }
}
