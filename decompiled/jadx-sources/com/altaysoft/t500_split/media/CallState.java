package com.altaysoft.t500_split.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import com.altaysoft.t500_split.R;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import p000A.AbstractC0000a;
import p001A0.RunnableC0024r;
import p006C.AbstractC0062j;
import p064e.InterfaceC0766a;

@InterfaceC0766a
/* loaded from: classes.dex */
public final class CallState {
    static final int ST_ACTIVE = 0;
    static final int ST_ALERTING = 3;
    static final int ST_DIALING = 2;
    static final int ST_HELD = 1;
    static final int ST_INCOMING = 4;
    static final int ST_TERMINATED = 7;
    static final int ST_WAITING = 5;
    private static final long TICK_MS = 1000;
    private static CallState instance;
    private Context app;
    private Bitmap artIn;
    private Bitmap artOut;
    private long connectedAtElapsed;
    private boolean inCall;
    private boolean incoming;
    private boolean registered;
    private boolean started;
    private final Handler main = new Handler(Looper.getMainLooper());
    private int state = 7;
    private String name = "";
    private String number = "";
    private final BroadcastReceiver receiver = new C0633a(0, this);
    private final Runnable tick = new RunnableC0024r(11, this);

    private CallState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void applyCallsInfo(String str) {
        JSONObject optJSONObject;
        boolean z2;
        int i;
        JSONArray optJSONArray;
        if (TextUtils.isEmpty(str)) {
            setIdle();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            optJSONObject = jSONObject.optJSONObject(AbstractC0638f.m1871t(283));
            if (optJSONObject == null) {
                optJSONObject = jSONObject.optJSONObject(AbstractC0638f.m1871t(284));
            }
            z2 = false;
            if (optJSONObject == null && (optJSONArray = jSONObject.optJSONArray(AbstractC0638f.m1871t(285))) != null && optJSONArray.length() > 0) {
                optJSONObject = optJSONArray.optJSONObject(0);
            }
        } catch (Exception unused) {
            setIdle();
        }
        if (optJSONObject == null) {
            setIdle();
            return;
        }
        int optInt = optJSONObject.optInt(AbstractC0638f.m1871t(288), 7);
        if (optInt != 7 && optInt >= 0) {
            String optString = optJSONObject.optString(AbstractC0638f.m1871t(286), "");
            String optString2 = optJSONObject.optString(AbstractC0638f.m1871t(287), "");
            if (TextUtils.isEmpty(displayLabel(optString, optString2))) {
                setIdle();
                return;
            }
            boolean directionIncoming = directionIncoming(optInt);
            if ((optInt == 0 || optInt == 1) && (i = this.state) != 0 && i != 1) {
                z2 = true;
            }
            this.inCall = true;
            this.incoming = directionIncoming;
            this.state = optInt;
            if (optString == null) {
                optString = "";
            }
            this.name = optString;
            if (optString2 == null) {
                optString2 = "";
            }
            this.number = optString2;
            if (z2 || (this.connectedAtElapsed == 0 && (optInt == 0 || optInt == 1))) {
                this.connectedAtElapsed = SystemClock.elapsedRealtime();
            }
            publish();
            scheduleTick();
            return;
        }
        setIdle();
    }

    private static String artistLine(String str, String str2, String str3) {
        boolean z2 = !TextUtils.isEmpty(str2) && (str == null || !str.equals(str2));
        return (!z2 || TextUtils.isEmpty(str3)) ? z2 ? str2 : str3 != null ? str3 : "" : AbstractC0062j.m169w(str2, "\n", str3);
    }

    private boolean directionIncoming(int i) {
        if (i == 4 || i == 5) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        return this.incoming;
    }

    private static String displayLabel(String str, String str2) {
        return (TextUtils.isEmpty(str) || looksLikeNumber(str)) ? !TextUtils.isEmpty(str2) ? str2 : str != null ? str : "" : str;
    }

    private long elapsedMs() {
        if (this.connectedAtElapsed <= 0) {
            return 0L;
        }
        int i = this.state;
        if (i == 0 || i == 1) {
            return Math.max(0L, SystemClock.elapsedRealtime() - this.connectedAtElapsed);
        }
        return 0L;
    }

    private void ensureArt() {
        Context context = this.app;
        if (context == null) {
            return;
        }
        int round = Math.round(TypedValue.applyDimension(1, 168.0f, context.getResources().getDisplayMetrics()));
        Bitmap bitmap = this.artIn;
        if (bitmap == null || bitmap.isRecycled()) {
            this.artIn = vectorBitmap(this.app, R.drawable.overlay_call_in, round);
        }
        Bitmap bitmap2 = this.artOut;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            this.artOut = vectorBitmap(this.app, R.drawable.overlay_call_out, round);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String extraCallsInfo(Intent intent) {
        Object obj;
        String stringExtra = intent.getStringExtra(AbstractC0638f.m1871t(282));
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        if (intent.getExtras() == null || (obj = intent.getExtras().get(AbstractC0638f.m1871t(282))) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    private static String formatDuration(long j2) {
        long max = Math.max(0L, j2) / TICK_MS;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(max / 60), Long.valueOf(max % 60));
    }

    public static synchronized CallState getInstance() {
        CallState callState;
        synchronized (CallState.class) {
            try {
                if (instance == null) {
                    instance = new CallState();
                }
                callState = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return callState;
    }

    public static boolean isCall(C0636d c0636d) {
        String str;
        if (c0636d == null || (str = c0636d.f2995a) == null) {
            return false;
        }
        return str.equals(AbstractC0638f.m1871t(289));
    }

    private static boolean looksLikeNumber(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                i++;
            } else if (charAt != '+' && charAt != '-' && charAt != ' ' && charAt != '(' && charAt != ')') {
                return false;
            }
        }
        return i >= 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onTick() {
        if (this.started && this.inCall) {
            publish();
            scheduleTick();
        }
    }

    private void publish() {
        C0636d mediaInfo = toMediaInfo();
        if (mediaInfo != null) {
            C0639g.m1872x().m1873B(mediaInfo);
        }
    }

    private void scheduleTick() {
        this.main.removeCallbacks(this.tick);
        if (this.started && this.inCall) {
            this.main.postDelayed(this.tick, TICK_MS);
        }
    }

    private synchronized void setIdle() {
        boolean z2 = this.inCall;
        this.inCall = false;
        this.state = 7;
        this.name = "";
        this.number = "";
        this.connectedAtElapsed = 0L;
        this.main.removeCallbacks(this.tick);
        if (z2) {
            MediaInfoService.m1845c();
        }
    }

    private static Bitmap vectorBitmap(Context context, int i, int i2) {
        Drawable m1b = AbstractC0000a.m1b(context, i);
        if (m1b == null || i2 <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        m1b.setBounds(0, 0, i2, i2);
        m1b.draw(canvas);
        return createBitmap;
    }

    public synchronized boolean active() {
        return this.inCall;
    }

    public synchronized boolean isIncoming() {
        return this.incoming;
    }

    public synchronized void start(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.app = context.getApplicationContext();
            ensureArt();
            if (!this.registered) {
                IntentFilter intentFilter = new IntentFilter(AbstractC0638f.m1871t(281));
                if (Build.VERSION.SDK_INT >= 33) {
                    this.app.registerReceiver(this.receiver, intentFilter, 2);
                } else {
                    this.app.registerReceiver(this.receiver, intentFilter);
                }
                this.registered = true;
            }
            this.started = true;
            if (this.inCall) {
                publish();
                scheduleTick();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stop() {
        Context context;
        this.started = false;
        this.main.removeCallbacks(this.tick);
        if (this.registered && (context = this.app) != null) {
            try {
                context.unregisterReceiver(this.receiver);
            } catch (IllegalArgumentException unused) {
            }
            this.registered = false;
        }
        if (this.inCall) {
            this.inCall = false;
            this.state = 7;
            this.connectedAtElapsed = 0L;
            MediaInfoService.m1845c();
        }
    }

    public synchronized C0636d toMediaInfo() {
        try {
            if (this.inCall && this.app != null) {
                Bitmap bitmap = this.incoming ? this.artIn : this.artOut;
                String displayLabel = displayLabel(this.name, this.number);
                return new C0636d(AbstractC0638f.m1871t(289), displayLabel, artistLine(displayLabel, this.number, formatDuration(elapsedMs())), null, bitmap, false, 0L, 0L, null);
            }
            return null;
        } finally {
        }
    }
}
