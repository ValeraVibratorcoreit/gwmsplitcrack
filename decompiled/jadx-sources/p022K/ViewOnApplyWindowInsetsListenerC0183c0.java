package p022K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p003B.C0043j;
import p006C.C0058f;
import p016H.RunnableC0121m;

/* renamed from: K.c0 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0183c0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final C0184d f496a;

    /* renamed from: b */
    public C0221v0 f497b;

    public ViewOnApplyWindowInsetsListenerC0183c0(View view, C0184d c0184d) {
        C0221v0 c0221v0;
        this.f496a = c0184d;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        C0221v0 m446a = AbstractC0159G.m446a(view);
        if (m446a != null) {
            int i = Build.VERSION.SDK_INT;
            c0221v0 = (i >= 30 ? new C0203m0(m446a) : i >= 29 ? new C0201l0(m446a) : new C0199k0(m446a)).mo614b();
        } else {
            c0221v0 = null;
        }
        this.f497b = c0221v0;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0217t0 c0217t0;
        if (!view.isLaidOut()) {
            this.f497b = C0221v0.m680g(view, windowInsets);
            return C0185d0.m547i(view, windowInsets);
        }
        C0221v0 m680g = C0221v0.m680g(view, windowInsets);
        if (this.f497b == null) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            this.f497b = AbstractC0159G.m446a(view);
        }
        if (this.f497b == null) {
            this.f497b = m680g;
            return C0185d0.m547i(view, windowInsets);
        }
        C0184d m548j = C0185d0.m548j(view);
        if (m548j != null && Objects.equals((WindowInsets) m548j.f499g, windowInsets)) {
            return C0185d0.m547i(view, windowInsets);
        }
        C0221v0 c0221v0 = this.f497b;
        int i = 1;
        int i2 = 0;
        while (true) {
            c0217t0 = m680g.f573a;
            if (i > 256) {
                break;
            }
            if (!c0217t0.mo654f(i).equals(c0221v0.f573a.mo654f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return C0185d0.m547i(view, windowInsets);
        }
        C0221v0 c0221v02 = this.f497b;
        C0195i0 c0195i0 = new C0195i0(i2, (i2 & 8) != 0 ? c0217t0.mo654f(8).f206d > c0221v02.f573a.mo654f(8).f206d ? C0185d0.f504e : C0185d0.f505f : C0185d0.f506g, 160L);
        c0195i0.f526a.mo583d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0195i0.f526a.mo580a());
        C0058f mo654f = c0217t0.mo654f(i2);
        C0058f mo654f2 = c0221v02.f573a.mo654f(i2);
        int min = Math.min(mo654f.f203a, mo654f2.f203a);
        int i3 = mo654f.f204b;
        int i4 = mo654f2.f204b;
        int min2 = Math.min(i3, i4);
        int i5 = mo654f.f205c;
        int i6 = mo654f2.f205c;
        int min3 = Math.min(i5, i6);
        int i7 = mo654f.f206d;
        int i8 = i2;
        int i9 = mo654f2.f206d;
        C0043j c0043j = new C0043j(C0058f.m140b(min, min2, min3, Math.min(i7, i9)), 2, C0058f.m140b(Math.max(mo654f.f203a, mo654f2.f203a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C0185d0.m544f(view, windowInsets, false);
        duration.addUpdateListener(new C0179a0(c0195i0, m680g, c0221v02, i8, view));
        duration.addListener(new C0181b0(c0195i0, view));
        ViewTreeObserverOnPreDrawListenerC0216t.m674a(view, new RunnableC0121m(view, c0195i0, c0043j, duration));
        this.f497b = m680g;
        return C0185d0.m547i(view, windowInsets);
    }
}
