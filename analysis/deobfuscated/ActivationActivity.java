package deobfuscated.license;

import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.network.ApiResponse;

/**
 * Реконструкция com.altaysoft.t500_split.Pay.onSendCodeBtn.
 *
 * ВНИМАНИЕ: в версии 6261015 байткод содержит безусловную установку
 * resultCode = 99 перед postDelayed. Поэтому ветка успеха (case 6)
 * фактически недостижима, даже если сервер вернул successMessage с "split ".
 *
 * Это подтверждено дизассемблером androguard:
 *   0059 if-eqz v8, +4
 *   0060 goto/16 +0x72     -> 0121 const/16 v2, 99
 *   0121 const/16 v2, 99
 *   0127 invoke Handler.postDelayed(..., 250)
 */
public final class ActivationActivity {

    private final cfgData cfg = cfgData.m1784i();
    private final LicenseApiClient api = LicenseController.instance.api;

    public void onSendCode(String code) {
        if (!carData.hasInternet()) {
            showError(R.string.Message, R.string.no_internet_connection);
            return;
        }
        if (code.length() != 6) {
            showError(R.string.error_message_title, R.string.activation_wrong_code_format);
            return;
        }

        ApiResponse response = api.activate(
                LicenseController.deviceMeta.encryptedVin, code);

        int resultCode = 6; // задумано как успех
        if (response != null) {
            boolean success = response.successMessage != null
                    && response.successMessage.contains(cfg.f2534K /* "split " */);

            if (!success) {
                resultCode = 99;
                String msg = response.error != null ? response.error.f3070a : "";
                if (msg.contains(cfg.f2538L)) resultCode = 1;
                else if (msg.contains(cfg.f2542M)) resultCode = 2;
                else if (msg.contains(cfg.f2546N)) resultCode = 3;
                else if (msg.contains(cfg.f2550O)) resultCode = 4;
                else if (msg.contains(cfg.f2554P)) resultCode = 5;
            }
        }

        // В оригинале здесь БЕЗУСЛОВНО:
        //   resultCode = 99;
        //   new Handler().postDelayed(new RunnableC1362v0(this, 99, ...), 250L);
        resultCode = 99;
        final int codeToShow = resultCode;
        new android.os.Handler().postDelayed(() -> handleResult(codeToShow), 250L);
    }

    /** RunnableC1362v0. */
    private void handleResult(int code) {
        switch (code) {
            case 1:
                showError(R.string.error_message_title, R.string.activation_code_wrong);
                break;
            case 2:
                showError(R.string.error_message_title, R.string.activation_crook);
                break;
            case 3:
                showError(R.string.error_message_title, R.string.activation_failed);
                break;
            case 4:
                showError(R.string.error_message_title, R.string.activation_you_have_asiaforce);
                break;
            case 5:
                showError(R.string.error_message_title, R.string.activation_full_version);
                break;
            case 6:
                // Недостижимо в 6261015 из-за безусловного resultCode = 99.
                showMessage(R.string.Message, R.string.activation_thankyou);
                cfg.f2610c1 = 2;
                cfg.f2513E3 = LicenseState.MODE_FULL;
                cfg.f2665n1 = 0L;
                cfg.f2670o1 = 0L;
                cfg.m1795o(thisContext());
                new android.os.Handler().postDelayed(this::restartApp, 2000L);
                break;
            case 99:
            default:
                showError(R.string.error_message_title, R.string.activation_generic_error);
                break;
        }
    }

    private void showError(int title, int msg) { /* AbstractC1372y1.m3288S */ }
    private void showMessage(int title, int msg) { /* AbstractC1372y1.m3288S */ }
    private void restartApp() { /* RunnableC0020n(19, ...) */ }
    private android.content.Context thisContext() { return null; }
}
