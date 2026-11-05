package p118x0;

import android.os.Handler;
import android.os.Looper;
import p111v.C1594f;

/* renamed from: x0.p */
/* loaded from: classes.dex */
public final class C1660p {

    /* renamed from: e */
    public static C1660p f9466e;

    /* renamed from: c */
    public boolean f9469c;

    /* renamed from: a */
    public final C1594f f9467a = new C1594f();

    /* renamed from: b */
    public final Handler f9468b = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final RunnableC1658n f9470d = new RunnableC1658n(1, this);

    /* renamed from: a */
    public static C1660p m4812a() {
        if (f9466e == null) {
            f9466e = new C1660p();
        }
        return f9466e;
    }

    /* renamed from: b */
    public static float m4813b(Float f2) {
        if (Float.isNaN(f2.floatValue()) || Float.isInfinite(f2.floatValue())) {
            return 0.0f;
        }
        return f2.floatValue();
    }

    /* renamed from: c */
    public final void m4814c() {
        if (this.f9469c) {
            return;
        }
        this.f9469c = true;
        Handler handler = this.f9468b;
        RunnableC1658n runnableC1658n = this.f9470d;
        handler.removeCallbacks(runnableC1658n);
        handler.post(runnableC1658n);
    }
}
