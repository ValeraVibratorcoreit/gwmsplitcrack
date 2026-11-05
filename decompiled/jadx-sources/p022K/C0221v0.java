package p022K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p006C.C0058f;

/* renamed from: K.v0 */
/* loaded from: classes.dex */
public final class C0221v0 {

    /* renamed from: b */
    public static final C0221v0 f572b;

    /* renamed from: a */
    public final C0217t0 f573a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f572b = C0215s0.f566q;
        } else {
            f572b = C0217t0.f570b;
        }
    }

    public C0221v0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f573a = new C0215s0(this, windowInsets);
        } else if (i >= 29) {
            this.f573a = new C0213r0(this, windowInsets);
        } else {
            this.f573a = new C0211q0(this, windowInsets);
        }
    }

    /* renamed from: e */
    public static C0058f m679e(C0058f c0058f, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c0058f.f203a - i);
        int max2 = Math.max(0, c0058f.f204b - i2);
        int max3 = Math.max(0, c0058f.f205c - i3);
        int max4 = Math.max(0, c0058f.f206d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c0058f : C0058f.m140b(max, max2, max3, max4);
    }

    /* renamed from: g */
    public static C0221v0 m680g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0221v0 c0221v0 = new C0221v0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            C0221v0 m446a = AbstractC0159G.m446a(view);
            C0217t0 c0217t0 = c0221v0.f573a;
            c0217t0.mo659p(m446a);
            c0217t0.mo653d(view.getRootView());
        }
        return c0221v0;
    }

    /* renamed from: a */
    public final int m681a() {
        return this.f573a.mo655j().f206d;
    }

    /* renamed from: b */
    public final int m682b() {
        return this.f573a.mo655j().f203a;
    }

    /* renamed from: c */
    public final int m683c() {
        return this.f573a.mo655j().f205c;
    }

    /* renamed from: d */
    public final int m684d() {
        return this.f573a.mo655j().f204b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0221v0)) {
            return false;
        }
        return Objects.equals(this.f573a, ((C0221v0) obj).f573a);
    }

    /* renamed from: f */
    public final WindowInsets m685f() {
        C0217t0 c0217t0 = this.f573a;
        if (c0217t0 instanceof AbstractC0207o0) {
            return ((AbstractC0207o0) c0217t0).f555c;
        }
        return null;
    }

    public final int hashCode() {
        C0217t0 c0217t0 = this.f573a;
        if (c0217t0 == null) {
            return 0;
        }
        return c0217t0.hashCode();
    }

    public C0221v0() {
        this.f573a = new C0217t0(this);
    }
}
