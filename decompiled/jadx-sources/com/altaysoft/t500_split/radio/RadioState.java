package com.altaysoft.t500_split.radio;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0560y;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.media.MediaInfoService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p001A0.RunnableC0005B;
import p001A0.RunnableC0017k;
import p001A0.RunnableC0024r;
import p034Q0.C0295l;
import p064e.InterfaceC0766a;
import p121y0.AbstractC1687o;

@InterfaceC0766a
/* loaded from: classes.dex */
public final class RadioState {
    static final int PUSH_CUR = 2;
    static final int PUSH_FAV_AM = 5;
    static final int PUSH_FAV_FM = 4;
    static final int PUSH_PLAY = 0;
    static final int PUSH_RDS = 3;
    static final int PUSH_SEARCH = 1;
    private static final String TAG = "SplitRadio";
    private static RadioState instance;
    private Context app;
    private Bitmap art;
    private C0657c gux;
    private boolean started;
    private final Handler main = new Handler(Looper.getMainLooper());
    private final C0560y info = new C0560y(C0658d.f3092i);
    private String playRaw = "";
    private String searchRaw = "";
    private String chRaw = "";
    private String rdsRaw = "";
    private String favFm = "";
    private String favAm = "";

    private RadioState() {
    }

    private void applyKey(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str.equals(AbstractC1687o.m4925T(261))) {
            this.playRaw = m1935nz(str2);
            return;
        }
        if (str.equals(AbstractC1687o.m4925T(266))) {
            this.searchRaw = m1935nz(str2);
            return;
        }
        if (str.equals(AbstractC1687o.m4925T(262))) {
            this.chRaw = m1935nz(str2);
            return;
        }
        if (str.equals(AbstractC1687o.m4925T(263))) {
            this.rdsRaw = m1935nz(str2);
        } else if (str.equals(AbstractC1687o.m4925T(264))) {
            this.favFm = m1935nz(str2);
        } else if (str.equals(AbstractC1687o.m4925T(265))) {
            this.favAm = m1935nz(str2);
        }
    }

    private void applyPush(int i, String str) {
        this.main.post(new RunnableC0017k(this, i, str, 3));
    }

    private static String cleanPs(String str) {
        if (str == null) {
            return "";
        }
        String replaceAll = str.trim().replaceAll("\\s+", " ");
        return (replaceAll.isEmpty() || "null".equalsIgnoreCase(replaceAll)) ? "" : replaceAll;
    }

    private void cyclePreset(int i) {
        C0658d snapshot = snapshot();
        List list = snapshot.f3100h;
        if (list.isEmpty()) {
            refreshGet();
            return;
        }
        int m1944d = snapshot.m1944d();
        int size = m1944d < 0 ? i > 0 ? 0 : list.size() - 1 : (list.size() + (m1944d + i)) % list.size();
        C0657c ensureGux = ensureGux();
        if (ensureGux != null) {
            int intValue = ((Integer) list.get(size)).intValue();
            boolean z2 = snapshot.f3095c == 1;
            JSONObject jSONObject = new JSONObject();
            boolean z3 = z2;
            try {
                jSONObject.put(AbstractC1687o.m4925T(271), z3 ? AbstractC1687o.m4925T(269) : AbstractC1687o.m4925T(268));
                jSONObject.put(AbstractC1687o.m4925T(272), z3 ? intValue : intValue / 1000.0d);
            } catch (Exception unused) {
            }
            ensureGux.m1938c(jSONObject, AbstractC1687o.m4925T(254));
        }
    }

    private C0657c ensureGux() {
        Context context;
        if (this.gux == null && (context = this.app) != null) {
            this.gux = new C0657c(context);
        }
        C0657c c0657c = this.gux;
        if (c0657c != null) {
            c0657c.m1936a();
        }
        return this.gux;
    }

    private static String firstNonEmpty(String str, String str2) {
        return (TextUtils.isEmpty(str) || "null".equals(str)) ? str2 : str;
    }

    public static synchronized RadioState getInstance() {
        RadioState radioState;
        synchronized (RadioState.class) {
            try {
                if (instance == null) {
                    instance = new RadioState();
                }
                radioState = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return radioState;
    }

    private static boolean isOn(String str) {
        if (TextUtils.isEmpty(str) || "null".equals(str)) {
            return false;
        }
        String trim = str.replace("[", "").replace("]", "").trim();
        if (trim.isEmpty()) {
            return false;
        }
        String trim2 = trim.split("[,;\\s]+")[0].trim();
        return "1".equals(trim2) || "true".equalsIgnoreCase(trim2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyPush$2(int i, String str) {
        if (i == 0) {
            this.playRaw = m1935nz(str);
        } else if (i == 1) {
            this.searchRaw = m1935nz(str);
        } else if (i == 2) {
            this.chRaw = m1935nz(str);
        } else if (i == 3) {
            this.rdsRaw = m1935nz(str);
        } else if (i == 4) {
            this.favFm = m1935nz(str);
        } else if (i != 5) {
            return;
        } else {
            this.favAm = m1935nz(str);
        }
        publish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshGet$0(String[] strArr, String[] strArr2) {
        for (int i = 0; i < strArr.length && i < strArr2.length; i++) {
            applyKey(strArr[i], strArr2[i]);
        }
        publish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$refreshGet$1() {
        String[] strArr = {AbstractC1687o.m4925T(261), AbstractC1687o.m4925T(266), AbstractC1687o.m4925T(262), AbstractC1687o.m4925T(263), AbstractC1687o.m4925T(264), AbstractC1687o.m4925T(265)};
        try {
            String[] nativeGetData = NativeLib.nativeGetData(strArr, 1);
            if (nativeGetData == null) {
                return;
            }
            this.main.post(new RunnableC0005B(this, strArr, nativeGetData, 4));
        } catch (Exception e2) {
            Log.w(TAG, "getData", e2);
        }
    }

    /* renamed from: nz */
    private static String m1935nz(String str) {
        return str == null ? "" : str;
    }

    @InterfaceC0766a
    public static void onNativePush(int i, String str) {
        getInstance().applyPush(i, str);
    }

    private static C0659e parseChannel(String str) {
        C0659e c0659e = new C0659e();
        c0659e.f3105e = "";
        if (!TextUtils.isEmpty(str) && !"null".equals(str)) {
            String trim = str.trim();
            if (trim.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(trim);
                    c0659e.f3101a = jSONObject.optInt("freq");
                    c0659e.f3102b = jSONObject.optInt("band", 0);
                    c0659e.f3103c = jSONObject.optInt("strength");
                    c0659e.f3104d = jSONObject.optInt("stereo");
                    String cleanPs = cleanPs(jSONObject.optString("ps"));
                    c0659e.f3105e = cleanPs;
                    if (TextUtils.isEmpty(cleanPs)) {
                        c0659e.f3105e = cleanPs(jSONObject.optString("f307ps"));
                    }
                } catch (Exception unused) {
                }
                return c0659e;
            }
            String[] split = trim.replace("[", "").replace("]", "").trim().split("[,;\\s]+");
            try {
                if (split.length > 0) {
                    c0659e.f3101a = Integer.parseInt(split[0].trim());
                }
                if (split.length > 1) {
                    c0659e.f3102b = Integer.parseInt(split[1].trim());
                }
                if (split.length > 2) {
                    c0659e.f3103c = Integer.parseInt(split[2].trim());
                }
                if (split.length > 3) {
                    c0659e.f3104d = Integer.parseInt(split[3].trim());
                }
            } catch (NumberFormatException unused2) {
            }
        }
        return c0659e;
    }

    public static List<Integer> parseFavList(String str) {
        int optInt;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !"null".equals(str)) {
            String trim = str.trim();
            if (trim.startsWith("[")) {
                try {
                    JSONArray jSONArray = new JSONArray(trim);
                    if (jSONArray.length() > 0 && jSONArray.optJSONObject(0) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null && (optInt = optJSONObject.optInt("freq", 0)) > 0) {
                                arrayList2.add(new int[]{optJSONObject.has("index") ? optJSONObject.optInt("index", i) : i, optInt});
                            }
                        }
                        Collections.sort(arrayList2, new C0295l(1));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((int[]) it.next())[1]));
                        }
                        return arrayList;
                    }
                } catch (Exception unused) {
                }
            }
            String trim2 = trim.replace("[", "").replace("]", "").trim();
            if (trim2.isEmpty()) {
                return arrayList;
            }
            for (String str2 : trim2.split("[,;\\s]+")) {
                try {
                    int parseInt = Integer.parseInt(str2.trim());
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                } catch (NumberFormatException unused2) {
                }
            }
        }
        return arrayList;
    }

    private void publish() {
        C0658d snapshot = snapshot();
        C0658d current = current();
        if (current == null) {
            snapshot.getClass();
        } else if (snapshot.f3093a == current.f3093a && snapshot.f3094b == current.f3094b && snapshot.f3095c == current.f3095c && snapshot.f3096d == current.f3096d && snapshot.f3097e == current.f3097e && snapshot.f3098f == current.f3098f && snapshot.f3099g.equals(current.f3099g) && snapshot.f3100h.equals(current.f3100h)) {
            return;
        }
        this.info.m1398g(snapshot);
        if (snapshot.f3093a && snapshot.m1943c()) {
            C0639g.m1872x().m1873B(snapshot.m1946f(this.app, this.art));
        } else if (current.f3093a) {
            MediaInfoService.m1845c();
        }
    }

    private void refreshGet() {
        new Thread(new RunnableC0024r(13, this), "split-radio-get").start();
    }

    private C0658d snapshot() {
        C0659e parseChannel = parseChannel(firstNonEmpty(this.rdsRaw, this.chRaw));
        int i = parseChannel.f3102b == 1 ? 1 : 0;
        return new C0658d(isOn(this.playRaw), isOn(this.searchRaw), i, parseChannel.f3101a, parseChannel.f3103c, parseChannel.f3104d, parseChannel.f3105e, parseFavList(i == 1 ? this.favAm : this.favFm));
    }

    public Bitmap art() {
        return this.art;
    }

    public C0658d current() {
        C0658d c0658d = (C0658d) this.info.m1395d();
        return c0658d != null ? c0658d : C0658d.f3092i;
    }

    public void observeForever(InterfaceC0561z interfaceC0561z) {
        this.info.m1397f(interfaceC0561z);
    }

    public void pause() {
        C0657c ensureGux = ensureGux();
        if (ensureGux != null) {
            ensureGux.m1938c(null, AbstractC1687o.m4925T(251));
        }
    }

    public void play() {
        C0657c ensureGux = ensureGux();
        if (ensureGux != null) {
            ensureGux.m1938c(null, AbstractC1687o.m4925T(250));
        }
    }

    public void playBand(int i) {
        C0657c ensureGux = ensureGux();
        if (ensureGux != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AbstractC1687o.m4925T(271), i == 1 ? AbstractC1687o.m4925T(269) : AbstractC1687o.m4925T(268));
            } catch (Exception unused) {
            }
            ensureGux.m1938c(jSONObject, AbstractC1687o.m4925T(250));
        }
    }

    public void presetNext() {
        cyclePreset(1);
    }

    public void presetPrev() {
        cyclePreset(-1);
    }

    public void removeObserver(InterfaceC0561z interfaceC0561z) {
        this.info.m1399h(interfaceC0561z);
    }

    public void seekDown() {
        C0657c ensureGux = ensureGux();
        if (ensureGux != null) {
            ensureGux.m1938c(null, AbstractC1687o.m4925T(253));
        }
    }

    public void seekUp() {
        C0657c ensureGux = ensureGux();
        if (ensureGux != null) {
            ensureGux.m1938c(null, AbstractC1687o.m4925T(252));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0005, B:9:0x000f, B:12:0x0027, B:14:0x002b, B:15:0x0034, B:17:0x0041, B:19:0x0047, B:20:0x0056, B:22:0x005a, B:26:0x0060, B:29:0x0018), top: B:6:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0005, B:9:0x000f, B:12:0x0027, B:14:0x002b, B:15:0x0034, B:17:0x0041, B:19:0x0047, B:20:0x0056, B:22:0x005a, B:26:0x0060, B:29:0x0018), top: B:6:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void start(Context context) {
        C0658d current;
        if (context == null) {
            return;
        }
        try {
            this.app = context.getApplicationContext();
            Bitmap bitmap = this.art;
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                }
                if (this.gux == null) {
                    this.gux = new C0657c(this.app);
                }
                this.gux.m1936a();
                current = current();
                if (current.f3093a && current.m1943c()) {
                    C0639g.m1872x().m1873B(current.m1946f(this.app, this.art));
                }
                if (!this.started) {
                    refreshGet();
                    return;
                } else {
                    this.started = true;
                    refreshGet();
                    return;
                }
            }
            this.art = BitmapFactory.decodeResource(this.app.getResources(), R.drawable.overlay_radio_art);
            if (this.gux == null) {
            }
            this.gux.m1936a();
            current = current();
            if (current.f3093a) {
                C0639g.m1872x().m1873B(current.m1946f(this.app, this.art));
            }
            if (!this.started) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stop() {
        this.started = false;
        C0657c c0657c = this.gux;
        if (c0657c != null) {
            c0657c.f3089d = null;
            c0657c.f3090e = null;
            if (c0657c.f3088c) {
                try {
                    c0657c.f3086a.unbindService(c0657c.f3091f);
                } catch (Exception unused) {
                }
                c0657c.f3088c = false;
                c0657c.f3087b = null;
            }
        }
    }

    public void togglePlay() {
        if (current().f3093a) {
            pause();
        } else {
            play();
        }
    }
}
