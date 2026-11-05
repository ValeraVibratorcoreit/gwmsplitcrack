package p079k;

import com.altaysoft.t500_split.media.C0639g;

/* renamed from: k.e */
/* loaded from: classes.dex */
public final class RunnableC1010e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1011f f4782a;

    /* renamed from: b */
    public final /* synthetic */ C1020o f4783b;

    /* renamed from: c */
    public final /* synthetic */ MenuC1018m f4784c;

    /* renamed from: d */
    public final /* synthetic */ C0639g f4785d;

    public RunnableC1010e(C0639g c0639g, C1011f c1011f, C1020o c1020o, MenuC1018m menuC1018m) {
        this.f4785d = c0639g;
        this.f4782a = c1011f;
        this.f4783b = c1020o;
        this.f4784c = menuC1018m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1011f c1011f = this.f4782a;
        if (c1011f != null) {
            C0639g c0639g = this.f4785d;
            ((ViewOnKeyListenerC1012g) c0639g.f3011g).f4793E = true;
            c1011f.f4787b.m2615c(false);
            ((ViewOnKeyListenerC1012g) c0639g.f3011g).f4793E = false;
        }
        C1020o c1020o = this.f4783b;
        if (c1020o.isEnabled() && c1020o.hasSubMenu()) {
            this.f4784c.m2621q(c1020o, null, 4);
        }
    }
}
