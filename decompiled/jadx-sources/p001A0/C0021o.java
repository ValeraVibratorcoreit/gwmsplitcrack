package p001A0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.altaysoft.t500_split.cfgData;
import java.io.File;
import java.util.EnumMap;
import org.json.JSONObject;
import org.vosk.Model;
import org.vosk.Recognizer;
import org.vosk.android.RecognitionListener;
import org.vosk.android.SpeechService;
import p098q0.AbstractC1256E0;
import p098q0.EnumC1314f0;
import p121y0.AbstractC1680h;

/* renamed from: A0.o */
/* loaded from: classes.dex */
public final class C0021o implements RecognitionListener {

    /* renamed from: t */
    public static C0021o f60t;

    /* renamed from: c */
    public int f63c;

    /* renamed from: d */
    public boolean f64d;

    /* renamed from: e */
    public int f65e;

    /* renamed from: g */
    public Context f67g;

    /* renamed from: h */
    public Model f68h;

    /* renamed from: i */
    public String f69i;

    /* renamed from: j */
    public SpeechService f70j;

    /* renamed from: k */
    public volatile boolean f71k;

    /* renamed from: l */
    public volatile boolean f72l;

    /* renamed from: m */
    public volatile boolean f73m;

    /* renamed from: n */
    public long f74n;

    /* renamed from: o */
    public long f75o;

    /* renamed from: q */
    public long f77q;

    /* renamed from: a */
    public final Handler f61a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Object f62b = new Object();

    /* renamed from: f */
    public final RunnableC0016j f66f = new RunnableC0016j(this, 1);

    /* renamed from: p */
    public String f76p = "";

    /* renamed from: r */
    public int f78r = 1;

    /* renamed from: s */
    public final RunnableC0020n f79s = new RunnableC0020n(0, this);

    /* renamed from: c */
    public static String m27c(String str) {
        JSONObject jSONObject;
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
        }
        if (jSONObject.has("text")) {
            return jSONObject.optString("text", "").trim();
        }
        if (jSONObject.has("partial")) {
            return jSONObject.optString("partial", "").trim();
        }
        return str.trim();
    }

    /* renamed from: d */
    public static C0021o m28d() {
        if (f60t == null) {
            f60t = new C0021o();
        }
        return f60t;
    }

    /* renamed from: a */
    public final void m29a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f75o < 1000) {
            return;
        }
        this.f75o = currentTimeMillis;
        this.f74n = currentTimeMillis + 6000;
        AbstractC0023q.m38a(3);
        Context context = this.f67g;
        if (context != null) {
            C0006C m10c = C0006C.m10c(context);
            Context context2 = this.f67g;
            EnumMap enumMap = AbstractC0015i.f43a;
            int ordinal = AbstractC1256E0.m3026s(context2).ordinal();
            m10c.f10b.post(new RunnableC0005B(m10c, context2, ordinal != 1 ? ordinal != 2 ? "Слушаю…" : "أستمع…" : "Listening…", 0));
        }
        Handler handler = this.f61a;
        RunnableC0020n runnableC0020n = this.f79s;
        handler.removeCallbacks(runnableC0020n);
        handler.postDelayed(runnableC0020n, 400L);
    }

    /* renamed from: b */
    public final void m30b() {
        String str;
        Context context = this.f67g;
        EnumMap enumMap = AbstractC0015i.f43a;
        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(context);
        File m4873n = AbstractC1680h.m4873n(context, m3026s);
        if (m4873n == null) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                externalFilesDir = context.getFilesDir();
            }
            m4873n = new File(externalFilesDir, AbstractC1680h.m4860V(AbstractC1680h.m4846D(m3026s)));
        }
        if (!AbstractC1680h.m4844B(m4873n)) {
            this.f78r = 1;
            AbstractC0023q.m38a(1);
            return;
        }
        String absolutePath = m4873n.getAbsolutePath();
        if (this.f68h != null && (str = this.f69i) != null && !absolutePath.equals(str)) {
            m35i();
            m33g();
        }
        if (this.f68h != null) {
            this.f78r = 3;
            AbstractC0023q.m38a(m31e() ? 3 : 2);
            m34h();
            return;
        }
        synchronized (this.f62b) {
            try {
                if (this.f64d) {
                    return;
                }
                this.f64d = true;
                int i = this.f63c + 1;
                this.f63c = i;
                this.f78r = 2;
                new Thread(new RunnableC0017k(this, absolutePath, i, 0), "voice-model").start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final boolean m31e() {
        return System.currentTimeMillis() < this.f74n;
    }

    /* renamed from: f */
    public final void m32f() {
        Context context = this.f67g;
        if (context == null || !AbstractC1680h.m4881w(context)) {
            this.f78r = 1;
        } else {
            this.f78r = 2;
        }
    }

    /* renamed from: g */
    public final void m33g() {
        synchronized (this.f62b) {
            this.f63c++;
            this.f64d = false;
        }
        m35i();
        Model model = this.f68h;
        if (model != null) {
            try {
                model.close();
            } catch (Exception unused) {
            }
            this.f68h = null;
            this.f69i = null;
        }
        m32f();
    }

    /* renamed from: h */
    public final void m34h() {
        if (this.f70j == null && this.f68h != null && m37k()) {
            try {
                SpeechService speechService = new SpeechService(new Recognizer(this.f68h, 16000.0f), 16000.0f);
                this.f70j = speechService;
                speechService.startListening(this);
                this.f72l = true;
                this.f74n = 0L;
                AbstractC0023q.m38a(2);
            } catch (Exception unused) {
                this.f70j = null;
                this.f72l = false;
                AbstractC0023q.m38a(1);
            } catch (UnsatisfiedLinkError unused2) {
                this.f70j = null;
                this.f72l = false;
                AbstractC0023q.m38a(1);
            }
        }
    }

    /* renamed from: i */
    public final void m35i() {
        this.f72l = false;
        this.f74n = 0L;
        this.f61a.removeCallbacks(this.f79s);
        SpeechService speechService = this.f70j;
        if (speechService != null) {
            try {
                speechService.stop();
                this.f70j.shutdown();
            } catch (Exception unused) {
            }
            this.f70j = null;
        }
    }

    /* renamed from: j */
    public final void m36j(Context context) {
        this.f67g = context.getApplicationContext();
        if (!cfgData.m1784i().f2551O0) {
            this.f61a.removeCallbacks(this.f66f);
            m35i();
            m33g();
            AbstractC0023q.m38a(1);
            m32f();
            return;
        }
        if (this.f71k || this.f65e > 0) {
            this.f71k = true;
            m30b();
            return;
        }
        m35i();
        if (this.f68h != null) {
            this.f78r = 3;
        } else {
            m32f();
        }
        AbstractC0023q.m38a(1);
    }

    /* renamed from: k */
    public final boolean m37k() {
        return cfgData.m1784i().f2551O0 && (this.f71k || this.f65e > 0);
    }

    @Override // org.vosk.android.RecognitionListener
    public final void onError(Exception exc) {
    }

    @Override // org.vosk.android.RecognitionListener
    public final void onFinalResult(String str) {
        String m27c = m27c(str);
        if (m27c.isEmpty()) {
            return;
        }
        this.f61a.post(new RunnableC0018l(this, 0, m27c));
    }

    @Override // org.vosk.android.RecognitionListener
    public final void onPartialResult(String str) {
        Context context;
        String m27c = m27c(str);
        if (m27c.isEmpty()) {
            return;
        }
        Context context2 = this.f67g;
        if (context2 != null && AbstractC0015i.m22b(context2, m27c)) {
            this.f61a.post(new RunnableC0016j(this, 0));
        } else {
            if (!m31e() || (context = this.f67g) == null) {
                return;
            }
            C0006C m10c = C0006C.m10c(context);
            m10c.f10b.post(new RunnableC0018l(m10c, 2, m27c));
        }
    }

    @Override // org.vosk.android.RecognitionListener
    public final void onResult(String str) {
        String m27c = m27c(str);
        if (m27c.isEmpty()) {
            return;
        }
        this.f61a.post(new RunnableC0018l(this, 0, m27c));
    }

    @Override // org.vosk.android.RecognitionListener
    public final void onTimeout() {
    }
}
