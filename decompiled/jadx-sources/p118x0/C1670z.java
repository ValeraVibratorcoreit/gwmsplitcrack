package p118x0;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.splitinfo.WeatherFullscreenActivity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import p001A0.RunnableC0005B;
import p006C.AbstractC0062j;
import p098q0.C1266J0;
import p098q0.C1300a1;

/* renamed from: x0.z */
/* loaded from: classes.dex */
public final class C1670z {

    /* renamed from: o */
    public static C1670z f9525o;

    /* renamed from: a */
    public final Context f9526a;

    /* renamed from: d */
    public volatile InterfaceC1666v f9529d;

    /* renamed from: e */
    public volatile C1669y f9530e;

    /* renamed from: f */
    public boolean f9531f;

    /* renamed from: g */
    public long f9532g;

    /* renamed from: h */
    public boolean f9533h;

    /* renamed from: i */
    public long f9534i;

    /* renamed from: j */
    public boolean f9535j;

    /* renamed from: k */
    public C1266J0 f9536k;

    /* renamed from: b */
    public final ExecutorService f9527b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public final Handler f9528c = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    public final RunnableC1663s f9537l = new RunnableC1663s(this, 0);

    /* renamed from: m */
    public final RunnableC1663s f9538m = new RunnableC1663s(this, 1);

    /* renamed from: n */
    public final RunnableC1663s f9539n = new RunnableC1663s(this, 2);

    public C1670z(Context context) {
        this.f9526a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m4819a(C1670z c1670z) {
        if (!c1670z.f9531f || c1670z.f9533h) {
            return;
        }
        c1670z.f9528c.removeCallbacks(c1670z.f9539n);
        c1670z.f9535j = false;
        c1670z.f9534i = 0L;
        c1670z.m4829g(c1670z.f9529d);
    }

    /* renamed from: b */
    public static C1669y m4820b(JSONObject jSONObject, JSONObject jSONObject2, float f2, float f3, String str, long j2) {
        float f4;
        float f5;
        long j3;
        long j4;
        float f6;
        String str2;
        int i;
        String str3;
        float f7;
        String str4;
        float f8;
        float f9;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        ArrayList arrayList;
        String str9;
        int i3;
        ArrayList arrayList2;
        JSONArray jSONArray;
        String str10 = "main";
        JSONObject jSONObject3 = jSONObject.getJSONObject("main");
        String str11 = "temp";
        float f10 = (float) jSONObject3.getDouble("temp");
        float optDouble = (float) jSONObject3.optDouble("feels_like", f10);
        String str12 = "humidity";
        int optInt = jSONObject3.optInt("humidity", -1);
        float optDouble2 = (float) jSONObject3.optDouble("pressure", 0.0d);
        String str13 = "wind";
        JSONObject optJSONObject = jSONObject.optJSONObject("wind");
        float optDouble3 = (optJSONObject != null ? (float) optJSONObject.optDouble("speed", 0.0d) : 0.0f) * 3.6f;
        int optInt2 = optJSONObject != null ? optJSONObject.optInt("deg", -1) : -1;
        if (optJSONObject != null) {
            f4 = optDouble3;
            f5 = ((float) optJSONObject.optDouble("gust", 0.0d)) * 3.6f;
        } else {
            f4 = optDouble3;
            f5 = 0.0f;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("clouds");
        int optInt3 = optJSONObject2 != null ? optJSONObject2.optInt("all", 0) : 0;
        float optDouble4 = (float) (jSONObject.optDouble("visibility", 0.0d) / 1000.0d);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("rain");
        float f11 = f5;
        String str14 = "speed";
        float optDouble5 = optJSONObject3 != null ? (float) optJSONObject3.optDouble("1h", optJSONObject3.optDouble("3h", 0.0d)) : 0.0f;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("snow");
        float f12 = optDouble5;
        String str15 = "snow";
        float optDouble6 = optJSONObject4 != null ? (float) optJSONObject4.optDouble("1h", optJSONObject4.optDouble("3h", 0.0d)) : 0.0f;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("sys");
        if (optJSONObject5 != null) {
            j3 = optJSONObject5.optLong("sunrise", 0L) * 1000;
            j4 = optJSONObject5.optLong("sunset", 0L) * 1000;
        } else {
            j3 = 0;
            j4 = 0;
        }
        String str16 = "weather";
        JSONArray optJSONArray = jSONObject.optJSONArray("weather");
        float f13 = optDouble6;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            f6 = optDouble2;
            str2 = "";
            i = 800;
        } else {
            f6 = optDouble2;
            JSONObject jSONObject4 = optJSONArray.getJSONObject(0);
            i = jSONObject4.optInt("id", 800);
            str2 = jSONObject4.optString("description", "");
            if (str2.length() > 0) {
                str2 = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        String str17 = "list";
        String str18 = str2;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("list");
        String str19 = "";
        String str20 = "id";
        String str21 = "pop";
        if (optJSONArray2 != null) {
            int min = Math.min(optJSONArray2.length(), 16);
            int i4 = 0;
            while (i4 < min) {
                int i5 = min;
                JSONObject jSONObject5 = optJSONArray2.getJSONObject(i4);
                JSONArray jSONArray2 = optJSONArray2;
                String str22 = str17;
                String str23 = str16;
                long optLong = jSONObject5.optLong("dt", 0L) * 1000;
                JSONObject jSONObject6 = jSONObject5.getJSONObject(str10);
                float f14 = (float) jSONObject6.getDouble(str11);
                String str24 = str10;
                ArrayList arrayList4 = arrayList3;
                String str25 = str11;
                float optDouble7 = (float) jSONObject6.optDouble("feels_like", f14);
                int optInt4 = jSONObject6.optInt(str12, -1);
                String str26 = str12;
                float optDouble8 = (float) jSONObject5.optDouble(str21, -1.0d);
                JSONObject optJSONObject6 = jSONObject5.optJSONObject(str13);
                String str27 = str13;
                String str28 = str14;
                if (optJSONObject6 != null) {
                    str3 = str24;
                    f7 = ((float) optJSONObject6.optDouble(str28, 0.0d)) * 3.6f;
                } else {
                    str3 = str24;
                    f7 = 0.0f;
                }
                int optInt5 = optJSONObject6 != null ? optJSONObject6.optInt("deg", -1) : -1;
                JSONObject optJSONObject7 = jSONObject5.optJSONObject("rain");
                if (optJSONObject7 != null) {
                    f8 = (float) optJSONObject7.optDouble("3h", optJSONObject7.optDouble("1h", 0.0d));
                    str4 = str15;
                } else {
                    str4 = str15;
                    f8 = 0.0f;
                }
                JSONObject optJSONObject8 = jSONObject5.optJSONObject(str4);
                String str29 = str21;
                int i6 = i4;
                if (optJSONObject8 != null) {
                    f9 = (float) optJSONObject8.optDouble("3h", optJSONObject8.optDouble("1h", 0.0d));
                    str16 = str23;
                } else {
                    str16 = str23;
                    f9 = 0.0f;
                }
                JSONArray optJSONArray3 = jSONObject5.optJSONArray(str16);
                if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                    str5 = str20;
                    str6 = str19;
                    str7 = str28;
                    str8 = str6;
                    i2 = 800;
                } else {
                    JSONObject jSONObject7 = optJSONArray3.getJSONObject(0);
                    str5 = str20;
                    int optInt6 = jSONObject7.optInt(str5, 800);
                    str6 = str19;
                    String optString = jSONObject7.optString("description", str6);
                    str7 = str28;
                    str8 = optString.length() > 0 ? Character.toUpperCase(optString.charAt(0)) + optString.substring(1) : optString;
                    i2 = optInt6;
                }
                arrayList4.add(new C1668x(optLong, f14, optDouble7, i2, str8, optDouble8, f7, optInt5, optInt4, f8, f9));
                int i7 = i6 + 1;
                arrayList3 = arrayList4;
                str15 = str4;
                str19 = str6;
                str21 = str29;
                str12 = str26;
                str13 = str27;
                str10 = str3;
                str14 = str7;
                min = i5;
                str17 = str22;
                str11 = str25;
                str20 = str5;
                i4 = i7;
                optJSONArray2 = jSONArray2;
            }
        }
        String str30 = str10;
        ArrayList arrayList5 = arrayList3;
        String str31 = str11;
        String str32 = str17;
        String str33 = str21;
        String str34 = str20;
        String str35 = str19;
        ArrayList arrayList6 = new ArrayList();
        JSONArray optJSONArray4 = jSONObject2.optJSONArray(str32);
        if (optJSONArray4 == null) {
            arrayList = arrayList5;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i8 = 0;
            while (i8 < optJSONArray4.length()) {
                JSONObject jSONObject8 = optJSONArray4.getJSONObject(i8);
                String optString2 = jSONObject8.optString("dt_txt", str35);
                if (optString2.length() < 10) {
                    arrayList2 = arrayList5;
                    jSONArray = optJSONArray4;
                    str9 = str30;
                } else {
                    String substring = optString2.substring(0, 10);
                    try {
                        i3 = optString2.length() >= 13 ? Integer.parseInt(optString2.substring(11, 13)) : 12;
                        str9 = str30;
                    } catch (Exception unused) {
                        str9 = str30;
                        i3 = 12;
                    }
                    int i9 = i3;
                    float f15 = (float) jSONObject8.getJSONObject(str9).getDouble(str31);
                    arrayList2 = arrayList5;
                    jSONArray = optJSONArray4;
                    float optDouble9 = (float) jSONObject8.optDouble(str33, -1.0d);
                    JSONArray optJSONArray5 = jSONObject8.optJSONArray(str16);
                    int optInt7 = (optJSONArray5 == null || optJSONArray5.length() <= 0) ? 800 : optJSONArray5.getJSONObject(0).optInt(str34, 800);
                    C1664t c1664t = (C1664t) linkedHashMap.get(substring);
                    if (c1664t == null) {
                        c1664t = new C1664t();
                        c1664t.f9479a = Float.POSITIVE_INFINITY;
                        c1664t.f9480b = Float.NEGATIVE_INFINITY;
                        c1664t.f9481c = -1.0f;
                        c1664t.f9482d = 800;
                        c1664t.f9483e = 99;
                        linkedHashMap.put(substring, c1664t);
                    }
                    if (f15 < c1664t.f9479a) {
                        c1664t.f9479a = f15;
                    }
                    if (f15 > c1664t.f9480b) {
                        c1664t.f9480b = f15;
                    }
                    if (optDouble9 >= 0.0f && optDouble9 > c1664t.f9481c) {
                        c1664t.f9481c = optDouble9;
                    }
                    int abs = Math.abs(i9 - 12);
                    if (abs < c1664t.f9483e) {
                        c1664t.f9483e = abs;
                        c1664t.f9482d = optInt7;
                    }
                }
                i8++;
                str30 = str9;
                optJSONArray4 = jSONArray;
                arrayList5 = arrayList2;
            }
            arrayList = arrayList5;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date());
            ArrayList arrayList7 = new ArrayList();
            C1667w c1667w = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                C1664t c1664t2 = (C1664t) entry.getValue();
                if (c1664t2.f9479a != Float.POSITIVE_INFINITY) {
                    C1667w c1667w2 = new C1667w((String) entry.getKey(), c1664t2.f9482d, c1664t2.f9480b, c1664t2.f9479a, c1664t2.f9481c);
                    if (format.equals(entry.getKey())) {
                        c1667w = c1667w2;
                    } else if (arrayList7.size() < 3) {
                        arrayList7.add(c1667w2);
                    }
                }
            }
            if (c1667w != null) {
                arrayList6.add(c1667w);
            }
            arrayList6.addAll(arrayList7);
        }
        return new C1669y(true, null, f2, f3, str, f10, optDouble, i, str18, f4, optInt2, f11, optInt, f6, optDouble4, optInt3, f12, f13, j3, j4, arrayList6, arrayList, j2);
    }

    /* renamed from: c */
    public static String m4821c(String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                String trim = str.trim();
                if (!trim.isEmpty() && !trim.equalsIgnoreCase("null")) {
                    return trim;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C1670z m4822d(Context context) {
        if (f9525o == null) {
            f9525o = new C1670z(context);
        }
        return f9525o;
    }

    /* renamed from: e */
    public static JSONObject m4823e(String str) {
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(8000);
        httpURLConnection.setRequestMethod("GET");
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream() != null ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                str2 = sb.toString();
            } catch (Exception unused) {
                str2 = "";
            }
            String m156j = AbstractC0062j.m156j(responseCode, "HTTP ");
            try {
                if (!str2.isEmpty()) {
                    String optString = new JSONObject(str2).optString("message", "");
                    if (!optString.isEmpty()) {
                        m156j = optString;
                    }
                }
            } catch (Exception unused2) {
            }
            throw new Exception(m156j);
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
        while (true) {
            try {
                String readLine2 = bufferedReader2.readLine();
                if (readLine2 == null) {
                    bufferedReader2.close();
                    return new JSONObject(sb2.toString());
                }
                sb2.append(readLine2);
            } catch (Throwable th) {
                try {
                    bufferedReader2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: f */
    public static JSONArray m4824f(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.setReadTimeout(6000);
        httpURLConnection.setRequestMethod("GET");
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return new JSONArray(sb.toString());
                }
                sb.append(readLine);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: m */
    public static String m4825m(int i) {
        return (i < 200 || i >= 300) ? (i < 300 || i >= 400) ? (i < 500 || i >= 600) ? (i < 600 || i >= 700) ? (i < 700 || i >= 800) ? i == 800 ? "☀️" : i == 801 ? "🌤" : i == 802 ? "⛅" : (i == 803 || i == 804) ? "☁️" : "🌡" : "🌫" : "❄️" : i == 511 ? "🌨" : "🌧" : "🌦" : "⛈";
    }

    /* renamed from: n */
    public static String m4826n(Context context, int i) {
        return context == null ? String.valueOf(i) : (i < 200 || i >= 300) ? (i < 300 || i >= 400) ? (i < 500 || i >= 600) ? (i < 600 || i >= 700) ? (i < 700 || i >= 800) ? i == 800 ? context.getString(R.string.weather_cond_clear) : i == 801 ? context.getString(R.string.weather_cond_few_clouds) : i == 802 ? context.getString(R.string.weather_cond_scattered) : i == 803 ? context.getString(R.string.weather_cond_broken) : i == 804 ? context.getString(R.string.weather_cond_overcast) : context.getString(R.string.weather_cond_code, Integer.valueOf(i)) : context.getString(R.string.weather_cond_fog) : context.getString(R.string.weather_cond_snow) : i == 511 ? context.getString(R.string.weather_cond_freezing_rain) : i >= 520 ? context.getString(R.string.weather_cond_shower) : context.getString(R.string.weather_cond_rain) : context.getString(R.string.weather_cond_drizzle) : context.getString(R.string.weather_cond_thunderstorm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0066, code lost:
    
        r4 = "clear-night";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
    
        r4 = "clear-day";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0081, code lost:
    
        if (r5 != false) goto L40;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m4827o(int i, boolean z2) {
        String str;
        StringBuilder sb = new StringBuilder("meteocons/fill/");
        if (i >= 200 && i < 300) {
            str = "thunderstorms-rain";
        } else if (i >= 300 && i < 400) {
            str = "drizzle";
        } else if (i >= 500 && i < 600) {
            str = i == 511 ? "sleet" : i >= 520 ? "overcast-rain" : "rain";
        } else if (i >= 600 && i < 700) {
            str = "snow";
        } else if (i >= 700 && i < 800) {
            str = (i == 701 || i == 741) ? "fog" : i >= 771 ? "extreme-rain" : "mist";
        } else if (i != 800) {
            if (i == 801 || i == 802) {
                str = z2 ? "partly-cloudy-night" : "partly-cloudy-day";
            } else if (i == 803) {
                str = "cloudy";
            } else if (i == 804) {
                str = "overcast";
            }
        }
        return AbstractC0062j.m162p(sb, str, ".json");
    }

    /* renamed from: p */
    public static String m4828p(WeatherFullscreenActivity weatherFullscreenActivity, int i) {
        return i < 0 ? "" : new String[]{weatherFullscreenActivity.getString(R.string.weather_dir_n), weatherFullscreenActivity.getString(R.string.weather_dir_ne), weatherFullscreenActivity.getString(R.string.weather_dir_e), weatherFullscreenActivity.getString(R.string.weather_dir_se), weatherFullscreenActivity.getString(R.string.weather_dir_s), weatherFullscreenActivity.getString(R.string.weather_dir_sw), weatherFullscreenActivity.getString(R.string.weather_dir_w), weatherFullscreenActivity.getString(R.string.weather_dir_nw)}[((int) Math.round((((i % 360) + 360) % 360) / 45.0d)) % 8];
    }

    /* renamed from: g */
    public final void m4829g(InterfaceC1666v interfaceC1666v) {
        Network[] allNetworks;
        if (interfaceC1666v == null || !this.f9531f || this.f9533h || this.f9535j) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f9534i;
        if (j2 <= 0 || currentTimeMillis - j2 >= 30000) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f9526a.getSystemService("connectivity");
            int i = 0;
            if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
                int length = allNetworks.length;
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        i = i2;
                        break;
                    }
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                    if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                        if (networkCapabilities.hasCapability(16)) {
                            i = 1;
                            break;
                        }
                        i2 = 1;
                    }
                    i++;
                }
            }
            this.f9535j = true;
            this.f9528c.postDelayed(this.f9539n, i != 0 ? 3000L : 30000L);
        }
    }

    /* renamed from: h */
    public final C1669y m4830h(SharedPreferences sharedPreferences, long j2) {
        String str;
        String str2;
        String str3;
        String str4;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        String str5;
        String str6 = "humidity";
        String str7 = "windDeg";
        String str8 = "windKmh";
        String str9 = "description";
        String str10 = "feelsLikeC";
        String str11 = "tempC";
        String str12 = "weatherCode";
        String str13 = "";
        String string = sharedPreferences.getString("cache_json", null);
        if (string == null || string.isEmpty()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.optInt("v", 0) != 3) {
                return null;
            }
            float f7 = (float) jSONObject.getDouble("lat");
            float f8 = (float) jSONObject.getDouble("lon");
            String optString = jSONObject.optString("place", "");
            float f9 = (float) jSONObject.getDouble("tempC");
            float optDouble = (float) jSONObject.optDouble("feelsLikeC", f9);
            int i = jSONObject.getInt("weatherCode");
            String optString2 = jSONObject.optString("description", "");
            float optDouble2 = (float) jSONObject.optDouble("windKmh", 0.0d);
            int optInt = jSONObject.optInt("windDeg", -1);
            try {
                float optDouble3 = (float) jSONObject.optDouble("windGustKmh", 0.0d);
                int optInt2 = jSONObject.optInt("humidity", -1);
                float optDouble4 = (float) jSONObject.optDouble("pressureHpa", 0.0d);
                float optDouble5 = (float) jSONObject.optDouble("visibilityKm", 0.0d);
                int optInt3 = jSONObject.optInt("cloudsPct", 0);
                float optDouble6 = (float) jSONObject.optDouble("rain1hMm", 0.0d);
                float optDouble7 = (float) jSONObject.optDouble("snow1hMm", 0.0d);
                long optLong = jSONObject.optLong("sunriseMs", 0L);
                long optLong2 = jSONObject.optLong("sunsetMs", 0L);
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("days");
                String str14 = "pop";
                if (optJSONArray != null) {
                    f4 = optDouble7;
                    int i2 = 0;
                    while (i2 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        arrayList.add(new C1667w(jSONObject2.getString("date"), jSONObject2.getInt(str12), (float) jSONObject2.getDouble("tMax"), (float) jSONObject2.getDouble("tMin"), (float) jSONObject2.optDouble("pop", -1.0d)));
                        i2++;
                        str8 = str8;
                        optJSONArray = optJSONArray;
                        optDouble3 = optDouble3;
                        f7 = f7;
                        str6 = str6;
                        str7 = str7;
                        str12 = str12;
                        str13 = str13;
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str12;
                    str4 = str13;
                    f2 = f7;
                    f3 = optDouble3;
                } else {
                    str = "humidity";
                    str2 = "windDeg";
                    str3 = "weatherCode";
                    str4 = "";
                    f2 = f7;
                    f3 = optDouble3;
                    f4 = optDouble7;
                }
                String str15 = str8;
                ArrayList arrayList2 = new ArrayList();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("hours");
                if (optJSONArray2 != null) {
                    int i3 = 0;
                    while (i3 < optJSONArray2.length()) {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                        long optLong3 = jSONObject3.optLong("dtMs", 0L);
                        float optDouble8 = (float) jSONObject3.optDouble(str11, 0.0d);
                        float optDouble9 = (float) jSONObject3.optDouble(str10, 0.0d);
                        String str16 = str3;
                        String str17 = str4;
                        String str18 = str10;
                        str3 = str16;
                        String str19 = str14;
                        String str20 = str2;
                        String str21 = str;
                        str = str21;
                        str4 = str17;
                        arrayList2.add(new C1668x(optLong3, optDouble8, optDouble9, jSONObject3.optInt(str16, 800), jSONObject3.optString(str9, str17), (float) jSONObject3.optDouble(str14, -1.0d), (float) jSONObject3.optDouble(str15, 0.0d), jSONObject3.optInt(str20, -1), jSONObject3.optInt(str21, -1), (float) jSONObject3.optDouble("rainMm", 0.0d), (float) jSONObject3.optDouble("snowMm", 0.0d)));
                        i3++;
                        str9 = str9;
                        str2 = str20;
                        str14 = str19;
                        str10 = str18;
                        str15 = str15;
                        arrayList = arrayList;
                        str11 = str11;
                    }
                }
                ArrayList arrayList3 = arrayList;
                if (optString.isEmpty()) {
                    f5 = f8;
                    f6 = f2;
                    try {
                        str5 = m4832j(f6, f5);
                    } catch (Exception unused) {
                        return null;
                    }
                } else {
                    f5 = f8;
                    f6 = f2;
                    str5 = optString;
                }
                return new C1669y(true, null, f6, f5, str5, f9, optDouble, i, optString2, optDouble2, optInt, f3, optInt2, optDouble4, optDouble5, optInt3, optDouble6, f4, optLong, optLong2, arrayList3, arrayList2, j2);
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    /* renamed from: i */
    public final void m4831i(final boolean z2, final InterfaceC1666v interfaceC1666v) {
        C1669y c1669y;
        this.f9529d = interfaceC1666v;
        if (z2 || (c1669y = this.f9530e) == null || !c1669y.f9502a || System.currentTimeMillis() - c1669y.f9524w >= 900000) {
            this.f9527b.execute(new Runnable() { // from class: x0.r
                /* JADX WARN: Code restructure failed: missing block: B:78:0x009b, code lost:
                
                    if (r12 != null) goto L38;
                 */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0131  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x02ed  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:93:0x010f A[Catch: Exception -> 0x0122, TryCatch #7 {Exception -> 0x0122, blocks: (B:91:0x00db, B:93:0x010f, B:94:0x0113), top: B:90:0x00db }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    Location location;
                    String str;
                    float latitude;
                    float longitude;
                    C1669y m4815a;
                    C1670z c1670z;
                    C1669y c1669y2;
                    InterfaceC1666v interfaceC1666v2;
                    LocationManager locationManager;
                    C1670z c1670z2 = C1670z.this;
                    boolean z3 = z2;
                    InterfaceC1666v interfaceC1666v3 = interfaceC1666v;
                    if (!z3) {
                        SharedPreferences sharedPreferences = c1670z2.f9526a.getSharedPreferences("T500_SPLIT_WEATHER", 0);
                        long j2 = sharedPreferences.getLong("cache_at", 0L);
                        C1669y m4830h = (j2 <= 0 || System.currentTimeMillis() - j2 > 900000) ? null : c1670z2.m4830h(sharedPreferences, j2);
                        if (m4830h != null && m4830h.f9502a) {
                            c1670z2.f9530e = m4830h;
                            c1670z2.f9528c.post(new RunnableC1661q(interfaceC1666v3, m4830h, 1));
                            return;
                        }
                    }
                    Context context = c1670z2.f9526a;
                    try {
                        locationManager = (LocationManager) context.getSystemService("location");
                    } catch (Exception unused) {
                    }
                    if (locationManager != null) {
                        String[] strArr = {"gps", "network", "passive"};
                        location = null;
                        for (int i = 0; i < 3; i++) {
                            try {
                                Location lastKnownLocation = locationManager.getLastKnownLocation(strArr[i]);
                                if (lastKnownLocation != null && (location == null || lastKnownLocation.getTime() > location.getTime())) {
                                    location = lastKnownLocation;
                                }
                            } catch (SecurityException unused2) {
                            }
                        }
                        String str2 = "";
                        if (location != null) {
                            m4815a = C1669y.m4815a(context.getString(R.string.split_info_weather_no_location), 0.0f, 0.0f, "");
                        } else {
                            try {
                                str = NativeLib.getStringByIndex(cfgData.m1784i().f2653l);
                            } catch (Throwable unused3) {
                            }
                        }
                        if (m4815a.f9502a) {
                            C1669y c1669y3 = m4815a;
                            Handler handler = c1670z2.f9528c;
                            RunnableC1663s runnableC1663s = c1670z2.f9537l;
                            handler.removeCallbacks(runnableC1663s);
                            handler.postDelayed(runnableC1663s, c1670z2.f9531f ? 30000L : 120000L);
                            SharedPreferences sharedPreferences2 = c1670z2.f9526a.getSharedPreferences("T500_SPLIT_WEATHER", 0);
                            long j3 = sharedPreferences2.getLong("cache_at", 0L);
                            C1669y m4830h2 = j3 <= 0 ? null : c1670z2.m4830h(sharedPreferences2, j3);
                            if (m4830h2 == null || !m4830h2.f9502a) {
                                c1670z2.f9528c.post(new RunnableC1661q(interfaceC1666v3, c1669y3, 3));
                                return;
                            } else {
                                c1670z2.f9530e = m4830h2;
                                c1670z2.f9528c.post(new RunnableC1661q(interfaceC1666v3, m4830h2, 2));
                                return;
                            }
                        }
                        c1670z2.f9530e = m4815a;
                        String str3 = "humidity";
                        String str4 = "windDeg";
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("v", 3);
                            jSONObject.put("lat", m4815a.f9504c);
                            jSONObject.put("lon", m4815a.f9505d);
                            jSONObject.put("place", m4815a.f9506e);
                            jSONObject.put("tempC", m4815a.f9507f);
                            jSONObject.put("feelsLikeC", m4815a.f9508g);
                            jSONObject.put("weatherCode", m4815a.f9509h);
                            jSONObject.put("description", m4815a.f9510i);
                            jSONObject.put("windKmh", m4815a.f9511j);
                            jSONObject.put("windDeg", m4815a.f9512k);
                            jSONObject.put("windGustKmh", m4815a.f9513l);
                            jSONObject.put("humidity", m4815a.f9514m);
                            jSONObject.put("pressureHpa", m4815a.f9515n);
                            jSONObject.put("visibilityKm", m4815a.f9516o);
                            jSONObject.put("cloudsPct", m4815a.f9517p);
                            jSONObject.put("rain1hMm", m4815a.f9518q);
                            jSONObject.put("snow1hMm", m4815a.f9519r);
                            jSONObject.put("sunriseMs", m4815a.f9520s);
                            jSONObject.put("sunsetMs", m4815a.f9521t);
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = m4815a.f9522u.iterator();
                            while (it.hasNext()) {
                                try {
                                    C1667w c1667w = (C1667w) it.next();
                                    JSONObject jSONObject2 = new JSONObject();
                                    Iterator it2 = it;
                                    interfaceC1666v2 = interfaceC1666v3;
                                    try {
                                        jSONObject2.put("date", c1667w.f9486a);
                                        jSONObject2.put("weatherCode", c1667w.f9487b);
                                        jSONObject2.put("tMax", c1667w.f9488c);
                                        jSONObject2.put("tMin", c1667w.f9489d);
                                        jSONObject2.put("pop", c1667w.f9490e);
                                        jSONArray.put(jSONObject2);
                                        it = it2;
                                        interfaceC1666v3 = interfaceC1666v2;
                                        str3 = str3;
                                        str4 = str4;
                                    } catch (Exception unused4) {
                                        c1670z = c1670z2;
                                        c1669y2 = m4815a;
                                        c1670z.f9528c.post(new RunnableC0005B(c1670z, interfaceC1666v2, c1669y2, 10));
                                        return;
                                    }
                                } catch (Exception unused5) {
                                    interfaceC1666v2 = interfaceC1666v3;
                                    c1670z = c1670z2;
                                    c1669y2 = m4815a;
                                    c1670z.f9528c.post(new RunnableC0005B(c1670z, interfaceC1666v2, c1669y2, 10));
                                    return;
                                }
                            }
                            interfaceC1666v2 = interfaceC1666v3;
                            String str5 = str3;
                            String str6 = str4;
                            jSONObject.put("days", jSONArray);
                            JSONArray jSONArray2 = new JSONArray();
                            for (Iterator it3 = m4815a.f9523v.iterator(); it3.hasNext(); it3 = it3) {
                                C1668x c1668x = (C1668x) it3.next();
                                JSONObject jSONObject3 = new JSONObject();
                                c1670z = c1670z2;
                                c1669y2 = m4815a;
                                try {
                                    jSONObject3.put("dtMs", c1668x.f9491a);
                                    jSONObject3.put("tempC", c1668x.f9492b);
                                    jSONObject3.put("feelsLikeC", c1668x.f9493c);
                                    jSONObject3.put("weatherCode", c1668x.f9494d);
                                    jSONObject3.put("description", c1668x.f9495e);
                                    jSONObject3.put("pop", c1668x.f9496f);
                                    jSONObject3.put("windKmh", c1668x.f9497g);
                                    String str7 = str6;
                                    jSONObject3.put(str7, c1668x.f9498h);
                                    String str8 = str5;
                                    jSONObject3.put(str8, c1668x.f9499i);
                                    str6 = str7;
                                    jSONObject3.put("rainMm", c1668x.f9500j);
                                    jSONObject3.put("snowMm", c1668x.f9501k);
                                    jSONArray2.put(jSONObject3);
                                    str5 = str8;
                                    c1670z2 = c1670z;
                                    m4815a = c1669y2;
                                } catch (Exception unused6) {
                                }
                            }
                            c1670z = c1670z2;
                            c1669y2 = m4815a;
                            jSONObject.put("hours", jSONArray2);
                            long j4 = c1669y2.f9524w;
                            if (j4 <= 0) {
                                j4 = System.currentTimeMillis();
                            }
                            c1670z.f9526a.getSharedPreferences("T500_SPLIT_WEATHER", 0).edit().putString("cache_json", jSONObject.toString()).putLong("cache_at", j4).apply();
                        } catch (Exception unused7) {
                            c1670z = c1670z2;
                            c1669y2 = m4815a;
                            interfaceC1666v2 = interfaceC1666v3;
                        }
                        c1670z.f9528c.post(new RunnableC0005B(c1670z, interfaceC1666v2, c1669y2, 10));
                        return;
                    }
                    location = null;
                    String str22 = "";
                    if (location != null) {
                    }
                    if (m4815a.f9502a) {
                    }
                    try {
                        Locale locale = Locale.US;
                        String format = String.format(locale, "https://api.openweathermap.org/data/2.5/weather?lat=%.4f&lon=%.4f&units=metric&lang=%s&appid=%s", Float.valueOf(latitude), Float.valueOf(longitude), r6, str);
                        String format2 = String.format(locale, "https://api.openweathermap.org/data/2.5/forecast?lat=%.4f&lon=%.4f&units=metric&lang=%s&appid=%s", Float.valueOf(latitude), Float.valueOf(longitude), r6, str);
                        JSONObject m4823e = C1670z.m4823e(format);
                        JSONObject m4823e2 = C1670z.m4823e(format2);
                        if (str22.isEmpty()) {
                            str22 = c1670z2.m4832j(latitude, longitude);
                        }
                        m4815a = C1670z.m4820b(m4823e, m4823e2, latitude, longitude, str22, System.currentTimeMillis());
                    } catch (Exception unused8) {
                        m4815a = C1669y.m4815a(context.getString(R.string.split_info_weather_no_response), latitude, longitude, str22);
                    }
                    if (m4815a.f9502a) {
                    }
                    str = "";
                    if (str.isEmpty()) {
                        m4815a = C1669y.m4815a(context.getString(R.string.split_info_weather_no_key), (float) location.getLatitude(), (float) location.getLongitude(), "");
                    } else {
                        latitude = (float) location.getLatitude();
                        longitude = (float) location.getLongitude();
                        String language = Locale.getDefault().getLanguage();
                        if (language == null || language.isEmpty()) {
                            language = "en";
                        }
                        try {
                            str22 = c1670z2.m4832j(latitude, longitude);
                        } catch (Exception unused9) {
                        }
                        Locale locale2 = Locale.US;
                        String format3 = String.format(locale2, "https://api.openweathermap.org/data/2.5/weather?lat=%.4f&lon=%.4f&units=metric&lang=%s&appid=%s", Float.valueOf(latitude), Float.valueOf(longitude), language, str);
                        String format22 = String.format(locale2, "https://api.openweathermap.org/data/2.5/forecast?lat=%.4f&lon=%.4f&units=metric&lang=%s&appid=%s", Float.valueOf(latitude), Float.valueOf(longitude), language, str);
                        JSONObject m4823e3 = C1670z.m4823e(format3);
                        JSONObject m4823e22 = C1670z.m4823e(format22);
                        if (str22.isEmpty()) {
                        }
                        m4815a = C1670z.m4820b(m4823e3, m4823e22, latitude, longitude, str22, System.currentTimeMillis());
                    }
                    if (m4815a.f9502a) {
                    }
                }
            });
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC1666v.mo783a(c1669y);
        } else {
            this.f9528c.post(new RunnableC1661q(interfaceC1666v, c1669y, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (java.lang.Math.abs(r6 - r20) <= 0.02f) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r8 != null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0126  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4832j(float f2, float f3) {
        String str;
        String str2;
        Context context = this.f9526a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("T500_SPLIT_WEATHER", 0);
        String str3 = null;
        String string = sharedPreferences.getString("place_name", null);
        if (string != null && !string.isEmpty()) {
            float f4 = sharedPreferences.getFloat("place_lat", Float.NaN);
            float f5 = sharedPreferences.getFloat("place_lon", Float.NaN);
            if (!Float.isNaN(f4)) {
                if (!Float.isNaN(f5)) {
                    if (Math.abs(f4 - f2) <= 0.02f) {
                    }
                }
            }
        }
        string = null;
        if (string != null) {
            return string;
        }
        if (Geocoder.isPresent()) {
            List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(f2, f3, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                Address address = fromLocation.get(0);
                str3 = m4821c(address.getLocality(), address.getSubLocality(), address.getSubAdminArea(), address.getAdminArea(), address.getFeatureName());
            }
            str3 = null;
        }
        if (str3 == null || str3.isEmpty()) {
            try {
                str = NativeLib.getStringByIndex(cfgData.m1784i().f2653l);
            } catch (Throwable unused) {
            }
        }
        if (str3 != null || str3.isEmpty()) {
            return "";
        }
        context.getSharedPreferences("T500_SPLIT_WEATHER", 0).edit().putString("place_name", str3).putFloat("place_lat", f2).putFloat("place_lon", f3).apply();
        return str3;
        str = "";
        if (str.isEmpty()) {
            str3 = null;
        } else {
            JSONArray m4824f = m4824f(String.format(Locale.US, "https://api.openweathermap.org/geo/1.0/reverse?lat=%.4f&lon=%.4f&limit=1&appid=%s", Float.valueOf(f2), Float.valueOf(f3), str));
            if (m4824f != null && m4824f.length() != 0) {
                JSONObject jSONObject = m4824f.getJSONObject(0);
                String language = Locale.getDefault().getLanguage();
                if (language == null || language.isEmpty()) {
                    language = "en";
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("local_names");
                str2 = null;
                try {
                    str3 = m4821c(optJSONObject != null ? m4821c(optJSONObject.optString(language, null), optJSONObject.optString("en", null)) : null, jSONObject.optString("name", null), jSONObject.optString("state", null));
                } catch (Exception unused2) {
                    str3 = str2;
                    if (str3 != null) {
                    }
                    return "";
                }
            }
            str2 = null;
            str3 = str2;
        }
        if (str3 != null) {
        }
        return "";
        str2 = null;
        str3 = str2;
        if (str3 != null) {
        }
        return "";
    }

    /* renamed from: k */
    public final void m4833k(C1300a1 c1300a1) {
        this.f9529d = c1300a1;
        this.f9533h = false;
        this.f9534i = 0L;
        this.f9528c.removeCallbacks(this.f9538m);
        this.f9528c.removeCallbacks(this.f9539n);
        this.f9535j = false;
        this.f9531f = true;
        this.f9532g = System.currentTimeMillis();
        if (this.f9536k != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f9526a.getSystemService("connectivity");
            if (connectivityManager != null) {
                try {
                    connectivityManager.unregisterNetworkCallback(this.f9536k);
                } catch (Throwable unused) {
                }
            }
            this.f9536k = null;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) this.f9526a.getSystemService("connectivity");
        if (connectivityManager2 != null) {
            try {
                C1266J0 c1266j0 = new C1266J0(1, this);
                this.f9536k = c1266j0;
                connectivityManager2.registerDefaultNetworkCallback(c1266j0);
            } catch (Throwable unused2) {
                this.f9536k = null;
            }
        }
        this.f9528c.post(this.f9538m);
    }

    /* renamed from: l */
    public final void m4834l() {
        this.f9531f = false;
        Handler handler = this.f9528c;
        handler.removeCallbacks(this.f9538m);
        handler.removeCallbacks(this.f9539n);
        this.f9535j = false;
        if (this.f9536k == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9526a.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f9536k);
            } catch (Throwable unused) {
            }
        }
        this.f9536k = null;
    }
}
