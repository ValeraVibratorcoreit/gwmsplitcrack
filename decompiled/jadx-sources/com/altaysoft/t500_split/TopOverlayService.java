package com.altaysoft.t500_split;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.Button;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.sun.jna.Platform;
import java.util.List;
import p001A0.RunnableC0020n;
import p001A0.RunnableC0029w;
import p051Z0.C0454l;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1368x0;
import p098q0.AbstractC1372y1;
import p098q0.C1310e;
import p098q0.C1324i1;
import p098q0.C1360u1;
import p098q0.C1366w1;
import p098q0.RunnableC1363v1;
import p109u0.AbstractC1539g1;

/* loaded from: classes.dex */
public class TopOverlayService extends Service {

    /* renamed from: r */
    public static TopOverlayService f2357r;

    /* renamed from: f */
    public C1360u1 f2358f;

    /* renamed from: h */
    public boolean f2360h;

    /* renamed from: j */
    public boolean f2362j;

    /* renamed from: k */
    public long f2363k;

    /* renamed from: l */
    public long f2364l;

    /* renamed from: m */
    public boolean f2365m;

    /* renamed from: n */
    public boolean f2366n;

    /* renamed from: o */
    public C1366w1 f2367o;

    /* renamed from: g */
    public final Handler f2359g = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public Boolean f2361i = null;

    /* renamed from: p */
    public final RunnableC0020n f2368p = new RunnableC0020n(21, this);

    /* renamed from: q */
    public final RunnableC1363v1 f2369q = new RunnableC1363v1(this, 1);

    /* renamed from: c */
    public static void m1704c(Context context) {
        context.getApplicationContext().stopService(new Intent(context, (Class<?>) TopOverlayService.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0125, code lost:
    
        if (r7 == 0) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01de  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1705a() {
        boolean z2;
        int displayId;
        C1360u1 c1360u1;
        Boolean bool;
        C1310e c1310e;
        int i = 5;
        if (this.f2358f == null) {
            return;
        }
        m1707d();
        boolean z3 = false;
        if (cfgData.m1784i().f2549N2) {
            Boolean bool2 = this.f2361i;
            if (bool2 == null || bool2.booleanValue()) {
                C1360u1 c1360u12 = this.f2358f;
                if (c1360u12.f6383e) {
                    c1360u12.m3260h(false);
                }
                C0454l m1162a = C0454l.m1162a(this);
                ((Handler) m1162a.f1453c).post(new RunnableC0029w(m1162a, z3, i));
                C1324i1.m3194y(false);
                this.f2361i = Boolean.FALSE;
                return;
            }
            return;
        }
        String m3314t = AbstractC1372y1.m3314t(0);
        boolean z4 = (m3314t == null || m3314t.isEmpty()) ? false : true;
        boolean m3273D = AbstractC1372y1.m3273D(m3314t);
        boolean contains = AbstractC1372y1.m3276G(m3314t) ? true : (m3314t == null || m3314t.isEmpty()) ? false : m3314t.contains("com.android.settings");
        boolean m3277H = AbstractC1372y1.m3277H(m3314t);
        boolean z5 = (AbstractC1372y1.m3316v() || AbstractC1372y1.m3270A(getApplicationContext())) ? false : true;
        if (this.f2365m && z4 && !m3273D && z5) {
            Context applicationContext = getApplicationContext();
            String str = AbstractC1368x0.f6422a;
            AbstractC1256E0.m2998M(applicationContext, false);
        }
        if (this.f2366n && z4 && !contains && m3277H && z5 && !m3273D && !cfgData.m1784i().m1790j()) {
            AbstractC1256E0.m2998M(getApplicationContext(), false);
        }
        if (z4) {
            this.f2365m = m3273D;
            this.f2366n = contains;
        }
        this.f2362j = (MyAccessibilityService.f2328m != null && AbstractC1372y1.m3316v()) || AbstractC1372y1.m3270A(getApplicationContext());
        if (this.f2364l <= 0 || SystemClock.uptimeMillis() >= this.f2364l) {
            if (!AbstractC1372y1.m3275F(m3314t) && !this.f2362j) {
                MyAccessibilityService myAccessibilityService = MyAccessibilityService.f2328m;
                if (myAccessibilityService != null) {
                    try {
                        List<AccessibilityWindowInfo> windows = myAccessibilityService.getWindows();
                        if (windows != null && !windows.isEmpty()) {
                            for (AccessibilityWindowInfo accessibilityWindowInfo : windows) {
                                if (accessibilityWindowInfo != null) {
                                    try {
                                        if (Build.VERSION.SDK_INT >= 30) {
                                            displayId = accessibilityWindowInfo.getDisplayId();
                                        }
                                        if (myAccessibilityService.m1699c(accessibilityWindowInfo)) {
                                            try {
                                                accessibilityWindowInfo.recycle();
                                                break;
                                            } catch (Exception unused) {
                                            }
                                        }
                                    } catch (Exception unused2) {
                                    } catch (Throwable th) {
                                        try {
                                            accessibilityWindowInfo.recycle();
                                        } catch (Exception unused3) {
                                        }
                                        throw th;
                                    }
                                    try {
                                        accessibilityWindowInfo.recycle();
                                    } catch (Exception unused4) {
                                    }
                                }
                            }
                        }
                    } catch (Exception unused5) {
                    }
                }
                if (SystemClock.uptimeMillis() >= this.f2363k) {
                    cfgData cfgdata = AbstractC1372y1.f6432b;
                    if (!cfgdata.f2549N2 && !AbstractC1372y1.m3275F(m3314t)) {
                        if (m3314t != null && !m3314t.isEmpty()) {
                            if (!AbstractC1372y1.m3276G(m3314t) && !m3314t.contains("com.altaysoft.t500_split/.MainActivity") && !m3314t.contains("com.altaysoft.t500_split/.IP")) {
                                if (AbstractC1372y1.m3277H(m3314t)) {
                                    if (!m3314t.contains("com.altaysoft.t500_split/.LauncherBackGround") && !m3314t.contains("com.altaysoft.t500_split/.Launcher")) {
                                        z2 = cfgdata.f2545M2;
                                        c1360u1 = this.f2358f;
                                        if (c1360u1.f6383e) {
                                            c1360u1.m3260h(z2);
                                        }
                                        bool = this.f2361i;
                                        if (bool == null && bool.booleanValue() == z2) {
                                            return;
                                        }
                                        C0454l m1162a2 = C0454l.m1162a(this);
                                        if (z2 && cfgData.m1784i().f2545M2) {
                                            z3 = true;
                                        }
                                        ((Handler) m1162a2.f1453c).post(new RunnableC0029w(m1162a2, z3, i));
                                        C1324i1.m3194y(z2);
                                        if (z2) {
                                            C1360u1 c1360u13 = this.f2358f;
                                            if (c1360u13.f6383e) {
                                                c1360u13.m3255b();
                                                this.f2361i = Boolean.valueOf(z2);
                                            }
                                        }
                                        if (!z2 && (c1310e = C1310e.f6084h) != null) {
                                            c1310e.m3162a();
                                        }
                                        this.f2361i = Boolean.valueOf(z2);
                                    }
                                } else if (!m3314t.contains("com.gwm.")) {
                                    m3314t.contains("com.android.");
                                }
                            }
                        }
                    }
                }
            }
            z2 = false;
            c1360u1 = this.f2358f;
            if (c1360u1.f6383e) {
            }
            bool = this.f2361i;
            if (bool == null) {
            }
            C0454l m1162a22 = C0454l.m1162a(this);
            if (z2) {
                z3 = true;
            }
            ((Handler) m1162a22.f1453c).post(new RunnableC0029w(m1162a22, z3, i));
            C1324i1.m3194y(z2);
            if (z2) {
            }
            if (!z2) {
                c1310e.m3162a();
            }
            this.f2361i = Boolean.valueOf(z2);
        }
        z2 = true;
        c1360u1 = this.f2358f;
        if (c1360u1.f6383e) {
        }
        bool = this.f2361i;
        if (bool == null) {
        }
        C0454l m1162a222 = C0454l.m1162a(this);
        if (z2) {
        }
        ((Handler) m1162a222.f1453c).post(new RunnableC0029w(m1162a222, z3, i));
        C1324i1.m3194y(z2);
        if (z2) {
        }
        if (!z2) {
        }
        this.f2361i = Boolean.valueOf(z2);
    }

    /* renamed from: b */
    public final void m1706b() {
        this.f2363k = SystemClock.uptimeMillis() + 5000;
        this.f2362j = false;
        this.f2361i = Boolean.TRUE;
        m1707d();
        C1360u1 c1360u1 = this.f2358f;
        if (c1360u1 != null && c1360u1.f6383e) {
            c1360u1.m3260h(cfgData.m1784i().f2602a3);
        }
        boolean z2 = cfgData.m1784i().f2545M2;
        C0454l m1162a = C0454l.m1162a(this);
        ((Handler) m1162a.f1453c).post(new RunnableC0029w(m1162a, z2, 5));
        C1324i1.m3194y(z2);
    }

    /* renamed from: d */
    public final void m1707d() {
        WindowManager windowManager;
        View view;
        if (this.f2358f == null) {
            return;
        }
        if (!cfgData.m1784i().f2602a3 || cfgData.m1784i().f2549N2) {
            C1360u1 c1360u1 = this.f2358f;
            boolean z2 = c1360u1.f6383e;
            if (z2) {
                if (z2 && (windowManager = c1360u1.f6381c) != null && (view = c1360u1.f6382d) != null) {
                    try {
                        windowManager.removeView(view);
                    } catch (Exception unused) {
                    }
                    c1360u1.f6382d = null;
                    c1360u1.f6383e = false;
                }
                C1310e c1310e = C1310e.f6084h;
                if (c1310e != null) {
                    c1310e.m3162a();
                    return;
                }
                return;
            }
            return;
        }
        final C1360u1 c1360u12 = this.f2358f;
        boolean z3 = c1360u12.f6383e;
        if (z3) {
            c1360u12.m3256c();
            return;
        }
        if (z3) {
            c1360u12.m3256c();
            c1360u12.m3260h(true);
            c1360u12.m3255b();
            return;
        }
        cfgData cfgdata = c1360u12.f6380b;
        Context context = c1360u12.f6379a;
        cfgdata.m1791k(context, false);
        c1360u12.f6381c = (WindowManager) context.getSystemService("window");
        View inflate = LayoutInflater.from(new ContextThemeWrapper(context, R.style.Theme_T500_Split)).inflate(R.layout.activity_top, (ViewGroup) null);
        c1360u12.f6382d = inflate;
        View findViewById = inflate.findViewById(R.id.main);
        if (cfgdata.f2704v0) {
            findViewById.setLayoutDirection(1);
        }
        c1360u12.f6384f = (Button) c1360u12.f6382d.findViewById(R.id.but_IP_Navi);
        c1360u12.f6385g = (Button) c1360u12.f6382d.findViewById(R.id.butLF);
        c1360u12.f6386h = (Button) c1360u12.f6382d.findViewById(R.id.butRF);
        c1360u12.f6387i = (Button) c1360u12.f6382d.findViewById(R.id.butPS1);
        c1360u12.f6388j = (Button) c1360u12.f6382d.findViewById(R.id.butPS2);
        c1360u12.f6389k = (Button) c1360u12.f6382d.findViewById(R.id.butPS3);
        c1360u12.f6390l = (Button) c1360u12.f6382d.findViewById(R.id.butPS4);
        c1360u12.f6391m = (Button) c1360u12.f6382d.findViewById(R.id.butPS5);
        c1360u12.f6392n = (Button) c1360u12.f6382d.findViewById(R.id.butPS6);
        c1360u12.f6393o = (Button) c1360u12.f6382d.findViewById(R.id.butPS7);
        c1360u12.f6394p = (Button) c1360u12.f6382d.findViewById(R.id.butSwap);
        c1360u12.f6395q = (Button) c1360u12.f6382d.findViewById(R.id.butCFG);
        c1360u12.f6396r = (Button) c1360u12.f6382d.findViewById(R.id.butApps);
        c1360u12.m3254a();
        final int i = 0;
        c1360u12.f6396r.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i2 = 7;
        c1360u12.f6395q.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i3 = 8;
        c1360u12.f6394p.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i4 = 9;
        c1360u12.f6385g.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i5 = 10;
        c1360u12.f6386h.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i6 = 11;
        c1360u12.f6387i.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i7 = 12;
        c1360u12.f6388j.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i8 = 1;
        c1360u12.f6389k.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i9 = 2;
        c1360u12.f6390l.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i10 = 3;
        c1360u12.f6391m.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i11 = 4;
        c1360u12.f6392n.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i12 = 5;
        c1360u12.f6393o.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        final int i13 = 6;
        c1360u12.f6384f.setOnClickListener(new View.OnClickListener() { // from class: q0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        C1310e.m3161d(c1360u12.f6379a);
                        break;
                    case 1:
                        C1360u1 c1360u13 = c1360u12;
                        c1360u13.m3258e(3, c1360u13.f6389k);
                        break;
                    case 2:
                        C1360u1 c1360u14 = c1360u12;
                        c1360u14.m3258e(4, c1360u14.f6390l);
                        break;
                    case 3:
                        C1360u1 c1360u15 = c1360u12;
                        c1360u15.m3258e(5, c1360u15.f6391m);
                        break;
                    case 4:
                        C1360u1 c1360u16 = c1360u12;
                        c1360u16.m3258e(6, c1360u16.f6392n);
                        break;
                    case 5:
                        C1360u1 c1360u17 = c1360u12;
                        c1360u17.m3258e(7, c1360u17.f6393o);
                        break;
                    case 6:
                        C1360u1 c1360u18 = c1360u12;
                        c1360u18.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        AbstractC1372y1.m3296b();
                        cfgData cfgdata2 = c1360u18.f6380b;
                        boolean z4 = cfgdata2.f2553O2;
                        cfgdata2.f2553O2 = !z4;
                        if (!z4 && AbstractC1539g1.m4193O(cfgdata2.f2620e1)) {
                            cfgdata2.f2635h1 = 0;
                        }
                        cfgdata2.m1795o(c1360u18.f6379a);
                        c1360u18.m3257d();
                        break;
                    case 7:
                        C1360u1 c1360u19 = c1360u12;
                        c1360u19.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        c1360u19.m3259g(CFG4.class);
                        break;
                    case 8:
                        C1360u1 c1360u110 = c1360u12;
                        cfgData cfgdata3 = c1360u110.f6380b;
                        cfgdata3.f2687r3 = !cfgdata3.f2687r3;
                        c1360u110.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgdata3.m1795o(c1360u110.f6379a);
                        c1360u110.m3257d();
                        break;
                    case Platform.GNU /* 9 */:
                        C1360u1 c1360u111 = c1360u12;
                        c1360u111.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata4 = c1360u111.f6380b;
                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                        cfgdata4.f2697t3 = false;
                        cfgdata4.m1795o(c1360u111.f6379a);
                        c1360u111.m3257d();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1360u1 c1360u112 = c1360u12;
                        c1360u112.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
                        cfgData cfgdata5 = c1360u112.f6380b;
                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                        cfgdata5.f2692s3 = false;
                        cfgdata5.m1795o(c1360u112.f6379a);
                        c1360u112.m3257d();
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1360u1 c1360u113 = c1360u12;
                        c1360u113.m3258e(1, c1360u113.f6387i);
                        break;
                    default:
                        C1360u1 c1360u114 = c1360u12;
                        c1360u114.m3258e(2, c1360u114.f6388j);
                        break;
                }
            }
        });
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(cfgdata.f2515F0 - cfgdata.f2510E0, cfgdata.m1792l(), 2038, 776, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = cfgdata.f2510E0 - AbstractC1256E0.m2990E(cfgdata);
        layoutParams.y = cfgdata.f2505D0;
        c1360u12.f6381c.addView(c1360u12.f6382d, layoutParams);
        c1360u12.f6383e = true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f2357r = this;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        WindowManager windowManager;
        View view;
        AbstractC1368x0.m3269c(this);
        if (this.f2367o != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f2367o);
            } catch (Exception unused) {
            }
            this.f2367o = null;
        }
        boolean z2 = false;
        this.f2360h = false;
        Handler handler = this.f2359g;
        handler.removeCallbacks(this.f2368p);
        handler.removeCallbacks(this.f2369q);
        this.f2364l = 0L;
        C1310e c1310e = C1310e.f6084h;
        if (c1310e != null) {
            c1310e.m3162a();
        }
        C1360u1 c1360u1 = this.f2358f;
        if (c1360u1 != null) {
            if (c1360u1.f6383e && (windowManager = c1360u1.f6381c) != null && (view = c1360u1.f6382d) != null) {
                try {
                    windowManager.removeView(view);
                } catch (Exception unused2) {
                }
                c1360u1.f6382d = null;
                c1360u1.f6383e = false;
            }
            this.f2358f = null;
        }
        C0454l m1162a = C0454l.m1162a(this);
        ((Handler) m1162a.f1453c).post(new RunnableC0029w(m1162a, z2, 5));
        C1324i1.m3194y(false);
        if (f2357r == this) {
            f2357r = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (cfgData.m1784i().f2549N2) {
            stopSelf();
            return 2;
        }
        if (this.f2358f == null) {
            this.f2358f = new C1360u1(getApplicationContext());
        }
        m1707d();
        m1706b();
        Handler handler = this.f2359g;
        RunnableC1363v1 runnableC1363v1 = this.f2369q;
        handler.removeCallbacks(runnableC1363v1);
        cfgData m1784i = cfgData.m1784i();
        if (m1784i.f2545M2 || m1784i.f2549N2) {
            this.f2364l = 0L;
        } else {
            this.f2364l = SystemClock.uptimeMillis() + 10000;
            handler.postDelayed(runnableC1363v1, 10000L);
        }
        if (!this.f2360h) {
            this.f2360h = true;
            RunnableC0020n runnableC0020n = this.f2368p;
            handler.removeCallbacks(runnableC0020n);
            handler.post(runnableC0020n);
        }
        if (this.f2367o == null) {
            this.f2367o = new C1366w1(this, handler);
            try {
                getContentResolver().registerContentObserver(Settings.System.getUriFor("gwm_hvac_panel_status"), false, this.f2367o);
                getContentResolver().registerContentObserver(Settings.Global.getUriFor("gwm_hvac_panel_states"), false, this.f2367o);
            } catch (Exception unused) {
            }
        }
        AbstractC1368x0.m3268b(this);
        return 1;
    }
}
