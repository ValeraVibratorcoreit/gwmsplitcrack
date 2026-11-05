package com.altaysoft.t500_split.network;

import android.os.Environment;
import android.os.StrictMode;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p063d1.C0752m;
import p098q0.C1341o0;
import p098q0.C1344p0;

/* renamed from: com.altaysoft.t500_split.network.a */
/* loaded from: classes.dex */
public final class C0654a {

    /* renamed from: h */
    public static C0654a f3077h;

    /* renamed from: a */
    public final cfgData f3078a;

    /* renamed from: b */
    public final carData f3079b;

    /* renamed from: c */
    public final String f3080c;

    /* renamed from: d */
    public String f3081d;

    /* renamed from: e */
    public boolean f3082e;

    /* renamed from: f */
    public final URL f3083f;

    /* renamed from: g */
    public final C0752m f3084g;

    public C0654a() {
        cfgData m1784i = cfgData.m1784i();
        this.f3078a = m1784i;
        this.f3079b = carData.getInstance();
        String stringByIndex = NativeLib.getStringByIndex(m1784i.f2643j);
        this.f3080c = NativeLib.getStringByIndex(m1784i.f2648k);
        this.f3082e = false;
        this.f3083f = new URL(stringByIndex);
        this.f3084g = new C0752m();
        if (f3077h == null) {
            f3077h = this;
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        }
    }

    /* renamed from: e */
    public static String m1927e(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (z2) {
                z2 = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final ApiResponse m1928a(C1341o0 c1341o0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cfgData cfgdata = this.f3078a;
        linkedHashMap.put(cfgdata.f2518G, cfgdata.f2664n0);
        linkedHashMap.put(cfgdata.f2594Z, String.valueOf(c1341o0.f6304c));
        linkedHashMap.put(cfgdata.f2514F, c1341o0.f6302a);
        linkedHashMap.put(cfgdata.f2526I, this.f3080c);
        String m1930c = m1930c(linkedHashMap);
        this.f3081d = m1930c;
        return (ApiResponse) this.f3084g.m2197a(m1930c);
    }

    /* renamed from: b */
    public final String m1929b(C1341o0 c1341o0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cfgData cfgdata = this.f3078a;
        linkedHashMap.put(cfgdata.f2518G, cfgdata.f2674p0);
        linkedHashMap.put(cfgdata.f2514F, c1341o0.f6302a);
        String str = cfgdata.f2526I;
        String str2 = this.f3080c;
        linkedHashMap.put(str, str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(cfgdata.f2518G, cfgdata.f2669o0);
        linkedHashMap2.put(cfgdata.f2514F, c1341o0.f6302a);
        linkedHashMap2.put(cfgdata.f2526I, str2);
        String m1930c = m1930c(linkedHashMap2);
        this.f3081d = m1930c;
        this.f3082e = false;
        long j2 = ((ApiResponse) this.f3084g.m2197a(m1930c)).updateSize;
        Path path = Paths.get(Environment.getExternalStorageDirectory().toString() + cfgdata.f2644j0, new String[0]);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.f3083f.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod(cfgdata.f2649k0);
            httpURLConnection.setRequestProperty(cfgdata.f2654l0, cfgdata.f2659m0);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
            bufferedWriter.write(m1927e(linkedHashMap));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 4096);
                OutputStream newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
                byte[] bArr = new byte[32];
                long j3 = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        newOutputStream.flush();
                        newOutputStream.close();
                        bufferedInputStream.close();
                        break;
                    }
                    if (this.f3082e) {
                        return cfgdata.f2586X;
                    }
                    j3 += read;
                    C1344p0.f6319i.f6323d.m1398g(Integer.valueOf((int) ((100 * j3) / j2)));
                    newOutputStream.write(bArr, 0, read);
                }
            }
            httpURLConnection.disconnect();
            return path.toString();
        } catch (Exception unused) {
            return cfgdata.f2586X;
        }
    }

    /* renamed from: c */
    public final String m1930c(LinkedHashMap linkedHashMap) {
        InputStream inputStream;
        InputStream inputStream2;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream3;
        InputStream inputStream4;
        HttpsURLConnection httpsURLConnection2;
        BufferedReader bufferedReader;
        InputStream inputStream5;
        cfgData cfgdata = this.f3078a;
        BufferedReader bufferedReader2 = null;
        try {
            httpsURLConnection2 = (HttpsURLConnection) this.f3083f.openConnection();
            try {
                httpsURLConnection2.setConnectTimeout(5000);
                httpsURLConnection2.setReadTimeout(10000);
                httpsURLConnection2.setRequestMethod(cfgdata.f2649k0);
                httpsURLConnection2.setRequestProperty(cfgdata.f2654l0, cfgdata.f2659m0);
                httpsURLConnection2.setDoInput(true);
                httpsURLConnection2.setDoOutput(true);
                OutputStream outputStream = httpsURLConnection2.getOutputStream();
                try {
                    Charset charset = StandardCharsets.UTF_8;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, charset));
                    try {
                        bufferedWriter.write(m1927e(linkedHashMap));
                        bufferedWriter.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpsURLConnection2.getResponseCode() == 200) {
                            inputStream3 = httpsURLConnection2.getInputStream();
                            inputStream4 = null;
                        } else {
                            inputStream3 = httpsURLConnection2.getErrorStream();
                            inputStream4 = inputStream3;
                        }
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream3, charset));
                            try {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    sb.append(readLine);
                                }
                                String sb2 = sb.toString();
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                if (inputStream4 != null) {
                                    try {
                                        inputStream4.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                httpsURLConnection2.disconnect();
                                return sb2;
                            } catch (UnsupportedEncodingException unused4) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                if (inputStream4 != null) {
                                    try {
                                        inputStream4.close();
                                    } catch (IOException unused7) {
                                    }
                                }
                                if (httpsURLConnection2 != null) {
                                    httpsURLConnection2.disconnect();
                                }
                                return null;
                            } catch (ProtocolException unused8) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused9) {
                                    }
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException unused10) {
                                    }
                                }
                                if (inputStream4 != null) {
                                    try {
                                        inputStream4.close();
                                    } catch (IOException unused11) {
                                    }
                                }
                                if (httpsURLConnection2 != null) {
                                    httpsURLConnection2.disconnect();
                                }
                                return null;
                            } catch (IOException unused12) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused13) {
                                    }
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException unused14) {
                                    }
                                }
                                if (inputStream4 != null) {
                                    try {
                                        inputStream4.close();
                                    } catch (IOException unused15) {
                                    }
                                }
                                if (httpsURLConnection2 != null) {
                                    httpsURLConnection2.disconnect();
                                }
                                return null;
                            } catch (Throwable th) {
                                inputStream5 = inputStream4;
                                inputStream = inputStream3;
                                th = th;
                                bufferedReader2 = bufferedReader;
                                httpsURLConnection = httpsURLConnection2;
                                inputStream2 = inputStream5;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused16) {
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused17) {
                                    }
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException unused18) {
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    throw th;
                                }
                                httpsURLConnection.disconnect();
                                throw th;
                            }
                        } catch (UnsupportedEncodingException unused19) {
                            bufferedReader = null;
                        } catch (ProtocolException unused20) {
                            bufferedReader = null;
                        } catch (IOException unused21) {
                            bufferedReader = null;
                        } catch (Throwable th2) {
                            inputStream5 = inputStream4;
                            inputStream = inputStream3;
                            th = th2;
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (UnsupportedEncodingException unused22) {
                inputStream3 = null;
                inputStream4 = null;
                bufferedReader = null;
            } catch (ProtocolException unused23) {
                inputStream3 = null;
                inputStream4 = null;
                bufferedReader = null;
            } catch (IOException unused24) {
                inputStream3 = null;
                inputStream4 = null;
                bufferedReader = null;
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                httpsURLConnection = httpsURLConnection2;
                inputStream2 = null;
            }
        } catch (UnsupportedEncodingException unused25) {
            inputStream3 = null;
            inputStream4 = null;
            httpsURLConnection2 = null;
            bufferedReader = null;
        } catch (ProtocolException unused26) {
            inputStream3 = null;
            inputStream4 = null;
            httpsURLConnection2 = null;
            bufferedReader = null;
        } catch (IOException unused27) {
            inputStream3 = null;
            inputStream4 = null;
            httpsURLConnection2 = null;
            bufferedReader = null;
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            inputStream2 = null;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public final ApiResponse m1931d(C1341o0 c1341o0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cfgData cfgdata = this.f3078a;
        linkedHashMap.put(cfgdata.f2518G, cfgdata.f2590Y);
        linkedHashMap.put(cfgdata.f2594Z, String.valueOf(c1341o0.f6304c));
        linkedHashMap.put(cfgdata.f2514F, c1341o0.f6302a);
        linkedHashMap.put(cfgdata.f2599a0, String.valueOf(c1341o0.f6303b));
        linkedHashMap.put(cfgdata.f2604b0, c1341o0.f6305d);
        linkedHashMap.put(cfgdata.f2609c0, c1341o0.f6306e);
        linkedHashMap.put(cfgdata.f2614d0, String.valueOf(c1341o0.f6307f));
        linkedHashMap.put(cfgdata.f2619e0, String.valueOf(c1341o0.f6308g));
        linkedHashMap.put(cfgdata.f2624f0, String.valueOf(c1341o0.f6309h));
        linkedHashMap.put(cfgdata.f2629g0, String.valueOf(c1341o0.f6311j));
        linkedHashMap.put(cfgdata.f2634h0, String.valueOf(c1341o0.f6310i));
        linkedHashMap.put(cfgdata.f2639i0, String.valueOf(c1341o0.f6312k));
        linkedHashMap.put(cfgdata.f2526I, this.f3080c);
        carData cardata = this.f3079b;
        linkedHashMap.put("s_time", String.valueOf(cardata.getStartTime()));
        linkedHashMap.put("k_iv", cardata.getKIv());
        linkedHashMap.put("k_0", cardata.getK0());
        String m1930c = m1930c(linkedHashMap);
        this.f3081d = m1930c;
        return (ApiResponse) this.f3084g.m2197a(m1930c);
    }
}
