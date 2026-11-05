package deobfuscated.license;

/**
 * Реконструкция логики лицензии GWM-Split 6261015.
 *
 * Оригиналы:
 *   cfgData.f2513E3, cfgData.f2610c1, cfgData.f2640i1
 *   AbstractC1372y1.m3311q(int)
 *   AbstractC1372y1.m3299e(String)
 *   cfgData.m1785a(), cfgData.m1795o(Context)
 *
 * Это не оригинальный исходник, а деобфусцированная реконструкция.
 */
public final class LicenseState {

    // cfgData.f2513E3
    public static final int MODE_DEMO = 1;
    public static final int MODE_FREE = 2;
    public static final int MODE_FULL = 3;
    // 4..7 — партнёрские/полные уровни; в m3299e ведут себя как FULL

    private int mode = MODE_FULL;      // cfgData.f2513E3
    private int payLevelId = 2;        // cfgData.f2610c1 (default field; prefs default 1)
    private int demoDaysRemain = 0;    // cfgData.f2640i1
    private long lastLicenseSyncAt = 0; // cfgData.f2670o1

    /**
     * Точная реконструкция AbstractC1372y1.m3311q:
     *   for id in 1..7: if id - 1 == licence -> return id
     *   return 2
     *
     * licence: 0=demo, 1=free, 2=full, 3..6=partner/full.
     */
    public static int modeFromPayLevel(int licence) {
        for (int id = 1; id <= 7; id++) {
            if (id - 1 == licence) {
                return id;
            }
        }
        return MODE_FREE;
    }

    /** cfgData.m1791k(): загрузка из SharedPreferences("T500_SPLIT_AS"). */
    public void load(int storedPayLevelId) {
        this.payLevelId = storedPayLevelId;                 // default 1
        this.mode = modeFromPayLevel(storedPayLevelId);
    }

    /** cfgData.m1795o(): сохранение и пересчёт режима. */
    public void saveAndApply(int newPayLevelId) {
        this.payLevelId = newPayLevelId;
        this.mode = modeFromPayLevel(newPayLevelId);
        applyFeatureRestrictions();
    }

    /** cfgData.m1785a(): FREE-версия принудительно выключает часть функций. */
    public void applyFeatureRestrictions() {
        if (mode == MODE_FREE) {
            // f2563R0, f2671o2, f2691s2, f2497B2, f2502C2, f2507D2, f2512E2
            setDisableAp(false);
            setAutoBrightness(false);
            setAutoPreset(false);
            setIpMessageCar(false);
            setIpMessageWell(false);
            setIpMessageBottom(false);
            setIpMessageAutoHide(false);
        }
    }

    /**
     * Точная реконструкция AbstractC1372y1.m3299e(String).
     * Возвращает true, если фича запрещена в текущем режиме.
     */
    public boolean isFeatureRestricted(String feature) {
        String restricted;
        switch (mode) {
            case MODE_DEMO:
            case MODE_FULL:
            case 4:
            case 5:
            case 6:
            case 7:
                restricted = "";
                break;
            case MODE_FREE:
                restricted =
                    "overlay pip tbox_ctrl launcher show_back presets5 allapps " +
                    "hide_mode theme_change ip_message voice_ctrl drive_mode " +
                    "disable_ap mediaData splitInfo auto_brightness";
                break;
            default:
                throw new IllegalStateException();
        }
        return restricted.contains(feature);
    }

    /**
     * Локальный «конец демо» из RunnableC0024r case 19.
     * Дни demoDaysRemain здесь НЕ используются.
     *
     * @return true, если нужно перейти DEMO -> FREE
     */
    public boolean shouldExpireDemo(long nowMs) {
        return mode == MODE_DEMO
                && (nowMs - lastLicenseSyncAt) / 86_400_000L > 2;
    }

    /** Применение ответа сервера (InternetMonitoringService observer). */
    public void applyServerLicense(int licence, int partnerId, int demoRemain) {
        this.payLevelId = licence;
        this.mode = modeFromPayLevel(licence);
        this.demoDaysRemain = licence < 1 ? demoRemain : 0;
        this.lastLicenseSyncAt = System.currentTimeMillis();
        applyFeatureRestrictions();
    }

    /** Успешная активация кодом (RunnableC1362v0 case 6). */
    public void applyActivationSuccess() {
        this.payLevelId = 2;
        this.mode = MODE_FULL;
        // оригинал также обнуляет f2665n1 и f2670o1
    }

    // --- заглушки для полей конфигурации ---
    private void setDisableAp(boolean v) {}
    private void setAutoBrightness(boolean v) {}
    private void setAutoPreset(boolean v) {}
    private void setIpMessageCar(boolean v) {}
    private void setIpMessageWell(boolean v) {}
    private void setIpMessageBottom(boolean v) {}
    private void setIpMessageAutoHide(boolean v) {}

    public int mode() { return mode; }
    public int payLevelId() { return payLevelId; }
    public int demoDaysRemain() { return demoDaysRemain; }
}
