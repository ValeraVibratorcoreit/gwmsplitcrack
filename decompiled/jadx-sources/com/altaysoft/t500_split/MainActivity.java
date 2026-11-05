package com.altaysoft.t500_split;

import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.RunnableC0005B;
import p001A0.RunnableC0017k;
import p001A0.RunnableC0018l;
import p001A0.RunnableC0024r;
import p010D1.AbstractC0088l;
import p016H.C0117i;
import p051Z0.C0454l;
import p070g.AbstractActivityC0870i;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1319h;
import p098q0.AbstractC1372y1;
import p098q0.C1279Q;
import p098q0.C1287U0;
import p098q0.C1315f1;
import p098q0.C1324i1;
import p098q0.RunnableC1289V0;
import p098q0.RunnableC1290W;
import p098q0.RunnableC1317g0;
import p098q0.RunnableC1320h0;
import p098q0.RunnableC1323i0;
import p098q0.RunnableC1363v1;
import p098q0.ViewOnClickListenerC1326j0;
import p106t0.EnumC1457c;
import p109u0.AbstractC1539g1;
import p109u0.AbstractC1569q1;
import p109u0.C1541h0;
import p112v0.AbstractC1612e;
import p112v0.EnumC1609b;
import p112v0.RunnableC1611d;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0870i {

    /* renamed from: M */
    public static final AtomicBoolean f2306M = new AtomicBoolean(false);

    /* renamed from: N */
    public static volatile boolean f2307N = false;

    /* renamed from: O */
    public static volatile boolean f2308O = false;

    /* renamed from: E */
    public final cfgData f2309E = cfgData.m1784i();

    /* renamed from: F */
    public final carData f2310F = carData.getInstance();

    /* renamed from: G */
    public boolean f2311G = false;

    /* renamed from: H */
    public boolean f2312H = false;

    /* renamed from: I */
    public boolean f2313I = false;

    /* renamed from: J */
    public boolean f2314J = false;

    /* renamed from: K */
    public boolean f2315K = false;

    /* renamed from: L */
    public DialogInterfaceC0867f f2316L;

    /* renamed from: C */
    public static void m1676C(Context context, boolean z2) {
        if (context == null) {
            return;
        }
        cfgData m1784i = cfgData.m1784i();
        m1784i.m1791k(context.getApplicationContext(), false);
        if (z2 || m1784i.f2545M2) {
            String str = m1784i.f2672o3 ? "ip_rest_launcher" : "ip_rest";
            try {
                ActivityOptions makeBasic = ActivityOptions.makeBasic();
                Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                intent.addFlags(872484864);
                intent.putExtra("caller", str);
                makeBasic.setLaunchBounds(new Rect(0, 0, 1920, 1080));
                context.startActivity(intent, makeBasic.toBundle());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: t */
    public static boolean m1677t(Context context) {
        Network[] allNetworks;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
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

    /* renamed from: z */
    public static boolean m1678z(String str, String str2, String str3) {
        if (str3 != null && !str3.isEmpty()) {
            if ("ip_rest".equals(str3)) {
                if (str.contains("ip_rest_launcher")) {
                    return false;
                }
                if (str.equals(str3) || str.contains(str3)) {
                    return true;
                }
            } else if (str.equals(str3) || str.contains(str3)) {
                return true;
            }
        }
        return (str2 == null || str2.isEmpty() || !str.contains(str2)) ? false : true;
    }

    /* renamed from: A */
    public final void m1679A(int i, boolean z2) {
        if (z2 && i == 2) {
            carData cardata = this.f2310F;
            cfgData cfgdata = this.f2309E;
            if (AbstractC1539g1.m4198T(cfgdata, cardata)) {
                m1689w(cfgdata.f2548N1);
                try {
                    ActivityOptions makeBasic = ActivityOptions.makeBasic();
                    Intent intent = new Intent(this, (Class<?>) ActivityC0632IP.class);
                    intent.addFlags(402657280);
                    ActivityOptions.class.getMethod(cfgdata.f2668o, Integer.TYPE).invoke(makeBasic, 6);
                    makeBasic.setLaunchDisplayId(2);
                    startActivity(intent, makeBasic.setLaunchBounds(new Rect(0, 0, 1920, 800)).toBundle());
                } catch (Exception e2) {
                    Toast.makeText(this, "ERROR2" + e2, 1).show();
                }
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013f  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1680B() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str;
        cfgData cfgdata = this.f2309E;
        if (!AbstractC1539g1.m4198T(cfgdata, this.f2310F) || !cfgdata.f2537K2) {
            finish();
            return;
        }
        m1690x();
        int i10 = cfgdata.f2620e1;
        if (i10 == 10) {
            Rect m4231n = AbstractC1539g1.m4231n(10);
            i = m4231n.left;
            i2 = m4231n.top;
            i3 = m4231n.right;
            i4 = m4231n.bottom;
        } else if (AbstractC1569q1.m4455g(i10)) {
            Rect rect = cfgdata.f2557P2 ? new Rect(0, 0, 1920, 800) : AbstractC1569q1.m4459k(this, cfgdata.f2620e1);
            i = rect.left;
            i2 = rect.top;
            i3 = rect.right;
            i4 = rect.bottom;
        } else if (!cfgdata.f2557P2) {
            int i11 = cfgdata.f2620e1;
            if (i11 == 41) {
                Rect m4238t = AbstractC1539g1.m4238t();
                int i12 = m4238t.left;
                int i13 = m4238t.top - 10;
                i3 = m4238t.right;
                i6 = m4238t.bottom - 65;
                i7 = i13;
                i8 = i12;
                i9 = i3;
                str = cfgdata.f2548N1;
                if (str != null) {
                    m1689w(str);
                    m1687u(2, i8, i7, i9, i6, str, "");
                }
                finish();
            }
            if (AbstractC1539g1.m4193O(i11)) {
                Rect m4212d0 = AbstractC1539g1.m4212d0(cfgdata.f2620e1);
                i = m4212d0.left;
                i2 = m4212d0.top;
                i3 = m4212d0.right;
                i4 = m4212d0.bottom;
            } else {
                int i14 = cfgdata.f2620e1;
                if (i14 == 42) {
                    Rect m4232n0 = AbstractC1539g1.m4232n0();
                    i = m4232n0.left;
                    i3 = m4232n0.right;
                    i2 = m4232n0.top - 50;
                    i4 = m4232n0.bottom - 50;
                } else {
                    if (i14 == 43) {
                        Rect m4238t2 = AbstractC1539g1.m4238t();
                        i = m4238t2.left;
                        i2 = m4238t2.top + 115;
                        i3 = m4238t2.right;
                        i5 = m4238t2.bottom;
                    } else if (i14 == 44) {
                        Rect m4238t3 = AbstractC1539g1.m4238t();
                        i = m4238t3.left;
                        i2 = m4238t3.top + 115;
                        i3 = m4238t3.right;
                        i5 = m4238t3.bottom;
                    } else if (i14 == 45) {
                        Rect m4238t4 = AbstractC1539g1.m4238t();
                        i = m4238t4.left;
                        i2 = m4238t4.top + 115;
                        i3 = m4238t4.right;
                        i5 = m4238t4.bottom;
                    } else if (i14 == 46) {
                        Rect m4252r = C1541h0.m4252r();
                        i = m4252r.left;
                        i2 = m4252r.top;
                        i3 = m4252r.right;
                        i4 = m4252r.bottom;
                    } else {
                        Rect m4231n2 = AbstractC1539g1.m4231n(i14);
                        i = m4231n2.left;
                        i2 = m4231n2.top;
                        i3 = m4231n2.right;
                        i4 = m4231n2.bottom;
                    }
                    i4 = i5 + 35;
                }
            }
        } else if (AbstractC1539g1.m4193O(cfgdata.f2620e1)) {
            Rect m4210c0 = AbstractC1539g1.m4210c0(cfgdata.f2620e1);
            i = m4210c0.left;
            i2 = m4210c0.top;
            i3 = m4210c0.right;
            i4 = m4210c0.bottom;
        } else {
            int i15 = cfgdata.f2620e1;
            if (i15 != 46) {
                Rect rect2 = new Rect(0, 0, 1914, i15 <= 40 ? 629 : 624);
                int i16 = rect2.left;
                i2 = rect2.top;
                i3 = rect2.right;
                i8 = i16;
                i6 = rect2.bottom;
                i7 = i2;
                i9 = i3;
                str = cfgdata.f2548N1;
                if (str != null && !"---".equals(str)) {
                    m1689w(str);
                    m1687u(2, i8, i7, i9, i6, str, "");
                }
                finish();
            }
            Rect m4250p = C1541h0.m4250p();
            i = m4250p.left;
            i2 = m4250p.top;
            i3 = m4250p.right;
            i4 = m4250p.bottom;
        }
        i6 = i4;
        i8 = i;
        i7 = i2;
        i9 = i3;
        str = cfgdata.f2548N1;
        if (str != null) {
        }
        finish();
    }

    /* renamed from: D */
    public final void m1681D(RunnableC1317g0 runnableC1317g0, Handler handler) {
        if (isFinishing() || isDestroyed()) {
            f2306M.set(true);
            handler.postDelayed(new RunnableC1320h0(this, 4), 350L);
            return;
        }
        if (f2307N) {
            f2306M.set(true);
            return;
        }
        f2307N = true;
        try {
            m1685H();
            f2307N = false;
            if (f2306M.getAndSet(false)) {
                m1681D(runnableC1317g0, handler);
            } else {
                AbstractC1319h.m3189e(getApplicationContext());
                runnableC1317g0.run();
            }
        } catch (Throwable th) {
            f2307N = false;
            if (f2306M.getAndSet(false)) {
                m1681D(runnableC1317g0, handler);
            } else {
                AbstractC1319h.m3189e(getApplicationContext());
                runnableC1317g0.run();
                throw th;
            }
        }
    }

    /* renamed from: E */
    public final void m1682E() {
        cfgData cfgdata = this.f2309E;
        if (AbstractC1539g1.m4198T(cfgdata, this.f2310F) && cfgdata.alicealways) {
            AbstractC1539g1.m4226k0(this);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1320h0(this, 0), 450L);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1320h0(this, 1), 1200L);
        }
    }

    /* renamed from: F */
    public final void m1683F(String str) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_layout, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(1);
        toast.setView(inflate);
        toast.show();
    }

    /* renamed from: G */
    public final void m1684G() {
        DialogInterfaceC0867f dialogInterfaceC0867f = this.f2316L;
        if (dialogInterfaceC0867f == null || !dialogInterfaceC0867f.isShowing()) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_ext_install, (ViewGroup) null);
            C0117i c0117i = new C0117i(this, R.style.T500Split_Dialog);
            ((C0863b) c0117i.f369g).f4328i = inflate;
            DialogInterfaceC0867f m365a = c0117i.m365a();
            m365a.setCancelable(false);
            m365a.setCanceledOnTouchOutside(false);
            AbstractC1256E0.m3022o(m365a);
            inflate.findViewById(R.id.btn_ext_install_go).setOnClickListener(new ViewOnClickListenerC1326j0(this, m365a, inflate, 0));
            this.f2316L = m365a;
            AbstractC1256E0.m3002Q(m365a, inflate);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04f8  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1685H() {
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        cfgData cfgdata;
        int i17;
        String str;
        String str2;
        boolean z4;
        String str3;
        int i18;
        int i19;
        AbstractC1539g1.m4243y(this);
        cfgData cfgdata2 = this.f2309E;
        carData cardata = this.f2310F;
        int i20 = AbstractC1539g1.m4198T(cfgdata2, cardata) ? 2 : 0;
        int i21 = cfgdata2.f2510E0;
        int i22 = cfgdata2.f2515F0;
        int max = Math.max(1, cfgdata2.f2505D0 - cfgdata2.f2500C0);
        boolean m3004S = AbstractC1256E0.m3004S(cfgdata2);
        boolean z5 = AbstractC1256E0.m3004S(cfgdata2) && cfgdata2.f2627f3;
        if (m3004S) {
            if (!AbstractC1256E0.m3004S(cfgdata2) || cfgdata2.f2622e3) {
                i2 = i21;
            } else {
                if (AbstractC1256E0.m3004S(cfgdata2)) {
                    i19 = ((AbstractC1256E0.m3004S(cfgdata2) && cfgdata2.f2627f3) ? 2 : 1) * 600;
                } else {
                    i19 = 0;
                }
                i2 = i19 + i21;
            }
            if (AbstractC1256E0.m3004S(cfgdata2) && cfgdata2.f2622e3) {
                if (AbstractC1256E0.m3004S(cfgdata2)) {
                    i18 = ((AbstractC1256E0.m3004S(cfgdata2) && cfgdata2.f2627f3) ? 2 : 1) * 600;
                } else {
                    i18 = 0;
                }
                i = i22 - i18;
            } else {
                i = i22;
            }
        } else {
            i = i22;
            i2 = i21;
        }
        int i23 = cfgdata2.f2556P1;
        if (i23 <= i2 + 50 || i23 >= i - 50) {
            i23 = ((i - i2) / 2) + i2;
        }
        try {
            try {
                if (!cfgdata2.f2549N2) {
                    if (AbstractC1539g1.m4198T(cfgdata2, cardata)) {
                        int i24 = cfgdata2.f2500C0;
                        int i25 = cfgdata2.f2505D0;
                        int i26 = cfgdata2.f2620e1;
                        if (i26 == 10) {
                            Rect m4231n = AbstractC1539g1.m4231n(10);
                            int i27 = m4231n.left;
                            int i28 = m4231n.top;
                            i10 = i24;
                            i7 = m4231n.right;
                            i9 = i28;
                            i6 = i2;
                            i8 = i;
                            i4 = i25;
                            i3 = m4231n.bottom;
                            i5 = i27;
                        } else {
                            if (AbstractC1569q1.m4455g(i26)) {
                                Rect rect = cfgdata2.f2557P2 ? new Rect(0, 0, 1920, 800) : AbstractC1569q1.m4459k(this, cfgdata2.f2620e1);
                                i5 = rect.left;
                                i11 = rect.top;
                                i12 = rect.right;
                                i13 = rect.bottom;
                            } else if (!cfgdata2.f2557P2) {
                                int i29 = cfgdata2.f2620e1;
                                if (i29 == 41) {
                                    Rect m4238t = AbstractC1539g1.m4238t();
                                    i5 = m4238t.left;
                                    i11 = m4238t.top - 10;
                                    i12 = m4238t.right;
                                    i13 = m4238t.bottom - 65;
                                } else if (AbstractC1539g1.m4193O(i29)) {
                                    Rect m4212d0 = AbstractC1539g1.m4212d0(cfgdata2.f2620e1);
                                    i5 = m4212d0.left;
                                    i11 = m4212d0.top;
                                    i12 = m4212d0.right;
                                    i13 = m4212d0.bottom;
                                } else {
                                    int i30 = cfgdata2.f2620e1;
                                    if (i30 == 42) {
                                        Rect m4232n0 = AbstractC1539g1.m4232n0();
                                        i5 = m4232n0.left;
                                        int i31 = m4232n0.right;
                                        int i32 = m4232n0.top - 50;
                                        i10 = i24;
                                        i3 = m4232n0.bottom - 50;
                                        i6 = i2;
                                        i8 = i;
                                        i4 = i25;
                                        i7 = i31;
                                        i9 = i32;
                                    } else {
                                        if (i30 == 43) {
                                            Rect m4238t2 = AbstractC1539g1.m4238t();
                                            i5 = m4238t2.left;
                                            i11 = m4238t2.top + 115;
                                            i12 = m4238t2.right;
                                            i14 = m4238t2.bottom;
                                        } else if (i30 == 44) {
                                            Rect m4238t3 = AbstractC1539g1.m4238t();
                                            i5 = m4238t3.left;
                                            i11 = m4238t3.top + 115;
                                            i12 = m4238t3.right;
                                            i14 = m4238t3.bottom;
                                        } else if (i30 == 45) {
                                            Rect m4238t4 = AbstractC1539g1.m4238t();
                                            i5 = m4238t4.left;
                                            i11 = m4238t4.top + 115;
                                            i12 = m4238t4.right;
                                            i14 = m4238t4.bottom;
                                        } else if (i30 == 46) {
                                            Rect m4252r = C1541h0.m4252r();
                                            i5 = m4252r.left;
                                            i11 = m4252r.top;
                                            i12 = m4252r.right;
                                            i13 = m4252r.bottom;
                                        } else {
                                            Rect m4231n2 = AbstractC1539g1.m4231n(i30);
                                            i5 = m4231n2.left;
                                            i11 = m4231n2.top;
                                            i12 = m4231n2.right;
                                            i13 = m4231n2.bottom;
                                        }
                                        i13 = i14 + 35;
                                    }
                                }
                            } else if (AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                                Rect m4210c0 = AbstractC1539g1.m4210c0(cfgdata2.f2620e1);
                                i5 = m4210c0.left;
                                i11 = m4210c0.top;
                                i12 = m4210c0.right;
                                i13 = m4210c0.bottom;
                            } else {
                                int i33 = cfgdata2.f2620e1;
                                if (i33 == 46) {
                                    Rect m4250p = C1541h0.m4250p();
                                    i5 = m4250p.left;
                                    i11 = m4250p.top;
                                    i12 = m4250p.right;
                                    i13 = m4250p.bottom;
                                } else {
                                    Rect rect2 = new Rect(0, 0, 1914, i33 <= 40 ? 629 : 624);
                                    int i34 = rect2.left;
                                    int i35 = rect2.top;
                                    int i36 = rect2.right;
                                    i10 = i24;
                                    i3 = rect2.bottom;
                                    i6 = i2;
                                    i8 = i;
                                    i4 = i25;
                                    i9 = i35;
                                    i7 = i36;
                                    z3 = true;
                                    z2 = true;
                                    i5 = i34;
                                }
                            }
                            i10 = i24;
                            i3 = i13;
                            i6 = i2;
                            i8 = i;
                            i4 = i25;
                            i9 = i11;
                            i7 = i12;
                        }
                        z3 = true;
                        z2 = true;
                    } else {
                        int i37 = cfgdata2.f2549N2 ? cfgdata2.f2495B0 : cfgdata2.f2505D0;
                        int i38 = cfgdata2.f2500C0;
                        if (cfgdata2.f2545M2) {
                            if (cfgdata2.m1790j() && !cfgdata2.f2692s3 && !cfgdata2.f2697t3) {
                                cfgdata2.f2692s3 = true;
                            }
                            boolean z6 = cfgdata2.f2692s3;
                            if (z6 || cfgdata2.f2697t3) {
                                if (z6 ^ cfgdata2.f2687r3) {
                                    z2 = true;
                                    i3 = i37;
                                    i4 = i3;
                                    z3 = false;
                                    i5 = 0;
                                    i7 = 0;
                                    i9 = i38;
                                    i10 = i9;
                                    i6 = i2;
                                    i8 = i;
                                } else {
                                    i3 = i37;
                                    i4 = i3;
                                    z2 = false;
                                    i6 = 0;
                                    i8 = 0;
                                    i9 = i38;
                                    i10 = i9;
                                    i5 = i2;
                                    i7 = i;
                                }
                            } else if (cfgdata2.f2687r3) {
                                z2 = true;
                                i3 = i37;
                                i4 = i3;
                                i9 = i38;
                                i10 = i9;
                                i5 = i2;
                                i8 = i;
                                i6 = i23;
                                i7 = i6;
                            } else {
                                z2 = true;
                                i3 = i37;
                                i4 = i3;
                                i9 = i38;
                                i10 = i9;
                                i6 = i2;
                                i7 = i;
                                i5 = i23;
                                i8 = i5;
                            }
                        } else {
                            z2 = true;
                            i3 = i37;
                            i4 = i3;
                            i5 = 0;
                            i6 = 0;
                            i7 = 0;
                            i8 = 0;
                            i9 = i38;
                            i10 = i9;
                        }
                        z3 = z2;
                    }
                    if (i20 == 0 && !cfgdata2.f2545M2 && !cfgdata2.f2549N2) {
                        z3 = false;
                    }
                    if (i20 == 2 && !cfgdata2.f2537K2) {
                        z3 = false;
                    }
                    boolean z7 = (!cfgdata2.f2545M2 || cfgdata2.f2549N2) ? z2 : false;
                    boolean z8 = (!z3 && i20 == 0 && AbstractC1539g1.m4196R(cfgdata2.f2548N1)) || (z7 && AbstractC1539g1.m4196R(cfgdata2.f2544M1));
                    C1315f1 c1315f1 = new C1315f1();
                    c1315f1.m3178a(cfgdata2, i20, cfgdata2.f2548N1, i5, i9, i7, i3, !z3 && i20 == 0);
                    c1315f1.m3178a(cfgdata2, 0, cfgdata2.f2544M1, i6, i10, i8, i4, z7);
                    if (!cfgdata2.alicealways || cfgdata2.f2549N2) {
                        boolean z9 = z3;
                        i15 = max;
                        i16 = i22;
                        cfgdata = cfgdata2;
                        int i39 = i20;
                        if (cfgdata.f2549N2) {
                            AbstractC1372y1.m3304j(this);
                        }
                        if (!cfgdata.f2553O2) {
                            m1691y();
                        }
                        Thread.sleep(100L);
                        i17 = i21;
                        m1687u(0, cfgdata.f2510E0, cfgdata.f2500C0, cfgdata.f2515F0, cfgdata.f2505D0, cfgdata.f2663n, "split");
                        Thread.sleep(100L);
                        AbstractC1372y1.m3300f();
                        if (cfgdata.f2545M2 && z8) {
                            m1686I(cfgdata.f2510E0, cfgdata.f2500C0, cfgdata.f2515F0, cfgdata.f2495B0);
                        }
                        m1687u(0, cfgdata.f2510E0, cfgdata.f2500C0, cfgdata.f2515F0, cfgdata.f2505D0, cfgdata.f2663n, "split");
                        if (!cfgdata.f2549N2) {
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            getApplicationContext().startService(new Intent(this, (Class<?>) TopOverlayService.class));
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        if (cfgdata.alicealways) {
                            if (z9) {
                                m1679A(i39, z9);
                                m1687u(i39, i5, i9, i7, i3, cfgdata.f2548N1, "");
                            }
                            if (z7) {
                                m1687u(0, i6, i10, i8, i4, cfgdata.f2544M1, "");
                            }
                        } else {
                            if (z7) {
                                m1687u(0, i6, i10, i8, i4, cfgdata.f2544M1, "");
                            }
                            if (z9) {
                                if (z7) {
                                    try {
                                        Thread.sleep(cfgdata.f2553O2 ? 200 : 3300);
                                    } catch (InterruptedException e3) {
                                        throw new RuntimeException(e3);
                                    }
                                }
                                m1679A(i39, z9);
                                m1687u(i39, i5, i9, i7, i3, cfgdata.f2548N1, "");
                                if (cfgdata.alicealways && (str = cfgdata.f2548N1) != null && !str.trim().isEmpty() && !"---".equals(str) && (str2 = cfgdata.f2703v) != null && !str2.isEmpty() && str.contains(str2)) {
                                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0017k(this, str, i39, 6), 7000L);
                                }
                            }
                        }
                        if (cfgdata.f2553O2) {
                            m1691y();
                        }
                    } else {
                        if (!cfgdata2.f2553O2) {
                            m1691y();
                        }
                        AbstractC1372y1.m3300f();
                        try {
                            Thread.sleep(100L);
                            if (cfgdata2.f2545M2 && z8) {
                                m1686I(cfgdata2.f2510E0, cfgdata2.f2500C0, cfgdata2.f2515F0, cfgdata2.f2495B0);
                            }
                            boolean z10 = z3;
                            i15 = max;
                            i16 = i22;
                            int i40 = i20;
                            cfgdata = cfgdata2;
                            m1687u(0, cfgdata2.f2510E0, cfgdata2.f2500C0, cfgdata2.f2515F0, cfgdata2.f2505D0, cfgdata2.f2663n, "split");
                            TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                            getApplicationContext().startService(new Intent(this, (Class<?>) TopOverlayService.class));
                            if (z10) {
                                m1679A(i40, z10);
                                m1687u(i40, i5, i9, i7, i3, cfgdata.f2548N1, "");
                            }
                            if (z7) {
                                m1687u(0, i6, i10, i8, i4, cfgdata.f2544M1, "");
                            }
                            if (cfgdata.f2553O2) {
                                m1691y();
                            }
                            i17 = i21;
                        } catch (InterruptedException e4) {
                            throw new RuntimeException(e4);
                        }
                    }
                    z4 = cfgdata.f2549N2;
                    if (!z4) {
                        AbstractC1372y1.m3304j(this);
                    } else if (!z4) {
                        TopOverlayService topOverlayService3 = TopOverlayService.f2357r;
                        getApplicationContext().startService(new Intent(this, (Class<?>) TopOverlayService.class));
                        TopOverlayService topOverlayService4 = TopOverlayService.f2357r;
                        if (topOverlayService4 != null) {
                            topOverlayService4.f2359g.post(new RunnableC1363v1(topOverlayService4, 4));
                        }
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1290W(1), 500L);
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1290W(2), 2000L);
                    }
                    boolean z11 = cfgdata.f2549N2 && (this.f2311G || this.f2313I || cfgdata.f2545M2);
                    if (cfgdata.f2593Y2 || !z11) {
                        C0454l m1162a = C0454l.m1162a(this);
                        ((Handler) m1162a.f1453c).post(new RunnableC0024r(23, m1162a));
                    } else {
                        C0454l m1162a2 = C0454l.m1162a(this);
                        ((Handler) m1162a2.f1453c).post(new RunnableC0018l(m1162a2, 19, c1315f1));
                    }
                    if (m3004S) {
                        C1324i1 m3193l = C1324i1.m3193l(this, 0);
                        m3193l.f6208b.post(new RunnableC1289V0(m3193l, 3));
                        C1324i1 m3193l2 = C1324i1.m3193l(this, 1);
                        m3193l2.f6208b.post(new RunnableC1289V0(m3193l2, 3));
                    } else {
                        final C1324i1 m3193l3 = C1324i1.m3193l(this, 0);
                        int i41 = i16;
                        int i42 = i17;
                        final int m3005T = AbstractC1256E0.m3005T(cfgdata, i42, i41, 0);
                        final int i43 = cfgdata.f2500C0;
                        final int i44 = i15;
                        m3193l3.f6208b.post(new Runnable() { // from class: q0.c1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1324i1.this.m3195A(m3005T, i43, i44);
                            }
                        });
                        if (z5) {
                            final C1324i1 m3193l4 = C1324i1.m3193l(this, 1);
                            final int m3005T2 = AbstractC1256E0.m3005T(cfgdata, i42, i41, 1);
                            final int i45 = cfgdata.f2500C0;
                            m3193l4.f6208b.post(new Runnable() { // from class: q0.c1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1324i1.this.m3195A(m3005T2, i45, i44);
                                }
                            });
                        } else {
                            C1324i1 m3193l5 = C1324i1.m3193l(this, 1);
                            m3193l5.f6208b.post(new RunnableC1289V0(m3193l5, 3));
                        }
                    }
                    C1287U0.m3100c(this);
                    str3 = cfgdata.f2663n;
                    if (str3 != null || str3.isEmpty()) {
                        return;
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1323i0(str3, 0), 5000L);
                    return;
                }
                int i46 = cfgdata2.f2495B0;
                int i47 = cfgdata2.f2500C0;
                z2 = cfgdata2.f2677p3;
                i3 = i46;
                i4 = i3;
                if (z2) {
                    i5 = i2;
                    i6 = i5;
                    i7 = i;
                    i8 = i7;
                } else {
                    i6 = 0;
                    i8 = 0;
                    i5 = i2;
                    i7 = i;
                }
                i9 = i47;
                i10 = i9;
                Thread.sleep(100L);
                AbstractC1372y1.m3300f();
                if (cfgdata.f2545M2) {
                    m1686I(cfgdata.f2510E0, cfgdata.f2500C0, cfgdata.f2515F0, cfgdata.f2495B0);
                }
                m1687u(0, cfgdata.f2510E0, cfgdata.f2500C0, cfgdata.f2515F0, cfgdata.f2505D0, cfgdata.f2663n, "split");
                if (!cfgdata.f2549N2) {
                }
                if (cfgdata.alicealways) {
                }
                if (cfgdata.f2553O2) {
                }
                z4 = cfgdata.f2549N2;
                if (!z4) {
                }
                if (cfgdata.f2549N2) {
                }
                if (cfgdata.f2593Y2) {
                }
                C0454l m1162a3 = C0454l.m1162a(this);
                ((Handler) m1162a3.f1453c).post(new RunnableC0024r(23, m1162a3));
                if (m3004S) {
                }
                C1287U0.m3100c(this);
                str3 = cfgdata.f2663n;
                if (str3 != null) {
                    return;
                } else {
                    return;
                }
            } catch (InterruptedException e5) {
                throw new RuntimeException(e5);
            }
            Thread.sleep(100L);
            i17 = i21;
            m1687u(0, cfgdata.f2510E0, cfgdata.f2500C0, cfgdata.f2515F0, cfgdata.f2505D0, cfgdata.f2663n, "split");
        } catch (InterruptedException e6) {
            throw new RuntimeException(e6);
        }
        z3 = true;
        if (i20 == 0) {
            z3 = false;
        }
        if (i20 == 2) {
            z3 = false;
        }
        if (cfgdata2.f2545M2) {
        }
        if (z3) {
        }
        C1315f1 c1315f12 = new C1315f1();
        c1315f12.m3178a(cfgdata2, i20, cfgdata2.f2548N1, i5, i9, i7, i3, !z3 && i20 == 0);
        c1315f12.m3178a(cfgdata2, 0, cfgdata2.f2544M1, i6, i10, i8, i4, z7);
        if (cfgdata2.alicealways) {
        }
        boolean z92 = z3;
        i15 = max;
        i16 = i22;
        cfgdata = cfgdata2;
        int i392 = i20;
        if (cfgdata.f2549N2) {
        }
        if (!cfgdata.f2553O2) {
        }
    }

    /* renamed from: I */
    public final void m1686I(int i, int i2, int i3, int i4) {
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent = new Intent(this, (Class<?>) LauncherBackGround.class);
            intent.addFlags(805441536);
            ActivityOptions.class.getMethod(this.f2309E.f2668o, Integer.TYPE).invoke(makeBasic, 6);
            makeBasic.setLaunchDisplayId(0);
            startActivity(intent, makeBasic.setLaunchBounds(new Rect(i, i2, i3, i4)).toBundle());
        } catch (Exception e2) {
            Toast.makeText(this, "ERROR2" + e2, 1).show();
        }
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 2;
        int i2 = 0;
        super.onCreate(bundle);
        cfgData cfgdata = this.f2309E;
        cfgdata.m1791k(this, false);
        AbstractC1569q1.m4468t(this, cfgdata);
        boolean z2 = cfgdata.f2543M0 == EnumC1457c.H9_Diesel;
        carData cardata = this.f2310F;
        cardata.setDiesel(z2);
        try {
            AbstractC1372y1.f6431a.setIPMode(Settings.System.getInt(getContentResolver(), "ipk_setting_theme_config"));
            AbstractC1539g1.m4225k(this);
        } catch (Settings.SettingNotFoundException unused) {
        }
        AbstractC1539g1.m4222i0(cfgdata);
        int i3 = cfgdata.f2620e1;
        if (i3 == 42 || i3 == 43 || i3 == 44 || i3 == 45) {
            cfgdata.f2557P2 = false;
            cardata.setIp_navi_full(false);
        }
        AbstractC1539g1.m4243y(this);
        if (cfgdata.f2645j1) {
            AbstractC1372y1.m3319y();
            cardata.setStartTime((int) (System.currentTimeMillis() / 1000));
            cardata.setKIv("0");
            cardata.setK0("0");
        } else {
            String str = cfgdata.f2494B;
            if (str == null || str.isEmpty()) {
                AbstractC1372y1.m3319y();
            }
        }
        PackageManager packageManager = getPackageManager();
        ComponentName componentName = new ComponentName(this, (Class<?>) Launcher.class);
        if (cfgdata.f2672o3) {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } else {
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        }
        RunnableC1320h0 runnableC1320h0 = new RunnableC1320h0(this, i);
        Dialog dialog = AbstractC1612e.f9237a;
        if (AbstractC0088l.m266d(this)) {
            cfgData m1784i = cfgData.m1784i();
            if (((!m1784i.f2585W2 && !m1784i.f2651k2 && !m1784i.f2597Z2) || AbstractC0088l.m261T(this, EnumC1609b.NOTIFICATION_ACCESS)) && (!cfgData.m1784i().f2597Z2 || AbstractC0088l.m261T(this, EnumC1609b.LOCATION))) {
                AbstractC1612e.f9244h.post(new RunnableC1611d(this, runnableC1320h0, i2, i2));
                return;
            }
        }
        if (!AbstractC0088l.m261T(this, EnumC1609b.PHONE) || !AbstractC0088l.m261T(this, EnumC1609b.STORAGE)) {
            AbstractC0088l.m283y(this);
        }
        AbstractC1612e.f9241e = false;
        AbstractC1612e.f9242f = null;
        AbstractC1612e.f9243g = 0;
        AbstractC1612e.f9239c = runnableC1320h0;
        AbstractC1612e.f9238b = this;
        AbstractC1612e.m4772d(this);
        Handler handler = AbstractC1612e.f9244h;
        RunnableC1290W runnableC1290W = AbstractC1612e.f9245i;
        handler.removeCallbacks(runnableC1290W);
        handler.post(runnableC1290W);
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        DialogInterfaceC0867f dialogInterfaceC0867f = this.f2316L;
        if (dialogInterfaceC0867f != null && dialogInterfaceC0867f.isShowing()) {
            this.f2316L.dismiss();
        }
        this.f2316L = null;
        AbstractC1612e.f9244h.removeCallbacks(AbstractC1612e.f9245i);
        AbstractC1612e.m4769a();
        super.onDestroy();
    }

    @Override // p052a.AbstractActivityC0472l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (this.f2315K) {
            m1688v();
            boolean z2 = this.f2314J;
            cfgData cfgdata = this.f2309E;
            if (z2) {
                cfgdata.m1791k(this, false);
                AbstractC1569q1.m4468t(this, cfgdata);
                String str = (String) AbstractC1569q1.f8669d.getAndSet(null);
                if (str != null) {
                    AbstractC1569q1.m4464p(this, str);
                }
                m1680B();
                return;
            }
            if (this.f2311G || this.f2313I) {
                cfgdata.m1791k(this, false);
                AbstractC1569q1.m4468t(this, cfgdata);
                String str2 = (String) AbstractC1569q1.f8669d.getAndSet(null);
                if (str2 != null) {
                    AbstractC1569q1.m4464p(this, str2);
                }
                AbstractC1539g1.m4243y(this);
                m1690x();
                RunnableC1317g0 runnableC1317g0 = new RunnableC1317g0(this, true, 0);
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new RunnableC0005B(this, runnableC1317g0, handler, 6));
            }
        }
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AbstractC1612e.f9239c == null) {
            return;
        }
        AbstractC1612e.f9238b = this;
        Handler handler = AbstractC1612e.f9244h;
        RunnableC1290W runnableC1290W = AbstractC1612e.f9245i;
        handler.removeCallbacks(runnableC1290W);
        handler.post(runnableC1290W);
        AbstractC1612e.m4772d(this);
        if (AbstractC1612e.f9241e) {
            AbstractC1612e.f9241e = false;
            AbstractC1612e.f9243g = 0;
        }
    }

    /* renamed from: u */
    public final void m1687u(int i, int i2, int i3, int i4, int i5, String str, String str2) {
        cfgData cfgdata = this.f2309E;
        if (str == null || str.trim().isEmpty() || "---".equals(str)) {
            return;
        }
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent launchIntentForPackage = getApplication().getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return;
            }
            launchIntentForPackage.addFlags(134221824);
            ActivityOptions.class.getMethod(cfgdata.f2668o, Integer.TYPE).invoke(makeBasic, 6);
            makeBasic.setLaunchDisplayId(i);
            Rect rect = new Rect(i2, i3, i4, i5);
            AbstractC1256E0.m3025r(cfgdata, str, rect, i);
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom;
            ActivityOptions launchBounds = makeBasic.setLaunchBounds(rect);
            if (str2 != "") {
                launchIntentForPackage.putExtra(cfgdata.f2494B, str2);
            }
            startActivity(launchIntentForPackage, launchBounds.toBundle());
            str.contains(cfgdata.f2688s);
            if (str.equals(cfgdata.f2548N1)) {
                cfgdata.f2707v3 = i;
                cfgdata.f2712w3 = AbstractC1372y1.m3313s(i, str);
            }
            if (str.equals(cfgdata.f2544M1)) {
                cfgdata.f2717x3 = i;
                cfgdata.f2722y3 = AbstractC1372y1.m3313s(i, str);
                cfgdata.f2727z3 = i6;
                cfgdata.f2493A3 = i7;
                cfgdata.f2498B3 = i8;
                cfgdata.f2503C3 = i9;
            }
        } catch (Exception unused) {
            m1683F(getString(R.string.error_run_pkg) + " " + str);
        }
    }

    /* renamed from: v */
    public final void m1688v() {
        String stringExtra;
        String str;
        Intent intent = getIntent();
        cfgData cfgdata = this.f2309E;
        if (intent == null) {
            stringExtra = null;
        } else {
            stringExtra = intent.getStringExtra("caller");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("start");
            }
            if (stringExtra == null && (str = cfgdata.f2494B) != null && !str.isEmpty()) {
                stringExtra = intent.getStringExtra(cfgdata.f2494B);
            }
        }
        if (stringExtra != null) {
            m1678z(stringExtra, cfgdata.f2723z, null);
            m1678z(stringExtra, cfgdata.f2499C, null);
            m1678z(stringExtra, cfgdata.f2504D, null);
            m1678z(stringExtra, cfgdata.f2509E, "ip");
            this.f2313I = m1678z(stringExtra, cfgdata.f2683r, "ip_rest_launcher");
            this.f2311G = m1678z(stringExtra, cfgdata.f2489A, "ip_rest");
            m1678z(stringExtra, cfgdata.f2713x, null);
            m1678z(stringExtra, cfgdata.f2693t, null);
            this.f2312H = m1678z(stringExtra, cfgdata.f2698u, "ext_start_cfg");
            this.f2314J = m1678z(stringExtra, null, "preset_relayout");
        }
    }

    /* renamed from: w */
    public final void m1689w(String str) {
        int m3313s;
        if (str == null || !"ru.yandex.yandexnavi.auto".equals(str) || !"ru.yandex.yandexnavi.auto".equals(this.f2309E.f2548N1) || (m3313s = AbstractC1372y1.m3313s(0, str)) <= 0) {
            return;
        }
        AbstractC1372y1.m3285P(m3313s, 0);
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: x */
    public final void m1690x() {
        Display display = ((DisplayManager) getSystemService("display")).getDisplay(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        display.getRealMetrics(displayMetrics2);
        cfgData cfgdata = this.f2309E;
        int m1792l = cfgdata.m1792l();
        int i = displayMetrics.widthPixels;
        cfgdata.f2490A0 = i;
        int i2 = displayMetrics2.heightPixels;
        cfgdata.f2495B0 = i2;
        cfgdata.f2500C0 = cfgdata.f2531J0;
        int i3 = cfgdata.f2519G0;
        cfgdata.f2510E0 = i3;
        cfgdata.f2515F0 = i + i3;
        cfgdata.f2505D0 = i2 - m1792l;
    }

    /* renamed from: y */
    public final void m1691y() {
        C1279Q c1279q;
        try {
            int m3313s = AbstractC1372y1.m3313s(2, getPackageName());
            if (m3313s > 0) {
                AbstractC1372y1.m3285P(m3313s, 2);
                Thread.sleep(100L);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        }
        if (f2308O && (c1279q = IPOverlayService.f2293g) != null && c1279q.f5935l) {
            f2308O = false;
            m1682E();
        } else {
            f2308O = false;
            IPOverlayService.m1667a();
            IPOverlayService.m1669c(this);
            m1682E();
        }
    }
}
