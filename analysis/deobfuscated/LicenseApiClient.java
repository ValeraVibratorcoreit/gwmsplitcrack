package deobfuscated.license;

import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.network.ApiResponse;
import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Реконструкция com.altaysoft.t500_split.network.C0654a.
 *
 * Все имена параметров и URL приходят из native:
 *   cfgData.f2643j = 30  -> URL
 *   cfgData.f2648k = 237 -> ключ запроса
 *   cfgData.f2518G       -> имя параметра "команда"
 *   cfgData.f2664n0      -> значение команды проверки обновления
 *   cfgData.f2590Y       -> значение команды телеметрии
 *   cfgData.f2530J       -> значение команды активации
 * и т.д.
 *
 * Формат тела: application/x-www-form-urlencoded, POST.
 */
public final class LicenseApiClient {

    private final cfgData cfg = cfgData.m1784i();
    private final URL url;
    private final String apiKey;
    private final Gson gson = new Gson();
    private String lastRawResponse; // f3081d

    public LicenseApiClient() throws java.net.MalformedURLException {
        this.url = new URL(NativeLib.getStringByIndex(cfg.f2643j));      // 30
        this.apiKey = NativeLib.getStringByIndex(cfg.f2648k);            // 237
    }

    /** m1928a: проверка обновления. */
    public ApiResponse checkUpdate(LicenseController.DeviceMeta meta) {
        LinkedHashMap<String, String> p = new LinkedHashMap<>();
        p.put(cfg.f2518G, cfg.f2664n0);                    // команда
        p.put(cfg.f2594Z, String.valueOf(meta.version));   // версия
        p.put(cfg.f2514F, meta.encryptedVin);              // EncVIN
        p.put(cfg.f2526I, apiKey);                         // ключ
        String body = postForm(p);
        lastRawResponse = body;
        return gson.fromJson(body, ApiResponse.class);
    }

    /**
     * m1931d: основная телеметрия, ответ которой содержит user.licence,
     * user.partner и user.demoRemain.
     */
    public ApiResponse syncTelemetryAndLicense(LicenseController.DeviceMeta meta) {
        LinkedHashMap<String, String> p = new LinkedHashMap<>();
        p.put(cfg.f2518G, cfg.f2590Y);                       // команда
        p.put(cfg.f2594Z, String.valueOf(meta.version));      // версия
        p.put(cfg.f2514F, meta.encryptedVin);                // EncVIN
        p.put(cfg.f2599a0, String.valueOf(meta.model));       // model
        p.put(cfg.f2604b0, meta.navApp);                     // nav app
        p.put(cfg.f2609c0, meta.musicApp);                   // music app
        p.put(cfg.f2614d0, String.valueOf(meta.useHUT));      // useHUT
        p.put(cfg.f2619e0, String.valueOf(meta.useIP));       // useIP
        p.put(cfg.f2624f0, String.valueOf(meta.autoStart));   // autostart
        p.put(cfg.f2629g0, String.valueOf(meta.partnerId));   // partnerID
        p.put(cfg.f2634h0, String.valueOf(meta.useLauncher)); // launcher
        p.put(cfg.f2639i0, String.valueOf(meta.ipThemeId));   // ipthemes
        p.put(cfg.f2526I, apiKey);                           // ключ
        p.put("s_time", String.valueOf(cfg.f2598a.getStartTime()));
        p.put("k_iv", cfg.f2598a.getKIv());
        p.put("k_0", cfg.f2598a.getK0());
        String body = postForm(p);
        lastRawResponse = body;
        return gson.fromJson(body, ApiResponse.class);
    }

    /** m1930c: активация кодом. */
    public ApiResponse activate(String encryptedVin, String code) {
        LinkedHashMap<String, String> p = new LinkedHashMap<>();
        p.put(cfg.f2518G, cfg.f2530J);       // команда активации
        p.put(cfg.f2514F, encryptedVin);     // EncVIN
        p.put(cfg.f2522H, code);             // 6-значный код
        p.put(cfg.f2526I, apiKey);           // ключ
        String body = postForm(p);
        lastRawResponse = body;
        return gson.fromJson(body, ApiResponse.class);
    }

    /** m1930c: низкоуровневый POST. */
    public String postForm(LinkedHashMap<String, String> params) {
        HttpURLConnection c = null;
        try {
            c = (HttpURLConnection) url.openConnection();
            c.setConnectTimeout(5000);
            c.setReadTimeout(10000);
            c.setRequestMethod(cfg.f2649k0);                 // обычно "POST"
            c.setRequestProperty(cfg.f2654l0, cfg.f2659m0);  // Content-Type
            c.setDoInput(true);
            c.setDoOutput(true);

            OutputStream os = c.getOutputStream();
            BufferedWriter w = new BufferedWriter(
                    new OutputStreamWriter(os, StandardCharsets.UTF_8));
            w.write(urlEncode(params));
            w.close();
            os.close();

            InputStream in = c.getResponseCode() == 200
                    ? c.getInputStream()
                    : c.getErrorStream();
            if (in == null) return null;

            StringBuilder sb = new StringBuilder();
            java.io.BufferedReader r = new java.io.BufferedReader(
                    new InputStreamReader(in, StandardCharsets.UTF_8));
            String line;
            while ((line = r.readLine()) != null) sb.append(line);
            r.close();
            c.disconnect();
            return sb.toString();
        } catch (Exception e) {
            if (c != null) c.disconnect();
            return null;
        }
    }

    /** m1927e. */
    private static String urlEncode(Map<String, String> map) throws Exception {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (!first) sb.append('&');
            first = false;
            sb.append(URLEncoder.encode(e.getKey(), "UTF-8"));
            sb.append('=');
            sb.append(URLEncoder.encode(e.getValue(), "UTF-8"));
        }
        return sb.toString();
    }
}
