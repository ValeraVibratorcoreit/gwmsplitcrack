package p070g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import p010D1.AbstractC0088l;
import p022K.C0198k;
import p046X.AbstractC0408g;

/* renamed from: g.w */
/* loaded from: classes.dex */
public final class C0884w extends AbstractC0408g {

    /* renamed from: c */
    public final /* synthetic */ int f4393c = 1;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0887z f4394d;

    /* renamed from: e */
    public final Object f4395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0884w(LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z, C0198k c0198k) {
        super(layoutInflaterFactory2C0887z);
        this.f4394d = layoutInflaterFactory2C0887z;
        this.f4395e = c0198k;
    }

    @Override // p046X.AbstractC0408g
    /* renamed from: e */
    public final IntentFilter mo1086e() {
        switch (this.f4393c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // p046X.AbstractC0408g
    /* renamed from: f */
    public final int mo1087f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f4393c) {
            case 0:
                return AbstractC0880s.m2426a((PowerManager) this.f4395e) ? 2 : 1;
            default:
                C0198k c0198k = (C0198k) this.f4395e;
                C0858G c0858g = (C0858G) c0198k.f535d;
                if (c0858g.f4284b > System.currentTimeMillis()) {
                    z2 = c0858g.f4283a;
                } else {
                    Context context = (Context) c0198k.f533b;
                    int m275o = AbstractC0088l.m275o(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0198k.f534c;
                    if (m275o == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0088l.m275o(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0857F.f4279d == null) {
                            C0857F.f4279d = new C0857F();
                        }
                        C0857F c0857f = C0857F.f4279d;
                        c0857f.m2375a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0857f.m2375a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0857f.f4282c == 1;
                        long j3 = c0857f.f4281b;
                        long j4 = c0857f.f4280a;
                        c0857f.m2375a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0857f.f4281b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0858g.f4283a = z2;
                        c0858g.f4284b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // p046X.AbstractC0408g
    /* renamed from: i */
    public final void mo1090i() {
        switch (this.f4393c) {
            case 0:
                this.f4394d.m2449l(true, true);
                break;
            default:
                this.f4394d.m2449l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0884w(LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z, Context context) {
        super(layoutInflaterFactory2C0887z);
        this.f4394d = layoutInflaterFactory2C0887z;
        this.f4395e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
