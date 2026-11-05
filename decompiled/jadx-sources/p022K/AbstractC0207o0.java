package p022K;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p006C.C0058f;
import p121y0.AbstractC1687o;

/* renamed from: K.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC0207o0 extends C0217t0 {

    /* renamed from: h */
    public static boolean f550h = false;

    /* renamed from: i */
    public static Method f551i;

    /* renamed from: j */
    public static Class f552j;

    /* renamed from: k */
    public static Field f553k;

    /* renamed from: l */
    public static Field f554l;

    /* renamed from: c */
    public final WindowInsets f555c;

    /* renamed from: d */
    public C0058f[] f556d;

    /* renamed from: e */
    public C0058f f557e;

    /* renamed from: f */
    public C0221v0 f558f;

    /* renamed from: g */
    public C0058f f559g;

    public AbstractC0207o0(C0221v0 c0221v0, WindowInsets windowInsets) {
        super(c0221v0);
        this.f557e = null;
        this.f555c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: r */
    private C0058f m649r(int i, boolean z2) {
        C0058f c0058f = C0058f.f202e;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c0058f = C0058f.m139a(c0058f, m660s(i2, z2));
            }
        }
        return c0058f;
    }

    /* renamed from: t */
    private C0058f m650t() {
        C0221v0 c0221v0 = this.f558f;
        return c0221v0 != null ? c0221v0.f573a.mo665h() : C0058f.f202e;
    }

    /* renamed from: u */
    private C0058f m651u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f550h) {
            m652v();
        }
        Method method = f551i;
        if (method != null && f552j != null && f553k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f553k.get(f554l.get(invoke));
                if (rect != null) {
                    return C0058f.m140b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: v */
    private static void m652v() {
        try {
            f551i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f552j = cls;
            f553k = cls.getDeclaredField("mVisibleInsets");
            f554l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f553k.setAccessible(true);
            f554l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f550h = true;
    }

    @Override // p022K.C0217t0
    /* renamed from: d */
    public void mo653d(View view) {
        C0058f m651u = m651u(view);
        if (m651u == null) {
            m651u = C0058f.f202e;
        }
        m661w(m651u);
    }

    @Override // p022K.C0217t0
    /* renamed from: f */
    public C0058f mo654f(int i) {
        return m649r(i, false);
    }

    @Override // p022K.C0217t0
    /* renamed from: j */
    public final C0058f mo655j() {
        if (this.f557e == null) {
            WindowInsets windowInsets = this.f555c;
            this.f557e = C0058f.m140b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f557e;
    }

    @Override // p022K.C0217t0
    /* renamed from: l */
    public C0221v0 mo656l(int i, int i2, int i3, int i4) {
        C0221v0 m680g = C0221v0.m680g(null, this.f555c);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC0205n0 c0203m0 = i5 >= 30 ? new C0203m0(m680g) : i5 >= 29 ? new C0201l0(m680g) : new C0199k0(m680g);
        c0203m0.mo616g(C0221v0.m679e(mo655j(), i, i2, i3, i4));
        c0203m0.mo615e(C0221v0.m679e(mo665h(), i, i2, i3, i4));
        return c0203m0.mo614b();
    }

    @Override // p022K.C0217t0
    /* renamed from: n */
    public boolean mo657n() {
        return this.f555c.isRound();
    }

    @Override // p022K.C0217t0
    /* renamed from: o */
    public void mo658o(C0058f[] c0058fArr) {
        this.f556d = c0058fArr;
    }

    @Override // p022K.C0217t0
    /* renamed from: p */
    public void mo659p(C0221v0 c0221v0) {
        this.f558f = c0221v0;
    }

    /* renamed from: s */
    public C0058f m660s(int i, boolean z2) {
        C0058f mo665h;
        int i2;
        if (i == 1) {
            return z2 ? C0058f.m140b(0, Math.max(m650t().f204b, mo655j().f204b), 0, 0) : C0058f.m140b(0, mo655j().f204b, 0, 0);
        }
        if (i == 2) {
            if (z2) {
                C0058f m650t = m650t();
                C0058f mo665h2 = mo665h();
                return C0058f.m140b(Math.max(m650t.f203a, mo665h2.f203a), 0, Math.max(m650t.f205c, mo665h2.f205c), Math.max(m650t.f206d, mo665h2.f206d));
            }
            C0058f mo655j = mo655j();
            C0221v0 c0221v0 = this.f558f;
            mo665h = c0221v0 != null ? c0221v0.f573a.mo665h() : null;
            int i3 = mo655j.f206d;
            if (mo665h != null) {
                i3 = Math.min(i3, mo665h.f206d);
            }
            return C0058f.m140b(mo655j.f203a, 0, mo655j.f205c, i3);
        }
        C0058f c0058f = C0058f.f202e;
        if (i == 8) {
            C0058f[] c0058fArr = this.f556d;
            mo665h = c0058fArr != null ? c0058fArr[AbstractC1687o.m4950w(8)] : null;
            if (mo665h != null) {
                return mo665h;
            }
            C0058f mo655j2 = mo655j();
            C0058f m650t2 = m650t();
            int i4 = mo655j2.f206d;
            if (i4 > m650t2.f206d) {
                return C0058f.m140b(0, 0, 0, i4);
            }
            C0058f c0058f2 = this.f559g;
            return (c0058f2 == null || c0058f2.equals(c0058f) || (i2 = this.f559g.f206d) <= m650t2.f206d) ? c0058f : C0058f.m140b(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo671i();
        }
        if (i == 32) {
            return mo670g();
        }
        if (i == 64) {
            return mo672k();
        }
        if (i != 128) {
            return c0058f;
        }
        C0221v0 c0221v02 = this.f558f;
        C0194i mo669e = c0221v02 != null ? c0221v02.f573a.mo669e() : mo669e();
        if (mo669e == null) {
            return c0058f;
        }
        DisplayCutout displayCutout = mo669e.f525a;
        return C0058f.m140b(AbstractC0192h.m587d(displayCutout), AbstractC0192h.m589f(displayCutout), AbstractC0192h.m588e(displayCutout), AbstractC0192h.m586c(displayCutout));
    }

    /* renamed from: w */
    public void m661w(C0058f c0058f) {
        this.f559g = c0058f;
    }
}
