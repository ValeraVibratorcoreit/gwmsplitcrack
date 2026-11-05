package com.altaysoft.t500_split.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import p001A0.C0009c;
import p001A0.RunnableC0018l;
import p006C.AbstractC0062j;
import p016H.C0112d;

/* renamed from: com.altaysoft.t500_split.media.r */
/* loaded from: classes.dex */
public abstract class AbstractC0650r {

    /* renamed from: a */
    public static final Handler f3067a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final ExecutorService f3068b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public static volatile boolean f3069c;

    /* renamed from: a */
    public static String m1921a(HttpURLConnection httpURLConnection, int i) {
        String byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            inputStream = i >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (inputStream == null) {
                byteArrayOutputStream = "";
            } else {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream2.write(bArr, 0, read);
                }
                byteArrayOutputStream = byteArrayOutputStream2.toString(StandardCharsets.UTF_8.name());
            }
            return byteArrayOutputStream;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: b */
    public static String m1922b(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.music.yandex.net/account/status").openConnection();
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(20000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Authorization", "OAuth " + str);
            httpURLConnection.setRequestProperty("User-Agent", "Yandex-Music-API");
            httpURLConnection.setRequestProperty("X-Yandex-Music-Client", "YandexMusicAndroid/24026501");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            int responseCode = httpURLConnection.getResponseCode();
            String m1921a = m1921a(httpURLConnection, responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                JSONObject optJSONObject = new JSONObject(m1921a).optJSONObject("result");
                if (optJSONObject != null) {
                    optJSONObject = optJSONObject.optJSONObject("account");
                }
                if (optJSONObject == null) {
                    return "";
                }
                String valueOf = String.valueOf(optJSONObject.opt("uid"));
                return "null".equals(valueOf) ? "" : valueOf;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m1923c(String... strArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= strArr.length) {
                return sb.toString();
            }
            if (sb.length() > 0) {
                sb.append('&');
            }
            String str = strArr[i];
            String str2 = "";
            if (str == null) {
                str = "";
            }
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append('=');
            String str3 = strArr[i2];
            if (str3 != null) {
                str2 = str3;
            }
            sb.append(URLEncoder.encode(str2, "UTF-8"));
            i += 2;
        }
    }

    /* renamed from: d */
    public static void m1924d(Context context, String str, int i, long j2, C0112d c0112d) {
        JSONObject m1926f;
        while (f3069c && System.currentTimeMillis() < j2) {
            Thread.sleep(i * 1000);
            try {
                m1926f = m1926f("https://oauth.yandex.ru/token", m1923c("grant_type", "device_code", "code", str, "client_id", "23cabbbdc6cd418abb4b39c32c41195d", "client_secret", "53bc75238f0c4d08a118e51fe9203300"));
            } catch (Exception e2) {
                String message = e2.getMessage() == null ? "" : e2.getMessage();
                if (message.contains("authorization_pending")) {
                    continue;
                } else if (!message.contains("slow_down")) {
                    throw e2;
                }
            }
            if (m1926f.has("access_token")) {
                String string = m1926f.getString("access_token");
                context.getApplicationContext().getSharedPreferences("ym_oauth", 0).edit().putString("token", string).putString("refresh", m1926f.optString("refresh_token", "")).putString("uid", m1922b(string)).apply();
                f3069c = false;
                m1925e(c0112d, new C0009c(6));
                return;
            }
            String optString = m1926f.optString("error", "");
            if (!"authorization_pending".equals(optString) && !"slow_down".equals(optString)) {
                if (optString.isEmpty()) {
                    optString = "нет токена";
                }
                throw new Exception(optString);
            }
        }
        f3069c = false;
        if (System.currentTimeMillis() >= j2) {
            m1925e(c0112d, new C0009c(7));
        }
    }

    /* renamed from: e */
    public static void m1925e(C0112d c0112d, InterfaceC0649q interfaceC0649q) {
        f3067a.post(new RunnableC0018l(interfaceC0649q, 7, c0112d));
    }

    /* renamed from: f */
    public static JSONObject m1926f(String str, String str2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        httpURLConnection.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            String m1921a = m1921a(httpURLConnection, responseCode);
            try {
                if (m1921a == null) {
                    m1921a = "";
                }
                JSONObject jSONObject = new JSONObject(m1921a);
                if (responseCode < 400) {
                    return jSONObject;
                }
                String optString = jSONObject.optString("error", "HTTP " + responseCode);
                if ("authorization_pending".equals(optString) || "slow_down".equals(optString)) {
                    throw new Exception(optString);
                }
                throw new Exception(jSONObject.optString("error_description", optString));
            } catch (Exception e2) {
                if (responseCode < 200 || responseCode >= 300) {
                    throw new Exception(AbstractC0062j.m156j(responseCode, "HTTP "));
                }
                throw e2;
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
