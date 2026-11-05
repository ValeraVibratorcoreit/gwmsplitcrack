package p098q0;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.provider.Settings;
import android.util.Log;
import com.altaysoft.t500_split.InternetMonitoringService;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.altaysoft.t500_split.media.MediaInfoService;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.RunnableC0005B;
import p001A0.RunnableC0018l;
import p010D1.AbstractC0088l;
import p106t0.EnumC1455a;
import p106t0.EnumC1457c;
import p109u0.AbstractC1539g1;
import p109u0.AbstractC1569q1;
import p112v0.EnumC1609b;
import p121y0.C1683k;

/* renamed from: q0.h0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1320h0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6142a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f6143b;

    public /* synthetic */ RunnableC1320h0(MainActivity mainActivity, int i) {
        this.f6142a = i;
        this.f6143b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String str;
        EnumC1457c enumC1457c;
        switch (this.f6142a) {
            case 0:
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                MainActivity mainActivity = this.f6143b;
                mainActivity.getClass();
                AbstractC1539g1.m4226k0(mainActivity);
                return;
            case 1:
                AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                MainActivity mainActivity2 = this.f6143b;
                mainActivity2.getClass();
                AbstractC1539g1.m4226k0(mainActivity2);
                return;
            case 2:
                AtomicBoolean atomicBoolean3 = MainActivity.f2306M;
                MainActivity mainActivity3 = this.f6143b;
                mainActivity3.m1688v();
                boolean z2 = mainActivity3.f2314J;
                cfgData cfgdata = mainActivity3.f2309E;
                if (z2) {
                    cfgdata.m1791k(mainActivity3, false);
                    AbstractC1569q1.m4468t(mainActivity3, cfgdata);
                    String str2 = (String) AbstractC1569q1.f8669d.getAndSet(null);
                    if (str2 != null) {
                        AbstractC1569q1.m4464p(mainActivity3, str2);
                    }
                    mainActivity3.m1680B();
                    return;
                }
                if (mainActivity3.f2312H) {
                    Intent intent = new Intent(mainActivity3, (Class<?>) CFG4.class);
                    intent.addFlags(402722816);
                    mainActivity3.startActivity(intent, ActivityOptions.makeBasic().toBundle());
                    mainActivity3.finish();
                    return;
                }
                String str3 = cfgdata.f2663n;
                carData cardata = AbstractC1372y1.f6431a;
                try {
                    i = mainActivity3.getPackageManager().getPackageInfo(str3, 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = -999;
                }
                if (i < 5260707) {
                    mainActivity3.m1684G();
                    return;
                }
                boolean z3 = mainActivity3.f2311G || mainActivity3.f2313I;
                if (!mainActivity3.f2315K || z3) {
                    mainActivity3.f2315K = true;
                    boolean z4 = cfgdata.f2645j1;
                    if (z4) {
                        try {
                            String m3312r = AbstractC1372y1.m3312r("ro.software.version");
                            if (m3312r != null && !m3312r.isEmpty()) {
                                String trim = m3312r.trim();
                                cfgdata.f2650k1 = trim;
                                cfgdata.f2655l1 = AbstractC1372y1.m3318x(trim);
                                cfgdata.m1795o(mainActivity3);
                            }
                        } catch (IOException e2) {
                            Log.w("MainActivity", "ro.software.version read failed", e2);
                        }
                        new C1344p0(mainActivity3);
                        if (cfgdata.f2539L0 == 0) {
                            try {
                                str = AbstractC1372y1.m3312r("persist.gwm.vehicle.vin");
                            } catch (Throwable unused2) {
                                str = "UNKNOWN";
                            }
                            EnumC1457c enumC1457c2 = EnumC1457c.NOT_SET;
                            try {
                                if (AbstractC1372y1.m3312r("persist.vendor.gwm.cfg.project.code").equals("203")) {
                                    enumC1457c = EnumC1457c.H3;
                                } else {
                                    if (!str.contains("BAD_VIN") && !str.contains("UNKNOWN")) {
                                        String substring = str.substring(5, 7);
                                        String substring2 = str.substring(9, 11);
                                        EnumC1457c[] values = EnumC1457c.values();
                                        int length = values.length;
                                        int i2 = 0;
                                        while (i2 < length) {
                                            EnumC1457c enumC1457c3 = values[i2];
                                            String[] split = enumC1457c3.f7144c.split(",");
                                            String[] split2 = enumC1457c3.f7145d.split(",");
                                            int length2 = split.length;
                                            int i3 = 0;
                                            while (i3 < length2) {
                                                int i4 = length2;
                                                String str4 = split[i3];
                                                EnumC1457c enumC1457c4 = enumC1457c2;
                                                int length3 = split2.length;
                                                EnumC1457c[] enumC1457cArr = values;
                                                int i5 = 0;
                                                while (i5 < length3) {
                                                    int i6 = length3;
                                                    String str5 = split2[i5];
                                                    if (substring.equals(str4) && substring2.equals(str5)) {
                                                        enumC1457c = (enumC1457c3 != EnumC1457c.F7 || AbstractC1372y1.f6432b.f2495B0 >= 721) ? enumC1457c3 : EnumC1457c.F7_Elite;
                                                    } else {
                                                        i5++;
                                                        length3 = i6;
                                                    }
                                                }
                                                i3++;
                                                length2 = i4;
                                                enumC1457c2 = enumC1457c4;
                                                values = enumC1457cArr;
                                            }
                                            i2++;
                                            enumC1457c2 = enumC1457c2;
                                        }
                                    }
                                    enumC1457c = enumC1457c2;
                                }
                                cfgdata.f2543M0 = enumC1457c;
                                cfgdata.f2539L0 = enumC1457c.f7142a;
                                cfgdata.m1795o(mainActivity3);
                            } catch (IOException e3) {
                                throw new RuntimeException(e3);
                            }
                        }
                        NativeLib.initCfgData(cfgdata);
                        NativeLib.initCarData(mainActivity3.f2310F);
                        NativeLib.nativeInitStrings(mainActivity3);
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
                    }
                    mainActivity3.m1690x();
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "GWMSplit_Styles");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File[] listFiles = file.listFiles(new C1335m0());
                    cfgdata.f2603b = new String[150];
                    cfgdata.f2608c = 0;
                    for (int i7 = 0; i7 < listFiles.length && i7 < 150; i7++) {
                        cfgdata.f2608c++;
                        cfgdata.f2603b[i7] = listFiles[i7].getName();
                    }
                    Arrays.sort(cfgdata.f2603b, 0, Math.min(listFiles.length, 150));
                    if (cfgdata.f2630g1 > cfgdata.f2608c + 30) {
                        cfgdata.f2630g1 = 0;
                        cfgdata.f2625f1 = EnumC1455a.f6949f;
                        cfgdata.m1795o(mainActivity3);
                    }
                    if (cfgdata.f2563R0 && Settings.System.canWrite(mainActivity3)) {
                        carData cardata2 = AbstractC1372y1.f6431a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) mainActivity3.getSystemService("connectivity");
                        try {
                            connectivityManager.getClass().getDeclaredMethod("stopTethering", Integer.TYPE).invoke(connectivityManager, 0);
                        } catch (Exception unused3) {
                        }
                    }
                    String str6 = (String) AbstractC1569q1.f8669d.getAndSet(null);
                    if (str6 != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0018l(mainActivity3, 14, str6));
                    }
                    boolean m3283N = AbstractC1372y1.m3283N(mainActivity3, "com.gwm.club.tboxoff");
                    cfgdata.f2660m1 = m3283N;
                    if (m3283N) {
                        cfgdata.f2584W1 = false;
                    }
                    if (cfgdata.f2543M0 == EnumC1457c.NOT_SET) {
                        mainActivity3.m1683F(mainActivity3.getString(R.string.model_not_set));
                    }
                    if (cfgdata.f2645j1) {
                        NativeLib.nativeSetContext(mainActivity3);
                        NativeLib.nativeInitReader(carData.getInstance());
                        NativeLib.nativeBindView(carData.getInstance());
                        Intent intent2 = new Intent(mainActivity3, (Class<?>) InternetMonitoringService.class);
                        intent2.setAction("ACTION_START_OR_RESUME_SERVICE");
                        mainActivity3.startService(intent2);
                    }
                    AbstractC1319h.m3189e(mainActivity3);
                    boolean m261T = AbstractC0088l.m261T(mainActivity3, EnumC1609b.NOTIFICATION_ACCESS);
                    if (cfgdata.f2585W2 || cfgdata.f2597Z2 || m261T) {
                        MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                        mainActivity3.startService(new Intent(mainActivity3, (Class<?>) MediaInfoService.class));
                    } else {
                        MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                        mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) MediaInfoService.class));
                    }
                    RunnableC1317g0 runnableC1317g0 = new RunnableC1317g0(mainActivity3, z3, 0);
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new RunnableC0005B(mainActivity3, runnableC1317g0, handler, 6));
                    C1683k.m4893o(mainActivity3.getApplicationContext());
                    new Handler(Looper.getMainLooper()).post(new RunnableC1317g0(mainActivity3, z4, 1));
                    return;
                }
                return;
            case 3:
                AtomicBoolean atomicBoolean4 = MainActivity.f2306M;
                MainActivity mainActivity4 = this.f6143b;
                if (mainActivity4.isFinishing()) {
                    return;
                }
                mainActivity4.finish();
                return;
            default:
                AtomicBoolean atomicBoolean5 = MainActivity.f2306M;
                MainActivity mainActivity5 = this.f6143b;
                mainActivity5.getClass();
                if (MainActivity.f2306M.getAndSet(false)) {
                    MainActivity.m1676C(mainActivity5.getApplicationContext(), true);
                    return;
                }
                return;
        }
    }
}
