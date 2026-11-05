package deobfuscated.license;

import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.network.ApiResponse;

/**
 * Реконструкция com.altaysoft.t500_split.InternetMonitoringService
 * и задачи RunnableC0024r case 19.
 *
 * Сервис стартует из MainActivity после инициализации UI:
 *   ACTION_START_OR_RESUME_SERVICE
 *
 * Внутри:
 *   scheduleWithFixedDelay(periodicTask, 0, 30_000, MILLISECONDS)
 */
public final class BackgroundMonitorService {

    private static final long STATS_THROTTLE_MS = 180_000L;      // 3 минуты
    private static final long LICENSE_SYNC_INTERVAL_MS = 10_800_000L; // 3 часа
    private static final long DEMO_OFFLINE_EXPIRE_MS = 86_400_000L;    // 1 сутки * >2

    private final cfgData cfg = cfgData.m1784i();
    private final LicenseController controller = LicenseController.instance;

    /** RunnableC0024r case 19, выполняется каждые 30 секунд. */
    public void periodicTask() {
        long now = System.currentTimeMillis();

        // Защита от перевода часов назад.
        if (cfg.f2665n1 > now || cfg.f2670o1 > now) {
            cfg.f2665n1 = now;
            cfg.f2670o1 = now;
            persistTimers();
        }

        updateConnectivity(); // m1672a

        // Телеметрия/лицензия: не чаще 3 минут и не реже 3 часов.
        if ((carData.isInternet() || carData.isTrafficLeak()) // m1763n() || m1713A()
                && now - cfg.f2665n1 >= STATS_THROTTLE_MS
                && now - cfg.f2670o1 >= LICENSE_SYNC_INTERVAL_MS) {
            controller.execute(0); // -> m1931d
            cfg.f2665n1 = now;
            persistTimers();
        }

        // Локальное «истечение демо»: DEMO + нет успешной синхронизации > 2 суток.
        if (cfg.f2513E3 == LicenseState.MODE_DEMO
                && (now - cfg.f2670o1) / DEMO_OFFLINE_EXPIRE_MS > 2) {

            int oldPreset = cfg.f2540L1;
            cfg.f2610c1 = 1;                         // paylevelid = FREE
            cfg.f2513E3 = LicenseState.MODE_FREE;    // licenseMode = FREE
            cfg.m1785a();
            cfg.m1795o(thisServiceContext());
            notifyLicenseChanged();

            if (oldPreset > 2) {
                prefs().edit().putInt("presetnum", 1).apply();
                cfg.m1791k(thisServiceContext(), false);
                cfg.m1795o(thisServiceContext());
            }
        }
    }

    /**
     * Observer f6322c (результат m1931d).
     * Именно здесь применяется demo/free/full.
     */
    public void onLicenseResponse(ApiResponse response) {
        if (response == null) return;

        int licence = response.user.f3071a;   // user.licence
        cfg.f2610c1 = licence;
        cfg.f2513E3 = LicenseState.modeFromPayLevel(licence);
        cfg.f2605b1 = response.user.f3073c;   // user.partner
        cfg.f2508D3 = partnerCodeFromId(cfg.f2605b1);

        if (response.user.f3071a < 1) {
            cfg.f2640i1 = response.user.f3072b; // user.demoRemain
        } else {
            cfg.f2640i1 = 0;
        }

        cfg.f2670o1 = System.currentTimeMillis(); // last successful license sync
        cfg.m1785a();
        cfg.m1795o(thisServiceContext());
        notifyLicenseChanged();
        controller.enqueueUpdateCheck(null);
    }

    /** Observer f6321b — только наличие обновления, лицензию не меняет. */
    public void onUpdateResponse(ApiResponse response) {
        if (response != null) {
            carData.setUpdateAvailable(!response.actual);
        }
    }

    private void persistTimers() {
        prefs().edit()
                .putLong("laststattime", cfg.f2665n1)
                .putLong("laststattimeR", cfg.f2670o1)
                .apply();
    }

    private void updateConnectivity() { /* ConnectivityManager -> carData.setWifi/... */ }
    private void notifyLicenseChanged() { /* AbstractC1294Y.m3149a(context) */ }
    private android.content.Context thisServiceContext() { return null; }
    private android.content.SharedPreferences prefs() { return null; }
    private static int partnerCodeFromId(int id) { return id; }
}
