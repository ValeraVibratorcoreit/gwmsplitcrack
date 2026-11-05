package androidx.lifecycle;

import android.os.Handler;
import com.altaysoft.t500_split.media.C0639g;
import p001A0.RunnableC0024r;
import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.D */
/* loaded from: classes.dex */
public final class C0521D implements InterfaceC0553r {

    /* renamed from: n */
    public static final C0521D f1956n = new C0521D();

    /* renamed from: f */
    public int f1957f;

    /* renamed from: g */
    public int f1958g;

    /* renamed from: j */
    public Handler f1961j;

    /* renamed from: h */
    public boolean f1959h = true;

    /* renamed from: i */
    public boolean f1960i = true;

    /* renamed from: k */
    public final C0555t f1962k = new C0555t(this);

    /* renamed from: l */
    public final RunnableC0024r f1963l = new RunnableC0024r(10, this);

    /* renamed from: m */
    public final C0639g f1964m = new C0639g(17, this);

    /* renamed from: a */
    public final void m1359a() {
        int i = this.f1958g + 1;
        this.f1958g = i;
        if (i == 1) {
            if (this.f1959h) {
                this.f1962k.m1380d(EnumC0547l.ON_RESUME);
                this.f1959h = false;
            } else {
                Handler handler = this.f1961j;
                AbstractC1461d.m3491b(handler);
                handler.removeCallbacks(this.f1963l);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0553r
    /* renamed from: d */
    public final C0555t mo1068d() {
        return this.f1962k;
    }
}
