package com.altaysoft.t500_split;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.IBinder;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.InternetMonitoringService;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.network.ApiResponse;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p001A0.RunnableC0024r;
import p098q0.C1282S;
import p098q0.C1344p0;

/* loaded from: classes.dex */
public class InternetMonitoringService extends Service {

    /* renamed from: l */
    public static final /* synthetic */ int f2296l = 0;

    /* renamed from: f */
    public final carData f2297f = carData.getInstance();

    /* renamed from: g */
    public final cfgData f2298g = cfgData.m1784i();

    /* renamed from: h */
    public boolean f2299h = false;

    /* renamed from: i */
    public ScheduledExecutorService f2300i;

    /* renamed from: j */
    public C1282S f2301j;

    /* renamed from: k */
    public C1282S f2302k;

    /* renamed from: a */
    public final void m1672a() {
        carData cardata = carData.getInstance();
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                        z2 = true;
                        z4 = true;
                    } else {
                        z2 = true;
                    }
                }
                if (networkCapabilities.hasTransport(3)) {
                    if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                        z3 = true;
                    }
                }
            }
        }
        cardata.setWifi(z2);
        cardata.setTraffic_leak(z3);
        cardata.setInet(z4);
    }

    /* renamed from: b */
    public final void m1673b() {
        SharedPreferences.Editor edit = getSharedPreferences("T500_SPLIT_AS", 0).edit();
        cfgData cfgdata = this.f2298g;
        edit.putLong("laststattime", cfgdata.f2665n1);
        edit.putLong("laststattimeR", cfgdata.f2670o1);
        edit.apply();
    }

    /* renamed from: c */
    public final void m1674c() {
        this.f2299h = false;
        ScheduledExecutorService scheduledExecutorService = this.f2300i;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f2300i = null;
        }
        C1282S c1282s = this.f2301j;
        if (c1282s != null) {
            C1344p0.f6319i.f6321b.m1399h(c1282s);
            this.f2301j = null;
        }
        C1282S c1282s2 = this.f2302k;
        if (c1282s2 != null) {
            C1344p0.f6319i.f6322c.m1399h(c1282s2);
            this.f2302k = null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m1674c();
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [q0.S] */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.lifecycle.z, q0.S] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        final int i3 = 1;
        if (intent != null) {
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("ACTION_STOP_SERVICE")) {
                if (action.equals("ACTION_START_OR_RESUME_SERVICE") && !this.f2299h) {
                    this.f2299h = true;
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.f2300i = newSingleThreadScheduledExecutor;
                    newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new RunnableC0024r(19, this), 0L, 30000L, TimeUnit.MILLISECONDS);
                    final int i4 = 0;
                    ?? r8 = new InterfaceC0561z(this) { // from class: q0.S

                        /* renamed from: b */
                        public final /* synthetic */ InternetMonitoringService f5946b;

                        {
                            this.f5946b = this;
                        }

                        @Override // androidx.lifecycle.InterfaceC0561z
                        /* renamed from: a */
                        public final void mo1100a(Object obj) {
                            InternetMonitoringService internetMonitoringService = this.f5946b;
                            ApiResponse apiResponse = (ApiResponse) obj;
                            switch (i4) {
                                case 0:
                                    int i5 = InternetMonitoringService.f2296l;
                                    internetMonitoringService.getClass();
                                    if (apiResponse != null) {
                                        internetMonitoringService.f2297f.f2468q.m1398g(Boolean.valueOf(!apiResponse.actual));
                                        break;
                                    }
                                    break;
                                default:
                                    int i6 = InternetMonitoringService.f2296l;
                                    internetMonitoringService.getClass();
                                    if (apiResponse != null) {
                                        int i7 = apiResponse.user.f3071a;
                                        cfgData cfgdata = internetMonitoringService.f2298g;
                                        cfgdata.f2610c1 = i7;
                                        cfgdata.f2513E3 = AbstractC1372y1.m3311q(i7);
                                        int i8 = apiResponse.user.f3073c;
                                        cfgdata.f2605b1 = i8;
                                        cfgdata.f2508D3 = AbstractC1372y1.m3310p(i8);
                                        ApiResponse.C0652b c0652b = apiResponse.user;
                                        if (c0652b.f3071a < 1) {
                                            cfgdata.f2640i1 = c0652b.f3072b;
                                        } else {
                                            cfgdata.f2640i1 = 0;
                                        }
                                        cfgdata.f2670o1 = System.currentTimeMillis();
                                        cfgdata.m1785a();
                                        cfgdata.m1795o(internetMonitoringService);
                                        AbstractC1294Y.m3149a(internetMonitoringService);
                                        C1344p0.f6319i.m3241a(null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    this.f2301j = r8;
                    this.f2302k = new InterfaceC0561z(this) { // from class: q0.S

                        /* renamed from: b */
                        public final /* synthetic */ InternetMonitoringService f5946b;

                        {
                            this.f5946b = this;
                        }

                        @Override // androidx.lifecycle.InterfaceC0561z
                        /* renamed from: a */
                        public final void mo1100a(Object obj) {
                            InternetMonitoringService internetMonitoringService = this.f5946b;
                            ApiResponse apiResponse = (ApiResponse) obj;
                            switch (i3) {
                                case 0:
                                    int i5 = InternetMonitoringService.f2296l;
                                    internetMonitoringService.getClass();
                                    if (apiResponse != null) {
                                        internetMonitoringService.f2297f.f2468q.m1398g(Boolean.valueOf(!apiResponse.actual));
                                        break;
                                    }
                                    break;
                                default:
                                    int i6 = InternetMonitoringService.f2296l;
                                    internetMonitoringService.getClass();
                                    if (apiResponse != null) {
                                        int i7 = apiResponse.user.f3071a;
                                        cfgData cfgdata = internetMonitoringService.f2298g;
                                        cfgdata.f2610c1 = i7;
                                        cfgdata.f2513E3 = AbstractC1372y1.m3311q(i7);
                                        int i8 = apiResponse.user.f3073c;
                                        cfgdata.f2605b1 = i8;
                                        cfgdata.f2508D3 = AbstractC1372y1.m3310p(i8);
                                        ApiResponse.C0652b c0652b = apiResponse.user;
                                        if (c0652b.f3071a < 1) {
                                            cfgdata.f2640i1 = c0652b.f3072b;
                                        } else {
                                            cfgdata.f2640i1 = 0;
                                        }
                                        cfgdata.f2670o1 = System.currentTimeMillis();
                                        cfgdata.m1785a();
                                        cfgdata.m1795o(internetMonitoringService);
                                        AbstractC1294Y.m3149a(internetMonitoringService);
                                        C1344p0.f6319i.m3241a(null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    C1344p0.f6319i.f6321b.m1397f(r8);
                    C1344p0.f6319i.f6322c.m1397f(this.f2302k);
                }
                return 1;
            }
            m1674c();
            stopSelf();
        }
        return 1;
    }
}
