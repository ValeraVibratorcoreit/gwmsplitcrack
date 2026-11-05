package com.altaysoft.t500_split;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.IBinder;
import android.view.Display;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.RunnableC0024r;
import p016H.C0112d;
import p098q0.C1279Q;

/* loaded from: classes.dex */
public class IPOverlayService extends Service {

    /* renamed from: g */
    public static C1279Q f2293g;

    /* renamed from: h */
    public static boolean f2294h;

    /* renamed from: f */
    public C1279Q f2295f;

    /* renamed from: a */
    public static void m1667a() {
        FrameLayout frameLayout;
        C1279Q c1279q = f2293g;
        if (c1279q == null || !c1279q.f5935l || c1279q.f5932i == null || (frameLayout = c1279q.f5929f) == null) {
            return;
        }
        if (c1279q.f5936m == null && frameLayout != null) {
            c1279q.f5936m = new C0112d(frameLayout);
        }
        c1279q.f5936m.m351b();
        c1279q.f5936m.m362m();
        C0112d c0112d = c1279q.f5936m;
        Objects.requireNonNull(c0112d);
        RunnableC0024r runnableC0024r = new RunnableC0024r(18, c0112d);
        c0112d.m351b();
        c0112d.f354f = runnableC0024r;
        ((FrameLayout) c0112d.f350b).postDelayed(runnableC0024r, 12000L);
    }

    /* renamed from: b */
    public static void m1668b(Context context) {
        C1279Q c1279q = f2293g;
        if (c1279q == null || !c1279q.f5935l) {
            m1669c(context);
            return;
        }
        c1279q.m3097e();
        if (f2294h) {
            c1279q.m3098f(true);
        }
    }

    /* renamed from: c */
    public static void m1669c(Context context) {
        cfgData.m1784i();
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        context.startService(new Intent(context, (Class<?>) IPOverlayService.class));
    }

    /* renamed from: d */
    public static void m1670d(Context context, boolean z2) {
        f2294h = z2;
        C1279Q c1279q = f2293g;
        if (z2) {
            if (c1279q == null || !c1279q.f5935l) {
                return;
            }
            c1279q.m3098f(true);
            return;
        }
        if (c1279q != null && c1279q.f5935l) {
            try {
                c1279q.m3097e();
            } catch (Exception unused) {
            }
            c1279q.m3098f(false);
        } else if (context != null) {
            m1669c(context.getApplicationContext());
        }
    }

    /* renamed from: e */
    public final void m1671e() {
        C1279Q c1279q = this.f2295f;
        if (c1279q != null) {
            if (f2293g == c1279q) {
                f2293g = null;
            }
            try {
                c1279q.m3093a();
            } catch (Exception unused) {
            }
            this.f2295f = null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m1671e();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        DisplayManager displayManager = (DisplayManager) getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(2) : null;
        if (display == null) {
            stopSelf();
            return 2;
        }
        C1279Q c1279q = this.f2295f;
        if (c1279q != null && c1279q.f5935l) {
            f2293g = c1279q;
            if (f2294h) {
                c1279q.m3098f(true);
            } else {
                c1279q.m3097e();
            }
            return 2;
        }
        C1279Q c1279q2 = f2293g;
        if (c1279q2 != null && c1279q2.f5935l) {
            this.f2295f = c1279q2;
            if (f2294h) {
                c1279q2.m3098f(true);
            } else {
                c1279q2.m3097e();
            }
            stopSelf();
            return 2;
        }
        m1671e();
        try {
            C1279Q c1279q3 = new C1279Q(getApplicationContext(), display);
            this.f2295f = c1279q3;
            c1279q3.m3099g();
            C1279Q c1279q4 = this.f2295f;
            f2293g = c1279q4;
            if (f2294h) {
                c1279q4.m3098f(true);
            }
        } catch (Exception unused) {
            m1671e();
            stopSelf();
        }
        return 2;
    }
}
