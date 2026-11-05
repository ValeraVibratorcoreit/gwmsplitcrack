package p098q0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.C0636d;
import com.altaysoft.t500_split.media.CallState;
import com.altaysoft.t500_split.radio.C0658d;
import com.altaysoft.t500_split.radio.RadioState;
import p006C.AbstractC0062j;

/* renamed from: q0.K0 */
/* loaded from: classes.dex */
public final class C1268K0 {

    /* renamed from: t */
    public static C1268K0 f5752t;

    /* renamed from: a */
    public final Context f5753a;

    /* renamed from: c */
    public boolean f5755c;

    /* renamed from: d */
    public boolean f5756d;

    /* renamed from: e */
    public boolean f5757e;

    /* renamed from: f */
    public boolean f5758f;

    /* renamed from: j */
    public boolean f5762j;

    /* renamed from: o */
    public final C1262H0 f5767o;

    /* renamed from: p */
    public final C1262H0 f5768p;

    /* renamed from: q */
    public final RunnableC1264I0 f5769q;

    /* renamed from: r */
    public final RunnableC1264I0 f5770r;

    /* renamed from: s */
    public final RunnableC1264I0 f5771s;

    /* renamed from: b */
    public final Handler f5754b = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public String f5759g = "";

    /* renamed from: h */
    public int f5760h = -1;

    /* renamed from: i */
    public int f5761i = -1;

    /* renamed from: k */
    public int f5763k = -1;

    /* renamed from: l */
    public int f5764l = -1;

    /* renamed from: m */
    public String f5765m = "";

    /* renamed from: n */
    public int f5766n = -2;

    /* JADX WARN: Type inference failed for: r0v3, types: [q0.H0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [q0.H0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [q0.I0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [q0.I0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [q0.I0] */
    public C1268K0(Context context) {
        final int i = 0;
        this.f5767o = new InterfaceC0561z(this) { // from class: q0.H0

            /* renamed from: b */
            public final /* synthetic */ C1268K0 f5728b;

            {
                this.f5728b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                String str;
                String str2;
                switch (i) {
                    case 0:
                        C0636d c0636d = (C0636d) obj;
                        C1268K0 c1268k0 = this.f5728b;
                        c1268k0.getClass();
                        if (c0636d != null && !CallState.isCall(c0636d)) {
                            C0658d current = RadioState.getInstance().current();
                            if (!current.f3093a || !current.m1943c()) {
                                Context context2 = c1268k0.f5753a;
                                String str3 = c0636d.f2995a;
                                if ((str3 == null || str3.isEmpty() || (str2 = RadioState.getInstance().current().m1946f(context2, null).f2995a) == null || str2.isEmpty() || !str2.equals(str3)) && c0636d.m1851a()) {
                                    StringBuilder sb = new StringBuilder();
                                    String str4 = c0636d.f2997c;
                                    sb.append(str4 == null ? "" : str4.trim());
                                    sb.append("\n");
                                    String str5 = c0636d.f2996b;
                                    sb.append(str5 == null ? "" : str5.trim());
                                    String sb2 = sb.toString();
                                    if (!c1268k0.f5756d) {
                                        c1268k0.f5759g = sb2;
                                        break;
                                    } else if (!sb2.equals(c1268k0.f5759g)) {
                                        c1268k0.f5759g = sb2;
                                        if (cfgData.m1784i().f2525H2) {
                                            String trim = str4 == null ? "" : str4.trim();
                                            String trim2 = str5 != null ? str5.trim() : "";
                                            if (trim.isEmpty() || trim2.isEmpty()) {
                                                if (!trim2.isEmpty()) {
                                                    trim = trim2;
                                                }
                                                str = trim;
                                            } else {
                                                str = AbstractC0062j.m169w(trim, " — ", trim2);
                                            }
                                            C1287U0.m3104v(context2, str);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        C0658d c0658d = (C0658d) obj;
                        C1268K0 c1268k02 = this.f5728b;
                        if (c0658d != null) {
                            boolean z2 = c1268k02.f5756d;
                            boolean z3 = c0658d.f3094b;
                            int i2 = c0658d.f3095c;
                            int i3 = c0658d.f3096d;
                            if (!z2) {
                                if (c0658d.m1943c() && !z3) {
                                    c1268k02.f5760h = i3;
                                    c1268k02.f5761i = i2;
                                    break;
                                }
                            } else {
                                Handler handler = c1268k02.f5754b;
                                RunnableC1264I0 runnableC1264I0 = c1268k02.f5771s;
                                if (!z3 && c0658d.m1943c()) {
                                    if (i3 != c1268k02.f5760h || i2 != c1268k02.f5761i) {
                                        String str6 = c0658d.f3099g;
                                        int m1944d = c0658d.m1944d();
                                        if (!c1268k02.f5762j || i3 != c1268k02.f5763k || i2 != c1268k02.f5764l || !str6.equals(c1268k02.f5765m) || m1944d != c1268k02.f5766n) {
                                            c1268k02.f5762j = true;
                                            c1268k02.f5763k = i3;
                                            c1268k02.f5764l = i2;
                                            c1268k02.f5765m = str6;
                                            c1268k02.f5766n = m1944d;
                                            handler.removeCallbacks(runnableC1264I0);
                                            handler.postDelayed(runnableC1264I0, 800L);
                                            break;
                                        }
                                    } else {
                                        c1268k02.f5762j = false;
                                        handler.removeCallbacks(runnableC1264I0);
                                        break;
                                    }
                                } else {
                                    c1268k02.f5762j = false;
                                    handler.removeCallbacks(runnableC1264I0);
                                    break;
                                }
                            }
                        } else {
                            c1268k02.getClass();
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f5768p = new InterfaceC0561z(this) { // from class: q0.H0

            /* renamed from: b */
            public final /* synthetic */ C1268K0 f5728b;

            {
                this.f5728b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                String str;
                String str2;
                switch (i2) {
                    case 0:
                        C0636d c0636d = (C0636d) obj;
                        C1268K0 c1268k0 = this.f5728b;
                        c1268k0.getClass();
                        if (c0636d != null && !CallState.isCall(c0636d)) {
                            C0658d current = RadioState.getInstance().current();
                            if (!current.f3093a || !current.m1943c()) {
                                Context context2 = c1268k0.f5753a;
                                String str3 = c0636d.f2995a;
                                if ((str3 == null || str3.isEmpty() || (str2 = RadioState.getInstance().current().m1946f(context2, null).f2995a) == null || str2.isEmpty() || !str2.equals(str3)) && c0636d.m1851a()) {
                                    StringBuilder sb = new StringBuilder();
                                    String str4 = c0636d.f2997c;
                                    sb.append(str4 == null ? "" : str4.trim());
                                    sb.append("\n");
                                    String str5 = c0636d.f2996b;
                                    sb.append(str5 == null ? "" : str5.trim());
                                    String sb2 = sb.toString();
                                    if (!c1268k0.f5756d) {
                                        c1268k0.f5759g = sb2;
                                        break;
                                    } else if (!sb2.equals(c1268k0.f5759g)) {
                                        c1268k0.f5759g = sb2;
                                        if (cfgData.m1784i().f2525H2) {
                                            String trim = str4 == null ? "" : str4.trim();
                                            String trim2 = str5 != null ? str5.trim() : "";
                                            if (trim.isEmpty() || trim2.isEmpty()) {
                                                if (!trim2.isEmpty()) {
                                                    trim = trim2;
                                                }
                                                str = trim;
                                            } else {
                                                str = AbstractC0062j.m169w(trim, " — ", trim2);
                                            }
                                            C1287U0.m3104v(context2, str);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        C0658d c0658d = (C0658d) obj;
                        C1268K0 c1268k02 = this.f5728b;
                        if (c0658d != null) {
                            boolean z2 = c1268k02.f5756d;
                            boolean z3 = c0658d.f3094b;
                            int i22 = c0658d.f3095c;
                            int i3 = c0658d.f3096d;
                            if (!z2) {
                                if (c0658d.m1943c() && !z3) {
                                    c1268k02.f5760h = i3;
                                    c1268k02.f5761i = i22;
                                    break;
                                }
                            } else {
                                Handler handler = c1268k02.f5754b;
                                RunnableC1264I0 runnableC1264I0 = c1268k02.f5771s;
                                if (!z3 && c0658d.m1943c()) {
                                    if (i3 != c1268k02.f5760h || i22 != c1268k02.f5761i) {
                                        String str6 = c0658d.f3099g;
                                        int m1944d = c0658d.m1944d();
                                        if (!c1268k02.f5762j || i3 != c1268k02.f5763k || i22 != c1268k02.f5764l || !str6.equals(c1268k02.f5765m) || m1944d != c1268k02.f5766n) {
                                            c1268k02.f5762j = true;
                                            c1268k02.f5763k = i3;
                                            c1268k02.f5764l = i22;
                                            c1268k02.f5765m = str6;
                                            c1268k02.f5766n = m1944d;
                                            handler.removeCallbacks(runnableC1264I0);
                                            handler.postDelayed(runnableC1264I0, 800L);
                                            break;
                                        }
                                    } else {
                                        c1268k02.f5762j = false;
                                        handler.removeCallbacks(runnableC1264I0);
                                        break;
                                    }
                                } else {
                                    c1268k02.f5762j = false;
                                    handler.removeCallbacks(runnableC1264I0);
                                    break;
                                }
                            }
                        } else {
                            c1268k02.getClass();
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 0;
        this.f5769q = new Runnable(this) { // from class: q0.I0

            /* renamed from: b */
            public final /* synthetic */ C1268K0 f5732b;

            {
                this.f5732b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WifiInfo connectionInfo;
                switch (i3) {
                    case 0:
                        this.f5732b.f5756d = true;
                        break;
                    case 1:
                        C1268K0 c1268k0 = this.f5732b;
                        boolean m3044b = c1268k0.m3044b();
                        boolean m3043a = c1268k0.m3043a();
                        boolean z2 = m3044b != c1268k0.f5757e;
                        boolean z3 = m3043a != c1268k0.f5758f;
                        c1268k0.f5757e = m3044b;
                        c1268k0.f5758f = m3043a;
                        if (c1268k0.f5756d) {
                            Context context2 = c1268k0.f5753a;
                            if (z2 && cfgData.m1784i().f2521G2) {
                                if (m3044b) {
                                    String str = "";
                                    try {
                                        WifiManager wifiManager = (WifiManager) context2.getSystemService("wifi");
                                        if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null && connectionInfo.getSSID() != null) {
                                            String trim = connectionInfo.getSSID().trim();
                                            if (trim.startsWith("\"") && trim.endsWith("\"") && trim.length() >= 2) {
                                                trim = trim.substring(1, trim.length() - 1).trim();
                                            }
                                            if (!trim.isEmpty() && !"<unknown ssid>".equalsIgnoreCase(trim)) {
                                                if (!"0x".equalsIgnoreCase(trim)) {
                                                    str = trim;
                                                }
                                            }
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    C1287U0.m3104v(context2, str.isEmpty() ? context2.getString(R.string.split_ball_wifi_on_noname) : context2.getString(R.string.split_ball_wifi_on, str));
                                } else {
                                    C1287U0.m3104v(context2, context2.getString(R.string.split_ball_wifi_off));
                                }
                            }
                            if (z3 && cfgData.m1784i().f2521G2) {
                                C1287U0.m3104v(context2, context2.getString(m3043a ? R.string.split_ball_inet_on : R.string.split_ball_inet_off));
                                break;
                            }
                        }
                        break;
                    default:
                        C1268K0 c1268k02 = this.f5732b;
                        c1268k02.f5762j = false;
                        C0658d current = RadioState.getInstance().current();
                        if (!current.f3094b && current.m1943c()) {
                            int i4 = c1268k02.f5760h;
                            int i5 = current.f3095c;
                            int i6 = current.f3096d;
                            if (i6 != i4 || i5 != c1268k02.f5761i) {
                                c1268k02.f5760h = i6;
                                c1268k02.f5761i = i5;
                                String str2 = current.f3099g;
                                c1268k02.f5765m = str2;
                                c1268k02.f5766n = current.m1944d();
                                if (cfgData.m1784i().f2529I2) {
                                    StringBuilder sb = new StringBuilder();
                                    Context context3 = c1268k02.f5753a;
                                    sb.append(current.m1941a(context3));
                                    sb.append(' ');
                                    sb.append(current.m1942b());
                                    sb.append(' ');
                                    sb.append(current.m1947g(context3));
                                    if (!TextUtils.isEmpty(str2)) {
                                        sb.append(" · ");
                                        sb.append(str2);
                                    }
                                    int m1944d = current.m1944d();
                                    if (m1944d >= 0) {
                                        sb.append(" · ");
                                        sb.append(m1944d + 1);
                                    }
                                    C1287U0.m3104v(context3, sb.toString());
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f5770r = new Runnable(this) { // from class: q0.I0

            /* renamed from: b */
            public final /* synthetic */ C1268K0 f5732b;

            {
                this.f5732b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WifiInfo connectionInfo;
                switch (i4) {
                    case 0:
                        this.f5732b.f5756d = true;
                        break;
                    case 1:
                        C1268K0 c1268k0 = this.f5732b;
                        boolean m3044b = c1268k0.m3044b();
                        boolean m3043a = c1268k0.m3043a();
                        boolean z2 = m3044b != c1268k0.f5757e;
                        boolean z3 = m3043a != c1268k0.f5758f;
                        c1268k0.f5757e = m3044b;
                        c1268k0.f5758f = m3043a;
                        if (c1268k0.f5756d) {
                            Context context2 = c1268k0.f5753a;
                            if (z2 && cfgData.m1784i().f2521G2) {
                                if (m3044b) {
                                    String str = "";
                                    try {
                                        WifiManager wifiManager = (WifiManager) context2.getSystemService("wifi");
                                        if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null && connectionInfo.getSSID() != null) {
                                            String trim = connectionInfo.getSSID().trim();
                                            if (trim.startsWith("\"") && trim.endsWith("\"") && trim.length() >= 2) {
                                                trim = trim.substring(1, trim.length() - 1).trim();
                                            }
                                            if (!trim.isEmpty() && !"<unknown ssid>".equalsIgnoreCase(trim)) {
                                                if (!"0x".equalsIgnoreCase(trim)) {
                                                    str = trim;
                                                }
                                            }
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    C1287U0.m3104v(context2, str.isEmpty() ? context2.getString(R.string.split_ball_wifi_on_noname) : context2.getString(R.string.split_ball_wifi_on, str));
                                } else {
                                    C1287U0.m3104v(context2, context2.getString(R.string.split_ball_wifi_off));
                                }
                            }
                            if (z3 && cfgData.m1784i().f2521G2) {
                                C1287U0.m3104v(context2, context2.getString(m3043a ? R.string.split_ball_inet_on : R.string.split_ball_inet_off));
                                break;
                            }
                        }
                        break;
                    default:
                        C1268K0 c1268k02 = this.f5732b;
                        c1268k02.f5762j = false;
                        C0658d current = RadioState.getInstance().current();
                        if (!current.f3094b && current.m1943c()) {
                            int i42 = c1268k02.f5760h;
                            int i5 = current.f3095c;
                            int i6 = current.f3096d;
                            if (i6 != i42 || i5 != c1268k02.f5761i) {
                                c1268k02.f5760h = i6;
                                c1268k02.f5761i = i5;
                                String str2 = current.f3099g;
                                c1268k02.f5765m = str2;
                                c1268k02.f5766n = current.m1944d();
                                if (cfgData.m1784i().f2529I2) {
                                    StringBuilder sb = new StringBuilder();
                                    Context context3 = c1268k02.f5753a;
                                    sb.append(current.m1941a(context3));
                                    sb.append(' ');
                                    sb.append(current.m1942b());
                                    sb.append(' ');
                                    sb.append(current.m1947g(context3));
                                    if (!TextUtils.isEmpty(str2)) {
                                        sb.append(" · ");
                                        sb.append(str2);
                                    }
                                    int m1944d = current.m1944d();
                                    if (m1944d >= 0) {
                                        sb.append(" · ");
                                        sb.append(m1944d + 1);
                                    }
                                    C1287U0.m3104v(context3, sb.toString());
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        final int i5 = 2;
        this.f5771s = new Runnable(this) { // from class: q0.I0

            /* renamed from: b */
            public final /* synthetic */ C1268K0 f5732b;

            {
                this.f5732b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WifiInfo connectionInfo;
                switch (i5) {
                    case 0:
                        this.f5732b.f5756d = true;
                        break;
                    case 1:
                        C1268K0 c1268k0 = this.f5732b;
                        boolean m3044b = c1268k0.m3044b();
                        boolean m3043a = c1268k0.m3043a();
                        boolean z2 = m3044b != c1268k0.f5757e;
                        boolean z3 = m3043a != c1268k0.f5758f;
                        c1268k0.f5757e = m3044b;
                        c1268k0.f5758f = m3043a;
                        if (c1268k0.f5756d) {
                            Context context2 = c1268k0.f5753a;
                            if (z2 && cfgData.m1784i().f2521G2) {
                                if (m3044b) {
                                    String str = "";
                                    try {
                                        WifiManager wifiManager = (WifiManager) context2.getSystemService("wifi");
                                        if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null && connectionInfo.getSSID() != null) {
                                            String trim = connectionInfo.getSSID().trim();
                                            if (trim.startsWith("\"") && trim.endsWith("\"") && trim.length() >= 2) {
                                                trim = trim.substring(1, trim.length() - 1).trim();
                                            }
                                            if (!trim.isEmpty() && !"<unknown ssid>".equalsIgnoreCase(trim)) {
                                                if (!"0x".equalsIgnoreCase(trim)) {
                                                    str = trim;
                                                }
                                            }
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    C1287U0.m3104v(context2, str.isEmpty() ? context2.getString(R.string.split_ball_wifi_on_noname) : context2.getString(R.string.split_ball_wifi_on, str));
                                } else {
                                    C1287U0.m3104v(context2, context2.getString(R.string.split_ball_wifi_off));
                                }
                            }
                            if (z3 && cfgData.m1784i().f2521G2) {
                                C1287U0.m3104v(context2, context2.getString(m3043a ? R.string.split_ball_inet_on : R.string.split_ball_inet_off));
                                break;
                            }
                        }
                        break;
                    default:
                        C1268K0 c1268k02 = this.f5732b;
                        c1268k02.f5762j = false;
                        C0658d current = RadioState.getInstance().current();
                        if (!current.f3094b && current.m1943c()) {
                            int i42 = c1268k02.f5760h;
                            int i52 = current.f3095c;
                            int i6 = current.f3096d;
                            if (i6 != i42 || i52 != c1268k02.f5761i) {
                                c1268k02.f5760h = i6;
                                c1268k02.f5761i = i52;
                                String str2 = current.f3099g;
                                c1268k02.f5765m = str2;
                                c1268k02.f5766n = current.m1944d();
                                if (cfgData.m1784i().f2529I2) {
                                    StringBuilder sb = new StringBuilder();
                                    Context context3 = c1268k02.f5753a;
                                    sb.append(current.m1941a(context3));
                                    sb.append(' ');
                                    sb.append(current.m1942b());
                                    sb.append(' ');
                                    sb.append(current.m1947g(context3));
                                    if (!TextUtils.isEmpty(str2)) {
                                        sb.append(" · ");
                                        sb.append(str2);
                                    }
                                    int m1944d = current.m1944d();
                                    if (m1944d >= 0) {
                                        sb.append(" · ");
                                        sb.append(m1944d + 1);
                                    }
                                    C1287U0.m3104v(context3, sb.toString());
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.f5753a = context;
    }

    /* renamed from: a */
    public final boolean m3043a() {
        Network[] allNetworks;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f5753a.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
            return false;
        }
        for (Network network : allNetworks) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m3044b() {
        Network[] allNetworks;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f5753a.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
            return false;
        }
        for (Network network : allNetworks) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                return true;
            }
        }
        return false;
    }
}
