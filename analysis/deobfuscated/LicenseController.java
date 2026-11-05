package deobfuscated.license;

import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.network.ApiResponse;
import com.altaysoft.t500_split.network.C0654a;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Реконструкция p098q0.C1344p0 (LicenseController).
 *
 * Роль:
 *  - хранит DeviceMeta (VIN, model, version, partner, ...);
 *  - создаёт LicenseApiClient;
 *  - выполняет проверку обновления (m1928a) в фоне;
 *  - принимает результат телеметрии/лицензии (m1931d).
 */
public final class LicenseController {

    public static LicenseController instance;          // f6319i
    public static DeviceMeta deviceMeta;               // f6318h

    public final LicenseApiClient api;                 // f6320a
    public final LiveData<ApiResponse> updateStatus;   // f6321b
    public final LiveData<ApiResponse> licenseStatus;  // f6322c
    public final LiveData<Integer> downloadProgress;   // f6323d

    private final ExecutorService executor = Executors.newFixedThreadPool(2); // f6326g
    private volatile boolean downloadInProgress = false;                      // f6325f

    public LicenseController(android.content.Context context) {
        try {
            api = new LicenseApiClient();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        DeviceMeta meta = new DeviceMeta();
        cfgData cfg = cfgData.m1784i();
        cfg.m1791k(context, false);

        meta.navApp      = cfg.f2548N1;
        meta.musicApp    = cfg.f2544M1;
        meta.useIP       = cfg.f2537K2;
        meta.useHUT      = cfg.f2545M2;
        meta.autoStart   = cfg.f2646j2;
        meta.useLauncher = cfg.f2672o3;
        meta.partnerId   = cfg.f2605b1;
        meta.ipThemeId   = cfg.f2620e1;
        meta.model       = cfg.f2543M0.f7143b;

        try {
            meta.version = (int) context.getPackageManager()
                    .getPackageInfo(context.getPackageName(), 0)
                    .getLongVersionCode();
        } catch (Throwable ignored) {}

        try {
            meta.vin = readProp("persist.gwm.vehicle.vin");
        } catch (Throwable t) {
            meta.vin = "UNKNOWN";
        }
        meta.encryptedVin = obfuscateVin(meta.vin);

        deviceMeta = meta;
        instance = this;
    }

    /**
     * m3241a: поставить проверку в очередь.
     * Если noUpdateCheck=false — создаётся отдельный поток,
     * внутри которого вызывается update (m1928a).
     */
    public void enqueueUpdateCheck(Runnable onDone) {
        if (cfgData.m1784i().f2559Q0) { // noUpdateCheck
            // без сети/проверки: просто уведомить UI
            MainThread.post(onDone);
            return;
        }
        new Thread(() -> {
            android.os.Looper.prepare();
            try {
                updateStatus.postValue(api.checkUpdate(deviceMeta));
            } catch (Exception ignored) {
            }
            MainThread.post(onDone);
        }).start();
    }

    /** Фоновые задачи: 0 = телеметрия/лицензия, 1 = скачивание обновления. */
    public void execute(int task) {
        executor.execute(() -> {
            switch (task) {
                case 0:
                    try {
                        licenseStatus.postValue(api.syncTelemetryAndLicense(deviceMeta));
                    } catch (Exception ignored) {
                    }
                    break;
                case 1:
                    android.os.Looper.prepare();
                    try {
                        String path = api.downloadUpdate(deviceMeta);
                        if (path != null && !path.equals(cfgData.m1784i().f2586X)) {
                            MainThread.post(() -> installApk(path));
                        }
                    } finally {
                        downloadInProgress = false;
                    }
                    break;
            }
        });
    }

    private static String readProp(String name) throws Exception {
        java.io.BufferedReader r = new java.io.BufferedReader(
                new java.io.InputStreamReader(
                        Runtime.getRuntime().exec("getprop " + name).getInputStream()));
        String line = r.readLine();
        r.close();
        return line;
    }

    /** Заглушка: в оригинале AbstractC1372y1.m3279J(VIN). */
    private static String obfuscateVin(String vin) { return vin; }

    private void installApk(String path) { /* FileProvider + ACTION_VIEW */ }

    private static final class MainThread {
        static void post(Runnable r) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(r);
        }
    }

    /** p098q0.C1341o0 */
    public static final class DeviceMeta {
        public String encryptedVin; // f6302a
        public int model;           // f6303b
        public int version;         // f6304c
        public String navApp;       // f6305d
        public String musicApp;     // f6306e
        public boolean useHUT;      // f6307f
        public boolean useIP;       // f6308g
        public boolean autoStart;   // f6309h
        public boolean useLauncher; // f6310i
        public int partnerId;       // f6311j
        public int ipThemeId;       // f6312k
        public String vin;          // f6313l
    }

    /** androidx.lifecycle.C0560y в оригинале. */
    public static final class LiveData<T> {
        private T value;
        public T getValue() { return value; }
        public void postValue(T v) { value = v; }
    }
}
